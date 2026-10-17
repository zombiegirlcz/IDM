package syk;

import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.retail.feature.trading_onboarding.impl.ui.start.StartContract$Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f266698a;

    public p(ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f266698a = navigationCommandsDispatcher;
    }

    public final efm.b a(TradingOnboardingFeatureConfig onboardingLaunchingConfig) {
        Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
        y0l.e.Companion.getClass();
        return this.f266698a.a(com.revolut.retail.core.navigation.a.c(new ActivityNavigateCommand(y0l.a.f310222b, new StartContract$Configuration(onboardingLaunchingConfig, true), null, null, 603979776, null, null, null, null, false, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), onboardingLaunchingConfig.getF104119a()));
    }
}
