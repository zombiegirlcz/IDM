package aik;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPrompt;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Mode;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$UIConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$TitleConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yji.l;
import zfk.k;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d f5302b;

    public /* synthetic */ e(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d dVar, int i) {
        this.f5301a = i;
        this.f5302b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ViewController planBillingPickerFlow;
        switch (this.f5301a) {
            case 0:
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                PlanOfferFlowContract$Step step = (PlanOfferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean z = step instanceof PlanOfferFlowContract$Step.Prompt;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d dVar = this.f5302b;
                if (z) {
                    PlanOfferPromptScreen planOfferPromptScreen = new PlanOfferPromptScreen(new PlanOfferPromptScreenContract$InputData.ByOfferType(12, ((PlanOfferFlowContract$Step.Prompt) step).f103202a, dVar.I2(), (String) null));
                    f block = new f(dVar, 1);
                    Intrinsics.checkNotNullParameter(block, "block");
                    planOfferPromptScreen.H = block;
                    return planOfferPromptScreen;
                }
                if (step instanceof PlanOfferFlowContract$Step.FullScreenPromptOffer) {
                    PlanOfferPromptScreen planOfferPromptScreen2 = new PlanOfferPromptScreen(new PlanOfferPromptScreenContract$InputData.ByPrefetchedOffer(((PlanOfferFlowContract$Step.FullScreenPromptOffer) step).f103199a, dVar.I2(), true));
                    f block2 = new f(dVar, 1);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    planOfferPromptScreen2.H = block2;
                    return planOfferPromptScreen2;
                }
                if (step instanceof PlanOfferFlowContract$Step.PlanBenefits) {
                    planBillingPickerFlow = new PlanBenefitsScreen(new PlanBenefitsScreenContract$InputData(new PlanBenefitsScreenContract$PlanReference.Id(((PlanOfferFlowContract$Step.PlanBenefits) step).f103200a), new PlanBenefitsScreenContract$UIConfig(false), dVar.I2(), 8));
                } else if (step instanceof PlanOfferFlowContract$Step.PlanDocuments) {
                    planBillingPickerFlow = new PlanDocumentsBottomSheetScreen(new PlanDocumentsBottomSheetScreenContract$InputData(PlanDocumentsBottomSheetScreenContract$TitleConfig.NoTitle.f103524a, ((PlanOfferFlowContract$Step.PlanDocuments) step).f103201a));
                } else {
                    if (!(step instanceof PlanOfferFlowContract$Step.BillingPicker)) {
                        if (!(step instanceof PlanOfferFlowContract$Step.BottomSheetPromptOffer)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        a aVar = dVar.f103205q;
                        PricingPlanOfferPrompt.Available prompt = ((PlanOfferFlowContract$Step.BottomSheetPromptOffer) step).f103198a;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(prompt, "prompt");
                        PlanOfferBottomSheetScreen planOfferBottomSheetScreen = new PlanOfferBottomSheetScreen(new PlanOfferBottomSheetScreenContract$InputData(prompt, true));
                        planOfferBottomSheetScreen.l2(new agh.b(dVar, LazyFlowCoordinator, 6));
                        dVar.a(planOfferBottomSheetScreen, new e(dVar, 1));
                        return planOfferBottomSheetScreen;
                    }
                    PlanOfferFlowContract$Step.BillingPicker billingPicker = (PlanOfferFlowContract$Step.BillingPicker) step;
                    planBillingPickerFlow = new PlanBillingPickerFlow(new PlanBillingPickerContract$InputData(new SelectedBillingPlan.PlanId(billingPicker.f103195a), new PlanBillingPickerContract$Mode.Standalone(billingPicker.f103196b, billingPicker.f103197c, billingPicker.d), xfa.b.PLAN_OFFER_PROMPT, dVar.I2(), null, 48));
                    f block3 = new f(dVar, 0);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    planBillingPickerFlow.H = block3;
                }
                return planBillingPickerFlow;
            default:
                oki.g onResult = (oki.g) obj2;
                tmk.f result = (tmk.f) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof tmk.e) {
                    onResult.pop();
                } else {
                    if (!(result instanceof tmk.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PricingPlanAction pricingPlanAction = ((tmk.d) result).f272232a;
                    boolean z3 = pricingPlanAction instanceof PricingPlanAction.Upgrade;
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.d dVar2 = this.f5302b;
                    if (z3) {
                        PricingPlanAction.Upgrade upgrade = (PricingPlanAction.Upgrade) pricingPlanAction;
                        l.a1(dVar2, dVar2.f103206r.b3(upgrade.f102809a, upgrade.f102810b, upgrade.f102811c, new k(new a2g.a(new agh.b(dVar2, onResult, 7), 15))), null, null, new i(upgrade, dVar2, null), 3);
                    } else {
                        dVar2.J2(pricingPlanAction, new g(onResult, 0));
                    }
                }
                return Unit.f186387a;
        }
    }
}
