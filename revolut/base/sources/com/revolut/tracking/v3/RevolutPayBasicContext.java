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
import grl.aa;
import grl.ca;
import grl.ea;
import grl.u9;
import grl.w9;
import grl.y9;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class RevolutPayBasicContext extends w0 implements e2 {
    private static final RevolutPayBasicContext DEFAULT_INSTANCE;
    public static final int DISMISSAL_REASON_FIELD_NUMBER = 8;
    public static final int DISPLAYED_SCREEN_STATE_FIELD_NUMBER = 9;
    public static final int EARNS_POINTS_FIELD_NUMBER = 4;
    public static final int ERROR_REASON_FIELD_NUMBER = 10;
    public static final int FLOW_SOURCE_FIELD_NUMBER = 14;
    public static final int INSUFFICIENT_FUNDS_FIELD_NUMBER = 2;
    public static final int IS_BUSINESS_PAYMENT_AVAILABLE_FIELD_NUMBER = 12;
    public static final int MERCHANT_APP_BUNDLE_ID_FIELD_NUMBER = 6;
    public static final int MERCHANT_APP_DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int MERCHANT_PUBLIC_KEY_FIELD_NUMBER = 5;
    public static final int MINIMUM_OS_VERSION_FIELD_NUMBER = 13;
    public static final int ORDER_TOKEN_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int POINTS_REDEMPTION_SHOWN_FIELD_NUMBER = 3;
    public static final int PREFERRED_MODE_FIELD_NUMBER = 15;
    public static final int TRANSACTION_TYPE_FIELD_NUMBER = 11;
    private int bitField0_;
    private int dismissalReason_;
    private int displayedScreenState_;
    private boolean earnsPoints_;
    private int flowSource_;
    private boolean insufficientFunds_;
    private boolean isBusinessPaymentAvailable_;
    private boolean pointsRedemptionShown_;
    private int preferredMode_;
    private int transactionType_;
    private String orderToken_ = "";
    private String merchantPublicKey_ = "";
    private String merchantAppBundleId_ = "";
    private String merchantAppDisplayName_ = "";
    private String errorReason_ = "";
    private String minimumOsVersion_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(RevolutPayBasicContext.DEFAULT_INSTANCE);
        }
    }

    static {
        RevolutPayBasicContext revolutPayBasicContext = new RevolutPayBasicContext();
        DEFAULT_INSTANCE = revolutPayBasicContext;
        w0.registerDefaultInstance(RevolutPayBasicContext.class, revolutPayBasicContext);
    }

    private RevolutPayBasicContext() {
    }

    private void clearDismissalReason() {
        this.bitField0_ &= -129;
        this.dismissalReason_ = 0;
    }

    private void clearDisplayedScreenState() {
        this.bitField0_ &= -257;
        this.displayedScreenState_ = 0;
    }

    private void clearEarnsPoints() {
        this.bitField0_ &= -9;
        this.earnsPoints_ = false;
    }

    private void clearErrorReason() {
        this.bitField0_ &= -513;
        this.errorReason_ = getDefaultInstance().getErrorReason();
    }

    private void clearFlowSource() {
        this.bitField0_ &= -8193;
        this.flowSource_ = 0;
    }

    private void clearInsufficientFunds() {
        this.bitField0_ &= -3;
        this.insufficientFunds_ = false;
    }

    private void clearIsBusinessPaymentAvailable() {
        this.bitField0_ &= -2049;
        this.isBusinessPaymentAvailable_ = false;
    }

    private void clearMerchantAppBundleId() {
        this.bitField0_ &= -33;
        this.merchantAppBundleId_ = getDefaultInstance().getMerchantAppBundleId();
    }

    private void clearMerchantAppDisplayName() {
        this.bitField0_ &= -65;
        this.merchantAppDisplayName_ = getDefaultInstance().getMerchantAppDisplayName();
    }

    private void clearMerchantPublicKey() {
        this.bitField0_ &= -17;
        this.merchantPublicKey_ = getDefaultInstance().getMerchantPublicKey();
    }

    private void clearMinimumOsVersion() {
        this.bitField0_ &= -4097;
        this.minimumOsVersion_ = getDefaultInstance().getMinimumOsVersion();
    }

    private void clearOrderToken() {
        this.bitField0_ &= -2;
        this.orderToken_ = getDefaultInstance().getOrderToken();
    }

    private void clearPointsRedemptionShown() {
        this.bitField0_ &= -5;
        this.pointsRedemptionShown_ = false;
    }

    private void clearPreferredMode() {
        this.bitField0_ &= -16385;
        this.preferredMode_ = 0;
    }

    private void clearTransactionType() {
        this.bitField0_ &= -1025;
        this.transactionType_ = 0;
    }

    public static RevolutPayBasicContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static RevolutPayBasicContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RevolutPayBasicContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RevolutPayBasicContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RevolutPayBasicContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDismissalReason(w9 w9Var) {
        this.dismissalReason_ = w9Var.getNumber();
        this.bitField0_ |= 128;
    }

    private void setDismissalReasonValue(int i) {
        this.bitField0_ |= 128;
        this.dismissalReason_ = i;
    }

    private void setDisplayedScreenState(y9 y9Var) {
        this.displayedScreenState_ = y9Var.getNumber();
        this.bitField0_ |= 256;
    }

    private void setDisplayedScreenStateValue(int i) {
        this.bitField0_ |= 256;
        this.displayedScreenState_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEarnsPoints(boolean z) {
        this.bitField0_ |= 8;
        this.earnsPoints_ = z;
    }

    private void setErrorReason(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.errorReason_ = str;
    }

    private void setErrorReasonBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.errorReason_ = pVar.m();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowSource(aa aaVar) {
        this.flowSource_ = aaVar.getNumber();
        this.bitField0_ |= 8192;
    }

    private void setFlowSourceValue(int i) {
        this.bitField0_ |= 8192;
        this.flowSource_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInsufficientFunds(boolean z) {
        this.bitField0_ |= 2;
        this.insufficientFunds_ = z;
    }

    private void setIsBusinessPaymentAvailable(boolean z) {
        this.bitField0_ |= 2048;
        this.isBusinessPaymentAvailable_ = z;
    }

    private void setMerchantAppBundleId(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.merchantAppBundleId_ = str;
    }

    private void setMerchantAppBundleIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.merchantAppBundleId_ = pVar.m();
        this.bitField0_ |= 32;
    }

    private void setMerchantAppDisplayName(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.merchantAppDisplayName_ = str;
    }

    private void setMerchantAppDisplayNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.merchantAppDisplayName_ = pVar.m();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMerchantPublicKey(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.merchantPublicKey_ = str;
    }

    private void setMerchantPublicKeyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.merchantPublicKey_ = pVar.m();
        this.bitField0_ |= 16;
    }

    private void setMinimumOsVersion(String str) {
        str.getClass();
        this.bitField0_ |= 4096;
        this.minimumOsVersion_ = str;
    }

    private void setMinimumOsVersionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.minimumOsVersion_ = pVar.m();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrderToken(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.orderToken_ = str;
    }

    private void setOrderTokenBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.orderToken_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointsRedemptionShown(boolean z) {
        this.bitField0_ |= 4;
        this.pointsRedemptionShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferredMode(ca caVar) {
        this.preferredMode_ = caVar.getNumber();
        this.bitField0_ |= 16384;
    }

    private void setPreferredModeValue(int i) {
        this.bitField0_ |= 16384;
        this.preferredMode_ = i;
    }

    private void setTransactionType(ea eaVar) {
        this.transactionType_ = eaVar.getNumber();
        this.bitField0_ |= 1024;
    }

    private void setTransactionTypeValue(int i) {
        this.bitField0_ |= 1024;
        this.transactionType_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (u9.f146216a[v0Var.ordinal()]) {
            case 1:
                return new RevolutPayBasicContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဌ\u0007\tဌ\b\nለ\t\u000bဌ\n\fဇ\u000b\rለ\f\u000eဌ\r\u000fဌ\u000e", new Object[]{"bitField0_", "orderToken_", "insufficientFunds_", "pointsRedemptionShown_", "earnsPoints_", "merchantPublicKey_", "merchantAppBundleId_", "merchantAppDisplayName_", "dismissalReason_", "displayedScreenState_", "errorReason_", "transactionType_", "isBusinessPaymentAvailable_", "minimumOsVersion_", "flowSource_", "preferredMode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (RevolutPayBasicContext.class) {
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

    public w9 getDismissalReason() {
        w9 w9VarA = w9.a(this.dismissalReason_);
        return w9VarA == null ? w9.UNRECOGNIZED : w9VarA;
    }

    public int getDismissalReasonValue() {
        return this.dismissalReason_;
    }

    public y9 getDisplayedScreenState() {
        y9 y9VarA = y9.a(this.displayedScreenState_);
        return y9VarA == null ? y9.UNRECOGNIZED : y9VarA;
    }

    public int getDisplayedScreenStateValue() {
        return this.displayedScreenState_;
    }

    public boolean getEarnsPoints() {
        return this.earnsPoints_;
    }

    public String getErrorReason() {
        return this.errorReason_;
    }

    public p getErrorReasonBytes() {
        return p.d(this.errorReason_);
    }

    public aa getFlowSource() {
        aa aaVarA = aa.a(this.flowSource_);
        return aaVarA == null ? aa.UNRECOGNIZED : aaVarA;
    }

    public int getFlowSourceValue() {
        return this.flowSource_;
    }

    public boolean getInsufficientFunds() {
        return this.insufficientFunds_;
    }

    public boolean getIsBusinessPaymentAvailable() {
        return this.isBusinessPaymentAvailable_;
    }

    public String getMerchantAppBundleId() {
        return this.merchantAppBundleId_;
    }

    public p getMerchantAppBundleIdBytes() {
        return p.d(this.merchantAppBundleId_);
    }

    public String getMerchantAppDisplayName() {
        return this.merchantAppDisplayName_;
    }

    public p getMerchantAppDisplayNameBytes() {
        return p.d(this.merchantAppDisplayName_);
    }

    public String getMerchantPublicKey() {
        return this.merchantPublicKey_;
    }

    public p getMerchantPublicKeyBytes() {
        return p.d(this.merchantPublicKey_);
    }

    public String getMinimumOsVersion() {
        return this.minimumOsVersion_;
    }

    public p getMinimumOsVersionBytes() {
        return p.d(this.minimumOsVersion_);
    }

    public String getOrderToken() {
        return this.orderToken_;
    }

    public p getOrderTokenBytes() {
        return p.d(this.orderToken_);
    }

    public boolean getPointsRedemptionShown() {
        return this.pointsRedemptionShown_;
    }

    public ca getPreferredMode() {
        ca caVarA = ca.a(this.preferredMode_);
        return caVarA == null ? ca.UNRECOGNIZED : caVarA;
    }

    public int getPreferredModeValue() {
        return this.preferredMode_;
    }

    public ea getTransactionType() {
        ea eaVarA = ea.a(this.transactionType_);
        return eaVarA == null ? ea.UNRECOGNIZED : eaVarA;
    }

    public int getTransactionTypeValue() {
        return this.transactionType_;
    }

    public boolean hasDismissalReason() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasDisplayedScreenState() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasEarnsPoints() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasErrorReason() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasFlowSource() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasInsufficientFunds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsBusinessPaymentAvailable() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasMerchantAppBundleId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMerchantAppDisplayName() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasMerchantPublicKey() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMinimumOsVersion() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasOrderToken() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPointsRedemptionShown() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPreferredMode() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasTransactionType() {
        return (this.bitField0_ & 1024) != 0;
    }

    public static a newBuilder(RevolutPayBasicContext revolutPayBasicContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(revolutPayBasicContext);
    }

    public static RevolutPayBasicContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RevolutPayBasicContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RevolutPayBasicContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevolutPayBasicContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static RevolutPayBasicContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (RevolutPayBasicContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RevolutPayBasicContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevolutPayBasicContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static RevolutPayBasicContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RevolutPayBasicContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RevolutPayBasicContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevolutPayBasicContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static RevolutPayBasicContext parseFrom(InputStream inputStream) throws IOException {
        return (RevolutPayBasicContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RevolutPayBasicContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RevolutPayBasicContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RevolutPayBasicContext parseFrom(t tVar) throws IOException {
        return (RevolutPayBasicContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static RevolutPayBasicContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (RevolutPayBasicContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
