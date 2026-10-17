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
import grl.u3;
import grl.w3;
import grl.y3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class EditConsentLimitContext extends w0 implements e2 {
    public static final int AMOUNT_FIELD_NUMBER = 6;
    public static final int BRANCH_ID_FIELD_NUMBER = 5;
    public static final int CONSENT_ID_FIELD_NUMBER = 1;
    public static final int CURRENCY_FIELD_NUMBER = 7;
    private static final EditConsentLimitContext DEFAULT_INSTANCE;
    public static final int INSTITUTION_ID_FIELD_NUMBER = 4;
    public static final int LIMIT_ERROR_TYPE_FIELD_NUMBER = 3;
    public static final int LIMIT_NAME_FIELD_NUMBER = 2;
    private static volatile m2 PARSER;
    private double amount_;
    private int bitField0_;
    private int limitErrorType_;
    private int limitName_;
    private String consentId_ = "";
    private String institutionId_ = "";
    private String branchId_ = "";
    private String currency_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(EditConsentLimitContext.DEFAULT_INSTANCE);
        }
    }

    static {
        EditConsentLimitContext editConsentLimitContext = new EditConsentLimitContext();
        DEFAULT_INSTANCE = editConsentLimitContext;
        w0.registerDefaultInstance(EditConsentLimitContext.class, editConsentLimitContext);
    }

    private EditConsentLimitContext() {
    }

    private void clearAmount() {
        this.bitField0_ &= -33;
        this.amount_ = 0.0d;
    }

    private void clearBranchId() {
        this.bitField0_ &= -17;
        this.branchId_ = getDefaultInstance().getBranchId();
    }

    private void clearConsentId() {
        this.bitField0_ &= -2;
        this.consentId_ = getDefaultInstance().getConsentId();
    }

    private void clearCurrency() {
        this.bitField0_ &= -65;
        this.currency_ = getDefaultInstance().getCurrency();
    }

    private void clearInstitutionId() {
        this.bitField0_ &= -9;
        this.institutionId_ = getDefaultInstance().getInstitutionId();
    }

    private void clearLimitErrorType() {
        this.bitField0_ &= -5;
        this.limitErrorType_ = 0;
    }

    private void clearLimitName() {
        this.bitField0_ &= -3;
        this.limitName_ = 0;
    }

    public static EditConsentLimitContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static EditConsentLimitContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EditConsentLimitContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EditConsentLimitContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EditConsentLimitContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAmount(double d) {
        this.bitField0_ |= 32;
        this.amount_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBranchId(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.branchId_ = str;
    }

    private void setBranchIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.branchId_ = pVar.m();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsentId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.consentId_ = str;
    }

    private void setConsentIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.consentId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrency(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.currency_ = str;
    }

    private void setCurrencyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.currency_ = pVar.m();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstitutionId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.institutionId_ = str;
    }

    private void setInstitutionIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.institutionId_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitErrorType(w3 w3Var) {
        this.limitErrorType_ = w3Var.getNumber();
        this.bitField0_ |= 4;
    }

    private void setLimitErrorTypeValue(int i) {
        this.bitField0_ |= 4;
        this.limitErrorType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitName(y3 y3Var) {
        this.limitName_ = y3Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setLimitNameValue(int i) {
        this.bitField0_ |= 2;
        this.limitName_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (u3.f146212a[v0Var.ordinal()]) {
            case 1:
                return new EditConsentLimitContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006က\u0005\u0007ለ\u0006", new Object[]{"bitField0_", "consentId_", "limitName_", "limitErrorType_", "institutionId_", "branchId_", "amount_", "currency_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (EditConsentLimitContext.class) {
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

    public String getBranchId() {
        return this.branchId_;
    }

    public p getBranchIdBytes() {
        return p.d(this.branchId_);
    }

    public String getConsentId() {
        return this.consentId_;
    }

    public p getConsentIdBytes() {
        return p.d(this.consentId_);
    }

    public String getCurrency() {
        return this.currency_;
    }

    public p getCurrencyBytes() {
        return p.d(this.currency_);
    }

    public String getInstitutionId() {
        return this.institutionId_;
    }

    public p getInstitutionIdBytes() {
        return p.d(this.institutionId_);
    }

    public w3 getLimitErrorType() {
        int i = this.limitErrorType_;
        w3 w3Var = i != 0 ? i != 1 ? null : w3.EXCEEDS_UPPER_BOUND : w3.BELOW_LOWER_BOUND;
        return w3Var == null ? w3.UNRECOGNIZED : w3Var;
    }

    public int getLimitErrorTypeValue() {
        return this.limitErrorType_;
    }

    public y3 getLimitName() {
        y3 y3VarA = y3.a(this.limitName_);
        return y3VarA == null ? y3.UNRECOGNIZED : y3VarA;
    }

    public int getLimitNameValue() {
        return this.limitName_;
    }

    public boolean hasAmount() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasBranchId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasConsentId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCurrency() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasInstitutionId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLimitErrorType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLimitName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(EditConsentLimitContext editConsentLimitContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(editConsentLimitContext);
    }

    public static EditConsentLimitContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (EditConsentLimitContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static EditConsentLimitContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (EditConsentLimitContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static EditConsentLimitContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (EditConsentLimitContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static EditConsentLimitContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (EditConsentLimitContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static EditConsentLimitContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EditConsentLimitContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EditConsentLimitContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (EditConsentLimitContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static EditConsentLimitContext parseFrom(InputStream inputStream) throws IOException {
        return (EditConsentLimitContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EditConsentLimitContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (EditConsentLimitContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static EditConsentLimitContext parseFrom(t tVar) throws IOException {
        return (EditConsentLimitContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static EditConsentLimitContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (EditConsentLimitContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
