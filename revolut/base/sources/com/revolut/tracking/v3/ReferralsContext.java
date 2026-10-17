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
import grl.a9;
import grl.w8;
import grl.y8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class ReferralsContext extends w0 implements e2 {
    private static final ReferralsContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int REWARD_TYPE_FIELD_NUMBER = 2;
    public static final int SHARE_OPTION_FIELD_NUMBER = 1;
    private int bitField0_;
    private int rewardType_;
    private int shareOption_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(ReferralsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        ReferralsContext referralsContext = new ReferralsContext();
        DEFAULT_INSTANCE = referralsContext;
        w0.registerDefaultInstance(ReferralsContext.class, referralsContext);
    }

    private ReferralsContext() {
    }

    private void clearRewardType() {
        this.bitField0_ &= -3;
        this.rewardType_ = 0;
    }

    private void clearShareOption() {
        this.bitField0_ &= -2;
        this.shareOption_ = 0;
    }

    public static ReferralsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ReferralsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ReferralsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReferralsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ReferralsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRewardType(y8 y8Var) {
        this.rewardType_ = y8Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setRewardTypeValue(int i) {
        this.bitField0_ |= 2;
        this.rewardType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShareOption(a9 a9Var) {
        this.shareOption_ = a9Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setShareOptionValue(int i) {
        this.bitField0_ |= 1;
        this.shareOption_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (w8.f146227a[v0Var.ordinal()]) {
            case 1:
                return new ReferralsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "shareOption_", "rewardType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ReferralsContext.class) {
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

    public y8 getRewardType() {
        y8 y8VarA = y8.a(this.rewardType_);
        return y8VarA == null ? y8.UNRECOGNIZED : y8VarA;
    }

    public int getRewardTypeValue() {
        return this.rewardType_;
    }

    public a9 getShareOption() {
        a9 a9VarA = a9.a(this.shareOption_);
        return a9VarA == null ? a9.UNRECOGNIZED : a9VarA;
    }

    public int getShareOptionValue() {
        return this.shareOption_;
    }

    public boolean hasRewardType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasShareOption() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(ReferralsContext referralsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(referralsContext);
    }

    public static ReferralsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ReferralsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ReferralsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (ReferralsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ReferralsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ReferralsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ReferralsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (ReferralsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ReferralsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ReferralsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ReferralsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (ReferralsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ReferralsContext parseFrom(InputStream inputStream) throws IOException {
        return (ReferralsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ReferralsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ReferralsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ReferralsContext parseFrom(t tVar) throws IOException {
        return (ReferralsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ReferralsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (ReferralsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
