package qmc;

import ael.t;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import qi3.i;
import x8h.k;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f247796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f247797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f247798c;

    public d(t portfolioBalanceInteractor, k displayCurrencyInteractor, h portfolioInfoProvider) {
        Intrinsics.checkNotNullParameter(portfolioBalanceInteractor, "portfolioBalanceInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        this.f247796a = portfolioBalanceInteractor;
        this.f247797b = displayCurrencyInteractor;
        this.f247798c = portfolioInfoProvider;
    }

    public final Flow a(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return boh.f.e(glc.a.a(this.f247798c, portfolioId), new i(1, this, d.class, "observePortfolioBalanceInBaseCurrency", "observePortfolioBalanceInBaseCurrency(Lcom/revolut/feature/wealth/models/robo/RoboPortfolioInfo;)Lkotlinx/coroutines/flow/Flow;", 0, 6));
    }

    public final Flow b(String portfolioId) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        return boh.f.e(glc.a.a(this.f247798c, portfolioId), new i(1, this, d.class, "observePortfolioBalanceInDisplayCurrency", "observePortfolioBalanceInDisplayCurrency(Lcom/revolut/feature/wealth/models/robo/RoboPortfolioInfo;)Lkotlinx/coroutines/flow/Flow;", 0, 7));
    }

    public final Flow c(ArrayList portfolioIds) {
        Intrinsics.checkNotNullParameter(portfolioIds, "portfolioIds");
        return boh.f.e(glc.a.b(this.f247798c, portfolioIds), new i(1, this, d.class, "observePortfolioBalancesInDisplayCurrency", "observePortfolioBalancesInDisplayCurrency(Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", 0, 8));
    }
}
