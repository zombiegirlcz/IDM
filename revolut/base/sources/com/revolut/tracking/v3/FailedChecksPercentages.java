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
import grl.g4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class FailedChecksPercentages extends w0 implements e2 {
    public static final int BLURRY_FIELD_NUMBER = 5;
    private static final FailedChecksPercentages DEFAULT_INSTANCE;
    public static final int ENABLE_TORCH_FIELD_NUMBER = 9;
    public static final int GLARE_FIELD_NUMBER = 8;
    public static final int MRZ_UNREADABLE_FIELD_NUMBER = 10;
    public static final int OVEREXPOSED_FIELD_NUMBER = 7;
    private static volatile m2 PARSER = null;
    public static final int SUBJECT_PRESENT_FIELD_NUMBER = 1;
    public static final int SUBJECT_ROTATED_FIELD_NUMBER = 4;
    public static final int SUBJECT_TOO_CLOSE_FIELD_NUMBER = 3;
    public static final int SUBJECT_TOO_FAR_FIELD_NUMBER = 2;
    public static final int UNDEREXPOSED_FIELD_NUMBER = 6;
    private int bitField0_;
    private double blurry_;
    private double enableTorch_;
    private double glare_;
    private double mrzUnreadable_;
    private double overexposed_;
    private double subjectPresent_;
    private double subjectRotated_;
    private double subjectTooClose_;
    private double subjectTooFar_;
    private double underexposed_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(FailedChecksPercentages.DEFAULT_INSTANCE);
        }
    }

    static {
        FailedChecksPercentages failedChecksPercentages = new FailedChecksPercentages();
        DEFAULT_INSTANCE = failedChecksPercentages;
        w0.registerDefaultInstance(FailedChecksPercentages.class, failedChecksPercentages);
    }

    private FailedChecksPercentages() {
    }

    private void clearBlurry() {
        this.bitField0_ &= -17;
        this.blurry_ = 0.0d;
    }

    private void clearEnableTorch() {
        this.bitField0_ &= -257;
        this.enableTorch_ = 0.0d;
    }

    private void clearGlare() {
        this.bitField0_ &= -129;
        this.glare_ = 0.0d;
    }

    private void clearMrzUnreadable() {
        this.bitField0_ &= -513;
        this.mrzUnreadable_ = 0.0d;
    }

    private void clearOverexposed() {
        this.bitField0_ &= -65;
        this.overexposed_ = 0.0d;
    }

    private void clearSubjectPresent() {
        this.bitField0_ &= -2;
        this.subjectPresent_ = 0.0d;
    }

    private void clearSubjectRotated() {
        this.bitField0_ &= -9;
        this.subjectRotated_ = 0.0d;
    }

    private void clearSubjectTooClose() {
        this.bitField0_ &= -5;
        this.subjectTooClose_ = 0.0d;
    }

    private void clearSubjectTooFar() {
        this.bitField0_ &= -3;
        this.subjectTooFar_ = 0.0d;
    }

    private void clearUnderexposed() {
        this.bitField0_ &= -33;
        this.underexposed_ = 0.0d;
    }

    public static FailedChecksPercentages getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static FailedChecksPercentages parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FailedChecksPercentages) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FailedChecksPercentages parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FailedChecksPercentages) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBlurry(double d) {
        this.bitField0_ |= 16;
        this.blurry_ = d;
    }

    private void setEnableTorch(double d) {
        this.bitField0_ |= 256;
        this.enableTorch_ = d;
    }

    private void setGlare(double d) {
        this.bitField0_ |= 128;
        this.glare_ = d;
    }

    private void setMrzUnreadable(double d) {
        this.bitField0_ |= 512;
        this.mrzUnreadable_ = d;
    }

    private void setOverexposed(double d) {
        this.bitField0_ |= 64;
        this.overexposed_ = d;
    }

    private void setSubjectPresent(double d) {
        this.bitField0_ |= 1;
        this.subjectPresent_ = d;
    }

    private void setSubjectRotated(double d) {
        this.bitField0_ |= 8;
        this.subjectRotated_ = d;
    }

    private void setSubjectTooClose(double d) {
        this.bitField0_ |= 4;
        this.subjectTooClose_ = d;
    }

    private void setSubjectTooFar(double d) {
        this.bitField0_ |= 2;
        this.subjectTooFar_ = d;
    }

    private void setUnderexposed(double d) {
        this.bitField0_ |= 32;
        this.underexposed_ = d;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (g4.f146097a[v0Var.ordinal()]) {
            case 1:
                return new FailedChecksPercentages();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004\u0006က\u0005\u0007က\u0006\bက\u0007\tက\b\nက\t", new Object[]{"bitField0_", "subjectPresent_", "subjectTooFar_", "subjectTooClose_", "subjectRotated_", "blurry_", "underexposed_", "overexposed_", "glare_", "enableTorch_", "mrzUnreadable_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (FailedChecksPercentages.class) {
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

    public double getBlurry() {
        return this.blurry_;
    }

    public double getEnableTorch() {
        return this.enableTorch_;
    }

    public double getGlare() {
        return this.glare_;
    }

    public double getMrzUnreadable() {
        return this.mrzUnreadable_;
    }

    public double getOverexposed() {
        return this.overexposed_;
    }

    public double getSubjectPresent() {
        return this.subjectPresent_;
    }

    public double getSubjectRotated() {
        return this.subjectRotated_;
    }

    public double getSubjectTooClose() {
        return this.subjectTooClose_;
    }

    public double getSubjectTooFar() {
        return this.subjectTooFar_;
    }

    public double getUnderexposed() {
        return this.underexposed_;
    }

    public boolean hasBlurry() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasEnableTorch() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasGlare() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasMrzUnreadable() {
        return (this.bitField0_ & 512) != 0;
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

    public static a newBuilder(FailedChecksPercentages failedChecksPercentages) {
        return (a) DEFAULT_INSTANCE.createBuilder(failedChecksPercentages);
    }

    public static FailedChecksPercentages parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FailedChecksPercentages) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FailedChecksPercentages parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (FailedChecksPercentages) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static FailedChecksPercentages parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (FailedChecksPercentages) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static FailedChecksPercentages parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (FailedChecksPercentages) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static FailedChecksPercentages parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FailedChecksPercentages) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FailedChecksPercentages parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (FailedChecksPercentages) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static FailedChecksPercentages parseFrom(InputStream inputStream) throws IOException {
        return (FailedChecksPercentages) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FailedChecksPercentages parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FailedChecksPercentages) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FailedChecksPercentages parseFrom(t tVar) throws IOException {
        return (FailedChecksPercentages) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static FailedChecksPercentages parseFrom(t tVar, d0 d0Var) throws IOException {
        return (FailedChecksPercentages) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
