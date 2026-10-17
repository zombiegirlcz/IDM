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
import grl.e4;
import grl.q5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class InvestNewOrderStartedContext extends w0 implements e2 {
    private static final InvestNewOrderStartedContext DEFAULT_INSTANCE;
    public static final int EXCHANGE_FIELD_NUMBER = 2;
    public static final int EXCHANGE_STATUS_FIELD_NUMBER = 3;
    public static final int ORDER_SIDE_FIELD_NUMBER = 4;
    public static final int ORDER_TYPE_FIELD_NUMBER = 5;
    private static volatile m2 PARSER = null;
    public static final int TICKER_FIELD_NUMBER = 1;
    private int bitField0_;
    private int exchangeStatus_;
    private int orderSide_;
    private int orderType_;
    private String ticker_ = "";
    private String exchange_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(InvestNewOrderStartedContext.DEFAULT_INSTANCE);
        }
    }

    static {
        InvestNewOrderStartedContext investNewOrderStartedContext = new InvestNewOrderStartedContext();
        DEFAULT_INSTANCE = investNewOrderStartedContext;
        w0.registerDefaultInstance(InvestNewOrderStartedContext.class, investNewOrderStartedContext);
    }

    private InvestNewOrderStartedContext() {
    }

    private void clearExchange() {
        this.bitField0_ &= -3;
        this.exchange_ = getDefaultInstance().getExchange();
    }

    private void clearExchangeStatus() {
        this.bitField0_ &= -5;
        this.exchangeStatus_ = 0;
    }

    private void clearOrderSide() {
        this.bitField0_ &= -9;
        this.orderSide_ = 0;
    }

    private void clearOrderType() {
        this.bitField0_ &= -17;
        this.orderType_ = 0;
    }

    private void clearTicker() {
        this.bitField0_ &= -2;
        this.ticker_ = getDefaultInstance().getTicker();
    }

    public static InvestNewOrderStartedContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static InvestNewOrderStartedContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InvestNewOrderStartedContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestNewOrderStartedContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InvestNewOrderStartedContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExchange(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.exchange_ = str;
    }

    private void setExchangeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.exchange_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExchangeStatus(e4 e4Var) {
        this.exchangeStatus_ = e4Var.getNumber();
        this.bitField0_ |= 4;
    }

    private void setExchangeStatusValue(int i) {
        this.bitField0_ |= 4;
        this.exchangeStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderSide(b6 b6Var) {
        this.orderSide_ = b6Var.getNumber();
        this.bitField0_ |= 8;
    }

    private void setOrderSideValue(int i) {
        this.bitField0_ |= 8;
        this.orderSide_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderType(d6 d6Var) {
        this.orderType_ = d6Var.getNumber();
        this.bitField0_ |= 16;
    }

    private void setOrderTypeValue(int i) {
        this.bitField0_ |= 16;
        this.orderType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTicker(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.ticker_ = str;
    }

    private void setTickerBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.ticker_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (q5.f146182a[v0Var.ordinal()]) {
            case 1:
                return new InvestNewOrderStartedContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"bitField0_", "ticker_", "exchange_", "exchangeStatus_", "orderSide_", "orderType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (InvestNewOrderStartedContext.class) {
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

    public String getExchange() {
        return this.exchange_;
    }

    public p getExchangeBytes() {
        return p.d(this.exchange_);
    }

    public e4 getExchangeStatus() {
        e4 e4VarA = e4.a(this.exchangeStatus_);
        return e4VarA == null ? e4.UNRECOGNIZED : e4VarA;
    }

    public int getExchangeStatusValue() {
        return this.exchangeStatus_;
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

    public String getTicker() {
        return this.ticker_;
    }

    public p getTickerBytes() {
        return p.d(this.ticker_);
    }

    public boolean hasExchange() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasExchangeStatus() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasOrderSide() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOrderType() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTicker() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(InvestNewOrderStartedContext investNewOrderStartedContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(investNewOrderStartedContext);
    }

    public static InvestNewOrderStartedContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestNewOrderStartedContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestNewOrderStartedContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestNewOrderStartedContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static InvestNewOrderStartedContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (InvestNewOrderStartedContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static InvestNewOrderStartedContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestNewOrderStartedContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static InvestNewOrderStartedContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InvestNewOrderStartedContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InvestNewOrderStartedContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestNewOrderStartedContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static InvestNewOrderStartedContext parseFrom(InputStream inputStream) throws IOException {
        return (InvestNewOrderStartedContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestNewOrderStartedContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestNewOrderStartedContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestNewOrderStartedContext parseFrom(t tVar) throws IOException {
        return (InvestNewOrderStartedContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static InvestNewOrderStartedContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (InvestNewOrderStartedContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
