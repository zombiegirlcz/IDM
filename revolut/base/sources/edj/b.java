package edj;

import android.content.Context;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import cp5.d;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CryptoCommodityDetailsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) throws Throwable {
        NaviCommand featureCommand;
        CryptoCommodityDetailsFeatureConfig config = (CryptoCommodityDetailsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        xi0.b bVar = config.f100136a;
        if (d.z(bVar)) {
            featureCommand = new FeatureCommand(new CryptoAssetDetailsFeatureConfig.AssetDetails(config.f100136a, config.f, 2));
        } else if (d.y(bVar)) {
            if (config.d) {
                y.B("reuseInstance is not supported for CommodityAssetDetails");
            }
            featureCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CommodityAssetDetailsDestination(bVar, null), false, (Integer) null, 0, 61));
        } else {
            e.n(new IllegalArgumentException(p.a.p("This currency ", bVar.f306286a, " is not supported by CryptoCommodityDetailsFeatureLauncher")));
            featureCommand = DummyCommand.f98635a;
        }
        navigator.c(featureCommand);
    }
}
