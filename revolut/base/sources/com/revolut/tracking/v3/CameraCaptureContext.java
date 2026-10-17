package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import com.revolut.tracking.v3.CameraCaptureDocument;
import com.revolut.tracking.v3.CameraCaptureMode;
import com.revolut.tracking.v3.CameraCapturePage;
import com.revolut.tracking.v3.CameraCapturePerformance;
import com.revolut.tracking.v3.CameraCaptureTorch;
import com.revolut.tracking.v3.CancelledCaptureChecks;
import com.revolut.tracking.v3.DetectedCameraIssues;
import com.revolut.tracking.v3.FailedChecksPercentages;
import grl.b1;
import grl.d1;
import grl.f1;
import grl.h1;
import grl.j1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes13.dex */
public final class CameraCaptureContext extends w0 implements e2 {
    public static final int AUTOMATIC_CAPTURE_ATTEMPTS_FIELD_NUMBER = 10;
    public static final int AVATAR_REQUEST_ID_FIELD_NUMBER = 39;
    public static final int CAMERAINFO_FIELD_NUMBER = 37;
    public static final int CAMERA_IMPLEMENTATION_FIELD_NUMBER = 28;
    public static final int CAMERA_INIT_TIME_FIELD_NUMBER = 16;
    public static final int CANCELLED_CAPTURE_CHECKS_FIELD_NUMBER = 12;
    public static final int CAPTURE_AUDIO_FIELD_NUMBER = 4;
    public static final int CAPTURE_DEPTH_FIELD_NUMBER = 35;
    public static final int CAPTURE_DEPTH_SUPPORTED_FIELD_NUMBER = 36;
    public static final int CAPTURE_PHOTO_FIELD_NUMBER = 2;
    public static final int CAPTURE_VIDEO_FIELD_NUMBER = 3;
    public static final int CLASSIFICATION_PERFORMANCE_FIELD_NUMBER = 18;
    public static final int CLASSIFIED_FRAME_COUNT_FIELD_NUMBER = 19;
    private static final CameraCaptureContext DEFAULT_INSTANCE;
    public static final int DETECTED_CAMERA_ISSUES_FIELD_NUMBER = 23;
    public static final int DOCUMENT_FIELD_NUMBER = 7;
    public static final int EXPERIMENT_FIELD_NUMBER = 34;
    public static final int FACE_DETECTION_IMPLEMENTATION_FIELD_NUMBER = 33;
    public static final int FAILED_CHECKS_FRAME_COUNT_FIELD_NUMBER = 20;
    public static final int FAILED_CHECKS_PERCENTAGES_FIELD_NUMBER = 13;
    public static final int FIRST_SUBJECT_DETECTION_TIME_FIELD_NUMBER = 30;
    public static final int FLOW_TYPE_FIELD_NUMBER = 1;
    public static final int FRAME_PERFORMANCE_FIELD_NUMBER = 17;
    public static final int IS_ONBOARDING_FIELD_NUMBER = 31;
    public static final int MANUAL_CAPTURE_ATTEMPTS_FIELD_NUMBER = 11;
    public static final int MANUAL_CAPTURE_MODE_FIELD_NUMBER = 8;
    public static final int MODE_FIELD_NUMBER = 21;
    private static volatile m2 PARSER = null;
    public static final int RECORDING_DURATION_FIELD_NUMBER = 25;
    public static final int RECORDING_FINISH_TYPE_FIELD_NUMBER = 26;
    public static final int SECOND_PAGE_FIELD_NUMBER = 14;
    public static final int SUBJECT_FIELD_NUMBER = 6;
    public static final int SUBJECT_HINT_FIELD_NUMBER = 5;
    public static final int SUCCESSFUL_CAPTURE_FIELD_NUMBER = 9;
    public static final int THIRD_PAGE_FIELD_NUMBER = 22;
    public static final int TIME_TO_SUCCESSFUL_CAPTURE_FIELD_NUMBER = 29;
    public static final int TIME_UNTIL_RECORDING_STARTS_FIELD_NUMBER = 24;
    public static final int TORCH_FIELD_NUMBER = 15;
    public static final int VERIFICATION_TOKEN_FIELD_NUMBER = 38;
    public static final int VIDEO_ENCODING_BIT_RATE_FIELD_NUMBER = 27;
    private int automaticCaptureAttempts_;
    private int bitField0_;
    private int bitField1_;
    private double cameraInitTime_;
    private CancelledCaptureChecks cancelledCaptureChecks_;
    private boolean captureAudio_;
    private boolean captureDepthSupported_;
    private boolean captureDepth_;
    private boolean capturePhoto_;
    private boolean captureVideo_;
    private CameraCapturePerformance classificationPerformance_;
    private int classifiedFrameCount_;
    private DetectedCameraIssues detectedCameraIssues_;
    private CameraCaptureDocument document_;
    private int faceDetectionImplementation_;
    private CancelledCaptureChecks failedChecksFrameCount_;
    private FailedChecksPercentages failedChecksPercentages_;
    private double firstSubjectDetectionTime_;
    private int flowType_;
    private CameraCapturePerformance framePerformance_;
    private boolean isOnboarding_;
    private int manualCaptureAttempts_;
    private boolean manualCaptureMode_;
    private CameraCaptureMode mode_;
    private double recordingDuration_;
    private int recordingFinishType_;
    private CameraCapturePage secondPage_;
    private int subject_;
    private boolean successfulCapture_;
    private CameraCapturePage thirdPage_;
    private double timeToSuccessfulCapture_;
    private double timeUntilRecordingStarts_;
    private CameraCaptureTorch torch_;
    private int videoEncodingBitRate_;
    private String subjectHint_ = "";
    private String cameraImplementation_ = "";
    private String experiment_ = "";
    private String cameraInfo_ = "";
    private String verificationToken_ = "";
    private String avatarRequestId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(f1 f1Var) {
            c();
            ((CameraCaptureContext) this.f49761b).setFlowType(f1Var);
        }

