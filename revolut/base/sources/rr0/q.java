package rr0;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q {
    private q() {
    }

    public static float a(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i <= 0) {
            hx7.e.h(new IllegalArgumentException(a0.d.n("contentContainerWidth=", i)));
            return 1.0f;
        }
        float fD = ((d(context, o.BOTTOM_SHEET) * 2) + i) / i;
        if (fD < 1.0f) {
            return 1.0f;
        }
        return fD;
    }

    public static int b(Context context, o variant) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return kli.a.k(context, c(variant));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static float c(o variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        boolean zBooleanValue = ((Boolean) jo0.g.k.getValue()).booleanValue();
        if (zBooleanValue) {
            int i = p.f256630a[variant.ordinal()];
            if (i == 1 || i == 2) {
                return 44.0f;
            }
            if (i == 3 || i == 4) {
                return 36.0f;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (zBooleanValue) {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = p.f256630a[variant.ordinal()];
        if (i2 == 1) {
            return 44.0f;
        }
        if (i2 == 2 || i2 == 3 || i2 == 4) {
            return 36.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public static int d(Context context, o variant) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(variant, "variant");
        boolean zBooleanValue = ((Boolean) jo0.g.k.getValue()).booleanValue();
        float f = 16.0f;
        if (zBooleanValue) {
            int i = p.f256630a[variant.ordinal()];
            if (i == 1 || i == 2) {
                f = 8.0f;
            } else if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 0.0f;
            }
        } else {
            if (zBooleanValue) {
                throw new NoWhenBranchMatchedException();
            }
            int i2 = p.f256630a[variant.ordinal()];
            if (i2 == 1) {
                f = 12.0f;
            } else if (i2 == 2) {
                f = 0.0f;
            } else if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 0.0f;
            }
        }
        return kli.a.k(context, f);
    }
}
