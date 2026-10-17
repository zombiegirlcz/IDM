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
import grl.b3;
import grl.x2;
import grl.z2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class CustomerPresentPaymentContext extends w0 implements e2 {
    private static final CustomerPresentPaymentContext DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int PAYMENTMETHOD_FIELD_NUMBER = 2;
    private int bitField0_;
    private int entryPoint_;
    private int paymentMethod_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CustomerPresentPaymentContext.DEFAULT_INSTANCE);
        }
    }

    static {
        CustomerPresentPaymentContext customerPresentPaymentContext = new CustomerPresentPaymentContext();
        DEFAULT_INSTANCE = customerPresentPaymentContext;
        w0.registerDefaultInstance(CustomerPresentPaymentContext.class, customerPresentPaymentContext);
    }

    private CustomerPresentPaymentContext() {
    }

    private void clearEntryPoint() {
        this.bitField0_ &= -2;
        this.entryPoint_ = 0;
    }

    private void clearPaymentMethod() {
        this.bitField0_ &= -3;
        this.paymentMethod_ = 0;
    }

    public static CustomerPresentPaymentContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CustomerPresentPaymentContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CustomerPresentPaymentContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomerPresentPaymentContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CustomerPresentPaymentContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEntryPoint(z2 z2Var) {
        this.entryPoint_ = z2Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setEntryPointValue(int i) {
        this.bitField0_ |= 1;
        this.entryPoint_ = i;
    }

    private void setPaymentMethod(b3 b3Var) {
        this.paymentMethod_ = b3Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setPaymentMethodValue(int i) {
        this.bitField0_ |= 2;
        this.paymentMethod_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (x2.f146231a[v0Var.ordinal()]) {
            case 1:
                return new CustomerPresentPaymentContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "entryPoint_", "paymentMethod_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CustomerPresentPaymentContext.class) {
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

    public z2 getEntryPoint() {
        z2 z2VarA = z2.a(this.entryPoint_);
        return z2VarA == null ? z2.UNRECOGNIZED : z2VarA;
    }

    public int getEntryPointValue() {
        return this.entryPoint_;
    }

    public b3 getPaymentMethod() {
        b3 b3VarA = b3.a(this.paymentMethod_);
        return b3VarA == null ? b3.UNRECOGNIZED : b3VarA;
    }

    public int getPaymentMethodValue() {
        return this.paymentMethod_;
    }

    public boolean hasEntryPoint() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPaymentMethod() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(CustomerPresentPaymentContext customerPresentPaymentContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(customerPresentPaymentContext);
    }

    public static CustomerPresentPaymentContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CustomerPresentPaymentContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CustomerPresentPaymentContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CustomerPresentPaymentContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CustomerPresentPaymentContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CustomerPresentPaymentContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CustomerPresentPaymentContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CustomerPresentPaymentContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CustomerPresentPaymentContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CustomerPresentPaymentContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CustomerPresentPaymentContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CustomerPresentPaymentContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CustomerPresentPaymentContext parseFrom(InputStream inputStream) throws IOException {
        return (CustomerPresentPaymentContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomerPresentPaymentContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CustomerPresentPaymentContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CustomerPresentPaymentContext parseFrom(t tVar) throws IOException {
        return (CustomerPresentPaymentContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CustomerPresentPaymentContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CustomerPresentPaymentContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
