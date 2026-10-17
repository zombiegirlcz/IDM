package com.onfido.android.sdk.capture.ui.camera.document;

import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractor;
import com.onfido.android.sdk.capture.detector.rectangle.RectangleDetector;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase;
import com.onfido.android.sdk.capture.internal.usecase.MediaCallbacksUseCase;
import com.onfido.android.sdk.capture.internal.usecase.NfcUseCase;
import com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationUseCase;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.environment.EnvironmentIntegrityChecker;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResultsFailureAnalyzer;
import com.onfido.android.sdk.capture.internal.validation.RetainableValidationsResult;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.ui.camera.CaptureUploadService;
import com.onfido.android.sdk.capture.ui.camera.DocumentService;
import com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.android.sdk.capture.validation.BackendDocumentValidationsManager;
import com.onfido.android.sdk.capture.validation.BarcodeValidationSuspender;
import com.onfido.android.sdk.capture.validation.PostCaptureDocumentValidationsManager;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class DocumentCaptureViewModel_Factory implements b {
    private final Provider accessibleDocumentCaptureUseCaseProvider;
    private final Provider announcementServiceProvider;
    private final Provider backendDocumentValidationsManagerProvider;
    private final Provider barcodeValidationSuspenderProvider;
    private final Provider dispatchersProvider;
    private final Provider documentCaptureTrackerProvider;
    private final Provider documentConfigurationManagerProvider;
    private final Provider documentDelayTransformerProvider;
    private final Provider documentProcessingFailureAnalyzerProvider;
    private final Provider documentServiceProvider;
    private final Provider documentValidationUseCaseProvider;
    private final Provider environmentIntegrityCheckerProvider;
    private final Provider imageUtilsProvider;
    private final Provider mediaCallbacksUseCaseProvider;
    private final Provider mrzDocumentExtractorProvider;
    private final Provider nativeDetectorProvider;
    private final Provider nfcUseCaseProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider postCaptureDocumentValidationsManagerProvider;
    private final Provider rectangleDetectorProvider;
    private final Provider retainableValidationsResultProvider;
    private final Provider sdkUploadMetaDataHelperProvider;
    private final Provider storageProvider;
    private final Provider timeProvider;
    private final Provider uploadServiceFactoryProvider;

    public DocumentCaptureViewModel_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25) {
        this.documentConfigurationManagerProvider = provider;
        this.nativeDetectorProvider = provider2;
        this.announcementServiceProvider = provider3;
        this.onfidoRemoteConfigProvider = provider4;
        this.sdkUploadMetaDataHelperProvider = provider5;
        this.documentServiceProvider = provider6;
        this.uploadServiceFactoryProvider = provider7;
        this.rectangleDetectorProvider = provider8;
        this.storageProvider = provider9;
        this.backendDocumentValidationsManagerProvider = provider10;
        this.postCaptureDocumentValidationsManagerProvider = provider11;
        this.documentProcessingFailureAnalyzerProvider = provider12;
        this.documentDelayTransformerProvider = provider13;
        this.mediaCallbacksUseCaseProvider = provider14;
        this.nfcUseCaseProvider = provider15;
        this.accessibleDocumentCaptureUseCaseProvider = provider16;
        this.timeProvider = provider17;
        this.documentCaptureTrackerProvider = provider18;
        this.barcodeValidationSuspenderProvider = provider19;
        this.retainableValidationsResultProvider = provider20;
        this.dispatchersProvider = provider21;
        this.environmentIntegrityCheckerProvider = provider22;
        this.imageUtilsProvider = provider23;
        this.mrzDocumentExtractorProvider = provider24;
        this.documentValidationUseCaseProvider = provider25;
    }

    public static DocumentCaptureViewModel_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25) {
        return new DocumentCaptureViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25);
    }

    public static DocumentCaptureViewModel newInstance(DocumentConfigurationManager documentConfigurationManager, NativeDetector nativeDetector, AnnouncementService announcementService, OnfidoRemoteConfig onfidoRemoteConfig, SdkUploadMetadataHelper sdkUploadMetadataHelper, DocumentService documentService, CaptureUploadService.Factory factory, RectangleDetector rectangleDetector, SharedPreferencesDataSource sharedPreferencesDataSource, BackendDocumentValidationsManager backendDocumentValidationsManager, PostCaptureDocumentValidationsManager postCaptureDocumentValidationsManager, DocumentProcessingResultsFailureAnalyzer documentProcessingResultsFailureAnalyzer, DocumentCaptureDelayTransformer documentCaptureDelayTransformer, MediaCallbacksUseCase mediaCallbacksUseCase, NfcUseCase nfcUseCase, AccessibleDocumentCaptureUseCase accessibleDocumentCaptureUseCase, TimeProvider timeProvider, DocumentCaptureTracker documentCaptureTracker, BarcodeValidationSuspender barcodeValidationSuspender, RetainableValidationsResult retainableValidationsResult, DispatchersProvider dispatchersProvider, EnvironmentIntegrityChecker environmentIntegrityChecker, ImageUtils imageUtils, MRZDocumentExtractor mRZDocumentExtractor, DocumentValidationUseCase documentValidationUseCase) {
        return new DocumentCaptureViewModel(documentConfigurationManager, nativeDetector, announcementService, onfidoRemoteConfig, sdkUploadMetadataHelper, documentService, factory, rectangleDetector, sharedPreferencesDataSource, backendDocumentValidationsManager, postCaptureDocumentValidationsManager, documentProcessingResultsFailureAnalyzer, documentCaptureDelayTransformer, mediaCallbacksUseCase, nfcUseCase, accessibleDocumentCaptureUseCase, timeProvider, documentCaptureTracker, barcodeValidationSuspender, retainableValidationsResult, dispatchersProvider, environmentIntegrityChecker, imageUtils, mRZDocumentExtractor, documentValidationUseCase);
    }

    @Override // com.onfido.javax.inject.Provider
    public DocumentCaptureViewModel get() {
        return newInstance((DocumentConfigurationManager) this.documentConfigurationManagerProvider.get(), (NativeDetector) this.nativeDetectorProvider.get(), (AnnouncementService) this.announcementServiceProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (SdkUploadMetadataHelper) this.sdkUploadMetaDataHelperProvider.get(), (DocumentService) this.documentServiceProvider.get(), (CaptureUploadService.Factory) this.uploadServiceFactoryProvider.get(), (RectangleDetector) this.rectangleDetectorProvider.get(), (SharedPreferencesDataSource) this.storageProvider.get(), (BackendDocumentValidationsManager) this.backendDocumentValidationsManagerProvider.get(), (PostCaptureDocumentValidationsManager) this.postCaptureDocumentValidationsManagerProvider.get(), (DocumentProcessingResultsFailureAnalyzer) this.documentProcessingFailureAnalyzerProvider.get(), (DocumentCaptureDelayTransformer) this.documentDelayTransformerProvider.get(), (MediaCallbacksUseCase) this.mediaCallbacksUseCaseProvider.get(), (NfcUseCase) this.nfcUseCaseProvider.get(), (AccessibleDocumentCaptureUseCase) this.accessibleDocumentCaptureUseCaseProvider.get(), (TimeProvider) this.timeProvider.get(), (DocumentCaptureTracker) this.documentCaptureTrackerProvider.get(), (BarcodeValidationSuspender) this.barcodeValidationSuspenderProvider.get(), (RetainableValidationsResult) this.retainableValidationsResultProvider.get(), (DispatchersProvider) this.dispatchersProvider.get(), (EnvironmentIntegrityChecker) this.environmentIntegrityCheckerProvider.get(), (ImageUtils) this.imageUtilsProvider.get(), (MRZDocumentExtractor) this.mrzDocumentExtractorProvider.get(), (DocumentValidationUseCase) this.documentValidationUseCaseProvider.get());
    }
}
