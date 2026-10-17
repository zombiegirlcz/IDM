package com.onfido.android.sdk.capture.component.active.video.capture.analytics;

import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.analytics.OnfidoAnalyticsEventType;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsEvent;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.AnalyticsFlowStep;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.Event;
import com.onfido.android.sdk.capture.internal.analytics.inhouse.domain.EventType;
import j6.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\bÀ\u0002\u0018\u00002\u00020\u0001:\u0016\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent;", "", "()V", "CameraError", "ConnectionError", "ConnectionErrorRestartRecording", "ConnectionErrorRetryUpload", "FaceAlignment", "FaceAlignmentStatus", "FaceCapture", "FaceCaptureErrorTimeout", "FaceCaptureErrorTimeoutRestartCapture", "FaceCaptureErrorTooFast", "FaceCaptureErrorTooFastRestartCapture", "FaceCaptureStatus", "Intro", "IntroReadyButtonClicked", "MLKitError", "MotionCamera", "MotionFaceDetector", "NoFaceDetected", "NoFaceDetectedRestartCapture", "PlayServicesError", "Upload", "UploadCompleted", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AvcAnalyticsEvent {

    @NotNull
    public static final AvcAnalyticsEvent INSTANCE = new AvcAnalyticsEvent();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$CameraError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CameraError extends AnalyticsEvent {

        @NotNull
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CameraError(@NotNull String errorMessage) {
            super(new Event("FACE_LIVENESS_CAMERA_ERROR", EventType.VIEW, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("error_message", errorMessage)), null, 4, null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ CameraError copy$default(CameraError cameraError, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = cameraError.errorMessage;
            }
            return cameraError.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final CameraError copy(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new CameraError(errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CameraError) && Intrinsics.f(this.errorMessage, ((CameraError) other).errorMessage);
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("CameraError(errorMessage="), this.errorMessage, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$ConnectionError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectionError extends AnalyticsEvent {

        @NotNull
        public static final ConnectionError INSTANCE = new ConnectionError();

        private ConnectionError() {
            super(new Event("FACE_LIVENESS_CONNECTION_ERROR", EventType.SCREEN, "MOTION_FACIAL_CONNECTION_ERROR", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$ConnectionErrorRestartRecording;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectionErrorRestartRecording extends AnalyticsEvent {

        @NotNull
        public static final ConnectionErrorRestartRecording INSTANCE = new ConnectionErrorRestartRecording();

        private ConnectionErrorRestartRecording() {
            super(new Event("FACE_LIVENESS_CONNECTION_ERROR_RESTART_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$ConnectionErrorRetryUpload;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectionErrorRetryUpload extends AnalyticsEvent {

        @NotNull
        public static final ConnectionErrorRetryUpload INSTANCE = new ConnectionErrorRetryUpload();

        private ConnectionErrorRetryUpload() {
            super(new Event("FACE_LIVENESS_CONNECTION_ERROR_RETRY_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$FaceAlignment;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceAlignment extends AnalyticsEvent {

        @NotNull
        public static final FaceAlignment INSTANCE = new FaceAlignment();

        private FaceAlignment() {
            super(new Event("FACE_LIVENESS_ALIGNMENT", EventType.SCREEN, "MOTION_FACIAL_ALIGNMENT", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$FaceAlignmentStatus;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FaceAlignmentStatus extends AnalyticsEvent {

        @NotNull
        private final String status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceAlignmentStatus(@NotNull String status) {
            super(new Event("FACE_LIVENESS_ALIGNMENT_STATUS", EventType.VIEW, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("avc_alignment_status", status)), null, 4, null);
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }

        public static /* synthetic */ FaceAlignmentStatus copy$default(FaceAlignmentStatus faceAlignmentStatus, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = faceAlignmentStatus.status;
            }
            return faceAlignmentStatus.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @NotNull
        public final FaceAlignmentStatus copy(@NotNull String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new FaceAlignmentStatus(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FaceAlignmentStatus) && Intrinsics.f(this.status, ((FaceAlignmentStatus) other).status);
        }

        @NotNull
        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("FaceAlignmentStatus(status="), this.status, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$FaceCapture;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceCapture extends AnalyticsEvent {

        @NotNull
        public static final FaceCapture INSTANCE = new FaceCapture();

        private FaceCapture() {
            super(new Event("FACE_LIVENESS_CAPTURE", EventType.SCREEN, "MOTION_FACIAL_CAPTURE", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$FaceCaptureErrorTimeout;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceCaptureErrorTimeout extends AnalyticsEvent {

        @NotNull
        public static final FaceCaptureErrorTimeout INSTANCE = new FaceCaptureErrorTimeout();

        private FaceCaptureErrorTimeout() {
            super(new Event("FACE_LIVENESS_CAPTURE_ERROR_TIMEOUT", EventType.VIEW, "MOTION_FACIAL_CAPTURE_ERROR_TIMEOUT", OnfidoAnalyticsEventType.VIEW), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$FaceCaptureErrorTimeoutRestartCapture;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceCaptureErrorTimeoutRestartCapture extends AnalyticsEvent {

        @NotNull
        public static final FaceCaptureErrorTimeoutRestartCapture INSTANCE = new FaceCaptureErrorTimeoutRestartCapture();

        private FaceCaptureErrorTimeoutRestartCapture() {
            super(new Event("FACE_LIVENESS_CAPTURE_ERROR_TIMEOUT_RESTART_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$FaceCaptureErrorTooFast;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceCaptureErrorTooFast extends AnalyticsEvent {

        @NotNull
        public static final FaceCaptureErrorTooFast INSTANCE = new FaceCaptureErrorTooFast();

        private FaceCaptureErrorTooFast() {
            super(new Event("FACE_LIVENESS_CAPTURE_ERROR_TOO_FAST", EventType.VIEW, "MOTION_FACIAL_CAPTURE_ERROR_TOO_FAST", OnfidoAnalyticsEventType.VIEW), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$FaceCaptureErrorTooFastRestartCapture;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FaceCaptureErrorTooFastRestartCapture extends AnalyticsEvent {

        @NotNull
        public static final FaceCaptureErrorTooFastRestartCapture INSTANCE = new FaceCaptureErrorTooFastRestartCapture();

        private FaceCaptureErrorTooFastRestartCapture() {
            super(new Event("FACE_LIVENESS_CAPTURE_ERROR_TOO_FAST_RESTART_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$FaceCaptureStatus;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FaceCaptureStatus extends AnalyticsEvent {

        @NotNull
        private final String status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceCaptureStatus(@NotNull String status) {
            super(new Event("FACE_LIVENESS_CAPTURE_STATUS", EventType.VIEW, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("avc_capture_status", status)), null, 4, null);
            Intrinsics.checkNotNullParameter(status, "status");
            this.status = status;
        }

        public static /* synthetic */ FaceCaptureStatus copy$default(FaceCaptureStatus faceCaptureStatus, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = faceCaptureStatus.status;
            }
            return faceCaptureStatus.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @NotNull
        public final FaceCaptureStatus copy(@NotNull String status) {
            Intrinsics.checkNotNullParameter(status, "status");
            return new FaceCaptureStatus(status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FaceCaptureStatus) && Intrinsics.f(this.status, ((FaceCaptureStatus) other).status);
        }

        @NotNull
        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("FaceCaptureStatus(status="), this.status, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$Intro;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Intro extends AnalyticsEvent {

        @NotNull
        public static final Intro INSTANCE = new Intro();

        private Intro() {
            super(new Event("FACE_LIVENESS_INTRO", EventType.SCREEN, "MOTION_FACIAL_INTRO", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$IntroReadyButtonClicked;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IntroReadyButtonClicked extends AnalyticsEvent {

        @NotNull
        public static final IntroReadyButtonClicked INSTANCE = new IntroReadyButtonClicked();

        private IntroReadyButtonClicked() {
            super(new Event("FACE_LIVENESS_INTRO_READY_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$MLKitError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MLKitError extends AnalyticsEvent {

        @NotNull
        private final String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MLKitError(@NotNull String errorMessage) {
            super(new Event("FACE_LIVENESS_MLKIT_ERROR", EventType.VIEW, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("error_message", errorMessage)), null, 4, null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ MLKitError copy$default(MLKitError mLKitError, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = mLKitError.errorMessage;
            }
            return mLKitError.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @NotNull
        public final MLKitError copy(@NotNull String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new MLKitError(errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MLKitError) && Intrinsics.f(this.errorMessage, ((MLKitError) other).errorMessage);
        }

        @NotNull
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("MLKitError(errorMessage="), this.errorMessage, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$MotionCamera;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "cameraType", "", "(Ljava/lang/String;)V", "getCameraType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MotionCamera extends AnalyticsEvent {

        @NotNull
        public static final String CAMERA_2 = "Camera2";

        @NotNull
        public static final String CAMERA_X = "CameraX";

        @NotNull
        private final String cameraType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MotionCamera(@NotNull String cameraType) {
            super(new Event("FACE_LIVENESS_CAMERA", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("avc_camera_type", cameraType)), null, 4, null);
            Intrinsics.checkNotNullParameter(cameraType, "cameraType");
            this.cameraType = cameraType;
        }

        public static /* synthetic */ MotionCamera copy$default(MotionCamera motionCamera, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = motionCamera.cameraType;
            }
            return motionCamera.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCameraType() {
            return this.cameraType;
        }

        @NotNull
        public final MotionCamera copy(@NotNull String cameraType) {
            Intrinsics.checkNotNullParameter(cameraType, "cameraType");
            return new MotionCamera(cameraType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MotionCamera) && Intrinsics.f(this.cameraType, ((MotionCamera) other).cameraType);
        }

        @NotNull
        public final String getCameraType() {
            return this.cameraType;
        }

        public int hashCode() {
            return this.cameraType.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("MotionCamera(cameraType="), this.cameraType, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$MotionFaceDetector;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "faceDetectorType", "", "(Ljava/lang/String;)V", "getFaceDetectorType", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MotionFaceDetector extends AnalyticsEvent {

        @NotNull
        private final String faceDetectorType;

        @NotNull
        public static final String TYPE_TFLite = "TFLite";

        @NotNull
        public static final String TYPE_MLKit = "MLKit";

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MotionFaceDetector(@NotNull String faceDetectorType) {
            super(new Event("FACE_LIVENESS_FACE_DETECTOR", EventType.ACTION, null, null, 12, null), r0.k(new Pair("step", AnalyticsFlowStep.FACE), new Pair("avc_face_detector_type", faceDetectorType)), null, 4, null);
            Intrinsics.checkNotNullParameter(faceDetectorType, "faceDetectorType");
            this.faceDetectorType = faceDetectorType;
        }

        public static /* synthetic */ MotionFaceDetector copy$default(MotionFaceDetector motionFaceDetector, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = motionFaceDetector.faceDetectorType;
            }
            return motionFaceDetector.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFaceDetectorType() {
            return this.faceDetectorType;
        }

        @NotNull
        public final MotionFaceDetector copy(@NotNull String faceDetectorType) {
            Intrinsics.checkNotNullParameter(faceDetectorType, "faceDetectorType");
            return new MotionFaceDetector(faceDetectorType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MotionFaceDetector) && Intrinsics.f(this.faceDetectorType, ((MotionFaceDetector) other).faceDetectorType);
        }

        @NotNull
        public final String getFaceDetectorType() {
            return this.faceDetectorType;
        }

        public int hashCode() {
            return this.faceDetectorType.hashCode();
        }

        @NotNull
        public String toString() {
            return a.u(new StringBuilder("MotionFaceDetector(faceDetectorType="), this.faceDetectorType, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$NoFaceDetected;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoFaceDetected extends AnalyticsEvent {

        @NotNull
        public static final NoFaceDetected INSTANCE = new NoFaceDetected();

        private NoFaceDetected() {
            super(new Event("FACE_LIVENESS_NO_FACE_DETECTED", EventType.SCREEN, "MOTION_FACIAL_NO_FACE_DETECTED", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$NoFaceDetectedRestartCapture;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoFaceDetectedRestartCapture extends AnalyticsEvent {

        @NotNull
        public static final NoFaceDetectedRestartCapture INSTANCE = new NoFaceDetectedRestartCapture();

        private NoFaceDetectedRestartCapture() {
            super(new Event("FACE_LIVENESS_NO_FACE_DETECTED_RESTART_CLICKED", EventType.ACTION, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$PlayServicesError;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PlayServicesError extends AnalyticsEvent {

        @NotNull
        public static final PlayServicesError INSTANCE = new PlayServicesError();

        private PlayServicesError() {
            super(new Event("FACE_LIVENESS_PLAY_SERVICES_ERROR", EventType.VIEW, null, null, 12, null), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$Upload;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Upload extends AnalyticsEvent {

        @NotNull
        public static final Upload INSTANCE = new Upload();

        private Upload() {
            super(new Event("FACE_LIVENESS_UPLOAD", EventType.SCREEN, "MOTION_FACIAL_UPLOAD", OnfidoAnalyticsEventType.SCREEN), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/analytics/AvcAnalyticsEvent$UploadCompleted;", "Lcom/onfido/android/sdk/capture/internal/analytics/inhouse/domain/AnalyticsEvent;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UploadCompleted extends AnalyticsEvent {

        @NotNull
        public static final UploadCompleted INSTANCE = new UploadCompleted();

        private UploadCompleted() {
            super(new Event("FACE_LIVENESS_UPLOAD_COMPLETED", EventType.VIEW, "MOTION_FACIAL_UPLOAD_COMPLETED", OnfidoAnalyticsEventType.VIEW), b.m("step", AnalyticsFlowStep.FACE), null, 4, null);
        }
    }

    private AvcAnalyticsEvent() {
    }
}
