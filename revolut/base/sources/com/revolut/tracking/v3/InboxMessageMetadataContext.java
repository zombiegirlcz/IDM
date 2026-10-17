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
import grl.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class InboxMessageMetadataContext extends w0 implements e2 {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static final InboxMessageMetadataContext DEFAULT_INSTANCE;
    public static final int IS_PRODUCT_ARTICLE_FIELD_NUMBER = 5;
    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int PUSH_ID_FIELD_NUMBER = 3;
    public static final int TILE_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isProductArticle_;
    private String messageId_ = "";
    private String campaignId_ = "";
    private String pushId_ = "";
    private String tileId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(InboxMessageMetadataContext.DEFAULT_INSTANCE);
        }
    }

    static {
        InboxMessageMetadataContext inboxMessageMetadataContext = new InboxMessageMetadataContext();
        DEFAULT_INSTANCE = inboxMessageMetadataContext;
        w0.registerDefaultInstance(InboxMessageMetadataContext.class, inboxMessageMetadataContext);
    }

    private InboxMessageMetadataContext() {
    }

    private void clearCampaignId() {
        this.bitField0_ &= -3;
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    private void clearIsProductArticle() {
        this.bitField0_ &= -17;
        this.isProductArticle_ = false;
    }

    private void clearMessageId() {
        this.bitField0_ &= -2;
        this.messageId_ = getDefaultInstance().getMessageId();
    }

    private void clearPushId() {
        this.bitField0_ &= -5;
        this.pushId_ = getDefaultInstance().getPushId();
    }

    private void clearTileId() {
        this.bitField0_ &= -9;
        this.tileId_ = getDefaultInstance().getTileId();
    }

    public static InboxMessageMetadataContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static InboxMessageMetadataContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InboxMessageMetadataContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InboxMessageMetadataContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InboxMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.campaignId_ = str;
    }

    private void setCampaignIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.campaignId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsProductArticle(boolean z) {
        this.bitField0_ |= 16;
        this.isProductArticle_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.messageId_ = str;
    }

    private void setMessageIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.messageId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPushId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.pushId_ = str;
    }

    private void setPushIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.pushId_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.tileId_ = str;
    }

    private void setTileIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.tileId_ = pVar.m();
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (e5.f146085a[v0Var.ordinal()]) {
            case 1:
                return new InboxMessageMetadataContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "messageId_", "campaignId_", "pushId_", "tileId_", "isProductArticle_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (InboxMessageMetadataContext.class) {
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

    public String getCampaignId() {
        return this.campaignId_;
    }

    public p getCampaignIdBytes() {
        return p.d(this.campaignId_);
    }

    public boolean getIsProductArticle() {
        return this.isProductArticle_;
    }

    public String getMessageId() {
        return this.messageId_;
    }

    public p getMessageIdBytes() {
        return p.d(this.messageId_);
    }

    public String getPushId() {
        return this.pushId_;
    }

    public p getPushIdBytes() {
        return p.d(this.pushId_);
    }

    public String getTileId() {
        return this.tileId_;
    }

    public p getTileIdBytes() {
        return p.d(this.tileId_);
    }

    public boolean hasCampaignId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsProductArticle() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMessageId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPushId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTileId() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(InboxMessageMetadataContext inboxMessageMetadataContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(inboxMessageMetadataContext);
    }

    public static InboxMessageMetadataContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InboxMessageMetadataContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InboxMessageMetadataContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (InboxMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static InboxMessageMetadataContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (InboxMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static InboxMessageMetadataContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (InboxMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static InboxMessageMetadataContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InboxMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InboxMessageMetadataContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (InboxMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static InboxMessageMetadataContext parseFrom(InputStream inputStream) throws IOException {
        return (InboxMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InboxMessageMetadataContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InboxMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InboxMessageMetadataContext parseFrom(t tVar) throws IOException {
        return (InboxMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static InboxMessageMetadataContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (InboxMessageMetadataContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
