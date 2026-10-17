package bj3;

import aii.p;
import aii.u;
import com.revolut.feature.chooser.kompot.bridge.ChooserScreenBizArchBridgeFlow;
import com.revolut.feature.chooser.kompot.bridge.ChooserScreenKompotBridgeContract$InputData;
import com.revolut.feature.chooser.kompot.bridge.navigation.ChooserScreenKompotBridgeFeatureConfig;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ChooserScreenKompotBridgeFeatureConfig.ChooserScreenBridgeBizDestination) {
            return new ChooserScreenBizArchBridgeFlow(new ChooserScreenKompotBridgeContract$InputData(((ChooserScreenKompotBridgeFeatureConfig.ChooserScreenBridgeBizDestination) destination).f65931a));
        }
        return null;
    }
}
