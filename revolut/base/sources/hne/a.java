package hne;

import android.content.Context;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.tax_residency.api.navigation.CollectTaxResidencyFeatureConfig;
import com.revolut.feature.tax_residency.api.navigation.EditTaxResidencyFeatureConfig;
import com.revolut.feature.tax_residency.api.navigation.TaxResidencyFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TaxResidencyFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        FeatureCommand featureCommand;
        TaxResidencyFeatureConfig config = (TaxResidencyFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof TaxResidencyFeatureConfig.TaxResidencyProfile) {
            featureCommand = new FeatureCommand(new EditTaxResidencyFeatureConfig(1, 2035));
        } else if (config instanceof TaxResidencyFeatureConfig.TaxResidencyTrading) {
            TaxResidencyFeatureConfig.TaxResidencyTrading taxResidencyTrading = (TaxResidencyFeatureConfig.TaxResidencyTrading) config;
            featureCommand = new FeatureCommand(new CollectTaxResidencyFeatureConfig(taxResidencyTrading.f89987b, taxResidencyTrading.f89986a, taxResidencyTrading.f89988c, 1));
        } else if (config instanceof TaxResidencyFeatureConfig.TaxResidencyTinChange) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.f137506s;
            featureCommand = new FeatureCommand(new CollectTaxResidencyFeatureConfig(com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var), new FinishCommand(-1, null, null, 6), false, 65));
        } else {
            if (!(config instanceof TaxResidencyFeatureConfig.TaxResidencyMissingInfo)) {
                throw new NoWhenBranchMatchedException();
            }
            featureCommand = new FeatureCommand(new EditTaxResidencyFeatureConfig(1, 2035));
        }
        navigator.c(featureCommand);
    }
}
