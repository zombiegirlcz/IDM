package y0e;

import android.content.Context;
import com.revolut.feature.stock_lending.api.navigation.StockLendingConfig;
import com.revolut.feature.stock_lending.impl.ui.onboarding.StockLendingOnboardingContract$Configuration;
import com.revolut.feature.stock_lending.impl.ui.onboarding.StockLendingOnboardingDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof StockLendingConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        StockLendingConfig config = (StockLendingConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof StockLendingConfig.Onboarding)) {
            throw new NoWhenBranchMatchedException();
        }
        navigator.c(u0.f(new StockLendingOnboardingDestination(new StockLendingOnboardingContract$Configuration(((StockLendingConfig.Onboarding) config).f88395a))));
    }
}
