package omf;

import akf.x0;
import cmf.p;
import hmf.k0;
import kkf.d0;
import kkf.k7;
import kkf.n7;
import kkf.o1;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import qkf.r;
import t38.e;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends hmf.a {
    public final h0 e;
    public final jt0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final amf.c f226821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k7 f226822h;
    public final n7 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d0 f226823j;
    public final ukf.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o1 f226824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x0 f226825m;

    public a(h0 commonDataSource, jt0.b commonHeaderProvider, amf.c hideTransactionMenuOptionProvider, k7 statusBlockProvider, n7 statusWithNoticeBlockProvider, d0 confirmationBlockProvider, ukf.b futuresCollateralBlockProvider, o1 getHelpBlockProvider, x0 moveAgainActionsProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(statusBlockProvider, "statusBlockProvider");
        Intrinsics.checkNotNullParameter(statusWithNoticeBlockProvider, "statusWithNoticeBlockProvider");
        Intrinsics.checkNotNullParameter(confirmationBlockProvider, "confirmationBlockProvider");
        Intrinsics.checkNotNullParameter(futuresCollateralBlockProvider, "futuresCollateralBlockProvider");
        Intrinsics.checkNotNullParameter(getHelpBlockProvider, "getHelpBlockProvider");
        Intrinsics.checkNotNullParameter(moveAgainActionsProvider, "moveAgainActionsProvider");
        this.e = commonDataSource;
        this.f = commonHeaderProvider;
        this.f226821g = hideTransactionMenuOptionProvider;
        this.f226822h = statusBlockProvider;
        this.i = statusWithNoticeBlockProvider;
        this.f226823j = confirmationBlockProvider;
        this.k = futuresCollateralBlockProvider;
        this.f226824l = getHelpBlockProvider;
        this.f226825m = moveAgainActionsProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        p pVarA = k0.a(this.f226822h.a(), this.i.a(false), this.f226823j.a());
        ukf.b bVar = this.k;
        return h(v.k(pVarA, new p(new e(bVar.f280733a.d(), 24, (Flow) bVar.f280734b.d.getValue(), new r(3, bVar, ukf.b.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/shared/feature/market_data/models/domain/models/ChargeBreakdown;)Ljava/util/List;", 4, 2)), new ujb.v(11), f0.f322471a, "FuturesCollateral"), this.f226824l.a()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f.A0(false);
    }

    @Override // hmf.b0
    public final Flow d() {
        return f(u.c(this.f226825m.Z2()));
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(u.c(this.f226821g.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
