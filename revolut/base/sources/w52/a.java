package w52;

import aii.u;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$Destination;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$InputData;
import com.revolut.feature.apm.iris.impl.ui.IrisFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof IrisNavigation$Destination) {
            return new IrisFlow((IrisNavigation$InputData) ((IrisNavigation$Destination) destination).f98300a);
        }
        return null;
    }
}
