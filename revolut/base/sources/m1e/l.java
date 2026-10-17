package m1e;

import cli.y;
import com.revolut.feature.stock_lending.impl.ui.v2.screen.product.StockLendingProductScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import x8h.n0;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends oki.h implements g {

    @NotNull
    public static final i Companion = new i();
    public final StockLendingProductScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.k f201485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n0 f201486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f201487r;

    public l(m stateMapper, StockLendingProductScreenContract$InputData inputData, ybl.k tradingAccountsInteractor, n0 stockLendingInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(stockLendingInteractor, "stockLendingInteractor");
        this.o = inputData;
        this.f201485p = tradingAccountsInteractor;
        this.f201486q = stockLendingInteractor;
        this.f201487r = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    public static final Object I2(l lVar, gim.i iVar) {
        return q.x(mo3.a.g(zi0.c.w(nim.a.v(ybl.k.h(lVar.f201485p, lVar.o.f88415a, null, 6), new m11.h(lVar, 1))), null, new lxi.g(10), 1), iVar);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.a1(this, rd0.e.b(nim.a.w(this.f201486q.a(this.o.f88415a), new m18.n(3))), null, null, new lph.h(this, null, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f201487r;
    }
}
