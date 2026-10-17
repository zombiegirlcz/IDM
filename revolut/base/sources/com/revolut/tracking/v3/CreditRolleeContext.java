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
import grl.s2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class CreditRolleeContext extends w0 implements e2 {
    public static final int APPLICATION_ID_FIELD_NUMBER = 1;
    public static final int CALLSSTACK_FIELD_NUMBER = 6;
    public static final int DATASOURCEID_FIELD_NUMBER = 4;
    private static final CreditRolleeContext DEFAULT_INSTANCE;
    public static final int OTPSTATUS_FIELD_NUMBER = 5;
    private static volatile m2 PARSER = null;
    public static final int PRODUCT_TYPE_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 3;
    private int bitField0_;
    private int productType_;
    private String applicationId_ = "";
    private String status_ = "";
    private String datasourceId_ = "";
    private String otpStatus_ = "";
    private String callsStack_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CreditRolleeContext.DEFAULT_INSTANCE);
        }
    }

    static {
        CreditRolleeContext creditRolleeContext = new CreditRolleeContext();
        DEFAULT_INSTANCE = creditRolleeContext;
        w0.registerDefaultInstance(CreditRolleeContext.class, creditRolleeContext);
    }

    private CreditRolleeContext() {
    }

    private void clearApplicationId() {
        this.bitField0_ &= -2;
        this.applicationId_ = getDefaultInstance().getApplicationId();
    }

    private void clearCallsStack() {
        this.bitField0_ &= -33;
        this.callsStack_ = getDefaultInstance().getCallsStack();
    }

    private void clearDatasourceId() {
        this.bitField0_ &= -9;
        this.datasourceId_ = getDefaultInstance().getDatasourceId();
    }

    private void clearOtpStatus() {
        this.bitField0_ &= -17;
        this.otpStatus_ = getDefaultInstance().getOtpStatus();
    }

    private void clearProductType() {
        this.bitField0_ &= -3;
        this.productType_ = 0;
    }

    private void clearStatus() {
        this.bitField0_ &= -5;
        this.status_ = getDefaultInstance().getStatus();
    }

    public static CreditRolleeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CreditRolleeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreditRolleeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreditRolleeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CreditRolleeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.applicationId_ = str;
    }

    private void setApplicationIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.applicationId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallsStack(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.callsStack_ = str;
    }

    private void setCallsStackBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.callsStack_ = pVar.m();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatasourceId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.datasourceId_ = str;
    }

    private void setDatasourceIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.datasourceId_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOtpStatus(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.otpStatus_ = str;
    }

    private void setOtpStatusBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.otpStatus_ = pVar.m();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductType(grl.m2 m2Var) {
        this.productType_ = m2Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setProductTypeValue(int i) {
        this.bitField0_ |= 2;
        this.productType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.status_ = str;
    }

    private void setStatusBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.status_ = pVar.m();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (s2.f146197a[v0Var.ordinal()]) {
            case 1:
                return new CreditRolleeContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005", new Object[]{"bitField0_", "applicationId_", "productType_", "status_", "datasourceId_", "otpStatus_", "callsStack_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CreditRolleeContext.class) {
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

    public String getApplicationId() {
        return this.applicationId_;
    }

    public p getApplicationIdBytes() {
        return p.d(this.applicationId_);
    }

    public String getCallsStack() {
        return this.callsStack_;
    }

    public p getCallsStackBytes() {
        return p.d(this.callsStack_);
    }

    public String getDatasourceId() {
        return this.datasourceId_;
    }

    public p getDatasourceIdBytes() {
        return p.d(this.datasourceId_);
    }

    public String getOtpStatus() {
        return this.otpStatus_;
    }

    public p getOtpStatusBytes() {
        return p.d(this.otpStatus_);
    }

    public grl.m2 getProductType() {
        grl.m2 m2VarA = grl.m2.a(this.productType_);
        return m2VarA == null ? grl.m2.UNRECOGNIZED : m2VarA;
    }

    public int getProductTypeValue() {
        return this.productType_;
    }

    public String getStatus() {
        return this.status_;
    }

    public p getStatusBytes() {
        return p.d(this.status_);
    }

    public boolean hasApplicationId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCallsStack() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDatasourceId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOtpStatus() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasProductType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(CreditRolleeContext creditRolleeContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(creditRolleeContext);
    }

    public static CreditRolleeContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CreditRolleeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CreditRolleeContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CreditRolleeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CreditRolleeContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CreditRolleeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CreditRolleeContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CreditRolleeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CreditRolleeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CreditRolleeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreditRolleeContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CreditRolleeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CreditRolleeContext parseFrom(InputStream inputStream) throws IOException {
        return (CreditRolleeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreditRolleeContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CreditRolleeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CreditRolleeContext parseFrom(t tVar) throws IOException {
        return (CreditRolleeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CreditRolleeContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CreditRolleeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
