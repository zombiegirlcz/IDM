package nh8;

import aii.u;
import com.revolut.feature.junior_onboarding.api.JuniorOnboardingApi$Toggles;
import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import com.revolut.feature.junior_onboarding.impl.navigation.JuniorCreationDestination;
import com.revolut.feature.junior_onboarding.impl.ui.app_invite.JuniorAppInviteFlow;
import com.revolut.feature.junior_onboarding.impl.ui.creation.JuniorCreationFlow;
import com.revolut.feature.junior_onboarding.impl.ui.onboarding.JuniorOnboardingFlow;
import com.revolut.feature.junior_onboarding.impl.ui.onboarding.JuniorOnboardingFlowContract$InputData;
import com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.JuniorPostOnboardingFlow;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return JuniorOnboardingApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof JuniorOnboardingDestination) && !(destination instanceof JuniorCreationDestination)) {
            return null;
        }
        KompotDestination kompotDestination = (KompotDestination) destination;
        if (kompotDestination instanceof JuniorOnboardingDestination.Creation) {
            return new JuniorOnboardingFlow(new JuniorOnboardingFlowContract$InputData(((JuniorOnboardingDestination.Creation) destination).getF76965a()));
        }
        if (kompotDestination instanceof JuniorOnboardingDestination.PostOnboarding) {
            return new JuniorPostOnboardingFlow(((JuniorOnboardingDestination.PostOnboarding) destination).getF76967a());
        }
        if (kompotDestination instanceof JuniorOnboardingDestination.AppInvite) {
            return new JuniorAppInviteFlow(((JuniorOnboardingDestination.AppInvite) destination).getF76960a());
        }
        if (kompotDestination instanceof JuniorCreationDestination) {
            return new JuniorCreationFlow();
        }
        return null;
    }
}
