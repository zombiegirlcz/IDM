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
import grl.g6;
import grl.h6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class InvestSwipeAccountActionsContext extends w0 implements e2 {
    public static final int ACCOUNT_TYPE_FIELD_NUMBER = 1;
    private static final InvestSwipeAccountActionsContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER;
    private int accountType_;
    private int bitField0_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(InvestSwipeAccountActionsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        InvestSwipeAccountActionsContext investSwipeAccountActionsContext = new InvestSwipeAccountActionsContext();
        DEFAULT_INSTANCE = investSwipeAccountActionsContext;
        w0.registerDefaultInstance(InvestSwipeAccountActionsContext.class, investSwipeAccountActionsContext);
    }

    private InvestSwipeAccountActionsContext() {
    }

    private void clearAccountType() {
        this.bitField0_ &= -2;
        this.accountType_ = 0;
    }

    public static InvestSwipeAccountActionsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static InvestSwipeAccountActionsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InvestSwipeAccountActionsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestSwipeAccountActionsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InvestSwipeAccountActionsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountType(g6 g6Var) {
        this.accountType_ = g6Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setAccountTypeValue(int i) {
        this.bitField0_ |= 1;
        this.accountType_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (h6.f146104a[v0Var.ordinal()]) {
            case 1:
                return new InvestSwipeAccountActionsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "accountType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (InvestSwipeAccountActionsContext.class) {
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

    public g6 getAccountType() {
        g6 g6Var;
        switch (this.accountType_) {
            case 0:
                g6Var = g6.GIA;
                break;
            case 1:
                g6Var = g6.GIA_JOINT;
                break;
            case 2:
                g6Var = g6.ISA;
                break;
            case 3:
                g6Var = g6.PEA;
                break;
            case 4:
                g6Var = g6.JISA;
                break;
            case 5:
                g6Var = g6.ROBO;
                break;
            case 6:
                g6Var = g6.CFD;
                break;
            default:
                g6Var = null;
                break;
        }
        return g6Var == null ? g6.UNRECOGNIZED : g6Var;
    }

    public int getAccountTypeValue() {
        return this.accountType_;
    }

    public boolean hasAccountType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(InvestSwipeAccountActionsContext investSwipeAccountActionsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(investSwipeAccountActionsContext);
    }

    public static InvestSwipeAccountActionsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestSwipeAccountActionsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestSwipeAccountActionsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestSwipeAccountActionsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static InvestSwipeAccountActionsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (InvestSwipeAccountActionsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static InvestSwipeAccountActionsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestSwipeAccountActionsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static InvestSwipeAccountActionsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InvestSwipeAccountActionsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InvestSwipeAccountActionsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestSwipeAccountActionsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static InvestSwipeAccountActionsContext parseFrom(InputStream inputStream) throws IOException {
        return (InvestSwipeAccountActionsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestSwipeAccountActionsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestSwipeAccountActionsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestSwipeAccountActionsContext parseFrom(t tVar) throws IOException {
        return (InvestSwipeAccountActionsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static InvestSwipeAccountActionsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (InvestSwipeAccountActionsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
