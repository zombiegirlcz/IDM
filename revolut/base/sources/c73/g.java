package c73;

import android.content.Context;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CardsScreenFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        n63.b bVar;
        CardsScreenFeatureConfig config = (CardsScreenFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        String str = config.f65324b;
        i63.a aVar = config.f65323a;
        int i = aVar == null ? -1 : f.f21843a[aVar.ordinal()];
        if (i == -1 || i == 1) {
            bVar = n63.b.RETAIL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = n63.b.JUNIOR;
        }
        navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardsCarouselFlowDestination(str, bVar, config.f65325c, config.d, config.e, null, 32), false, (Integer) null, 0, 61)));
    }
}
