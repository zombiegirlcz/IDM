package rsd;

import ael.t;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te0.w;
import tzg.m;
import wsg.n;
import ybl.l;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements frd.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f257064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f257065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.f f257066c;
    public final m d;
    public final t e;
    public final ybl.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f257067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final mu5.f f257068h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xoj.a f257069j;
    public final y1b.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ang.f f257070l;

    public k(n walletInteractor, ybl.d portfolioInteractor, zjh.f roboPortfolioInteractor, m wealthAccountsInteractor, t portfolioBalanceInteractor, ybl.k tradingAccountsInteractor, l tradingConfigInteractor, mu5.f cryptoInvestmentsInteractor, d investNetWorthProductsMapper, xoj.a featuresInteractor, y1b.a cfdInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInteractor, "roboPortfolioInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(investNetWorthProductsMapper, "investNetWorthProductsMapper");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(cfdInteractor, "cfdInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f257064a = walletInteractor;
        this.f257065b = portfolioInteractor;
        this.f257066c = roboPortfolioInteractor;
        this.d = wealthAccountsInteractor;
        this.e = portfolioBalanceInteractor;
        this.f = tradingAccountsInteractor;
        this.f257067g = tradingConfigInteractor;
        this.f257068h = cryptoInvestmentsInteractor;
        this.i = investNetWorthProductsMapper;
        this.f257069j = featuresInteractor;
        this.k = cfdInteractor;
        this.f257070l = userInteractor;
    }

    @Override // frd.k
    public final Flow b() {
        yoj.c cVar = yoj.c.WEALTH_TRADING;
        cpj.b bVar = (cpj.b) this.f257069j;
        r map = w.m(bVar.l(cVar), bVar.l(yoj.c.COMMODITIES), bVar.l(yoj.c.ROBO)).map(new rpi.d(new rpi.e(25), 22));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return frd.k.a(this, rd0.e.b(map), new r1a.a(this, 27));
    }
}
