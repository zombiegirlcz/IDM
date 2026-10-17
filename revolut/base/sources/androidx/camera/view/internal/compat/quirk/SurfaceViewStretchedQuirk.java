package androidx.camera.view.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;

/* JADX INFO: loaded from: classes15.dex */
public class SurfaceViewStretchedQuirk implements Quirk {
    private static boolean isLenovoTablet() {
        return "LENOVO".equalsIgnoreCase(Build.MANUFACTURER) && "Q706F".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isOppoFoldable() {
        return "OPPO".equalsIgnoreCase(Build.MANUFACTURER) && "OP4E75L1".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isSamsungFold2OrFold3() {
        if (!"SAMSUNG".equalsIgnoreCase(Build.MANUFACTURER)) {
            return false;
        }
        String str = Build.DEVICE;
        return "F2Q".equalsIgnoreCase(str) || "Q2Q".equalsIgnoreCase(str);
    }

    public static boolean load() {
        if (Build.VERSION.SDK_INT < 33) {
            return isSamsungFold2OrFold3() || isOppoFoldable() || isLenovoTablet();
        }
        return false;
    }
}
