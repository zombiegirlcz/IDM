package cv1;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$Destination;
import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$InputData;
import com.revolut.feature.apm.breb.api.navigation.BrebTransferNavigation$Destination;
import com.revolut.feature.apm.breb.impl.flow.BrebFlow;
import kotlin.jvm.internal.Intrinsics;
import ov1.c;
import ov1.d;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof com.revolut.feature.apm.breb.api.navigation.a)) {
            return null;
        }
        com.revolut.feature.apm.breb.api.navigation.a aVar = (com.revolut.feature.apm.breb.api.navigation.a) descriptor;
        return aVar.a(new BrebFlow(new d(aVar.f61708a)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BrebNavigation$Destination) {
            return new BrebFlow(new c((BrebNavigation$InputData) ((BrebNavigation$Destination) destination).f98300a));
        }
        if (destination instanceof BrebTransferNavigation$Destination) {
            return new BrebFlow(new d(((BrebTransferNavigation$Destination) destination).f61705b));
        }
        return null;
    }
}
