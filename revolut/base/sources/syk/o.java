package syk;

import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements b {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.d f266695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.k f266696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.i f266697c;
    public final zjh.f d;
    public final Map e;

    public o(ybl.d portfolioInteractor, ybl.k tradingAccountsInteractor, ybl.i tradingAccountProductGroupAvailabilityInteractor, zjh.f roboPortfolioInteractor, Map productsProviders) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountProductGroupAvailabilityInteractor, "tradingAccountProductGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(roboPortfolioInteractor, "roboPortfolioInteractor");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        this.f266695a = portfolioInteractor;
        this.f266696b = tradingAccountsInteractor;
        this.f266697c = tradingAccountProductGroupAvailabilityInteractor;
        this.d = roboPortfolioInteractor;
        this.e = productsProviders;
    }

    public static TradingAccountType a(TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig) {
        if (!(tradingOnboardingFeatureConfig instanceof TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig)) {
            if (tradingOnboardingFeatureConfig instanceof TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        TradingOnboardingFeatureConfig.TradingAccountOrType tradingAccountOrType = ((TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig) tradingOnboardingFeatureConfig).f104106b;
        if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount) {
            return ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount) tradingAccountOrType).f104113a.W();
        }
        if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts) {
            return ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts) tradingAccountOrType).f104114a.W();
        }
        if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType) {
            return ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType) tradingAccountOrType).f104116a;
        }
        if (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts) {
            return ((TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts) tradingAccountOrType).f104117a;
        }
        if ((tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts) || (tradingAccountOrType instanceof TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
