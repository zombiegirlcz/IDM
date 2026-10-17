package ny0;

import android.content.Context;
import android.view.View;
import com.revolut.core.ui_kit.foundation.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {
    private i() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static g a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (((Boolean) jo0.g.f176833q.getValue()).booleanValue()) {
            float fJ = c8g.c.J(context);
            if (fJ >= 1200.0f) {
                return e.f220592a;
            }
            if (fJ >= 850.0f || b(context)) {
                return d.f220591a;
            }
        }
        return f.f220593a;
    }

    public static boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float fJ = c8g.c.J(context);
        Intrinsics.checkNotNullParameter(context, "<this>");
        float fG = c8g.c.G(context) / c8g.c.b(context);
        return fJ < 600.0f && fG < 480.0f && fJ > fG;
    }

    public static boolean c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ((float) c8g.c.G(context)) / c8g.c.b(context) < 480.0f;
    }

    public static boolean d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c8g.c.J(context) >= 600.0f;
    }

    public static void e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag2 = view.getTag(R$id.internal_fits_readable_area);
        Boolean bool = tag2 instanceof Boolean ? (Boolean) tag2 : null;
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.f(bool, bool2)) {
            return;
        }
        view.setTag(R$id.internal_fits_readable_area, bool2);
        view.requestLayout();
    }
}
