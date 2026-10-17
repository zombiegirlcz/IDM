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
import grl.na;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class ScreenProtection extends w0 implements e2 {
    private static final ScreenProtection DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PROTECTED_FIELD_NUMBER = 1;
    public static final int RECORDED_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean protected_;
    private boolean recorded_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(ScreenProtection.DEFAULT_INSTANCE);
        }
    }

    static {
        ScreenProtection screenProtection = new ScreenProtection();
        DEFAULT_INSTANCE = screenProtection;
        w0.registerDefaultInstance(ScreenProtection.class, screenProtection);
    }

    private ScreenProtection() {
    }

    private void clearProtected() {
        this.bitField0_ &= -2;
        this.protected_ = false;
    }

    private void clearRecorded() {
        this.bitField0_ &= -3;
        this.recorded_ = false;
    }

    public static ScreenProtection getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ScreenProtection parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ScreenProtection) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScreenProtection parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ScreenProtection) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtected(boolean z) {
        this.bitField0_ |= 1;
        this.protected_ = z;
    }

    private void setRecorded(boolean z) {
        this.bitField0_ |= 2;
        this.recorded_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (na.f146153a[v0Var.ordinal()]) {
            case 1:
                return new ScreenProtection();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "protected_", "recorded_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ScreenProtection.class) {
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

    public boolean getProtected() {
        return this.protected_;
    }

    public boolean getRecorded() {
        return this.recorded_;
    }

    public boolean hasProtected() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRecorded() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(ScreenProtection screenProtection) {
        return (a) DEFAULT_INSTANCE.createBuilder(screenProtection);
    }

    public static ScreenProtection parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ScreenProtection) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ScreenProtection parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (ScreenProtection) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ScreenProtection parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ScreenProtection) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ScreenProtection parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (ScreenProtection) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ScreenProtection parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ScreenProtection) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ScreenProtection parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (ScreenProtection) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ScreenProtection parseFrom(InputStream inputStream) throws IOException {
        return (ScreenProtection) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScreenProtection parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ScreenProtection) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ScreenProtection parseFrom(t tVar) throws IOException {
        return (ScreenProtection) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ScreenProtection parseFrom(t tVar, d0 d0Var) throws IOException {
        return (ScreenProtection) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
