package hmf;

import akf.x0;
import kkf.b6;
import kkf.k7;
import kkf.o1;
import kkf.o2;
import kkf.y0;
import kkf.z5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends a {
    public final klf.h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final olf.c f153717g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final amf.c f153718h;
    public final k7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kkf.d0 f153719j;
    public final b6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o1 f153720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0 f153721m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o2 f153722n;
    public final clf.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x0 f153723p;

    public a0(klf.h0 commonDataSource, jt0.b commonHeaderProvider, olf.c arrowTitleHeaderDecorator, amf.c hideTransactionMenuOptionProvider, k7 statusBlockProvider, kkf.d0 confirmationBlockProvider, b6 revXTransferPaymentBreakdownBlockProvider, o1 getHelpBlockProvider, y0 equivalentBlockProvider, o2 limitExceededBlockProvider, clf.a slotBlockProvider, x0 moveAgainActionsProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(arrowTitleHeaderDecorator, "arrowTitleHeaderDecorator");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(revXTransferPaymentBreakdownBlockProvider, "revXTransferPaymentBreakdownBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(limitExceededBlockProvider, "limitExceededBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        Intrinsics.checkNotNullParameter(moveAgainActionsProvider, "moveAgainActionsProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f153717g = arrowTitleHeaderDecorator;
        this.f153718h = hideTransactionMenuOptionProvider;
        this.i = statusBlockProvider;
        this.f153719j = confirmationBlockProvider;
        this.k = revXTransferPaymentBreakdownBlockProvider;
        this.f153720l = getHelpBlockProvider;
        this.f153721m = equivalentBlockProvider;
        this.f153722n = limitExceededBlockProvider;
        this.o = slotBlockProvider;
        this.f153723p = moveAgainActionsProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        cmf.p pVarZ2 = this.o.Z2();
        cmf.p pVarZ22 = this.f153722n.Z2();
        cmf.p pVarA = this.f153721m.a();
        cmf.p pVarA2 = k0.a(this.i.a(), this.f153719j.a());
        b6 b6Var = this.k;
        return h(zhm.v.k(pVarZ2, pVarZ22, pVarA, pVarA2, new cmf.p(new t38.e(b6Var.f184612a.d(), 24, (Flow) b6Var.f184613b.d.getValue(), new ael.l0(3, b6Var, b6.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/shared/feature/market_data/models/domain/models/ChargeBreakdown;)Ljava/util/List;", 4, 21)), new z5(0), zhm.f0.f322471a, "RevXTransferPaymentBreakdown"), this.f153720l.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f153717g.c(this.f.A0(false));
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(zhm.u.c(this.f153723p.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(zhm.u.c(this.f153718h.a()));
    }

    @Override // hmf.a
    public final klf.h0 i() {
        return this.e;
    }
}
