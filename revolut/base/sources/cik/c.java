package cik;

import c7e.i;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.PricingPlanActionModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.PlanReferralsClaimFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.downgrade_terms.PlanDowngradeFeesAndTermsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreenContract$InputData;
import h93.j0;
import h93.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rgk.p;
import yki.l;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c f24559b;

    public /* synthetic */ c(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c cVar, int i) {
        this.f24558a = i;
        this.f24559b = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f24558a) {
            case 0:
                l FlowCoordinator = (l) obj2;
                PlanReferralsClaimFlowContract$Step step = (PlanReferralsClaimFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean zF = Intrinsics.f(step, PlanReferralsClaimFlowContract$Step.Prompt.f103214a);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c cVar = this.f24559b;
                if (zF) {
                    PlanOfferPromptScreen planOfferPromptScreen = new PlanOfferPromptScreen(new PlanOfferPromptScreenContract$InputData.ByOfferType(8, "CLAIM_PLAN_REFERRAL", false, cVar.o.f103209a));
                    ce9.a block = new ce9.a(cVar, 13);
                    Intrinsics.checkNotNullParameter(block, "block");
                    planOfferPromptScreen.H = block;
                    return planOfferPromptScreen;
                }
                if (step instanceof PlanReferralsClaimFlowContract$Step.Confirmation) {
                    PlanReferralsClaimFlowContract$Step.Confirmation confirmation = (PlanReferralsClaimFlowContract$Step.Confirmation) step;
                    PlanDowngradeFeesAndTermsScreen planDowngradeFeesAndTermsScreen = new PlanDowngradeFeesAndTermsScreen(new PlanDowngradeFeesAndTermsScreenContract$InputData(confirmation.f103213b));
                    i block2 = new i(cVar, confirmation.f103212a, 24);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    planDowngradeFeesAndTermsScreen.H = block2;
                    return planDowngradeFeesAndTermsScreen;
                }
                if (!(step instanceof PlanReferralsClaimFlowContract$Step.ActionModal)) {
                    if (!(step instanceof PlanReferralsClaimFlowContract$Step.CardDesign)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewController viewControllerE1 = cVar.e1(new hx2.a(null, c93.e.PHYSICAL, j0.RETAIL, l0.DEBIT, null, null, null, 524272));
                    baa.c block3 = new baa.c(cVar, FlowCoordinator, 4);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    viewControllerE1.H = block3;
                    return viewControllerE1;
                }
                com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a aVar = cVar.f103219s;
                PricingPlanActionModalStep pricingPlanActionModalStep = ((PlanReferralsClaimFlowContract$Step.ActionModal) step).f103210a;
                p pVar = cVar.f103220t;
                bwc.i iVar = new bwc.i(1, cVar, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_claim.c.class, "reportUnsupportedBillingSelection", "reportUnsupportedBillingSelection(Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBillingPickerExternalContract$Output$BillingSelected;)V", 0, 18);
                aVar.getClass();
                return com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a.a(pricingPlanActionModalStep, pVar, iVar);
            default:
                PricingPlanActionModalStep step2 = (PricingPlanActionModalStep) obj2;
                ModalDestination.Style style = (ModalDestination.Style) obj3;
                Intrinsics.checkNotNullParameter(step2, "step");
                Intrinsics.checkNotNullParameter(style, "style");
                h.w2(this.f24559b.u, new PlanReferralsClaimFlowContract$Step.ActionModal(step2), style);
                return Unit.f186387a;
        }
    }
}
