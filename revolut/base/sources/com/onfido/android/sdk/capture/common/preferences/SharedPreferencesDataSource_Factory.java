package com.onfido.android.sdk.capture.common.preferences;

import android.content.Context;
import com.onfido.javax.inject.Provider;
import el.b;
import kotlinx.serialization.json.Json;

/* JADX INFO: loaded from: classes17.dex */
public final class SharedPreferencesDataSource_Factory implements b {
    private final Provider contextProvider;
    private final Provider jsonParserProvider;

    public SharedPreferencesDataSource_Factory(Provider provider, Provider provider2) {
        this.contextProvider = provider;
        this.jsonParserProvider = provider2;
    }

    public static SharedPreferencesDataSource_Factory create(Provider provider, Provider provider2) {
        return new SharedPreferencesDataSource_Factory(provider, provider2);
    }

    public static SharedPreferencesDataSource newInstance(Context context, Json json) {
        return new SharedPreferencesDataSource(context, json);
    }

    @Override // com.onfido.javax.inject.Provider
    public SharedPreferencesDataSource get() {
        return newInstance((Context) this.contextProvider.get(), (Json) this.jsonParserProvider.get());
    }
}
