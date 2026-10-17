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
import grl.a8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class PayLaterToggleContext extends w0 implements e2 {
    private static final PayLaterToggleContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PAY_LATER_TOGGLE_ENABLED_FIELD_NUMBER = 2;
    public static final int PAY_LATER_TOGGLE_VISIBLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean payLaterToggleEnabled_;
    private boolean payLaterToggleVisible_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(PayLaterToggleContext.DEFAULT_INSTANCE);
        }
    }

    static {
        PayLaterToggleContext payLaterToggleContext = new PayLaterToggleContext();
        DEFAULT_INSTANCE = payLaterToggleContext;
        w0.registerDefaultInstance(PayLaterToggleContext.class, payLaterToggleContext);
    }

    private PayLaterToggleContext() {
    }

    private void clearPayLaterToggleEnabled() {
        this.bitField0_ &= -3;
        this.payLaterToggleEnabled_ = false;
    }

    private void clearPayLaterToggleVisible() {
        this.bitField0_ &= -2;
        this.payLaterToggleVisible_ = false;
    }

    public static PayLaterToggleContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static PayLaterToggleContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PayLaterToggleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PayLaterToggleContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PayLaterToggleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayLaterToggleEnabled(boolean z) {
        this.bitField0_ |= 2;
        this.payLaterToggleEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPayLaterToggleVisible(boolean z) {
        this.bitField0_ |= 1;
        this.payLaterToggleVisible_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (a8.f146058a[v0Var.ordinal()]) {
            case 1:
                return new PayLaterToggleContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "payLaterToggleVisible_", "payLaterToggleEnabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (PayLaterToggleContext.class) {
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

    public boolean getPayLaterToggleEnabled() {
        return this.payLaterToggleEnabled_;
    }

    public boolean getPayLaterToggleVisible() {
        return this.payLaterToggleVisible_;
    }

    public boolean hasPayLaterToggleEnabled() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPayLaterToggleVisible() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(PayLaterToggleContext payLaterToggleContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(payLaterToggleContext);
    }

    public static PayLaterToggleContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (PayLaterToggleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static PayLaterToggleContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (PayLaterToggleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static PayLaterToggleContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (PayLaterToggleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static PayLaterToggleContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (PayLaterToggleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static PayLaterToggleContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PayLaterToggleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PayLaterToggleContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (PayLaterToggleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static PayLaterToggleContext parseFrom(InputStream inputStream) throws IOException {
        return (PayLaterToggleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PayLaterToggleContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (PayLaterToggleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static PayLaterToggleContext parseFrom(t tVar) throws IOException {
        return (PayLaterToggleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static PayLaterToggleContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (PayLaterToggleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
