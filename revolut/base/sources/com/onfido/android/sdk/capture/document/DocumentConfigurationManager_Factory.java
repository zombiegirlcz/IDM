package com.onfido.android.sdk.capture.document;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentConfigurationManager_Factory implements b {
    private final Provider onfidoRemoteConfigProvider;

    public DocumentConfigurationManager_Factory(Provider provider) {
        this.onfidoRemoteConfigProvider = provider;
    }

    public static DocumentConfigurationManager_Factory create(Provider provider) {
        return new DocumentConfigurationManager_Factory(provider);
    }

    public static DocumentConfigurationManager newInstance(OnfidoRemoteConfig onfidoRemoteConfig) {
        return new DocumentConfigurationManager(onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public DocumentConfigurationManager get() {
        return newInstance((OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get());
    }
}
