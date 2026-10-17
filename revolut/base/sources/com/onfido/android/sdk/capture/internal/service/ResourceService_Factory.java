package com.onfido.android.sdk.capture.internal.service;

import android.content.Context;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class ResourceService_Factory implements el.b {
    private final Provider contextProvider;

    public ResourceService_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static ResourceService_Factory create(Provider provider) {
        return new ResourceService_Factory(provider);
    }

    public static ResourceService newInstance(Context context) {
        return new ResourceService(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public ResourceService get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
