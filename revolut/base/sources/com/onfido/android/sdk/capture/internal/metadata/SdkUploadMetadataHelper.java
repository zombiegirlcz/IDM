package com.onfido.android.sdk.capture.internal.metadata;

import com.onfido.android.sdk.capture.DocumentType;
import com.onfido.android.sdk.capture.analytics.IdentityInteractor;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.util.environment.EnvironmentIntegrityChecker;
import com.onfido.android.sdk.capture.internal.validation.DocumentProcessingResults;
import com.onfido.android.sdk.capture.utils.CameraMetadataProvider;
import com.onfido.android.sdk.capture.utils.CountryCode;
import com.onfido.android.sdk.capture.validation.device.BarcodeValidationResult;
import com.onfido.api.client.data.CameraMetadata;
import com.onfido.api.client.data.DeviceMetadata;
import com.onfido.api.client.data.DocSide;
import com.onfido.api.client.data.ExtractedInfo;
import com.onfido.api.client.data.PhotoDetection;
import com.onfido.api.client.data.SdkConfiguration;
import com.onfido.api.client.data.SdkUploadMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0012J\b\u0010\u0017\u001a\u00020\u0018H\u0016J0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0012J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eH\u0012J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eH\u0012R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;", "", "identityInteractor", "Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "environmentIntegrityChecker", "Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;", "cameraMetadataProvider", "Lcom/onfido/android/sdk/capture/utils/CameraMetadataProvider;", "(Lcom/onfido/android/sdk/capture/analytics/IdentityInteractor;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/android/sdk/capture/internal/util/environment/EnvironmentIntegrityChecker;Lcom/onfido/android/sdk/capture/utils/CameraMetadataProvider;)V", "barcodeProcessingResult", "Lcom/onfido/api/client/data/PhotoDetection$BarcodeProcessingResult;", "captureStepDataBundle", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "barcodeResults", "Lcom/onfido/android/sdk/capture/validation/device/BarcodeValidationResult;", "blurProcessingResult", "Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;", "documentProcessingResults", "Lcom/onfido/android/sdk/capture/internal/validation/DocumentProcessingResults;", "blurRejectionCount", "", "create", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "isMRZExtracted", "", "numberOfTakenPhoto", "glareProcessingResult", "isRelevantDocumentForMRZ", "mrzExtractionResult", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SdkUploadMetadataHelper {

    @NotNull
    private final CameraMetadataProvider cameraMetadataProvider;

    @NotNull
    private final EnvironmentIntegrityChecker environmentIntegrityChecker;

    @NotNull
    private final IdentityInteractor identityInteractor;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;

    public SdkUploadMetadataHelper(@NotNull IdentityInteractor identityInteractor, @NotNull OnfidoRemoteConfig onfidoRemoteConfig, @NotNull EnvironmentIntegrityChecker environmentIntegrityChecker, @NotNull CameraMetadataProvider cameraMetadataProvider) {
        Intrinsics.checkNotNullParameter(identityInteractor, "identityInteractor");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        Intrinsics.checkNotNullParameter(environmentIntegrityChecker, "environmentIntegrityChecker");
        Intrinsics.checkNotNullParameter(cameraMetadataProvider, "cameraMetadataProvider");
        this.identityInteractor = identityInteractor;
        this.onfidoRemoteConfig = onfidoRemoteConfig;
        this.environmentIntegrityChecker = environmentIntegrityChecker;
        this.cameraMetadataProvider = cameraMetadataProvider;
    }

    private PhotoDetection.BarcodeProcessingResult barcodeProcessingResult(CaptureStepDataBundle captureStepDataBundle, BarcodeValidationResult barcodeResults) {
        if (DocumentType.DRIVING_LICENCE != captureStepDataBundle.getDocumentType() || DocSide.BACK != captureStepDataBundle.getDocSide() || CountryCode.US != captureStepDataBundle.getCountryCode()) {
            return null;
        }
        String barcodeValue = barcodeResults.getBarcodeValue();
        return new PhotoDetection.BarcodeProcessingResult(barcodeValue != null ? new ExtractedInfo(barcodeValue) : null, barcodeResults.isValid());
    }

    private PhotoDetection.ProcessingResult blurProcessingResult(DocumentProcessingResults documentProcessingResults, int blurRejectionCount) {
        if (documentProcessingResults.getBlurResults().getWasExecuted()) {
            return new PhotoDetection.ProcessingResult(documentProcessingResults.getBlurResults().isValid(), Integer.valueOf(blurRejectionCount));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PhotoDetection.ProcessingResult glareProcessingResult(DocumentProcessingResults documentProcessingResults) {
        Integer num = null;
        Object[] objArr = 0;
        if (documentProcessingResults.getGlareResults().getWasExecuted()) {
            return new PhotoDetection.ProcessingResult(documentProcessingResults.getGlareResults().isValid(), num, 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        }
        return null;
    }

    private boolean isRelevantDocumentForMRZ(CaptureStepDataBundle captureStepDataBundle) {
        if (captureStepDataBundle.getDocumentType() != DocumentType.PASSPORT) {
            return captureStepDataBundle.getDocumentType() == DocumentType.NATIONAL_IDENTITY_CARD && captureStepDataBundle.getCountryCode() == CountryCode.NL && captureStepDataBundle.getDocSide() == DocSide.BACK;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PhotoDetection.ProcessingResult mrzExtractionResult(boolean isMRZExtracted, CaptureStepDataBundle captureStepDataBundle) {
        Integer num = null;
        Object[] objArr = 0;
        if (isRelevantDocumentForMRZ(captureStepDataBundle)) {
            return new PhotoDetection.ProcessingResult(isMRZExtracted, num, 2, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        }
        return null;
    }

    @NotNull
    public SdkUploadMetaData create() {
        Object objA;
        DeviceMetadata deviceSystem$onfido_capture_sdk_core_release = this.identityInteractor.getDeviceSystem$onfido_capture_sdk_core_release();
        SdkConfiguration sdkConfiguration = this.onfidoRemoteConfig.getSdkConfiguration();
        boolean zHasEnvironmentIntegrity = this.environmentIntegrityChecker.hasEnvironmentIntegrity();
        try {
            m.Companion companion = m.INSTANCE;
            objA = this.cameraMetadataProvider.provideCameraMetadata();
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        return new SdkUploadMetaData(null, null, null, null, deviceSystem$onfido_capture_sdk_core_release, sdkConfiguration, null, zHasEnvironmentIntegrity, "onfido-android-sdk", "23.11.0", (CameraMetadata) objA);
    }

    @NotNull
    public SdkUploadMetaData create(@NotNull DocumentProcessingResults documentProcessingResults, int blurRejectionCount, boolean isMRZExtracted, int numberOfTakenPhoto, @NotNull CaptureStepDataBundle captureStepDataBundle) {
        Object objA;
        Intrinsics.checkNotNullParameter(documentProcessingResults, "documentProcessingResults");
        Intrinsics.checkNotNullParameter(captureStepDataBundle, "captureStepDataBundle");
        DeviceMetadata deviceSystem$onfido_capture_sdk_core_release = this.identityInteractor.getDeviceSystem$onfido_capture_sdk_core_release();
        PhotoDetection.ProcessingResult processingResultGlareProcessingResult = glareProcessingResult(documentProcessingResults);
        PhotoDetection.ProcessingResult processingResultBlurProcessingResult = blurProcessingResult(documentProcessingResults, blurRejectionCount);
        PhotoDetection.BarcodeProcessingResult barcodeProcessingResult = barcodeProcessingResult(captureStepDataBundle, documentProcessingResults.getBarcodeResults());
        PhotoDetection.ProcessingResult processingResultMrzExtractionResult = mrzExtractionResult(isMRZExtracted, captureStepDataBundle);
        SdkConfiguration sdkConfiguration = this.onfidoRemoteConfig.getSdkConfiguration();
        Integer numValueOf = Integer.valueOf(numberOfTakenPhoto);
        boolean zHasEnvironmentIntegrity = this.environmentIntegrityChecker.hasEnvironmentIntegrity();
        try {
            m.Companion companion = m.INSTANCE;
            objA = this.cameraMetadataProvider.provideCameraMetadata();
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        return new SdkUploadMetaData(processingResultGlareProcessingResult, processingResultBlurProcessingResult, barcodeProcessingResult, processingResultMrzExtractionResult, deviceSystem$onfido_capture_sdk_core_release, sdkConfiguration, numValueOf, zHasEnvironmentIntegrity, "onfido-android-sdk", "23.11.0", (CameraMetadata) objA);
    }
}
