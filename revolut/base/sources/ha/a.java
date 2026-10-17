package ha;

import aii.e;
import aii.g;
import aii.u;
import com.feature.navigation.hub.api.navigation.NavigationHubDestination;
import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlow;
import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof ea.a)) {
            return null;
        }
        ea.a aVar = (ea.a) descriptor;
        return aVar.a(new NavigationHubFlow(new NavigationHubFlowContract$InputData(aVar.f124041a)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof NavigationHubDestination) {
            return new NavigationHubFlow(new NavigationHubFlowContract$InputData(((NavigationHubDestination) destination).f26216a));
        }
        return null;
    }
}
