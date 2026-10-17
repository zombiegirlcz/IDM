package umk;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutButton;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutFooter;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreen;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ PlanOfferPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PlanOfferPromptScreen planOfferPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = planOfferPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        PricingPlanLayoutButton pricingPlanLayoutButton;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a) this.u.R2();
        PricingPlanOfferPrompt pricingPlanOfferPrompt = (PricingPlanOfferPrompt) ((f) ((j2) aVar2.f103599r.f22677a).getValue()).f281323a.getContent();
        if (pricingPlanOfferPrompt != null) {
            if (pricingPlanOfferPrompt instanceof PricingPlanOfferPrompt.Available) {
                PricingPlanLayoutFooter pricingPlanLayoutFooter = ((PricingPlanOfferPrompt.Available) pricingPlanOfferPrompt).f102847a.d;
                if (pricingPlanLayoutFooter != null && (list = pricingPlanLayoutFooter.f102834a) != null && (pricingPlanLayoutButton = (PricingPlanLayoutButton) d0.e0(1, list)) != null) {
                    aVar2.C2(new g(pricingPlanLayoutButton.f102833c));
                }
            } else {
                if (!(pricingPlanOfferPrompt instanceof PricingPlanOfferPrompt.Unavailable)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.C2(h.f281325a);
            }
        }
        return Unit.f186387a;
    }
}
