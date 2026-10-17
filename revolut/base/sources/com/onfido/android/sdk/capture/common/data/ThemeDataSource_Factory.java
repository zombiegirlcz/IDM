package com.onfido.android.sdk.capture.common.data;

import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class ThemeDataSource_Factory implements b {
    private final Provider storageProvider;

    public ThemeDataSource_Factory(Provider provider) {
        this.storageProvider = provider;
    }

    public static ThemeDataSource_Factory create(Provider provider) {
        return new ThemeDataSource_Factory(provider);
    }

    public static ThemeDataSource newInstance(SharedPreferencesDataSource sharedPreferencesDataSource) {
        return new ThemeDataSource(sharedPreferencesDataSource);
    }

    @Override // com.onfido.javax.inject.Provider
    public ThemeDataSource get() {
        return newInstance((SharedPreferencesDataSource) this.storageProvider.get());
    }
}
