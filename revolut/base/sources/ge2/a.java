package ge2;

import aii.u;
import com.revolut.feature.apm.swish.api.navigation.SwishNavigation$Destination;
import com.revolut.feature.apm.swish.api.navigation.SwishNavigation$InputData;
import com.revolut.feature.apm.swish.impl.ui.SwishFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SwishNavigation$Destination) {
            return new SwishFlow((SwishNavigation$InputData) ((SwishNavigation$Destination) destination).f98300a);
        }
        return null;
    }
}
