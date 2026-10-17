package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends w0 implements e2 {
    private static final k3 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        k3 k3Var = new k3();
        DEFAULT_INSTANCE = k3Var;
        w0.registerDefaultInstance(k3.class, k3Var);
    }

    private k3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNanos() {
        this.nanos_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static k3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static j3 newBuilder() {
        return (j3) DEFAULT_INSTANCE.createBuilder();
    }

    public static k3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (k3) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (k3) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNanos(int i) {
        this.nanos_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeconds(long j2) {
        this.seconds_ = j2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (i3.f49735a[v0Var.ordinal()]) {
            case 1:
                return new k3();
            case 2:
                return new j3(DEFAULT_INSTANCE);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (k3.class) {
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

    public int getNanos() {
        return this.nanos_;
    }

    public long getSeconds() {
        return this.seconds_;
    }

    public static j3 newBuilder(k3 k3Var) {
        return (j3) DEFAULT_INSTANCE.createBuilder(k3Var);
    }

    public static k3 parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (k3) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static k3 parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (k3) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static k3 parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (k3) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static k3 parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (k3) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static k3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (k3) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k3 parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (k3) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static k3 parseFrom(InputStream inputStream) throws IOException {
        return (k3) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k3 parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (k3) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static k3 parseFrom(t tVar) throws IOException {
        return (k3) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static k3 parseFrom(t tVar, d0 d0Var) throws IOException {
        return (k3) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
