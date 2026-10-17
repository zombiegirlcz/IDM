package com.onfido.android.sdk.capture.ui;

import com.onfido.android.sdk.capture.document.supported.domain.usecase.GetSupportedDocumentsUseCase;
import com.onfido.android.sdk.capture.internal.config.SDKConfigRepository;
import com.onfido.android.sdk.capture.ui.userconsent.UserConsentRepository;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoPresenterInitializer_Factory implements el.b {
    private final Provider getSupportedDocumentsUseCaseProvider;
    private final Provider sdkConfigRepositoryProvider;
    private final Provider userConsentRepositoryProvider;

    public OnfidoPresenterInitializer_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.sdkConfigRepositoryProvider = provider;
        this.userConsentRepositoryProvider = provider2;
        this.getSupportedDocumentsUseCaseProvider = provider3;
    }

    public static OnfidoPresenterInitializer_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new OnfidoPresenterInitializer_Factory(provider, provider2, provider3);
    }

    public static OnfidoPresenterInitializer newInstance(SDKConfigRepository sDKConfigRepository, UserConsentRepository userConsentRepository, GetSupportedDocumentsUseCase getSupportedDocumentsUseCase) {
        return new OnfidoPresenterInitializer(sDKConfigRepository, userConsentRepository, getSupportedDocumentsUseCase);
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoPresenterInitializer get() {
        return newInstance((SDKConfigRepository) this.sdkConfigRepositoryProvider.get(), (UserConsentRepository) this.userConsentRepositoryProvider.get(), (GetSupportedDocumentsUseCase) this.getSupportedDocumentsUseCaseProvider.get());
    }
}
