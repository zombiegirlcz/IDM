package yik;

import com.revolut.core.ui_kit.gradients.UiKitGradient;
import com.revolut.core.ui_kit.models.badge.MetalPlanBadge;
import com.revolut.core.ui_kit.models.badge.PlanBadge;
import com.revolut.core.ui_kit.models.badge.PlusPlanBadge;
import com.revolut.core.ui_kit.models.badge.PremiumPlanBadge;
import com.revolut.core.ui_kit.models.badge.PrivatePlanBadge;
import com.revolut.core.ui_kit.models.badge.UltraPlanBadge;
import hha.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {
    public static UiKitGradient a(w0 planTier) {
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        switch (e.f314339a[planTier.ordinal()]) {
            case 1:
                return UiKitGradient.b.d;
            case 2:
                return UiKitGradient.b.e;
            case 3:
                return UiKitGradient.b.f55831b;
            case 4:
                return UiKitGradient.b.f55830a;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static PlanBadge b(w0 w0Var) {
        switch (w0Var == null ? -1 : e.f314339a[w0Var.ordinal()]) {
            case -1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return PrivatePlanBadge.f58061c;
            case 2:
                return UltraPlanBadge.f58069c;
            case 3:
                return MetalPlanBadge.f58056c;
            case 4:
                return PremiumPlanBadge.f58060c;
            case 5:
                return PlusPlanBadge.f58059c;
        }
    }
}
