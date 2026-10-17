package kw5;

import aii.u;
import com.revolut.feature.cryptocommodity_invest.api.CryptoCommodityInvestApi$Toggles;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoCommodityInvestBizFeatureConfig;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlow;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.CryptoCommodityBuyCollectionFlowContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.CryptoDiscoverAllScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsController;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsControllerContract$InputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collections_list.CryptoCollectionsController;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return CryptoCommodityInvestApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoCommodityInvestBizFeatureConfig.CryptoCommodityBuyCollectionFlowNavigationDestination) {
            CryptoCommodityInvestBizFeatureConfig.CryptoCommodityBuyCollectionFlowNavigationDestination cryptoCommodityBuyCollectionFlowNavigationDestination = (CryptoCommodityInvestBizFeatureConfig.CryptoCommodityBuyCollectionFlowNavigationDestination) destination;
            return new CryptoCommodityBuyCollectionFlow(new CryptoCommodityBuyCollectionFlowContract$InputData(cryptoCommodityBuyCollectionFlowNavigationDestination.f71507c, cryptoCommodityBuyCollectionFlowNavigationDestination.f71505a, cryptoCommodityBuyCollectionFlowNavigationDestination.f71506b, cryptoCommodityBuyCollectionFlowNavigationDestination.d));
        }
        if (destination instanceof CryptoCommodityInvestBizFeatureConfig.CryptoCommodityCollectionsOverviewNavigationDestination) {
            return new CryptoCollectionsController();
        }
        if (destination instanceof CryptoCommodityInvestBizFeatureConfig.CryptoCommodityCollectionsDetailsNavigationDestination) {
            return new CryptoCollectionDetailsController(new CryptoCollectionDetailsControllerContract$InputData(((CryptoCommodityInvestBizFeatureConfig.CryptoCommodityCollectionsDetailsNavigationDestination) destination).getF71508a()));
        }
        if (destination instanceof CryptoCommodityInvestBizFeatureConfig.DiscoverAllKompotNavigationDestination) {
            return new CryptoDiscoverAllScreen();
        }
        return null;
    }
}
