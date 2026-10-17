package ga9;

import com.revolut.feature.onboarding.api.onboarding.OnboardingApi$Toggles;
import com.revolut.feature.onboarding.api.onboarding.OnboardingLanguageChangePromptDestination;
import com.revolut.feature.onboarding.api.onboarding.OnboardingPlanSelectionDestination;
import com.revolut.feature.onboarding.api.onboarding.OnboardingStepsFlowDescriptor;
import com.revolut.feature.onboarding.impl.language_change.flow.LanguageChangeFlow;
import com.revolut.feature.onboarding.impl.language_change.flow.LanguageChangeFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlow;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.plan_selection.OnboardingPlanSelectionFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof OnboardingStepsFlowDescriptor)) {
            return null;
        }
        OnboardingStepsFlowDescriptor onboardingStepsFlowDescriptor = (OnboardingStepsFlowDescriptor) descriptor;
        return onboardingStepsFlowDescriptor.a(new OnboardingFlow(new OnboardingFlowContract$InputData(onboardingStepsFlowDescriptor.getF78189a(), onboardingStepsFlowDescriptor.getF78190b(), onboardingStepsFlowDescriptor.getD(), onboardingStepsFlowDescriptor.getF78191c())));
    }

    @Override // nte.a
    public final List e() {
        return OnboardingApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof OnboardingPlanSelectionDestination) {
            return new OnboardingPlanSelectionFlow();
        }
        if (destination instanceof OnboardingLanguageChangePromptDestination) {
            return new LanguageChangeFlow(new LanguageChangeFlowContract$InputData(false));
        }
        return null;
    }
}
