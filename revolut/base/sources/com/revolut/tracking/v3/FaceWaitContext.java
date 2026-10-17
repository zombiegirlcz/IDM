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
import grl.f4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class FaceWaitContext extends w0 implements e2 {
    private static final FaceWaitContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int VERIFICATION_TOKEN_FIELD_NUMBER = 1;
    private int bitField0_;
    private String verificationToken_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(FaceWaitContext.DEFAULT_INSTANCE);
        }
    }

    static {
        FaceWaitContext faceWaitContext = new FaceWaitContext();
        DEFAULT_INSTANCE = faceWaitContext;
        w0.registerDefaultInstance(FaceWaitContext.class, faceWaitContext);
    }

    private FaceWaitContext() {
    }

    private void clearVerificationToken() {
        this.bitField0_ &= -2;
        this.verificationToken_ = getDefaultInstance().getVerificationToken();
    }

    public static FaceWaitContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static FaceWaitContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FaceWaitContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FaceWaitContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FaceWaitContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationToken(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.verificationToken_ = str;
    }

    private void setVerificationTokenBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.verificationToken_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (f4.f146091a[v0Var.ordinal()]) {
            case 1:
                return new FaceWaitContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "verificationToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (FaceWaitContext.class) {
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

    public String getVerificationToken() {
        return this.verificationToken_;
    }

    public p getVerificationTokenBytes() {
        return p.d(this.verificationToken_);
    }

    public boolean hasVerificationToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(FaceWaitContext faceWaitContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(faceWaitContext);
    }

    public static FaceWaitContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FaceWaitContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FaceWaitContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (FaceWaitContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static FaceWaitContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (FaceWaitContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static FaceWaitContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (FaceWaitContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static FaceWaitContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FaceWaitContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FaceWaitContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (FaceWaitContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static FaceWaitContext parseFrom(InputStream inputStream) throws IOException {
        return (FaceWaitContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FaceWaitContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FaceWaitContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FaceWaitContext parseFrom(t tVar) throws IOException {
        return (FaceWaitContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static FaceWaitContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (FaceWaitContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
