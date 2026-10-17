package g4f;

import android.content.Context;
import com.revolut.feature.trading.api.declaration.BaseDiscoveryFeatureConfig;
import com.revolut.feature.trading.api.declaration.CollectionFeatureConfig;
import com.revolut.feature.trading.api.navigation.CollectionDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements uri.a {
    public a(l4f.a collectionsNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(collectionsNaviCommandProvider, "collectionsNaviCommandProvider");
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof BaseDiscoveryFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        BaseDiscoveryFeatureConfig config = (BaseDiscoveryFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof CollectionFeatureConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        String collection = ((CollectionFeatureConfig) config).f91207a;
        Intrinsics.checkNotNullParameter(collection, "collection");
        navigator.c(u0.f(new CollectionDestination(collection)));
    }
}
