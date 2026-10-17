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
import grl.i3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class DetectedCameraIssues extends w0 implements e2 {
    public static final int CAPTURE_ERROR_FIELD_NUMBER = 5;
    public static final int CLASSIFICATION_ERROR_FIELD_NUMBER = 6;
    private static final DetectedCameraIssues DEFAULT_INSTANCE;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String captureError_ = "";
    private String classificationError_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(DetectedCameraIssues.DEFAULT_INSTANCE);
        }
    }

    static {
        DetectedCameraIssues detectedCameraIssues = new DetectedCameraIssues();
        DEFAULT_INSTANCE = detectedCameraIssues;
        w0.registerDefaultInstance(DetectedCameraIssues.class, detectedCameraIssues);
    }

    private DetectedCameraIssues() {
    }

    private void clearCaptureError() {
        this.bitField0_ &= -2;
        this.captureError_ = getDefaultInstance().getCaptureError();
    }

    private void clearClassificationError() {
        this.bitField0_ &= -3;
        this.classificationError_ = getDefaultInstance().getClassificationError();
    }

    public static DetectedCameraIssues getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DetectedCameraIssues parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DetectedCameraIssues) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DetectedCameraIssues parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DetectedCameraIssues) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCaptureError(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.captureError_ = str;
    }

    private void setCaptureErrorBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.captureError_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setClassificationError(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.classificationError_ = str;
    }

    private void setClassificationErrorBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.classificationError_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (i3.f146108a[v0Var.ordinal()]) {
            case 1:
                return new DetectedCameraIssues();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ለ\u0000\u0006ለ\u0001", new Object[]{"bitField0_", "captureError_", "classificationError_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (DetectedCameraIssues.class) {
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

    public String getCaptureError() {
        return this.captureError_;
    }

    public p getCaptureErrorBytes() {
        return p.d(this.captureError_);
    }

    public String getClassificationError() {
        return this.classificationError_;
    }

    public p getClassificationErrorBytes() {
        return p.d(this.classificationError_);
    }

    public boolean hasCaptureError() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasClassificationError() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(DetectedCameraIssues detectedCameraIssues) {
        return (a) DEFAULT_INSTANCE.createBuilder(detectedCameraIssues);
    }

    public static DetectedCameraIssues parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (DetectedCameraIssues) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static DetectedCameraIssues parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (DetectedCameraIssues) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static DetectedCameraIssues parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (DetectedCameraIssues) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static DetectedCameraIssues parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (DetectedCameraIssues) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static DetectedCameraIssues parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DetectedCameraIssues) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DetectedCameraIssues parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (DetectedCameraIssues) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static DetectedCameraIssues parseFrom(InputStream inputStream) throws IOException {
        return (DetectedCameraIssues) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DetectedCameraIssues parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (DetectedCameraIssues) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static DetectedCameraIssues parseFrom(t tVar) throws IOException {
        return (DetectedCameraIssues) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static DetectedCameraIssues parseFrom(t tVar, d0 d0Var) throws IOException {
        return (DetectedCameraIssues) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
