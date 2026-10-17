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
import grl.k7;
import grl.r2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class OpenCreditEntryPointContext extends w0 implements e2 {
    public static final int COUNTRY_FIELD_NUMBER = 3;
    private static final OpenCreditEntryPointContext DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_TYPE_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int PRODUCT_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String country_ = "";
    private int entryPointType_;
    private int productType_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(r2 r2Var) {
            c();
            ((OpenCreditEntryPointContext) this.f49761b).setEntryPointType(r2Var);
        }

        public final void i(grl.m2 m2Var) {
            c();
            ((OpenCreditEntryPointContext) this.f49761b).setProductType(m2Var);
        }

        private a() {
            super(OpenCreditEntryPointContext.DEFAULT_INSTANCE);
        }
    }

    static {
        OpenCreditEntryPointContext openCreditEntryPointContext = new OpenCreditEntryPointContext();
        DEFAULT_INSTANCE = openCreditEntryPointContext;
        w0.registerDefaultInstance(OpenCreditEntryPointContext.class, openCreditEntryPointContext);
    }

    private OpenCreditEntryPointContext() {
    }

    private void clearCountry() {
        this.bitField0_ &= -5;
        this.country_ = getDefaultInstance().getCountry();
    }

    private void clearEntryPointType() {
        this.bitField0_ &= -3;
        this.entryPointType_ = 0;
    }

    private void clearProductType() {
        this.bitField0_ &= -2;
        this.productType_ = 0;
    }

    public static OpenCreditEntryPointContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static OpenCreditEntryPointContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OpenCreditEntryPointContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OpenCreditEntryPointContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OpenCreditEntryPointContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.country_ = str;
    }

    private void setCountryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.country_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPointType(r2 r2Var) {
        this.entryPointType_ = r2Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setEntryPointTypeValue(int i) {
        this.bitField0_ |= 2;
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
        switch (k7.f146128a[v0Var.ordinal()]) {
            case 1:
                return new OpenCreditEntryPointContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "productType_", "entryPointType_", "country_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (OpenCreditEntryPointContext.class) {
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
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEntryPointType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProductType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(OpenCreditEntryPointContext openCreditEntryPointContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(openCreditEntryPointContext);
    }

    public static OpenCreditEntryPointContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (OpenCreditEntryPointContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static OpenCreditEntryPointContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (OpenCreditEntryPointContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static OpenCreditEntryPointContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (OpenCreditEntryPointContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static OpenCreditEntryPointContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (OpenCreditEntryPointContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static OpenCreditEntryPointContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OpenCreditEntryPointContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OpenCreditEntryPointContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (OpenCreditEntryPointContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static OpenCreditEntryPointContext parseFrom(InputStream inputStream) throws IOException {
        return (OpenCreditEntryPointContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OpenCreditEntryPointContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (OpenCreditEntryPointContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static OpenCreditEntryPointContext parseFrom(t tVar) throws IOException {
        return (OpenCreditEntryPointContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static OpenCreditEntryPointContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (OpenCreditEntryPointContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
