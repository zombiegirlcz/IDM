package com.onfido.android.sdk.capture.common.di;

import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideCustomerUserHashFactory implements b {
    private final SdkModule module;
    private final Provider tokenProvider;

    public SdkModule_ProvideCustomerUserHashFactory(SdkModule sdkModule, Provider provider) {
        this.module = sdkModule;
        this.tokenProvider = provider;
    }

    public static SdkModule_ProvideCustomerUserHashFactory create(SdkModule sdkModule, Provider provider) {
        return new SdkModule_ProvideCustomerUserHashFactory(sdkModule, provider);
    }

    public static String provideCustomerUserHash(SdkModule sdkModule, OnfidoTokenProvider onfidoTokenProvider) {
        String strProvideCustomerUserHash = sdkModule.provideCustomerUserHash(onfidoTokenProvider);
        e.g(strProvideCustomerUserHash);
        return strProvideCustomerUserHash;
    }

    @Override // com.onfido.javax.inject.Provider
    public String get() {
        return provideCustomerUserHash(this.module, (OnfidoTokenProvider) this.tokenProvider.get());
    }
}
