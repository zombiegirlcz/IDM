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
import com.revolut.tracking.v3.ScreenProtection;
import grl.ma;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class ScreenMetadata extends w0 implements e2 {
    private static final ScreenMetadata DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int SCREEN_PROTECTION_FIELD_NUMBER = 1;
    private int bitField0_;
    private ScreenProtection screenProtection_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(ScreenMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        ScreenMetadata screenMetadata = new ScreenMetadata();
        DEFAULT_INSTANCE = screenMetadata;
        w0.registerDefaultInstance(ScreenMetadata.class, screenMetadata);
    }

    private ScreenMetadata() {
    }

    private void clearScreenProtection() {
        this.screenProtection_ = null;
        this.bitField0_ &= -2;
    }

    public static ScreenMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeScreenProtection(ScreenProtection screenProtection) {
        screenProtection.getClass();
        ScreenProtection screenProtection2 = this.screenProtection_;
        if (screenProtection2 == null || screenProtection2 == ScreenProtection.getDefaultInstance()) {
            this.screenProtection_ = screenProtection;
        } else {
            ScreenProtection.a aVarNewBuilder = ScreenProtection.newBuilder(this.screenProtection_);
            aVarNewBuilder.f(screenProtection);
            this.screenProtection_ = (ScreenProtection) aVarNewBuilder.b();
        }
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ScreenMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ScreenMetadata) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScreenMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ScreenMetadata) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenProtection(ScreenProtection screenProtection) {
        screenProtection.getClass();
        this.screenProtection_ = screenProtection;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (ma.f146144a[v0Var.ordinal()]) {
            case 1:
                return new ScreenMetadata();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "screenProtection_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ScreenMetadata.class) {
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

    public ScreenProtection getScreenProtection() {
        ScreenProtection screenProtection = this.screenProtection_;
        return screenProtection == null ? ScreenProtection.getDefaultInstance() : screenProtection;
    }

    public boolean hasScreenProtection() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(ScreenMetadata screenMetadata) {
        return (a) DEFAULT_INSTANCE.createBuilder(screenMetadata);
    }

    public static ScreenMetadata parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ScreenMetadata) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ScreenMetadata parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (ScreenMetadata) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ScreenMetadata parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ScreenMetadata) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ScreenMetadata parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (ScreenMetadata) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ScreenMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ScreenMetadata) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ScreenMetadata parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (ScreenMetadata) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ScreenMetadata parseFrom(InputStream inputStream) throws IOException {
        return (ScreenMetadata) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScreenMetadata parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ScreenMetadata) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ScreenMetadata parseFrom(t tVar) throws IOException {
        return (ScreenMetadata) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ScreenMetadata parseFrom(t tVar, d0 d0Var) throws IOException {
        return (ScreenMetadata) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
