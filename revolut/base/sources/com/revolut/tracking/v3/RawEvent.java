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
import grl.t8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class RawEvent extends w0 implements e2 {
    private static final RawEvent DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private p payload_ = p.f49757b;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(RawEvent.DEFAULT_INSTANCE);
        }
    }

    static {
        RawEvent rawEvent = new RawEvent();
        DEFAULT_INSTANCE = rawEvent;
        w0.registerDefaultInstance(RawEvent.class, rawEvent);
    }

    private RawEvent() {
    }

    private void clearPayload() {
        this.payload_ = getDefaultInstance().getPayload();
    }

    public static RawEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static RawEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RawEvent) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RawEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RawEvent) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayload(p pVar) {
        pVar.getClass();
        this.payload_ = pVar;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (t8.f146207a[v0Var.ordinal()]) {
            case 1:
                return new RawEvent();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"payload_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (RawEvent.class) {
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

    public p getPayload() {
        return this.payload_;
    }

    public static a newBuilder(RawEvent rawEvent) {
        return (a) DEFAULT_INSTANCE.createBuilder(rawEvent);
    }

    public static RawEvent parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RawEvent) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RawEvent parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (RawEvent) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static RawEvent parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (RawEvent) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RawEvent parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (RawEvent) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static RawEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RawEvent) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RawEvent parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (RawEvent) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static RawEvent parseFrom(InputStream inputStream) throws IOException {
        return (RawEvent) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RawEvent parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RawEvent) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RawEvent parseFrom(t tVar) throws IOException {
        return (RawEvent) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static RawEvent parseFrom(t tVar, d0 d0Var) throws IOException {
        return (RawEvent) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
