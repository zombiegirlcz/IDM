package com.onfido.android.sdk.capture.ui.nfc;

import androidx.lifecycle.SavedStateHandle;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.ScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.nfc.NfcHostViewModel_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2135NfcHostViewModel_Factory {
    private final Provider nfcInteractorProvider;
    private final Provider nfcTrackerProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider schedulersProvider;
    private final Provider screenTrackerProvider;
    private final Provider storageProvider;

    public C2135NfcHostViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.schedulersProvider = provider;
        this.nfcInteractorProvider = provider2;
        this.nfcTrackerProvider = provider3;
        this.screenTrackerProvider = provider4;
        this.onfidoRemoteConfigProvider = provider5;
        this.storageProvider = provider6;
    }

    public static C2135NfcHostViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new C2135NfcHostViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static NfcHostViewModel newInstance(SchedulersProvider schedulersProvider, NfcInteractor nfcInteractor, NfcTracker nfcTracker, ScreenTracker screenTracker, OnfidoRemoteConfig onfidoRemoteConfig, SharedPreferencesDataSource sharedPreferencesDataSource, SavedStateHandle savedStateHandle) {
        return new NfcHostViewModel(schedulersProvider, nfcInteractor, nfcTracker, screenTracker, onfidoRemoteConfig, sharedPreferencesDataSource, savedStateHandle);
    }

    public NfcHostViewModel get(SavedStateHandle savedStateHandle) {
        return newInstance((SchedulersProvider) this.schedulersProvider.get(), (NfcInteractor) this.nfcInteractorProvider.get(), (NfcTracker) this.nfcTrackerProvider.get(), (ScreenTracker) this.screenTrackerProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (SharedPreferencesDataSource) this.storageProvider.get(), savedStateHandle);
    }
}
