package ymk;

import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanPageScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PlanPageScreen planPageScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planPageScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LabelButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LabelButtonDelegate.Model model = (LabelButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        Object obj3 = model.e;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) oVarE3;
        aVar2.getClass();
        if (obj3 instanceof PlansDashboardLayout$ClickAction) {
            aVar2.C2(new m((PlansDashboardLayout$ClickAction) obj3));
        }
        return Unit.f186387a;
    }
}
