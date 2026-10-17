package upd;

import ael.t;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f281978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qmc.h f281979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tzg.m f281980c;
    public final t d;
    public final wsg.n e;

    public n(xoj.a featuresInteractor, qmc.h roboPortfolioInfoProvider, tzg.m wealthAccountsInteractor, t portfolioBalanceInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f281978a = featuresInteractor;
        this.f281979b = roboPortfolioInfoProvider;
        this.f281980c = wealthAccountsInteractor;
        this.d = portfolioBalanceInteractor;
        this.e = walletInteractor;
    }

    public final vkm.d a(RoboPortfolioInfo roboPortfolioInfo, xi0.b bVar) {
        return rd0.e.b(t.d(this.d, roboPortfolioInfo.f95703c, false, null, bVar, false, null, 54));
    }
}
