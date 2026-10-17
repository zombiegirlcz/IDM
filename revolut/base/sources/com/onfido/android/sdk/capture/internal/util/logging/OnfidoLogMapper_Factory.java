package com.onfido.android.sdk.capture.internal.util.logging;

import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.util.SessionIdProvider;
import com.onfido.android.sdk.capture.utils.DeviceMetadataProvider;
import com.onfido.android.sdk.capture.utils.UuidProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoLogMapper_Factory implements b {
    private final Provider deviceMetadataProvider;
    private final Provider onfidoConfigProvider;
    private final Provider sessionIdProvider;
    private final Provider uuidProvider;

    public OnfidoLogMapper_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.uuidProvider = provider;
        this.onfidoConfigProvider = provider2;
        this.sessionIdProvider = provider3;
        this.deviceMetadataProvider = provider4;
    }

    public static OnfidoLogMapper_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new OnfidoLogMapper_Factory(provider, provider2, provider3, provider4);
    }

    public static OnfidoLogMapper newInstance(UuidProvider uuidProvider, OnfidoConfig onfidoConfig, SessionIdProvider sessionIdProvider, DeviceMetadataProvider deviceMetadataProvider) {
        return new OnfidoLogMapper(uuidProvider, onfidoConfig, sessionIdProvider, deviceMetadataProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoLogMapper get() {
        return newInstance((UuidProvider) this.uuidProvider.get(), (OnfidoConfig) this.onfidoConfigProvider.get(), (SessionIdProvider) this.sessionIdProvider.get(), (DeviceMetadataProvider) this.deviceMetadataProvider.get());
    }
}
