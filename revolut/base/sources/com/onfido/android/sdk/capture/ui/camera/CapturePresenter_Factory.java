package com.onfido.android.sdk.capture.ui.camera;

import android.os.ResultReceiver;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.common.permissions.RuntimePermissionsManager;
import com.onfido.android.sdk.capture.detector.face.FaceDetector;
import com.onfido.android.sdk.capture.detector.mrzextraction.MRZDocumentExtractor;
import com.onfido.android.sdk.capture.detector.rectangle.RectangleDetector;
import com.onfido.android.sdk.capture.document.DocumentConfigurationManager;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.CaptureTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.LivenessTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.NfcTracker;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.WaitingScreenTracker;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.nfc.NfcInteractor;
import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.usecase.AccessibleDocumentCaptureUseCase;
import com.onfido.android.sdk.capture.internal.usecase.DocumentProcessingUseCase;
import com.onfido.android.sdk.capture.internal.usecase.FaceProcessingUseCase;
import com.onfido.android.sdk.capture.internal.usecase.validation.DocumentValidationUseCase;
import com.onfido.android.sdk.capture.internal.util.DispatchersProvider;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResultsFailureAnalyzer;
import com.onfido.android.sdk.capture.internal.validation.RetainableValidationsResult;
import com.onfido.android.sdk.capture.native_detector.NativeDetector;
import com.onfido.android.sdk.capture.ui.camera.liveness.capture.LivenessInteractor;
import com.onfido.android.sdk.capture.ui.camera.rx.DocumentCaptureDelayTransformer;
import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.android.sdk.capture.validation.BackendDocumentValidationsManager;
import com.onfido.android.sdk.capture.validation.BarcodeValidationSuspender;
import com.onfido.android.sdk.capture.validation.PostCaptureDocumentValidationsManager;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class CapturePresenter_Factory implements el.b {
    private final Provider accessibleDocumentCaptureUseCaseProvider;
    private final Provider announcementServiceProvider;
    private final Provider backendDocumentValidationsManagerProvider;
    private final Provider barcodeValidationSuspenderProvider;
    private final Provider captureTrackerProvider;
    private final Provider dispatchersProvider;
    private final Provider documentConfigurationManagerProvider;
    private final Provider documentDelayTransformerProvider;
    private final Provider documentProcessingFailureAnalyzerProvider;
    private final Provider documentProcessingUseCaseProvider;
    private final Provider documentServiceProvider;
    private final Provider documentValidationUseCaseProvider;
    private final Provider faceDetectorProvider;
    private final Provider faceProcessingUseCaseProvider;
    private final Provider flowTrackerProvider;
    private final Provider identityInteractorProvider;
    private final Provider imageUtilsProvider;
    private final Provider livenessInteractorProvider;
    private final Provider livenessTrackerProvider;
    private final Provider mediaCallbackProvider;
    private final Provider mrzDocumentExtractorProvider;
    private final Provider nativeDetectorProvider;
    private final Provider nfcInteractorProvider;
    private final Provider nfcPropertiesServiceProvider;
    private final Provider nfcTrackerProvider;
    private final Provider onfidoRemoteConfigProvider;
    private final Provider permissionsManagerProvider;
    private final Provider postCaptureDocumentValidationsManagerProvider;
    private final Provider rectangleDetectorProvider;
    private final Provider retainableValidationsResultProvider;
    private final Provider schedulersProvider;
    private final Provider sdkUploadMetaDataHelperProvider;
    private final Provider timeProvider;
    private final Provider waitingScreenTrackerProvider;

    public CapturePresenter_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27, Provider provider28, Provider provider29, Provider provider30, Provider provider31, Provider provider32, Provider provider33, Provider provider34) {
        this.nativeDetectorProvider = provider;
        this.rectangleDetectorProvider = provider2;
        this.accessibleDocumentCaptureUseCaseProvider = provider3;
        this.livenessInteractorProvider = provider4;
        this.backendDocumentValidationsManagerProvider = provider5;
        this.documentProcessingUseCaseProvider = provider6;
        this.postCaptureDocumentValidationsManagerProvider = provider7;
        this.permissionsManagerProvider = provider8;
        this.faceDetectorProvider = provider9;
        this.identityInteractorProvider = provider10;
        this.documentConfigurationManagerProvider = provider11;
        this.timeProvider = provider12;
        this.sdkUploadMetaDataHelperProvider = provider13;
        this.documentServiceProvider = provider14;
        this.nfcPropertiesServiceProvider = provider15;
        this.nfcInteractorProvider = provider16;
        this.documentDelayTransformerProvider = provider17;
        this.schedulersProvider = provider18;
        this.faceProcessingUseCaseProvider = provider19;
        this.onfidoRemoteConfigProvider = provider20;
        this.announcementServiceProvider = provider21;
        this.documentProcessingFailureAnalyzerProvider = provider22;
        this.retainableValidationsResultProvider = provider23;
        this.barcodeValidationSuspenderProvider = provider24;
        this.imageUtilsProvider = provider25;
        this.captureTrackerProvider = provider26;
        this.nfcTrackerProvider = provider27;
        this.livenessTrackerProvider = provider28;
        this.waitingScreenTrackerProvider = provider29;
        this.flowTrackerProvider = provider30;
        this.mediaCallbackProvider = provider31;
        this.mrzDocumentExtractorProvider = provider32;
        this.documentValidationUseCaseProvider = provider33;
        this.dispatchersProvider = provider34;
    }

    public static CapturePresenter_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27, Provider provider28, Provider provider29, Provider provider30, Provider provider31, Provider provider32, Provider provider33, Provider provider34) {
        return new CapturePresenter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16, provider17, provider18, provider19, provider20, provider21, provider22, provider23, provider24, provider25, provider26, provider27, provider28, provider29, provider30, provider31, provider32, provider33, provider34);
    }

    public static CapturePresenter newInstance(NativeDetector nativeDetector, RectangleDetector rectangleDetector, AccessibleDocumentCaptureUseCase accessibleDocumentCaptureUseCase, LivenessInteractor livenessInteractor, BackendDocumentValidationsManager backendDocumentValidationsManager, DocumentProcessingUseCase documentProcessingUseCase, PostCaptureDocumentValidationsManager postCaptureDocumentValidationsManager, RuntimePermissionsManager runtimePermissionsManager, FaceDetector faceDetector, IdentityInteractor identityInteractor, DocumentConfigurationManager documentConfigurationManager, TimeProvider timeProvider, SdkUploadMetadataHelper sdkUploadMetadataHelper, DocumentService documentService, NfcPropertiesService nfcPropertiesService, NfcInteractor nfcInteractor, DocumentCaptureDelayTransformer documentCaptureDelayTransformer, SchedulersProvider schedulersProvider, FaceProcessingUseCase faceProcessingUseCase, OnfidoRemoteConfig onfidoRemoteConfig, AnnouncementService announcementService, DocumentProcessingResultsFailureAnalyzer documentProcessingResultsFailureAnalyzer, RetainableValidationsResult retainableValidationsResult, BarcodeValidationSuspender barcodeValidationSuspender, ImageUtils imageUtils, CaptureTracker captureTracker, NfcTracker nfcTracker, LivenessTracker livenessTracker, WaitingScreenTracker waitingScreenTracker, FlowTracker flowTracker, ResultReceiver resultReceiver, MRZDocumentExtractor mRZDocumentExtractor, DocumentValidationUseCase documentValidationUseCase, DispatchersProvider dispatchersProvider) {
        return new CapturePresenter(nativeDetector, rectangleDetector, accessibleDocumentCaptureUseCase, livenessInteractor, backendDocumentValidationsManager, documentProcessingUseCase, postCaptureDocumentValidationsManager, runtimePermissionsManager, faceDetector, identityInteractor, documentConfigurationManager, timeProvider, sdkUploadMetadataHelper, documentService, nfcPropertiesService, nfcInteractor, documentCaptureDelayTransformer, schedulersProvider, faceProcessingUseCase, onfidoRemoteConfig, announcementService, documentProcessingResultsFailureAnalyzer, retainableValidationsResult, barcodeValidationSuspender, imageUtils, captureTracker, nfcTracker, livenessTracker, waitingScreenTracker, flowTracker, resultReceiver, mRZDocumentExtractor, documentValidationUseCase, dispatchersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public CapturePresenter get() {
        return newInstance((NativeDetector) this.nativeDetectorProvider.get(), (RectangleDetector) this.rectangleDetectorProvider.get(), (AccessibleDocumentCaptureUseCase) this.accessibleDocumentCaptureUseCaseProvider.get(), (LivenessInteractor) this.livenessInteractorProvider.get(), (BackendDocumentValidationsManager) this.backendDocumentValidationsManagerProvider.get(), (DocumentProcessingUseCase) this.documentProcessingUseCaseProvider.get(), (PostCaptureDocumentValidationsManager) this.postCaptureDocumentValidationsManagerProvider.get(), (RuntimePermissionsManager) this.permissionsManagerProvider.get(), (FaceDetector) this.faceDetectorProvider.get(), (IdentityInteractor) this.identityInteractorProvider.get(), (DocumentConfigurationManager) this.documentConfigurationManagerProvider.get(), (TimeProvider) this.timeProvider.get(), (SdkUploadMetadataHelper) this.sdkUploadMetaDataHelperProvider.get(), (DocumentService) this.documentServiceProvider.get(), (NfcPropertiesService) this.nfcPropertiesServiceProvider.get(), (NfcInteractor) this.nfcInteractorProvider.get(), (DocumentCaptureDelayTransformer) this.documentDelayTransformerProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (FaceProcessingUseCase) this.faceProcessingUseCaseProvider.get(), (OnfidoRemoteConfig) this.onfidoRemoteConfigProvider.get(), (AnnouncementService) this.announcementServiceProvider.get(), (DocumentProcessingResultsFailureAnalyzer) this.documentProcessingFailureAnalyzerProvider.get(), (RetainableValidationsResult) this.retainableValidationsResultProvider.get(), (BarcodeValidationSuspender) this.barcodeValidationSuspenderProvider.get(), (ImageUtils) this.imageUtilsProvider.get(), (CaptureTracker) this.captureTrackerProvider.get(), (NfcTracker) this.nfcTrackerProvider.get(), (LivenessTracker) this.livenessTrackerProvider.get(), (WaitingScreenTracker) this.waitingScreenTrackerProvider.get(), (FlowTracker) this.flowTrackerProvider.get(), (ResultReceiver) this.mediaCallbackProvider.get(), (MRZDocumentExtractor) this.mrzDocumentExtractorProvider.get(), (DocumentValidationUseCase) this.documentValidationUseCaseProvider.get(), (DispatchersProvider) this.dispatchersProvider.get());
    }
}
