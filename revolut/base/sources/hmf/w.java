package hmf;

import akf.s1;
import kkf.e8;
import kkf.g8;
import kkf.i1;
import kkf.i9;
import kkf.j5;
import kkf.k1;
import kkf.k7;
import kkf.m5;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.p2;
import kkf.p5;
import kkf.t2;
import kkf.t5;
import kkf.v3;
import kkf.x5;
import kkf.y0;
import kkf.y1;
import kkf.z5;
import kkf.z7;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends a {
    public final e8 A;
    public final g8 B;
    public final kkf.x C;
    public final y0 D;
    public final o2 E;
    public final clf.a F;
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.o f153943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f153944h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s1 f153945j;
    public final akf.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final akf.l0 f153946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kkf.e f153947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kkf.d0 f153948n;
    public final i1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k1 f153949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o1 f153950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y1 f153951r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t2 f153952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i9 f153953t;
    public final v3 u;
    public final p5 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j5 f153954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t5 f153955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k7 f153956y;
    public final n7 z;

    public w(klf.h0 commonDataSource, jt0.b commonHeaderProvider, amf.o userCommentMenuOptionProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, s1 splitBillActionProvider, akf.c adjustForAnalyticsActionProvider, akf.l0 createInstalmentActionProvider, kkf.e analyticsBlockProvider, kkf.d0 confirmationBlockProvider, i1 flightBookingBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, y1 initiatorBlockProvider, t2 linkedExchangeTransactionBlockProvider, i9 userCommentBlockProvider, v3 orderDetailsBlockProvider, p5 revPaymentDisclaimerBlockProvider, j5 revPayMITInsufficientFundsBlockProvider, t5 revPointsBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, e8 telecomInvoiceBlockProvider, g8 telecomPaymentNoticeBlockProvider, kkf.x chargesBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(createInstalmentActionProvider, "createInstalmentActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(flightBookingBlockProvider, "flightBookingBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(linkedExchangeTransactionBlockProvider, "linkedExchangeTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(orderDetailsBlockProvider, "orderDetailsBlockProvider");
        Intrinsics.checkNotNullParameter(revPaymentDisclaimerBlockProvider, "revPaymentDisclaimerBlockProvider");
        Intrinsics.checkNotNullParameter(revPayMITInsufficientFundsBlockProvider, "revPayMITInsufficientFundsBlockProvider");
        Intrinsics.checkNotNullParameter(revPointsBlockProvider, "revPointsBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(telecomInvoiceBlockProvider, "telecomInvoiceBlockProvider");
        Intrinsics.checkNotNullParameter(telecomPaymentNoticeBlockProvider, "telecomPaymentNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153943g = userCommentMenuOptionProvider;
        this.f153944h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f153945j = splitBillActionProvider;
        this.k = adjustForAnalyticsActionProvider;
        this.f153946l = createInstalmentActionProvider;
        this.f153947m = analyticsBlockProvider;
        this.f153948n = confirmationBlockProvider;
        this.o = flightBookingBlockProvider;
        this.f153949p = fromBlockProvider;
        this.f153950q = getHelpBlockProvider;
        this.f153951r = initiatorBlockProvider;
        this.f153952s = linkedExchangeTransactionBlockProvider;
        this.f153953t = userCommentBlockProvider;
        this.u = orderDetailsBlockProvider;
        this.v = revPaymentDisclaimerBlockProvider;
        this.f153954w = revPayMITInsufficientFundsBlockProvider;
        this.f153955x = revPointsBlockProvider;
        this.f153956y = statusBlockProvider;
        this.z = statusWithNoticeBlockProvider;
        this.A = telecomInvoiceBlockProvider;
        this.B = telecomPaymentNoticeBlockProvider;
        this.C = chargesBlockProvider;
        this.D = equivalentBlockProvider;
        this.E = limitExceededBlockProvider;
        this.F = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.F.Z2();
        j5 j5Var = this.f153954w;
        klf.h0 h0Var = j5Var.f184773l;
        cmf.p pVar = new cmf.p(new t38.e(h0Var.d(), 24, h0Var.c(), new ael.l0(3, j5Var, j5.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;)Ljava/util/List;", 4, 20)), new kkf.i0(28), zhm.u.c(j5Var), "RevPayMITInsufficientFunds");
        cmf.p pVarZ22 = this.E.Z2();
        i1 i1Var = this.o;
        cmf.p pVar2 = new cmf.p(vkm.q.Q(vkm.q.q(new t38.e(i1Var.f184736l.c(), 24, i1Var.f184737m.a(), new hwi.b(3, 27, (Continuation) null))), new jy6.l((Continuation) null, i1Var, 16)), new kkf.i0(4), zhm.u.c(i1Var), "FlightBooking");
        cmf.p pVarA = this.D.a();
        cmf.p pVarA2 = this.z.a(false);
        cmf.p pVarA3 = k0.a(this.f153956y.a(), this.f153951r.a(), this.f153949p.Z2(), this.f153948n.a());
        g8 g8Var = this.B;
        cmf.p pVar3 = new cmf.p(new z7(g8Var.f184706a.f(new kjk.x(21)), g8Var, 2), new chc.c0(23), zhm.f0.f322471a, "TelecomPaymentNotice");
        v3 v3Var = this.u;
        klf.h0 h0Var2 = v3Var.f184979l;
        cmf.p pVar4 = new cmf.p(ta6.a.h(h0Var2.d(), h0Var2.c(), v3Var.f184980m.a(), new b9k.a(4, v3Var, v3.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 6)), new kkf.i0(17), zhm.u.c(v3Var), "OrderDetails");
        cmf.p pVarZ23 = this.f153955x.Z2();
        cmf.p pVarD = this.C.d(new kjk.x(7));
        cmf.p pVarZ24 = this.f153947m.Z2();
        e8 e8Var = this.A;
        cmf.p pVar5 = new cmf.p(new z7(new x5(e8Var.f184668l.c(), 10), e8Var, 1), new z5(7), zhm.u.c(e8Var), "TelecomInvoice");
        cmf.p pVarA4 = this.f153953t.a();
        t2 t2Var = this.f153952s;
        cmf.p pVar6 = new cmf.p(vkm.q.Q(vkm.q.q(new iyg.b0(t2Var.f184949l.c(), 28)), new p2(null, t2Var, 0)), new kkf.i0(15), zhm.u.c(t2Var), "LinkedExchangeTransaction");
        cmf.p pVarA5 = this.f153950q.a();
        p5 p5Var = this.v;
        return h(zhm.v.k(pVarZ2, pVar, pVarZ22, pVar2, pVarA, pVarA2, pVarA3, pVar3, pVar4, pVarZ23, pVarD, pVarZ24, pVar5, pVarA4, pVar6, pVarA5, new cmf.p(vkm.q.Q(p5Var.f184884l.c(), new m5(null, p5Var, 0)), new kkf.i0(29), zhm.u.c(p5Var), "RevPaymentDisclaimer")));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.v.k(this.k.Z2(), this.f153945j.Z2(), this.f153946l.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153943g.a(new ah1.p(29)), this.f153944h.a(), this.i.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
