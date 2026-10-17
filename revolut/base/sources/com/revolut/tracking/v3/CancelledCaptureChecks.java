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
import grl.t1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class CancelledCaptureChecks extends w0 implements e2 {
    public static final int BLURRY_FIELD_NUMBER = 5;
    public static final int COLORIZED_FIELD_NUMBER = 12;
    private static final CancelledCaptureChecks DEFAULT_INSTANCE;
    public static final int ENABLE_TORCH_FIELD_NUMBER = 10;
    public static final int EYES_CLOSED_FIELD_NUMBER = 13;
    public static final int GLARE_FIELD_NUMBER = 8;
    public static final int MRZ_UNREADABLE_FIELD_NUMBER = 9;
    public static final int OCCLUDED_FIELD_NUMBER = 11;
    public static final int OVEREXPOSED_FIELD_NUMBER = 7;
    private static volatile m2 PARSER = null;
    public static final int SUBJECT_PRESENT_FIELD_NUMBER = 1;
    public static final int SUBJECT_ROTATED_FIELD_NUMBER = 4;
    public static final int SUBJECT_TOO_CLOSE_FIELD_NUMBER = 3;
    public static final int SUBJECT_TOO_FAR_FIELD_NUMBER = 2;
    public static final int UNDEREXPOSED_FIELD_NUMBER = 6;
    private int bitField0_;
    private int blurry_;
    private int colorized_;
    private int enableTorch_;
    private int eyesClosed_;
    private int glare_;
    private int mrzUnreadable_;
    private int occluded_;
    private int overexposed_;
    private int subjectPresent_;
    private int subjectRotated_;
    private int subjectTooClose_;
    private int subjectTooFar_;
    private int underexposed_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CancelledCaptureChecks.DEFAULT_INSTANCE);
        }
    }

    static {
        CancelledCaptureChecks cancelledCaptureChecks = new CancelledCaptureChecks();
        DEFAULT_INSTANCE = cancelledCaptureChecks;
        w0.registerDefaultInstance(CancelledCaptureChecks.class, cancelledCaptureChecks);
    }

    private CancelledCaptureChecks() {
    }

    private void clearBlurry() {
        this.bitField0_ &= -17;
        this.blurry_ = 0;
    }

    private void clearColorized() {
        this.bitField0_ &= -2049;
        this.colorized_ = 0;
    }

    private void clearEnableTorch() {
        this.bitField0_ &= -513;
        this.enableTorch_ = 0;
    }

    private void clearEyesClosed() {
        this.bitField0_ &= -4097;
        this.eyesClosed_ = 0;
    }

    private void clearGlare() {
        this.bitField0_ &= -129;
        this.glare_ = 0;
    }

    private void clearMrzUnreadable() {
        this.bitField0_ &= -257;
        this.mrzUnreadable_ = 0;
    }

    private void clearOccluded() {
        this.bitField0_ &= -1025;
        this.occluded_ = 0;
    }

    private void clearOverexposed() {
        this.bitField0_ &= -65;
        this.overexposed_ = 0;
    }

    private void clearSubjectPresent() {
        this.bitField0_ &= -2;
        this.subjectPresent_ = 0;
    }

    private void clearSubjectRotated() {
        this.bitField0_ &= -9;
        this.subjectRotated_ = 0;
    }

    private void clearSubjectTooClose() {
        this.bitField0_ &= -5;
        this.subjectTooClose_ = 0;
    }

    private void clearSubjectTooFar() {
        this.bitField0_ &= -3;
        this.subjectTooFar_ = 0;
    }

    private void clearUnderexposed() {
        this.bitField0_ &= -33;
        this.underexposed_ = 0;
    }

    public static CancelledCaptureChecks getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CancelledCaptureChecks parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CancelledCaptureChecks) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CancelledCaptureChecks parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CancelledCaptureChecks) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlurry(int i) {
        this.bitField0_ |= 16;
        this.blurry_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorized(int i) {
        this.bitField0_ |= 2048;
        this.colorized_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnableTorch(int i) {
        this.bitField0_ |= 512;
        this.enableTorch_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEyesClosed(int i) {
        this.bitField0_ |= 4096;
        this.eyesClosed_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGlare(int i) {
        this.bitField0_ |= 128;
        this.glare_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMrzUnreadable(int i) {
        this.bitField0_ |= 256;
        this.mrzUnreadable_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOccluded(int i) {
        this.bitField0_ |= 1024;
        this.occluded_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverexposed(int i) {
        this.bitField0_ |= 64;
        this.overexposed_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubjectPresent(int i) {
        this.bitField0_ |= 1;
        this.subjectPresent_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubjectRotated(int i) {
        this.bitField0_ |= 8;
        this.subjectRotated_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubjectTooClose(int i) {
        this.bitField0_ |= 4;
        this.subjectTooClose_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubjectTooFar(int i) {
        this.bitField0_ |= 2;
        this.subjectTooFar_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnderexposed(int i) {
        this.bitField0_ |= 32;
        this.underexposed_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (t1.f146205a[v0Var.ordinal()]) {
            case 1:
                return new CancelledCaptureChecks();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b\rင\f", new Object[]{"bitField0_", "subjectPresent_", "subjectTooFar_", "subjectTooClose_", "subjectRotated_", "blurry_", "underexposed_", "overexposed_", "glare_", "mrzUnreadable_", "enableTorch_", "occluded_", "colorized_", "eyesClosed_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CancelledCaptureChecks.class) {
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

    public int getBlurry() {
        return this.blurry_;
    }

    public int getColorized() {
        return this.colorized_;
    }

    public int getEnableTorch() {
        return this.enableTorch_;
    }

    public int getEyesClosed() {
        return this.eyesClosed_;
    }

    public int getGlare() {
        return this.glare_;
    }

    public int getMrzUnreadable() {
        return this.mrzUnreadable_;
    }

    public int getOccluded() {
        return this.occluded_;
    }

    public int getOverexposed() {
        return this.overexposed_;
    }

    public int getSubjectPresent() {
        return this.subjectPresent_;
    }

    public int getSubjectRotated() {
        return this.subjectRotated_;
    }

    public int getSubjectTooClose() {
        return this.subjectTooClose_;
    }

    public int getSubjectTooFar() {
        return this.subjectTooFar_;
    }

    public int getUnderexposed() {
        return this.underexposed_;
    }

    public boolean hasBlurry() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasColorized() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasEnableTorch() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasEyesClosed() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasGlare() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasMrzUnreadable() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasOccluded() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasOverexposed() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSubjectPresent() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSubjectRotated() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSubjectTooClose() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSubjectTooFar() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasUnderexposed() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(CancelledCaptureChecks cancelledCaptureChecks) {
        return (a) DEFAULT_INSTANCE.createBuilder(cancelledCaptureChecks);
    }

    public static CancelledCaptureChecks parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CancelledCaptureChecks) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CancelledCaptureChecks parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CancelledCaptureChecks) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CancelledCaptureChecks parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CancelledCaptureChecks) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CancelledCaptureChecks parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CancelledCaptureChecks) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CancelledCaptureChecks parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CancelledCaptureChecks) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CancelledCaptureChecks parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CancelledCaptureChecks) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CancelledCaptureChecks parseFrom(InputStream inputStream) throws IOException {
        return (CancelledCaptureChecks) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CancelledCaptureChecks parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CancelledCaptureChecks) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CancelledCaptureChecks parseFrom(t tVar) throws IOException {
        return (CancelledCaptureChecks) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CancelledCaptureChecks parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CancelledCaptureChecks) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
