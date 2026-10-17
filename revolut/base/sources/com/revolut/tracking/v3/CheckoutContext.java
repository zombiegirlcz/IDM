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
import grl.b2;
import grl.d2;
import grl.f2;
import grl.h2;
import grl.z1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class CheckoutContext extends w0 implements e2 {
    public static final int BALANCE_AMOUNT_FIELD_NUMBER = 17;
    public static final int CAN_TOPUP_FIELD_NUMBER = 5;
    public static final int CARD_DELIVERY_FEE_AMOUNT_FIELD_NUMBER = 14;
    public static final int CARD_FEE_AMOUNT_FIELD_NUMBER = 11;
    public static final int CARD_SURCHARGE_AMOUNT_FIELD_NUMBER = 12;
    public static final int CARD_TYPE_FIELD_NUMBER = 2;
    public static final int CHECKOUT_CURRENCY_FIELD_NUMBER = 19;
    public static final int CUSTOMISATION_FEE_AMOUNT_FIELD_NUMBER = 13;
    private static final CheckoutContext DEFAULT_INSTANCE;
    public static final int EXTRA_TOPUP_AMOUNT_FIELD_NUMBER = 16;
    public static final int IS_FREE_DELIVERY_CHALLENGE_FIELD_NUMBER = 6;
    public static final int IS_FREE_TIER_CHALLENGE_FIELD_NUMBER = 7;
    public static final int IS_INSTANT_TOPUP_FIELD_NUMBER = 9;
    public static final int IS_ONBOARDING_FIELD_NUMBER = 8;
    public static final int IS_PREORDER_FIELD_NUMBER = 10;
    public static final int IS_THREE_DS_FIELD_NUMBER = 20;
    public static final int KYC_STATE_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int PLAN_FEE_AMOUNT_FIELD_NUMBER = 15;
    public static final int PLAN_TYPE_FIELD_NUMBER = 3;
    public static final int TOPUP_METHOD_FIELD_NUMBER = 4;
    public static final int TOTAL_AMOUNT_FIELD_NUMBER = 18;
    private double balanceAmount_;
    private int bitField0_;
    private boolean canTopup_;
    private double cardDeliveryFeeAmount_;
    private double cardFeeAmount_;
    private double cardSurchargeAmount_;
    private int cardType_;
    private String checkoutCurrency_ = "";
    private double customisationFeeAmount_;
    private double extraTopupAmount_;
    private boolean isFreeDeliveryChallenge_;
    private boolean isFreeTierChallenge_;
    private boolean isInstantTopup_;
    private boolean isOnboarding_;
    private boolean isPreorder_;
    private boolean isThreeDs_;
    private int kycState_;
    private double planFeeAmount_;
    private int planType_;
    private int topupMethod_;
    private double totalAmount_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CheckoutContext.DEFAULT_INSTANCE);
        }
    }

    static {
        CheckoutContext checkoutContext = new CheckoutContext();
        DEFAULT_INSTANCE = checkoutContext;
        w0.registerDefaultInstance(CheckoutContext.class, checkoutContext);
    }

    private CheckoutContext() {
    }

    private void clearBalanceAmount() {
        this.bitField0_ &= -65537;
        this.balanceAmount_ = 0.0d;
    }

    private void clearCanTopup() {
        this.bitField0_ &= -17;
        this.canTopup_ = false;
    }

    private void clearCardDeliveryFeeAmount() {
        this.bitField0_ &= -8193;
        this.cardDeliveryFeeAmount_ = 0.0d;
    }

    private void clearCardFeeAmount() {
        this.bitField0_ &= -1025;
        this.cardFeeAmount_ = 0.0d;
    }

    private void clearCardSurchargeAmount() {
        this.bitField0_ &= -2049;
        this.cardSurchargeAmount_ = 0.0d;
    }

    private void clearCardType() {
        this.bitField0_ &= -3;
        this.cardType_ = 0;
    }

    private void clearCheckoutCurrency() {
        this.bitField0_ &= -262145;
        this.checkoutCurrency_ = getDefaultInstance().getCheckoutCurrency();
    }

    private void clearCustomisationFeeAmount() {
        this.bitField0_ &= -4097;
        this.customisationFeeAmount_ = 0.0d;
    }

    private void clearExtraTopupAmount() {
        this.bitField0_ &= -32769;
        this.extraTopupAmount_ = 0.0d;
    }

    private void clearIsFreeDeliveryChallenge() {
        this.bitField0_ &= -33;
        this.isFreeDeliveryChallenge_ = false;
    }

    private void clearIsFreeTierChallenge() {
        this.bitField0_ &= -65;
        this.isFreeTierChallenge_ = false;
    }

    private void clearIsInstantTopup() {
        this.bitField0_ &= -257;
        this.isInstantTopup_ = false;
    }

    private void clearIsOnboarding() {
        this.bitField0_ &= -129;
        this.isOnboarding_ = false;
    }

    private void clearIsPreorder() {
        this.bitField0_ &= -513;
        this.isPreorder_ = false;
    }

    private void clearIsThreeDs() {
        this.bitField0_ &= -524289;
        this.isThreeDs_ = false;
    }

    private void clearKycState() {
        this.bitField0_ &= -2;
        this.kycState_ = 0;
    }

    private void clearPlanFeeAmount() {
        this.bitField0_ &= -16385;
        this.planFeeAmount_ = 0.0d;
    }

    private void clearPlanType() {
        this.bitField0_ &= -5;
        this.planType_ = 0;
    }

    private void clearTopupMethod() {
        this.bitField0_ &= -9;
        this.topupMethod_ = 0;
    }

    private void clearTotalAmount() {
        this.bitField0_ &= -131073;
        this.totalAmount_ = 0.0d;
    }

    public static CheckoutContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CheckoutContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CheckoutContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CheckoutContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CheckoutContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBalanceAmount(double d) {
        this.bitField0_ |= 65536;
        this.balanceAmount_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanTopup(boolean z) {
        this.bitField0_ |= 16;
        this.canTopup_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardDeliveryFeeAmount(double d) {
        this.bitField0_ |= 8192;
        this.cardDeliveryFeeAmount_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardFeeAmount(double d) {
        this.bitField0_ |= 1024;
        this.cardFeeAmount_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardSurchargeAmount(double d) {
        this.bitField0_ |= 2048;
        this.cardSurchargeAmount_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardType(b2 b2Var) {
        this.cardType_ = b2Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setCardTypeValue(int i) {
        this.bitField0_ |= 2;
        this.cardType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckoutCurrency(String str) {
        str.getClass();
        this.bitField0_ |= 262144;
        this.checkoutCurrency_ = str;
    }

    private void setCheckoutCurrencyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.checkoutCurrency_ = pVar.m();
        this.bitField0_ |= 262144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomisationFeeAmount(double d) {
        this.bitField0_ |= 4096;
        this.customisationFeeAmount_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtraTopupAmount(double d) {
        this.bitField0_ |= 32768;
        this.extraTopupAmount_ = d;
    }

    private void setIsFreeDeliveryChallenge(boolean z) {
        this.bitField0_ |= 32;
        this.isFreeDeliveryChallenge_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFreeTierChallenge(boolean z) {
        this.bitField0_ |= 64;
        this.isFreeTierChallenge_ = z;
    }

    private void setIsInstantTopup(boolean z) {
        this.bitField0_ |= 256;
        this.isInstantTopup_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOnboarding(boolean z) {
        this.bitField0_ |= 128;
        this.isOnboarding_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPreorder(boolean z) {
        this.bitField0_ |= 512;
        this.isPreorder_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsThreeDs(boolean z) {
        this.bitField0_ |= 524288;
        this.isThreeDs_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKycState(d2 d2Var) {
        this.kycState_ = d2Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setKycStateValue(int i) {
        this.bitField0_ |= 1;
        this.kycState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanFeeAmount(double d) {
        this.bitField0_ |= 16384;
        this.planFeeAmount_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanType(f2 f2Var) {
        this.planType_ = f2Var.getNumber();
        this.bitField0_ |= 4;
    }

    private void setPlanTypeValue(int i) {
        this.bitField0_ |= 4;
        this.planType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopupMethod(h2 h2Var) {
        this.topupMethod_ = h2Var.getNumber();
        this.bitField0_ |= 8;
    }

    private void setTopupMethodValue(int i) {
        this.bitField0_ |= 8;
        this.topupMethod_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalAmount(double d) {
        this.bitField0_ |= 131072;
        this.totalAmount_ = d;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (z1.f146241a[v0Var.ordinal()]) {
            case 1:
                return new CheckoutContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bက\n\fက\u000b\rက\f\u000eက\r\u000fက\u000e\u0010က\u000f\u0011က\u0010\u0012က\u0011\u0013ለ\u0012\u0014ဇ\u0013", new Object[]{"bitField0_", "kycState_", "cardType_", "planType_", "topupMethod_", "canTopup_", "isFreeDeliveryChallenge_", "isFreeTierChallenge_", "isOnboarding_", "isInstantTopup_", "isPreorder_", "cardFeeAmount_", "cardSurchargeAmount_", "customisationFeeAmount_", "cardDeliveryFeeAmount_", "planFeeAmount_", "extraTopupAmount_", "balanceAmount_", "totalAmount_", "checkoutCurrency_", "isThreeDs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CheckoutContext.class) {
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

    public double getBalanceAmount() {
        return this.balanceAmount_;
    }

    public boolean getCanTopup() {
        return this.canTopup_;
    }

    public double getCardDeliveryFeeAmount() {
        return this.cardDeliveryFeeAmount_;
    }

    public double getCardFeeAmount() {
        return this.cardFeeAmount_;
    }

    public double getCardSurchargeAmount() {
        return this.cardSurchargeAmount_;
    }

    public b2 getCardType() {
        b2 b2VarA = b2.a(this.cardType_);
        return b2VarA == null ? b2.UNRECOGNIZED : b2VarA;
    }

    public int getCardTypeValue() {
        return this.cardType_;
    }

    public String getCheckoutCurrency() {
        return this.checkoutCurrency_;
    }

    public p getCheckoutCurrencyBytes() {
        return p.d(this.checkoutCurrency_);
    }

    public double getCustomisationFeeAmount() {
        return this.customisationFeeAmount_;
    }

    public double getExtraTopupAmount() {
        return this.extraTopupAmount_;
    }

    public boolean getIsFreeDeliveryChallenge() {
        return this.isFreeDeliveryChallenge_;
    }

    public boolean getIsFreeTierChallenge() {
        return this.isFreeTierChallenge_;
    }

    public boolean getIsInstantTopup() {
        return this.isInstantTopup_;
    }

    public boolean getIsOnboarding() {
        return this.isOnboarding_;
    }

    public boolean getIsPreorder() {
        return this.isPreorder_;
    }

    public boolean getIsThreeDs() {
        return this.isThreeDs_;
    }

    public d2 getKycState() {
        d2 d2VarA = d2.a(this.kycState_);
        return d2VarA == null ? d2.UNRECOGNIZED : d2VarA;
    }

    public int getKycStateValue() {
        return this.kycState_;
    }

    public double getPlanFeeAmount() {
        return this.planFeeAmount_;
    }

    public f2 getPlanType() {
        f2 f2VarA = f2.a(this.planType_);
        return f2VarA == null ? f2.UNRECOGNIZED : f2VarA;
    }

    public int getPlanTypeValue() {
        return this.planType_;
    }

    public h2 getTopupMethod() {
        h2 h2VarA = h2.a(this.topupMethod_);
        return h2VarA == null ? h2.UNRECOGNIZED : h2VarA;
    }

    public int getTopupMethodValue() {
        return this.topupMethod_;
    }

    public double getTotalAmount() {
        return this.totalAmount_;
    }

    public boolean hasBalanceAmount() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasCanTopup() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCardDeliveryFeeAmount() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasCardFeeAmount() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasCardSurchargeAmount() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasCardType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCheckoutCurrency() {
        return (this.bitField0_ & 262144) != 0;
    }

    public boolean hasCustomisationFeeAmount() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasExtraTopupAmount() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasIsFreeDeliveryChallenge() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasIsFreeTierChallenge() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasIsInstantTopup() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasIsOnboarding() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasIsPreorder() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasIsThreeDs() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasKycState() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPlanFeeAmount() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasPlanType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTopupMethod() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTotalAmount() {
        return (this.bitField0_ & 131072) != 0;
    }

    public static a newBuilder(CheckoutContext checkoutContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(checkoutContext);
    }

    public static CheckoutContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CheckoutContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CheckoutContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CheckoutContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CheckoutContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CheckoutContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CheckoutContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CheckoutContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CheckoutContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CheckoutContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CheckoutContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CheckoutContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CheckoutContext parseFrom(InputStream inputStream) throws IOException {
        return (CheckoutContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CheckoutContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CheckoutContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CheckoutContext parseFrom(t tVar) throws IOException {
        return (CheckoutContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CheckoutContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CheckoutContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