        public final void i(j1 j1Var) {
            c();
            ((CameraCaptureContext) this.f49761b).setSubject(j1Var);
        }

        private a() {
            super(CameraCaptureContext.DEFAULT_INSTANCE);
        }
    }

    static {
        CameraCaptureContext cameraCaptureContext = new CameraCaptureContext();
        DEFAULT_INSTANCE = cameraCaptureContext;
        w0.registerDefaultInstance(CameraCaptureContext.class, cameraCaptureContext);
    }

    private CameraCaptureContext() {
    }

    private void clearAutomaticCaptureAttempts() {
        this.bitField0_ &= -513;
        this.automaticCaptureAttempts_ = 0;
    }

    private void clearAvatarRequestId() {
        this.bitField1_ &= -33;
        this.avatarRequestId_ = getDefaultInstance().getAvatarRequestId();
    }

    private void clearCameraImplementation() {
        this.bitField0_ &= -134217729;
        this.cameraImplementation_ = getDefaultInstance().getCameraImplementation();
    }

    private void clearCameraInfo() {
        this.bitField1_ &= -9;
        this.cameraInfo_ = getDefaultInstance().getCameraInfo();
    }

    private void clearCameraInitTime() {
        this.bitField0_ &= -32769;
        this.cameraInitTime_ = 0.0d;
    }

    private void clearCancelledCaptureChecks() {
        this.cancelledCaptureChecks_ = null;
        this.bitField0_ &= -2049;
    }

    private void clearCaptureAudio() {
        this.bitField0_ &= -9;
        this.captureAudio_ = false;
    }

    private void clearCaptureDepth() {
        this.bitField1_ &= -3;
        this.captureDepth_ = false;
    }

    private void clearCaptureDepthSupported() {
        this.bitField1_ &= -5;
        this.captureDepthSupported_ = false;
    }

    private void clearCapturePhoto() {
        this.bitField0_ &= -3;
        this.capturePhoto_ = false;
    }

    private void clearCaptureVideo() {
        this.bitField0_ &= -5;
        this.captureVideo_ = false;
    }

    private void clearClassificationPerformance() {
        this.classificationPerformance_ = null;
        this.bitField0_ &= -131073;
    }

    private void clearClassifiedFrameCount() {
        this.bitField0_ &= -262145;
        this.classifiedFrameCount_ = 0;
    }

    private void clearDetectedCameraIssues() {
        this.detectedCameraIssues_ = null;
        this.bitField0_ &= -4194305;
    }

    private void clearDocument() {
        this.document_ = null;
        this.bitField0_ &= -65;
    }

    private void clearExperiment() {
        this.bitField1_ &= -2;
        this.experiment_ = getDefaultInstance().getExperiment();
    }

    private void clearFaceDetectionImplementation() {
        this.bitField0_ &= Integer.MAX_VALUE;
        this.faceDetectionImplementation_ = 0;
    }

    private void clearFailedChecksFrameCount() {
        this.failedChecksFrameCount_ = null;
        this.bitField0_ &= -524289;
    }

    private void clearFailedChecksPercentages() {
        this.failedChecksPercentages_ = null;
        this.bitField0_ &= -4097;
    }

    private void clearFirstSubjectDetectionTime() {
        this.bitField0_ &= -536870913;
        this.firstSubjectDetectionTime_ = 0.0d;
    }

    private void clearFlowType() {
        this.bitField0_ &= -2;
        this.flowType_ = 0;
    }

    private void clearFramePerformance() {
        this.framePerformance_ = null;
        this.bitField0_ &= -65537;
    }

    private void clearIsOnboarding() {
        this.bitField0_ &= -1073741825;
        this.isOnboarding_ = false;
    }

    private void clearManualCaptureAttempts() {
        this.bitField0_ &= -1025;
        this.manualCaptureAttempts_ = 0;
    }

    private void clearManualCaptureMode() {
        this.bitField0_ &= -129;
        this.manualCaptureMode_ = false;
    }

    private void clearMode() {
        this.mode_ = null;
        this.bitField0_ &= -1048577;
    }

    private void clearRecordingDuration() {
        this.bitField0_ &= -16777217;
        this.recordingDuration_ = 0.0d;
    }

    private void clearRecordingFinishType() {
        this.bitField0_ &= -33554433;
        this.recordingFinishType_ = 0;
    }

    private void clearSecondPage() {
        this.secondPage_ = null;
        this.bitField0_ &= -8193;
    }

    private void clearSubject() {
        this.bitField0_ &= -33;
        this.subject_ = 0;
    }

    private void clearSubjectHint() {
        this.bitField0_ &= -17;
        this.subjectHint_ = getDefaultInstance().getSubjectHint();
    }

    private void clearSuccessfulCapture() {
        this.bitField0_ &= -257;
        this.successfulCapture_ = false;
    }

    private void clearThirdPage() {
        this.thirdPage_ = null;
        this.bitField0_ &= -2097153;
    }

    private void clearTimeToSuccessfulCapture() {
        this.bitField0_ &= -268435457;
        this.timeToSuccessfulCapture_ = 0.0d;
    }

    private void clearTimeUntilRecordingStarts() {
        this.bitField0_ &= -8388609;
        this.timeUntilRecordingStarts_ = 0.0d;
    }

    private void clearTorch() {
        this.torch_ = null;
        this.bitField0_ &= -16385;
    }

    private void clearVerificationToken() {
        this.bitField1_ &= -17;
        this.verificationToken_ = getDefaultInstance().getVerificationToken();
    }

    private void clearVideoEncodingBitRate() {
        this.bitField0_ &= -67108865;
        this.videoEncodingBitRate_ = 0;
    }

    public static CameraCaptureContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCancelledCaptureChecks(CancelledCaptureChecks cancelledCaptureChecks) {
        cancelledCaptureChecks.getClass();
        CancelledCaptureChecks cancelledCaptureChecks2 = this.cancelledCaptureChecks_;
        if (cancelledCaptureChecks2 == null || cancelledCaptureChecks2 == CancelledCaptureChecks.getDefaultInstance()) {
            this.cancelledCaptureChecks_ = cancelledCaptureChecks;
        } else {
            CancelledCaptureChecks.a aVarNewBuilder = CancelledCaptureChecks.newBuilder(this.cancelledCaptureChecks_);
            aVarNewBuilder.f(cancelledCaptureChecks);
            this.cancelledCaptureChecks_ = (CancelledCaptureChecks) aVarNewBuilder.b();
        }
        this.bitField0_ |= 2048;
    }

    private void mergeClassificationPerformance(CameraCapturePerformance cameraCapturePerformance) {
        cameraCapturePerformance.getClass();
        CameraCapturePerformance cameraCapturePerformance2 = this.classificationPerformance_;
        if (cameraCapturePerformance2 == null || cameraCapturePerformance2 == CameraCapturePerformance.getDefaultInstance()) {
            this.classificationPerformance_ = cameraCapturePerformance;
        } else {
            CameraCapturePerformance.a aVarNewBuilder = CameraCapturePerformance.newBuilder(this.classificationPerformance_);
            aVarNewBuilder.f(cameraCapturePerformance);
            this.classificationPerformance_ = (CameraCapturePerformance) aVarNewBuilder.b();
        }
        this.bitField0_ |= 131072;
    }

    private void mergeDetectedCameraIssues(DetectedCameraIssues detectedCameraIssues) {
        detectedCameraIssues.getClass();
        DetectedCameraIssues detectedCameraIssues2 = this.detectedCameraIssues_;
        if (detectedCameraIssues2 == null || detectedCameraIssues2 == DetectedCameraIssues.getDefaultInstance()) {
            this.detectedCameraIssues_ = detectedCameraIssues;
        } else {
            DetectedCameraIssues.a aVarNewBuilder = DetectedCameraIssues.newBuilder(this.detectedCameraIssues_);
            aVarNewBuilder.f(detectedCameraIssues);
            this.detectedCameraIssues_ = (DetectedCameraIssues) aVarNewBuilder.b();
        }
        this.bitField0_ |= 4194304;
    }

    private void mergeDocument(CameraCaptureDocument cameraCaptureDocument) {
        cameraCaptureDocument.getClass();
        CameraCaptureDocument cameraCaptureDocument2 = this.document_;
        if (cameraCaptureDocument2 == null || cameraCaptureDocument2 == CameraCaptureDocument.getDefaultInstance()) {
            this.document_ = cameraCaptureDocument;
        } else {
            CameraCaptureDocument.a aVarNewBuilder = CameraCaptureDocument.newBuilder(this.document_);
            aVarNewBuilder.f(cameraCaptureDocument);
            this.document_ = (CameraCaptureDocument) aVarNewBuilder.b();
        }
        this.bitField0_ |= 64;
    }

    private void mergeFailedChecksFrameCount(CancelledCaptureChecks cancelledCaptureChecks) {
        cancelledCaptureChecks.getClass();
        CancelledCaptureChecks cancelledCaptureChecks2 = this.failedChecksFrameCount_;
        if (cancelledCaptureChecks2 == null || cancelledCaptureChecks2 == CancelledCaptureChecks.getDefaultInstance()) {
            this.failedChecksFrameCount_ = cancelledCaptureChecks;
        } else {
            CancelledCaptureChecks.a aVarNewBuilder = CancelledCaptureChecks.newBuilder(this.failedChecksFrameCount_);
            aVarNewBuilder.f(cancelledCaptureChecks);
            this.failedChecksFrameCount_ = (CancelledCaptureChecks) aVarNewBuilder.b();
        }
        this.bitField0_ |= 524288;
    }

    private void mergeFailedChecksPercentages(FailedChecksPercentages failedChecksPercentages) {
        failedChecksPercentages.getClass();
        FailedChecksPercentages failedChecksPercentages2 = this.failedChecksPercentages_;
        if (failedChecksPercentages2 == null || failedChecksPercentages2 == FailedChecksPercentages.getDefaultInstance()) {
            this.failedChecksPercentages_ = failedChecksPercentages;
        } else {
            FailedChecksPercentages.a aVarNewBuilder = FailedChecksPercentages.newBuilder(this.failedChecksPercentages_);
            aVarNewBuilder.f(failedChecksPercentages);
            this.failedChecksPercentages_ = (FailedChecksPercentages) aVarNewBuilder.b();
        }
        this.bitField0_ |= 4096;
    }

    private void mergeFramePerformance(CameraCapturePerformance cameraCapturePerformance) {
        cameraCapturePerformance.getClass();
        CameraCapturePerformance cameraCapturePerformance2 = this.framePerformance_;
        if (cameraCapturePerformance2 == null || cameraCapturePerformance2 == CameraCapturePerformance.getDefaultInstance()) {
            this.framePerformance_ = cameraCapturePerformance;
        } else {
            CameraCapturePerformance.a aVarNewBuilder = CameraCapturePerformance.newBuilder(this.framePerformance_);
            aVarNewBuilder.f(cameraCapturePerformance);
            this.framePerformance_ = (CameraCapturePerformance) aVarNewBuilder.b();
        }
        this.bitField0_ |= 65536;
    }

    private void mergeMode(CameraCaptureMode cameraCaptureMode) {
        cameraCaptureMode.getClass();
        CameraCaptureMode cameraCaptureMode2 = this.mode_;
        if (cameraCaptureMode2 == null || cameraCaptureMode2 == CameraCaptureMode.getDefaultInstance()) {
            this.mode_ = cameraCaptureMode;
        } else {
            CameraCaptureMode.a aVarNewBuilder = CameraCaptureMode.newBuilder(this.mode_);
            aVarNewBuilder.f(cameraCaptureMode);
            this.mode_ = (CameraCaptureMode) aVarNewBuilder.b();
        }
        this.bitField0_ |= PKIFailureInfo.badCertTemplate;
    }

    private void mergeSecondPage(CameraCapturePage cameraCapturePage) {
        cameraCapturePage.getClass();
        CameraCapturePage cameraCapturePage2 = this.secondPage_;
        if (cameraCapturePage2 == null || cameraCapturePage2 == CameraCapturePage.getDefaultInstance()) {
            this.secondPage_ = cameraCapturePage;
        } else {
            CameraCapturePage.a aVarNewBuilder = CameraCapturePage.newBuilder(this.secondPage_);
            aVarNewBuilder.f(cameraCapturePage);
            this.secondPage_ = (CameraCapturePage) aVarNewBuilder.b();
        }
        this.bitField0_ |= 8192;
    }

    private void mergeThirdPage(CameraCapturePage cameraCapturePage) {
        cameraCapturePage.getClass();
        CameraCapturePage cameraCapturePage2 = this.thirdPage_;
        if (cameraCapturePage2 == null || cameraCapturePage2 == CameraCapturePage.getDefaultInstance()) {
            this.thirdPage_ = cameraCapturePage;
        } else {
            CameraCapturePage.a aVarNewBuilder = CameraCapturePage.newBuilder(this.thirdPage_);
            aVarNewBuilder.f(cameraCapturePage);
            this.thirdPage_ = (CameraCapturePage) aVarNewBuilder.b();
        }
        this.bitField0_ |= PKIFailureInfo.badSenderNonce;
    }

    private void mergeTorch(CameraCaptureTorch cameraCaptureTorch) {
        cameraCaptureTorch.getClass();
        CameraCaptureTorch cameraCaptureTorch2 = this.torch_;
        if (cameraCaptureTorch2 == null || cameraCaptureTorch2 == CameraCaptureTorch.getDefaultInstance()) {
            this.torch_ = cameraCaptureTorch;
        } else {
            CameraCaptureTorch.a aVarNewBuilder = CameraCaptureTorch.newBuilder(this.torch_);
            aVarNewBuilder.f(cameraCaptureTorch);
            this.torch_ = (CameraCaptureTorch) aVarNewBuilder.b();
        }
        this.bitField0_ |= 16384;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CameraCaptureContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CameraCaptureContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CameraCaptureContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CameraCaptureContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutomaticCaptureAttempts(int i) {
        this.bitField0_ |= 512;
        this.automaticCaptureAttempts_ = i;
    }

    private void setAvatarRequestId(String str) {
        str.getClass();
        this.bitField1_ |= 32;
        this.avatarRequestId_ = str;
    }

    private void setAvatarRequestIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.avatarRequestId_ = pVar.m();
        this.bitField1_ |= 32;
    }

    private void setCameraImplementation(String str) {
        str.getClass();
        this.bitField0_ |= 134217728;
        this.cameraImplementation_ = str;
    }

    private void setCameraImplementationBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.cameraImplementation_ = pVar.m();
        this.bitField0_ |= 134217728;
    }

    private void setCameraInfo(String str) {
        str.getClass();
        this.bitField1_ |= 8;
        this.cameraInfo_ = str;
    }

    private void setCameraInfoBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.cameraInfo_ = pVar.m();
        this.bitField1_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCameraInitTime(double d) {
        this.bitField0_ |= 32768;
        this.cameraInitTime_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCancelledCaptureChecks(CancelledCaptureChecks cancelledCaptureChecks) {
        cancelledCaptureChecks.getClass();
        this.cancelledCaptureChecks_ = cancelledCaptureChecks;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCaptureAudio(boolean z) {
        this.bitField0_ |= 8;
        this.captureAudio_ = z;
    }

    private void setCaptureDepth(boolean z) {
        this.bitField1_ |= 2;
        this.captureDepth_ = z;
    }

    private void setCaptureDepthSupported(boolean z) {
        this.bitField1_ |= 4;
        this.captureDepthSupported_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCapturePhoto(boolean z) {
        this.bitField0_ |= 2;
        this.capturePhoto_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCaptureVideo(boolean z) {
        this.bitField0_ |= 4;
        this.captureVideo_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClassificationPerformance(CameraCapturePerformance cameraCapturePerformance) {
        cameraCapturePerformance.getClass();
        this.classificationPerformance_ = cameraCapturePerformance;
        this.bitField0_ |= 131072;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClassifiedFrameCount(int i) {
        this.bitField0_ |= 262144;
        this.classifiedFrameCount_ = i;
    }

    private void setDetectedCameraIssues(DetectedCameraIssues detectedCameraIssues) {
        detectedCameraIssues.getClass();
        this.detectedCameraIssues_ = detectedCameraIssues;
        this.bitField0_ |= 4194304;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocument(CameraCaptureDocument cameraCaptureDocument) {
        cameraCaptureDocument.getClass();
        this.document_ = cameraCaptureDocument;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperiment(String str) {
        str.getClass();
        this.bitField1_ |= 1;
        this.experiment_ = str;
    }

    private void setExperimentBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.experiment_ = pVar.m();
        this.bitField1_ |= 1;
    }

    private void setFaceDetectionImplementation(d1 d1Var) {
        this.faceDetectionImplementation_ = d1Var.getNumber();
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    private void setFaceDetectionImplementationValue(int i) {
        this.bitField0_ |= Integer.MIN_VALUE;
        this.faceDetectionImplementation_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFailedChecksFrameCount(CancelledCaptureChecks cancelledCaptureChecks) {
        cancelledCaptureChecks.getClass();
        this.failedChecksFrameCount_ = cancelledCaptureChecks;
        this.bitField0_ |= 524288;
    }

    private void setFailedChecksPercentages(FailedChecksPercentages failedChecksPercentages) {
        failedChecksPercentages.getClass();
        this.failedChecksPercentages_ = failedChecksPercentages;
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstSubjectDetectionTime(double d) {
        this.bitField0_ |= PKIFailureInfo.duplicateCertReq;
        this.firstSubjectDetectionTime_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowType(f1 f1Var) {
        this.flowType_ = f1Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setFlowTypeValue(int i) {
        this.bitField0_ |= 1;
        this.flowType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFramePerformance(CameraCapturePerformance cameraCapturePerformance) {
        cameraCapturePerformance.getClass();
        this.framePerformance_ = cameraCapturePerformance;
        this.bitField0_ |= 65536;
    }

    private void setIsOnboarding(boolean z) {
        this.bitField0_ |= 1073741824;
        this.isOnboarding_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManualCaptureAttempts(int i) {
        this.bitField0_ |= 1024;
        this.manualCaptureAttempts_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setManualCaptureMode(boolean z) {
        this.bitField0_ |= 128;
        this.manualCaptureMode_ = z;
    }

    private void setMode(CameraCaptureMode cameraCaptureMode) {
        cameraCaptureMode.getClass();
        this.mode_ = cameraCaptureMode;
        this.bitField0_ |= PKIFailureInfo.badCertTemplate;
    }

    private void setRecordingDuration(double d) {
        this.bitField0_ |= 16777216;
        this.recordingDuration_ = d;
    }

    private void setRecordingFinishType(h1 h1Var) {
        this.recordingFinishType_ = h1Var.getNumber();
        this.bitField0_ |= 33554432;
    }

    private void setRecordingFinishTypeValue(int i) {
        this.bitField0_ |= 33554432;
        this.recordingFinishType_ = i;
    }

    private void setSecondPage(CameraCapturePage cameraCapturePage) {
        cameraCapturePage.getClass();
        this.secondPage_ = cameraCapturePage;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubject(j1 j1Var) {
        this.subject_ = j1Var.getNumber();
        this.bitField0_ |= 32;
    }

    private void setSubjectHint(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.subjectHint_ = str;
    }

    private void setSubjectHintBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.subjectHint_ = pVar.m();
        this.bitField0_ |= 16;
    }

    private void setSubjectValue(int i) {
        this.bitField0_ |= 32;
        this.subject_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuccessfulCapture(boolean z) {
        this.bitField0_ |= 256;
        this.successfulCapture_ = z;
    }

    private void setThirdPage(CameraCapturePage cameraCapturePage) {
        cameraCapturePage.getClass();
        this.thirdPage_ = cameraCapturePage;
        this.bitField0_ |= PKIFailureInfo.badSenderNonce;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToSuccessfulCapture(double d) {
        this.bitField0_ |= 268435456;
        this.timeToSuccessfulCapture_ = d;
    }

    private void setTimeUntilRecordingStarts(double d) {
        this.bitField0_ |= 8388608;
        this.timeUntilRecordingStarts_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTorch(CameraCaptureTorch cameraCaptureTorch) {
        cameraCaptureTorch.getClass();
        this.torch_ = cameraCaptureTorch;
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationToken(String str) {
        str.getClass();
        this.bitField1_ |= 16;
        this.verificationToken_ = str;
    }

    private void setVerificationTokenBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.verificationToken_ = pVar.m();
        this.bitField1_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoEncodingBitRate(int i) {
        this.bitField0_ |= 67108864;
        this.videoEncodingBitRate_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (b1.f146061a[v0Var.ordinal()]) {
            case 1:
                return new CameraCaptureContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000&\u0000\u0002\u0001'&\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ለ\u0004\u0006ဌ\u0005\u0007ဉ\u0006\bဇ\u0007\tဇ\b\nင\t\u000bင\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010က\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013င\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015\u0017ဉ\u0016\u0018က\u0017\u0019က\u0018\u001aဌ\u0019\u001bင\u001a\u001cለ\u001b\u001dက\u001c\u001eက\u001d\u001fဇ\u001e!ဌ\u001f\"ለ #ဇ!$ဇ\"%ለ#&ለ$'ለ%", new Object[]{"bitField0_", "bitField1_", "flowType_", "capturePhoto_", "captureVideo_", "captureAudio_", "subjectHint_", "subject_", "document_", "manualCaptureMode_", "successfulCapture_", "automaticCaptureAttempts_", "manualCaptureAttempts_", "cancelledCaptureChecks_", "failedChecksPercentages_", "secondPage_", "torch_", "cameraInitTime_", "framePerformance_", "classificationPerformance_", "classifiedFrameCount_", "failedChecksFrameCount_", "mode_", "thirdPage_", "detectedCameraIssues_", "timeUntilRecordingStarts_", "recordingDuration_", "recordingFinishType_", "videoEncodingBitRate_", "cameraImplementation_", "timeToSuccessfulCapture_", "firstSubjectDetectionTime_", "isOnboarding_", "faceDetectionImplementation_", "experiment_", "captureDepth_", "captureDepthSupported_", "cameraInfo_", "verificationToken_", "avatarRequestId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CameraCaptureContext.class) {
                    try {
                        q0Var = PARSER;
                        if (q0Var == null) {
                            q0Var = new q0(DEFAULT_INSTANCE);
                            PARSER = q0Var;
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return q0Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int getAutomaticCaptureAttempts() {
        return this.automaticCaptureAttempts_;
    }

    public String getAvatarRequestId() {
        return this.avatarRequestId_;
    }

    public p getAvatarRequestIdBytes() {
        return p.d(this.avatarRequestId_);
    }

    public String getCameraImplementation() {
        return this.cameraImplementation_;
    }

    public p getCameraImplementationBytes() {
        return p.d(this.cameraImplementation_);
    }

    public String getCameraInfo() {
        return this.cameraInfo_;
    }

    public p getCameraInfoBytes() {
        return p.d(this.cameraInfo_);
    }

    public double getCameraInitTime() {
        return this.cameraInitTime_;
    }

    public CancelledCaptureChecks getCancelledCaptureChecks() {
        CancelledCaptureChecks cancelledCaptureChecks = this.cancelledCaptureChecks_;
        return cancelledCaptureChecks == null ? CancelledCaptureChecks.getDefaultInstance() : cancelledCaptureChecks;
    }

    public boolean getCaptureAudio() {
        return this.captureAudio_;
    }

    public boolean getCaptureDepth() {
        return this.captureDepth_;
    }

    public boolean getCaptureDepthSupported() {
        return this.captureDepthSupported_;
    }

    public boolean getCapturePhoto() {
        return this.capturePhoto_;
    }

    public boolean getCaptureVideo() {
        return this.captureVideo_;
    }

    public CameraCapturePerformance getClassificationPerformance() {
        CameraCapturePerformance cameraCapturePerformance = this.classificationPerformance_;
        return cameraCapturePerformance == null ? CameraCapturePerformance.getDefaultInstance() : cameraCapturePerformance;
    }

    public int getClassifiedFrameCount() {
        return this.classifiedFrameCount_;
    }

    public DetectedCameraIssues getDetectedCameraIssues() {
        DetectedCameraIssues detectedCameraIssues = this.detectedCameraIssues_;
        return detectedCameraIssues == null ? DetectedCameraIssues.getDefaultInstance() : detectedCameraIssues;
    }

    public CameraCaptureDocument getDocument() {
        CameraCaptureDocument cameraCaptureDocument = this.document_;
        return cameraCaptureDocument == null ? CameraCaptureDocument.getDefaultInstance() : cameraCaptureDocument;
    }

    public String getExperiment() {
        return this.experiment_;
    }

    public p getExperimentBytes() {
        return p.d(this.experiment_);
    }

    public d1 getFaceDetectionImplementation() {
        d1 d1VarA = d1.a(this.faceDetectionImplementation_);
        return d1VarA == null ? d1.UNRECOGNIZED : d1VarA;
    }

    public int getFaceDetectionImplementationValue() {
        return this.faceDetectionImplementation_;
    }

    public CancelledCaptureChecks getFailedChecksFrameCount() {
        CancelledCaptureChecks cancelledCaptureChecks = this.failedChecksFrameCount_;
        return cancelledCaptureChecks == null ? CancelledCaptureChecks.getDefaultInstance() : cancelledCaptureChecks;
    }

    public FailedChecksPercentages getFailedChecksPercentages() {
        FailedChecksPercentages failedChecksPercentages = this.failedChecksPercentages_;
        return failedChecksPercentages == null ? FailedChecksPercentages.getDefaultInstance() : failedChecksPercentages;
    }

    public double getFirstSubjectDetectionTime() {
        return this.firstSubjectDetectionTime_;
    }

    public f1 getFlowType() {
        f1 f1VarA = f1.a(this.flowType_);
        return f1VarA == null ? f1.UNRECOGNIZED : f1VarA;
    }

    public int getFlowTypeValue() {
        return this.flowType_;
    }

    public CameraCapturePerformance getFramePerformance() {
        CameraCapturePerformance cameraCapturePerformance = this.framePerformance_;
        return cameraCapturePerformance == null ? CameraCapturePerformance.getDefaultInstance() : cameraCapturePerformance;
    }

    public boolean getIsOnboarding() {
        return this.isOnboarding_;
    }

    public int getManualCaptureAttempts() {
        return this.manualCaptureAttempts_;
    }

    public boolean getManualCaptureMode() {
        return this.manualCaptureMode_;
    }

    public CameraCaptureMode getMode() {
        CameraCaptureMode cameraCaptureMode = this.mode_;
        return cameraCaptureMode == null ? CameraCaptureMode.getDefaultInstance() : cameraCaptureMode;
    }

    public double getRecordingDuration() {
        return this.recordingDuration_;
    }

    public h1 getRecordingFinishType() {
        h1 h1VarA = h1.a(this.recordingFinishType_);
        return h1VarA == null ? h1.UNRECOGNIZED : h1VarA;
    }

    public int getRecordingFinishTypeValue() {
        return this.recordingFinishType_;
    }

    public CameraCapturePage getSecondPage() {
        CameraCapturePage cameraCapturePage = this.secondPage_;
        return cameraCapturePage == null ? CameraCapturePage.getDefaultInstance() : cameraCapturePage;
    }

    public j1 getSubject() {
        j1 j1VarA = j1.a(this.subject_);
        return j1VarA == null ? j1.UNRECOGNIZED : j1VarA;
    }

    public String getSubjectHint() {
        return this.subjectHint_;
    }

    public p getSubjectHintBytes() {
        return p.d(this.subjectHint_);
    }

    public int getSubjectValue() {
        return this.subject_;
    }

    public boolean getSuccessfulCapture() {
        return this.successfulCapture_;
    }

    public CameraCapturePage getThirdPage() {
        CameraCapturePage cameraCapturePage = this.thirdPage_;
        return cameraCapturePage == null ? CameraCapturePage.getDefaultInstance() : cameraCapturePage;
    }

    public double getTimeToSuccessfulCapture() {
        return this.timeToSuccessfulCapture_;
    }

    public double getTimeUntilRecordingStarts() {
        return this.timeUntilRecordingStarts_;
    }

    public CameraCaptureTorch getTorch() {
        CameraCaptureTorch cameraCaptureTorch = this.torch_;
        return cameraCaptureTorch == null ? CameraCaptureTorch.getDefaultInstance() : cameraCaptureTorch;
    }

    public String getVerificationToken() {
        return this.verificationToken_;
    }

    public p getVerificationTokenBytes() {
        return p.d(this.verificationToken_);
    }

    public int getVideoEncodingBitRate() {
        return this.videoEncodingBitRate_;
    }

    public boolean hasAutomaticCaptureAttempts() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasAvatarRequestId() {
        return (this.bitField1_ & 32) != 0;
    }

    public boolean hasCameraImplementation() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasCameraInfo() {
        return (this.bitField1_ & 8) != 0;
    }

    public boolean hasCameraInitTime() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasCancelledCaptureChecks() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasCaptureAudio() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCaptureDepth() {
        return (this.bitField1_ & 2) != 0;
    }

    public boolean hasCaptureDepthSupported() {
        return (this.bitField1_ & 4) != 0;
    }

    public boolean hasCapturePhoto() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCaptureVideo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasClassificationPerformance() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasClassifiedFrameCount() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasDetectedCameraIssues() {
        return (this.bitField0_ & 4194304) != 0;
    }

    public boolean hasDocument() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasExperiment() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasFaceDetectionImplementation() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasFailedChecksFrameCount() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasFailedChecksPercentages() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasFirstSubjectDetectionTime() {
        return (this.bitField0_ & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public boolean hasFlowType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFramePerformance() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasIsOnboarding() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasManualCaptureAttempts() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasManualCaptureMode() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasMode() {
        return (this.bitField0_ & PKIFailureInfo.badCertTemplate) != 0;
    }

    public boolean hasRecordingDuration() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasRecordingFinishType() {
        return (this.bitField0_ & 33554432) != 0;
    }

    public boolean hasSecondPage() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasSubject() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSubjectHint() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSuccessfulCapture() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasThirdPage() {
        return (this.bitField0_ & PKIFailureInfo.badSenderNonce) != 0;
    }

    public boolean hasTimeToSuccessfulCapture() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasTimeUntilRecordingStarts() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasTorch() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasVerificationToken() {
        return (this.bitField1_ & 16) != 0;
    }

    public boolean hasVideoEncodingBitRate() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public static a newBuilder(CameraCaptureContext cameraCaptureContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(cameraCaptureContext);
    }

    public static CameraCaptureContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CameraCaptureContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CameraCaptureContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCaptureContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CameraCaptureContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CameraCaptureContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CameraCaptureContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCaptureContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CameraCaptureContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CameraCaptureContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CameraCaptureContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCaptureContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CameraCaptureContext parseFrom(InputStream inputStream) throws IOException {
        return (CameraCaptureContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CameraCaptureContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CameraCaptureContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CameraCaptureContext parseFrom(t tVar) throws IOException {
        return (CameraCaptureContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CameraCaptureContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CameraCaptureContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
