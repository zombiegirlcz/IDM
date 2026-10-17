package em5;

import aii.u;
import com.revolut.feature.crypto.strategies.api.navigation.destinations.CryptoStrategiesDestination;
import com.revolut.feature.crypto.strategies.impl.ui.crypto_strategies.CryptoStrategiesController;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoStrategiesDestination) {
            return new CryptoStrategiesController();
        }
        return null;
    }
}
