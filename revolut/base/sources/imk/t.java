package imk;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2Screen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanHubV2Screen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(PlanHubV2Screen planHubV2Screen, Continuation continuation) {
        super(2, continuation);
        this.v = planHubV2Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        t tVar = new t(this.v, continuation);
        tVar.u = obj2;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i0 i0VarF3 = this.v.d();
        Object obj3 = item.f58324n;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) i0VarF3;
        gVar.getClass();
        if (obj3 instanceof PlanScreenElementView.Action) {
            gVar.J2(((PlanScreenElementView.Action) obj3).f81005a);
        }
        return Unit.f186387a;
    }
}
