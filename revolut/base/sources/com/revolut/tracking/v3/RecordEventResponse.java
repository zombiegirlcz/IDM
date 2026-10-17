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
import grl.b4;
import grl.u8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class RecordEventResponse extends w0 implements e2 {
    public static final int CODE_FIELD_NUMBER = 2;
    private static final RecordEventResponse DEFAULT_INSTANCE;
    public static final int OK_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int code_;
    private boolean ok_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(RecordEventResponse.DEFAULT_INSTANCE);
        }
    }

    static {
        RecordEventResponse recordEventResponse = new RecordEventResponse();
        DEFAULT_INSTANCE = recordEventResponse;
        w0.registerDefaultInstance(RecordEventResponse.class, recordEventResponse);
    }

    private RecordEventResponse() {
    }

    private void clearCode() {
        this.code_ = 0;
    }

    private void clearOk() {
        this.ok_ = false;
    }

    public static RecordEventResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static RecordEventResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RecordEventResponse) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecordEventResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RecordEventResponse) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCode(b4 b4Var) {
        this.code_ = b4Var.getNumber();
    }

    private void setCodeValue(int i) {
        this.code_ = i;
    }

    private void setOk(boolean z) {
        this.ok_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (u8.f146215a[v0Var.ordinal()]) {
            case 1:
                return new RecordEventResponse();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\f", new Object[]{"ok_", "code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (RecordEventResponse.class) {
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

    public b4 getCode() {
        b4 b4VarA = b4.a(this.code_);
        return b4VarA == null ? b4.UNRECOGNIZED : b4VarA;
    }

    public int getCodeValue() {
        return this.code_;
    }

    public boolean getOk() {
        return this.ok_;
    }

    public static a newBuilder(RecordEventResponse recordEventResponse) {
        return (a) DEFAULT_INSTANCE.createBuilder(recordEventResponse);
    }

    public static RecordEventResponse parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RecordEventResponse) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RecordEventResponse parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (RecordEventResponse) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static RecordEventResponse parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (RecordEventResponse) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RecordEventResponse parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (RecordEventResponse) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static RecordEventResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RecordEventResponse) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RecordEventResponse parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (RecordEventResponse) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static RecordEventResponse parseFrom(InputStream inputStream) throws IOException {
        return (RecordEventResponse) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RecordEventResponse parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RecordEventResponse) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RecordEventResponse parseFrom(t tVar) throws IOException {
        return (RecordEventResponse) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static RecordEventResponse parseFrom(t tVar, d0 d0Var) throws IOException {
        return (RecordEventResponse) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
