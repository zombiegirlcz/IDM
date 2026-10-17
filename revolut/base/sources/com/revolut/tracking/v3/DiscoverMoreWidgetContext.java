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
import grl.k3;
import grl.m3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class DiscoverMoreWidgetContext extends w0 implements e2 {
    public static final int ALL_ITEM_IDS_FIELD_NUMBER = 4;
    private static final DiscoverMoreWidgetContext DEFAULT_INSTANCE;
    public static final int IS_FIRST_IMPRESSION_FIELD_NUMBER = 2;
    public static final int ITEM_ID_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isFirstImpression_;
    private int state_;
    private String itemId_ = "";
    private String allItemIds_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(DiscoverMoreWidgetContext.DEFAULT_INSTANCE);
        }
    }

    static {
        DiscoverMoreWidgetContext discoverMoreWidgetContext = new DiscoverMoreWidgetContext();
        DEFAULT_INSTANCE = discoverMoreWidgetContext;
        w0.registerDefaultInstance(DiscoverMoreWidgetContext.class, discoverMoreWidgetContext);
    }

    private DiscoverMoreWidgetContext() {
    }

    private void clearAllItemIds() {
        this.bitField0_ &= -9;
        this.allItemIds_ = getDefaultInstance().getAllItemIds();
    }

    private void clearIsFirstImpression() {
        this.bitField0_ &= -3;
        this.isFirstImpression_ = false;
    }

    private void clearItemId() {
        this.bitField0_ &= -5;
        this.itemId_ = getDefaultInstance().getItemId();
    }

    private void clearState() {
        this.bitField0_ &= -2;
        this.state_ = 0;
    }

    public static DiscoverMoreWidgetContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DiscoverMoreWidgetContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DiscoverMoreWidgetContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DiscoverMoreWidgetContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DiscoverMoreWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllItemIds(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.allItemIds_ = str;
    }

    private void setAllItemIdsBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.allItemIds_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFirstImpression(boolean z) {
        this.bitField0_ |= 2;
        this.isFirstImpression_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setItemId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.itemId_ = str;
    }

    private void setItemIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.itemId_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(m3 m3Var) {
        this.state_ = m3Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setStateValue(int i) {
        this.bitField0_ |= 1;
        this.state_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (k3.f146125a[v0Var.ordinal()]) {
            case 1:
                return new DiscoverMoreWidgetContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "state_", "isFirstImpression_", "itemId_", "allItemIds_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (DiscoverMoreWidgetContext.class) {
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

    public String getAllItemIds() {
        return this.allItemIds_;
    }

    public p getAllItemIdsBytes() {
        return p.d(this.allItemIds_);
    }

    public boolean getIsFirstImpression() {
        return this.isFirstImpression_;
    }

    public String getItemId() {
        return this.itemId_;
    }

    public p getItemIdBytes() {
        return p.d(this.itemId_);
    }

    public m3 getState() {
        int i = this.state_;
        m3 m3Var = i != 0 ? i != 1 ? null : m3.ERROR : m3.LOADED;
        return m3Var == null ? m3.UNRECOGNIZED : m3Var;
    }

    public int getStateValue() {
        return this.state_;
    }

    public boolean hasAllItemIds() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsFirstImpression() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasItemId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasState() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(DiscoverMoreWidgetContext discoverMoreWidgetContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(discoverMoreWidgetContext);
    }

    public static DiscoverMoreWidgetContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (DiscoverMoreWidgetContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static DiscoverMoreWidgetContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (DiscoverMoreWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static DiscoverMoreWidgetContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (DiscoverMoreWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static DiscoverMoreWidgetContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (DiscoverMoreWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static DiscoverMoreWidgetContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DiscoverMoreWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DiscoverMoreWidgetContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (DiscoverMoreWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static DiscoverMoreWidgetContext parseFrom(InputStream inputStream) throws IOException {
        return (DiscoverMoreWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DiscoverMoreWidgetContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (DiscoverMoreWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static DiscoverMoreWidgetContext parseFrom(t tVar) throws IOException {
        return (DiscoverMoreWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static DiscoverMoreWidgetContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (DiscoverMoreWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
