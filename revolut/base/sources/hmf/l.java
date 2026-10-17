package hmf;

import akf.x0;
import kkf.a1;
import kkf.f9;
import kkf.i9;
import kkf.k1;
import kkf.k7;
import kkf.l8;
import kkf.n7;
import kkf.o1;
import kkf.o2;
import kkf.s8;
import kkf.y0;
import kkf.y1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final olf.c f153809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.o f153810h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kkf.d0 f153811j;
    public final a1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final skf.f f153812l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k1 f153813m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o1 f153814n;
    public final y1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i9 f153815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k7 f153816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n7 f153817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l8 f153818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f9 f153819t;
    public final okf.k u;
    public final y0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o2 f153820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final clf.a f153821x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s8 f153822y;
    public final x0 z;

    public l(klf.h0 commonDataSource, jt0.b commonHeaderProvider, olf.c arrowTitleHeaderDecorator, amf.o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, kkf.d0 confirmationBlockProvider, a1 exchangeGeneralBlockProvider, skf.f exchangeAutomationBlockProvider, k1 fromBlockProvider, o1 getHelpBlockProvider, y1 initiatorBlockProvider, i9 userCommentBlockProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, l8 toAccountBlockProvider, f9 upgradeEntryPointBlockProvider, okf.k creditCardInstalmentBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider, s8 transferReasonCatalogueBlockProvider, x0 moveAgainActionsProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(arrowTitleHeaderDecorator, "arrowTitleHeaderDecorator");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(exchangeGeneralBlockProvider, "exchangeGeneralBlockProvider");
        Intrinsics.checkNotNullParameter(exchangeAutomationBlockProvider, "exchangeAutomationBlockProvider");
        Intrinsics.checkNotNullParameter(fromBlockProvider, "fromBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(initiatorBlockProvider, "initiatorBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(toAccountBlockProvider, "toAccountBlockProvider");
        Intrinsics.checkNotNullParameter(upgradeEntryPointBlockProvider, "upgradeEntryPointBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentBlockProvider, "creditCardInstalmentBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(transferReasonCatalogueBlockProvider, "transferReasonCatalogueBlockProvider");
        Intrinsics.checkNotNullParameter(moveAgainActionsProvider, "moveAgainActionsProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153809g = arrowTitleHeaderDecorator;
        this.f153810h = userCommentMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f153811j = confirmationBlockProvider;
        this.k = exchangeGeneralBlockProvider;
        this.f153812l = exchangeAutomationBlockProvider;
        this.f153813m = fromBlockProvider;
        this.f153814n = getHelpBlockProvider;
        this.o = initiatorBlockProvider;
        this.f153815p = userCommentBlockProvider;
        this.f153816q = statusBlockProvider;
        this.f153817r = statusWithNoticeBlockProvider;
        this.f153818s = toAccountBlockProvider;
        this.f153819t = upgradeEntryPointBlockProvider;
        this.u = creditCardInstalmentBlockProvider;
        this.v = equivalentBlockProvider;
        this.f153820w = limitExceededBlockProvider;
        this.f153821x = slotBlockProvider;
        this.f153822y = transferReasonCatalogueBlockProvider;
        this.z = moveAgainActionsProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.f153821x.Z2();
        cmf.p pVarZ22 = this.f153820w.Z2();
        cmf.p pVarA = this.v.a();
        cmf.p pVarB3 = this.f153822y.b3();
        cmf.p pVarA2 = this.f153817r.a(false);
        cmf.p pVarA3 = k0.a(this.f153816q.a(), this.o.a(), this.f153813m.Z2(), this.f153818s.Z2(), this.f153811j.a());
        skf.f fVar = this.f153812l;
        cmf.p pVar = new cmf.p(new t38.e((SharedFlow) fVar.f263942l.f185624h.getValue(), 24, fVar.f263943m.a(), new pfk.q(fVar, null, 29)), new sdl.y(19), zhm.u.c(fVar), "ExchangeAutomation");
        a1 a1Var = this.k;
        return h(zhm.v.k(pVarZ2, pVarZ22, pVarA, pVarB3, pVarA2, pVarA3, pVar, new cmf.p(new t38.e(a1Var.f184585a.d(), 24, (Flow) a1Var.f184586b.d.getValue(), new ael.l0(3, a1Var, a1.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/shared/feature/market_data/models/domain/models/ChargeBreakdown;)Ljava/util/List;", 4, 11)), new chc.c0(23), zhm.v.k(a1Var.f, a1Var.d, a1Var.e), "General"), this.f153815p.a(), this.f153819t.c3(mga.p.f205213a), this.u.Z2(), this.f153814n.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f153809g.c(this.f.A0(false));
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.z.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.v.k(this.f153810h.a(new ah1.p(29)), this.i.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
