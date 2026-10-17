package bnh;

import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f17199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tul.b f17200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qmc.h f17201c;
    public final qmc.d d;
    public final gte.a e;
    public final ybl.k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ktg.a f17202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final toh.d f17203h;
    public final x8h.k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zhh.a f17204j;

    public n(tzg.m wealthAccountsInteractor, tul.b portfolioMetricsInteractor, qmc.h roboPortfolioInfoProvider, qmc.d roboPortfolioBalanceProvider, gte.a featureToggleInteractor, ybl.k tradingAccountsInteractor, ktg.a accountClosureInteractor, toh.d performanceParametersInteractor, x8h.k displayCurrencyInteractor, zhh.a roboAccountActionsProvider) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(portfolioMetricsInteractor, "portfolioMetricsInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(roboPortfolioBalanceProvider, "roboPortfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(accountClosureInteractor, "accountClosureInteractor");
        Intrinsics.checkNotNullParameter(performanceParametersInteractor, "performanceParametersInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(roboAccountActionsProvider, "roboAccountActionsProvider");
        this.f17199a = wealthAccountsInteractor;
        this.f17200b = portfolioMetricsInteractor;
        this.f17201c = roboPortfolioInfoProvider;
        this.d = roboPortfolioBalanceProvider;
        this.e = featureToggleInteractor;
        this.f = tradingAccountsInteractor;
        this.f17202g = accountClosureInteractor;
        this.f17203h = performanceParametersInteractor;
        this.i = displayCurrencyInteractor;
        this.f17204j = roboAccountActionsProvider;
    }

    public final Flow a(List requestedStates) {
        Intrinsics.checkNotNullParameter(requestedStates, "requestedStates");
        Continuation continuation = null;
        if (!((jte.d) this.e).c(WealthUiApi$Toggles.RoboStrategies.f95863c)) {
            return new go.g(null, 2);
        }
        return vkm.q.Q(tzg.m.d(this.f17199a, WealthAccountType.ROBO, null, 6), new a32.b(continuation, requestedStates, this, 14));
    }
}
