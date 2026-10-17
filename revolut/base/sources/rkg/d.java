package rkg;

import anf.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import com.youTransactor.uCube.rpc.Constants;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import thf.i;
import thf.k;
import thf.l;
import tof.a3;
import tof.i7;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f254859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1h.e f254860b;

    public d(l swipeActionMapper, i selectableMapper, f1h.e investMapper) {
        Intrinsics.checkNotNullParameter(swipeActionMapper, "swipeActionMapper");
        Intrinsics.checkNotNullParameter(selectableMapper, "selectableMapper");
        Intrinsics.checkNotNullParameter(investMapper, "investMapper");
        this.f254859a = swipeActionMapper;
        this.f254860b = investMapper;
    }

    public final wh a(UnifiedTransaction transaction, UnifiedTransactionsFilter unifiedTransactionsFilter, q extraData, whf.l itemMapping) {
        TransactionsFilterWithContext transactionsFilterWithContext;
        TransactionsFilterWithContext transactionsFilterWithContext2;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(itemMapping, "itemMapping");
        TransactionContext transactionContext = null;
        if (!(transaction instanceof UnifiedTransaction.Standard)) {
            if (!(transaction instanceof UnifiedTransaction.Invest)) {
                throw new NoWhenBranchMatchedException();
            }
            RowDelegate.Model modelA = this.f254860b.a(((UnifiedTransaction.Invest) transaction).f94571a, new q1h.b(itemMapping.f297645a.d ? q1h.a.ONLY_TIME : q1h.a.DATETIME), transaction);
            if (modelA != null) {
                return new wh(modelA.f53228a, modelA, f0.f322471a, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
            }
            return null;
        }
        a3 a3Var = ((UnifiedTransaction.Standard) transaction).f94574a;
        k kVar = itemMapping.f297645a;
        i7 i7Var = (unifiedTransactionsFilter == null || (transactionsFilterWithContext2 = unifiedTransactionsFilter.f94567a) == null) ? null : transactionsFilterWithContext2.f91956a;
        if (unifiedTransactionsFilter != null && (transactionsFilterWithContext = unifiedTransactionsFilter.f94567a) != null) {
            transactionContext = transactionsFilterWithContext.f91957b;
        }
        return ((o) this.f254859a).p(a3Var, extraData, kVar, i7Var, transactionContext);
    }
}
