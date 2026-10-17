package dwj;

import aii.p;
import aii.u;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlow;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$InputData;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowDestination;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if ((destination instanceof UserOnboardingFlowDestination.UserOnboarding) || (destination instanceof UserOnboardingFlowDestination.SsoEmailOtpAuthentication) || (destination instanceof UserOnboardingFlowDestination.SsoDeeplinkAuthentication)) {
            return new UserOnboardingFlow(new UserOnboardingFlowContract$InputData(((UserOnboardingFlowDestination) destination).getF101669a()));
        }
        return null;
    }
}
