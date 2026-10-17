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
import grl.v8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class RedirectContext extends w0 implements e2 {
    private static final RedirectContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    private int bitField0_;
    private String path_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(RedirectContext.DEFAULT_INSTANCE);
        }
    }

    static {
        RedirectContext redirectContext = new RedirectContext();
        DEFAULT_INSTANCE = redirectContext;
        w0.registerDefaultInstance(RedirectContext.class, redirectContext);
    }

    private RedirectContext() {
    }

    private void clearPath() {
        this.bitField0_ &= -2;
        this.path_ = getDefaultInstance().getPath();
    }

    public static RedirectContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static RedirectContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RedirectContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RedirectContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RedirectContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPath(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.path_ = str;
    }

    private void setPathBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.path_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (v8.f146223a[v0Var.ordinal()]) {
            case 1:
                return new RedirectContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "path_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (RedirectContext.class) {
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

    public String getPath() {
        return this.path_;
    }

    public p getPathBytes() {
        return p.d(this.path_);
    }

    public boolean hasPath() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(RedirectContext redirectContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(redirectContext);
    }

    public static RedirectContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RedirectContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RedirectContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (RedirectContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static RedirectContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (RedirectContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RedirectContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (RedirectContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static RedirectContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RedirectContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RedirectContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (RedirectContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static RedirectContext parseFrom(InputStream inputStream) throws IOException {
        return (RedirectContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RedirectContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RedirectContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RedirectContext parseFrom(t tVar) throws IOException {
        return (RedirectContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static RedirectContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (RedirectContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
