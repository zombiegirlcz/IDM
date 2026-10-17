package ix0;

import android.os.Build;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    public static final WindowInsets a(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        WindowInsets windowInsets2 = new WindowInsetsCompat.Builder(windowInsetsCompat).setInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime(), Insets.NONE).build().toWindowInsets();
        return windowInsets2 == null ? windowInsets : windowInsets2;
    }

    public static final int b(WindowInsets windowInsets) {
        int systemWindowInsetBottom;
        int stableInsetBottom;
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            stableInsetBottom = windowInsets.getStableInsetBottom();
        } else {
            systemWindowInsetBottom = windowInsets.getInsets(WindowInsets.Type.ime() | WindowInsets.Type.systemBars()).bottom;
            stableInsetBottom = windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
        }
        return systemWindowInsetBottom - stableInsetBottom;
    }

    public static final boolean c(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "<this>");
        return Build.VERSION.SDK_INT < 30 ? windowInsets.getSystemWindowInsetBottom() - windowInsets.getStableInsetBottom() > 0 : windowInsets.getInsets(WindowInsets.Type.ime()).bottom > 0;
    }
}
