package nmf;

import amf.o;
import cmf.p;
import hmf.k0;
import kkf.d0;
import kkf.e;
import kkf.i9;
import kkf.k7;
import kkf.n;
import kkf.n7;
import kkf.o1;
import kkf.x;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.a f217322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f217323h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final akf.c f217324j;
    public final e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f217325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x f217326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0 f217327n;
    public final o1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9 f217328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k7 f217329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n7 f217330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y0 f217331s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final clf.a f217332t;

    public a(h0 commonDataSource, jt0.b commonHeaderProvider, amf.a adjustForAnalyticsMenuOptionProvider, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, e analyticsBlockProvider, n cashbackBlockProvider, x chargesBlockProvider, d0 confirmationBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(cashbackBlockProvider, "cashbackBlockProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f217322g = adjustForAnalyticsMenuOptionProvider;
        this.f217323h = userCommentMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f217324j = adjustForAnalyticsActionProvider;
        this.k = analyticsBlockProvider;
        this.f217325l = cashbackBlockProvider;
        this.f217326m = chargesBlockProvider;
        this.f217327n = confirmationBlockProvider;
        this.o = getHelpBlockProvider;
        this.f217328p = userCommentBlockProvider;
        this.f217329q = statusBlockProvider;
        this.f217330r = statusWithNoticeBlockProvider;
        this.f217331s = equivalentBlockProvider;
        this.f217332t = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p[] elements = {this.f217332t.Z2(), this.f217331s.a(), this.f217330r.a(false), k0.a(this.f217329q.a(), this.f217327n.a()), this.k.Z2(), this.f217325l.a(), this.f217326m.d(new kjk.x(7)), this.f217328p.a(), this.o.a()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return h(kotlin.collections.d.L(elements));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(true);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(u.c(this.f217324j.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f217323h.a(new ah1.p(29)), this.f217322g.a(), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
