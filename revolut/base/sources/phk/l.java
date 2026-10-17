package phk;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerFlow;
import ggk.v0;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f236329l;

    public l(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f236329l = featureToggleInteractor;
    }

    @Override // phk.k
    public final void Z2(i inputData, Function1 onResult) {
        Object next;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions = inputData.f236325c;
        Intrinsics.checkNotNullParameter(plansDashboardLayout$PlanPageLayout$BillingOptions, "<this>");
        if (plansDashboardLayout$PlanPageLayout$BillingOptions.f102755a == v0.TWO_STEP) {
            N2(new PlanBillingPickerFlow(new PlanBillingPickerContract$InputData(inputData.f236323a, null, inputData.f236324b, this.f236329l.a(PricingPlansUiApi$Toggles.RevampedPlanBackgrounds.f102640c), inputData.d, 34)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new js7.c(13, onResult));
            return;
        }
        Iterator it8 = plansDashboardLayout$PlanPageLayout$BillingOptions.d.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) next).f102750g) {
                    break;
                }
            }
        }
        PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) next;
        if (plansDashboardLayout$PlanPageLayout$BillingOptionItem == null) {
            plansDashboardLayout$PlanPageLayout$BillingOptionItem = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) d0.b0(plansDashboardLayout$PlanPageLayout$BillingOptions.d);
        }
        onResult.invoke(new j(plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102747a, plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102751h, plansDashboardLayout$PlanPageLayout$BillingOptionItem.f102748b));
    }
}
