package com.onfido.android.sdk.capture.utils;

import android.content.Context;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class RawResourceReader_Factory implements b {
    private final Provider contextProvider;

    public RawResourceReader_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static RawResourceReader_Factory create(Provider provider) {
        return new RawResourceReader_Factory(provider);
    }

    public static RawResourceReader newInstance(Context context) {
        return new RawResourceReader(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public RawResourceReader get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
