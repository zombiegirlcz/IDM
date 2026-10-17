package ls1;

import aii.u;
import com.revolut.feature.apm.bizum.api.navigation.BizumFlowDestination;
import com.revolut.feature.apm.bizum.api.navigation.BizumFlowInputData;
import com.revolut.feature.apm.bizum.api.navigation.BizumTransferBridgeFeatureConfig$BridgeDestination;
import com.revolut.feature.apm.bizum.impl.ui.BizumFlow;
import com.revolut.feature.apm.bizum.impl.ui.transfer.flow.BizumTransferFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BizumTransferBridgeFeatureConfig$BridgeDestination) {
            return new BizumTransferFlow(((BizumTransferBridgeFeatureConfig$BridgeDestination) destination).getF61560a());
        }
        if (destination instanceof BizumFlowDestination) {
            return new BizumFlow((BizumFlowInputData) ((BizumFlowDestination) destination).f98300a);
        }
        return null;
    }
}
