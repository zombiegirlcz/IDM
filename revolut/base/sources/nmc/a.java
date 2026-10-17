package nmc;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f217261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f217262b;

    public a(d roboPortfolioUiMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f217261a = roboPortfolioUiMapper;
        this.f217262b = featureToggleInteractor;
    }

    public static MoneyClause c(dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8);
    }

    public final TextLocalisedClause a(RoboPortfolioInfo portfolioInfo, dj0.d amount, TradingProductCode tradingProductCode) {
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new TextLocalisedClause((Intrinsics.f(tradingProductCode, TradingProductCode.RoboGB.f105333a) && ((jte.d) this.f217262b).c(WealthUiApi$Toggles.RoboStrategies.f95863c)) ? R$string.wealth_strategies_portfolio_add_money_success_title_format : R$string.wealth_robo_portfolio_add_money_success_title_format, v.k(c(amount), this.f217261a.c(portfolioInfo)), null, 12);
    }

    public final TextLocalisedClause b(RoboPortfolioInfo portfolioInfo, dj0.d amount, TradingProductCode tradingProductCode) {
        Intrinsics.checkNotNullParameter(portfolioInfo, "portfolioInfo");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new TextLocalisedClause((Intrinsics.f(tradingProductCode, TradingProductCode.RoboGB.f105333a) && ((jte.d) this.f217262b).c(WealthUiApi$Toggles.RoboStrategies.f95863c)) ? R$string.wealth_strategies_recurring_transfer_set_up_success : R$string.wealth_robo_recurring_transfer_set_up_success, v.k(c(amount), this.f217261a.c(portfolioInfo)), null, 12);
    }
}
