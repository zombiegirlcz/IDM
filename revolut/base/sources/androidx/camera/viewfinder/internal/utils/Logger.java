package androidx.camera.viewfinder.internal.utils;

import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class Logger {
    private static int sMinLogLevel = 3;

    public static void d(@NonNull String str, @NonNull String str2) {
        if (isLogLevelEnabled(truncateTag(str), 3)) {
        }
    }

    public static void e(@NonNull String str, @NonNull String str2) {
        if (isLogLevelEnabled(truncateTag(str), 6)) {
        }
    }

    public static boolean isDebugEnabled(@NonNull String str) {
        return isLogLevelEnabled(truncateTag(str), 3);
    }

    private static boolean isLogLevelEnabled(@NonNull String str, int i) {
        return sMinLogLevel <= i || Log.isLoggable(str, i);
    }

    @NonNull
    private static String truncateTag(@NonNull String str) {
        return str;
    }

    public static void w(@NonNull String str, @NonNull String str2) {
        if (isLogLevelEnabled(truncateTag(str), 5)) {
        }
    }
}
