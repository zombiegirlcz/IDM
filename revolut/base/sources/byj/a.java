package byj;

import aii.u;
import com.revolut.retail.feature.junior_upgrade.api.navigation.KompotJuniorUpgradeFeatureConfig;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.flow.JuniorUpgradeFlow;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.flow.JuniorUpgradeFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof KompotJuniorUpgradeFeatureConfig.JuniorUpgradeDestination)) {
            return null;
        }
        KompotJuniorUpgradeFeatureConfig.JuniorUpgradeDestination juniorUpgradeDestination = (KompotJuniorUpgradeFeatureConfig.JuniorUpgradeDestination) destination;
        return new JuniorUpgradeFlow(new JuniorUpgradeFlowContract$InputData(juniorUpgradeDestination.getF101747a(), juniorUpgradeDestination.getF101748b(), juniorUpgradeDestination.getF101749c(), juniorUpgradeDestination.getD(), juniorUpgradeDestination.getE(), juniorUpgradeDestination.getF(), juniorUpgradeDestination.getF101750g()));
    }
}
