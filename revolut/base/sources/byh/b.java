package byh;

import android.content.Context;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsDestination;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.feature_crypto_order_details.api.navigation.TPSLOrderDetailsFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import hx7.q;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return (config instanceof TPSLOrderDetailsFeatureConfig) && q.P(((TPSLOrderDetailsFeatureConfig) config).f96663a);
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        TPSLOrderDetailsFeatureConfig config = (TPSLOrderDetailsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        navigator.c(u0.f(new CryptoOrderDetailsDestination(new CryptoOrderDetailsInputData.TpslInputData(config.f96663a))));
    }
}
