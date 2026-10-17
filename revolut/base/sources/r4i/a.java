package r4i;

import aii.u;
import com.revolut.feature_market_data_api.navigation.BreakdownDestination;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlow;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.flow.BreakdownFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof BreakdownDestination)) {
            return null;
        }
        BreakdownDestination breakdownDestination = (BreakdownDestination) destination;
        return new BreakdownFlow(new BreakdownFlowContract$InputData(breakdownDestination.f97061a, breakdownDestination.f97062b));
    }
}
