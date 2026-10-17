package com.onfido.android.sdk.capture.internal.token;

import com.onfido.api.client.token.Token;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoTokenProvider_Factory implements b {
    private final Provider tokenProvider;

    public OnfidoTokenProvider_Factory(Provider provider) {
        this.tokenProvider = provider;
    }

    public static OnfidoTokenProvider_Factory create(Provider provider) {
        return new OnfidoTokenProvider_Factory(provider);
    }

    public static OnfidoTokenProvider newInstance(Token token) {
        return new OnfidoTokenProvider(token);
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoTokenProvider get() {
        return newInstance((Token) this.tokenProvider.get());
    }
}
