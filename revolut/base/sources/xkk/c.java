package xkk;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.PlanBenefitsToLoseScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanBenefitsToLoseScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PlanBenefitsToLoseScreen planBenefitsToLoseScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planBenefitsToLoseScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52373a, "ERROR_STATE_ID")) {
            aVar2.u.a();
        }
        return Unit.f186387a;
    }
}
