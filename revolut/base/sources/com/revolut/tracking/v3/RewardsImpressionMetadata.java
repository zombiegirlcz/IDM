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
import grl.fa;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class RewardsImpressionMetadata extends w0 implements e2 {
    private static final RewardsImpressionMetadata DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PERK_ID_FIELD_NUMBER = 1;
    public static final int USER_PERK_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String perkId_ = "";
    private String userPerkId_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(RewardsImpressionMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        RewardsImpressionMetadata rewardsImpressionMetadata = new RewardsImpressionMetadata();
        DEFAULT_INSTANCE = rewardsImpressionMetadata;
        w0.registerDefaultInstance(RewardsImpressionMetadata.class, rewardsImpressionMetadata);
    }

    private RewardsImpressionMetadata() {
    }

    private void clearPerkId() {
        this.bitField0_ &= -2;
        this.perkId_ = getDefaultInstance().getPerkId();
    }

    private void clearUserPerkId() {
        this.bitField0_ &= -3;
        this.userPerkId_ = getDefaultInstance().getUserPerkId();
    }

    public static RewardsImpressionMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static RewardsImpressionMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RewardsImpressionMetadata) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RewardsImpressionMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RewardsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPerkId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.perkId_ = str;
    }

    private void setPerkIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.perkId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setUserPerkId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.userPerkId_ = str;
    }

    private void setUserPerkIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.userPerkId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (fa.f146095a[v0Var.ordinal()]) {
            case 1:
                return new RewardsImpressionMetadata();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "perkId_", "userPerkId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (RewardsImpressionMetadata.class) {
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

    public String getPerkId() {
        return this.perkId_;
    }

    public p getPerkIdBytes() {
        return p.d(this.perkId_);
    }

    public String getUserPerkId() {
        return this.userPerkId_;
    }

    public p getUserPerkIdBytes() {
        return p.d(this.userPerkId_);
    }

    public boolean hasPerkId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUserPerkId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(RewardsImpressionMetadata rewardsImpressionMetadata) {
        return (a) DEFAULT_INSTANCE.createBuilder(rewardsImpressionMetadata);
    }

    public static RewardsImpressionMetadata parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RewardsImpressionMetadata) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RewardsImpressionMetadata parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (RewardsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static RewardsImpressionMetadata parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (RewardsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RewardsImpressionMetadata parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (RewardsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static RewardsImpressionMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RewardsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RewardsImpressionMetadata parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (RewardsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static RewardsImpressionMetadata parseFrom(InputStream inputStream) throws IOException {
        return (RewardsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RewardsImpressionMetadata parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RewardsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RewardsImpressionMetadata parseFrom(t tVar) throws IOException {
        return (RewardsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static RewardsImpressionMetadata parseFrom(t tVar, d0 d0Var) throws IOException {
        return (RewardsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
