package mkg;

import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import go.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import mjf.b0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import tof.i7;
import tof.ob;
import tof.pb;
import tof.tb;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements ikg.f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Priority.HIGH f206291b = new Priority.HIGH("Unified transactions list – Standard source");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f206292a;

    public f(com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f206292a = transactionsInteractor;
    }

    @Override // ikg.f
    public final Flow a(ikg.e params) {
        TransactionsSort transactionsSort;
        Intrinsics.checkNotNullParameter(params, "params");
        UnifiedTransactionsFilter unifiedTransactionsFilter = params.d;
        ikg.d dVar = params.f161968a;
        TransactionsFilterWithContext transactionsFilterWithContext = unifiedTransactionsFilter.f94567a;
        if (transactionsFilterWithContext == null) {
            return new g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        String str = params.f161970c;
        i7 i7VarA = transactionsFilterWithContext.f91956a;
        boolean z = dVar instanceof ikg.c;
        if (!z) {
            if (dVar instanceof ikg.a) {
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {i7VarA, new ob(new DateTime(((ikg.a) dVar).f161963a), false)};
                cVar.getClass();
                i7VarA = i7.c.a(i7VarArr);
            } else {
                if (!(dVar instanceof ikg.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                i7.c cVar2 = i7.Companion;
                i7[] i7VarArr2 = {i7VarA, new pb(new DateTime(((ikg.b) dVar).f161965a), true)};
                cVar2.getClass();
                i7VarA = i7.c.a(i7VarArr2);
            }
        }
        if (!d0.W(str)) {
            i7.c cVar3 = i7.Companion;
            i7[] i7VarArr3 = {i7VarA, new tb(str)};
            cVar3.getClass();
            i7VarA = i7.c.a(i7VarArr3);
        }
        i7 i7Var = i7VarA;
        Integer numValueOf = Integer.valueOf(params.f161969b);
        if (z || (dVar instanceof ikg.b)) {
            transactionsSort = TransactionsSort.STARTED_DATE_DESC;
        } else {
            if (!(dVar instanceof ikg.a)) {
                throw new NoWhenBranchMatchedException();
            }
            transactionsSort = TransactionsSort.STARTED_DATE_ASC;
        }
        return nim.a.v(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(this.f206292a, i7Var, null, numValueOf, transactionsSort, new TransactionContext(f206291b, transactionsFilterWithContext.f91957b.f60266b), 2)), new mk3.c(9));
    }

    @Override // ikg.f
    public final Flow b(UnifiedTransactionsFilter filter) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        TransactionsFilterWithContext transactionsFilterWithContext = filter.f94567a;
        if (transactionsFilterWithContext == null) {
            return new g(f0.f322471a, 2);
        }
        return new lt.d(rd0.e.b(((b0) this.f206292a).k(transactionsFilterWithContext.f91956a, TransactionsSort.STARTED_DATE_ASC)), 29);
    }
}
