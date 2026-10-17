package h3a;

import com.revolut.feature.payments.profile.api.navigation.PaymentProfileFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p {
    public static BridgeDestination a(String buttonId) {
        Intrinsics.checkNotNullParameter(buttonId, "buttonId");
        if (Intrinsics.f(buttonId, "QR_CODE_BUTTON_ID")) {
            return new BridgeDestination(new FeatureCommand(new PaymentProfileFeatureConfig(ew9.a.QR_SCANNER)));
        }
        throw new IllegalStateException(a0.d.r(buttonId, " is not supported"));
    }
}
