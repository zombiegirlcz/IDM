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
import grl.k5;
import grl.m5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class IntentContext extends w0 implements e2 {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final IntentContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String action_ = "";
    private int bitField0_;
    private int type_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((IntentContext) this.f49761b).setAction(str);
        }

        public final void i(m5 m5Var) {
            c();
            ((IntentContext) this.f49761b).setType(m5Var);
        }

        private a() {
            super(IntentContext.DEFAULT_INSTANCE);
        }
    }

    static {
        IntentContext intentContext = new IntentContext();
        DEFAULT_INSTANCE = intentContext;
        w0.registerDefaultInstance(IntentContext.class, intentContext);
    }

    private IntentContext() {
    }

    private void clearAction() {
        this.bitField0_ &= -2;
        this.action_ = getDefaultInstance().getAction();
    }

    private void clearType() {
        this.bitField0_ &= -3;
        this.type_ = 0;
    }

    public static IntentContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static IntentContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IntentContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IntentContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IntentContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.action_ = str;
    }

    private void setActionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.action_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(m5 m5Var) {
        this.type_ = m5Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setTypeValue(int i) {
        this.bitField0_ |= 2;
        this.type_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (k5.f146127a[v0Var.ordinal()]) {
            case 1:
                return new IntentContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "action_", "type_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (IntentContext.class) {
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

    public String getAction() {
        return this.action_;
    }

    public p getActionBytes() {
        return p.d(this.action_);
    }

    public m5 getType() {
        int i = this.type_;
        m5 m5Var = i != 0 ? i != 1 ? null : m5.outgoing : m5.incoming;
        return m5Var == null ? m5.UNRECOGNIZED : m5Var;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasAction() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(IntentContext intentContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(intentContext);
    }

    public static IntentContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (IntentContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static IntentContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (IntentContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static IntentContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (IntentContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static IntentContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (IntentContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static IntentContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IntentContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IntentContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (IntentContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static IntentContext parseFrom(InputStream inputStream) throws IOException {
        return (IntentContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IntentContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (IntentContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static IntentContext parseFrom(t tVar) throws IOException {
        return (IntentContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static IntentContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (IntentContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
