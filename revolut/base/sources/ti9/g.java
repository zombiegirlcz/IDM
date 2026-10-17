package ti9;

import androidx.room.RxRoom;
import com.revolut.data.model.Data;
import cxe.u;
import dj9.s;
import efm.d0;
import efm.r;
import ej6.x;
import ej9.e0;
import ej9.p;
import ej9.q;
import ej9.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import mjf.b0;
import te0.w;
import tof.i1;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xh9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ci9.b f271456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f271457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ci9.a f271458c;
    public final l93.f d;
    public final mt8.d e;
    public final com.revolut.domain.interactors.transactions.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final whf.b f271459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r10.a f271460h;
    public final i i;

    public g(ci9.b repository, wsg.n walletInteractor, ci9.a planRepository, l93.f cardsInteractor, mt8.d kycInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, whf.b transactionsContentProvider, r10.a disposableCardPlaceholderInteractor, i payLaterProductInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(planRepository, "planRepository");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(disposableCardPlaceholderInteractor, "disposableCardPlaceholderInteractor");
        Intrinsics.checkNotNullParameter(payLaterProductInteractor, "payLaterProductInteractor");
        this.f271456a = repository;
        this.f271457b = walletInteractor;
        this.f271458c = planRepository;
        this.d = cardsInteractor;
        this.e = kycInteractor;
        this.f = transactionsInteractor;
        this.f271459g = transactionsContentProvider;
        this.f271460h = disposableCardPlaceholderInteractor;
        this.i = payLaterProductInteractor;
    }

    public final d0 d() {
        r rVarW = nim.a.w(rd0.e.c(k(w4l.h.f294642c), kotlin.coroutines.g.f186406a), new tfh.a(10));
        Boolean bool = Boolean.FALSE;
        d0 d0VarFirst = zi0.c.q(rVarW, bool).first(bool);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (((ej9.e0) r3).b(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ti9.b
            if (r0 == 0) goto L13
            r0 = r9
            ti9.b r0 = (ti9.b) r0
            int r1 = r0.f271451w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271451w = r1
            goto L18
        L13:
            ti9.b r0 = new ti9.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271451w
            ci9.b r3 = r7.f271456a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r9)
            goto L65
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            goto L5a
        L38:
            yhm.o.b(r9)
            r0.f271451w = r5
            r9 = r3
            ej9.e0 r9 = (ej9.e0) r9
            r9.getClass()
            eif.j r2 = new eif.j
            r5 = 5
            r6 = 0
            r2.<init>(r9, r8, r6, r5)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L57:
            if (r8 != r1) goto L5a
            goto L64
        L5a:
            r0.f271451w = r4
            ej9.e0 r3 = (ej9.e0) r3
            java.lang.Object r8 = r3.b(r0)
            if (r8 != r1) goto L65
        L64:
            return r1
        L65:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti9.g.e(java.lang.String, gim.c):java.lang.Object");
    }

    public final pfm.r f(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        p pVar = (p) this.f271458c;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        pfm.h hVar = new pfm.h(new a08.l(pVar, planId, 26), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return w.g0(hVar);
    }

    public final vkm.d g(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        e0 e0Var = (e0) this.f271456a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(e0Var.f126803h.e(new ej9.e(facilityId), loadingStrategy));
    }

    public final r h(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        e0 e0Var = (e0) this.f271456a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(e0Var.i.e(Unit.f186387a, loadingStrategy), ej9.w.f);
    }

    public final r i() {
        return nim.a.w(n(), new tfh.a(18));
    }

    public final r j(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarC = rd0.e.c(nim.a.v(c8g.a.D(((e0) this.f271456a).a(w4l.j.f294644c)), new tfh.a(22)), kotlin.coroutines.g.f186406a);
        io3.i iVar = io3.i.INTERNAL;
        return nim.a.w(kli.a.h(rVarC, osg.b.g(this.f271457b, loadingStrategy, io3.l.CURRENT, null, iVar, null, null, null, 116)), new tfh.a(20));
    }

    public final u k(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.A(xam.a.h(new c(this, null, 1), ((e0) this.f271456a).a(loadingStrategy)), new tfh.a(14));
    }

    public final r l(String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        p pVar = (p) this.f271458c;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        pfm.r rVarB = pVar.b();
        gi9.c cVar = pVar.f126822b;
        sfm.b bVarG = rVarB.g(RxRoom.createObservable(cVar.f144100a, true, new String[]{"repayments", "plan_preferences", "plans"}, new gbi.c(cVar, planId, 21)).take(1L).map(new eif.h(new x(6), 22)));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        r rVarStartWith = ue0.e.H(bVarG, h0.f322473a, new x(7)).startWith(new Data(null, null, true, 3, null));
        r rVarL = pVar.e.l(planId);
        Intrinsics.h(rVarStartWith);
        r rVarDistinctUntilChanged = w.l(rVarL, rVarStartWith).map(new eif.h(new ej9.j(pVar, 2), 23)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final vkm.d m(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        return rd0.e.b(nim.a.w(((p) this.f271458c).e(), new te8.a(transactionId, 4)));
    }

    public final r n() {
        return ((p) this.f271458c).e();
    }

    public final r o(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        e0 e0Var = (e0) this.f271456a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pd.b.s(pd.b.s(pd.b.s(nim.a.w(e0Var.f126802g.e(Unit.f186387a, loadingStrategy), y.f), new q(e0Var, 2)), new b79.i(new Ref$ObjectRef(), 12)), new a(this, 0));
    }

    public final pfm.a p(Integer num, String planId) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        e0 e0Var = (e0) this.f271456a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        pfm.r rVarG0 = w.g0(e0Var.f126799a.repay(new s(planId, num)));
        pfm.d dVarQ = efm.b.q(((b0) this.f).g(i1.f272794a), ((p) this.f271458c).b());
        Intrinsics.checkNotNullExpressionValue(dVarQ, "mergeArrayDelayError(...)");
        pfm.d dVarQ2 = efm.b.q(dVarQ, pd.b.n(kotlin.coroutines.g.f186406a, new f(this, null, 1)));
        Intrinsics.checkNotNullExpressionValue(dVarQ2, "mergeArrayDelayError(...)");
        pfm.a aVarE = rVarG0.e(ue0.e.v(dVarQ2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }
}
