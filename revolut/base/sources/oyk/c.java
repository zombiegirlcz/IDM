package oyk;

import android.content.Context;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.start.StartContract$Configuration;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TradingOnboardingFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        TradingOnboardingFeatureConfig config = (TradingOnboardingFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        y0l.e.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(y0l.a.f310222b, new StartContract$Configuration(config, false), null, null, 0, null, null, null, null, false, 1020));
    }
}
