package kmf;

import ael.l0;
import amf.i;
import amf.l;
import amf.o;
import cmf.p;
import go.g;
import hmf.k0;
import kjk.x;
import kkf.i9;
import kkf.k7;
import kkf.m1;
import kkf.o1;
import kkf.o2;
import kkf.t5;
import kkf.y0;
import kkf.z4;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ns9.h;
import okf.k;
import vkm.q;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends hmf.a {
    public final h0 e;
    public final kge.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f185809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f185810h;
    public final amf.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final amf.c f185811j;
    public final m1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k7 f185812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final okf.b f185813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t5 f185814n;
    public final kkf.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9 f185815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z4 f185816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f185817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o1 f185818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0 f185819t;
    public final o2 u;
    public final clf.a v;

    public b(h0 commonDataSource, kge.d creditCardInstalmentHeaderProvider, o userCommentMenuOptionProvider, l uploadReceiptMenuOptionProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, m1 geoBlockProvider, k7 statusBlockProvider, okf.b creditCardBlockProvider, t5 revPointsBlockProvider, kkf.e analyticsBlockProvider, i9 userCommentBlockProvider, z4 receiptsBlockProvider, k creditCardInstalmentBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(creditCardInstalmentHeaderProvider, "creditCardInstalmentHeaderProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(uploadReceiptMenuOptionProvider, "uploadReceiptMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(geoBlockProvider, "geoBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardBlockProvider, "creditCardBlockProvider");
        Intrinsics.checkNotNullParameter(revPointsBlockProvider, "revPointsBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(receiptsBlockProvider, "receiptsBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentBlockProvider, "creditCardInstalmentBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = creditCardInstalmentHeaderProvider;
        this.f185809g = userCommentMenuOptionProvider;
        this.f185810h = uploadReceiptMenuOptionProvider;
        this.i = adjustForAnalyticsMenuOptionProvider;
        this.f185811j = hideTransactionMenuOptionProvider;
        this.k = geoBlockProvider;
        this.f185812l = statusBlockProvider;
        this.f185813m = creditCardBlockProvider;
        this.f185814n = revPointsBlockProvider;
        this.o = analyticsBlockProvider;
        this.f185815p = userCommentBlockProvider;
        this.f185816q = receiptsBlockProvider;
        this.f185817r = creditCardInstalmentBlockProvider;
        this.f185818s = getHelpBlockProvider;
        this.f185819t = equivalentBlockProvider;
        this.u = limitExceededBlockProvider;
        this.v = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.v.Z2();
        p pVarZ22 = this.u.Z2();
        p pVarZ23 = this.k.Z2();
        p pVarA = this.f185819t.a();
        p pVarA2 = this.f185812l.a();
        okf.b bVar = this.f185813m;
        return h(v.k(pVarZ2, pVarZ22, pVarZ23, pVarA, k0.a(pVarA2, new p(new t38.e(bVar.f226002a.d(), 24, q.Q(bVar.f226004c.a(), new h(null, bVar, 28)), new l0(3, bVar, okf.b.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/cards/models/revolutcard/RevolutCard;)Ljava/util/List;", 4, 27)), new ok7.b(2), f0.f322471a, "CreditCard"), this.f185816q.a(new x(19))), this.f185814n.Z2(), this.o.Z2(), k0.a(this.f185815p.a()), this.f185817r.Z2(), this.f185818s.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.s();
    }

    @Override // hmf.b0
    public final Flow d() {
        return new g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f185809g.a(new ah1.p(29)), this.f185810h.a(new i(0)), this.i.a(), this.f185811j.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
