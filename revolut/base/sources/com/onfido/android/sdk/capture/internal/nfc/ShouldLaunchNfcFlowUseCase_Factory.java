package com.onfido.android.sdk.capture.internal.nfc;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class ShouldLaunchNfcFlowUseCase_Factory implements el.b {
    private final Provider nfcInteractorProvider;
    private final Provider onfidoConfigProvider;

    public ShouldLaunchNfcFlowUseCase_Factory(Provider provider, Provider provider2) {
        this.nfcInteractorProvider = provider;
        this.onfidoConfigProvider = provider2;
    }

    public static ShouldLaunchNfcFlowUseCase_Factory create(Provider provider, Provider provider2) {
        return new ShouldLaunchNfcFlowUseCase_Factory(provider, provider2);
    }

    public static ShouldLaunchNfcFlowUseCase newInstance(NfcInteractor nfcInteractor, OnfidoConfig onfidoConfig) {
        return new ShouldLaunchNfcFlowUseCase(nfcInteractor, onfidoConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public ShouldLaunchNfcFlowUseCase get() {
        return newInstance((NfcInteractor) this.nfcInteractorProvider.get(), (OnfidoConfig) this.onfidoConfigProvider.get());
    }
}
