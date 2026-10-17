package hmf;

import kkf.i9;
import kkf.k7;
import kkf.n7;
import kkf.o1;
import kkf.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f153777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.o f153778h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final akf.c f153779j;
    public final kkf.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kkf.n f153780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kkf.d0 f153781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o1 f153782n;
    public final i9 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k7 f153783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n7 f153784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f153785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final clf.a f153786s;

    public i(klf.h0 commonDataSource, jt0.b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, kkf.e analyticsBlockProvider, kkf.n cashbackBlockProvider, kkf.d0 confirmationBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(cashbackBlockProvider, "cashbackBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153777g = adjustForAnalyticsMenuOptionProvider;
        this.f153778h = userCommentMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f153779j = adjustForAnalyticsActionProvider;
        this.k = analyticsBlockProvider;
        this.f153780l = cashbackBlockProvider;
        this.f153781m = confirmationBlockProvider;
        this.f153782n = getHelpBlockProvider;
        this.o = userCommentBlockProvider;
        this.f153783p = statusBlockProvider;
        this.f153784q = statusWithNoticeBlockProvider;
        this.f153785r = equivalentBlockProvider;
        this.f153786s = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        return h(zhm.v.k(this.f153786s.Z2(), this.f153785r.a(), this.f153784q.a(false), k0.a(this.f153783p.a(), this.f153781m.a()), this.k.Z2(), this.f153780l.a(), this.o.a(), this.f153782n.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(true);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.f153779j.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153778h.a(new ah1.p(29)), this.f153777g.a(), this.i.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
