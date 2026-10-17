package imf;

import amf.o;
import cmf.p;
import hmf.k0;
import kkf.d0;
import kkf.i7;
import kkf.i9;
import kkf.k7;
import kkf.n7;
import kkf.o1;
import kkf.x;
import kkf.y0;
import kkf.z3;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lkf.r;
import nof.i;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f162388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f162389h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final akf.c f162390j;
    public final r k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k7 f162391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n7 f162392m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f162393n;
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kkf.e f162394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i7 f162395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i9 f162396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o1 f162397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z3 f162398t;
    public final y0 u;
    public final i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final clf.a f162399w;

    public b(h0 commonDataSource, jt0.b commonHeaderProvider, o userCommentMenuOptionProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, r apmOtpBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, d0 confirmationBlockProvider, x chargesBlockProvider, kkf.e analyticsBlockProvider, i7 statisticsBlockProvider, i9 userCommentBlockProvider, o1 getHelpBlockProvider, z3 originalTransactionBlockProvider, y0 equivalentBlockProvider, i transactionStatisticsProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(apmOtpBlockProvider, "apmOtpBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(originalTransactionBlockProvider, "originalTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f162388g = userCommentMenuOptionProvider;
        this.f162389h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f162390j = adjustForAnalyticsActionProvider;
        this.k = apmOtpBlockProvider;
        this.f162391l = statusBlockProvider;
        this.f162392m = statusWithNoticeBlockProvider;
        this.f162393n = confirmationBlockProvider;
        this.o = chargesBlockProvider;
        this.f162394p = analyticsBlockProvider;
        this.f162395q = statisticsBlockProvider;
        this.f162396r = userCommentBlockProvider;
        this.f162397s = getHelpBlockProvider;
        this.f162398t = originalTransactionBlockProvider;
        this.u = equivalentBlockProvider;
        this.v = transactionStatisticsProvider;
        this.f162399w = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f162399w.Z2();
        p pVarA = this.u.a();
        p pVarA2 = this.f162392m.a(false);
        p pVarB3 = this.f162398t.b3(true);
        p pVarA3 = this.f162391l.a();
        r rVar = this.k;
        lkf.o oVar = new lkf.o(rVar.f196406a.c(), rVar, 1);
        lh9.b bVar = new lh9.b(25);
        f0 f0Var = f0.f322471a;
        return h(v.k(pVarZ2, pVarA, pVarA2, pVarB3, k0.a(pVarA3, new p(oVar, bVar, f0Var, "ApmOtpPaymentBlock"), this.f162393n.a()), new p(new lkf.o(rVar.f196406a.c(), rVar, 0), new lh9.b(24), f0Var, "ApmOtpGoodsBlock"), this.o.d(new kjk.x(7)), k0.a(this.f162394p.Z2(), this.f162395q.Z2(this.v)), this.f162396r.a(), this.f162397s.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(u.c(this.f162390j.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f162388g.a(new ah1.p(29)), this.f162389h.a(), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
