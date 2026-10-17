package com.appsflyer.internal;

import com.appsflyer.AFLogger;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1kSDK {
    private static String AFInAppEventType;
    private static String AFKeystoreWrapper;

    public static void AFInAppEventType(String str) {
        if (AFKeystoreWrapper == null) {
            values(AFb1rSDK.AFInAppEventParameterName().AFInAppEventType().v().AFLogger);
        }
        String str2 = AFKeystoreWrapper;
        if (str2 != null) {
            AFLogger.afInfoLog(str.replace(str2, AFInAppEventType));
        }
    }

    public static void values(String str) {
        AFKeystoreWrapper = str;
        if (str == null) {
            return;
        }
        StringBuilder sb6 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb6.append(str.charAt(i));
            } else {
                sb6.append("*");
            }
        }
        AFInAppEventType = sb6.toString();
    }
}
