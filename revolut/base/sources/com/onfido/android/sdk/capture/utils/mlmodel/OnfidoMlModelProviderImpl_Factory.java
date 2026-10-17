package com.onfido.android.sdk.capture.utils.mlmodel;

import android.content.Context;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.CaptureTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoMlModelProviderImpl_Factory implements b {
    private final Provider captureTrackerProvider;
    private final Provider contextProvider;
    private final Provider documentDetectorFactoryProvider;
    private final Provider remoteConfigProvider;
    private final Provider timeProvider;

    public OnfidoMlModelProviderImpl_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.contextProvider = provider;
        this.captureTrackerProvider = provider2;
        this.timeProvider = provider3;
        this.documentDetectorFactoryProvider = provider4;
        this.remoteConfigProvider = provider5;
    }

    public static OnfidoMlModelProviderImpl_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new OnfidoMlModelProviderImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static OnfidoMlModelProviderImpl newInstance(Context context, CaptureTracker captureTracker, TimeProvider timeProvider, OnfidoDocumentDetectorFactory onfidoDocumentDetectorFactory, OnfidoRemoteConfig onfidoRemoteConfig) {
        return new OnfidoMlModelProviderImpl(context, captureTracker, timeProvider, onfidoDocumentDetectorFactory, onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public OnfidoMlModelProviderImpl get() {
        return newInstance((Context) this.contextProvider.get(), (CaptureTracker) this.captureTrackerProvider.get(), (TimeProvider) this.timeProvider.get(), (OnfidoDocumentDetectorFactory) this.documentDetectorFactoryProvider.get(), (OnfidoRemoteConfig) this.remoteConfigProvider.get());
    }
}
