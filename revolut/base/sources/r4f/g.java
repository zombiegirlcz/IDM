package r4f;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends m1h.e {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel instanceof f) {
            A2(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.will-i-be-charged-for-exchanging-foreign-currencies", 2))));
        }
        return Unit.f186387a;
    }
}
