package com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers;

import a0.d;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsFlowStep;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.CaptureStatus;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.Event;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.EventType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.PublicPropertyKey;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.UiAlerts;
import com.onfido.android.sdk.capture.ui.camera.liveness.challenges.LivenessChallengeType;
import com.onfido.android.sdk.capture.upload.ErrorType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b&\bÀ\u0002\u0018\u00002\u00020\u0001:$\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006'"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents;", "", "()V", "FaceConfirmationVideoError", "FaceDetectionTimeout", "FaceSelfieCapture", "FaceSelfieCaptureBackButtonClicked", "FaceSelfieCaptureCaptureButtonClicked", "FaceSelfieConfirmation", "FaceSelfieConfirmationBackButtonClicked", "FaceSelfieConfirmationRetakeButtonClicked", "FaceSelfieConfirmationUploadButtonClicked", "FaceSelfieConfirmationUploadStatus", "FaceSelfieIntro", "FaceSelfieIntroBackButtonClicked", "FaceSelfieIntroTakeSelfieButtonClicked", "FaceSelfieUploadCompleted", "FaceSelfieUploadStarted", "FaceVideoAutoRecordingStarted", "FaceVideoCapture", "FaceVideoCaptureBackButtonClicked", "FaceVideoCaptureFinishButtonClicked", "FaceVideoCaptureFirstChallenge", "FaceVideoCaptureNextButtonClicked", "FaceVideoCaptureSecondChallenge", "FaceVideoCaptureTimeout", "FaceVideoCaptureTimeoutRetryButtonClicked", "FaceVideoConfirmation", "FaceVideoConfirmationBackButtonClicked", "FaceVideoConfirmationRetakeButtonClicked", "FaceVideoConfirmationUploadButtonClicked", "FaceVideoConfirmationUploadStatus", "FaceVideoIntro", "FaceVideoIntroBackButtonClicked", "FaceVideoIntroRecordVideoButtonClicked", "FaceVideoManualRecordingStarted", "FaceVideoUploadCompleted", "FaceVideoUploadStarted", "LivenessChallenge", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LivenessEvents {

    @NotNull
    public static final LivenessEvents INSTANCE = new LivenessEvents();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceConfirmationVideoError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceConfirmationVideoError extends AnalyticsEvent {
        public FaceConfirmationVideoError() {
            super(new Event("VIDEO_FACIAL_CAPTURE_CONFIRMATION_VIDEO_ERROR", EventType.VIEW, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceDetectionTimeout;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceDetectionTimeout extends AnalyticsEvent {

        @NotNull
        public static final FaceDetectionTimeout INSTANCE = new FaceDetectionTimeout();

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        private FaceDetectionTimeout() {
            Object[] objArr = 0 == true ? 1 : 0;
            super(new Event("FACE_VIDEO_CAPTURE_ERROR", EventType.VIEW, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("ui_alerts", new UiAlerts(UiAlerts.UiAlertType.WARNING, objArr, null, null, null, null, null, null, null, 510, null))), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieCapture;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "isPortrait", "", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "takenPhotoCount", "", "rejectionCount", "(ZLcom/onfido/android/sdk/capture/upload/ErrorType;II)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieCapture extends AnalyticsEvent {
        public FaceSelfieCapture(boolean z, ErrorType errorType, int i, int i2) {
            super(new Event("FACE_SELFIE_CAPTURE", EventType.SCREEN, "FACIAL_CAPTURE", OnfidoAnalyticsEventType.SCREEN), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("count_attempts", Integer.valueOf(i)), new Pair("count_rejections", Integer.valueOf(i2)), new Pair("error_message", errorType), new Pair("face_capture_status", errorType == null ? CaptureStatus.SUCCESS : CaptureStatus.ERROR)), q0.c(new Pair(PublicPropertyKey.IS_PORTRAIT, Boolean.valueOf(z))));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieCaptureBackButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "takenPhotoCount", "", "rejectionCount", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;II)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieCaptureBackButtonClicked extends AnalyticsEvent {
        public FaceSelfieCaptureBackButtonClicked(ErrorType errorType, int i, int i2) {
            super(new Event("FACE_SELFIE_CAPTURE_BACK_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("count_attempts", Integer.valueOf(i)), new Pair("count_rejections", Integer.valueOf(i2)), new Pair("error_message", errorType), new Pair("face_capture_status", errorType == null ? CaptureStatus.SUCCESS : CaptureStatus.ERROR)), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieCaptureCaptureButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "takenPhotoCount", "", "rejectionCount", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;II)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieCaptureCaptureButtonClicked extends AnalyticsEvent {
        public FaceSelfieCaptureCaptureButtonClicked(ErrorType errorType, int i, int i2) {
            super(new Event("FACE_SELFIE_CAPTURE_CAPTURE_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("count_attempts", Integer.valueOf(i)), new Pair("count_rejections", Integer.valueOf(i2)), new Pair("error_message", errorType), new Pair("face_capture_status", errorType == null ? CaptureStatus.SUCCESS : CaptureStatus.ERROR)), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieConfirmation;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "isPortrait", "", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "takenPhotoCount", "", "rejectionCount", "(ZLcom/onfido/android/sdk/capture/upload/ErrorType;II)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieConfirmation extends AnalyticsEvent {
        public FaceSelfieConfirmation(boolean z, ErrorType errorType, int i, int i2) {
            super(new Event("FACE_SELFIE_CONFIRMATION", EventType.SCREEN, "FACIAL_CAPTURE_CONFIRMATION", OnfidoAnalyticsEventType.SCREEN), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("error_message", errorType), new Pair("face_capture_status", errorType == null ? CaptureStatus.SUCCESS : CaptureStatus.ERROR), new Pair("count_attempts", Integer.valueOf(i)), new Pair("count_rejections", Integer.valueOf(i2)), new Pair("ui_alerts", Intrinsics.f(errorType, ErrorType.NoFace.INSTANCE) ? new UiAlerts(null, UiAlerts.UiAlertType.ERROR, null, null, null, null, null, null, null, 509, null) : Intrinsics.f(errorType, ErrorType.MultipleFaces.INSTANCE) ? new UiAlerts(null, null, UiAlerts.UiAlertType.ERROR, null, null, null, null, null, null, 507, null) : null)), q0.c(new Pair(PublicPropertyKey.IS_PORTRAIT, Boolean.valueOf(z))));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieConfirmationBackButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "takenPhotoCount", "", "rejectionCount", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;II)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieConfirmationBackButtonClicked extends AnalyticsEvent {
        public FaceSelfieConfirmationBackButtonClicked(ErrorType errorType, int i, int i2) {
            super(new Event("FACE_SELFIE_CONFIRMATION_BACK_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("error_message", errorType), new Pair("count_attempts", Integer.valueOf(i)), new Pair("count_rejections", Integer.valueOf(i2)), new Pair("face_capture_status", errorType == null ? CaptureStatus.SUCCESS : CaptureStatus.ERROR)), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieConfirmationRetakeButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "takenPhotoCount", "", "rejectionCount", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;II)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieConfirmationRetakeButtonClicked extends AnalyticsEvent {
        public FaceSelfieConfirmationRetakeButtonClicked(ErrorType errorType, int i, int i2) {
            super(new Event("FACE_SELFIE_CONFIRMATION_RETAKE_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("error_message", errorType), new Pair("count_attempts", Integer.valueOf(i)), new Pair("count_rejections", Integer.valueOf(i2)), new Pair("face_capture_status", errorType == null ? CaptureStatus.SUCCESS : CaptureStatus.ERROR)), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieConfirmationUploadButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "takenPhotoCount", "", "rejectionCount", "(Lcom/onfido/android/sdk/capture/upload/ErrorType;II)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieConfirmationUploadButtonClicked extends AnalyticsEvent {
        public FaceSelfieConfirmationUploadButtonClicked(ErrorType errorType, int i, int i2) {
            super(new Event("FACE_SELFIE_CONFIRMATION_UPLOAD_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("error_message", errorType), new Pair("face_capture_status", errorType == null ? CaptureStatus.SUCCESS : CaptureStatus.ERROR), new Pair("count_attempts", Integer.valueOf(i)), new Pair("count_rejections", Integer.valueOf(i2))), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieConfirmationUploadStatus;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "duration", "", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "takenPhotoCount", "", "rejectionCount", "(JLcom/onfido/android/sdk/capture/upload/ErrorType;II)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieConfirmationUploadStatus extends AnalyticsEvent {
        public FaceSelfieConfirmationUploadStatus(long j2, ErrorType errorType, int i, int i2) {
            super(new Event("FACE_SELFIE_CONFIRMATION_UPLOAD_STATUS", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("duration", Long.valueOf(j2)), new Pair("error_message", errorType), new Pair("face_capture_status", errorType == null ? CaptureStatus.SUCCESS : CaptureStatus.ERROR), new Pair("ui_alerts", Intrinsics.f(errorType, ErrorType.NoFace.INSTANCE) ? new UiAlerts(null, UiAlerts.UiAlertType.ERROR, null, null, null, null, null, null, null, 509, null) : Intrinsics.f(errorType, ErrorType.MultipleFaces.INSTANCE) ? new UiAlerts(null, null, UiAlerts.UiAlertType.ERROR, null, null, null, null, null, null, 507, null) : null), new Pair("count_attempts", Integer.valueOf(i)), new Pair("count_rejections", Integer.valueOf(i2))), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieIntro;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieIntro extends AnalyticsEvent {

        @NotNull
        public static final FaceSelfieIntro INSTANCE = new FaceSelfieIntro();

        private FaceSelfieIntro() {
            super(new Event("FACE_INTRO", EventType.SCREEN, "FACIAL_INTRO", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieIntroBackButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieIntroBackButtonClicked extends AnalyticsEvent {

        @NotNull
        public static final FaceSelfieIntroBackButtonClicked INSTANCE = new FaceSelfieIntroBackButtonClicked();

        private FaceSelfieIntroBackButtonClicked() {
            super(new Event("FACE_SELFIE_INTRO_BACK_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieIntroTakeSelfieButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieIntroTakeSelfieButtonClicked extends AnalyticsEvent {

        @NotNull
        public static final FaceSelfieIntroTakeSelfieButtonClicked INSTANCE = new FaceSelfieIntroTakeSelfieButtonClicked();

        private FaceSelfieIntroTakeSelfieButtonClicked() {
            super(new Event("FACE_SELFIE_INTRO_TAKE_SELFIE_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieUploadCompleted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "duration", "", "errorType", "Lcom/onfido/android/sdk/capture/upload/ErrorType;", "takenPhotoCount", "", "rejectionCount", "(JLcom/onfido/android/sdk/capture/upload/ErrorType;II)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieUploadCompleted extends AnalyticsEvent {
        public FaceSelfieUploadCompleted(long j2, ErrorType errorType, int i, int i2) {
            super(new Event("FACE_SELFIE_UPLOAD_COMPLETED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("duration", Long.valueOf(j2)), new Pair("error_message", errorType), new Pair("face_capture_status", errorType == null ? CaptureStatus.SUCCESS : CaptureStatus.ERROR), new Pair("count_attempts", Integer.valueOf(i)), new Pair("count_rejections", Integer.valueOf(i2))), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceSelfieUploadStarted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceSelfieUploadStarted extends AnalyticsEvent {

        @NotNull
        public static final FaceSelfieUploadStarted INSTANCE = new FaceSelfieUploadStarted();

        private FaceSelfieUploadStarted() {
            super(new Event("FACE_SELFIE_UPLOAD_STARTED", EventType.ACTION, "FACIAL_UPLOAD", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoAutoRecordingStarted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoAutoRecordingStarted extends AnalyticsEvent {
        public FaceVideoAutoRecordingStarted() {
            super(new Event("FACE_VIDEO_CAPTURE_ALIGNED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoCapture;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "isPortrait", "", "(Z)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoCapture extends AnalyticsEvent {
        public FaceVideoCapture(boolean z) {
            super(new Event("FACE_VIDEO_CAPTURE", EventType.SCREEN, "VIDEO_FACIAL_CAPTURE", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), q0.c(new Pair(PublicPropertyKey.IS_PORTRAIT, Boolean.valueOf(z))));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoCaptureBackButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoCaptureBackButtonClicked extends AnalyticsEvent {
        public FaceVideoCaptureBackButtonClicked() {
            super(new Event("FACE_VIDEO_CAPTURE_BACK_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoCaptureFinishButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "duration", "", "(J)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoCaptureFinishButtonClicked extends AnalyticsEvent {
        public FaceVideoCaptureFinishButtonClicked(long j2) {
            super(new Event("FACE_VIDEO_CAPTURE_FINISH_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("duration", Long.valueOf(j2))), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoCaptureFirstChallenge;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "challengeType", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeType;", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeType;)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoCaptureFirstChallenge extends AnalyticsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceVideoCaptureFirstChallenge(@NotNull LivenessChallengeType challengeType) {
            super(new Event("FACE_VIDEO_CAPTURE_FIRST_CHALLENGE", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("liveness_challenge_type", challengeType)), null, 4, null);
            Intrinsics.checkNotNullParameter(challengeType, "challengeType");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoCaptureNextButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "duration", "", "(J)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoCaptureNextButtonClicked extends AnalyticsEvent {
        public FaceVideoCaptureNextButtonClicked(long j2) {
            super(new Event("FACE_VIDEO_CAPTURE_NEXT_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("duration", Long.valueOf(j2))), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoCaptureSecondChallenge;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "challengeType", "Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeType;", "(Lcom/onfido/android/sdk/capture/ui/camera/liveness/challenges/LivenessChallengeType;)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoCaptureSecondChallenge extends AnalyticsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceVideoCaptureSecondChallenge(@NotNull LivenessChallengeType challengeType) {
            super(new Event("FACE_VIDEO_CAPTURE_SECOND_CHALLENGE", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("liveness_challenge_type", challengeType)), null, 4, null);
            Intrinsics.checkNotNullParameter(challengeType, "challengeType");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoCaptureTimeout;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoCaptureTimeout extends AnalyticsEvent {
        public FaceVideoCaptureTimeout() {
            super(new Event("FACE_VIDEO_CAPTURE_TIMEOUT", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoCaptureTimeoutRetryButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoCaptureTimeoutRetryButtonClicked extends AnalyticsEvent {
        public FaceVideoCaptureTimeoutRetryButtonClicked() {
            super(new Event("FACE_VIDEO_CAPTURE_TIMEOUT_RETRY_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoConfirmation;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "isPortrait", "", "(Z)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoConfirmation extends AnalyticsEvent {
        public FaceVideoConfirmation(boolean z) {
            super(new Event("FACE_VIDEO_CONFIRMATION", EventType.SCREEN, "VIDEO_FACIAL_CAPTURE_CONFIRMATION", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), q0.c(new Pair(PublicPropertyKey.IS_PORTRAIT, Boolean.valueOf(z))));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoConfirmationBackButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoConfirmationBackButtonClicked extends AnalyticsEvent {
        public FaceVideoConfirmationBackButtonClicked() {
            super(new Event("FACE_VIDEO_CONFIRMATION_BACK_BUTTON_CLICKED", EventType.ACTION, "FACIAL_UPLOAD", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoConfirmationRetakeButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoConfirmationRetakeButtonClicked extends AnalyticsEvent {
        public FaceVideoConfirmationRetakeButtonClicked() {
            super(new Event("FACE_VIDEO_CONFIRMATION_RETAKE_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoConfirmationUploadButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoConfirmationUploadButtonClicked extends AnalyticsEvent {
        public FaceVideoConfirmationUploadButtonClicked() {
            super(new Event("FACE_VIDEO_CONFIRMATION_UPLOAD_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoConfirmationUploadStatus;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "captureStatus", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/CaptureStatus;", "duration", "", "(Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/CaptureStatus;J)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoConfirmationUploadStatus extends AnalyticsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceVideoConfirmationUploadStatus(@NotNull CaptureStatus captureStatus, long j2) {
            super(new Event("FACE_VIDEO_CONFIRMATION_UPLOAD_STATUS", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("duration", Long.valueOf(j2)), new Pair("face_capture_status", captureStatus)), null, 4, null);
            Intrinsics.checkNotNullParameter(captureStatus, "captureStatus");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoIntro;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoIntro extends AnalyticsEvent {

        @NotNull
        public static final FaceVideoIntro INSTANCE = new FaceVideoIntro();

        private FaceVideoIntro() {
            super(new Event("FACE_VIDEO_INTRO", EventType.SCREEN, "VIDEO_FACIAL_INTRO", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoIntroBackButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoIntroBackButtonClicked extends AnalyticsEvent {

        @NotNull
        public static final FaceVideoIntroBackButtonClicked INSTANCE = new FaceVideoIntroBackButtonClicked();

        private FaceVideoIntroBackButtonClicked() {
            super(new Event("FACE_VIDEO_INTRO_BACK_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoIntroRecordVideoButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoIntroRecordVideoButtonClicked extends AnalyticsEvent {

        @NotNull
        public static final FaceVideoIntroRecordVideoButtonClicked INSTANCE = new FaceVideoIntroRecordVideoButtonClicked();

        private FaceVideoIntroRecordVideoButtonClicked() {
            super(new Event("FACE_VIDEO_INTRO_RECORD_VIDEO_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoManualRecordingStarted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoManualRecordingStarted extends AnalyticsEvent {
        public FaceVideoManualRecordingStarted() {
            super(new Event("FACE_VIDEO_CAPTURE_RECORD_BUTTON_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoUploadCompleted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "duration", "", "(J)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoUploadCompleted extends AnalyticsEvent {
        public FaceVideoUploadCompleted(long j2) {
            super(new Event("FACE_VIDEO_UPLOAD_COMPLETED", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("duration", Long.valueOf(j2))), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$FaceVideoUploadStarted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceVideoUploadStarted extends AnalyticsEvent {

        @NotNull
        public static final FaceVideoUploadStarted INSTANCE = new FaceVideoUploadStarted();

        private FaceVideoUploadStarted() {
            super(new Event("FACE_VIDEO_UPLOAD_STARTED", EventType.ACTION, "VIDEO_FACIAL_UPLOAD", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/trackers/LivenessEvents$LivenessChallenge;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "livenessStep", "", "challengeType", "", "(ILjava/lang/String;)V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LivenessChallenge extends AnalyticsEvent {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LivenessChallenge(int i, @NotNull String challengeType) {
            super(new Event("FACE_VIDEO_CAPTURE", EventType.SCREEN, "VIDEO_FACIAL_CAPTURE", OnfidoAnalyticsEventType.SCREEN), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("video_capture_step", d.n("step", i)), new Pair("liveness_challenge_type", challengeType)), null, 4, null);
            Intrinsics.checkNotNullParameter(challengeType, "challengeType");
        }
    }

    private LivenessEvents() {
    }
}
