package com.onfido.android.sdk.capture.token;

import android.content.Context;
import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class TokenExpirationServiceConnector_Factory implements b {
    private final Provider applicationContextProvider;
    private final Provider tokenProvider;

    public TokenExpirationServiceConnector_Factory(Provider provider, Provider provider2) {
        this.tokenProvider = provider;
        this.applicationContextProvider = provider2;
    }

    public static TokenExpirationServiceConnector_Factory create(Provider provider, Provider provider2) {
        return new TokenExpirationServiceConnector_Factory(provider, provider2);
    }

    public static TokenExpirationServiceConnector newInstance(OnfidoTokenProvider onfidoTokenProvider, Context context) {
        return new TokenExpirationServiceConnector(onfidoTokenProvider, context);
    }

    @Override // com.onfido.javax.inject.Provider
    public TokenExpirationServiceConnector get() {
        return newInstance((OnfidoTokenProvider) this.tokenProvider.get(), (Context) this.applicationContextProvider.get());
    }
}
