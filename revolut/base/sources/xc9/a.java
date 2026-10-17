package xc9;

import android.content.Context;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration;
import com.revolut.feature.onboarding.api.revolut_card_ready.RevolutCardReadyConfig;
import com.revolut.feature.onboarding.impl.revolut_card_ready.RevolutCardReadyActivity;
import com.revolut.feature.onboarding.impl.revolut_card_ready.RevolutCardReadyContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof RevolutCardReadyConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        RevolutCardReadyConfig config = (RevolutCardReadyConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        navigator.c(new ActivityNavigateCommand(new ExplicitActivityDestination(RevolutCardReadyActivity.class), new BluePromptContract$Configuration.Custom("REVOLUT_CARD_READY_FLOW", new RevolutCardReadyContract$Configuration(config.d, config.f78208b, config.f78207a), true, null, config.f78209c, false), null, null, 0, null, null, null, null, false, 1020));
    }
}
