package com.revolut.feature.insurance_car.impl.ui.flow.cancellation;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.flow.cancellation.CancellationFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation.refund.CancellationRefundScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation.refund.CancellationRefundScreenContract$InputData;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreen;
import com.revolut.feature.picker.PickerController;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import d67.e;
import dki.g;
import java.util.List;
import kl7.w1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends g implements am7.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CancellationFlowContract$InputData f75344t;
    public final aq7.a u;
    public final CancellationFlowContract$Step.CancellationConformation v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CancellationFlowContract$State f75345w;

    public b(CancellationFlowContract$InputData inputData, aq7.a questionnaireFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(questionnaireFactory, "questionnaireFactory");
        this.f75344t = inputData;
        this.u = questionnaireFactory;
        this.v = CancellationFlowContract$Step.CancellationConformation.f75339a;
        this.f75345w = new CancellationFlowContract$State(inputData.f75337a);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CancellationFlowContract$Step step = (CancellationFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof CancellationFlowContract$Step.CancellationConformation) {
            FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(e.a(d67.g.Companion, new TextLocalisedClause(R$string.car_insurance_policy_cancellation_introduction_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_policy_cancellation_introduction_description, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", new ImageTransformations(null, null, null, null, null, 300, 300, 31), null, null, 28), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, new TextLocalisedClause(R$string.car_insurance_policy_cancellation_introduction_button_continue, null, null, 14), new TextLocalisedClause(R$string.car_insurance_policy_cancellation_introduction_button_chat, null, null, 14), false, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, false, 16511948));
            a08.e block = new a08.e(1, this, b.class, "handleCancellationConformationResult", "handleCancellationConformationResult(Lcom/revolut/feature/full_screen_prompt/FullScreenPromptScreenContract$OutputData;)V", 0, 12);
            Intrinsics.checkNotNullParameter(block, "block");
            fullScreenPromptScreen.H = block;
            return fullScreenPromptScreen;
        }
        boolean z = step instanceof CancellationFlowContract$Step.CancellationFeedback;
        CancellationFlowContract$InputData cancellationFlowContract$InputData = this.f75344t;
        if (z) {
            PickerController pickerControllerA = this.u.a(cancellationFlowContract$InputData.f75337a, w1.CANCELLATION, new TextLocalisedClause(R$string.car_insurance_policy_cancellation_feedback_title, null, null, 14), new TextLocalisedClause(R$string.car_insurance_policy_cancellation_feedback_description, null, null, 14), new TextLocalisedClause(R$string.car_insurance_policy_cancellation_feedback_button_confirm, null, null, 14));
            a08.e block2 = new a08.e(1, this, b.class, "handleQuestionnaireController", "handleQuestionnaireController(Lcom/revolut/feature/picker/PickerControllerContract$OutputData;)V", 0, 14);
            Intrinsics.checkNotNullParameter(block2, "block");
            pickerControllerA.H = block2;
            return pickerControllerA;
        }
        if (!(step instanceof CancellationFlowContract$Step.CancellationRefund)) {
            if (step instanceof CancellationFlowContract$Step.DocumentsList) {
                return new DocumentListScreen(pn7.a.a(cancellationFlowContract$InputData.f75337a));
            }
            throw new NoWhenBranchMatchedException();
        }
        CancellationRefundScreen cancellationRefundScreen = new CancellationRefundScreen(new CancellationRefundScreenContract$InputData(cancellationFlowContract$InputData.f75337a, ((CancellationFlowContract$Step.CancellationRefund) step).f75341a));
        a08.e eVar = new a08.e(1, this, b.class, "handlePolicyCancellationRefundScreen", "handlePolicyCancellationRefundScreen(Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/cancellation/refund/CancellationRefundScreenContract$OutputData;)V", 0, 13);
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        cancellationRefundScreen.H = eVar;
        return cancellationRefundScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f75345w;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
