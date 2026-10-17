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
import grl.b9;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class ReleasePlatform extends w0 implements e2 {
    private static final ReleasePlatform DEFAULT_INSTANCE;
    private static volatile m2 PARSER;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(ReleasePlatform.DEFAULT_INSTANCE);
        }
    }

    static {
        ReleasePlatform releasePlatform = new ReleasePlatform();
        DEFAULT_INSTANCE = releasePlatform;
        w0.registerDefaultInstance(ReleasePlatform.class, releasePlatform);
    }

    private ReleasePlatform() {
    }

    public static ReleasePlatform getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ReleasePlatform parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReleasePlatform) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReleasePlatform parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReleasePlatform) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (b9.f146065a[v0Var.ordinal()]) {
            case 1:
                return new ReleasePlatform();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ReleasePlatform.class) {
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

    public static a newBuilder(ReleasePlatform releasePlatform) {
        return (a) DEFAULT_INSTANCE.createBuilder(releasePlatform);
    }

    public static ReleasePlatform parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ReleasePlatform) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ReleasePlatform parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (ReleasePlatform) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ReleasePlatform parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ReleasePlatform) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ReleasePlatform parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (ReleasePlatform) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ReleasePlatform parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReleasePlatform) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReleasePlatform parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (ReleasePlatform) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ReleasePlatform parseFrom(InputStream inputStream) throws IOException {
        return (ReleasePlatform) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReleasePlatform parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ReleasePlatform) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ReleasePlatform parseFrom(t tVar) throws IOException {
        return (ReleasePlatform) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ReleasePlatform parseFrom(t tVar, d0 d0Var) throws IOException {
        return (ReleasePlatform) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
