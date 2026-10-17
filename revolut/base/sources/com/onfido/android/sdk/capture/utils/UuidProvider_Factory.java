package com.onfido.android.sdk.capture.utils;

import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class UuidProvider_Factory implements b {
    private final Provider sharedPreferencesDataSourceProvider;

    public UuidProvider_Factory(Provider provider) {
        this.sharedPreferencesDataSourceProvider = provider;
    }

    public static UuidProvider_Factory create(Provider provider) {
        return new UuidProvider_Factory(provider);
    }

    public static UuidProvider newInstance(SharedPreferencesDataSource sharedPreferencesDataSource) {
        return new UuidProvider(sharedPreferencesDataSource);
    }

    @Override // com.onfido.javax.inject.Provider
    public UuidProvider get() {
        return newInstance((SharedPreferencesDataSource) this.sharedPreferencesDataSourceProvider.get());
    }
}
