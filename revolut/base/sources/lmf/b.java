package lmf;

import akf.x0;
import amf.o;
import bbk.z;
import cmf.p;
import hmf.k0;
import kkf.d0;
import kkf.i9;
import kkf.k1;
import kkf.l8;
import kkf.o1;
import kkf.o2;
import kkf.y0;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n33.r0;
import pj9.m;
import pkf.k;
import pkf.n;
import pkf.q;
import pkf.s;
import pkf.v;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends hmf.a {
    public static final /* synthetic */ int z = 0;
    public final h0 e;
    public final vlf.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final olf.c f196977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f196978h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bkf.h f196979j;
    public final q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f196980l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k1 f196981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l8 f196982n;
    public final d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pkf.h f196983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f196984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f196985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v f196986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i9 f196987t;
    public final o1 u;
    public final y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o2 f196988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final clf.a f196989x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x0 f196990y;

    public b(h0 commonDataSource, vlf.b commonUiMapper, olf.c arrowTitleHeaderDecorator, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, bkf.h cryptoCommodityExchangeActionsProvider, q settlementDelayBlockProvider, s statusWithNoticeBlockProvider, k1 fromBlockProvider, l8 toAccountBlockProvider, d0 confirmationBlockProvider, pkf.h detailsBlockProvider, k recurringPaymentBlockProvider, n revXInfoBlockProvider, v upgradeBlockProvider, i9 userCommentBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider, x0 moveAgainActionsProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(arrowTitleHeaderDecorator, "arrowTitleHeaderDecorator");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(cryptoCommodityExchangeActionsProvider, "cryptoCommodityExchangeActionsProvider");
        Intrinsics.checkNotNullParameter(settlementDelayBlockProvider, "settlementDelayBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(detailsBlockProvider, "detailsBlockProvider");
        Intrinsics.checkNotNullParameter(recurringPaymentBlockProvider, "recurringPaymentBlockProvider");
        Intrinsics.checkNotNullParameter(revXInfoBlockProvider, "revXInfoBlockProvider");
        Intrinsics.checkNotNullParameter(upgradeBlockProvider, "upgradeBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(moveAgainActionsProvider, "moveAgainActionsProvider");
        this.e = commonDataSource;
        this.f = commonUiMapper;
        this.f196977g = arrowTitleHeaderDecorator;
        this.f196978h = userCommentMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f196979j = cryptoCommodityExchangeActionsProvider;
        this.k = settlementDelayBlockProvider;
        this.f196980l = statusWithNoticeBlockProvider;
        this.f196981m = fromBlockProvider;
        this.f196982n = toAccountBlockProvider;
        this.o = confirmationBlockProvider;
        this.f196983p = detailsBlockProvider;
        this.f196984q = recurringPaymentBlockProvider;
        this.f196985r = revXInfoBlockProvider;
        this.f196986s = upgradeBlockProvider;
        this.f196987t = userCommentBlockProvider;
        this.u = getHelpBlockProvider;
        this.v = equivalentBlockProvider;
        this.f196988w = limitExceededBlockProvider;
        this.f196989x = slotBlockProvider;
        this.f196990y = moveAgainActionsProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f196989x.Z2();
        p pVarZ22 = this.f196988w.Z2();
        q qVar = this.k;
        h0 h0Var = qVar.f237111l;
        oi3.g gVar = new oi3.g(yh5.b.d(h0Var.d(), h0Var.c()), qVar, 21);
        pka.c cVar = new pka.c(5);
        f0 f0Var = f0.f322471a;
        p pVar = new p(gVar, cVar, f0Var, "CryptoCommodityExchangeSettlementDelay");
        p pVarA = this.v.a();
        s sVar = this.f196980l;
        p pVar2 = new p(new oi3.g(sVar.f237121a.d(), sVar, 22), new pka.c(6), f0Var, "CryptoCommodityExchangeStatusWithNote");
        p pVarA2 = k0.a(this.f196981m.Z2(), this.f196982n.Z2(), this.o.a());
        pkf.h hVar = this.f196983p;
        h0 h0Var2 = hVar.f237055l;
        Continuation continuation = null;
        p pVar3 = new p(new oi3.g(yh5.b.g(h0Var2.d(), vkm.q.Q(h0Var2.d(), new pkf.c(continuation, hVar, 1)), vkm.q.Q(h0Var2.d(), new pkf.c(continuation, hVar, 0)), new r0(mo3.a.g(rd0.e.b(((ang.f) hVar.f237060r).k(false)), null, new m(7), 1), 19)), hVar, 18), new pgk.f(hVar, 8), u.c(hVar.f237062t), "CryptoCommodityExchangeDetails");
        k kVar = this.f196984q;
        p pVar4 = new p(new oi3.g(kVar.f237083l.d(), kVar, 19), new pka.c(3), u.c(kVar.f237085n), "CryptoCommodityExchangeRecurringPayment");
        n nVar = this.f196985r;
        p pVar5 = new p(new oi3.g(nVar.f237096l.d(), nVar, 20), new pka.c(4), f0Var, "CryptoCommodityExchangeRevXInfo");
        v vVar = this.f196986s;
        return h(zhm.v.k(pVarZ2, pVarZ22, pVar, pVarA, pVar2, pVarA2, pVar3, pVar4, pVar5, new p(vkm.q.Q(vVar.f237137l.d(), new okf.m((Continuation) null, vVar, 29)), new pka.c(7), u.c(vVar), "CryptoCommodityExchangeUpgrade"), this.f196987t.a(), this.u.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        h0 h0Var = this.e;
        return ta6.a.g(h0Var.d(), h0Var.c(), h0Var.e(), h0Var.g(), new a(this, null));
    }

    @Override // hmf.b0
    public final Flow d() {
        bkf.h hVar = this.f196979j;
        return f(zhm.v.k(new cmf.f(new t38.e(hVar.f16407l.d(), 24, new z(hVar.f16408m.a(), 4), new bkf.d(3, 4, bkf.h.class, hVar, "buildActions", "buildActions(Lcom/revolut/feature/transactions/models/Transaction;Z)Ljava/util/List;")), u.c(hVar), "CryptoCommodityExchangeActions"), this.f196990y.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f196978h.a(new ah1.p(29)), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
