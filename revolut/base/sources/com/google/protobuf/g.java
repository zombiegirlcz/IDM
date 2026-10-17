package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class g extends w0 implements e2 {
    private static final g DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private p value_ = p.f49757b;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        w0.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (g) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (g) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(p pVar) {
        b.checkByteStringIsUtf8(pVar);
        this.typeUrl_ = pVar.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(p pVar) {
        pVar.getClass();
        this.value_ = pVar;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (e.f49701a[v0Var.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new f(DEFAULT_INSTANCE);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (g.class) {
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

    public String getTypeUrl() {
        return this.typeUrl_;
    }

    public p getTypeUrlBytes() {
        return p.d(this.typeUrl_);
    }

    public p getValue() {
        return this.value_;
    }

    public static f newBuilder(g gVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (g) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static g parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (g) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static g parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (g) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static g parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (g) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static g parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (g) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (g) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static g parseFrom(InputStream inputStream) throws IOException {
        return (g) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (g) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static g parseFrom(t tVar) throws IOException {
        return (g) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static g parseFrom(t tVar, d0 d0Var) throws IOException {
        return (g) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
