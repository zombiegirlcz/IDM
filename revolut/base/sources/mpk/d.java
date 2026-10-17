package mpk;

import aii.p;
import aii.u;
import com.revolut.retail.feature.ratedetails.api.navigation.RateDetailsKompotFeatureConfig;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreen;
import com.revolut.retail.feature.ratedetails.impl.ui.RateDetailsScreenContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof RateDetailsKompotFeatureConfig.RateDetailsDestination)) {
            return null;
        }
        RateDetailsKompotFeatureConfig.RateDetailsDestination rateDetailsDestination = (RateDetailsKompotFeatureConfig.RateDetailsDestination) destination;
        return new RateDetailsScreen(new RateDetailsScreenContract$InputData(rateDetailsDestination.getF103714a(), rateDetailsDestination.getF103715b(), rateDetailsDestination.getF103716c(), rateDetailsDestination.getD(), rateDetailsDestination.getE(), rateDetailsDestination.getF(), rateDetailsDestination.getF103717g(), rateDetailsDestination.getF103718h()));
    }
}
