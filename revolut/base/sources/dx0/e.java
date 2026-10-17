package dx0;

import a41.g;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import aw0.y9;
import com.revolut.core.ui.models.Color;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    private e() {
    }

    public static void a(Context context, int i, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Activity activityM = kli.a.m(context);
        if (activityM == null) {
            return;
        }
        activityM.getWindow().setNavigationBarColor(i);
        if (z) {
            return;
        }
        Window window = activityM.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        if (Build.VERSION.SDK_INT <= 28) {
            ViewCompat.requestApplyInsets(window.getDecorView());
        }
    }

    public static void b(Window window, b bVar, Context context) {
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        int i = d.f120513a[bVar.ordinal()];
        if (i == 1) {
            windowInsetsControllerCompat.setAppearanceLightNavigationBars(false);
            return;
        }
        if (i == 2) {
            windowInsetsControllerCompat.setAppearanceLightNavigationBars(true);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (kli.a.q(context)) {
                b(window, b.LIGHT, context);
            } else {
                b(window, b.DARK, context);
            }
        }
    }

    public static void c(Window window, Context context, c style) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        Color color = style.b();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color, "color");
        a(context, io0.a.c(context, color), false);
        Color color2 = style.d();
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(color2, "color");
        window.setNavigationBarDividerColor(io0.a.c(context, color2));
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            ViewCompat.requestApplyInsets(window.getDecorView());
        }
        b(window, style.a(), context);
        if (i >= 29 && style.c() != null) {
            g.n(window, style.c().booleanValue());
        }
        if (i <= 28) {
            ViewCompat.requestApplyInsets(window.getDecorView());
        }
    }

    public static void d(Window window, y9 style) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(style, "style");
        style.a(window);
    }
}
