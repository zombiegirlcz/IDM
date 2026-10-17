package v5j;

import aii.u;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import com.revolut.retail.feature.commodity.asset_details.impl.navigation.CommodityPositionDetailsDestination;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreen;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.asset_details.CommodityAssetDetailsScreenContract$InputData;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsController;
import com.revolut.retail.feature.commodity.asset_details.impl.ui.screens.position_details.CommodityPositionDetailsControllerContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return q5j.a.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CommodityAssetDetailsDestination) {
            CommodityAssetDetailsDestination commodityAssetDetailsDestination = (CommodityAssetDetailsDestination) destination;
            return new CommodityAssetDetailsScreen(new CommodityAssetDetailsScreenContract$InputData(commodityAssetDetailsDestination.f99775a, commodityAssetDetailsDestination.f99776b));
        }
        if (destination instanceof CommodityPositionDetailsDestination) {
            return new CommodityPositionDetailsController(new CommodityPositionDetailsControllerContract$InputData(((CommodityPositionDetailsDestination) destination).getF99778b().getF99779a()));
        }
        return null;
    }
}
