package com.onfido.android.sdk.capture.internal.util.logging;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class RemoteLoggerTree_Factory implements b {
    private final Provider remoteConfigProvider;
    private final Provider repositoryProvider;
    private final Provider timeProvider;

    public RemoteLoggerTree_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.repositoryProvider = provider;
        this.timeProvider = provider2;
        this.remoteConfigProvider = provider3;
    }

    public static RemoteLoggerTree_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new RemoteLoggerTree_Factory(provider, provider2, provider3);
    }

    public static RemoteLoggerTree newInstance(LoggerRepository loggerRepository, TimeProvider timeProvider, OnfidoRemoteConfig onfidoRemoteConfig) {
        return new RemoteLoggerTree(loggerRepository, timeProvider, onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public RemoteLoggerTree get() {
        return newInstance((LoggerRepository) this.repositoryProvider.get(), (TimeProvider) this.timeProvider.get(), (OnfidoRemoteConfig) this.remoteConfigProvider.get());
    }
}
