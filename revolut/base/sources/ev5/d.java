package ev5;

import dv5.l;
import dv5.q;
import kotlin.jvm.internal.Intrinsics;
import pt5.f;
import pt5.t;
import pu5.e;
import wsg.n;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f129740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f129741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iva.a f129742c;
    public final pu5.f d;
    public final e e;
    public final pu5.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final whf.b f129743g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f129744h;
    public final p0i.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xua.a f129745j;
    public final lu5.n k;

    public d(q defaultTransactionsFilterProvider, f mapper, iva.a recurringBuysNavigationProvider, pu5.f revXOrderDetailsNavigationProvider, e cryptoTransactionDetailsNavigator, pu5.a cryptoOrderDetailsNavigator, whf.b transactionsContentProvider, n walletInteractor, p0i.b fxOrderInteractor, xua.a recurringPaymentInteractor, lu5.n transactionsFilterProviderForLinkedTransactions, dv5.a ordersSearcher) {
        Intrinsics.checkNotNullParameter(defaultTransactionsFilterProvider, "defaultTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(recurringBuysNavigationProvider, "recurringBuysNavigationProvider");
        Intrinsics.checkNotNullParameter(revXOrderDetailsNavigationProvider, "revXOrderDetailsNavigationProvider");
        Intrinsics.checkNotNullParameter(cryptoTransactionDetailsNavigator, "cryptoTransactionDetailsNavigator");
        Intrinsics.checkNotNullParameter(cryptoOrderDetailsNavigator, "cryptoOrderDetailsNavigator");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(transactionsFilterProviderForLinkedTransactions, "transactionsFilterProviderForLinkedTransactions");
        Intrinsics.checkNotNullParameter(ordersSearcher, "ordersSearcher");
        this.f129740a = defaultTransactionsFilterProvider;
        this.f129741b = mapper;
        this.f129742c = recurringBuysNavigationProvider;
        this.d = revXOrderDetailsNavigationProvider;
        this.e = cryptoTransactionDetailsNavigator;
        this.f = cryptoOrderDetailsNavigator;
        this.f129743g = transactionsContentProvider;
        this.f129744h = walletInteractor;
        this.i = fxOrderInteractor;
        this.f129745j = recurringPaymentInteractor;
        this.k = transactionsFilterProviderForLinkedTransactions;
    }

    public final l a(t tVar) {
        if (tVar == null) {
            tVar = this.f129740a;
        }
        xua.a aVar = this.f129745j;
        lu5.n nVar = this.k;
        return new l(this.f129743g, this.f129744h, this.i, aVar, tVar, nVar);
    }
}
