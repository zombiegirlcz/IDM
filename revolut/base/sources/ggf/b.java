package ggf;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlow;
import com.revolut.feature.transaction_details_pager.impl.ui.flow.TransactionDetailsPagerFlowContract$InputData;
import com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext;
import com.revolut.feature.transactions.api.navigation.StandardPagerInput;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsPagerInput;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.feature.unified_transactions.api.navigation.UnifiedPagerInput;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData;
        UnifiedTransactionsFilter unifiedTransactionsFilter;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof rhf.e) {
            rhf.e eVar = (rhf.e) descriptor;
            TransactionDetailsPagerInput transactionDetailsPagerInput = eVar.f254443a;
            if (transactionDetailsPagerInput instanceof StandardPagerInput) {
                StandardPagerInput standardPagerInput = (StandardPagerInput) transactionDetailsPagerInput;
                UnifiedTransaction.Standard standard = new UnifiedTransaction.Standard(standardPagerInput.f91980a);
                i7 i7Var = standardPagerInput.f91981b;
                if (i7Var != null) {
                    TransactionContext transactionContext = standardPagerInput.f91982c;
                    if (transactionContext == null) {
                        TransactionContext.INSTANCE.getClass();
                        transactionContext = TransactionContext.f60264c;
                    }
                    unifiedTransactionsFilter = new UnifiedTransactionsFilter(new TransactionsFilterWithContext(i7Var, transactionContext), 2);
                } else {
                    unifiedTransactionsFilter = null;
                }
                transactionDetailsPagerFlowContract$InputData = new TransactionDetailsPagerFlowContract$InputData(standard, unifiedTransactionsFilter, eVar.f254444b, eVar.f254445c, eVar.d);
            } else if (transactionDetailsPagerInput instanceof UnifiedPagerInput) {
                UnifiedPagerInput unifiedPagerInput = (UnifiedPagerInput) transactionDetailsPagerInput;
                transactionDetailsPagerFlowContract$InputData = new TransactionDetailsPagerFlowContract$InputData(unifiedPagerInput.f94569a, unifiedPagerInput.f94570b, eVar.f254444b, eVar.f254445c, eVar.d);
            } else {
                transactionDetailsPagerFlowContract$InputData = null;
            }
            if (transactionDetailsPagerFlowContract$InputData != null) {
                return eVar.a(new TransactionDetailsPagerFlow(transactionDetailsPagerFlowContract$InputData));
            }
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
