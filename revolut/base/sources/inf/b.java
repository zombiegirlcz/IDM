package inf;

import aii.u;
import com.revolut.feature.transactions.impl.ui.pending.PendingTransactionFlow;
import com.revolut.feature.transactions.impl.ui.pending.PendingTransactionFlowContract$InputData;
import com.revolut.feature.transactions.impl.ui.pending.navigation.PendingTransactionFlowDestination;
import com.revolut.feature.transactions.impl.ui.pending.navigation.PendingTransactionRevertDestination;
import com.revolut.feature.transactions.impl.ui.pending.revert.PendingTransactionRevertController;
import com.revolut.feature.transactions.impl.ui.pending.revert.PendingTransactionRevertControllerContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PendingTransactionFlowDestination) {
            return new PendingTransactionFlow(new PendingTransactionFlowContract$InputData(((PendingTransactionFlowDestination) destination).getF92070b()));
        }
        if (destination instanceof PendingTransactionRevertDestination) {
            return new PendingTransactionRevertController(new PendingTransactionRevertControllerContract$InputData(((PendingTransactionRevertDestination) destination).getF92072a()));
        }
        return null;
    }
}
