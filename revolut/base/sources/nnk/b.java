package nnk;

import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_terms_screen.PlanTermsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import n8a.r;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PlanTermsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(PlanTermsScreen planTermsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = planTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        PlanTermsScreen planTermsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) planTermsScreen.e3()).I2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) planTermsScreen.e3();
                PricingPlanTerms pricingPlanTerms = (PricingPlanTerms) ((c) ((j2) hVar.f217723r.f22677a).getValue()).f217712a.getContent();
                if (pricingPlanTerms != null && (str = pricingPlanTerms.f103310c) != null) {
                    hVar.l2(new r(hVar, str, pricingPlanTerms, null, 21), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
