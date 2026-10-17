package com.onfido.android.sdk.capture.internal.util;

import android.content.Context;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class FileCache_Factory implements b {
    private final Provider contextProvider;

    public FileCache_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static FileCache_Factory create(Provider provider) {
        return new FileCache_Factory(provider);
    }

    public static FileCache newInstance(Context context) {
        return new FileCache(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public FileCache get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
