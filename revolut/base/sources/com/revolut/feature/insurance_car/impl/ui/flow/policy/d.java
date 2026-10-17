package com.revolut.feature.insurance_car.impl.ui.flow.policy;

import bwc.i;
import com.revolut.feature.insurance_car.impl.ui.flow.cancellation.CancellationFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.cancellation.CancellationFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.delivery.DeliveryFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.mta.MtaFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.MtaReviewFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.MtaReviewFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlowContract$Step;
import com.revolut.feature.insurance_car.impl.ui.flow.smart_driving.SmartDrivingFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.smart_driving.SmartDrivingFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.UploadDocumentsFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.UploadDocumentsFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.claims.ClaimsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.claims.ClaimsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.details.PolicyDetailsScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.details.PolicyDetailsScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.manage.ManagePolicyScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.manage.ManagePolicyScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.PolicySummaryScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.PolicySummaryScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.activate.ActivateTelematicsDeviceScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.activate.ActivateTelematicsDeviceScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.DeviceDeliveryScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.delivery.DeviceDeliveryScreenContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.unplugged.TelematicsDeviceUnpluggedScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.unplugged.TelematicsDeviceUnpluggedScreenContract$InputData;
import com.revolut.feature.insurance_common.ui.screen.documents.DocumentListScreen;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ll7.m;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends g implements cn7.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CarPolicyFlowContract$InputData f75489t;
    public final ll7.a u;
    public final CarPolicyFlowContract$Step v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f75490w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CarPolicyFlowContract$State f75491x;

    public d(CarPolicyFlowContract$InputData inputData, gm7.d mtaCreateHelper, m mtaRepository, ll7.a applicationFormRepository) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mtaCreateHelper, "mtaCreateHelper");
        Intrinsics.checkNotNullParameter(mtaRepository, "mtaRepository");
        Intrinsics.checkNotNullParameter(applicationFormRepository, "applicationFormRepository");
        this.f75489t = inputData;
        this.u = applicationFormRepository;
        CarPolicyFlowContract$Step carPolicyFlowContract$Step = inputData.f75469b;
        CarPolicyFlowContract$Step.PolicySummary policySummary = CarPolicyFlowContract$Step.PolicySummary.f75482a;
        this.v = carPolicyFlowContract$Step == null ? policySummary : carPolicyFlowContract$Step;
        this.f75490w = carPolicyFlowContract$Step == null ? f0.f322471a : u.c(new Pair(policySummary, TransitionAnimation.SLIDE_START_TO_END.f98396a));
        this.f75491x = CarPolicyFlowContract$State.f75470a;
    }

    public final void O2(CarPolicyFlowContract$Step carPolicyFlowContract$Step) {
        E2(carPolicyFlowContract$Step, true, null, false);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        CarPolicyFlowContract$Step step = (CarPolicyFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean z = step instanceof CarPolicyFlowContract$Step.PolicySummary;
        CarPolicyFlowContract$InputData carPolicyFlowContract$InputData = this.f75489t;
        if (z) {
            PolicySummaryScreen policySummaryScreen = new PolicySummaryScreen(new PolicySummaryScreenContract$InputData(carPolicyFlowContract$InputData.f75468a));
            cn7.c cVar = new cn7.c(1, this, d.class, "handlePolicySummaryScreenResult", "handlePolicySummaryScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/summary/PolicySummaryScreenContract$OutputData;)V", 0, 3);
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            policySummaryScreen.H = cVar;
            return policySummaryScreen;
        }
        if (step instanceof CarPolicyFlowContract$Step.PolicyDetails) {
            PolicyDetailsScreen policyDetailsScreen = new PolicyDetailsScreen(new PolicyDetailsScreenContract$InputData(carPolicyFlowContract$InputData.f75468a));
            cn7.c cVar2 = new cn7.c(1, this, d.class, "handlePolicyDetailsScreenResult", "handlePolicyDetailsScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/details/PolicyDetailsScreenContract$OutputData;)V", 0, 2);
            Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
            policyDetailsScreen.H = cVar2;
            return policyDetailsScreen;
        }
        if (step instanceof CarPolicyFlowContract$Step.DocumentsList) {
            return new DocumentListScreen(pn7.a.a(carPolicyFlowContract$InputData.f75468a));
        }
        if (step instanceof CarPolicyFlowContract$Step.Claims) {
            ClaimsScreen claimsScreen = new ClaimsScreen(new ClaimsScreenContract$InputData(carPolicyFlowContract$InputData.f75468a));
            i iVar = new i(1, this, d.class, "handleGetHelpScreenResult", "handleGetHelpScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/claims/ClaimsScreenContract$OutputData;)V", 0, 25);
            Intrinsics.checkNotNullParameter(iVar, "<set-?>");
            claimsScreen.H = iVar;
            return claimsScreen;
        }
        if (step instanceof CarPolicyFlowContract$Step.UploadDocuments) {
            return new UploadDocumentsFlow(new UploadDocumentsFlowContract$InputData(carPolicyFlowContract$InputData.f75468a));
        }
        if (step instanceof CarPolicyFlowContract$Step.Delivery) {
            return new DeliveryFlow(new DeliveryFlowContract$InputData(carPolicyFlowContract$InputData.f75468a, ((CarPolicyFlowContract$Step.Delivery) step).f75473a));
        }
        if (step instanceof CarPolicyFlowContract$Step.TelematicsDeviceDelivery) {
            DeviceDeliveryScreen deviceDeliveryScreen = new DeviceDeliveryScreen(new DeviceDeliveryScreenContract$InputData(carPolicyFlowContract$InputData.f75468a));
            i iVar2 = new i(1, this, d.class, "handleDeviceDeliveryScreenResult", "handleDeviceDeliveryScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/telematic_device/delivery/DeviceDeliveryScreenContract$OutputData;)V", 0, 26);
            Intrinsics.checkNotNullParameter(iVar2, "<set-?>");
            deviceDeliveryScreen.H = iVar2;
            return deviceDeliveryScreen;
        }
        if (step instanceof CarPolicyFlowContract$Step.ActivateTelematicsDevice) {
            return new ActivateTelematicsDeviceScreen(new ActivateTelematicsDeviceScreenContract$InputData(((CarPolicyFlowContract$Step.ActivateTelematicsDevice) step).f75471a));
        }
        if (step instanceof CarPolicyFlowContract$Step.TelematicsDeviceUnplugged) {
            TelematicsDeviceUnpluggedScreen telematicsDeviceUnpluggedScreen = new TelematicsDeviceUnpluggedScreen(new TelematicsDeviceUnpluggedScreenContract$InputData(carPolicyFlowContract$InputData.f75468a));
            i iVar3 = new i(1, this, d.class, "handleDeviceUnpluggedScreen", "handleDeviceUnpluggedScreen(Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/telematic_device/unplugged/TelematicsDeviceUnpluggedScreenContract$OutputData;)V", 0, 27);
            Intrinsics.checkNotNullParameter(iVar3, "<set-?>");
            telematicsDeviceUnpluggedScreen.H = iVar3;
            return telematicsDeviceUnpluggedScreen;
        }
        if (step instanceof CarPolicyFlowContract$Step.SmartDriving) {
            return new SmartDrivingFlow(new SmartDrivingFlowContract$InputData(carPolicyFlowContract$InputData.f75468a));
        }
        if (step instanceof CarPolicyFlowContract$Step.ManagePolicy) {
            ManagePolicyScreen managePolicyScreen = new ManagePolicyScreen(new ManagePolicyScreenContract$InputData(carPolicyFlowContract$InputData.f75468a));
            i iVar4 = new i(1, this, d.class, "handleManagePolicyScreenResult", "handleManagePolicyScreenResult(Lcom/revolut/feature/insurance_car/impl/ui/screen/policy/manage/ManagePolicyScreenContract$OutputData;)V", 0, 29);
            Intrinsics.checkNotNullParameter(iVar4, "<set-?>");
            managePolicyScreen.H = iVar4;
            return managePolicyScreen;
        }
        if (step instanceof CarPolicyFlowContract$Step.PolicyCancellation) {
            CancellationFlow cancellationFlow = new CancellationFlow(new CancellationFlowContract$InputData(carPolicyFlowContract$InputData.f75468a));
            cn7.c cVar3 = new cn7.c(1, this, d.class, "handlePolicyCancellationResult", "handlePolicyCancellationResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/cancellation/CancellationFlowContract$OutputData;)V", 0, 1);
            Intrinsics.checkNotNullParameter(cVar3, "<set-?>");
            cancellationFlow.J = cVar3;
            return cancellationFlow;
        }
        if (step instanceof CarPolicyFlowContract$Step.MidTermAdjustment) {
            CarPolicyFlowContract$Step.MidTermAdjustment midTermAdjustment = (CarPolicyFlowContract$Step.MidTermAdjustment) step;
            return new MtaFlow(new MtaFlowContract$InputData(carPolicyFlowContract$InputData.f75468a, midTermAdjustment.f75476a, midTermAdjustment.f75477b));
        }
        if (step instanceof CarPolicyFlowContract$Step.MtaReview) {
            CarPolicyFlowContract$Step.MtaReview mtaReview = (CarPolicyFlowContract$Step.MtaReview) step;
            MtaReviewFlow mtaReviewFlow = new MtaReviewFlow(new MtaReviewFlowContract$InputData(carPolicyFlowContract$InputData.f75468a, mtaReview.f75478a, mtaReview.f75479b));
            b block = new b(1, 0, d.class, this, "handleMtaReviewResult", "handleMtaReviewResult(Lcom/revolut/feature/insurance_car/impl/ui/flow/mta_review/MtaReviewFlowContract$OutputData;)V");
            Intrinsics.checkNotNullParameter(block, "block");
            mtaReviewFlow.H = block;
            return mtaReviewFlow;
        }
        if (!(step instanceof CarPolicyFlowContract$Step.RenewPolicy)) {
            throw new NoWhenBranchMatchedException();
        }
        CarOnboardingFlow carOnboardingFlow = new CarOnboardingFlow(new CarOnboardingFlowContract$InputData.RenewalPolicy(carPolicyFlowContract$InputData.f75468a, ((CarPolicyFlowContract$Step.RenewPolicy) step).f75483a));
        c cVar4 = new c(1, 0, d.class, this, "handleRenewalPolicyFlow", "handleRenewalPolicyFlow(Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$OutputData;)V");
        Intrinsics.checkNotNullParameter(cVar4, "<set-?>");
        carOnboardingFlow.J = cVar4;
        return carOnboardingFlow;
    }

    @Override // dki.g
    public final List w2() {
        return this.f75490w;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f75491x;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.v;
    }
}
