package com.onfido.android.sdk.capture.internal.metadata;

import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.environment.EnvironmentIntegrityChecker;
import com.onfido.android.sdk.capture.utils.CameraMetadataProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkUploadMetadataHelper_Factory implements b {
    private final Provider cameraMetadataProvider;
    private final Provider environmentIntegrityCheckerProvider;
    private final Provider identityInteractorProvider;
    private final Provider onfidoRemoteConfigProvider;

    public SdkUploadMetadataHelper_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.identityInteractorProvider = provider;
        this.onfidoRemoteConfigProvider = provider2;
        this.environmentIntegrityCheckerProvider = provider3;
        this.cameraMetadataProvider = provider4;
    }

    public static SdkUploadMetadataHelper_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        return new SdkUploadMetadataHelper_Factory(provider, provider2, provider3, provider4);
    }

    public static SdkUploadMetadataHelper newInstance(IdentityInteractor identityInteractor, OnfidoRemoteConfig onfidoRemoteConfig, EnvironmentIntegrityChecker environmentIntegrityChecker, CameraMetadataProvider cameraMetadataProvider) {
        return new SdkUploadMetadataHelper(identityInteractor, onfidoRemoteConfig, environmentIntegrityChecker, cameraMetadataProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public SdkUploadMetadataHelper get() {
        return newInstance((IdentityInteractor) this.identityInteractorProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (EnvironmentIntegrityChecker) this.environmentIntegrityCheckerProvider.get(), (CameraMetadataProvider) this.cameraMetadataProvider.get());
    }
}
