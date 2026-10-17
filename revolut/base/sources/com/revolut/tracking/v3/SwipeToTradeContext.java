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
import grl.hd;
import grl.id;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class SwipeToTradeContext extends w0 implements e2 {
    public static final int ASSET_ID_FIELD_NUMBER = 1;
    public static final int ASSET_TYPE_FIELD_NUMBER = 2;
    private static final SwipeToTradeContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER;
    private String assetId_ = "";
    private int assetType_;
    private int bitField0_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((SwipeToTradeContext) this.f49761b).setAssetId(str);
        }

        public final void i(hd hdVar) {
            c();
            ((SwipeToTradeContext) this.f49761b).setAssetType(hdVar);
        }

        private a() {
            super(SwipeToTradeContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SwipeToTradeContext swipeToTradeContext = new SwipeToTradeContext();
        DEFAULT_INSTANCE = swipeToTradeContext;
        w0.registerDefaultInstance(SwipeToTradeContext.class, swipeToTradeContext);
    }

    private SwipeToTradeContext() {
    }

    private void clearAssetId() {
        this.bitField0_ &= -2;
        this.assetId_ = getDefaultInstance().getAssetId();
    }

    private void clearAssetType() {
        this.bitField0_ &= -3;
        this.assetType_ = 0;
    }

    public static SwipeToTradeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SwipeToTradeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SwipeToTradeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwipeToTradeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SwipeToTradeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssetId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.assetId_ = str;
    }

    private void setAssetIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.assetId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAssetType(hd hdVar) {
        this.assetType_ = hdVar.getNumber();
        this.bitField0_ |= 2;
    }

    private void setAssetTypeValue(int i) {
        this.bitField0_ |= 2;
        this.assetType_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (id.f146114a[v0Var.ordinal()]) {
            case 1:
                return new SwipeToTradeContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "assetId_", "assetType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SwipeToTradeContext.class) {
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

    public String getAssetId() {
        return this.assetId_;
    }

    public p getAssetIdBytes() {
        return p.d(this.assetId_);
    }

    public hd getAssetType() {
        hd hdVarA = hd.a(this.assetType_);
        return hdVarA == null ? hd.UNRECOGNIZED : hdVarA;
    }

    public int getAssetTypeValue() {
        return this.assetType_;
    }

    public boolean hasAssetId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAssetType() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(SwipeToTradeContext swipeToTradeContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(swipeToTradeContext);
    }

    public static SwipeToTradeContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SwipeToTradeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SwipeToTradeContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SwipeToTradeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SwipeToTradeContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SwipeToTradeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SwipeToTradeContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SwipeToTradeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SwipeToTradeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SwipeToTradeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SwipeToTradeContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SwipeToTradeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SwipeToTradeContext parseFrom(InputStream inputStream) throws IOException {
        return (SwipeToTradeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SwipeToTradeContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SwipeToTradeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SwipeToTradeContext parseFrom(t tVar) throws IOException {
        return (SwipeToTradeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SwipeToTradeContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SwipeToTradeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
