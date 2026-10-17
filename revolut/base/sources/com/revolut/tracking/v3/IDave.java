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
import grl.v4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class IDave extends w0 implements e2 {
    private static final IDave DEFAULT_INSTANCE;
    private static volatile m2 PARSER;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(IDave.DEFAULT_INSTANCE);
        }
    }

    static {
        IDave iDave = new IDave();
        DEFAULT_INSTANCE = iDave;
        w0.registerDefaultInstance(IDave.class, iDave);
    }

    private IDave() {
    }

    public static IDave getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static IDave parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IDave) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IDave parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IDave) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (v4.f146220a[v0Var.ordinal()]) {
            case 1:
                return new IDave();
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
                synchronized (IDave.class) {
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

    public static a newBuilder(IDave iDave) {
        return (a) DEFAULT_INSTANCE.createBuilder(iDave);
    }

    public static IDave parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (IDave) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static IDave parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (IDave) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static IDave parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (IDave) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static IDave parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (IDave) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static IDave parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IDave) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IDave parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (IDave) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static IDave parseFrom(InputStream inputStream) throws IOException {
        return (IDave) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IDave parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (IDave) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static IDave parseFrom(t tVar) throws IOException {
        return (IDave) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static IDave parseFrom(t tVar, d0 d0Var) throws IOException {
        return (IDave) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
