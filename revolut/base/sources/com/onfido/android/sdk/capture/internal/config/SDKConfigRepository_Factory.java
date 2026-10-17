package com.onfido.android.sdk.capture.internal.config;

import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.network.OnfidoApiService;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class SDKConfigRepository_Factory implements b {
    private final Provider mutableOnfidoRemoteConfigProvider;
    private final Provider onfidoAPIProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider schedulersProvider;

    public SDKConfigRepository_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.onfidoAPIProvider = provider;
        this.schedulersProvider = provider2;
        this.onfidoRemoteConfigProvider = provider3;
        this.mutableOnfidoRemoteConfigProvider = provider4;
    }

    public static SDKConfigRepository_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new SDKConfigRepository_Factory(provider, provider2, provider3, provider4);
    }

    public static SDKConfigRepository newInstance(OnfidoApiService onfidoApiService, SchedulersProvider schedulersProvider, OnfidoRemoteConfig onfidoRemoteConfig, MutableOnfidoRemoteConfig mutableOnfidoRemoteConfig) {
        return new SDKConfigRepository(onfidoApiService, schedulersProvider, onfidoRemoteConfig, mutableOnfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public SDKConfigRepository get() {
        return newInstance((OnfidoApiService) this.onfidoAPIProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (MutableOnfidoRemoteConfig) this.mutableOnfidoRemoteConfigProvider.get());
    }
}
