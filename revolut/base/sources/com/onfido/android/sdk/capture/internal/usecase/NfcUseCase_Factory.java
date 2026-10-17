package com.onfido.android.sdk.capture.internal.usecase;

import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.ui.camera.NfcPropertiesService;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class NfcUseCase_Factory implements el.b {
    private final Provider documentConfigurationManagerProvider;
    private final Provider nfcInteractorProvider;
    private final Provider nfcPropertiesServiceProvider;
    private final Provider nfcTrackerProvider;

    public NfcUseCase_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.nfcInteractorProvider = provider;
        this.documentConfigurationManagerProvider = provider2;
        this.nfcPropertiesServiceProvider = provider3;
        this.nfcTrackerProvider = provider4;
    }

    public static NfcUseCase_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new NfcUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static NfcUseCase newInstance(NfcInteractor nfcInteractor, DocumentConfigurationManager documentConfigurationManager, NfcPropertiesService nfcPropertiesService, NfcTracker nfcTracker) {
        return new NfcUseCase(nfcInteractor, documentConfigurationManager, nfcPropertiesService, nfcTracker);
    }

    @Override // com.onfido.javax.inject.Provider
    public NfcUseCase get() {
        return newInstance((NfcInteractor) this.nfcInteractorProvider.get(), (DocumentConfigurationManager) this.documentConfigurationManagerProvider.get(), (NfcPropertiesService) this.nfcPropertiesServiceProvider.get(), (NfcTracker) this.nfcTrackerProvider.get());
    }
}
