package woc;

import ael.t;
import kotlin.jvm.internal.Intrinsics;
import wnc.x;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f298927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qmc.d f298928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zjh.f f298929c;
    public final emc.e d;
    public final uvl.c e;
    public final toh.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f298930g;

    public r(tzg.m wealthAccountsInteractor, qmc.d roboPortfolioBalanceProvider, zjh.f roboPortfolioInteractor, emc.e templatesInteractor, uvl.c recurringOrdersMonthlyContributionProvider, toh.d simulatedRecurringDepositProvider, t portfolioBalanceInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioBalanceProvider, "roboPortfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(roboPortfolioInteractor, "roboPortfolioInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(recurringOrdersMonthlyContributionProvider, "recurringOrdersMonthlyContributionProvider");
        Intrinsics.checkNotNullParameter(simulatedRecurringDepositProvider, "simulatedRecurringDepositProvider");
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        this.f298927a = wealthAccountsInteractor;
        this.f298928b = roboPortfolioBalanceProvider;
        this.f298929c = roboPortfolioInteractor;
        this.d = templatesInteractor;
        this.e = recurringOrdersMonthlyContributionProvider;
        this.f = simulatedRecurringDepositProvider;
        this.f298930g = portfolioBalanceInteractor;
    }

    public final jhi.b a(boolean z, xoc.b currencyMode) {
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        return mo3.a.g(nim.a.v(xam.a.h(new q(this, currencyMode, z, null), nim.a.v(nim.a.v(tzg.m.c(this.f298927a, null, null, 3), new x(10)), new x(11))), new x(12)), null, null, 3);
    }
}
