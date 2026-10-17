package hmf;

import akf.t0;
import akf.u0;
import kkf.b5;
import kkf.d1;
import kkf.f9;
import kkf.i9;
import kkf.k1;
import kkf.k7;
import kkf.n7;
import kkf.o1;
import kkf.y0;
import kkf.y1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f153873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.o f153874h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final akf.c f153875j;
    public final u0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kkf.e f153876l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kkf.d0 f153877m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d1 f153878n;
    public final k1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o1 f153879p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y1 f153880q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i9 f153881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k7 f153882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n7 f153883t;
    public final f9 u;
    public final y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kkf.x f153884w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final clf.a f153885x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b5 f153886y;

    public o(klf.h0 commonDataSource, jt0.b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, u0 managePlanActionProvider, kkf.e analyticsBlockProvider, kkf.d0 confirmationBlockProvider, d1 feeWaiverBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, y1 initiatorBlockProvider, i9 userCommentBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, f9 upgradeEntryPointBlockProvider, y0 equivalentBlockProvider, kkf.x chargesBlockProvider, clf.a slotBlockProvider, b5 refundsBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(managePlanActionProvider, "managePlanActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(feeWaiverBlockProvider, "feeWaiverBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(upgradeEntryPointBlockProvider, "upgradeEntryPointBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(refundsBlockProvider, "refundsBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153873g = adjustForAnalyticsMenuOptionProvider;
        this.f153874h = userCommentMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f153875j = adjustForAnalyticsActionProvider;
        this.k = managePlanActionProvider;
        this.f153876l = analyticsBlockProvider;
        this.f153877m = confirmationBlockProvider;
        this.f153878n = feeWaiverBlockProvider;
        this.o = fromBlockProvider;
        this.f153879p = getHelpBlockProvider;
        this.f153880q = initiatorBlockProvider;
        this.f153881r = userCommentBlockProvider;
        this.f153882s = statusBlockProvider;
        this.f153883t = statusWithNoticeBlockProvider;
        this.u = upgradeEntryPointBlockProvider;
        this.v = equivalentBlockProvider;
        this.f153884w = chargesBlockProvider;
        this.f153885x = slotBlockProvider;
        this.f153886y = refundsBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.f153885x.Z2();
        cmf.p pVarZ22 = this.f153886y.Z2();
        cmf.p pVarZ23 = this.f153878n.Z2(n.f);
        cmf.p pVarA = this.v.a();
        cmf.p pVarA2 = this.f153883t.a(false);
        mga.x xVar = new mga.x(this.e.f185494j);
        f9 f9Var = this.u;
        return h(zhm.v.k(pVarZ2, pVarZ22, pVarZ23, pVarA, pVarA2, f9Var.c3(xVar), k0.a(this.f153882s.a(), this.f153880q.a(), this.o.Z2(), this.f153877m.a()), this.f153884w.d(new hmc.a(6)), this.f153876l.Z2(), this.f153881r.a(), f9Var.c3(mga.c.f205203a), this.f153879p.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        cmf.f fVarZ2 = this.f153875j.Z2();
        u0 u0Var = this.k;
        return f(zhm.v.k(fVarZ2, new cmf.f(ta6.a.h(u0Var.f5906l.h(new aik.d(16)), rd0.e.b(m70.a.g(u0Var.f5908n.q(), null, new ah1.p(15), 1)), new a35.d(u0Var.f5907m.a(), 14), new t0(4, 4, u0.class, u0Var, "buildAction", "buildAction(Ljava/lang/String;Lcom/revolut/feature/pricingplans/models/PricingPlan;Z)Ljava/util/List;")), zhm.u.c(u0Var), "ManagePlan")));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153874h.a(new ah1.p(29)), this.f153873g.a(), this.i.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
