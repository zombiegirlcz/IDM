package rmf;

import akf.s1;
import bo8.w;
import cmf.p;
import ekf.o0;
import ekf.r0;
import elf.s0;
import hmf.k0;
import jlf.r;
import kkf.d0;
import kkf.h6;
import kkf.i7;
import kkf.i9;
import kkf.j8;
import kkf.k1;
import kkf.k7;
import kkf.k9;
import kkf.n7;
import kkf.o1;
import kkf.s7;
import kkf.s8;
import kkf.y1;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import nof.i;
import tlf.q;
import xkf.a1;
import xkf.q1;
import xkf.t1;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends hmf.a {
    public final s8 A;
    public final i9 B;
    public final k9 C;
    public final r D;
    public final h0 e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f255298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f255299h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final akf.c f255300j;
    public final r0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s1 f255301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kkf.e f255302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f255303n;
    public final k1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o1 f255304p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y1 f255305q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a1 f255306r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q1 f255307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t1 f255308t;
    public final h6 u;
    public final i7 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k7 f255309w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n7 f255310x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s7 f255311y;
    public final j8 z;

    public f(h0 commonDataSource, i transactionStatisticsProvider, q pushToCardHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, r0 pushToCardSendAgainActionProvider, s1 splitBillActionProvider, kkf.e analyticsBlockProvider, d0 confirmationBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, y1 initiatorBlockProvider, a1 paymentBreakdownBlockProvider, q1 paymentsTrackingWidgetBlockProvider, t1 pushToCardCardBlockProvider, h6 securityDelayBlockProvider, i7 statisticsBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, s7 suspiciousTransactionBlockProvider, j8 ticketBlockProvider, s8 transferReasonCatalogueBlockProvider, i9 userCommentBlockProvider, k9 warrantBlockProvider, r pushToCardIconNavbarClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(pushToCardHeaderProvider, "pushToCardHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(pushToCardSendAgainActionProvider, "pushToCardSendAgainActionProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(paymentBreakdownBlockProvider, "paymentBreakdownBlockProvider");
        Intrinsics.checkNotNullParameter(paymentsTrackingWidgetBlockProvider, "paymentsTrackingWidgetBlockProvider");
        Intrinsics.checkNotNullParameter(pushToCardCardBlockProvider, "pushToCardCardBlockProvider");
        Intrinsics.checkNotNullParameter(securityDelayBlockProvider, "securityDelayBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBlockProvider, "suspiciousTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(ticketBlockProvider, "ticketBlockProvider");
        Intrinsics.checkNotNullParameter(transferReasonCatalogueBlockProvider, "transferReasonCatalogueBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(warrantBlockProvider, "warrantBlockProvider");
        Intrinsics.checkNotNullParameter(pushToCardIconNavbarClickHandler, "pushToCardIconNavbarClickHandler");
        this.e = commonDataSource;
        this.f = transactionStatisticsProvider;
        this.f255298g = pushToCardHeaderProvider;
        this.f255299h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f255300j = adjustForAnalyticsActionProvider;
        this.k = pushToCardSendAgainActionProvider;
        this.f255301l = splitBillActionProvider;
        this.f255302m = analyticsBlockProvider;
        this.f255303n = confirmationBlockProvider;
        this.o = fromBlockProvider;
        this.f255304p = getHelpBlockProvider;
        this.f255305q = initiatorBlockProvider;
        this.f255306r = paymentBreakdownBlockProvider;
        this.f255307s = paymentsTrackingWidgetBlockProvider;
        this.f255308t = pushToCardCardBlockProvider;
        this.u = securityDelayBlockProvider;
        this.v = statisticsBlockProvider;
        this.f255309w = statusBlockProvider;
        this.f255310x = statusWithNoticeBlockProvider;
        this.f255311y = suspiciousTransactionBlockProvider;
        this.z = ticketBlockProvider;
        this.A = transferReasonCatalogueBlockProvider;
        this.B = userCommentBlockProvider;
        this.C = warrantBlockProvider;
        this.D = pushToCardIconNavbarClickHandler;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarC3 = this.u.c3();
        p pVarZ2 = this.C.Z2();
        p pVarZ22 = this.f255311y.Z2();
        p pVarZ23 = this.z.Z2();
        p pVarA = this.B.a();
        p pVarZ24 = this.f255307s.Z2();
        p pVarB3 = this.A.b3();
        p pVarA2 = this.f255310x.a(false);
        p pVarA3 = k0.a(this.f255309w.a());
        p pVarA4 = k0.a(this.f255305q.a(), this.o.Z2(), this.f255303n.a());
        p pVarA5 = this.f255306r.a();
        t1 t1Var = this.f255308t;
        return h(v.k(pVarC3, pVarZ2, pVarZ22, pVarZ23, pVarA, pVarZ24, pVarB3, pVarA2, pVarA3, pVarA4, pVarA5, new p(new wyd.f(t1Var.f306773a.d(), t1Var, 12), new xkf.c(11), f0.f322471a, "PushToCardCard"), k0.a(this.f255302m.Z2(), this.v.Z2(this.f)), this.f255304p.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        q qVar = this.f255298g;
        Flow flowA0 = qVar.f272088a.A0(false);
        h0 h0Var = qVar.f272089b;
        SharedFlow sharedFlowD = h0Var.d();
        Flow flowJ = h0Var.j();
        w wVarG = h0Var.g();
        efm.r rVarX = qVar.f272090c.a().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return ta6.a.e(flowA0, sharedFlowD, flowJ, wVarG, rd0.e.b(rVarX), new tlf.p(qVar, null));
    }

    @Override // hmf.b0
    public final s0 c() {
        return this.D;
    }

    @Override // hmf.b0
    public final Flow d() {
        cmf.f fVarZ2 = this.f255300j.Z2();
        r0 r0Var = this.k;
        h0 h0Var = r0Var.f127119l;
        SharedFlow sharedFlowD = h0Var.d();
        Flow flowJ = h0Var.j();
        efm.r rVarX = r0Var.f127121n.a().x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return f(v.k(fVarZ2, new cmf.f(ta6.a.g(sharedFlowD, flowJ, rd0.e.b(rVarX), r0Var.f127120m.a(), new o0(r0Var, null)), u.c(r0Var), "PushToCardSendAgainAction"), this.f255301l.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f255299h.a(), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
