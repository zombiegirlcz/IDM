package jtb;

import android.content.Context;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerLauncherActivity;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.R$anim;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.core.navigation.feature.SingleActivityFeatureConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements uri.a, nte.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof SingleActivityFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ActivityNavigateCommand activityNavigateCommand;
        SingleActivityFeatureConfig config = (SingleActivityFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        FeatureConfig featureConfig2 = config.f98681a;
        if (featureConfig2 instanceof KompotBridgeFeatureConfig) {
            KompotBridgeFeatureConfig kompotBridgeFeatureConfig = (KompotBridgeFeatureConfig) featureConfig2;
            activityNavigateCommand = new ActivityNavigateCommand(new ExplicitActivityDestination(MainContainerLauncherActivity.class), new KompotFlowContract$Configuration.Standalone(kompotBridgeFeatureConfig.f98274b, true, kompotBridgeFeatureConfig.f), null, kompotBridgeFeatureConfig.getF89980g(), 603979776, null, null, null, kompotBridgeFeatureConfig.getF99934h(), false, 740);
        } else {
            if (!(featureConfig2 instanceof KompotOverlayFeatureConfig)) {
                throw new IllegalStateException(("The configuration is not supported - " + featureConfig2).toString());
            }
            KompotOverlayFeatureConfig kompotOverlayFeatureConfig = (KompotOverlayFeatureConfig) featureConfig2;
            KompotFlowContract$Configuration.Standalone standalone = new KompotFlowContract$Configuration.Standalone(kompotOverlayFeatureConfig.f98277a, true, false);
            ExplicitActivityDestination explicitActivityDestination = new ExplicitActivityDestination(MainContainerLauncherActivity.class);
            int i = R$anim.no_animation;
            activityNavigateCommand = new ActivityNavigateCommand(explicitActivityDestination, standalone, null, kompotOverlayFeatureConfig.f98279c, 603979776, null, Integer.valueOf(i), Integer.valueOf(i), null, false, 804);
        }
        navigator.c(activityNavigateCommand);
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }
}
