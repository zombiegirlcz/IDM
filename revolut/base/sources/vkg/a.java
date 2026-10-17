package vkg;

import aii.u;
import com.revolut.feature.us_direct_deposit.DirectDepositFlowDestination;
import com.revolut.feature.us_direct_deposit.impl.flow.DirectDepositFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof DirectDepositFlowDestination) {
            return new DirectDepositFlow();
        }
        return null;
    }
}
