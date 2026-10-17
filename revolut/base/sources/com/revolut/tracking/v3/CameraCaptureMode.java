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
import grl.l1;
import grl.n1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class CameraCaptureMode extends w0 implements e2 {
    private static final CameraCaptureMode DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private int mode_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CameraCaptureMode.DEFAULT_INSTANCE);
        }
    }

    static {
        CameraCaptureMode cameraCaptureMode = new CameraCaptureMode();
        DEFAULT_INSTANCE = cameraCaptureMode;
        w0.registerDefaultInstance(CameraCaptureMode.class, cameraCaptureMode);
    }

    private CameraCaptureMode() {
    }

    private void clearMode() {
        this.bitField0_ &= -2;
        this.mode_ = 0;
    }

    public static CameraCaptureMode getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CameraCaptureMode parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CameraCaptureMode) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CameraCaptureMode parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CameraCaptureMode) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMode(n1 n1Var) {
        this.mode_ = n1Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setModeValue(int i) {
        this.bitField0_ |= 1;
        this.mode_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (l1.f146132a[v0Var.ordinal()]) {
            case 1:
                return new CameraCaptureMode();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "mode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CameraCaptureMode.class) {
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

    public n1 getMode() {
        int i = this.mode_;
        n1 n1Var = i != 0 ? i != 1 ? null : n1.TILT : n1.NORMAL;
        return n1Var == null ? n1.UNRECOGNIZED : n1Var;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public boolean hasMode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(CameraCaptureMode cameraCaptureMode) {
        return (a) DEFAULT_INSTANCE.createBuilder(cameraCaptureMode);
    }

    public static CameraCaptureMode parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CameraCaptureMode) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CameraCaptureMode parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCaptureMode) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CameraCaptureMode parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CameraCaptureMode) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CameraCaptureMode parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCaptureMode) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CameraCaptureMode parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CameraCaptureMode) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CameraCaptureMode parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCaptureMode) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CameraCaptureMode parseFrom(InputStream inputStream) throws IOException {
        return (CameraCaptureMode) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CameraCaptureMode parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CameraCaptureMode) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CameraCaptureMode parseFrom(t tVar) throws IOException {
        return (CameraCaptureMode) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CameraCaptureMode parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CameraCaptureMode) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
