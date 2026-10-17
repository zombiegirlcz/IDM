package dd2;

import aii.u;
import com.revolut.feature.apm.services.ideal.api.navigation.IDealFlowDestination;
import com.revolut.feature.apm.services.ideal.impl.ui.flow.IDealFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof IDealFlowDestination) {
            return new IDealFlow((IDealFlowDestination.InputData) ((IDealFlowDestination) destination).f98300a);
        }
        return null;
    }
}
