package yik;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import hha.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements fgk.a {
    public final AnimatedBackgroundType b(w0 w0Var) {
        AnimatedBackgroundType.DEFAULT r110 = AnimatedBackgroundType.DEFAULT.f51471a;
        Intrinsics.checkNotNullParameter(r110, "default");
        int i = w0Var == null ? -1 : a.f314336a[w0Var.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? r110 : AnimatedBackgroundType.PLAN_PLUS.f51480a : AnimatedBackgroundType.PLAN_PREMIUM.f51481a : AnimatedBackgroundType.PLAN_METAL.f51479a : AnimatedBackgroundType.PLAN_ULTRA.f51483a : AnimatedBackgroundType.PLAN_PRIVATE.f51482a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final AnimatedBackgroundType c(String planDisplayCode) {
        Intrinsics.checkNotNullParameter(planDisplayCode, "planDisplayCode");
        AnimatedBackgroundType.DEFAULT r110 = AnimatedBackgroundType.DEFAULT.f51471a;
        Intrinsics.checkNotNullParameter(r110, "default");
        switch (planDisplayCode.hashCode()) {
            case 2459034:
                if (planDisplayCode.equals("PLUS")) {
                    return AnimatedBackgroundType.PLAN_PLUS.f51480a;
                }
                return r110;
            case 73249511:
                if (planDisplayCode.equals("METAL")) {
                    return AnimatedBackgroundType.PLAN_METAL.f51479a;
                }
                return r110;
            case 80846732:
                if (planDisplayCode.equals("ULTRA")) {
                    return AnimatedBackgroundType.PLAN_ULTRA.f51483a;
                }
                return r110;
            case 399530551:
                if (planDisplayCode.equals("PREMIUM")) {
                    return AnimatedBackgroundType.PLAN_PREMIUM.f51481a;
                }
                return r110;
            case 403485027:
                if (planDisplayCode.equals("PRIVATE")) {
                    return AnimatedBackgroundType.PLAN_PRIVATE.f51482a;
                }
                return r110;
            default:
                return r110;
        }
    }
}
