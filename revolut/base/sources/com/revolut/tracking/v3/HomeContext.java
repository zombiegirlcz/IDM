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
import grl.q4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class HomeContext extends w0 implements e2 {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 2;
    private static final HomeContext DEFAULT_INSTANCE;
    public static final int DESTINATION_POCKET_ID_FIELD_NUMBER = 4;
    private static volatile m2 PARSER = null;
    public static final int POCKET_ID_FIELD_NUMBER = 3;
    public static final int PRODUCT_IDENTIFIER_FIELD_NUMBER = 1;
    private int bitField0_;
    private String productIdentifier_ = "";
    private String currencyCode_ = "";
    private String pocketId_ = "";
    private String destinationPocketId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(HomeContext.DEFAULT_INSTANCE);
        }
    }

    static {
        HomeContext homeContext = new HomeContext();
        DEFAULT_INSTANCE = homeContext;
        w0.registerDefaultInstance(HomeContext.class, homeContext);
    }

    private HomeContext() {
    }

    private void clearCurrencyCode() {
        this.bitField0_ &= -3;
        this.currencyCode_ = getDefaultInstance().getCurrencyCode();
    }

    private void clearDestinationPocketId() {
        this.bitField0_ &= -9;
        this.destinationPocketId_ = getDefaultInstance().getDestinationPocketId();
    }

    private void clearPocketId() {
        this.bitField0_ &= -5;
        this.pocketId_ = getDefaultInstance().getPocketId();
    }

    private void clearProductIdentifier() {
        this.bitField0_ &= -2;
        this.productIdentifier_ = getDefaultInstance().getProductIdentifier();
    }

    public static HomeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static HomeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HomeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HomeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HomeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrencyCode(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.currencyCode_ = str;
    }

    private void setCurrencyCodeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.currencyCode_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDestinationPocketId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.destinationPocketId_ = str;
    }

    private void setDestinationPocketIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.destinationPocketId_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPocketId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.pocketId_ = str;
    }

    private void setPocketIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.pocketId_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProductIdentifier(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.productIdentifier_ = str;
    }

    private void setProductIdentifierBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.productIdentifier_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (q4.f146181a[v0Var.ordinal()]) {
            case 1:
                return new HomeContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "productIdentifier_", "currencyCode_", "pocketId_", "destinationPocketId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (HomeContext.class) {
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

    public String getCurrencyCode() {
        return this.currencyCode_;
    }

    public p getCurrencyCodeBytes() {
        return p.d(this.currencyCode_);
    }

    public String getDestinationPocketId() {
        return this.destinationPocketId_;
    }

    public p getDestinationPocketIdBytes() {
        return p.d(this.destinationPocketId_);
    }

    public String getPocketId() {
        return this.pocketId_;
    }

    public p getPocketIdBytes() {
        return p.d(this.pocketId_);
    }

    public String getProductIdentifier() {
        return this.productIdentifier_;
    }

    public p getProductIdentifierBytes() {
        return p.d(this.productIdentifier_);
    }

    public boolean hasCurrencyCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDestinationPocketId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPocketId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasProductIdentifier() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(HomeContext homeContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(homeContext);
    }

    public static HomeContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (HomeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static HomeContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (HomeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static HomeContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (HomeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static HomeContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (HomeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static HomeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HomeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HomeContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (HomeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static HomeContext parseFrom(InputStream inputStream) throws IOException {
        return (HomeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HomeContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (HomeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static HomeContext parseFrom(t tVar) throws IOException {
        return (HomeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static HomeContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (HomeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
