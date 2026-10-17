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
import grl.l4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class GiftCardsContext extends w0 implements e2 {
    public static final int AMOUNT_POINTS_FIELD_NUMBER = 4;
    private static final GiftCardsContext DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 5;
    public static final int GIFT_CARD_NAME_FIELD_NUMBER = 1;
    public static final int GROUP_ID_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int PURCHASED_VOUCHER_ID_FIELD_NUMBER = 3;
    private double amountPoints_;
    private int bitField0_;
    private int errorCode_;
    private String giftCardName_ = "";
    private String groupId_ = "";
    private String purchasedVoucherId_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((GiftCardsContext) this.f49761b).setGiftCardName(str);
        }

        private a() {
            super(GiftCardsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        GiftCardsContext giftCardsContext = new GiftCardsContext();
        DEFAULT_INSTANCE = giftCardsContext;
        w0.registerDefaultInstance(GiftCardsContext.class, giftCardsContext);
    }

    private GiftCardsContext() {
    }

    private void clearAmountPoints() {
        this.bitField0_ &= -9;
        this.amountPoints_ = 0.0d;
    }

    private void clearErrorCode() {
        this.bitField0_ &= -17;
        this.errorCode_ = 0;
    }

    private void clearGiftCardName() {
        this.bitField0_ &= -2;
        this.giftCardName_ = getDefaultInstance().getGiftCardName();
    }

    private void clearGroupId() {
        this.bitField0_ &= -3;
        this.groupId_ = getDefaultInstance().getGroupId();
    }

    private void clearPurchasedVoucherId() {
        this.bitField0_ &= -5;
        this.purchasedVoucherId_ = getDefaultInstance().getPurchasedVoucherId();
    }

    public static GiftCardsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static GiftCardsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GiftCardsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GiftCardsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GiftCardsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmountPoints(double d) {
        this.bitField0_ |= 8;
        this.amountPoints_ = d;
    }

    private void setErrorCode(int i) {
        this.bitField0_ |= 16;
        this.errorCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGiftCardName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.giftCardName_ = str;
    }

    private void setGiftCardNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.giftCardName_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.groupId_ = str;
    }

    private void setGroupIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.groupId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPurchasedVoucherId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.purchasedVoucherId_ = str;
    }

    private void setPurchasedVoucherIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.purchasedVoucherId_ = pVar.m();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (l4.f146133a[v0Var.ordinal()]) {
            case 1:
                return new GiftCardsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004က\u0003\u0005င\u0004", new Object[]{"bitField0_", "giftCardName_", "groupId_", "purchasedVoucherId_", "amountPoints_", "errorCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (GiftCardsContext.class) {
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

    public double getAmountPoints() {
        return this.amountPoints_;
    }

    public int getErrorCode() {
        return this.errorCode_;
    }

    public String getGiftCardName() {
        return this.giftCardName_;
    }

    public p getGiftCardNameBytes() {
        return p.d(this.giftCardName_);
    }

    public String getGroupId() {
        return this.groupId_;
    }

    public p getGroupIdBytes() {
        return p.d(this.groupId_);
    }

    public String getPurchasedVoucherId() {
        return this.purchasedVoucherId_;
    }

    public p getPurchasedVoucherIdBytes() {
        return p.d(this.purchasedVoucherId_);
    }

    public boolean hasAmountPoints() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasGiftCardName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasGroupId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPurchasedVoucherId() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(GiftCardsContext giftCardsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(giftCardsContext);
    }

    public static GiftCardsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (GiftCardsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static GiftCardsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (GiftCardsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static GiftCardsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (GiftCardsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static GiftCardsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (GiftCardsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static GiftCardsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GiftCardsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GiftCardsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (GiftCardsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static GiftCardsContext parseFrom(InputStream inputStream) throws IOException {
        return (GiftCardsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GiftCardsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (GiftCardsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static GiftCardsContext parseFrom(t tVar) throws IOException {
        return (GiftCardsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static GiftCardsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (GiftCardsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
