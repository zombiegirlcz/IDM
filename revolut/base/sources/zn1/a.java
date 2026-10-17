package zn1;

import aii.u;
import com.revolut.feature.apm.bills.bpay.api.navigation.BPayDestination;
import com.revolut.feature.apm.bills.bpay.api.navigation.BPayEditRecurringDestination;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlow;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BPayDestination) {
            BPayDestination bPayDestination = (BPayDestination) destination;
            return new BPayFlow(new BPayFlowContract$InputData(bPayDestination.f61187a, bPayDestination.f61188b, null));
        }
        if (!(destination instanceof BPayEditRecurringDestination)) {
            return null;
        }
        BPayEditRecurringDestination bPayEditRecurringDestination = (BPayEditRecurringDestination) destination;
        return new BPayFlow(new BPayFlowContract$InputData(bPayEditRecurringDestination.f61189a, bPayEditRecurringDestination.f61190b, bPayEditRecurringDestination.f61191c));
    }
}
