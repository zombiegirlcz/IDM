package vhi;

import android.content.Context;
import com.revolut.kompot.bridge.impl.launcher.KompotLauncherActivity;
import com.revolut.kompot.bridge.impl.launcher.KompotOverlayLauncherActivity;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.R$anim;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof KompotFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ActivityNavigateCommand activityNavigateCommand;
        KompotFeatureConfig config = (KompotFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof KompotBridgeFeatureConfig) {
            KompotBridgeFeatureConfig kompotBridgeFeatureConfig = (KompotBridgeFeatureConfig) config;
            activityNavigateCommand = new ActivityNavigateCommand(new ExplicitActivityDestination(KompotLauncherActivity.class), new KompotFlowContract$Configuration.Standalone(kompotBridgeFeatureConfig.f98274b, kompotBridgeFeatureConfig.f98275c, kompotBridgeFeatureConfig.f), null, kompotBridgeFeatureConfig.getF89980g(), kompotBridgeFeatureConfig.getF78187g(), null, null, null, kompotBridgeFeatureConfig.getF68957h(), false, 740);
        } else {
            if (!(config instanceof KompotOverlayFeatureConfig)) {
                throw new NoWhenBranchMatchedException();
            }
            ExplicitActivityDestination explicitActivityDestination = new ExplicitActivityDestination(KompotOverlayLauncherActivity.class);
            int i = R$anim.no_animation;
            KompotOverlayFeatureConfig kompotOverlayFeatureConfig = (KompotOverlayFeatureConfig) config;
            activityNavigateCommand = new ActivityNavigateCommand(explicitActivityDestination, new KompotFlowContract$Configuration.Overlay(kompotOverlayFeatureConfig.f98277a, kompotOverlayFeatureConfig.f98278b), null, kompotOverlayFeatureConfig.f98279c, 0, null, Integer.valueOf(i), Integer.valueOf(i), null, false, 804);
        }
        navigator.c(activityNavigateCommand);
    }
}
