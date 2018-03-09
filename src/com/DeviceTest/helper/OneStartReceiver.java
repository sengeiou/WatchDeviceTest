package com.DeviceTest.helper;

import java.io.File;

import com.DeviceTest.CompareServerInfoActivity;
import com.DeviceTest.DeviceTest;
import com.DeviceTest.ForScanningActivity;
import com.DeviceTest.TestSelectActivity;
import com.DeviceTest.StressTest.RunInTest;
import com.DeviceTest.FirstRun;
import com.DeviceTest.PcbaDeviceTest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

public class OneStartReceiver extends BroadcastReceiver {
	private SharedPreferences mSharedPreferences;

	@Override
	public void onReceive(Context context, Intent intent) {
		mSharedPreferences = context.getSharedPreferences("state", 0);
		String action = intent.getAction();
		if (action.equals(Intent.ACTION_BOOT_COMPLETED)) {
//			if (SystemUtil.isInRecoveryTest()) {
//				return;
//			} else if (SystemUtil.isInBoardidSwitchTest()) {
//				//return;
//			}

			int first_start = mSharedPreferences.getInt("first_start", 0);
			int first_finish = mSharedPreferences.getInt("first_finish", 0);
			int second_start = mSharedPreferences.getInt("second_start", 0);
			int second_finish = mSharedPreferences.getInt("second_finish", 0);
			int rebootFlag2 = mSharedPreferences.getInt("reboot_flag2", 0);

/*
			File file = new File("/cache/recovery");
			Log.d("wjh", "OneStartReceiver new file");
                        if (!file.exists()) {
				Log.d("wjh", "OneStartReceiver recovery is exists.");
				Intent it=new Intent("android.intent.action.PCBADEVICETEST");
            			it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
              			context.startActivity(it);
			}			

			File file = new File("/cache/device_test");
			if (file.exists() && file.isFile()) {
				if (first_start == 0 || first_finish == 0) {
				if (first_start == 0) {
					SharedPreferences.Editor edit = mSharedPreferences.edit();
					edit.putInt("first_start", 1);
					edit.commit();

					Intent pintent = new Intent(context,
					// CompareServerInfoActivity.class);
					// TestSelectActivity.class);
					 DeviceTest.class);
					// ForScanningActivity.class);
					pintent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					context.startActivity(pintent);
				} else if (first_finish == 1 && second_start == 0) {
					if (rebootFlag2 == 0) {

						SharedPreferences.Editor edit = mSharedPreferences.edit();
						edit.putInt("second_start", 1);
						edit.commit();

						Intent runinIntent = new Intent(context,
								RunInTest.class);
						runinIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
						context.startActivity(runinIntent);

					}
				}
			}*/

		}
	}
}
