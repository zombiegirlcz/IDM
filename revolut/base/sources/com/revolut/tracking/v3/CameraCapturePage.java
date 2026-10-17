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
import com.revolut.tracking.v3.CameraCaptureMode;
import com.revolut.tracking.v3.CameraCapturePerformance;
import com.revolut.tracking.v3.CameraCaptureTorch;
import com.revolut.tracking.v3.CancelledCaptureChecks;
import com.revolut.tracking.v3.FailedChecksPercentages;
import grl.o1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes12.dex */
public final class CameraCapturePage extends w0 implements e2 {
    public static final int AUTOMATIC_CAPTURE_ATTEMPTS_FIELD_NUMBER = 4;
    public static final int CANCELLED_CAPTURE_CHECKS_FIELD_NUMBER = 6;
    public static final int CAPTURE_AUDIO_FIELD_NUMBER = 19;
    public static final int CAPTURE_DEPTH_FIELD_NUMBER = 20;
    public static final int CAPTURE_DEPTH_SUPPORTED_FIELD_NUMBER = 21;
    public static final int CAPTURE_PHOTO_FIELD_NUMBER = 17;
    public static final int CAPTURE_VIDEO_FIELD_NUMBER = 18;
    public static final int CLASSIFICATION_PERFORMANCE_FIELD_NUMBER = 10;
    public static final int CLASSIFIED_FRAME_COUNT_FIELD_NUMBER = 11;
    private static final CameraCapturePage DEFAULT_INSTANCE;
    public static final int EXPERIMENT_FIELD_NUMBER = 16;
    public static final int FAILED_CHECKS_FRAME_COUNT_FIELD_NUMBER = 12;
    public static final int FAILED_CHECKS_PERCENTAGES_FIELD_NUMBER = 7;
    public static final int FIRST_SUBJECT_DETECTION_TIME_FIELD_NUMBER = 15;
    public static final int FRAME_PERFORMANCE_FIELD_NUMBER = 9;
    public static final int MANUAL_CAPTURE_ATTEMPTS_FIELD_NUMBER = 5;
    public static final int MANUAL_CAPTURE_MODE_FIELD_NUMBER = 2;
    public static final int MODE_FIELD_NUMBER = 13;
    public static final int PAGE_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int SUCCESSFUL_CAPTURE_FIELD_NUMBER = 3;
    public static final int TIME_TO_SUCCESSFUL_CAPTURE_FIELD_NUMBER = 14;
    public static final int TORCH_FIELD_NUMBER = 8;
    private int automaticCaptureAttempts_;
    private int bitField0_;
    private CancelledCaptureChecks cancelledCaptureChecks_;
    private boolean captureAudio_;
    private boolean captureDepthSupported_;
    private boolean captureDepth_;
    private boolean capturePhoto_;
    private boolean captureVideo_;
    private CameraCapturePerformance classificationPerformance_;
    private int classifiedFrameCount_;
    private CancelledCaptureChecks failedChecksFrameCount_;
    private FailedChecksPercentages failedChecksPercentages_;
    private double firstSubjectDetectionTime_;
    private CameraCapturePerformance framePerformance_;
    private int manualCaptureAttempts_;
    private boolean manualCaptureMode_;
    private CameraCaptureMode mode_;
    private boolean successfulCapture_;
    private double timeToSuccessfulCapture_;
    private CameraCaptureTorch torch_;
    private String page_ = "";
    private String experiment_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CameraCapturePage.DEFAULT_INSTANCE);
        }
    }

    static {
        CameraCapturePage cameraCapturePage = new CameraCapturePage();
        DEFAULT_INSTANCE = cameraCapturePage;
        w0.registerDefaultInstance(CameraCapturePage.class, cameraCapturePage);
    }

    private CameraCapturePage() {
    }

    private void clearAutomaticCaptureAttempts() {
        this.bitField0_ &= -9;
        this.automaticCaptureAttempts_ = 0;
    }

    private void clearCancelledCaptureChecks() {
        this.cancelledCaptureChecks_ = null;
        this.bitField0_ &= -33;
    }

    private void clearCaptureAudio() {
        this.bitField0_ &= -262145;
        this.captureAudio_ = false;
    }

    private void clearCaptureDepth() {
        this.bitField0_ &= -524289;
        this.captureDepth_ = false;
    }

    private void clearCaptureDepthSupported() {
        this.bitField0_ &= -1048577;
        this.captureDepthSupported_ = false;
    }

    private void clearCapturePhoto() {
        this.bitField0_ &= -65537;
        this.capturePhoto_ = false;
    }

    private void clearCaptureVideo() {
        this.bitField0_ &= -131073;
        this.captureVideo_ = false;
    }

    private void clearClassificationPerformance() {
        this.classificationPerformance_ = null;
        this.bitField0_ &= -513;
    }

    private void clearClassifiedFrameCount() {
        this.bitField0_ &= -1025;
        this.classifiedFrameCount_ = 0;
    }

    private void clearExperiment() {
        this.bitField0_ &= -32769;
        this.experiment_ = getDefaultInstance().getExperiment();
    }

    private void clearFailedChecksFrameCount() {
        this.failedChecksFrameCount_ = null;
        this.bitField0_ &= -2049;
    }

    private void clearFailedChecksPercentages() {
        this.failedChecksPercentages_ = null;
        this.bitField0_ &= -65;
    }

    private void clearFirstSubjectDetectionTime() {
        this.bitField0_ &= -16385;
        this.firstSubjectDetectionTime_ = 0.0d;
    }

    private void clearFramePerformance() {
        this.framePerformance_ = null;
        this.bitField0_ &= -257;
    }

    private void clearManualCaptureAttempts() {
        this.bitField0_ &= -17;
        this.manualCaptureAttempts_ = 0;
    }

    private void clearManualCaptureMode() {
        this.bitField0_ &= -3;
        this.manualCaptureMode_ = false;
    }

    private void clearMode() {
        this.mode_ = null;
        this.bitField0_ &= -4097;
    }

    private void clearPage() {
        this.bitField0_ &= -2;
        this.page_ = getDefaultInstance().getPage();
    }

    private void clearSuccessfulCapture() {
        this.bitField0_ &= -5;
        this.successfulCapture_ = false;
    }

    private void clearTimeToSuccessfulCapture() {
        this.bitField0_ &= -8193;
        this.timeToSuccessfulCapture_ = 0.0d;
    }

    private void clearTorch() {
        this.torch_ = null;
        this.bitField0_ &= -129;
    }

    public static CameraCapturePage getDefaultInstance() {
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
        this.bitField0_ |= 32;
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
        this.bitField0_ |= 512;
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
        this.bitField0_ |= 2048;
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
        this.bitField0_ |= 64;
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
        this.bitField0_ |= 256;
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
        this.bitField0_ |= 4096;
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
        this.bitField0_ |= 128;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CameraCapturePage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CameraCapturePage) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CameraCapturePage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CameraCapturePage) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAutomaticCaptureAttempts(int i) {
        this.bitField0_ |= 8;
        this.automaticCaptureAttempts_ = i;
    }

    private void setCancelledCaptureChecks(CancelledCaptureChecks cancelledCaptureChecks) {
        cancelledCaptureChecks.getClass();
        this.cancelledCaptureChecks_ = cancelledCaptureChecks;
        this.bitField0_ |= 32;
    }

    private void setCaptureAudio(boolean z) {
        this.bitField0_ |= 262144;
        this.captureAudio_ = z;
    }

    private void setCaptureDepth(boolean z) {
        this.bitField0_ |= 524288;
        this.captureDepth_ = z;
    }

    private void setCaptureDepthSupported(boolean z) {
        this.bitField0_ |= PKIFailureInfo.badCertTemplate;
        this.captureDepthSupported_ = z;
    }

    private void setCapturePhoto(boolean z) {
        this.bitField0_ |= 65536;
        this.capturePhoto_ = z;
    }

    private void setCaptureVideo(boolean z) {
        this.bitField0_ |= 131072;
        this.captureVideo_ = z;
    }

    private void setClassificationPerformance(CameraCapturePerformance cameraCapturePerformance) {
        cameraCapturePerformance.getClass();
        this.classificationPerformance_ = cameraCapturePerformance;
        this.bitField0_ |= 512;
    }

    private void setClassifiedFrameCount(int i) {
        this.bitField0_ |= 1024;
        this.classifiedFrameCount_ = i;
    }

    private void setExperiment(String str) {
        str.getClass();
        this.bitField0_ |= 32768;
        this.experiment_ = str;
    }

    private void setExperimentBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.experiment_ = pVar.m();
        this.bitField0_ |= 32768;
    }

    private void setFailedChecksFrameCount(CancelledCaptureChecks cancelledCaptureChecks) {
        cancelledCaptureChecks.getClass();
        this.failedChecksFrameCount_ = cancelledCaptureChecks;
        this.bitField0_ |= 2048;
    }

    private void setFailedChecksPercentages(FailedChecksPercentages failedChecksPercentages) {
        failedChecksPercentages.getClass();
        this.failedChecksPercentages_ = failedChecksPercentages;
        this.bitField0_ |= 64;
    }

    private void setFirstSubjectDetectionTime(double d) {
        this.bitField0_ |= 16384;
        this.firstSubjectDetectionTime_ = d;
    }

    private void setFramePerformance(CameraCapturePerformance cameraCapturePerformance) {
        cameraCapturePerformance.getClass();
        this.framePerformance_ = cameraCapturePerformance;
        this.bitField0_ |= 256;
    }

    private void setManualCaptureAttempts(int i) {
        this.bitField0_ |= 16;
        this.manualCaptureAttempts_ = i;
    }

    private void setManualCaptureMode(boolean z) {
        this.bitField0_ |= 2;
        this.manualCaptureMode_ = z;
    }

    private void setMode(CameraCaptureMode cameraCaptureMode) {
        cameraCaptureMode.getClass();
        this.mode_ = cameraCaptureMode;
        this.bitField0_ |= 4096;
    }

    private void setPage(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.page_ = str;
    }

    private void setPageBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.page_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setSuccessfulCapture(boolean z) {
        this.bitField0_ |= 4;
        this.successfulCapture_ = z;
    }

    private void setTimeToSuccessfulCapture(double d) {
        this.bitField0_ |= 8192;
        this.timeToSuccessfulCapture_ = d;
    }

    private void setTorch(CameraCaptureTorch cameraCaptureTorch) {
        cameraCaptureTorch.getClass();
        this.torch_ = cameraCaptureTorch;
        this.bitField0_ |= 128;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (o1.f146156a[v0Var.ordinal()]) {
            case 1:
                return new CameraCapturePage();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bင\n\fဉ\u000b\rဉ\f\u000eက\r\u000fက\u000e\u0010ለ\u000f\u0011ဇ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014", new Object[]{"bitField0_", "page_", "manualCaptureMode_", "successfulCapture_", "automaticCaptureAttempts_", "manualCaptureAttempts_", "cancelledCaptureChecks_", "failedChecksPercentages_", "torch_", "framePerformance_", "classificationPerformance_", "classifiedFrameCount_", "failedChecksFrameCount_", "mode_", "timeToSuccessfulCapture_", "firstSubjectDetectionTime_", "experiment_", "capturePhoto_", "captureVideo_", "captureAudio_", "captureDepth_", "captureDepthSupported_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CameraCapturePage.class) {
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

    public String getExperiment() {
        return this.experiment_;
    }

    public p getExperimentBytes() {
        return p.d(this.experiment_);
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

    public CameraCapturePerformance getFramePerformance() {
        CameraCapturePerformance cameraCapturePerformance = this.framePerformance_;
        return cameraCapturePerformance == null ? CameraCapturePerformance.getDefaultInstance() : cameraCapturePerformance;
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

    public String getPage() {
        return this.page_;
    }

    public p getPageBytes() {
        return p.d(this.page_);
    }

    public boolean getSuccessfulCapture() {
        return this.successfulCapture_;
    }

    public double getTimeToSuccessfulCapture() {
        return this.timeToSuccessfulCapture_;
    }

    public CameraCaptureTorch getTorch() {
        CameraCaptureTorch cameraCaptureTorch = this.torch_;
        return cameraCaptureTorch == null ? CameraCaptureTorch.getDefaultInstance() : cameraCaptureTorch;
    }

    public boolean hasAutomaticCaptureAttempts() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCancelledCaptureChecks() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasCaptureAudio() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasCaptureDepth() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasCaptureDepthSupported() {
        return (this.bitField0_ & PKIFailureInfo.badCertTemplate) != 0;
    }

    public boolean hasCapturePhoto() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasCaptureVideo() {
        return (this.bitField0_ & 131072) != 0;
    }

    public boolean hasClassificationPerformance() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasClassifiedFrameCount() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasExperiment() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasFailedChecksFrameCount() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasFailedChecksPercentages() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasFirstSubjectDetectionTime() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasFramePerformance() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasManualCaptureAttempts() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasManualCaptureMode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMode() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasPage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSuccessfulCapture() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTimeToSuccessfulCapture() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasTorch() {
        return (this.bitField0_ & 128) != 0;
    }

    public static a newBuilder(CameraCapturePage cameraCapturePage) {
        return (a) DEFAULT_INSTANCE.createBuilder(cameraCapturePage);
    }

    public static CameraCapturePage parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CameraCapturePage) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CameraCapturePage parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCapturePage) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CameraCapturePage parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CameraCapturePage) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CameraCapturePage parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCapturePage) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CameraCapturePage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CameraCapturePage) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CameraCapturePage parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCapturePage) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CameraCapturePage parseFrom(InputStream inputStream) throws IOException {
        return (CameraCapturePage) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CameraCapturePage parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CameraCapturePage) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CameraCapturePage parseFrom(t tVar) throws IOException {
        return (CameraCapturePage) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CameraCapturePage parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CameraCapturePage) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
