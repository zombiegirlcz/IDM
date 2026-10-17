package androidx.camera.viewfinder.internal.quirk;

import android.os.Build;

/* JADX INFO: loaded from: classes15.dex */
public class SurfaceViewNotCroppedByParentQuirk implements Quirk {
    public static boolean load() {
        return "XIAOMI".equalsIgnoreCase(Build.MANUFACTURER) && "M2101K7AG".equalsIgnoreCase(Build.MODEL);
    }
}
