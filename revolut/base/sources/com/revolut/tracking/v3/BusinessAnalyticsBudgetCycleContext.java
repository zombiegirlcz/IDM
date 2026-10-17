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
import grl.a1;
import grl.y0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class BusinessAnalyticsBudgetCycleContext extends w0 implements e2 {
    private static final BusinessAnalyticsBudgetCycleContext DEFAULT_INSTANCE;
    public static final int FREQUENCY_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int RESET_ON_FIELD_NUMBER = 2;
    private int bitField0_;
    private int frequency_;
    private int resetOn_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(BusinessAnalyticsBudgetCycleContext.DEFAULT_INSTANCE);
        }
    }

    static {
        BusinessAnalyticsBudgetCycleContext businessAnalyticsBudgetCycleContext = new BusinessAnalyticsBudgetCycleContext();
        DEFAULT_INSTANCE = businessAnalyticsBudgetCycleContext;
        w0.registerDefaultInstance(BusinessAnalyticsBudgetCycleContext.class, businessAnalyticsBudgetCycleContext);
    }

    private BusinessAnalyticsBudgetCycleContext() {
    }

    private void clearFrequency() {
        this.bitField0_ &= -2;
        this.frequency_ = 0;
    }

    private void clearResetOn() {
        this.bitField0_ &= -3;
        this.resetOn_ = 0;
    }

    public static BusinessAnalyticsBudgetCycleContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static BusinessAnalyticsBudgetCycleContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BusinessAnalyticsBudgetCycleContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFrequency(a1 a1Var) {
        this.frequency_ = a1Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setFrequencyValue(int i) {
        this.bitField0_ |= 1;
        this.frequency_ = i;
    }

    private void setResetOn(int i) {
        this.bitField0_ |= 2;
        this.resetOn_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (y0.f146237a[v0Var.ordinal()]) {
            case 1:
                return new BusinessAnalyticsBudgetCycleContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"bitField0_", "frequency_", "resetOn_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (BusinessAnalyticsBudgetCycleContext.class) {
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

    public a1 getFrequency() {
        a1 a1VarA = a1.a(this.frequency_);
        return a1VarA == null ? a1.UNRECOGNIZED : a1VarA;
    }

    public int getFrequencyValue() {
        return this.frequency_;
    }

    public int getResetOn() {
        return this.resetOn_;
    }

    public boolean hasFrequency() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasResetOn() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(BusinessAnalyticsBudgetCycleContext businessAnalyticsBudgetCycleContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(businessAnalyticsBudgetCycleContext);
    }

    public static BusinessAnalyticsBudgetCycleContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static BusinessAnalyticsBudgetCycleContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static BusinessAnalyticsBudgetCycleContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static BusinessAnalyticsBudgetCycleContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static BusinessAnalyticsBudgetCycleContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BusinessAnalyticsBudgetCycleContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static BusinessAnalyticsBudgetCycleContext parseFrom(InputStream inputStream) throws IOException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BusinessAnalyticsBudgetCycleContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static BusinessAnalyticsBudgetCycleContext parseFrom(t tVar) throws IOException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static BusinessAnalyticsBudgetCycleContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (BusinessAnalyticsBudgetCycleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
