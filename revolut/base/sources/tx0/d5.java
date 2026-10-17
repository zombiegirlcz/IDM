package tx0;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d5 {
    private d5() {
    }

    public static final float a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 30) {
            return 2.0f;
        }
        float fG = c8g.c.G(context) / b(context);
        if (fG < 1.0f) {
            return 1.0f;
        }
        return fG;
    }

    public static final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kotlin.ranges.f.g((int) (c8g.c.G(context) * 0.6f), kli.a.k(context, 396.0f), kli.a.k(context, 600.0f));
    }

    public static int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        if (jh.d.g(context)) {
            return kli.a.k(context, 80.0f);
        }
        return 0;
    }

    public static final int d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return c8g.c.H(context) - ny0.i.a(context).a(context);
    }
}
