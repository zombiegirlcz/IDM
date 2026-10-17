package nah;

import android.content.Context;
import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.feature.wealth.ui.api.navigation.DisclosuresDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof DisclosuresFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        DisclosuresDestination.Configuration configuration;
        DisclosuresFeatureConfig config = (DisclosuresFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.f(config, DisclosuresFeatureConfig.CommoditiesDisclosuresFeatureConfig.f95194a)) {
            configuration = DisclosuresDestination.Configuration.Commodities.f95903a;
        } else if (Intrinsics.f(config, DisclosuresFeatureConfig.CryptoDisclosuresFeatureConfig.f95195a)) {
            configuration = DisclosuresDestination.Configuration.Crypto.f95904a;
        } else if (Intrinsics.f(config, DisclosuresFeatureConfig.TradingDisclosuresFeatureConfig.f95197a)) {
            configuration = DisclosuresDestination.Configuration.Trading.f95906a;
        } else {
            if (!Intrinsics.f(config, DisclosuresFeatureConfig.InvestCombinedDisclosuresFeatureConfig.f95196a)) {
                throw new NoWhenBranchMatchedException();
            }
            configuration = DisclosuresDestination.Configuration.InvestCombined.f95905a;
        }
        navigator.c(u0.f(new DisclosuresDestination(configuration)));
    }
}
