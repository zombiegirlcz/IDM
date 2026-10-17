package jtb;

import android.content.Context;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.feature.rev10_main_screen.api.navigation.AppHomeFeatureConfig;
import com.revolut.feature.rev10_main_screen.api.navigation.DeeplinkFeatureConfig;
import com.revolut.feature.rev10_main_screen.api.navigation.MainContainerScreenFeatureConfig;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerLauncherActivity;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements uri.a, nte.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof AppHomeFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ActivityNavigateCommand activityNavigateCommand;
        AppHomeFeatureConfig config = (AppHomeFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof MainContainerScreenFeatureConfig) {
            ExplicitActivityDestination explicitActivityDestination = new ExplicitActivityDestination(MainContainerLauncherActivity.class);
            MainContainerScreenFeatureConfig mainContainerScreenFeatureConfig = (MainContainerScreenFeatureConfig) config;
            KompotFlowContract$Configuration.Standalone standalone = new KompotFlowContract$Configuration.Standalone(mainContainerScreenFeatureConfig.f83426a, true, false);
            int i = mainContainerScreenFeatureConfig.f83427b;
            activityNavigateCommand = new ActivityNavigateCommand(explicitActivityDestination, standalone, null, null, i == 335577088 ? 0 : i, null, null, null, mainContainerScreenFeatureConfig.f83428c ? new ActivityAnimation.ContentTransition(true) : null, i == 335577088, Constants.TAG_OS_VERSION);
        } else {
            if (!(config instanceof DeeplinkFeatureConfig)) {
                throw new NoWhenBranchMatchedException();
            }
            DeeplinkFeatureConfig deeplinkFeatureConfig = (DeeplinkFeatureConfig) config;
            activityNavigateCommand = new ActivityNavigateCommand(new ExplicitActivityDestination(MainContainerLauncherActivity.class), new KompotFlowContract$Configuration.Standalone(deeplinkFeatureConfig.f83424a, true, false), null, null, deeplinkFeatureConfig.f83425b ? 335577088 : 603979776, null, null, null, null, false, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
        navigator.c(activityNavigateCommand);
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }
}
