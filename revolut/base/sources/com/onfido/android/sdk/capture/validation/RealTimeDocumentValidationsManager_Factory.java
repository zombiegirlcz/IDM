package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class RealTimeDocumentValidationsManager_Factory implements el.b {
    private final Provider identityInteractorProvider;

    public RealTimeDocumentValidationsManager_Factory(Provider provider) {
        this.identityInteractorProvider = provider;
    }

    public static RealTimeDocumentValidationsManager_Factory create(Provider provider) {
        return new RealTimeDocumentValidationsManager_Factory(provider);
    }

    public static RealTimeDocumentValidationsManager newInstance(IdentityInteractor identityInteractor) {
        return new RealTimeDocumentValidationsManager(identityInteractor);
    }

    @Override // com.onfido.javax.inject.Provider
    public RealTimeDocumentValidationsManager get() {
        return newInstance((IdentityInteractor) this.identityInteractorProvider.get());
    }
}
