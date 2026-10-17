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
import grl.pc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class ShopsImpressionMetadata extends w0 implements e2 {
    public static final int BRAND_ID_FIELD_NUMBER = 2;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final ShopsImpressionMetadata DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PRODUCT_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private String campaignId_ = "";
    private String brandId_ = "";
    private String productId_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(ShopsImpressionMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        ShopsImpressionMetadata shopsImpressionMetadata = new ShopsImpressionMetadata();
        DEFAULT_INSTANCE = shopsImpressionMetadata;
        w0.registerDefaultInstance(ShopsImpressionMetadata.class, shopsImpressionMetadata);
    }

    private ShopsImpressionMetadata() {
    }

    private void clearBrandId() {
        this.bitField0_ &= -3;
        this.brandId_ = getDefaultInstance().getBrandId();
    }

    private void clearCampaignId() {
        this.bitField0_ &= -2;
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    private void clearProductId() {
        this.bitField0_ &= -5;
        this.productId_ = getDefaultInstance().getProductId();
    }

    public static ShopsImpressionMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShopsImpressionMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ShopsImpressionMetadata) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShopsImpressionMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ShopsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBrandId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.brandId_ = str;
    }

    private void setBrandIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.brandId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    private void setCampaignId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.campaignId_ = str;
    }

    private void setCampaignIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.campaignId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setProductId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.productId_ = str;
    }

    private void setProductIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.productId_ = pVar.m();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (pc.f146176a[v0Var.ordinal()]) {
            case 1:
                return new ShopsImpressionMetadata();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "campaignId_", "brandId_", "productId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ShopsImpressionMetadata.class) {
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

    public String getBrandId() {
        return this.brandId_;
    }

    public p getBrandIdBytes() {
        return p.d(this.brandId_);
    }

    public String getCampaignId() {
        return this.campaignId_;
    }

    public p getCampaignIdBytes() {
        return p.d(this.campaignId_);
    }

    public String getProductId() {
        return this.productId_;
    }

    public p getProductIdBytes() {
        return p.d(this.productId_);
    }

    public boolean hasBrandId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCampaignId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasProductId() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(ShopsImpressionMetadata shopsImpressionMetadata) {
        return (a) DEFAULT_INSTANCE.createBuilder(shopsImpressionMetadata);
    }

    public static ShopsImpressionMetadata parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ShopsImpressionMetadata) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ShopsImpressionMetadata parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (ShopsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ShopsImpressionMetadata parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ShopsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ShopsImpressionMetadata parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (ShopsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ShopsImpressionMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ShopsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShopsImpressionMetadata parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (ShopsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ShopsImpressionMetadata parseFrom(InputStream inputStream) throws IOException {
        return (ShopsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShopsImpressionMetadata parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ShopsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ShopsImpressionMetadata parseFrom(t tVar) throws IOException {
        return (ShopsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ShopsImpressionMetadata parseFrom(t tVar, d0 d0Var) throws IOException {
        return (ShopsImpressionMetadata) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
