package agh;

import ael.d0;
import ael.r0;
import afa.q;
import cli.y;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.jvm.internal.Intrinsics;
import vkm.t0;
import vrl.s;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends oki.h implements e {
    public final d0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ybl.k f4835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f4836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nfh.c f4837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f4838s;

    public j(d0 stocksInteractor, ybl.k tradingAccountsInteractor, s orderLimitsByPortfolioInteractor, nfh.c inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolioInteractor, "orderLimitsByPortfolioInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = stocksInteractor;
        this.f4835p = tradingAccountsInteractor;
        this.f4836q = orderLimitsByPortfolioInteractor;
        this.f4837r = inputData;
        this.f4838s = mra.d.b(this, new d(null, null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, nim.a.v(rd0.e.b(this.o.a(this.f4837r.f214907a, false)), new h(1)), null, null, new i(this, null, 1), 3);
        l.a1(this, ybl.k.h(this.f4835p, TradingAccountType.Gia.f105270a, null, 6), null, null, new i(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, boh.f.e(a.a.k(new t0(this.f4838s.B(new r0(29)), 1), new h(0)), new q(this, 2)), null, new i(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f4838s;
    }
}
