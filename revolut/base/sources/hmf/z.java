package hmf;

import kkf.d1;
import kkf.i7;
import kkf.i9;
import kkf.k7;
import kkf.l8;
import kkf.n7;
import kkf.o1;
import kkf.y0;
import kkf.z3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nof.i f153968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f153969h;
    public final amf.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.c f153970j;
    public final akf.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kkf.e f153971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kkf.d0 f153972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d1 f153973n;
    public final o1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9 f153974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z3 f153975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i7 f153976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k7 f153977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n7 f153978t;
    public final l8 u;
    public final y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final clf.a f153979w;

    public z(klf.h0 commonDataSource, jt0.b commonHeaderProvider, nof.i transactionStatisticsProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, kkf.e analyticsBlockProvider, kkf.d0 confirmationBlockProvider, d1 feeWaiverBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, z3 originalTransactionBlockProvider, i7 statisticsBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, l8 toAccountBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(transactionStatisticsProvider, "transactionStatisticsProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
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
        this.f153968g = transactionStatisticsProvider;
        this.f153969h = adjustForAnalyticsMenuOptionProvider;
        this.i = userCommentMenuOptionProvider;
        this.f153970j = hideTransactionMenuOptionProvider;
        this.k = adjustForAnalyticsActionProvider;
        this.f153971l = analyticsBlockProvider;
        this.f153972m = confirmationBlockProvider;
        this.f153973n = feeWaiverBlockProvider;
        this.o = getHelpBlockProvider;
        this.f153974p = userCommentBlockProvider;
        this.f153975q = originalTransactionBlockProvider;
        this.f153976r = statisticsBlockProvider;
        this.f153977s = statusBlockProvider;
        this.f153978t = statusWithNoticeBlockProvider;
        this.u = toAccountBlockProvider;
        this.v = equivalentBlockProvider;
        this.f153979w = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        return h(zhm.v.k(this.f153979w.Z2(), this.f153973n.Z2(y.f), this.f153975q.b3(true), this.v.a(), this.f153978t.a(false), k0.a(this.f153977s.a(), this.u.Z2(), this.f153972m.a()), k0.a(this.f153971l.Z2(), this.f153976r.Z2(this.f153968g)), this.f153974p.a(), this.o.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.k.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.i.a(new ah1.p(29)), this.f153969h.a(), this.f153970j.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
