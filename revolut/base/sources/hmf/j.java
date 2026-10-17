package hmf;

import kkf.i9;
import kkf.k7;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.o f153788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.a f153789h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final akf.c f153790j;
    public final kkf.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kkf.z f153791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kkf.d0 f153792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o1 f153793n;
    public final i9 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k7 f153794p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n7 f153795q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f153796r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o2 f153797s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final clf.a f153798t;

    public j(klf.h0 commonDataSource, jt0.b commonHeaderProvider, amf.o userCommentMenuOptionProvider, amf.a adjustForAnalyticsMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, akf.c adjustForAnalyticsActionProvider, kkf.e analyticsBlockProvider, kkf.z charityConversionBlockProvider, kkf.d0 confirmationBlockProvider, o1 getHelpBlockProvider, i9 userCommentBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsMenuOptionProvider, "adjustForAnalyticsMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(adjustForAnalyticsActionProvider, "adjustForAnalyticsActionProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(charityConversionBlockProvider, "charityConversionBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153788g = userCommentMenuOptionProvider;
        this.f153789h = adjustForAnalyticsMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f153790j = adjustForAnalyticsActionProvider;
        this.k = analyticsBlockProvider;
        this.f153791l = charityConversionBlockProvider;
        this.f153792m = confirmationBlockProvider;
        this.f153793n = getHelpBlockProvider;
        this.o = userCommentBlockProvider;
        this.f153794p = statusBlockProvider;
        this.f153795q = statusWithNoticeBlockProvider;
        this.f153796r = equivalentBlockProvider;
        this.f153797s = limitExceededBlockProvider;
        this.f153798t = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.f153798t.Z2();
        cmf.p pVarZ22 = this.f153797s.Z2();
        cmf.p pVarA = this.f153796r.a();
        cmf.p pVarA2 = this.f153795q.a(false);
        cmf.p pVarA3 = k0.a(this.f153794p.a(), this.f153792m.a());
        kkf.z zVar = this.f153791l;
        klf.h0 h0Var = zVar.f185043a;
        return h(zhm.v.k(pVarZ2, pVarZ22, pVarA, pVarA2, pVarA3, new cmf.p(new t38.e(h0Var.d(), 24, vkm.q.q(new iyg.b0(h0Var.c(), 23)), new ael.l0(3, zVar, kkf.z.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetailsCharity;)Ljava/util/List;", 4, 7)), new ka9.b(27), zhm.f0.f322471a, "CharityConversion"), this.k.Z2(), this.o.a(), this.f153793n.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.f153790j.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153788g.a(new ah1.p(29)), this.f153789h.a(), this.i.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
