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
import grl.u5;
import grl.w5;
import grl.x5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class InvestOnboardingCompletedContext extends w0 implements e2 {
    private static final InvestOnboardingCompletedContext DEFAULT_INSTANCE;
    public static final int INVEST_PRODUCT_FIELD_NUMBER = 1;
    public static final int INVEST_SOURCE_FIELD_NUMBER = 2;
    private static volatile m2 PARSER;
    private int bitField0_;
    private int investProduct_;
    private int investSource_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(InvestOnboardingCompletedContext.DEFAULT_INSTANCE);
        }
    }

    static {
        InvestOnboardingCompletedContext investOnboardingCompletedContext = new InvestOnboardingCompletedContext();
        DEFAULT_INSTANCE = investOnboardingCompletedContext;
        w0.registerDefaultInstance(InvestOnboardingCompletedContext.class, investOnboardingCompletedContext);
    }

    private InvestOnboardingCompletedContext() {
    }

    private void clearInvestProduct() {
        this.bitField0_ &= -2;
        this.investProduct_ = 0;
    }

    private void clearInvestSource() {
        this.bitField0_ &= -3;
        this.investSource_ = 0;
    }

    public static InvestOnboardingCompletedContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static InvestOnboardingCompletedContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InvestOnboardingCompletedContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestOnboardingCompletedContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InvestOnboardingCompletedContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setInvestProduct(u5 u5Var) {
        this.investProduct_ = u5Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setInvestProductValue(int i) {
        this.bitField0_ |= 1;
        this.investProduct_ = i;
    }

    private void setInvestSource(w5 w5Var) {
        this.investSource_ = w5Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setInvestSourceValue(int i) {
        this.bitField0_ |= 2;
        this.investSource_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (x5.f146232a[v0Var.ordinal()]) {
            case 1:
                return new InvestOnboardingCompletedContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "investProduct_", "investSource_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (InvestOnboardingCompletedContext.class) {
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

    public u5 getInvestProduct() {
        u5 u5VarA = u5.a(this.investProduct_);
        return u5VarA == null ? u5.UNRECOGNIZED : u5VarA;
    }

    public int getInvestProductValue() {
        return this.investProduct_;
    }

    public w5 getInvestSource() {
        w5 w5VarA = w5.a(this.investSource_);
        return w5VarA == null ? w5.UNRECOGNIZED : w5VarA;
    }

    public int getInvestSourceValue() {
        return this.investSource_;
    }

    public boolean hasInvestProduct() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasInvestSource() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(InvestOnboardingCompletedContext investOnboardingCompletedContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(investOnboardingCompletedContext);
    }

    public static InvestOnboardingCompletedContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestOnboardingCompletedContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestOnboardingCompletedContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestOnboardingCompletedContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static InvestOnboardingCompletedContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (InvestOnboardingCompletedContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static InvestOnboardingCompletedContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestOnboardingCompletedContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static InvestOnboardingCompletedContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InvestOnboardingCompletedContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InvestOnboardingCompletedContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestOnboardingCompletedContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static InvestOnboardingCompletedContext parseFrom(InputStream inputStream) throws IOException {
        return (InvestOnboardingCompletedContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestOnboardingCompletedContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestOnboardingCompletedContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestOnboardingCompletedContext parseFrom(t tVar) throws IOException {
        return (InvestOnboardingCompletedContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static InvestOnboardingCompletedContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (InvestOnboardingCompletedContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
