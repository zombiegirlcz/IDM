package com.onfido.android.sdk.capture.network;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.common.cryptography.Cryptography;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.token.TokenExpirationServiceConnector;
import com.onfido.api.client.OnfidoAPI;
import com.onfido.api.client.token.TokenProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoApiService_Factory implements b {
    private final Provider cryptographyProvider;
    private final Provider identityInteractorProvider;
    private final Provider onfidoApiProvider;
    private final Provider onfidoConfigProvider;
    private final Provider sdkUploadMetadataHelperProvider;
    private final Provider tokenExpirationServiceConnetorProvider;
    private final Provider tokenProvider;

    public OnfidoApiService_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.onfidoApiProvider = provider;
        this.identityInteractorProvider = provider2;
        this.onfidoConfigProvider = provider3;
        this.sdkUploadMetadataHelperProvider = provider4;
        this.tokenExpirationServiceConnetorProvider = provider5;
        this.cryptographyProvider = provider6;
        this.tokenProvider = provider7;
    }

    public static OnfidoApiService_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new OnfidoApiService_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static OnfidoApiService newInstance(OnfidoAPI onfidoAPI, IdentityInteractor identityInteractor, OnfidoConfig onfidoConfig, SdkUploadMetadataHelper sdkUploadMetadataHelper, TokenExpirationServiceConnector tokenExpirationServiceConnector, Cryptography cryptography, TokenProvider tokenProvider) {
        return new OnfidoApiService(onfidoAPI, identityInteractor, onfidoConfig, sdkUploadMetadataHelper, tokenExpirationServiceConnector, cryptography, tokenProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoApiService get() {
        return newInstance((OnfidoAPI) this.onfidoApiProvider.get(), (IdentityInteractor) this.identityInteractorProvider.get(), (OnfidoConfig) this.onfidoConfigProvider.get(), (SdkUploadMetadataHelper) this.sdkUploadMetadataHelperProvider.get(), (TokenExpirationServiceConnector) this.tokenExpirationServiceConnetorProvider.get(), (Cryptography) this.cryptographyProvider.get(), (TokenProvider) this.tokenProvider.get());
    }
}
