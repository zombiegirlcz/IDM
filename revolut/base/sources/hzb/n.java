package hzb;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.feature.rev_points.impl.ui.earn.RevPointsEarnScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsEarnScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(RevPointsEarnScreen revPointsEarnScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsEarnScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((HeroBannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HeroBannerDelegate.Model model = (HeroBannerDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.earn.b bVar = (com.revolut.feature.rev_points.impl.ui.earn.b) uVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        hha.d pricingPlan = obj3 instanceof hha.d ? (hha.d) obj3 : null;
        if (pricingPlan != null) {
            i iVar = (i) bVar.f83804w;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
            hha.u.Companion.getClass();
            iVar.A2(u0.b(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByPlans(hha.u.f152356n0, zhm.u.c(pricingPlan.f152287a), null, null, false, xfa.b.REV_POINTS, 188))));
        }
        return Unit.f186387a;
    }
}
