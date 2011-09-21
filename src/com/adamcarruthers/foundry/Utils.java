package com.adamcarruthers.foundry;

import android.os.Build;

public class Utils {
	public static String versionNameToString(int versionCode) {
		if (versionCode < Build.VERSION_CODES.DONUT) {
			return "unsupported";
		}
		if (versionCode > 13) {
			return "unsupported";
		}
		
		switch (versionCode) {
		case Build.VERSION_CODES.DONUT: {
			return "donut";
		}
		case 5: {
			return "eclair";
		}
		case 6: {
			return "eclair";
		}
		case 7: {
			return "eclair";
		}
		case 8: {
			return "froyo";
		}
		case 9: {
			return "gingerbread";
		}
		case 10: {
			return "gingerbread";
		}
		case 11: {
			return "honeycomb";
		}
		case 12: {
			return "honeycomb";
		}
		case 13: {
			return "honeycomb";
		}
		}
		return null;
	}
}