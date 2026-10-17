package com.onfido.android.sdk.capture.utils;

import android.content.Context;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class CameraMetadataProvider_Factory implements b {
    private final Provider contextProvider;

    public CameraMetadataProvider_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static CameraMetadataProvider_Factory create(Provider provider) {
        return new CameraMetadataProvider_Factory(provider);
    }

    public static CameraMetadataProvider newInstance(Context context) {
        return new CameraMetadataProvider(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public CameraMetadataProvider get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
