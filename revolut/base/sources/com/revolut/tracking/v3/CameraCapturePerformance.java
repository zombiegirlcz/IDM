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
import grl.p1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class CameraCapturePerformance extends w0 implements e2 {
    public static final int AVERAGE_TIME_BETWEEN_VALUES_FIELD_NUMBER = 2;
    private static final CameraCapturePerformance DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int TIME_UNTIL_FIRST_VALUE_RECEIVED_FIELD_NUMBER = 1;
    private double averageTimeBetweenValues_;
    private int bitField0_;
    private double timeUntilFirstValueReceived_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CameraCapturePerformance.DEFAULT_INSTANCE);
        }
    }

    static {
        CameraCapturePerformance cameraCapturePerformance = new CameraCapturePerformance();
        DEFAULT_INSTANCE = cameraCapturePerformance;
        w0.registerDefaultInstance(CameraCapturePerformance.class, cameraCapturePerformance);
    }

    private CameraCapturePerformance() {
    }

    private void clearAverageTimeBetweenValues() {
        this.bitField0_ &= -3;
        this.averageTimeBetweenValues_ = 0.0d;
    }

    private void clearTimeUntilFirstValueReceived() {
        this.bitField0_ &= -2;
        this.timeUntilFirstValueReceived_ = 0.0d;
    }

    public static CameraCapturePerformance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CameraCapturePerformance parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CameraCapturePerformance) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CameraCapturePerformance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CameraCapturePerformance) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageTimeBetweenValues(double d) {
        this.bitField0_ |= 2;
        this.averageTimeBetweenValues_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeUntilFirstValueReceived(double d) {
        this.bitField0_ |= 1;
        this.timeUntilFirstValueReceived_ = d;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (p1.f146167a[v0Var.ordinal()]) {
            case 1:
                return new CameraCapturePerformance();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"bitField0_", "timeUntilFirstValueReceived_", "averageTimeBetweenValues_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CameraCapturePerformance.class) {
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

    public double getAverageTimeBetweenValues() {
        return this.averageTimeBetweenValues_;
    }

    public double getTimeUntilFirstValueReceived() {
        return this.timeUntilFirstValueReceived_;
    }

    public boolean hasAverageTimeBetweenValues() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimeUntilFirstValueReceived() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(CameraCapturePerformance cameraCapturePerformance) {
        return (a) DEFAULT_INSTANCE.createBuilder(cameraCapturePerformance);
    }

    public static CameraCapturePerformance parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CameraCapturePerformance) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CameraCapturePerformance parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCapturePerformance) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CameraCapturePerformance parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CameraCapturePerformance) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CameraCapturePerformance parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCapturePerformance) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CameraCapturePerformance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CameraCapturePerformance) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CameraCapturePerformance parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCapturePerformance) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CameraCapturePerformance parseFrom(InputStream inputStream) throws IOException {
        return (CameraCapturePerformance) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CameraCapturePerformance parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CameraCapturePerformance) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CameraCapturePerformance parseFrom(t tVar) throws IOException {
        return (CameraCapturePerformance) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CameraCapturePerformance parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CameraCapturePerformance) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
