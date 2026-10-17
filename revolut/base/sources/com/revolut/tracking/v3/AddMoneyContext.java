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
import grl.i;
import grl.k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class AddMoneyContext extends w0 implements e2 {
    public static final int AMOUNT_FIELD_NUMBER = 2;
    public static final int CTA_NAME_FIELD_NUMBER = 12;
    public static final int CURRENCY_FIELD_NUMBER = 1;
    private static final AddMoneyContext DEFAULT_INSTANCE;
    public static final int DEFAULT_METHOD_FIELD_NUMBER = 3;
    public static final int OB_STEERING_FAILED_REASON_FIELD_NUMBER = 8;
    public static final int OB_STEERING_FAILED_REASON_INSTITUTION_ID_FIELD_NUMBER = 11;
    public static final int OB_STEERING_FAILED_REASON_ISSUER_ID_FIELD_NUMBER = 10;
    public static final int OB_STEERING_FAILED_REASON_ISSUER_NAME_FIELD_NUMBER = 9;
    public static final int OB_STEERING_FIELD_NUMBER = 5;
    public static final int OB_STEERING_FIRST_TIME_FIELD_NUMBER = 6;
    public static final int OB_STEERING_SOURCE_FIELD_NUMBER = 7;
    private static volatile m2 PARSER = null;
    public static final int SELECTED_METHOD_FIELD_NUMBER = 4;
    private double amount_;
    private int bitField0_;
    private int defaultMethod_;
    private boolean obSteeringFirstTime_;
    private boolean obSteering_;
    private int selectedMethod_;
    private String currency_ = "";
    private String obSteeringSource_ = "";
    private String obSteeringFailedReason_ = "";
    private String obSteeringFailedReasonIssuerName_ = "";
    private String obSteeringFailedReasonIssuerId_ = "";
    private String obSteeringFailedReasonInstitutionId_ = "";
    private String ctaName_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(AddMoneyContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AddMoneyContext addMoneyContext = new AddMoneyContext();
        DEFAULT_INSTANCE = addMoneyContext;
        w0.registerDefaultInstance(AddMoneyContext.class, addMoneyContext);
    }

    private AddMoneyContext() {
    }

    private void clearAmount() {
        this.bitField0_ &= -3;
        this.amount_ = 0.0d;
    }

    private void clearCtaName() {
        this.bitField0_ &= -2049;
        this.ctaName_ = getDefaultInstance().getCtaName();
    }

    private void clearCurrency() {
        this.bitField0_ &= -2;
        this.currency_ = getDefaultInstance().getCurrency();
    }

    private void clearDefaultMethod() {
        this.bitField0_ &= -5;
        this.defaultMethod_ = 0;
    }

    private void clearObSteering() {
        this.bitField0_ &= -17;
        this.obSteering_ = false;
    }

    private void clearObSteeringFailedReason() {
        this.bitField0_ &= -129;
        this.obSteeringFailedReason_ = getDefaultInstance().getObSteeringFailedReason();
    }

    private void clearObSteeringFailedReasonInstitutionId() {
        this.bitField0_ &= -1025;
        this.obSteeringFailedReasonInstitutionId_ = getDefaultInstance().getObSteeringFailedReasonInstitutionId();
    }

    private void clearObSteeringFailedReasonIssuerId() {
        this.bitField0_ &= -513;
        this.obSteeringFailedReasonIssuerId_ = getDefaultInstance().getObSteeringFailedReasonIssuerId();
    }

    private void clearObSteeringFailedReasonIssuerName() {
        this.bitField0_ &= -257;
        this.obSteeringFailedReasonIssuerName_ = getDefaultInstance().getObSteeringFailedReasonIssuerName();
    }

    private void clearObSteeringFirstTime() {
        this.bitField0_ &= -33;
        this.obSteeringFirstTime_ = false;
    }

    private void clearObSteeringSource() {
        this.bitField0_ &= -65;
        this.obSteeringSource_ = getDefaultInstance().getObSteeringSource();
    }

    private void clearSelectedMethod() {
        this.bitField0_ &= -9;
        this.selectedMethod_ = 0;
    }

    public static AddMoneyContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static AddMoneyContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AddMoneyContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddMoneyContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AddMoneyContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmount(double d) {
        this.bitField0_ |= 2;
        this.amount_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaName(String str) {
        str.getClass();
        this.bitField0_ |= 2048;
        this.ctaName_ = str;
    }

    private void setCtaNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.ctaName_ = pVar.m();
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrency(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.currency_ = str;
    }

    private void setCurrencyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.currency_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultMethod(k kVar) {
        this.defaultMethod_ = kVar.getNumber();
        this.bitField0_ |= 4;
    }

    private void setDefaultMethodValue(int i) {
        this.bitField0_ |= 4;
        this.defaultMethod_ = i;
    }

    private void setObSteering(boolean z) {
        this.bitField0_ |= 16;
        this.obSteering_ = z;
    }

    private void setObSteeringFailedReason(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.obSteeringFailedReason_ = str;
    }

    private void setObSteeringFailedReasonBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.obSteeringFailedReason_ = pVar.m();
        this.bitField0_ |= 128;
    }

    private void setObSteeringFailedReasonInstitutionId(String str) {
        str.getClass();
        this.bitField0_ |= 1024;
        this.obSteeringFailedReasonInstitutionId_ = str;
    }

    private void setObSteeringFailedReasonInstitutionIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.obSteeringFailedReasonInstitutionId_ = pVar.m();
        this.bitField0_ |= 1024;
    }

    private void setObSteeringFailedReasonIssuerId(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.obSteeringFailedReasonIssuerId_ = str;
    }

    private void setObSteeringFailedReasonIssuerIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.obSteeringFailedReasonIssuerId_ = pVar.m();
        this.bitField0_ |= 512;
    }

    private void setObSteeringFailedReasonIssuerName(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.obSteeringFailedReasonIssuerName_ = str;
    }

    private void setObSteeringFailedReasonIssuerNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.obSteeringFailedReasonIssuerName_ = pVar.m();
        this.bitField0_ |= 256;
    }

    private void setObSteeringFirstTime(boolean z) {
        this.bitField0_ |= 32;
        this.obSteeringFirstTime_ = z;
    }

    private void setObSteeringSource(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.obSteeringSource_ = str;
    }

    private void setObSteeringSourceBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.obSteeringSource_ = pVar.m();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedMethod(k kVar) {
        this.selectedMethod_ = kVar.getNumber();
        this.bitField0_ |= 8;
    }

    private void setSelectedMethodValue(int i) {
        this.bitField0_ |= 8;
        this.selectedMethod_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (i.f146105a[v0Var.ordinal()]) {
            case 1:
                return new AddMoneyContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ለ\u0000\u0002က\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000bለ\n\fለ\u000b", new Object[]{"bitField0_", "currency_", "amount_", "defaultMethod_", "selectedMethod_", "obSteering_", "obSteeringFirstTime_", "obSteeringSource_", "obSteeringFailedReason_", "obSteeringFailedReasonIssuerName_", "obSteeringFailedReasonIssuerId_", "obSteeringFailedReasonInstitutionId_", "ctaName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AddMoneyContext.class) {
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

    public double getAmount() {
        return this.amount_;
    }

    public String getCtaName() {
        return this.ctaName_;
    }

    public p getCtaNameBytes() {
        return p.d(this.ctaName_);
    }

    public String getCurrency() {
        return this.currency_;
    }

    public p getCurrencyBytes() {
        return p.d(this.currency_);
    }

    public k getDefaultMethod() {
        k kVarA = k.a(this.defaultMethod_);
        return kVarA == null ? k.UNRECOGNIZED : kVarA;
    }

    public int getDefaultMethodValue() {
        return this.defaultMethod_;
    }

    public boolean getObSteering() {
        return this.obSteering_;
    }

    public String getObSteeringFailedReason() {
        return this.obSteeringFailedReason_;
    }

    public p getObSteeringFailedReasonBytes() {
        return p.d(this.obSteeringFailedReason_);
    }

    public String getObSteeringFailedReasonInstitutionId() {
        return this.obSteeringFailedReasonInstitutionId_;
    }

    public p getObSteeringFailedReasonInstitutionIdBytes() {
        return p.d(this.obSteeringFailedReasonInstitutionId_);
    }

    public String getObSteeringFailedReasonIssuerId() {
        return this.obSteeringFailedReasonIssuerId_;
    }

    public p getObSteeringFailedReasonIssuerIdBytes() {
        return p.d(this.obSteeringFailedReasonIssuerId_);
    }

    public String getObSteeringFailedReasonIssuerName() {
        return this.obSteeringFailedReasonIssuerName_;
    }

    public p getObSteeringFailedReasonIssuerNameBytes() {
        return p.d(this.obSteeringFailedReasonIssuerName_);
    }

    public boolean getObSteeringFirstTime() {
        return this.obSteeringFirstTime_;
    }

    public String getObSteeringSource() {
        return this.obSteeringSource_;
    }

    public p getObSteeringSourceBytes() {
        return p.d(this.obSteeringSource_);
    }

    public k getSelectedMethod() {
        k kVarA = k.a(this.selectedMethod_);
        return kVarA == null ? k.UNRECOGNIZED : kVarA;
    }

    public int getSelectedMethodValue() {
        return this.selectedMethod_;
    }

    public boolean hasAmount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCtaName() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasCurrency() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDefaultMethod() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasObSteering() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasObSteeringFailedReason() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasObSteeringFailedReasonInstitutionId() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasObSteeringFailedReasonIssuerId() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasObSteeringFailedReasonIssuerName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasObSteeringFirstTime() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasObSteeringSource() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSelectedMethod() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(AddMoneyContext addMoneyContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(addMoneyContext);
    }

    public static AddMoneyContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AddMoneyContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AddMoneyContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AddMoneyContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AddMoneyContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AddMoneyContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AddMoneyContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AddMoneyContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AddMoneyContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AddMoneyContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AddMoneyContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AddMoneyContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AddMoneyContext parseFrom(InputStream inputStream) throws IOException {
        return (AddMoneyContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AddMoneyContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AddMoneyContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AddMoneyContext parseFrom(t tVar) throws IOException {
        return (AddMoneyContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AddMoneyContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AddMoneyContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
