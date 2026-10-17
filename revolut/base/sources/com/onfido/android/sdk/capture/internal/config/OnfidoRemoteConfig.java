package com.onfido.android.sdk.capture.internal.config;

import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.workflow.internal.WaitingScreenThreshold;
import com.onfido.api.client.data.SdkConfiguration;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0012\u0010\u0017\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0012\u0010\u0018\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0012\u0010\u0019\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0012\u0010\u001a\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0012\u0010\u001b\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0012\u0010\u001c\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0015R\u0012\u0010\u001d\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0012\u0010\u001e\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015R\u0012\u0010\u001f\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u0012\u0010 \u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0015R\u0012\u0010!\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0015R\u0012\u0010\"\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0015R\u0012\u0010#\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0015R\u0012\u0010$\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0012\u0010%\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0015R\u0012\u0010&\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0012\u0010'\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0015R\u0012\u0010(\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0015R\u0012\u0010)\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0015R\u0012\u0010*\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0015R\u0012\u0010+\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0015R\u0018\u0010,\u001a\u00020\u0013X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010.R\u0012\u0010/\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0015R\u0012\u00100\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0015R\u0012\u00101\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0015R\u0012\u00102\u001a\u000203X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0012\u00106\u001a\u000207X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001e\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0012\u0010@\u001a\u00020AX¦\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0012\u0010D\u001a\u00020EX¦\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0012\u0010H\u001a\u00020IX¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0012\u0010L\u001a\u00020MX¦\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001e\u0010P\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020=0;X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010?¨\u0006R"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "", "cameraXConfiguration", "Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;", "getCameraXConfiguration", "()Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;", "documentCapture", "Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;", "getDocumentCapture", "()Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;", "documentDetectionExperiment", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment;", "getDocumentDetectionExperiment", "()Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment;", "documentPostCaptureValidationTargetWidth", "", "getDocumentPostCaptureValidationTargetWidth", "()I", "enableWebModuleBasedPoa", "", "getEnableWebModuleBasedPoa", "()Z", "isApplicantConsentRequired", "isAutoFlashModeEnabled", "isCameraXEnabled", "isCameraXHighQualityModeEnabled", "isCameraxStreamSharingEnabled", "isCutoffImprovementsEnabled", "isDocumentCropDisabled", "isDocumentSupportRulesEnabled", "isEnvironmentIntegrityCheckEnabled", "isFocusImprovementsEnabled", "isFourByThreeEnabled", "isGenericMrzValidatorEnabled", "isImageQualityServiceEnabled", "isIncreasedCompressionQualityEnabled", "isInhouseAnalyticsEnabled", "isMediaCallbackCroppingDisabled", "isMotionCameraXEnabled", "isMotionTensorFlowLiteEnabled", "isMultiImageCaptureEnabled", "isOnDeviceMRZExtractionEnabled", "isPassportCardEnabled", "isPerformanceAnalyticsEnabled", "isRefactoredCaptureEnabled", "setRefactoredCaptureEnabled", "(Z)V", "isResolutionImprovementsEnabled", "isStudioUserFlowBackButtonEnabled", "isStudioUserFlowExitEnabled", "livenessCapture", "Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "getLivenessCapture", "()Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "loggerConfiguration", "Lcom/onfido/api/client/data/SdkConfiguration$LoggerConfiguration;", "getLoggerConfiguration", "()Lcom/onfido/api/client/data/SdkConfiguration$LoggerConfiguration;", "mediaWaitingScreensTimeThresholds", "", "Lcom/onfido/android/sdk/workflow/internal/WaitingScreenThreshold;", "", "getMediaWaitingScreensTimeThresholds", "()Ljava/util/Map;", "motionCapture", "Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture;", "getMotionCapture", "()Lcom/onfido/api/client/data/SdkConfiguration$MotionCapture;", "motionExperiment", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$MotionExperiment;", "getMotionExperiment", "()Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures$MotionExperiment;", "sdkConfiguration", "Lcom/onfido/api/client/data/SdkConfiguration;", "getSdkConfiguration", "()Lcom/onfido/api/client/data/SdkConfiguration;", "selfieCapture", "Lcom/onfido/api/client/data/SdkConfiguration$SelfieCapture;", "getSelfieCapture", "()Lcom/onfido/api/client/data/SdkConfiguration$SelfieCapture;", "studioWaitingScreensTimeThresholds", "getStudioWaitingScreensTimeThresholds", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface OnfidoRemoteConfig {
    @NotNull
    SdkConfiguration.CameraXConfiguration getCameraXConfiguration();

    @NotNull
    SdkConfiguration.DocumentCapture getDocumentCapture();

    @NotNull
    SdkConfiguration.ExperimentalFeatures.DocumentDetectionExperiment getDocumentDetectionExperiment();

    int getDocumentPostCaptureValidationTargetWidth();

    boolean getEnableWebModuleBasedPoa();

    @NotNull
    SdkConfiguration.LivenessCapture getLivenessCapture();

    @NotNull
    SdkConfiguration.LoggerConfiguration getLoggerConfiguration();

    @NotNull
    Map<WaitingScreenThreshold, Long> getMediaWaitingScreensTimeThresholds();

    @NotNull
    SdkConfiguration.MotionCapture getMotionCapture();

    @NotNull
    SdkConfiguration.ExperimentalFeatures.MotionExperiment getMotionExperiment();

    @NotNull
    SdkConfiguration getSdkConfiguration();

    @NotNull
    SdkConfiguration.SelfieCapture getSelfieCapture();

    @NotNull
    Map<WaitingScreenThreshold, Long> getStudioWaitingScreensTimeThresholds();

    boolean isApplicantConsentRequired();

    boolean isAutoFlashModeEnabled();

    boolean isCameraXEnabled();

    boolean isCameraXHighQualityModeEnabled();

    boolean isCameraxStreamSharingEnabled();

    boolean isCutoffImprovementsEnabled();

    boolean isDocumentCropDisabled();

    boolean isDocumentSupportRulesEnabled();

    boolean isEnvironmentIntegrityCheckEnabled();

    boolean isFocusImprovementsEnabled();

    boolean isFourByThreeEnabled();

    boolean isGenericMrzValidatorEnabled();

    boolean isImageQualityServiceEnabled();

    boolean isIncreasedCompressionQualityEnabled();

    boolean isInhouseAnalyticsEnabled();

    boolean isMediaCallbackCroppingDisabled();

    boolean isMotionCameraXEnabled();

    boolean isMotionTensorFlowLiteEnabled();

    boolean isMultiImageCaptureEnabled();

    boolean isOnDeviceMRZExtractionEnabled();

    boolean isPassportCardEnabled();

    boolean isPerformanceAnalyticsEnabled();

    boolean isRefactoredCaptureEnabled();

    boolean isResolutionImprovementsEnabled();

    boolean isStudioUserFlowBackButtonEnabled();

    boolean isStudioUserFlowExitEnabled();

    void setRefactoredCaptureEnabled(boolean z);
}
