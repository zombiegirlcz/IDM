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
import grl.t0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class BeneficiaryCreationContext extends w0 implements e2 {
    public static final int BANNER_FIELD_NUMBER = 4;
    public static final int COUNTRY_FIELD_NUMBER = 1;
    public static final int CURRENCY_FIELD_NUMBER = 2;
    private static final BeneficiaryCreationContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String country_ = "";
    private String currency_ = "";
    private String type_ = "";
    private String banner_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(BeneficiaryCreationContext.DEFAULT_INSTANCE);
        }
    }

    static {
        BeneficiaryCreationContext beneficiaryCreationContext = new BeneficiaryCreationContext();
        DEFAULT_INSTANCE = beneficiaryCreationContext;
        w0.registerDefaultInstance(BeneficiaryCreationContext.class, beneficiaryCreationContext);
    }

    private BeneficiaryCreationContext() {
    }

    private void clearBanner() {
        this.bitField0_ &= -9;
        this.banner_ = getDefaultInstance().getBanner();
    }

    private void clearCountry() {
        this.bitField0_ &= -2;
        this.country_ = getDefaultInstance().getCountry();
    }

    private void clearCurrency() {
        this.bitField0_ &= -3;
        this.currency_ = getDefaultInstance().getCurrency();
    }

    private void clearType() {
        this.bitField0_ &= -5;
        this.type_ = getDefaultInstance().getType();
    }

    public static BeneficiaryCreationContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static BeneficiaryCreationContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BeneficiaryCreationContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BeneficiaryCreationContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BeneficiaryCreationContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBanner(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.banner_ = str;
    }

    private void setBannerBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.banner_ = pVar.m();
        this.bitField0_ |= 8;
    }

    private void setCountry(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.country_ = str;
    }

    private void setCountryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.country_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setCurrency(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.currency_ = str;
    }

    private void setCurrencyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.currency_ = pVar.m();
        this.bitField0_ |= 2;
    }

    private void setType(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.type_ = str;
    }

    private void setTypeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.type_ = pVar.m();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (t0.f146204a[v0Var.ordinal()]) {
            case 1:
                return new BeneficiaryCreationContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "country_", "currency_", "type_", "banner_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (BeneficiaryCreationContext.class) {
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

    public String getBanner() {
        return this.banner_;
    }

    public p getBannerBytes() {
        return p.d(this.banner_);
    }

    public String getCountry() {
        return this.country_;
    }

    public p getCountryBytes() {
        return p.d(this.country_);
    }

    public String getCurrency() {
        return this.currency_;
    }

    public p getCurrencyBytes() {
        return p.d(this.currency_);
    }

    public String getType() {
        return this.type_;
    }

    public p getTypeBytes() {
        return p.d(this.type_);
    }

    public boolean hasBanner() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCurrency() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(BeneficiaryCreationContext beneficiaryCreationContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(beneficiaryCreationContext);
    }

    public static BeneficiaryCreationContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (BeneficiaryCreationContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static BeneficiaryCreationContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (BeneficiaryCreationContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static BeneficiaryCreationContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (BeneficiaryCreationContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static BeneficiaryCreationContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (BeneficiaryCreationContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static BeneficiaryCreationContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BeneficiaryCreationContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BeneficiaryCreationContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (BeneficiaryCreationContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static BeneficiaryCreationContext parseFrom(InputStream inputStream) throws IOException {
        return (BeneficiaryCreationContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BeneficiaryCreationContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (BeneficiaryCreationContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static BeneficiaryCreationContext parseFrom(t tVar) throws IOException {
        return (BeneficiaryCreationContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static BeneficiaryCreationContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (BeneficiaryCreationContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
