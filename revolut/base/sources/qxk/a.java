package qxk;

import c1l.e;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.jvm.internal.Intrinsics;
import ufm.b;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    static b a(e eVar, NaviCommand targetCommandIfOnboardingComplete, NaviCommand returnCommandAfterOnboarding, AnalyticsProduct.Retail analyticsProduct) {
        eVar.getClass();
        Intrinsics.checkNotNullParameter(targetCommandIfOnboardingComplete, "targetCommandIfOnboardingComplete");
        Intrinsics.checkNotNullParameter(returnCommandAfterOnboarding, "returnCommandAfterOnboarding");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return eVar.b(targetCommandIfOnboardingComplete, new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(returnCommandAfterOnboarding, new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType(TradingAccountType.Gia.f105270a), new EndPromptParams(true, EndPromptType.TRADING), analyticsProduct), null);
    }
}
