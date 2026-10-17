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
import grl.p7;
import grl.r7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class P4UWidgetContext extends w0 implements e2 {
    private static final P4UWidgetContext DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int IS_FIRST_IMPRESSION_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String id_ = "";
    private boolean isFirstImpression_;
    private int state_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(P4UWidgetContext.DEFAULT_INSTANCE);
        }
    }

    static {
        P4UWidgetContext p4UWidgetContext = new P4UWidgetContext();
        DEFAULT_INSTANCE = p4UWidgetContext;
        w0.registerDefaultInstance(P4UWidgetContext.class, p4UWidgetContext);
    }

    private P4UWidgetContext() {
    }

    private void clearId() {
        this.bitField0_ &= -5;
        this.id_ = getDefaultInstance().getId();
    }

    private void clearIsFirstImpression() {
        this.bitField0_ &= -3;
        this.isFirstImpression_ = false;
    }

    private void clearState() {
        this.bitField0_ &= -2;
        this.state_ = 0;
    }

    public static P4UWidgetContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static P4UWidgetContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (P4UWidgetContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static P4UWidgetContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (P4UWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.id_ = str;
    }

    private void setIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.id_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFirstImpression(boolean z) {
        this.bitField0_ |= 2;
        this.isFirstImpression_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(r7 r7Var) {
        this.state_ = r7Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setStateValue(int i) {
        this.bitField0_ |= 1;
        this.state_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (p7.f146171a[v0Var.ordinal()]) {
            case 1:
                return new P4UWidgetContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "state_", "isFirstImpression_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (P4UWidgetContext.class) {
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

    public String getId() {
        return this.id_;
    }

    public p getIdBytes() {
        return p.d(this.id_);
    }

    public boolean getIsFirstImpression() {
        return this.isFirstImpression_;
    }

    public r7 getState() {
        int i = this.state_;
        r7 r7Var = i != 0 ? i != 1 ? null : r7.ERROR : r7.LOADED;
        return r7Var == null ? r7.UNRECOGNIZED : r7Var;
    }

    public int getStateValue() {
        return this.state_;
    }

    public boolean hasId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsFirstImpression() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasState() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(P4UWidgetContext p4UWidgetContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(p4UWidgetContext);
    }

    public static P4UWidgetContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (P4UWidgetContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static P4UWidgetContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (P4UWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static P4UWidgetContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (P4UWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static P4UWidgetContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (P4UWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static P4UWidgetContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (P4UWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static P4UWidgetContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (P4UWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static P4UWidgetContext parseFrom(InputStream inputStream) throws IOException {
        return (P4UWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static P4UWidgetContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (P4UWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static P4UWidgetContext parseFrom(t tVar) throws IOException {
        return (P4UWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static P4UWidgetContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (P4UWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
