package com.onfido.android.sdk.capture.detector.face;

import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceOnDocumentDetectorGoogle_Factory implements b {
    private final Provider remoteConfigProvider;

    public FaceOnDocumentDetectorGoogle_Factory(Provider provider) {
        this.remoteConfigProvider = provider;
    }

    public static FaceOnDocumentDetectorGoogle_Factory create(Provider provider) {
        return new FaceOnDocumentDetectorGoogle_Factory(provider);
    }

    public static FaceOnDocumentDetectorGoogle newInstance(OnfidoRemoteConfig onfidoRemoteConfig) {
        return new FaceOnDocumentDetectorGoogle(onfidoRemoteConfig);
    }

    @Override // com.onfido.javax.inject.Provider
    public FaceOnDocumentDetectorGoogle get() {
        return newInstance((OnfidoRemoteConfig) this.remoteConfigProvider.get());
    }
}
