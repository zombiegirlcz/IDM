package vrl;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tx0.z4;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f291623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.k f291624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.d f291625c;
    public final ael.d0 d;
    public final s e;

    public e(ybl.b instrumentTickerInteractor, ybl.k tradingAccountsInteractor, ybl.d portfolioInteractor, ael.d0 stocksInteractor, s orderLimitsByPortfolioInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(orderLimitsByPortfolioInteractor, "orderLimitsByPortfolioInteractor");
        this.f291623a = instrumentTickerInteractor;
        this.f291624b = tradingAccountsInteractor;
        this.f291625c = portfolioInteractor;
        this.d = stocksInteractor;
        this.e = orderLimitsByPortfolioInteractor;
    }

    public final Flow c(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        return xam.a.h(new d(this, null, 0), vkm.q.q(nim.a.v(rd0.e.b(((ael.k) this.f291623a).f(securityRef)), new vq0.g(15))));
    }

    public final Flow d(UUID tradingAccountId, String securityRef, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        w4l.h loadingStrategy2 = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
        return xam.a.h(new z4(this, securityRef, loadingStrategy, null, 6), vkm.q.q(nim.a.v(e(tradingAccountId, loadingStrategy2), new vq0.g(14))));
    }

    public final Flow e(UUID tradingAccountId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(nim.a.v(ybl.k.k(this.f291624b, loadingStrategy, null, cfl.k.f23744a, 2), new be7.l(28, tradingAccountId)));
    }
}
