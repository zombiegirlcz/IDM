package xkk;

import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.PlanBenefitsToLoseScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PlanBenefitsToLoseScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(PlanBenefitsToLoseScreen planBenefitsToLoseScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = planBenefitsToLoseScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            case 1:
                return new b(this.v, continuation, 1);
            default:
                return new b(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        hha.d dVar;
        int i = this.u;
        PlanBenefitsToLoseScreen planBenefitsToLoseScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                planBenefitsToLoseScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a aVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) planBenefitsToLoseScreen.R2();
                PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) ((f) ((j2) aVar3.f103476w.f22677a).getValue()).f306847a.getContent();
                if (pricingPlanSubscription == null || (dVar = pricingPlanSubscription.f81129a) == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "PlanBenefitsToLoseScreenModel", "unable to obtain current plan", null, h0Var);
                } else {
                    aVar3.C2(new h(dVar));
                }
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits_to_lose.a) planBenefitsToLoseScreen.R2()).C2(g.f306849a);
                break;
        }
        return Unit.f186387a;
    }
}
