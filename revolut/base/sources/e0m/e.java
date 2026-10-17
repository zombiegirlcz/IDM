package e0m;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public final class e {
    private e() {
    }

    public static void a(View view) {
        if (view == null) {
            return;
        }
        kli.c.b(view, 0, true);
    }

    public static void b(Activity activity, boolean z) {
        View currentFocus;
        if (activity == null || (currentFocus = activity.getCurrentFocus()) == null) {
            return;
        }
        kli.c.b(currentFocus, 300, z);
    }

    public static void c(Activity activity) {
        if (activity == null) {
            return;
        }
        d(activity.getCurrentFocus());
    }

    public static void d(View view) {
        if (view != null) {
            kli.c.c(view, false);
        }
    }

    public static void e(View view) {
        if (view == null) {
            return;
        }
        kli.c.d(view, 300L);
    }
}
