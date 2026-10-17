package e1c;

import com.revolut.feature.rev_points.extensions.RevPointsTabAction;
import com.revolut.feature.rev_points.impl.ui.upsell.select_plan.SelectPlanUpsellScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import ds4.y;
import hha.u;
import hha.z0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SelectPlanUpsellScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(SelectPlanUpsellScreen selectPlanUpsellScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = selectPlanUpsellScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SelectPlanUpsellScreen selectPlanUpsellScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                selectPlanUpsellScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) ((l) selectPlanUpsellScreen.Q.getValue());
                z0 z0Var = ((j) ((j2) qVar.f121961r.f22677a).getValue()).f121952b;
                if (z0Var != null && z0Var.f152380c) {
                    qVar.l2(new y(qVar, null, 18), new yi5.b(26));
                } else if (z0Var != null) {
                    u.Companion.getClass();
                    qVar.C1(u0.b(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByPlans(u.f152356n0, zhm.u.c(z0Var.f152378a), null, new PlanChangeSuccessActionStrategy.NavigateNext(q.I2(RevPointsTabAction.ShowRewardsActivatedMessage.f83614a)), false, xfa.b.REV_POINTS, 180))));
                }
                break;
        }
        return Unit.f186387a;
    }
}
