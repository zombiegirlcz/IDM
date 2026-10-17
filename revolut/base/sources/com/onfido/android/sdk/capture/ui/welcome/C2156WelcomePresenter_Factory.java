package com.onfido.android.sdk.capture.ui.welcome;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.performance.trackers.ScreenLoadTracker;
import com.onfido.android.sdk.capture.ui.options.WelcomeScreenOptions;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.welcome.WelcomePresenter_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2156WelcomePresenter_Factory {
    private final Provider onfidoRemoteConfigProvider;
    private final Provider screenLoadTrackerProvider;
    private final Provider screenTrackerProvider;

    public C2156WelcomePresenter_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.onfidoRemoteConfigProvider = provider;
        this.screenTrackerProvider = provider2;
        this.screenLoadTrackerProvider = provider3;
    }

    public static C2156WelcomePresenter_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new C2156WelcomePresenter_Factory(provider, provider2, provider3);
    }

    public static WelcomePresenter newInstance(OnfidoRemoteConfig onfidoRemoteConfig, ScreenTracker screenTracker, ScreenLoadTracker screenLoadTracker, WelcomeScreenOptions welcomeScreenOptions) {
        return new WelcomePresenter(onfidoRemoteConfig, screenTracker, screenLoadTracker, welcomeScreenOptions);
    }

    public WelcomePresenter get(WelcomeScreenOptions welcomeScreenOptions) {
        return newInstance((OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (ScreenTracker) this.screenTrackerProvider.get(), (ScreenLoadTracker) this.screenLoadTrackerProvider.get(), welcomeScreenOptions);
    }
}
