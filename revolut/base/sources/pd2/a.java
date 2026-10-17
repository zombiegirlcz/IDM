package pd2;

import aii.u;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$Destination;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$InputData;
import com.revolut.feature.apm.spin.api.navigation.SpinNavigation$TransferDestination;
import com.revolut.feature.apm.spin.impl.ui.SpinFlow;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlow;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SpinNavigation$Destination) {
            return new SpinFlow((SpinNavigation$InputData) ((SpinNavigation$Destination) destination).f98300a);
        }
        if (destination instanceof SpinNavigation$TransferDestination) {
            return new SpinTransferFlow(new SpinTransferFlowContract$InputData(((SpinNavigation$TransferDestination) destination).f62865a));
        }
        return null;
    }
}
