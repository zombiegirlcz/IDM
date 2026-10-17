package csc;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.sca_prompt.api.navigation.ScaPromptDestination;
import com.revolut.feature.sca_prompt.api.navigation.TrustedEntitiesDestination;
import com.revolut.feature.sca_prompt.impl.flow.ScaPromptFlow;
import com.revolut.feature.sca_prompt.impl.trusted_entities.TrustedEntitiesScreen;
import isc.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof wrc.a)) {
            return null;
        }
        wrc.a aVar = (wrc.a) descriptor;
        return aVar.a(new ScaPromptFlow(new f(aVar.f299546a, null, aVar.f299547b, aVar.f299548c, null)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ScaPromptDestination) {
            ScaPromptDestination scaPromptDestination = (ScaPromptDestination) destination;
            return new ScaPromptFlow(new f(scaPromptDestination.f85336a, scaPromptDestination.f85337b, scaPromptDestination.f85338c, scaPromptDestination.d, scaPromptDestination.e));
        }
        if (destination instanceof TrustedEntitiesDestination) {
            return new TrustedEntitiesScreen();
        }
        return null;
    }
}
