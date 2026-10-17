package hmf;

import kkf.h6;
import kkf.i9;
import kkf.k1;
import kkf.k7;
import kkf.k9;
import kkf.l8;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.s7;
import kkf.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends a {
    public final kkf.q A;
    public final clf.a B;
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final olf.c f153836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final akf.c f153837h;
    public final akf.l0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.a f153838j;
    public final amf.o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final amf.c f153839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kkf.e f153840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kkf.d0 f153841n;
    public final o1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h6 f153842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i9 f153843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k7 f153844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n7 f153845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final okf.k f153846t;
    public final k1 u;
    public final l8 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0 f153847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o2 f153848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s7 f153849y;
    public final k9 z;

    public m(klf.h0 commonDataSource, jt0.b commonHeaderProvider, olf.c arrowTitleHeaderDecorator, akf.c adjustForAnalyticsActionProvider, akf.l0 createInstalmentActionProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, kkf.e analyticsBlockProvider, kkf.d0 confirmationBlockProvider, o1 getHelpBlockProvider, h6 securityDelayBlockProvider, i9 userCommentBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, okf.k creditCardInstalmentBlockProvider, k1 fromBlockProvider, l8 toAccountBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, s7 suspiciousTransactionBlockProvider, k9 warrantBlockProvider, kkf.q chargebackBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(arrowTitleHeaderDecorator, "arrowTitleHeaderDecorator");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(createInstalmentActionProvider, "createInstalmentActionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(securityDelayBlockProvider, "securityDelayBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentBlockProvider, "creditCardInstalmentBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBlockProvider, "suspiciousTransactionBlockProvider");
        Intrinsics.checkNotNullParameter(warrantBlockProvider, "warrantBlockProvider");
        Intrinsics.checkNotNullParameter(chargebackBlockProvider, "chargebackBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153836g = arrowTitleHeaderDecorator;
        this.f153837h = adjustForAnalyticsActionProvider;
        this.i = createInstalmentActionProvider;
        this.f153838j = adjustForAnalyticsMenuOptionProvider;
        this.k = userCommentMenuOptionProvider;
        this.f153839l = hideTransactionMenuOptionProvider;
        this.f153840m = analyticsBlockProvider;
        this.f153841n = confirmationBlockProvider;
        this.o = getHelpBlockProvider;
        this.f153842p = securityDelayBlockProvider;
        this.f153843q = userCommentBlockProvider;
        this.f153844r = statusBlockProvider;
        this.f153845s = statusWithNoticeBlockProvider;
        this.f153846t = creditCardInstalmentBlockProvider;
        this.u = fromBlockProvider;
        this.v = toAccountBlockProvider;
        this.f153847w = equivalentBlockProvider;
        this.f153848x = limitExceededBlockProvider;
        this.f153849y = suspiciousTransactionBlockProvider;
        this.z = warrantBlockProvider;
        this.A = chargebackBlockProvider;
        this.B = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p[] elements = {this.B.Z2(), this.A.Z2(), this.f153842p.c3(), this.z.Z2(), this.f153849y.Z2(), this.f153848x.Z2(), this.f153847w.a(), this.f153845s.a(false), k0.a(this.f153844r.a(), this.u.Z2(), this.v.Z2(), this.f153841n.a()), this.f153840m.Z2(), this.f153843q.a(), this.f153846t.Z2(), this.o.a()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return h(kotlin.collections.d.L(elements));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f153836g.c(this.f.A0(true));
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.v.k(this.f153837h.Z2(), this.i.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.k.a(new ah1.p(29)), this.f153838j.a(), this.f153839l.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
