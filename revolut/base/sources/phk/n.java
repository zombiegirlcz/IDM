package phk;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.PricingPlanActionModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.PlanBillingPickerContract$Step;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_documents_bottom_sheet.PlanDocumentsBottomSheetScreenContract$TitleConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import om4.m1;
import pb2.v;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a f236333b;

    public /* synthetic */ n(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a aVar, int i) {
        this.f236332a = i;
        this.f236333b = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f236332a) {
            case 0:
                yki.l FlowCoordinator = (yki.l) obj2;
                PlanBillingPickerContract$Step step = (PlanBillingPickerContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                boolean zF = Intrinsics.f(step, PlanBillingPickerContract$Step.BillingPicker.f103115a);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a aVar = this.f236333b;
                if (zF) {
                    PlanBillingPickerContract$InputData planBillingPickerContract$InputData = aVar.o;
                    PlanBillingPickerScreen planBillingPickerScreen = new PlanBillingPickerScreen(new PlanBillingPickerScreenContract$InputData(planBillingPickerContract$InputData.f103106a, planBillingPickerContract$InputData.f103107b, planBillingPickerContract$InputData.f103108c, planBillingPickerContract$InputData.e));
                    v block = new v(aVar, FlowCoordinator);
                    Intrinsics.checkNotNullParameter(block, "block");
                    planBillingPickerScreen.H = block;
                    return planBillingPickerScreen;
                }
                if (step instanceof PlanBillingPickerContract$Step.DocumentsList) {
                    PlanBillingPickerContract$Step.DocumentsList documentsList = (PlanBillingPickerContract$Step.DocumentsList) step;
                    return new PlanDocumentsBottomSheetScreen(new PlanDocumentsBottomSheetScreenContract$InputData(new PlanDocumentsBottomSheetScreenContract$TitleConfig.Default(documentsList.f103116a), documentsList.f103117b));
                }
                if (!(step instanceof PlanBillingPickerContract$Step.ActionModal)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a aVar2 = aVar.f103121s;
                PricingPlanActionModalStep pricingPlanActionModalStep = ((PlanBillingPickerContract$Step.ActionModal) step).f103114a;
                rgk.p pVar = aVar.u;
                m1 m1Var = new m1(1, aVar, com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_billing_picker.a.class, "handleBillingSelected", "handleBillingSelected(Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanBillingPickerExternalContract$Output$BillingSelected;)V", 0, 26);
                aVar2.getClass();
                return com.revolut.retail.feature.pricing_plans.ui.impl.flow.action.a.a(pricingPlanActionModalStep, pVar, m1Var);
            default:
                PricingPlanActionModalStep step2 = (PricingPlanActionModalStep) obj2;
                ModalDestination.Style style = (ModalDestination.Style) obj3;
                Intrinsics.checkNotNullParameter(step2, "step");
                Intrinsics.checkNotNullParameter(style, "style");
                oki.h.w2(this.f236333b.f103123w, new PlanBillingPickerContract$Step.ActionModal(step2), style);
                return Unit.f186387a;
        }
    }
}
