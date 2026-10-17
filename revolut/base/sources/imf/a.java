package imf;

import akf.s1;
import cmf.p;
import hmf.k0;
import kkf.d0;
import kkf.e7;
import kkf.i9;
import kkf.k1;
import kkf.k7;
import kkf.m1;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.x;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import lkf.o;
import lkf.r;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f162375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f162376h;
    public final s1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f162377j;
    public final m1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k7 f162378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n7 f162379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k1 f162380n;
    public final d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f162381p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e7 f162382q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e84.e f162383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kkf.e f162384s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i9 f162385t;
    public final o1 u;
    public final y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o2 f162386w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final clf.a f162387x;

    public a(h0 commonDataSource, jt0.b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, s1 splitBillActionProvider, r apmOtpBlockProvider, m1 geoBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, k1 fromBlockProvider, d0 confirmationBlockProvider, x chargesBlockProvider, e7 splitBillBlockProvider, e84.e groupBillBlockProvider, kkf.e analyticsBlockProvider, i9 userCommentBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(splitBillActionProvider, "splitBillActionProvider");
        Intrinsics.checkNotNullParameter(apmOtpBlockProvider, "apmOtpBlockProvider");
        Intrinsics.checkNotNullParameter(geoBlockProvider, "geoBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(splitBillBlockProvider, "splitBillBlockProvider");
        Intrinsics.checkNotNullParameter(groupBillBlockProvider, "groupBillBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f162375g = adjustForAnalyticsMenuOptionProvider;
        this.f162376h = hideTransactionMenuOptionProvider;
        this.i = splitBillActionProvider;
        this.f162377j = apmOtpBlockProvider;
        this.k = geoBlockProvider;
        this.f162378l = statusBlockProvider;
        this.f162379m = statusWithNoticeBlockProvider;
        this.f162380n = fromBlockProvider;
        this.o = confirmationBlockProvider;
        this.f162381p = chargesBlockProvider;
        this.f162382q = splitBillBlockProvider;
        this.f162383r = groupBillBlockProvider;
        this.f162384s = analyticsBlockProvider;
        this.f162385t = userCommentBlockProvider;
        this.u = getHelpBlockProvider;
        this.v = equivalentBlockProvider;
        this.f162386w = limitExceededBlockProvider;
        this.f162387x = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.f162387x.Z2();
        p pVarZ22 = this.f162386w.Z2();
        p pVarA = this.v.a();
        p pVarZ23 = this.k.Z2();
        p pVarA2 = k0.a(this.f162378l.a(), this.f162379m.a(false));
        r rVar = this.f162377j;
        o oVar = new o(rVar.f196406a.c(), rVar, 1);
        lh9.b bVar = new lh9.b(25);
        f0 f0Var = f0.f322471a;
        return h(v.k(pVarZ2, pVarZ22, pVarA, pVarZ23, pVarA2, k0.a(new p(oVar, bVar, f0Var, "ApmOtpPaymentBlock"), this.f162380n.Z2(), this.o.a()), new p(new o(rVar.f196406a.c(), rVar, 0), new lh9.b(24), f0Var, "ApmOtpGoodsBlock"), this.f162381p.d(new kjk.x(7)), this.f162382q.b3(), this.f162383r.c(false), this.f162384s.Z2(), this.f162385t.a(), this.u.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(u.c(this.i.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f162375g.a(), this.f162376h.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
