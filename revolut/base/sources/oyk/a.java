package oyk;

import android.content.Context;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingExtendedHoursOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.extended_hours.ExtendedHoursBackendFlowContract$Configuration;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TradingExtendedHoursOnboardingFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        TradingExtendedHoursOnboardingFeatureConfig config = (TradingExtendedHoursOnboardingFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        xyk.c.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(xyk.a.f309747b, new ExtendedHoursBackendFlowContract$Configuration(config.f104104b, config.f104103a), null, null, 0, null, null, null, null, false, 1020));
    }
}
