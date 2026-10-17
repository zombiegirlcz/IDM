package gde;

import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes13.dex */
public final class d {
    public final FeatureCommand a() {
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedHelpDestination((SharedHelpDestination.InputData) null, 3), false, (Integer) null, 0, 61));
    }
}
