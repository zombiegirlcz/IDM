package com.onfido.android.sdk.capture.ui.userconsent;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class UserConsentViewModel_Factory implements el.b {
    private final Provider flowTrackerProvider;
    private final Provider onfidoConfigProvider;
    private final Provider remoteConfigProvider;
    private final Provider schedulersProvider;
    private final Provider screenTrackerProvider;
    private final Provider userConsentRepositoryProvider;
    private final Provider waitingScreenTrackerProvider;

    public UserConsentViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.userConsentRepositoryProvider = provider;
        this.screenTrackerProvider = provider2;
        this.schedulersProvider = provider3;
        this.waitingScreenTrackerProvider = provider4;
        this.remoteConfigProvider = provider5;
        this.onfidoConfigProvider = provider6;
        this.flowTrackerProvider = provider7;
    }

    public static UserConsentViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new UserConsentViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static UserConsentViewModel newInstance(UserConsentRepository userConsentRepository, ScreenTracker screenTracker, SchedulersProvider schedulersProvider, WaitingScreenTracker waitingScreenTracker, OnfidoRemoteConfig onfidoRemoteConfig, OnfidoConfig onfidoConfig, FlowTracker flowTracker) {
        return new UserConsentViewModel(userConsentRepository, screenTracker, schedulersProvider, waitingScreenTracker, onfidoRemoteConfig, onfidoConfig, flowTracker);
    }

    @Override // com.onfido.javax.inject.Provider
    public UserConsentViewModel get() {
        return newInstance((UserConsentRepository) this.userConsentRepositoryProvider.get(), (ScreenTracker) this.screenTrackerProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (WaitingScreenTracker) this.waitingScreenTrackerProvider.get(), (OnfidoRemoteConfig) this.remoteConfigProvider.get(), (OnfidoConfig) this.onfidoConfigProvider.get(), (FlowTracker) this.flowTrackerProvider.get());
    }
}
