package sl7;

import aii.u;
import com.revolut.feature.insurance_car.api.navigation.InsuranceCarFeatureConfig;
import com.revolut.feature.insurance_car.impl.ui.flow.home.InsuranceCarHomeFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlow;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlowContract$InputData;
import com.revolut.feature.insurance_car.impl.ui.flow.policy.CarPolicyFlowContract$Step;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof InsuranceCarFeatureConfig.HomeDestination) {
            return new InsuranceCarHomeFlow();
        }
        CarPolicyFlowContract$Step carPolicyFlowContract$Step = null;
        if (destination instanceof InsuranceCarFeatureConfig.OnboardingDestination) {
            return new CarOnboardingFlow(new CarOnboardingFlowContract$InputData.Application(null));
        }
        if (!(destination instanceof InsuranceCarFeatureConfig.PolicyDestination)) {
            return null;
        }
        InsuranceCarFeatureConfig.PolicyDestination policyDestination = (InsuranceCarFeatureConfig.PolicyDestination) destination;
        String str = policyDestination.f75154a;
        InsuranceCarFeatureConfig.PolicyDestination.Step step = policyDestination.f75155b;
        if (step != null) {
            if (step.equals(InsuranceCarFeatureConfig.PolicyDestination.Step.TelematicsDeviceDelivery.f75158a)) {
                carPolicyFlowContract$Step = CarPolicyFlowContract$Step.TelematicsDeviceDelivery.f75485a;
            } else if (step.equals(InsuranceCarFeatureConfig.PolicyDestination.Step.DocumentsRequested.f75156a)) {
                carPolicyFlowContract$Step = CarPolicyFlowContract$Step.UploadDocuments.f75487a;
            } else {
                if (!step.equals(InsuranceCarFeatureConfig.PolicyDestination.Step.SmartDriving.f75157a)) {
                    throw new NoWhenBranchMatchedException();
                }
                carPolicyFlowContract$Step = CarPolicyFlowContract$Step.SmartDriving.f75484a;
            }
        }
        return new CarPolicyFlow(new CarPolicyFlowContract$InputData(str, carPolicyFlowContract$Step));
    }
}
