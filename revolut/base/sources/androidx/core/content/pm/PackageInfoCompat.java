package androidx.core.content.pm;

import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class PackageInfoCompat {

    public static class Api28Impl {
        public static long getLongVersionCode(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long getLongVersionCode(PackageInfo packageInfo) {
        return Api28Impl.getLongVersionCode(packageInfo);
    }
}
