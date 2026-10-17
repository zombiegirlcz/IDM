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
import grl.v7;
import grl.x7;
import grl.z7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class PayLaterCrossSellContext extends w0 implements e2 {
    public static final int CROSS_SELL_TYPE_FIELD_NUMBER = 2;
    private static final PayLaterCrossSellContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PRODUCT_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int crossSellType_;
    private int productType_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(PayLaterCrossSellContext.DEFAULT_INSTANCE);
        }
    }

    static {
        PayLaterCrossSellContext payLaterCrossSellContext = new PayLaterCrossSellContext();
        DEFAULT_INSTANCE = payLaterCrossSellContext;
        w0.registerDefaultInstance(PayLaterCrossSellContext.class, payLaterCrossSellContext);
    }

    private PayLaterCrossSellContext() {
    }

    private void clearCrossSellType() {
        this.bitField0_ &= -3;
        this.crossSellType_ = 0;
    }

    private void clearProductType() {
        this.bitField0_ &= -2;
        this.productType_ = 0;
    }

    public static PayLaterCrossSellContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static PayLaterCrossSellContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PayLaterCrossSellContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PayLaterCrossSellContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PayLaterCrossSellContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrossSellType(x7 x7Var) {
        this.crossSellType_ = x7Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setCrossSellTypeValue(int i) {
        this.bitField0_ |= 2;
        this.crossSellType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductType(z7 z7Var) {
        this.productType_ = z7Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setProductTypeValue(int i) {
        this.bitField0_ |= 1;
        this.productType_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (v7.f146222a[v0Var.ordinal()]) {
            case 1:
                return new PayLaterCrossSellContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "productType_", "crossSellType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (PayLaterCrossSellContext.class) {
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

    public x7 getCrossSellType() {
        x7 x7VarA = x7.a(this.crossSellType_);
        return x7VarA == null ? x7.UNRECOGNIZED : x7VarA;
    }

    public int getCrossSellTypeValue() {
        return this.crossSellType_;
    }

    public z7 getProductType() {
        z7 z7VarA = z7.a(this.productType_);
        return z7VarA == null ? z7.UNRECOGNIZED : z7VarA;
    }

    public int getProductTypeValue() {
        return this.productType_;
    }

    public boolean hasCrossSellType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProductType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(PayLaterCrossSellContext payLaterCrossSellContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(payLaterCrossSellContext);
    }

    public static PayLaterCrossSellContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (PayLaterCrossSellContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static PayLaterCrossSellContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (PayLaterCrossSellContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static PayLaterCrossSellContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (PayLaterCrossSellContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static PayLaterCrossSellContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (PayLaterCrossSellContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static PayLaterCrossSellContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PayLaterCrossSellContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PayLaterCrossSellContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (PayLaterCrossSellContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static PayLaterCrossSellContext parseFrom(InputStream inputStream) throws IOException {
        return (PayLaterCrossSellContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PayLaterCrossSellContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (PayLaterCrossSellContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static PayLaterCrossSellContext parseFrom(t tVar) throws IOException {
        return (PayLaterCrossSellContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static PayLaterCrossSellContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (PayLaterCrossSellContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
