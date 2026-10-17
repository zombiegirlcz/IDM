package com.onfido.android.sdk.capture.ui.widget;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.widget.LoadingFragmentViewModel_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2157LoadingFragmentViewModel_Factory {
    private final Provider remoteConfigProvider;
    private final Provider schedulersProvider;
    private final Provider waitingScreenTrackerProvider;

    public C2157LoadingFragmentViewModel_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.remoteConfigProvider = provider;
        this.schedulersProvider = provider2;
        this.waitingScreenTrackerProvider = provider3;
    }

    public static C2157LoadingFragmentViewModel_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new C2157LoadingFragmentViewModel_Factory(provider, provider2, provider3);
    }

    public static LoadingFragmentViewModel newInstance(OnfidoRemoteConfig onfidoRemoteConfig, SchedulersProvider schedulersProvider, WaitingScreenTracker waitingScreenTracker, LoadingFragment.Companion.DialogMode dialogMode) {
        return new LoadingFragmentViewModel(onfidoRemoteConfig, schedulersProvider, waitingScreenTracker, dialogMode);
    }

    public LoadingFragmentViewModel get(LoadingFragment.Companion.DialogMode dialogMode) {
        return newInstance((OnfidoRemoteConfig) this.remoteConfigProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (WaitingScreenTracker) this.waitingScreenTrackerProvider.get(), dialogMode);
    }
}
