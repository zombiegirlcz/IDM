package sl7;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final BridgeDestination a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter(key, true)));
    }
}
