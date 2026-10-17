package x6d;

import android.content.Context;
import com.revolut.feature.shared.consent.prompt.builder.api.navigation.ConsentPromptFeatureConfig;
import com.revolut.feature.shared.consent.prompt.builder.impl.ConsentPromptBridgeFeatureConfig$ConsentPromptDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import vhi.c;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof ConsentPromptFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ConsentPromptFeatureConfig config = (ConsentPromptFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof ConsentPromptFeatureConfig.Default)) {
            throw new NoWhenBranchMatchedException();
        }
        ConsentPromptFeatureConfig.Default r102 = (ConsentPromptFeatureConfig.Default) config;
        w6d.b bVar = r102.f86093b;
        ConsentPromptBridgeFeatureConfig$ConsentPromptDestination consentPromptBridgeFeatureConfig$ConsentPromptDestination = new ConsentPromptBridgeFeatureConfig$ConsentPromptDestination(r102.f86092a, bVar);
        navigator.c(bVar == w6d.b.MODAL ? c.c(consentPromptBridgeFeatureConfig$ConsentPromptDestination, yhi.b.POPUP, null, false, 12) : new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) consentPromptBridgeFeatureConfig$ConsentPromptDestination, false, (Integer) null, 0, 61)));
    }
}
