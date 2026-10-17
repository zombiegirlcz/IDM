package edj;

import aii.u;
import com.revolut.retail.feature.cryptocommoditydetails.api.CryptoCommodityDetailsApi$Toggles;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow.PriceTargetsDetailsFlow;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow.PriceTargetsDetailsFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return CryptoCommodityDetailsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails)) {
            return null;
        }
        CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails cryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails = (CryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails) destination;
        return new PriceTargetsDetailsFlow(new PriceTargetsDetailsFlowContract$InputData(cryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails.f100139a, cryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails.f100140b, cryptoCommodityDetailsKompotFeatureConfig$CommoditiesPriceTargetsDetails.f100141c));
    }
}
