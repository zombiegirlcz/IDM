package x2k;

import aii.g;
import aii.u;
import com.revolut.retail.feature.payments.bank_transfer.api.india_withdrawal.IndiaWithdrawalDestination;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.IndiaWithdrawalFlow;
import com.revolut.retail.feature.payments.bank_transfer.impl.india_withdrawal.flow.IndiaWithdrawalFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof b2k.a)) {
            return null;
        }
        b2k.a aVar = (b2k.a) descriptor;
        return aVar.a(new IndiaWithdrawalFlow(new IndiaWithdrawalFlowContract$InputData(aVar.b())));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof IndiaWithdrawalDestination) {
            return new IndiaWithdrawalFlow(new IndiaWithdrawalFlowContract$InputData(((IndiaWithdrawalDestination) destination).getF101920b()));
        }
        return null;
    }
}
