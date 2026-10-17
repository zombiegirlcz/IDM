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
import grl.r5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class InvestNewOrderTypeChangedContext extends w0 implements e2 {
    private static final InvestNewOrderTypeChangedContext DEFAULT_INSTANCE;
    public static final int ORDER_SIDE_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int PREVIOUS_ORDER_TYPE_FIELD_NUMBER = 3;
    public static final int SELECTED_ORDER_TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int orderSide_;
    private int previousOrderType_;
    private int selectedOrderType_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(InvestNewOrderTypeChangedContext.DEFAULT_INSTANCE);
        }
    }

    static {
        InvestNewOrderTypeChangedContext investNewOrderTypeChangedContext = new InvestNewOrderTypeChangedContext();
        DEFAULT_INSTANCE = investNewOrderTypeChangedContext;
        w0.registerDefaultInstance(InvestNewOrderTypeChangedContext.class, investNewOrderTypeChangedContext);
    }

    private InvestNewOrderTypeChangedContext() {
    }

    private void clearOrderSide() {
        this.bitField0_ &= -2;
        this.orderSide_ = 0;
    }

    private void clearPreviousOrderType() {
        this.bitField0_ &= -5;
        this.previousOrderType_ = 0;
    }

    private void clearSelectedOrderType() {
        this.bitField0_ &= -3;
        this.selectedOrderType_ = 0;
    }

    public static InvestNewOrderTypeChangedContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static InvestNewOrderTypeChangedContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InvestNewOrderTypeChangedContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestNewOrderTypeChangedContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InvestNewOrderTypeChangedContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderSide(b6 b6Var) {
        this.orderSide_ = b6Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setOrderSideValue(int i) {
        this.bitField0_ |= 1;
        this.orderSide_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviousOrderType(d6 d6Var) {
        this.previousOrderType_ = d6Var.getNumber();
        this.bitField0_ |= 4;
    }

    private void setPreviousOrderTypeValue(int i) {
        this.bitField0_ |= 4;
        this.previousOrderType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedOrderType(d6 d6Var) {
        this.selectedOrderType_ = d6Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setSelectedOrderTypeValue(int i) {
        this.bitField0_ |= 2;
        this.selectedOrderType_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (r5.f146190a[v0Var.ordinal()]) {
            case 1:
                return new InvestNewOrderTypeChangedContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"bitField0_", "orderSide_", "selectedOrderType_", "previousOrderType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (InvestNewOrderTypeChangedContext.class) {
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

    public b6 getOrderSide() {
        b6 b6VarA = b6.a(this.orderSide_);
        return b6VarA == null ? b6.UNRECOGNIZED : b6VarA;
    }

    public int getOrderSideValue() {
        return this.orderSide_;
    }

    public d6 getPreviousOrderType() {
        d6 d6VarA = d6.a(this.previousOrderType_);
        return d6VarA == null ? d6.UNRECOGNIZED : d6VarA;
    }

    public int getPreviousOrderTypeValue() {
        return this.previousOrderType_;
    }

    public d6 getSelectedOrderType() {
        d6 d6VarA = d6.a(this.selectedOrderType_);
        return d6VarA == null ? d6.UNRECOGNIZED : d6VarA;
    }

    public int getSelectedOrderTypeValue() {
        return this.selectedOrderType_;
    }

    public boolean hasOrderSide() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPreviousOrderType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSelectedOrderType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(InvestNewOrderTypeChangedContext investNewOrderTypeChangedContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(investNewOrderTypeChangedContext);
    }

    public static InvestNewOrderTypeChangedContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestNewOrderTypeChangedContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestNewOrderTypeChangedContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestNewOrderTypeChangedContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static InvestNewOrderTypeChangedContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (InvestNewOrderTypeChangedContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static InvestNewOrderTypeChangedContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestNewOrderTypeChangedContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static InvestNewOrderTypeChangedContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InvestNewOrderTypeChangedContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InvestNewOrderTypeChangedContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestNewOrderTypeChangedContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static InvestNewOrderTypeChangedContext parseFrom(InputStream inputStream) throws IOException {
        return (InvestNewOrderTypeChangedContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestNewOrderTypeChangedContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestNewOrderTypeChangedContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestNewOrderTypeChangedContext parseFrom(t tVar) throws IOException {
        return (InvestNewOrderTypeChangedContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static InvestNewOrderTypeChangedContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (InvestNewOrderTypeChangedContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
