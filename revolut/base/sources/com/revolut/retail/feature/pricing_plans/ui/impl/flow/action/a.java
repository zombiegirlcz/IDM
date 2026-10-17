package com.revolut.retail.feature.pricing_plans.ui.impl.flow.action;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.PricingPlanActionModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$BillingOptionHandlingMode;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Mode;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.SelectedBillingPlan;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$UIConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$TitleConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rgk.p;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public static ViewController a(PricingPlanActionModalStep step, p policy, Function1 onBillingSelected) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(policy, "policy");
        Intrinsics.checkNotNullParameter(onBillingSelected, "onBillingSelected");
        if (step instanceof PricingPlanActionModalStep.PlanBenefits) {
            return new PlanBenefitsScreen(new PlanBenefitsScreenContract$InputData(new PlanBenefitsScreenContract$PlanReference.Id(((PricingPlanActionModalStep.PlanBenefits) step).f102965a), new PlanBenefitsScreenContract$UIConfig(false), policy.f254221a, policy.f254222b));
        }
        if (step instanceof PricingPlanActionModalStep.PlanDocuments) {
            return new PlanDocumentsBottomSheetScreen(new PlanDocumentsBottomSheetScreenContract$InputData(PlanDocumentsBottomSheetScreenContract$TitleConfig.NoTitle.f103524a, ((PricingPlanActionModalStep.PlanDocuments) step).f102966a));
        }
        if (!(step instanceof PricingPlanActionModalStep.BillingPicker)) {
            throw new NoWhenBranchMatchedException();
        }
        PricingPlanActionModalStep.BillingPicker billingPicker = (PricingPlanActionModalStep.BillingPicker) step;
        PlanBillingPickerFlow planBillingPickerFlow = new PlanBillingPickerFlow(new PlanBillingPickerContract$InputData(new SelectedBillingPlan.PlanId(billingPicker.f102962a), new PlanBillingPickerContract$Mode.Standalone(billingPicker.f102963b, billingPicker.f102964c, billingPicker.d), policy.f254222b, policy.f254221a, (PlanBillingPickerContract$BillingOptionHandlingMode) null, (String) null, 48));
        g2f.b block = new g2f.b(4, onBillingSelected);
        Intrinsics.checkNotNullParameter(block, "block");
        planBillingPickerFlow.H = block;
        return planBillingPickerFlow;
    }
}
