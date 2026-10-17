package mlk;

import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanCancelFeatures$CancelReason;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffk.t f206999a;

    public c(ffk.t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f206999a = pricingPlanInteractor;
    }

    public final efm.r a(PlanCancelFeatures$CancelReason cancelReason) {
        efm.r rVarW;
        Intrinsics.checkNotNullParameter(cancelReason, "cancelReason");
        w wVar = new w(null, null);
        if (Intrinsics.f(cancelReason, PlanCancelFeatures$CancelReason.CloseAccount.f102909a)) {
            rVarW = efm.r.just(zi0.c.P(wVar, false, null, 3));
            Intrinsics.checkNotNullExpressionValue(rVarW, "just(...)");
        } else {
            boolean z = cancelReason instanceof PlanCancelFeatures$CancelReason.LowerPaidPlan;
            ffk.t tVar = this.f206999a;
            if (z) {
                PlanCancelFeatures$CancelReason.LowerPaidPlan lowerPaidPlan = (PlanCancelFeatures$CancelReason.LowerPaidPlan) cancelReason;
                rVarW = nim.a.w(ffk.t.u(tVar, lowerPaidPlan.f102910a, lowerPaidPlan.f102911b, false, 12), new mk3.c(27));
            } else {
                if (!Intrinsics.f(cancelReason, PlanCancelFeatures$CancelReason.StandardPlan.f102912a)) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarW = nim.a.w(tVar.s(null, false, null), new mk3.c(28));
            }
        }
        return nim.a.z(rVarW, new b(wVar, 0));
    }
}
