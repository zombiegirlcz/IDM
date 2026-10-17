package lpc;

import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends t1h.e {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        c parcel = (c) obj2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (parcel instanceof c) {
            A2(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.can-i-withdraw-my-money-at-any-time", 2))));
        }
        return Unit.f186387a;
    }
}
