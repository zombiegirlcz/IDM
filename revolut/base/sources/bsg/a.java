package bsg;

import aii.u;
import com.revolut.feature.voluntary.offboarding.api.navigation.VoluntaryOffboardingFeatureConfig$OffboardingFlow$Destination;
import com.revolut.feature.voluntary.offboarding.impl.ui.flow.VoluntaryOffboardingFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof VoluntaryOffboardingFeatureConfig$OffboardingFlow$Destination) {
            return new VoluntaryOffboardingFlow();
        }
        return null;
    }
}
