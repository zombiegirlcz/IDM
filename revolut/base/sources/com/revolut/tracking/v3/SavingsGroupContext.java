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
import grl.ja;
import grl.la;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SavingsGroupContext extends w0 implements e2 {
    private static final SavingsGroupContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int type_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SavingsGroupContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SavingsGroupContext savingsGroupContext = new SavingsGroupContext();
        DEFAULT_INSTANCE = savingsGroupContext;
        w0.registerDefaultInstance(SavingsGroupContext.class, savingsGroupContext);
    }

    private SavingsGroupContext() {
    }

    private void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static SavingsGroupContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SavingsGroupContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SavingsGroupContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SavingsGroupContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SavingsGroupContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(la laVar) {
        this.type_ = laVar.getNumber();
        this.bitField0_ |= 1;
    }

    private void setTypeValue(int i) {
        this.bitField0_ |= 1;
        this.type_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (ja.f146121a[v0Var.ordinal()]) {
            case 1:
                return new SavingsGroupContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SavingsGroupContext.class) {
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

    public la getType() {
        la laVarA = la.a(this.type_);
        return laVarA == null ? la.UNRECOGNIZED : laVarA;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(SavingsGroupContext savingsGroupContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(savingsGroupContext);
    }

    public static SavingsGroupContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SavingsGroupContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SavingsGroupContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SavingsGroupContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SavingsGroupContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SavingsGroupContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SavingsGroupContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SavingsGroupContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SavingsGroupContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SavingsGroupContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SavingsGroupContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SavingsGroupContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SavingsGroupContext parseFrom(InputStream inputStream) throws IOException {
        return (SavingsGroupContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SavingsGroupContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SavingsGroupContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SavingsGroupContext parseFrom(t tVar) throws IOException {
        return (SavingsGroupContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SavingsGroupContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SavingsGroupContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
