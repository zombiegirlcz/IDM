package myk;

import com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchRemediationNextPartAction;
import com.revolut.retail.feature.trading_onboarding.impl.actions.OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static final mm.a a(TradingOnboardingFeatureConfig tradingOnboardingFeatureConfig, OnboardingPart onboardingPart, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(tradingOnboardingFeatureConfig, "<this>");
        if (tradingOnboardingFeatureConfig instanceof TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig) {
            return new OnboardingActionsContract$LaunchTradingAccountNextOnboardingAction(onboardingPart, (TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig) tradingOnboardingFeatureConfig, z, z3);
        }
        if (tradingOnboardingFeatureConfig instanceof TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig) {
            return new OnboardingActionsContract$LaunchRemediationNextPartAction(onboardingPart, (TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig) tradingOnboardingFeatureConfig, z, z3);
        }
        throw new NoWhenBranchMatchedException();
    }
}
