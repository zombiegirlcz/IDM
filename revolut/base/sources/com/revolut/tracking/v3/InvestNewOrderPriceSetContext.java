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
import grl.b6;
import grl.d6;
import grl.p5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class InvestNewOrderPriceSetContext extends w0 implements e2 {
    private static final InvestNewOrderPriceSetContext DEFAULT_INSTANCE;
    public static final int LAST_MARKET_PRICE_FIELD_NUMBER = 2;
    public static final int ORDER_SIDE_FIELD_NUMBER = 3;
    public static final int ORDER_TYPE_FIELD_NUMBER = 4;
    private static volatile m2 PARSER = null;
    public static final int SELECTED_PRICE_FIELD_NUMBER = 1;
    private int bitField0_;
    private double lastMarketPrice_;
    private int orderSide_;
    private int orderType_;
    private double selectedPrice_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(InvestNewOrderPriceSetContext.DEFAULT_INSTANCE);
        }
    }

    static {
        InvestNewOrderPriceSetContext investNewOrderPriceSetContext = new InvestNewOrderPriceSetContext();
        DEFAULT_INSTANCE = investNewOrderPriceSetContext;
        w0.registerDefaultInstance(InvestNewOrderPriceSetContext.class, investNewOrderPriceSetContext);
    }

    private InvestNewOrderPriceSetContext() {
    }

    private void clearLastMarketPrice() {
        this.bitField0_ &= -3;
        this.lastMarketPrice_ = 0.0d;
    }

    private void clearOrderSide() {
        this.bitField0_ &= -5;
        this.orderSide_ = 0;
    }

    private void clearOrderType() {
        this.bitField0_ &= -9;
        this.orderType_ = 0;
    }

    private void clearSelectedPrice() {
        this.bitField0_ &= -2;
        this.selectedPrice_ = 0.0d;
    }

    public static InvestNewOrderPriceSetContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static InvestNewOrderPriceSetContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InvestNewOrderPriceSetContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestNewOrderPriceSetContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InvestNewOrderPriceSetContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastMarketPrice(double d) {
        this.bitField0_ |= 2;
        this.lastMarketPrice_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderSide(b6 b6Var) {
        this.orderSide_ = b6Var.getNumber();
        this.bitField0_ |= 4;
    }

    private void setOrderSideValue(int i) {
        this.bitField0_ |= 4;
        this.orderSide_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderType(d6 d6Var) {
        this.orderType_ = d6Var.getNumber();
        this.bitField0_ |= 8;
    }

    private void setOrderTypeValue(int i) {
        this.bitField0_ |= 8;
        this.orderType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedPrice(double d) {
        this.bitField0_ |= 1;
        this.selectedPrice_ = d;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (p5.f146170a[v0Var.ordinal()]) {
            case 1:
                return new InvestNewOrderPriceSetContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"bitField0_", "selectedPrice_", "lastMarketPrice_", "orderSide_", "orderType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (InvestNewOrderPriceSetContext.class) {
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

    public double getLastMarketPrice() {
        return this.lastMarketPrice_;
    }

    public b6 getOrderSide() {
        b6 b6VarA = b6.a(this.orderSide_);
        return b6VarA == null ? b6.UNRECOGNIZED : b6VarA;
    }

    public int getOrderSideValue() {
        return this.orderSide_;
    }

    public d6 getOrderType() {
        d6 d6VarA = d6.a(this.orderType_);
        return d6VarA == null ? d6.UNRECOGNIZED : d6VarA;
    }

    public int getOrderTypeValue() {
        return this.orderType_;
    }

    public double getSelectedPrice() {
        return this.selectedPrice_;
    }

    public boolean hasLastMarketPrice() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOrderSide() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasOrderType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSelectedPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(InvestNewOrderPriceSetContext investNewOrderPriceSetContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(investNewOrderPriceSetContext);
    }

    public static InvestNewOrderPriceSetContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestNewOrderPriceSetContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestNewOrderPriceSetContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestNewOrderPriceSetContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static InvestNewOrderPriceSetContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (InvestNewOrderPriceSetContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static InvestNewOrderPriceSetContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestNewOrderPriceSetContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static InvestNewOrderPriceSetContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InvestNewOrderPriceSetContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InvestNewOrderPriceSetContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestNewOrderPriceSetContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static InvestNewOrderPriceSetContext parseFrom(InputStream inputStream) throws IOException {
        return (InvestNewOrderPriceSetContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestNewOrderPriceSetContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestNewOrderPriceSetContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestNewOrderPriceSetContext parseFrom(t tVar) throws IOException {
        return (InvestNewOrderPriceSetContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static InvestNewOrderPriceSetContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (InvestNewOrderPriceSetContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
