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
import grl.qc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SlotTileMessageMetadataContext extends w0 implements e2 {
    public static final int ALL_CAMPAIGN_IDS_FIELD_NUMBER = 2;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    private static final SlotTileMessageMetadataContext DEFAULT_INSTANCE;
    public static final int IS_FIRST_IMPRESSION_FIELD_NUMBER = 3;
    private static volatile m2 PARSER;
    private int bitField0_;
    private boolean isFirstImpression_;
    private String campaignId_ = "";
    private String allCampaignIds_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((SlotTileMessageMetadataContext) this.f49761b).setCampaignId(str);
        }

        private a() {
            super(SlotTileMessageMetadataContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SlotTileMessageMetadataContext slotTileMessageMetadataContext = new SlotTileMessageMetadataContext();
        DEFAULT_INSTANCE = slotTileMessageMetadataContext;
        w0.registerDefaultInstance(SlotTileMessageMetadataContext.class, slotTileMessageMetadataContext);
    }

    private SlotTileMessageMetadataContext() {
    }

    private void clearAllCampaignIds() {
        this.bitField0_ &= -3;
        this.allCampaignIds_ = getDefaultInstance().getAllCampaignIds();
    }

    private void clearCampaignId() {
        this.bitField0_ &= -2;
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    private void clearIsFirstImpression() {
        this.bitField0_ &= -5;
        this.isFirstImpression_ = false;
    }

    public static SlotTileMessageMetadataContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SlotTileMessageMetadataContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SlotTileMessageMetadataContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SlotTileMessageMetadataContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SlotTileMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllCampaignIds(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.allCampaignIds_ = str;
    }

    private void setAllCampaignIdsBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.allCampaignIds_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.campaignId_ = str;
    }

    private void setCampaignIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.campaignId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setIsFirstImpression(boolean z) {
        this.bitField0_ |= 4;
        this.isFirstImpression_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (qc.f146185a[v0Var.ordinal()]) {
            case 1:
                return new SlotTileMessageMetadataContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "campaignId_", "allCampaignIds_", "isFirstImpression_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SlotTileMessageMetadataContext.class) {
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

    public String getAllCampaignIds() {
        return this.allCampaignIds_;
    }

    public p getAllCampaignIdsBytes() {
        return p.d(this.allCampaignIds_);
    }

    public String getCampaignId() {
        return this.campaignId_;
    }

    public p getCampaignIdBytes() {
        return p.d(this.campaignId_);
    }

    public boolean getIsFirstImpression() {
        return this.isFirstImpression_;
    }

    public boolean hasAllCampaignIds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCampaignId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsFirstImpression() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(SlotTileMessageMetadataContext slotTileMessageMetadataContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(slotTileMessageMetadataContext);
    }

    public static SlotTileMessageMetadataContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SlotTileMessageMetadataContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SlotTileMessageMetadataContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SlotTileMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SlotTileMessageMetadataContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SlotTileMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SlotTileMessageMetadataContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SlotTileMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SlotTileMessageMetadataContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SlotTileMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SlotTileMessageMetadataContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SlotTileMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SlotTileMessageMetadataContext parseFrom(InputStream inputStream) throws IOException {
        return (SlotTileMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SlotTileMessageMetadataContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SlotTileMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SlotTileMessageMetadataContext parseFrom(t tVar) throws IOException {
        return (SlotTileMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SlotTileMessageMetadataContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SlotTileMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
