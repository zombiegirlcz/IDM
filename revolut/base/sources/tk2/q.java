package tk2;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class q {
    public static final int a(View view) {
        Insets insets;
        Intrinsics.checkNotNullParameter(view, "<this>");
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
        if (rootWindowInsets == null || (insets = rootWindowInsets.getInsets(WindowInsetsCompat.Type.navigationBars())) == null) {
            return 0;
        }
        return insets.bottom;
    }

    public static final int b(View view, int[] locationBuffer, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(locationBuffer, "locationBuffer");
        view.getLocationInWindow(locationBuffer);
        return (view.getRootView().getHeight() - locationBuffer[1]) - i;
    }
}
