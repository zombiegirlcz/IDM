package com.revolut.feature.rev_points.impl.ui.transactions.list;

import cli.y;
import com.revolut.feature.rev_points.impl.ui.transactions.list.b;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import efm.r;
import eub.l;
import ihm.f;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ldi.k;
import lk0.g;
import lk0.h;
import m1c.e1;
import m1c.r1;
import nyb.m0;
import oki.h;
import pth.m;
import q0c.i;
import q0c.j;
import q0c.p;
import q0c.s;
import q0c.t;
import q0c.u;
import te0.w;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements p {
    public final RevPointsTransactionsListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nhf.a f83888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f83889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f83890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m0 f83891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f83892t;
    public final fub.k u;
    public final syb.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f83893w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f83894x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final f f83895y;
    public YearMonth z;

    public d(e stateMapper, RevPointsTransactionsListScreenContract$InputData inputData, nhf.a unitedWalletInteractor, l revPointsTransactionsPagingInteractor, k revPointsPocketTransactionsPagingInteractor, m0 revPointsTransactionsInteractor, u snapshotCache, fub.k revPointsTransactionMapper, syb.c flowModel) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsPagingInteractor, "revPointsTransactionsPagingInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketTransactionsPagingInteractor, "revPointsPocketTransactionsPagingInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(snapshotCache, "snapshotCache");
        Intrinsics.checkNotNullParameter(revPointsTransactionMapper, "revPointsTransactionMapper");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        this.o = inputData;
        this.f83888p = unitedWalletInteractor;
        this.f83889q = revPointsTransactionsPagingInteractor;
        this.f83890r = revPointsPocketTransactionsPagingInteractor;
        this.f83891s = revPointsTransactionsInteractor;
        this.f83892t = snapshotCache;
        this.u = revPointsTransactionMapper;
        this.v = flowModel;
        RevPointsTransactionPageParams params = inputData.f83876a;
        snapshotCache.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        t tVar = inputData.f83877b.f83883c ? null : (t) snapshotCache.f241251a.get(params);
        this.f83893w = mra.d.b(this, tVar != null ? new q0c.l(new i(new g(zhm.u.c(tVar.f241248a))), tVar.f241249b, tVar.f241250c) : b.a.f83887a, stateMapper, null, true, 4);
        this.f83894x = tVar != null;
        this.f83895y = v0.a.d("create(...)");
    }

    public static final void I2(d dVar, lk0.e eVar, YearMonth yearMonth, final q0c.l lVar) {
        y yVar = dVar.f83893w;
        YearMonth yearMonth2 = dVar.z;
        if (yearMonth2 == null) {
            final int i = 0;
            dVar.H2(yVar, new Function1() { // from class: q0c.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    com.revolut.feature.rev_points.impl.ui.transactions.list.b update = (com.revolut.feature.rev_points.impl.ui.transactions.list.b) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            boolean z = update instanceof l;
                            l lVar2 = lVar;
                            return z ? l.a((l) update, lVar2.f241233a, lVar2.f241234b, null, null, false, lVar2.f, null, null, false, false, 988) : lVar2;
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            boolean z3 = update instanceof l;
                            l lVar3 = lVar;
                            return z3 ? l.a((l) update, lVar3.f241233a, lVar3.f241234b, null, null, false, lVar3.f, null, null, false, false, 220) : lVar3;
                    }
                }
            });
            return;
        }
        if (yearMonth != null && yearMonth.compareTo(yearMonth2) <= 0) {
            dVar.z = null;
            dVar.H2(yVar, new m(lVar, yearMonth2, 21));
        } else if (x5d.b.a(eVar)) {
            dVar.z = null;
            final int i2 = 1;
            dVar.H2(yVar, new Function1() { // from class: q0c.r
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    com.revolut.feature.rev_points.impl.ui.transactions.list.b update = (com.revolut.feature.rev_points.impl.ui.transactions.list.b) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            boolean z = update instanceof l;
                            l lVar2 = lVar;
                            return z ? l.a((l) update, lVar2.f241233a, lVar2.f241234b, null, null, false, lVar2.f, null, null, false, false, 988) : lVar2;
                        default:
                            Intrinsics.checkNotNullParameter(update, "$this$update");
                            boolean z3 = update instanceof l;
                            l lVar3 = lVar;
                            return z3 ? l.a((l) update, lVar3.f241233a, lVar3.f241234b, null, null, false, lVar3.f, null, null, false, false, 220) : lVar3;
                    }
                }
            });
        } else {
            if (eVar.f196173c) {
                return;
            }
            dVar.f83895y.onNext(h.b.f196176a);
        }
    }

    public static YearMonth J2(q0c.l lVar) {
        Object objPrevious;
        List list;
        e1 e1Var;
        Object objPrevious2;
        List list2;
        r1 r1Var;
        RevPointsTransaction revPointsTransaction;
        q0c.k kVar = lVar.f241233a;
        if (kVar instanceof i) {
            List list3 = ((i) kVar).f241231a.f196174a;
            ListIterator listIterator = list3.listIterator(list3.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious2 = null;
                    break;
                }
                objPrevious2 = listIterator.previous();
                if (!((lk0.e) objPrevious2).f196171a.isEmpty()) {
                    break;
                }
            }
            lk0.e eVar = (lk0.e) objPrevious2;
            if (eVar != null && (list2 = eVar.f196171a) != null && (r1Var = (r1) d0.m0(list2)) != null && (revPointsTransaction = r1Var.f201449a) != null) {
                return K2(revPointsTransaction.d);
            }
        } else {
            if (!(kVar instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            List list4 = ((j) kVar).f241232a.f196174a;
            ListIterator listIterator2 = list4.listIterator(list4.size());
            while (true) {
                if (!listIterator2.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator2.previous();
                if (!((lk0.e) objPrevious).f196171a.isEmpty()) {
                    break;
                }
            }
            lk0.e eVar2 = (lk0.e) objPrevious;
            if (eVar2 != null && (list = eVar2.f196171a) != null && (e1Var = (e1) d0.m0(list)) != null) {
                return K2(e1Var.f201358b);
            }
        }
        return null;
    }

    public static YearMonth K2(long j2) {
        LocalDate localDate = oi0.d.Y(j2).toLocalDate();
        YearMonth yearMonthOf = YearMonth.of(localDate.getYear(), localDate.getMonth());
        Intrinsics.checkNotNullExpressionValue(yearMonthOf, "of(...)");
        return yearMonthOf;
    }

    @Override // yji.l
    public final void I1() {
        l2(new c(this, null), new yi5.b(26));
        yji.l.a1(this, ((com.revolut.feature.rev_points.impl.ui.c) this.v).f83779t, null, null, new s(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        boolean z = this.o.f83877b.f83883c;
        nhf.a aVar = this.f83888p;
        Continuation continuation = null;
        if (z) {
            yji.l.b1(this, rd0.e.b(ue0.e.q(w.l(this.f83890r.f194144b, ((njf.j) aVar).f()), h0.f322473a)), null, new s(this, continuation, 1), 3);
            return;
        }
        n2(new pwb.p(this, continuation, 4), new whi.b(6));
        ihm.b bVarB = this.f83889q.b();
        r rVarF = ((njf.j) aVar).f();
        r map = w.f0(this.f83891s.f220812a.f258129b.g().g()).map(new nyb.h0(2, new nyb.m(12)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        yji.l.b1(this, rd0.e.b(ue0.e.q(w.m(bVarB, rVarF, map), h0.f322473a)), null, new s(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f83893w;
    }
}
