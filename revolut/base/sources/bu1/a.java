package bu1;

import aii.u;
import com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination;
import com.revolut.feature.apm.blik.impl.ui.flow.BlikFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BlikFlowDestination) {
            return new BlikFlow((BlikFlowDestination.InputData) ((BlikFlowDestination) destination).f98300a);
        }
        return null;
    }
}
