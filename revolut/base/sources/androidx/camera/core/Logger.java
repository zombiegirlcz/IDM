package androidx.camera.core;

import android.util.Log;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Logger {
    private static int sMinLogLevel = 3;

    public static void d(String str, String str2) {
        if (isLogLevelEnabled(truncateTag(str), 3)) {
        }
    }

    public static void e(String str, String str2) {
        if (isLogLevelEnabled(truncateTag(str), 6)) {
        }
    }

    public static void i(String str, String str2) {
        if (isLogLevelEnabled(truncateTag(str), 4)) {
        }
    }

    public static boolean isDebugEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 3);
    }

    public static boolean isErrorEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 6);
    }

    public static boolean isInfoEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 4);
    }

    private static boolean isLogLevelEnabled(String str, int i) {
        return sMinLogLevel <= i || Log.isLoggable(str, i);
    }

    public static boolean isVerboseEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 2);
    }

    public static boolean isWarnEnabled(String str) {
        return isLogLevelEnabled(truncateTag(str), 5);
    }

    public static void resetMinLogLevel() {
        sMinLogLevel = 3;
    }

    public static void setMinLogLevel(int i) {
        sMinLogLevel = i;
    }

    private static String truncateTag(String str) {
        return str;
    }

    public static void w(String str, String str2) {
        if (isLogLevelEnabled(truncateTag(str), 5)) {
        }
    }

    public static void d(String str, String str2, Throwable th10) {
        if (isLogLevelEnabled(truncateTag(str), 3)) {
        }
    }

    public static void e(String str, String str2, Throwable th10) {
        if (isLogLevelEnabled(truncateTag(str), 6)) {
        }
    }

    public static void w(String str, String str2, Throwable th10) {
        if (isLogLevelEnabled(truncateTag(str), 5)) {
        }
    }
}
