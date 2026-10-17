package hmf;

import kkf.a8;
import kkf.k7;
import kkf.m5;
import kkf.n7;
import kkf.o1;
import kkf.x5;
import kkf.y0;
import kkf.y1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 extends a {
    public final klf.h0 e;
    public final olf.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f153850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f153851h;
    public final akf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kkf.e f153852j;
    public final kkf.d0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o1 f153853l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y1 f153854m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k7 f153855n;
    public final n7 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a8 f153856p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0 f153857q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final clf.a f153858r;

    public m0(klf.h0 commonDataSource, olf.n taxHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, kkf.e analyticsBlockProvider, kkf.d0 confirmationBlockProvider, o1 getHelpBlockProvider, y1 initiatorBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, a8 taxableLoanBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(taxHeaderProvider, "taxHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(taxableLoanBlockProvider, "taxableLoanBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = taxHeaderProvider;
        this.f153850g = adjustForAnalyticsMenuOptionProvider;
        this.f153851h = hideTransactionMenuOptionProvider;
        this.i = adjustForAnalyticsActionProvider;
        this.f153852j = analyticsBlockProvider;
        this.k = confirmationBlockProvider;
        this.f153853l = getHelpBlockProvider;
        this.f153854m = initiatorBlockProvider;
        this.f153855n = statusBlockProvider;
        this.o = statusWithNoticeBlockProvider;
        this.f153856p = taxableLoanBlockProvider;
        this.f153857q = equivalentBlockProvider;
        this.f153858r = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.f153858r.Z2();
        cmf.p pVarA = this.f153857q.a();
        cmf.p pVarA2 = this.o.a(false);
        cmf.p pVarA3 = k0.a(this.f153855n.a(), this.f153854m.a(), this.k.a());
        a8 a8Var = this.f153856p;
        return h(zhm.v.k(pVarZ2, pVarA, pVarA2, pVarA3, new cmf.p(vkm.q.Q(vkm.q.q(yh5.b.d(new x5(a8Var.f184602l.c(), 8), new x5(a8Var.f184603m.a(), 9))), new m5(null, a8Var, 5)), new chc.c0(23), zhm.u.c(a8Var), "TaxableLoan"), this.f153852j.Z2(), this.f153853l.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        olf.n nVar = this.f;
        return new t38.e(nVar.f226397a.A0(false), 24, nVar.f226398b.d(), new olf.m(nVar, null));
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.i.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153850g.a(), this.f153851h.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
