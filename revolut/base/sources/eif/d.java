package eif;

import efm.d0;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import mjf.q;
import tif.r;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tif.d f126598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mif.j f126599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r f126600n;
    public final tif.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f126601p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f126602q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinkedHashSet f126603r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tif.d transactionsDaoWrapper, mif.j transactionDetailsDao, r transactionsMapperWrapper, tif.b loadingStateWrapper, ang.f userInteractor, q calculatedBalanceInteractor, mhf.j transactionsSearchIndexInteractor) {
        super(transactionsDaoWrapper, transactionDetailsDao, transactionsMapperWrapper, loadingStateWrapper, userInteractor, calculatedBalanceInteractor, transactionsSearchIndexInteractor);
        Intrinsics.checkNotNullParameter(transactionsDaoWrapper, "transactionsDaoWrapper");
        Intrinsics.checkNotNullParameter(transactionDetailsDao, "transactionDetailsDao");
        Intrinsics.checkNotNullParameter(transactionsMapperWrapper, "transactionsMapperWrapper");
        Intrinsics.checkNotNullParameter(loadingStateWrapper, "loadingStateWrapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(calculatedBalanceInteractor, "calculatedBalanceInteractor");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        this.f126598l = transactionsDaoWrapper;
        this.f126599m = transactionDetailsDao;
        this.f126600n = transactionsMapperWrapper;
        this.o = loadingStateWrapper;
        this.f126601p = userInteractor;
        this.f126602q = calculatedBalanceInteractor;
        this.f126603r = new LinkedHashSet();
    }

    @Override // eif.k
    public final ufm.i e(x71.a untilCreatedDate) {
        Intrinsics.checkNotNullParameter(untilCreatedDate, "untilCreatedDate");
        d0 d0VarB = g().b(untilCreatedDate.f303135a.getMillis(), h().o1(), h().getPocketId());
        ed7.e eVar = new ed7.e(new b(this, 0), 21);
        d0VarB.getClass();
        int i = 0;
        ufm.i iVar = new ufm.i(new ufm.f(new ufm.i(new ufm.i(d0VarB, eVar, 1), new ed7.e(new efb.i(23), 22), 1).g(new ed7.e(new dkm.a(1, this, d.class, "saveTransactions", "saveTransactions(Lio/reactivex/Single;)Lio/reactivex/Single;", i, 29), 23)).g(new ed7.e(new c(1, this, d.class, "clearUpdatedTransactionsCache", "clearUpdatedTransactionsCache(Lio/reactivex/Single;)Lio/reactivex/Single;", i, 0), 24)), new ed7.e(new b(this, 3), 25), 3), new ed7.e(new efb.i(24), 26), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
