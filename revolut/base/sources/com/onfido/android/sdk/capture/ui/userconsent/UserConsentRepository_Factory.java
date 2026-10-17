package com.onfido.android.sdk.capture.ui.userconsent;

import com.onfido.android.sdk.capture.internal.token.OnfidoTokenProvider;
import com.onfido.android.sdk.capture.ui.userconsent.network.UserConsentApi;
import com.onfido.javax.inject.Provider;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes17.dex */
public final class UserConsentRepository_Factory implements el.b {
    private final Provider okHttpClientProvider;
    private final Provider tokenProvider;
    private final Provider userConsentApiProvider;

    public UserConsentRepository_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.okHttpClientProvider = provider;
        this.userConsentApiProvider = provider2;
        this.tokenProvider = provider3;
    }

    public static UserConsentRepository_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new UserConsentRepository_Factory(provider, provider2, provider3);
    }

    public static UserConsentRepository newInstance(OkHttpClient okHttpClient, UserConsentApi userConsentApi, OnfidoTokenProvider onfidoTokenProvider) {
        return new UserConsentRepository(okHttpClient, userConsentApi, onfidoTokenProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public UserConsentRepository get() {
        return newInstance((OkHttpClient) this.okHttpClientProvider.get(), (UserConsentApi) this.userConsentApiProvider.get(), (OnfidoTokenProvider) this.tokenProvider.get());
    }
}
