package hmf;

import akf.s1;
import kkf.i9;
import kkf.k1;
import kkf.k7;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final akf.c f153957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s1 f153958h;
    public final amf.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.c f153959j;
    public final kkf.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kkf.d0 f153960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kkf.x f153961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kkf.m0 f153962n;
    public final k1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o1 f153963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i9 f153964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k7 f153965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n7 f153966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0 f153967t;
    public final o2 u;
    public final clf.a v;

    public x(klf.h0 commonDataSource, jt0.b commonHeaderProvider, akf.c adjustForAnalyticsActionProvider, s1 splitBillActionProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, kkf.e analyticsBlockProvider, kkf.d0 confirmationBlockProvider, kkf.x chargesBlockProvider, kkf.m0 detailsFieldsBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(detailsFieldsBlockProvider, "detailsFieldsBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153957g = adjustForAnalyticsActionProvider;
        this.f153958h = splitBillActionProvider;
        this.i = adjustForAnalyticsMenuOptionProvider;
        this.f153959j = hideTransactionMenuOptionProvider;
        this.k = analyticsBlockProvider;
        this.f153960l = confirmationBlockProvider;
        this.f153961m = chargesBlockProvider;
        this.f153962n = detailsFieldsBlockProvider;
        this.o = fromBlockProvider;
        this.f153963p = getHelpBlockProvider;
        this.f153964q = userCommentBlockProvider;
        this.f153965r = statusBlockProvider;
        this.f153966s = statusWithNoticeBlockProvider;
        this.f153967t = equivalentBlockProvider;
        this.u = limitExceededBlockProvider;
        this.v = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.v.Z2();
        cmf.p pVarZ22 = this.u.Z2();
        cmf.p pVarA = this.f153967t.a();
        cmf.p pVarA2 = this.f153966s.a(false);
        cmf.p pVarA3 = k0.a(this.f153965r.a(), this.o.Z2(), this.f153960l.a());
        kkf.m0 m0Var = this.f153962n;
        cmf.p[] elements = {pVarZ2, pVarZ22, pVarA, pVarA2, pVarA3, new cmf.p(new kh4.f(m0Var.f184818a.c(), m0Var, 5), new chc.c0(23), zhm.f0.f322471a, "DetailsFields"), this.f153961m.d(new kjk.x(7)), this.k.Z2(), this.f153964q.a(), this.f153963p.a()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return h(kotlin.collections.d.L(elements));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.v.k(this.f153957g.Z2(), this.f153958h.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.i.a(), this.f153959j.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
