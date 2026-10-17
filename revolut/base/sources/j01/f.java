package j01;

import android.os.Build;
import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    private f() {
    }

    public static void a(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i = Build.VERSION.SDK_INT;
        window.setNavigationBarDividerColor(0);
        if (i >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
    }
}
