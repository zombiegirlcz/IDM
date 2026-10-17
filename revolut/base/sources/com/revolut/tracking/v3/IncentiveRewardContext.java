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
import grl.h5;
import grl.j5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class IncentiveRewardContext extends w0 implements e2 {
    private static final IncentiveRewardContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int REWARD_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int rewardType_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(IncentiveRewardContext.DEFAULT_INSTANCE);
        }
    }

    static {
        IncentiveRewardContext incentiveRewardContext = new IncentiveRewardContext();
        DEFAULT_INSTANCE = incentiveRewardContext;
        w0.registerDefaultInstance(IncentiveRewardContext.class, incentiveRewardContext);
    }

    private IncentiveRewardContext() {
    }

    private void clearRewardType() {
        this.bitField0_ &= -2;
        this.rewardType_ = 0;
    }

    public static IncentiveRewardContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static IncentiveRewardContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IncentiveRewardContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IncentiveRewardContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IncentiveRewardContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRewardType(j5 j5Var) {
        this.rewardType_ = j5Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setRewardTypeValue(int i) {
        this.bitField0_ |= 1;
        this.rewardType_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (h5.f146103a[v0Var.ordinal()]) {
            case 1:
                return new IncentiveRewardContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "rewardType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (IncentiveRewardContext.class) {
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

    public j5 getRewardType() {
        j5 j5VarA = j5.a(this.rewardType_);
        return j5VarA == null ? j5.UNRECOGNIZED : j5VarA;
    }

    public int getRewardTypeValue() {
        return this.rewardType_;
    }

    public boolean hasRewardType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(IncentiveRewardContext incentiveRewardContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(incentiveRewardContext);
    }

    public static IncentiveRewardContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (IncentiveRewardContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static IncentiveRewardContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (IncentiveRewardContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static IncentiveRewardContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (IncentiveRewardContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static IncentiveRewardContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (IncentiveRewardContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static IncentiveRewardContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IncentiveRewardContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IncentiveRewardContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (IncentiveRewardContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static IncentiveRewardContext parseFrom(InputStream inputStream) throws IOException {
        return (IncentiveRewardContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IncentiveRewardContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (IncentiveRewardContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static IncentiveRewardContext parseFrom(t tVar) throws IOException {
        return (IncentiveRewardContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static IncentiveRewardContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (IncentiveRewardContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
