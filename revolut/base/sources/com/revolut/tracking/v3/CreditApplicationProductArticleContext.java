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
import grl.o2;
import grl.r2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class CreditApplicationProductArticleContext extends w0 implements e2 {
    public static final int COUNTRY_FIELD_NUMBER = 2;
    private static final CreditApplicationProductArticleContext DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_TYPE_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int PRODUCT_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String country_ = "";
    private int entryPointType_;
    private int productType_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CreditApplicationProductArticleContext.DEFAULT_INSTANCE);
        }
    }

    static {
        CreditApplicationProductArticleContext creditApplicationProductArticleContext = new CreditApplicationProductArticleContext();
        DEFAULT_INSTANCE = creditApplicationProductArticleContext;
        w0.registerDefaultInstance(CreditApplicationProductArticleContext.class, creditApplicationProductArticleContext);
    }

    private CreditApplicationProductArticleContext() {
    }

    private void clearCountry() {
        this.bitField0_ &= -3;
        this.country_ = getDefaultInstance().getCountry();
    }

    private void clearEntryPointType() {
        this.bitField0_ &= -5;
        this.entryPointType_ = 0;
    }

    private void clearProductType() {
        this.bitField0_ &= -2;
        this.productType_ = 0;
    }

    public static CreditApplicationProductArticleContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CreditApplicationProductArticleContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreditApplicationProductArticleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreditApplicationProductArticleContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CreditApplicationProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.country_ = str;
    }

    private void setCountryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.country_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointType(r2 r2Var) {
        this.entryPointType_ = r2Var.getNumber();
        this.bitField0_ |= 4;
    }

    private void setEntryPointTypeValue(int i) {
        this.bitField0_ |= 4;
        this.entryPointType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductType(grl.m2 m2Var) {
        this.productType_ = m2Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setProductTypeValue(int i) {
        this.bitField0_ |= 1;
        this.productType_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (o2.f146157a[v0Var.ordinal()]) {
            case 1:
                return new CreditApplicationProductArticleContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဌ\u0002", new Object[]{"bitField0_", "productType_", "country_", "entryPointType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CreditApplicationProductArticleContext.class) {
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

    public String getCountry() {
        return this.country_;
    }

    public p getCountryBytes() {
        return p.d(this.country_);
    }

    public r2 getEntryPointType() {
        r2 r2VarA = r2.a(this.entryPointType_);
        return r2VarA == null ? r2.UNRECOGNIZED : r2VarA;
    }

    public int getEntryPointTypeValue() {
        return this.entryPointType_;
    }

    public grl.m2 getProductType() {
        grl.m2 m2VarA = grl.m2.a(this.productType_);
        return m2VarA == null ? grl.m2.UNRECOGNIZED : m2VarA;
    }

    public int getProductTypeValue() {
        return this.productType_;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEntryPointType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasProductType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(CreditApplicationProductArticleContext creditApplicationProductArticleContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(creditApplicationProductArticleContext);
    }

    public static CreditApplicationProductArticleContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CreditApplicationProductArticleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CreditApplicationProductArticleContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CreditApplicationProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CreditApplicationProductArticleContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CreditApplicationProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CreditApplicationProductArticleContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CreditApplicationProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CreditApplicationProductArticleContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CreditApplicationProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CreditApplicationProductArticleContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CreditApplicationProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CreditApplicationProductArticleContext parseFrom(InputStream inputStream) throws IOException {
        return (CreditApplicationProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CreditApplicationProductArticleContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CreditApplicationProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CreditApplicationProductArticleContext parseFrom(t tVar) throws IOException {
        return (CreditApplicationProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CreditApplicationProductArticleContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CreditApplicationProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
