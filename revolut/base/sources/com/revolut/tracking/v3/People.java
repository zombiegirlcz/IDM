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
import grl.c8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class People extends w0 implements e2 {
    private static final People DEFAULT_INSTANCE;
    private static volatile m2 PARSER;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(People.DEFAULT_INSTANCE);
        }
    }

    static {
        People people = new People();
        DEFAULT_INSTANCE = people;
        w0.registerDefaultInstance(People.class, people);
    }

    private People() {
    }

    public static People getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static People parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (People) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static People parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (People) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (c8.f146072a[v0Var.ordinal()]) {
            case 1:
                return new People();
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
                synchronized (People.class) {
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

    public static a newBuilder(People people) {
        return (a) DEFAULT_INSTANCE.createBuilder(people);
    }

    public static People parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (People) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static People parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (People) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static People parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (People) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static People parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (People) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static People parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (People) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static People parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (People) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static People parseFrom(InputStream inputStream) throws IOException {
        return (People) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static People parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (People) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static People parseFrom(t tVar) throws IOException {
        return (People) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static People parseFrom(t tVar, d0 d0Var) throws IOException {
        return (People) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
