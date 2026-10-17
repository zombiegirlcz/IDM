package com.onfido.android.sdk.capture.ui.camera.selfie;

import android.content.SharedPreferences;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.common.preferences.SharedPreferencesDataSource;
import com.onfido.android.sdk.capture.common.preferences.StorageKey;
import com.onfido.android.sdk.capture.document.DocumentPages;
import com.onfido.android.sdk.capture.flow.CaptureStepDataBundle;
import com.onfido.android.sdk.capture.internal.camera.OnfidoImage;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.metadata.SdkUploadMetadataHelper;
import com.onfido.android.sdk.capture.internal.model.UploadedArtifactKt;
import com.onfido.android.sdk.capture.internal.usecase.MediaCallbacksUseCase;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.CaptureUploadService;
import com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener;
import com.onfido.android.sdk.capture.ui.camera.exception.InvalidCertificateException;
import com.onfido.android.sdk.capture.ui.camera.exception.TokenExpiredException;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureScreen;
import com.onfido.android.sdk.capture.ui.options.Orientation;
import com.onfido.android.sdk.capture.upload.ErrorType;
import com.onfido.android.sdk.capture.utils.ErrorTypeUtilsKt;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.api.client.data.DocSide;
import com.onfido.api.client.data.LivePhotoUpload;
import com.onfido.api.client.data.SdkUploadMetaData;
import j6.a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import ukm.f;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0000\u0018\u0000 ~2\u00020\u00012\u00020\u0002:\b~\u007f\u0080\u0001\u0081\u0001\u0082\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020\u001dH\u0002J\b\u0010M\u001a\u00020HH\u0002J\u0006\u0010N\u001a\u00020\u0016J\r\u0010O\u001a\u00020HH\u0000¢\u0006\u0002\bPJ\u0018\u0010Q\u001a\u00020H2\u0006\u0010L\u001a\u00020\u001d2\b\u0010I\u001a\u0004\u0018\u00010JJ\r\u0010R\u001a\u00020HH\u0000¢\u0006\u0002\bSJ\u0015\u0010T\u001a\u00020H2\u0006\u0010U\u001a\u00020VH\u0000¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020HH\u0002J\u0010\u0010Y\u001a\u00020H2\u0006\u0010Z\u001a\u00020[H\u0002J\u0010\u0010\\\u001a\u00020H2\u0006\u0010]\u001a\u00020^H\u0016J\u0006\u0010_\u001a\u00020HJ\b\u0010`\u001a\u00020HH\u0002J\u0010\u0010a\u001a\u00020H2\u0006\u0010b\u001a\u00020!H\u0016J\b\u0010c\u001a\u00020HH\u0002J\b\u0010d\u001a\u00020HH\u0002J\u0010\u0010e\u001a\u00020H2\u0006\u0010b\u001a\u00020!H\u0002J\b\u0010f\u001a\u00020gH\u0002J\b\u0010h\u001a\u00020\u0016H\u0002J\u001c\u0010i\u001a\u00020H2\b\b\u0001\u0010j\u001a\u0002092\b\b\u0001\u0010Z\u001a\u000209H\u0002J\u0010\u0010k\u001a\u00020H2\u0006\u0010l\u001a\u00020mH\u0002J\u0015\u0010n\u001a\u00020H2\u0006\u0010U\u001a\u00020VH\u0000¢\u0006\u0002\boJ\u0010\u0010p\u001a\u00020H2\b\u0010b\u001a\u0004\u0018\u00010!J\u0006\u0010q\u001a\u00020HJ\u0010\u0010r\u001a\u00020H2\u0006\u0010s\u001a\u00020\u0016H\u0002J\u0006\u0010t\u001a\u00020HJ\u0018\u0010u\u001a\u00020H2\u0006\u0010v\u001a\u00020\u00162\u0006\u0010w\u001a\u00020\u0016H\u0002J\b\u0010x\u001a\u00020HH\u0002J\b\u0010y\u001a\u00020HH\u0002J\u0016\u0010z\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010s\u001a\u00020\u0016J\u0010\u0010{\u001a\u00020H2\u0006\u0010|\u001a\u00020}H\u0002R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR(\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010 \u001a\u0004\u0018\u00010!8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR$\u00100\u001a\u00020/2\u0006\u0010 \u001a\u00020/8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010:\u001a\u0002092\u0006\u0010 \u001a\u0002098B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010\u001fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010B\u001a\u0002092\u0006\u0010 \u001a\u0002098B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0083\u0001"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadServiceListener;", "uploadServiceFactory", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService$Factory;", "timeProvider", "Lcom/onfido/android/sdk/capture/utils/TimeProvider;", "tracker", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureTracker;", "storage", "Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;", "onfidoRemoteConfig", "Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;", "sdkUploadMetaDataHelper", "Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;", "mediaCallbacksUseCase", "Lcom/onfido/android/sdk/capture/internal/usecase/MediaCallbacksUseCase;", "savedState", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService$Factory;Lcom/onfido/android/sdk/capture/utils/TimeProvider;Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureTracker;Lcom/onfido/android/sdk/capture/common/preferences/SharedPreferencesDataSource;Lcom/onfido/android/sdk/capture/internal/config/OnfidoRemoteConfig;Lcom/onfido/android/sdk/capture/internal/metadata/SdkUploadMetadataHelper;Lcom/onfido/android/sdk/capture/internal/usecase/MediaCallbacksUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_captureButtonVisibility", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "captureButtonVisibility", "Lkotlinx/coroutines/flow/StateFlow;", "getCaptureButtonVisibility$onfido_capture_sdk_core_release", "()Lkotlinx/coroutines/flow/StateFlow;", "captureResult", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureScreen$SelfieCaptureResult;", "getCaptureResult$onfido_capture_sdk_core_release", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "value", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "currentCaptureFlowError", "getCurrentCaptureFlowError", "()Lcom/onfido/android/sdk/capture/upload/ErrorType;", "setCurrentCaptureFlowError", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;)V", "documentData", "Lcom/onfido/android/sdk/capture/flow/CaptureStepDataBundle;", "errorDescriptorFlow", "Lcom/onfido/android/sdk/capture/errors/ErrorDescriptor;", "getErrorDescriptorFlow$onfido_capture_sdk_core_release", "errorMessageFlow", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$ErrorMessageEvent;", "getErrorMessageFlow$onfido_capture_sdk_core_release", "", "faceSelfieUploadStartTime", "getFaceSelfieUploadStartTime", "()J", "setFaceSelfieUploadStartTime", "(J)V", "loadingFlow", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$LoadingEvent;", "getLoadingFlow$onfido_capture_sdk_core_release", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "", "rejectionCount", "getRejectionCount", "()I", "setRejectionCount", "(I)V", "showConfirmationFlow", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$ShowConfirmationEvent;", "getShowConfirmationFlow$onfido_capture_sdk_core_release", "takenPhotoCount", "getTakenPhotoCount", "setTakenPhotoCount", "uploadService", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureUploadService;", "callMediaCallback", "", "capturedImage", "Lcom/onfido/android/sdk/capture/internal/camera/OnfidoImage;", "finishWithResult", "result", "hideLoading", "isDarkModeEnabled", "onCameraStarted", "onCameraStarted$onfido_capture_sdk_core_release", "onCaptureCompleted", "onCaptureRequested", "onCaptureRequested$onfido_capture_sdk_core_release", "onConfirmationStepTracking", "orientation", "Lcom/onfido/android/sdk/capture/ui/options/Orientation;", "onConfirmationStepTracking$onfido_capture_sdk_core_release", "onGeneralUploadError", "onInvalidCertificateDetected", "message", "", "onLivePhotoUploaded", "photoUpload", "Lcom/onfido/api/client/data/LivePhotoUpload;", "onPictureCaptured", "onTokenExpired", "onUploadError", "errorType", "onUploadFailure", "onUploadFailureWithGeoblocking", "onUploadValidationError", "sdkUploadMetadata", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "shouldForceRetry", "showErrorMessage", "title", "showLoading", "mode", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "trackCapture", "trackCapture$onfido_capture_sdk_core_release", "trackCaptureError", "trackCaptureShutterClicked", "trackDocumentCaptureFlowCompleted", "confirmationOn", "trackRetakeImage", "trackSelfieCapture", "isConfirmation", "isPortrait", "trackUploadStarted", "trackWaitingScreenCompleted", "uploadSelfie", "uploadSelfieForValidation", "jpegData", "", "Companion", "ErrorMessageEvent", "Factory", "LoadingEvent", "ShowConfirmationEvent", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SelfieCaptureViewModel extends ViewModel implements CaptureUploadServiceListener {

    @NotNull
    private final MutableStateFlow _captureButtonVisibility;

    @NotNull
    private final StateFlow captureButtonVisibility;

    @NotNull
    private final MutableSharedFlow captureResult;

    @NotNull
    private final CaptureStepDataBundle documentData;

    @NotNull
    private final MutableSharedFlow errorDescriptorFlow;

    @NotNull
    private final MutableSharedFlow errorMessageFlow;

    @NotNull
    private final MutableStateFlow loadingFlow;

    @NotNull
    private final MediaCallbacksUseCase mediaCallbacksUseCase;

    @NotNull
    private final OnfidoRemoteConfig onfidoRemoteConfig;

    @NotNull
    private final SavedStateHandle savedState;

    @NotNull
    private final SdkUploadMetadataHelper sdkUploadMetaDataHelper;

    @NotNull
    private final MutableSharedFlow showConfirmationFlow;

    @NotNull
    private final SharedPreferencesDataSource storage;

    @NotNull
    private final TimeProvider timeProvider;

    @NotNull
    private final SelfieCaptureTracker tracker;

    @NotNull
    private final CaptureUploadService uploadService;

    @NotNull
    private static final String SAVED_KEY_TAKEN_PHOTO_COUNT = "takenPhotoCount";

    @NotNull
    private static final String SAVED_KEY_FACE_SELFIE_UPLOAD_START_TIME = "faceSelfieUploadStartTime";

    @NotNull
    private static final String SAVED_KEY_CURRENT_CAPTURE_FLOW_ERROR = "currentCaptureFlowError";

    @NotNull
    private static final String SAVED_KEY_REJECTION_COUNT = "rejectionCount";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$ErrorMessageEvent;", "", "title", "", "message", "(II)V", "getMessage", "()I", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorMessageEvent {
        private final int message;
        private final int title;

        public ErrorMessageEvent(int i, int i2) {
            this.title = i;
            this.message = i2;
        }

        public static /* synthetic */ ErrorMessageEvent copy$default(ErrorMessageEvent errorMessageEvent, int i, int i2, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                i = errorMessageEvent.title;
            }
            if ((i3 & 2) != 0) {
                i2 = errorMessageEvent.message;
            }
            return errorMessageEvent.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getMessage() {
            return this.message;
        }

        @NotNull
        public final ErrorMessageEvent copy(int title, int message) {
            return new ErrorMessageEvent(title, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorMessageEvent)) {
                return false;
            }
            ErrorMessageEvent errorMessageEvent = (ErrorMessageEvent) other;
            return this.title == errorMessageEvent.title && this.message == errorMessageEvent.message;
        }

        public final int getMessage() {
            return this.message;
        }

        public final int getTitle() {
            return this.title;
        }

        public int hashCode() {
            return Integer.hashCode(this.message) + (Integer.hashCode(this.title) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("ErrorMessageEvent(title=");
            sb6.append(this.title);
            sb6.append(", message=");
            return a.t(sb6, this.message, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        SelfieCaptureViewModel create(@NotNull SavedStateHandle handle);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$LoadingEvent;", "", "()V", "Hide", "Show", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$LoadingEvent$Hide;", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$LoadingEvent$Show;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class LoadingEvent {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$LoadingEvent$Hide;", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$LoadingEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Hide extends LoadingEvent {

            @NotNull
            public static final Hide INSTANCE = new Hide();

            private Hide() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$LoadingEvent$Show;", "Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$LoadingEvent;", "mode", "Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "(Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;)V", "getMode", "()Lcom/onfido/android/sdk/capture/utils/LoadingFragment$Companion$DialogMode;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Show extends LoadingEvent {

            @NotNull
            private final LoadingFragment.Companion.DialogMode mode;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Show(@NotNull LoadingFragment.Companion.DialogMode mode) {
                super(null);
                Intrinsics.checkNotNullParameter(mode, "mode");
                this.mode = mode;
            }

            public static /* synthetic */ Show copy$default(Show show, LoadingFragment.Companion.DialogMode dialogMode, int i, Object obj2) {
                if ((i & 1) != 0) {
                    dialogMode = show.mode;
                }
                return show.copy(dialogMode);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final LoadingFragment.Companion.DialogMode getMode() {
                return this.mode;
            }

            @NotNull
            public final Show copy(@NotNull LoadingFragment.Companion.DialogMode mode) {
                Intrinsics.checkNotNullParameter(mode, "mode");
                return new Show(mode);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Show) && Intrinsics.f(this.mode, ((Show) other).mode);
            }

            @NotNull
            public final LoadingFragment.Companion.DialogMode getMode() {
                return this.mode;
            }

            public int hashCode() {
                return this.mode.hashCode();
            }

            @NotNull
            public String toString() {
                return "Show(mode=" + this.mode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        private LoadingEvent() {
        }

        public /* synthetic */ LoadingEvent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/selfie/SelfieCaptureViewModel$ShowConfirmationEvent;", "", "showForceRetry", "", "(Z)V", "getShowForceRetry", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowConfirmationEvent {
        private final boolean showForceRetry;

        public ShowConfirmationEvent(boolean z) {
            this.showForceRetry = z;
        }

        public static /* synthetic */ ShowConfirmationEvent copy$default(ShowConfirmationEvent showConfirmationEvent, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                z = showConfirmationEvent.showForceRetry;
            }
            return showConfirmationEvent.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getShowForceRetry() {
            return this.showForceRetry;
        }

        @NotNull
        public final ShowConfirmationEvent copy(boolean showForceRetry) {
            return new ShowConfirmationEvent(showForceRetry);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowConfirmationEvent) && this.showForceRetry == ((ShowConfirmationEvent) other).showForceRetry;
        }

        public final boolean getShowForceRetry() {
            return this.showForceRetry;
        }

        public int hashCode() {
            return Boolean.hashCode(this.showForceRetry);
        }

        @NotNull
        public String toString() {
            return a.x(new StringBuilder("ShowConfirmationEvent(showForceRetry="), this.showForceRetry, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public SelfieCaptureViewModel(@NotNull CaptureUploadService.Factory uploadServiceFactory, @NotNull TimeProvider timeProvider, @NotNull SelfieCaptureTracker tracker, @NotNull SharedPreferencesDataSource storage, @NotNull OnfidoRemoteConfig onfidoRemoteConfig, @NotNull SdkUploadMetadataHelper sdkUploadMetaDataHelper, @NotNull MediaCallbacksUseCase mediaCallbacksUseCase, @NotNull SavedStateHandle savedState) {
        Intrinsics.checkNotNullParameter(uploadServiceFactory, "uploadServiceFactory");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(onfidoRemoteConfig, "onfidoRemoteConfig");
        Intrinsics.checkNotNullParameter(sdkUploadMetaDataHelper, "sdkUploadMetaDataHelper");
        Intrinsics.checkNotNullParameter(mediaCallbacksUseCase, "mediaCallbacksUseCase");
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        this.timeProvider = timeProvider;
        this.tracker = tracker;
        this.storage = storage;
        this.onfidoRemoteConfig = onfidoRemoteConfig;
        this.sdkUploadMetaDataHelper = sdkUploadMetaDataHelper;
        this.mediaCallbacksUseCase = mediaCallbacksUseCase;
        this.savedState = savedState;
        CaptureType captureType = CaptureType.FACE;
        this.documentData = new CaptureStepDataBundle(captureType, null, null, null, DocSide.FRONT, "", DocumentPages.FRONT_AND_BACK);
        this.uploadService = uploadServiceFactory.create(captureType, this);
        this.loadingFlow = q.c(LoadingEvent.Hide.INSTANCE);
        f fVar = f.DROP_OLDEST;
        this.captureResult = q.b(1, 1, fVar);
        this.errorMessageFlow = q.b(1, 1, fVar);
        this.showConfirmationFlow = q.b(1, 1, fVar);
        this.errorDescriptorFlow = q.b(1, 1, fVar);
        j2 j2VarC = q.c(Boolean.FALSE);
        this._captureButtonVisibility = j2VarC;
        this.captureButtonVisibility = j2VarC;
    }

    private final void callMediaCallback(OnfidoImage capturedImage) {
        MediaCallbacksUseCase.callMediaCallbackForPhotoCapture$onfido_capture_sdk_core_release$default(this.mediaCallbacksUseCase, CaptureType.FACE, capturedImage.getData(), null, null, null, 28, null);
    }

    private final void finishWithResult(SelfieCaptureScreen.SelfieCaptureResult result) {
        this.captureResult.k(result);
    }

    private final ErrorType getCurrentCaptureFlowError() {
        String str = (String) this.savedState.get("currentCaptureFlowError");
        if (str != null) {
            return ErrorType.INSTANCE.of(str);
        }
        return null;
    }

    private final long getFaceSelfieUploadStartTime() {
        Long l2 = (Long) this.savedState.get("faceSelfieUploadStartTime");
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    private final int getRejectionCount() {
        Integer num = (Integer) this.savedState.get("rejectionCount");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getTakenPhotoCount() {
        Integer num = (Integer) this.savedState.get("takenPhotoCount");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final void hideLoading() {
        this.loadingFlow.k(LoadingEvent.Hide.INSTANCE);
    }

    private final void onGeneralUploadError() {
        trackCaptureError(ErrorType.Generic.INSTANCE);
        trackWaitingScreenCompleted();
        int i = R.string.onfido_generic_error_face_capture;
        hideLoading();
        showErrorMessage(R.string.onfido_generic_error_network_title, i);
    }

    private final void onInvalidCertificateDetected(String message) {
        finishWithResult(new SelfieCaptureScreen.SelfieCaptureResult.Error(new InvalidCertificateException(message)));
    }

    private final void onTokenExpired() {
        finishWithResult(new SelfieCaptureScreen.SelfieCaptureResult.Error(TokenExpiredException.INSTANCE));
    }

    private final void onUploadFailure() {
        trackCaptureError(new ErrorType.Network(""));
        trackWaitingScreenCompleted();
        hideLoading();
        showErrorMessage(R.string.onfido_generic_error_network_title, R.string.onfido_generic_error_network_detail);
    }

    private final void onUploadFailureWithGeoblocking() {
        trackCaptureError(ErrorType.Geoblocked.INSTANCE);
        trackWaitingScreenCompleted();
        hideLoading();
        showErrorMessage(R.string.onfido_generic_errors_geoblocked_error_message, R.string.onfido_generic_errors_geoblocked_error_instruction);
    }

    private final void onUploadValidationError(ErrorType errorType) {
        trackCaptureError(errorType);
        hideLoading();
        this.showConfirmationFlow.k(new ShowConfirmationEvent(shouldForceRetry()));
        this.errorDescriptorFlow.k(ErrorTypeUtilsKt.mapErrorType(errorType));
        setRejectionCount(getRejectionCount() + 1);
    }

    private final SdkUploadMetaData sdkUploadMetadata() {
        return this.sdkUploadMetaDataHelper.create();
    }

    private final void setCurrentCaptureFlowError(ErrorType errorType) {
        this.savedState.set("currentCaptureFlowError", errorType != null ? errorType.getKey() : null);
    }

    private final void setFaceSelfieUploadStartTime(long j2) {
        this.savedState.set("faceSelfieUploadStartTime", Long.valueOf(j2));
    }

    private final void setRejectionCount(int i) {
        this.savedState.set("rejectionCount", Integer.valueOf(i));
    }

    private final void setTakenPhotoCount(int i) {
        this.savedState.set("takenPhotoCount", Integer.valueOf(i));
    }

    private final boolean shouldForceRetry() {
        return getRejectionCount() < this.onfidoRemoteConfig.getDocumentCapture().getMaxTotalRetries();
    }

    private final void showErrorMessage(int title, int message) {
        this.errorMessageFlow.k(new ErrorMessageEvent(title, message));
    }

    private final void showLoading(LoadingFragment.Companion.DialogMode mode) {
        this.loadingFlow.k(new LoadingEvent.Show(mode));
    }

    private final void trackDocumentCaptureFlowCompleted(boolean confirmationOn) {
        if (confirmationOn) {
            this.tracker.trackCaptureFlowCompleted(this.documentData);
        }
    }

    private final void trackSelfieCapture(boolean isConfirmation, boolean isPortrait) {
        this.tracker.trackCapture(isConfirmation, isPortrait, getCurrentCaptureFlowError(), getTakenPhotoCount(), getRejectionCount());
    }

    private final void trackUploadStarted() {
        this.tracker.trackUploadStarted(this.documentData, getTakenPhotoCount());
    }

    private final void trackWaitingScreenCompleted() {
        this.tracker.trackWaitingScreenCompletion(new LoadingFragment.Companion.DialogMode.Uploading("UPLOADING_FACE").toTaskType(), "UPLOADING_FACE");
    }

    private final void uploadSelfieForValidation(byte[] jpegData) {
        this.uploadService.uploadSelfie$onfido_capture_sdk_core_release(true, jpegData, sdkUploadMetadata(), this.onfidoRemoteConfig.getSelfieCapture().isPayloadSigningEnabled());
    }

    @NotNull
    /* JADX INFO: renamed from: getCaptureButtonVisibility$onfido_capture_sdk_core_release, reason: from getter */
    public final StateFlow getCaptureButtonVisibility() {
        return this.captureButtonVisibility;
    }

    @NotNull
    /* JADX INFO: renamed from: getCaptureResult$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getCaptureResult() {
        return this.captureResult;
    }

    @NotNull
    /* JADX INFO: renamed from: getErrorDescriptorFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getErrorDescriptorFlow() {
        return this.errorDescriptorFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: getErrorMessageFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getErrorMessageFlow() {
        return this.errorMessageFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: getLoadingFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableStateFlow getLoadingFlow() {
        return this.loadingFlow;
    }

    @NotNull
    /* JADX INFO: renamed from: getShowConfirmationFlow$onfido_capture_sdk_core_release, reason: from getter */
    public final MutableSharedFlow getShowConfirmationFlow() {
        return this.showConfirmationFlow;
    }

    public final boolean isDarkModeEnabled() {
        Boolean boolValueOf;
        Object locale;
        SharedPreferencesDataSource sharedPreferencesDataSource = this.storage;
        StorageKey storageKey = StorageKey.IS_IN_DARK_MODE;
        SharedPreferences prefs$onfido_capture_sdk_core_release = sharedPreferencesDataSource.getPrefs$onfido_capture_sdk_core_release();
        Intrinsics.checkNotNullExpressionValue(prefs$onfido_capture_sdk_core_release, "<get-prefs>(...)");
        String strName = storageKey.name();
        if (prefs$onfido_capture_sdk_core_release.contains(strName)) {
            p0 p0Var = o0.f186429a;
            KClass kClassB = p0Var.b(Boolean.class);
            if (kClassB.equals(p0Var.b(String.class))) {
                locale = prefs$onfido_capture_sdk_core_release.getString(strName, "");
                if (locale == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            } else if (kClassB.equals(p0Var.b(Integer.TYPE))) {
                locale = Integer.valueOf(prefs$onfido_capture_sdk_core_release.getInt(strName, -1));
            } else if (kClassB.equals(p0Var.b(Boolean.TYPE))) {
                boolValueOf = Boolean.valueOf(prefs$onfido_capture_sdk_core_release.getBoolean(strName, false));
            } else if (kClassB.equals(p0Var.b(Float.TYPE))) {
                locale = Float.valueOf(prefs$onfido_capture_sdk_core_release.getFloat(strName, -1.0f));
            } else if (kClassB.equals(p0Var.b(Long.TYPE))) {
                locale = Long.valueOf(prefs$onfido_capture_sdk_core_release.getLong(strName, -1L));
            } else {
                if (!kClassB.equals(p0Var.b(Locale.class))) {
                    throw SharedPreferencesDataSource.Companion.getUNSUPPORTED_TYPE_EXCEPTION();
                }
                locale = sharedPreferencesDataSource.getLocale(prefs$onfido_capture_sdk_core_release, strName);
                if (locale == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            }
            boolValueOf = (Boolean) locale;
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    public final void onCameraStarted$onfido_capture_sdk_core_release() {
        this._captureButtonVisibility.setValue(Boolean.TRUE);
    }

    public final void onCaptureCompleted(@NotNull SelfieCaptureScreen.SelfieCaptureResult result, OnfidoImage capturedImage) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!(result instanceof SelfieCaptureScreen.SelfieCaptureResult.Completed) || capturedImage == null) {
            return;
        }
        callMediaCallback(capturedImage);
    }

    public final void onCaptureRequested$onfido_capture_sdk_core_release() {
        this._captureButtonVisibility.setValue(Boolean.FALSE);
    }

    public final void onConfirmationStepTracking$onfido_capture_sdk_core_release(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        trackSelfieCapture(true, orientation.isPortrait$onfido_capture_sdk_core_release());
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener
    public void onDocumentVideoUploaded(@NotNull String str) {
        CaptureUploadServiceListener.DefaultImpls.onDocumentVideoUploaded(this, str);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener
    public void onLivePhotoUploaded(@NotNull LivePhotoUpload photoUpload) {
        Intrinsics.checkNotNullParameter(photoUpload, "photoUpload");
        trackWaitingScreenCompleted();
        hideLoading();
        long currentTimestamp = this.timeProvider.getCurrentTimestamp() - getFaceSelfieUploadStartTime();
        setCurrentCaptureFlowError(null);
        this.tracker.trackSelfieConfirmationUploadStatus(currentTimestamp, getCurrentCaptureFlowError(), getTakenPhotoCount(), getRejectionCount());
        this.tracker.trackSelfieUploadCompleted(currentTimestamp, getCurrentCaptureFlowError(), getTakenPhotoCount(), getRejectionCount());
        finishWithResult(new SelfieCaptureScreen.SelfieCaptureResult.Completed(photoUpload.getId(), UploadedArtifactKt.toUploadedArtifact(photoUpload)));
        Timber.INSTANCE.d("SelfieUploading", "it's finally done");
    }

    public final void onPictureCaptured() {
        setTakenPhotoCount(getTakenPhotoCount() + 1);
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.CaptureUploadServiceListener
    public void onUploadError(@NotNull ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        if (errorType instanceof ErrorType.Document ? true : Intrinsics.f(errorType, ErrorType.Cutoff.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Glare.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Blur.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.NoFace.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.MultipleFaces.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Barcode.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.PhotoOfScreen.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Screenshot.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Photocopy.INSTANCE) ? true : Intrinsics.f(errorType, ErrorType.Scan.INSTANCE)) {
            onUploadValidationError(errorType);
            return;
        }
        if (errorType instanceof ErrorType.Network) {
            onUploadFailure();
            return;
        }
        if (errorType instanceof ErrorType.InvalidCertificate) {
            onInvalidCertificateDetected(((ErrorType.InvalidCertificate) errorType).getMessage());
            return;
        }
        if (errorType instanceof ErrorType.TokenExpired) {
            onTokenExpired();
        } else if (errorType instanceof ErrorType.Geoblocked) {
            onUploadFailureWithGeoblocking();
        } else if (errorType instanceof ErrorType.Generic) {
            onGeneralUploadError();
        }
    }

    public final void trackCapture$onfido_capture_sdk_core_release(@NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        trackSelfieCapture(false, orientation.isPortrait$onfido_capture_sdk_core_release());
    }

    public final void trackCaptureError(ErrorType errorType) {
        setCurrentCaptureFlowError(errorType);
        this.tracker.trackSelfieConfirmationUploadStatus(this.timeProvider.getCurrentTimestamp() - getFaceSelfieUploadStartTime(), errorType, getTakenPhotoCount(), getRejectionCount());
    }

    public final void trackCaptureShutterClicked() {
        this.tracker.trackCaptureButtonClicked(getCurrentCaptureFlowError(), getTakenPhotoCount(), getRejectionCount());
    }

    public final void trackRetakeImage() {
        this.tracker.trackConfirmationRetakeButtonClicked(getCurrentCaptureFlowError(), getTakenPhotoCount(), getRejectionCount());
    }

    public final void uploadSelfie(@NotNull OnfidoImage capturedImage, boolean confirmationOn) {
        Intrinsics.checkNotNullParameter(capturedImage, "capturedImage");
        this.tracker.trackConfirmationUploadButtonClicked(getCurrentCaptureFlowError(), getTakenPhotoCount(), getRejectionCount());
        showLoading(new LoadingFragment.Companion.DialogMode.Uploading("UPLOADING_FACE"));
        uploadSelfieForValidation(capturedImage.getData());
        trackUploadStarted();
        trackDocumentCaptureFlowCompleted(confirmationOn);
    }
}
