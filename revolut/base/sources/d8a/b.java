package d8a;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.pix.api.navigation.PixNavigation$Destination;
import com.revolut.feature.pix.impl.flow.PixFlow;
import h8a.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof d)) {
            return null;
        }
        d dVar = (d) descriptor;
        return dVar.a(new PixFlow(dVar.b()));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PixNavigation$Destination) {
            return new PixFlow(((PixNavigation$Destination) destination).getF98300a());
        }
        return null;
    }
}
