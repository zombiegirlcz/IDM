package f56;

import aii.p;
import aii.u;
import com.revolut.feature.defi.remittances.api.navigation.DeFiReceiveDestination;
import com.revolut.feature.defi.remittances.api.navigation.DeFiSendDestination;
import com.revolut.feature.defi.remittances.api.navigation.DeFiToCeFiDestination;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.flow.DeFiToCeFiFlow;
import com.revolut.feature.defi.remittances.impl.ui.defi_to_cefi.flow.DeFiToCeFiFlowContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.receive.flow.DeFiReceiveFlow;
import com.revolut.feature.defi.remittances.impl.ui.receive.flow.DeFiReceiveFlowContract$InputData;
import com.revolut.feature.defi.remittances.impl.ui.send.flow.DeFiSendFlow;
import com.revolut.feature.defi.remittances.impl.ui.send.flow.DeFiSendFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof DeFiSendDestination) {
            return new DeFiSendFlow(new DeFiSendFlowContract$InputData(((DeFiSendDestination) destination).f71794a));
        }
        if (destination instanceof DeFiReceiveDestination) {
            DeFiReceiveDestination deFiReceiveDestination = (DeFiReceiveDestination) destination;
            return new DeFiReceiveFlow(new DeFiReceiveFlowContract$InputData(deFiReceiveDestination.f71792a, deFiReceiveDestination.f71793b));
        }
        if (destination instanceof DeFiToCeFiDestination) {
            return new DeFiToCeFiFlow(new DeFiToCeFiFlowContract$InputData(((DeFiToCeFiDestination) destination).f71795a));
        }
        return null;
    }
}
