package nof;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.domain.interactors.transactions.TransactionsSort;
import efm.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import ne0.p;
import org.jetbrains.annotations.NotNull;
import tof.i7;
import tof.k2;
import tof.q7;
import tof.v6;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements i {

    @NotNull
    public static final k Companion = new k();
    public static final Priority.HIGH i = new Priority.HIGH("Transaction Details - Statistics");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f218039j = v.k(v6.COMPLETED, v6.PENDING);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f218040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e9l.a f218041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final le3.i f218042c;
    public final com.revolut.domain.interactors.transactions.a d;
    public final mhf.b e;
    public final osg.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f218043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f218044h;

    public m(h delegate, e9l.a moneyCalculator, le3.i analyticsRatesInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, mhf.b transactionsFilterInteractor, osg.b walletInteractor) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(analyticsRatesInteractor, "analyticsRatesInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsFilterInteractor, "transactionsFilterInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f218040a = delegate;
        this.f218041b = moneyCalculator;
        this.f218042c = analyticsRatesInteractor;
        this.d = transactionsInteractor;
        this.e = transactionsFilterInteractor;
        this.f = walletInteractor;
        this.f218043g = new ConcurrentHashMap();
        b.Companion companion = kotlin.time.b.INSTANCE;
        this.f218044h = new p(kotlin.time.c.g(3, pkm.e.SECONDS), null, new nb6.p(1, this, m.class, "observeDataInternal", "observeDataInternal(Lcom/revolut/feature/transactions/models/Transaction;)Lio/reactivex/Observable;", 0, 14));
    }

    public static final dj0.d a(ArrayList arrayList, m mVar, xi0.b bVar, List list) {
        dj0.d dVarA = ((j9l.a) mVar.f218041b).a(bVar, arrayList, list);
        if (dVarA != null) {
            return dVarA;
        }
        HashSet hashSet = new HashSet();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            hashSet.add(((dj0.d) it8.next()).f115083b.f306286a);
        }
        throw new IllegalStateException(("failed to sum money in currencies " + hashSet + ", missing rates?").toString());
    }

    public final r b(q7 q7Var) {
        i7 i7VarA = mhf.b.a(this.e, q7Var, u.c(k2.NOT_HIDDEN), null, 4);
        if (i7VarA == null) {
            throw new IllegalStateException("filter must not be null");
        }
        TransactionsSort transactionsSort = TransactionsSort.NO_SORT;
        TransactionContext.TransactionData[] elements = {TransactionContext.TransactionData.LOANS, TransactionContext.TransactionData.MERCHANT_PAYMENTS, TransactionContext.TransactionData.ACQUIRING_CASHBACK, TransactionContext.TransactionData.EXCLUDED_FROM_SPENDING_ANALYTICS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m70.a.h(zi0.c.J(com.revolut.domain.interactors.transactions.a.d(this.d, i7VarA, null, null, transactionsSort, new TransactionContext(i, new TransactionContext.DataSet.Excluded(kotlin.collections.d.y0(elements))), 6)), new mgh.i(i7VarA, 28), null, new nmb.v(16), 2);
    }
}
