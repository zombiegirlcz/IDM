package com.onfido.android.sdk.capture.common.di;

import com.onfido.api.client.token.Token;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideOnfidoTokenFactory implements b {
    private final SdkModule module;

    public SdkModule_ProvideOnfidoTokenFactory(SdkModule sdkModule) {
        this.module = sdkModule;
    }

    public static SdkModule_ProvideOnfidoTokenFactory create(SdkModule sdkModule) {
        return new SdkModule_ProvideOnfidoTokenFactory(sdkModule);
    }

    public static Token provideOnfidoToken(SdkModule sdkModule) {
        Token tokenProvideOnfidoToken = sdkModule.provideOnfidoToken();
        e.g(tokenProvideOnfidoToken);
        return tokenProvideOnfidoToken;
    }

    @Override // com.onfido.javax.inject.Provider
    public Token get() {
        return provideOnfidoToken(this.module);
    }
}
