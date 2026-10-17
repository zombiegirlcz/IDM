package com.onfido.android.sdk.capture.common.permissions;

import android.content.Context;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class RuntimePermissionsManager_Factory implements b {
    private final Provider contextProvider;
    private final Provider sharedPreferencesDataSourceProvider;

    public RuntimePermissionsManager_Factory(Provider provider, Provider provider2) {
        this.contextProvider = provider;
        this.sharedPreferencesDataSourceProvider = provider2;
    }

    public static RuntimePermissionsManager_Factory create(Provider provider, Provider provider2) {
        return new RuntimePermissionsManager_Factory(provider, provider2);
    }

    public static RuntimePermissionsManager newInstance(Context context, SharedPreferencesDataSource sharedPreferencesDataSource) {
        return new RuntimePermissionsManager(context, sharedPreferencesDataSource);
    }

    @Override // com.onfido.javax.inject.Provider
    public RuntimePermissionsManager get() {
        return newInstance((Context) this.contextProvider.get(), (SharedPreferencesDataSource) this.sharedPreferencesDataSourceProvider.get());
    }
}
