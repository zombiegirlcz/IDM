package com.onfido.android.sdk.capture.utils;

import com.onfido.android.sdk.capture.antifraud.SignalExtractor;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class DeviceMetadataProvider_Factory implements b {
    private final Provider signalExtractorProvider;

    public DeviceMetadataProvider_Factory(Provider provider) {
        this.signalExtractorProvider = provider;
    }

    public static DeviceMetadataProvider_Factory create(Provider provider) {
        return new DeviceMetadataProvider_Factory(provider);
    }

    public static DeviceMetadataProvider newInstance(SignalExtractor signalExtractor) {
        return new DeviceMetadataProvider(signalExtractor);
    }

    @Override // com.onfido.javax.inject.Provider
    public DeviceMetadataProvider get() {
        return newInstance((SignalExtractor) this.signalExtractorProvider.get());
    }
}
