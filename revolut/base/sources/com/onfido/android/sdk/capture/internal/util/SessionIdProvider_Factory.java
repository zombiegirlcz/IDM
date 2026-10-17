package com.onfido.android.sdk.capture.internal.util;

import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.android.sdk.capture.utils.UuidProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class SessionIdProvider_Factory implements b {
    private final Provider sharedPreferencesDataSourceProvider;
    private final Provider timeProvider;
    private final Provider uuidProvider;

    public SessionIdProvider_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.uuidProvider = provider;
        this.timeProvider = provider2;
        this.sharedPreferencesDataSourceProvider = provider3;
    }

    public static SessionIdProvider_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new SessionIdProvider_Factory(provider, provider2, provider3);
    }

    public static SessionIdProvider newInstance(UuidProvider uuidProvider, TimeProvider timeProvider, SharedPreferencesDataSource sharedPreferencesDataSource) {
        return new SessionIdProvider(uuidProvider, timeProvider, sharedPreferencesDataSource);
    }

    @Override // com.onfido.javax.inject.Provider
    public SessionIdProvider get() {
        return newInstance((UuidProvider) this.uuidProvider.get(), (TimeProvider) this.timeProvider.get(), (SharedPreferencesDataSource) this.sharedPreferencesDataSourceProvider.get());
    }
}
