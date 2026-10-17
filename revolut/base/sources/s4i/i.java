package s4i;

import com.revolut.feature.global_markets.api.navigation.GlobalMarketsFeatureConfig$IndexDetailsDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qpk.b f259892a;

    public i(qpk.b rateDetailsFeatureConfigProvider, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(rateDetailsFeatureConfigProvider, "rateDetailsFeatureConfigProvider");
                this.f259892a = rateDetailsFeatureConfigProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(rateDetailsFeatureConfigProvider, "rateDetailsFeatureConfigProvider");
                this.f259892a = rateDetailsFeatureConfigProvider;
                break;
        }
    }

    public ParcelableDestination a(vel.f asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        if (asset instanceof vel.d) {
            return new CommodityAssetDetailsDestination(((vel.d) asset).f288352a, null);
        }
        if (asset instanceof vel.e) {
            return new AssetDetailsDestination(asset.a(), null, false, null, null, null, 62);
        }
        if (asset instanceof vel.c) {
            return new GlobalMarketsFeatureConfig$IndexDetailsDestination(asset.a(), asset.c());
        }
        if (!(asset instanceof vel.b)) {
            throw new NoWhenBranchMatchedException();
        }
        vel.a aVar = ((vel.b) asset).f288347a;
        return u0.c(dpk.a.a(this.f259892a, aVar.f288344a, aVar.f288345b, false, false));
    }
}
