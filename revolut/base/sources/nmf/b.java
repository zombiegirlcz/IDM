package nmf;

import amf.o;
import chc.c0;
import cmf.p;
import go.g;
import hmf.k0;
import kh4.f;
import kkf.d0;
import kkf.e;
import kkf.e5;
import kkf.i9;
import kkf.k7;
import kkf.l8;
import kkf.m6;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.u3;
import kkf.x;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f217333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f217334h;
    public final x i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f217335j;
    public final o1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u3 f217336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i9 f217337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n7 f217338n;
    public final e5 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m6 f217339p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k7 f217340q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0 f217341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f217342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l8 f217343t;
    public final o2 u;
    public final clf.a v;

    public b(h0 commonDataSource, jt0.b commonHeaderProvider, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, x chargesBlockProvider, d0 confirmationBlockProvider, o1 getHelpBlockProvider, u3 merchantPaymentCardBlockProvider, i9 userCommentBlockProvider, n7 statusWithNoticeBlockProvider, e5 relatedOrderBlockProvider, m6 settlementBannersBlockProvider, k7 statusBlockProvider, y0 equivalentBlockProvider, e analyticsBlockProvider, l8 toAccountBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(chargesBlockProvider, "chargesBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(merchantPaymentCardBlockProvider, "merchantPaymentCardBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(relatedOrderBlockProvider, "relatedOrderBlockProvider");
        Intrinsics.checkNotNullParameter(settlementBannersBlockProvider, "settlementBannersBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(analyticsBlockProvider, "analyticsBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f217333g = userCommentMenuOptionProvider;
        this.f217334h = hideTransactionMenuOptionProvider;
        this.i = chargesBlockProvider;
        this.f217335j = confirmationBlockProvider;
        this.k = getHelpBlockProvider;
        this.f217336l = merchantPaymentCardBlockProvider;
        this.f217337m = userCommentBlockProvider;
        this.f217338n = statusWithNoticeBlockProvider;
        this.o = relatedOrderBlockProvider;
        this.f217339p = settlementBannersBlockProvider;
        this.f217340q = statusBlockProvider;
        this.f217341r = equivalentBlockProvider;
        this.f217342s = analyticsBlockProvider;
        this.f217343t = toAccountBlockProvider;
        this.u = limitExceededBlockProvider;
        this.v = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarZ2 = this.v.Z2();
        p pVarZ22 = this.u.Z2();
        p pVarA = this.f217341r.a();
        p pVarA2 = this.f217338n.a(false);
        p pVarA3 = k0.a(this.f217340q.a(), this.f217343t.Z2(), this.f217335j.a());
        m6 m6Var = this.f217339p;
        p pVar = new p(ta6.a.h(m6Var.f184828l.d(), (SharedFlow) m6Var.f184829m.e.getValue(), m6Var.f184830n.a(), new b9k.a(4, m6Var, m6.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/freelancer/common/models/FreelancerSettlementSettings;Lcom/revolut/feature/transactions/impl/ui/kompot/details/data_source/JuniorDataSource$YouthWalletOwner;)Ljava/util/List;", 4, 8)), new c0(23), u.c(m6Var), "SettlementBanners");
        p pVarD = this.i.d(new kjk.x(7));
        u3 u3Var = this.f217336l;
        p pVar2 = new p(new f(u3Var.f184964a.h(new kjk.x(13)), u3Var, 21), new c0(23), f0.f322471a, "MerchantPaymentCard");
        p pVarZ23 = this.f217342s.Z2();
        p pVarA4 = this.f217337m.a();
        e5 e5Var = this.o;
        return h(v.k(pVarZ2, pVarZ22, pVarA, pVarA2, pVarA3, pVar, pVarD, pVar2, pVarZ23, pVarA4, new p(new f((SharedFlow) e5Var.f184658n.f.getValue(), e5Var, 25), new c0(23), u.c(e5Var), "RelatedOrder"), this.k.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return new g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f217333g.a(new ah1.p(29)), this.f217334h.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
