package ghk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlow;
import ggk.g1;
import ggk.x0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PlanPagerFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(PlanPagerFlow planPagerFlow, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = planPagerFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            case 1:
                return new d(this.v, continuation, 1);
            default:
                return new d(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        x0 x0Var;
        PlansDashboardLayout$Button plansDashboardLayout$Button;
        x0 x0Var2;
        PlansDashboardLayout$Button plansDashboardLayout$Button2;
        int i = this.u;
        PlanPagerFlow planPagerFlow = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                planPagerFlow.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) planPagerFlow.f3();
                g1 g1VarL2 = dVar.L2();
                if (g1VarL2 != null && (x0Var = g1VarL2.f143723j) != null && (plansDashboardLayout$Button = x0Var.f143797b) != null) {
                    dVar.M2(plansDashboardLayout$Button.f102733b);
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) planPagerFlow.f3();
                g1 g1VarL22 = dVar2.L2();
                if (g1VarL22 != null && (x0Var2 = g1VarL22.f143723j) != null && (plansDashboardLayout$Button2 = x0Var2.f143796a) != null) {
                    dVar2.M2(plansDashboardLayout$Button2.f102733b);
                }
                break;
        }
        return Unit.f186387a;
    }
}
