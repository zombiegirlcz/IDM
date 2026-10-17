package eif;

import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mjf.q;
import tif.r;
import tof.q6;
import xhf.d1;

/* JADX INFO: loaded from: classes8.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tif.d f126617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mif.j f126618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f126619c;
    public final tif.b d;
    public final ang.f e;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mhf.j f126620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f126621h;
    public vif.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q6 f126622j;
    public final ao.h k;

    public k(tif.d transactionsDaoWrapper, mif.j transactionDetailsDao, r transactionsMapperWrapper, tif.b loadingStateWrapper, ang.f userInteractor, q calculatedBalanceInteractor, mhf.j transactionsSearchIndexInteractor) {
        Intrinsics.checkNotNullParameter(transactionsDaoWrapper, "transactionsDaoWrapper");
        Intrinsics.checkNotNullParameter(transactionDetailsDao, "transactionDetailsDao");
        Intrinsics.checkNotNullParameter(transactionsMapperWrapper, "transactionsMapperWrapper");
        Intrinsics.checkNotNullParameter(loadingStateWrapper, "loadingStateWrapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(calculatedBalanceInteractor, "calculatedBalanceInteractor");
        Intrinsics.checkNotNullParameter(transactionsSearchIndexInteractor, "transactionsSearchIndexInteractor");
        this.f126617a = transactionsDaoWrapper;
        this.f126618b = transactionDetailsDao;
        this.f126619c = transactionsMapperWrapper;
        this.d = loadingStateWrapper;
        this.e = userInteractor;
        this.f = calculatedBalanceInteractor;
        this.f126620g = transactionsSearchIndexInteractor;
        this.k = new ao.h(20, new f(this, 9));
    }

    public static final ufm.i a(k kVar, d0 d0Var) {
        kVar.getClass();
        ed7.e eVar = new ed7.e(new f(kVar, 2), 28);
        d0Var.getClass();
        ufm.i iVar = new ufm.i(d0Var, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public static final ufm.i b(k kVar, d0 d0Var) {
        kVar.getClass();
        ed7.e eVar = new ed7.e(new f(kVar, 1), 27);
        d0Var.getClass();
        ufm.i iVar = new ufm.i(d0Var, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final efm.r c(String str, String str2, List list) {
        if (list.size() < 100) {
            efm.r rVarJust = efm.r.just(list);
            Intrinsics.h(rVarJust);
            return rVarJust;
        }
        efm.r rVarJust2 = efm.r.just(list);
        d0 d0VarC = g().c(((d1) zhm.d0.m0(list)).getUpdatedDate() + 1, str, str2);
        h hVar = new h(new eed.i(this, 4, str, str2), 7);
        d0VarC.getClass();
        efm.r rVarConcat = efm.r.concat(rVarJust2, new sfm.b(d0VarC, hVar, 2));
        Intrinsics.h(rVarConcat);
        return rVarConcat;
    }

    public final d0 d() {
        return this.k.k(new i(h().o1(), h().getPocketId()));
    }

    public ufm.i e(x71.a untilCreatedDate) {
        Intrinsics.checkNotNullParameter(untilCreatedDate, "untilCreatedDate");
        d0 d0VarB = g().b(untilCreatedDate.f303135a.getMillis(), h().o1(), h().getPocketId());
        h hVar = new h(new f(this, 7), 9);
        d0VarB.getClass();
        int i = 0;
        ufm.i iVar = new ufm.i(new ufm.f(new ufm.i(d0VarB, hVar, 0).g(new h(new c(1, this, k.class, "clearUpdatedTransactionsCache", "clearUpdatedTransactionsCache(Lio/reactivex/Single;)Lio/reactivex/Single;", i, 1), 10)).g(new h(new c(1, this, k.class, "saveTransactions", "saveTransactions(Lio/reactivex/Single;)Lio/reactivex/Single;", i, 2), 11)), new h(new f(this, 8), 12), 3), new h(new efb.i(25), 13), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public efm.b f(x71.f sinceUpdatedDate) {
        Intrinsics.checkNotNullParameter(sinceUpdatedDate, "sinceUpdatedDate");
        d0 d0VarC = g().c(sinceUpdatedDate.f303138a.getMillis() + 1, h().o1(), h().getPocketId());
        h hVar = new h(new f(this, 3), 0);
        d0VarC.getClass();
        d0 d0VarCollectInto = new sfm.b(d0VarC, hVar, 2).collectInto(new ArrayList(), new h(new eed.a(20), 2));
        h hVar2 = new h(new f(this, 5), 3);
        d0VarCollectInto.getClass();
        int i = 0;
        pfm.a aVar = new pfm.a(new ufm.f(new ufm.i(d0VarCollectInto, hVar2, 0).g(new h(new c(1, this, k.class, "clearUpdatedTransactionsCache", "clearUpdatedTransactionsCache(Lio/reactivex/Single;)Lio/reactivex/Single;", i, 3), 4)).g(new h(new c(1, this, k.class, "saveTransactions", "saveTransactions(Lio/reactivex/Single;)Lio/reactivex/Single;", i, 4), 5)), new h(new f(this, 6), 6), 3), new ed7.e(new f(this, 4), 29), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final vif.f g() {
        vif.f fVar = this.i;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.r("remoteTransactionsProvider");
        throw null;
    }

    public final q6 h() {
        q6 q6Var = this.f126622j;
        if (q6Var != null) {
            return q6Var;
        }
        Intrinsics.r("transactionScope");
        throw null;
    }

    public final void i(vif.f remoteTransactionsProvider, q6 transactionScope) {
        Intrinsics.checkNotNullParameter(remoteTransactionsProvider, "remoteTransactionsProvider");
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        if (this.f126621h) {
            throw new IllegalStateException("init() must be called only once");
        }
        this.f126621h = true;
        Intrinsics.checkNotNullParameter(remoteTransactionsProvider, "<set-?>");
        this.i = remoteTransactionsProvider;
        Intrinsics.checkNotNullParameter(transactionScope, "<set-?>");
        this.f126622j = transactionScope;
    }

    public final ufm.i j(List list) {
        ufm.i iVar = new ufm.i(this.e.f(false), new h(new eed.j(list, this, 9), 17), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public ArrayList k(String currentUserId, List transactions) {
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return this.f126619c.a(transactions, currentUserId, null);
    }

    public void l(Long l2) {
        if (l2 != null) {
            this.d.g(h(), l2.longValue());
        }
    }
}
