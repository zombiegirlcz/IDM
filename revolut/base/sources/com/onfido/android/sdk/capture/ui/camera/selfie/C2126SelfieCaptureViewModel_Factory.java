package com.onfido.android.sdk.capture.ui.camera.selfie;

import androidx.lifecycle.SavedStateHandle;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.usecase.MediaCallbacksUseCase;
import com.onfido.android.sdk.capture.ui.camera.CaptureUploadService;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureViewModel_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2126SelfieCaptureViewModel_Factory {
    private final Provider mediaCallbacksUseCaseProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider sdkUploadMetaDataHelperProvider;
    private final Provider storageProvider;
    private final Provider timeProvider;
    private final Provider trackerProvider;
    private final Provider uploadServiceFactoryProvider;

    public C2126SelfieCaptureViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.uploadServiceFactoryProvider = provider;
        this.timeProvider = provider2;
        this.trackerProvider = provider3;
        this.storageProvider = provider4;
        this.onfidoRemoteConfigProvider = provider5;
        this.sdkUploadMetaDataHelperProvider = provider6;
        this.mediaCallbacksUseCaseProvider = provider7;
    }

    public static C2126SelfieCaptureViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        return new C2126SelfieCaptureViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static SelfieCaptureViewModel newInstance(CaptureUploadService.Factory factory, TimeProvider timeProvider, SelfieCaptureTracker selfieCaptureTracker, SharedPreferencesDataSource sharedPreferencesDataSource, OnfidoRemoteConfig onfidoRemoteConfig, SdkUploadMetadataHelper sdkUploadMetadataHelper, MediaCallbacksUseCase mediaCallbacksUseCase, SavedStateHandle savedStateHandle) {
        return new SelfieCaptureViewModel(factory, timeProvider, selfieCaptureTracker, sharedPreferencesDataSource, onfidoRemoteConfig, sdkUploadMetadataHelper, mediaCallbacksUseCase, savedStateHandle);
    }

    public SelfieCaptureViewModel get(SavedStateHandle savedStateHandle) {
        return newInstance((CaptureUploadService.Factory) this.uploadServiceFactoryProvider.get(), (TimeProvider) this.timeProvider.get(), (SelfieCaptureTracker) this.trackerProvider.get(), (SharedPreferencesDataSource) this.storageProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (SdkUploadMetadataHelper) this.sdkUploadMetaDataHelperProvider.get(), (MediaCallbacksUseCase) this.mediaCallbacksUseCaseProvider.get(), savedStateHandle);
    }
}
