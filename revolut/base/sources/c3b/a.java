package c3b;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams;
import com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements a2b.b {
    public final TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig b(NaviCommand targetCommand) {
        Intrinsics.checkNotNullParameter(targetCommand, "targetCommand");
        TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType withTradingAccountType = new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType(TradingAccountType.Margin.f105271a);
        EndPromptParams endPromptParams = new EndPromptParams(false, EndPromptType.TRADING);
        k9 k9Var = k9.MarginTrading;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig(targetCommand, withTradingAccountType, null, endPromptParams, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
    }
}
