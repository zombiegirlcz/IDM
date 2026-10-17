package hmf;

import kkf.i9;
import kkf.o1;
import kkf.o6;
import kkf.s0;
import kkf.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f153800g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.o f153801h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final akf.c f153802j;
    public final o6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kkf.d0 f153803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s0 f153804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kkf.e f153805n;
    public final o1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9 f153806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0 f153807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final clf.a f153808r;

    public k(klf.h0 commonDataSource, jt0.b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, o6 simpleStatusBlockProvider, kkf.d0 confirmationBlockProvider, s0 doxgetyRewardAmountBlockProvider, kkf.e analyticsBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(simpleStatusBlockProvider, "simpleStatusBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(doxgetyRewardAmountBlockProvider, "doxgetyRewardAmountBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153800g = adjustForAnalyticsMenuOptionProvider;
        this.f153801h = userCommentMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f153802j = adjustForAnalyticsActionProvider;
        this.k = simpleStatusBlockProvider;
        this.f153803l = confirmationBlockProvider;
        this.f153804m = doxgetyRewardAmountBlockProvider;
        this.f153805n = analyticsBlockProvider;
        this.o = getHelpBlockProvider;
        this.f153806p = userCommentBlockProvider;
        this.f153807q = equivalentBlockProvider;
        this.f153808r = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.f153808r.Z2();
        cmf.p pVarA = this.f153807q.a();
        cmf.p pVarA2 = k0.a(this.k.a(), this.f153803l.a());
        s0 s0Var = this.f153804m;
        return h(zhm.v.k(pVarZ2, pVarA, pVarA2, new cmf.p(new kh4.f(s0Var.f184924l.d(), s0Var, 7), new kkf.i0(2), zhm.f0.f322471a, "DoxgetyRewardAmount"), this.f153805n.Z2(), this.f153806p.a(), this.o.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.f153802j.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153801h.a(new ah1.p(29)), this.f153800g.a(), this.i.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
