package com.onfido.hosted.web.module.externallink;

import com.onfido.javax.inject.Provider;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes17.dex */
public final class HostedWebModuleExternalLinkRepositoryImpl_Factory implements el.b {
    private final Provider okHttpClientProvider;

    public HostedWebModuleExternalLinkRepositoryImpl_Factory(Provider provider) {
        this.okHttpClientProvider = provider;
    }

    public static HostedWebModuleExternalLinkRepositoryImpl_Factory create(Provider provider) {
        return new HostedWebModuleExternalLinkRepositoryImpl_Factory(provider);
    }

    public static HostedWebModuleExternalLinkRepositoryImpl newInstance(OkHttpClient okHttpClient) {
        return new HostedWebModuleExternalLinkRepositoryImpl(okHttpClient);
    }

    @Override // com.onfido.javax.inject.Provider
    public HostedWebModuleExternalLinkRepositoryImpl get() {
        return newInstance((OkHttpClient) this.okHttpClientProvider.get());
    }
}
