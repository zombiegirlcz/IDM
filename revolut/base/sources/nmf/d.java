package nmf;

import ah1.p;
import amf.o;
import hmf.k0;
import kkf.d0;
import kkf.d1;
import kkf.e;
import kkf.i7;
import kkf.i9;
import kkf.k7;
import kkf.l8;
import kkf.n7;
import kkf.o1;
import kkf.x;
import kkf.y0;
import kkf.z3;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nof.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f217344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f217345h;
    public final o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.c f217346j;
    public final akf.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f217347l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f217348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f217349n;
    public final d1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o1 f217350p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i9 f217351q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z3 f217352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i7 f217353s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k7 f217354t;
    public final n7 u;
    public final l8 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0 f217355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final clf.a f217356x;

    public d(h0 commonDataSource, jt0.b commonHeaderProvider, i transactionStatisticsProvider, amf.a adjustForAnalyticsMenuOptionProvider, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, e analyticsBlockProvider, x chargesBlockProvider, d0 confirmationBlockProvider, d1 feeWaiverBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, z3 originalTransactionBlockProvider, i7 statisticsBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, l8 toAccountBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(feeWaiverBlockProvider, "feeWaiverBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(originalTransactionBlockProvider, "originalTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(statisticsBlockProvider, "statisticsBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f217344g = transactionStatisticsProvider;
        this.f217345h = adjustForAnalyticsMenuOptionProvider;
        this.i = userCommentMenuOptionProvider;
        this.f217346j = hideTransactionMenuOptionProvider;
        this.k = adjustForAnalyticsActionProvider;
        this.f217347l = analyticsBlockProvider;
        this.f217348m = chargesBlockProvider;
        this.f217349n = confirmationBlockProvider;
        this.o = feeWaiverBlockProvider;
        this.f217350p = getHelpBlockProvider;
        this.f217351q = userCommentBlockProvider;
        this.f217352r = originalTransactionBlockProvider;
        this.f217353s = statisticsBlockProvider;
        this.f217354t = statusBlockProvider;
        this.u = statusWithNoticeBlockProvider;
        this.v = toAccountBlockProvider;
        this.f217355w = equivalentBlockProvider;
        this.f217356x = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        return h(v.k(this.f217356x.Z2(), this.o.Z2(c.f), this.f217352r.b3(true), this.f217355w.a(), this.u.a(false), k0.a(this.f217354t.a(), this.v.Z2(), this.f217349n.a()), k0.a(this.f217347l.Z2(), this.f217353s.Z2(this.f217344g)), this.f217348m.d(new kjk.x(7)), this.f217351q.a(), this.f217350p.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(u.c(this.k.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.i.a(new p(29)), this.f217345h.a(), this.f217346j.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
