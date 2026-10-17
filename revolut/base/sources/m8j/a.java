package m8j;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.retail.feature.crypto.asset_details.api.CryptoAssetDetailsApi$Toggles;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.asset_details.CryptoAssetDetailsScreenContract$InputData;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.holding.CryptoHoldingScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof u7j.b) {
            u7j.b bVar = (u7j.b) descriptor;
            return bVar.a(new CryptoHoldingScreen(bVar.b()));
        }
        if (!(descriptor instanceof u7j.a)) {
            return null;
        }
        u7j.a aVar = (u7j.a) descriptor;
        return aVar.a(new CryptoEarningScreen(aVar.b()));
    }

    @Override // nte.a
    public final List e() {
        return CryptoAssetDetailsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoAssetDetailsFeatureConfig.AssetDetailsDestination) {
            CryptoAssetDetailsFeatureConfig.AssetDetailsDestination assetDetailsDestination = (CryptoAssetDetailsFeatureConfig.AssetDetailsDestination) destination;
            return new CryptoAssetDetailsScreen(new CryptoAssetDetailsScreenContract$InputData(assetDetailsDestination.f99935b, assetDetailsDestination.d));
        }
        if (destination instanceof CryptoAssetDetailsFeatureConfig.EarnDetailsDestination) {
            return new CryptoEarningScreen(((CryptoAssetDetailsFeatureConfig.EarnDetailsDestination) destination).getF99940b());
        }
        return null;
    }
}
