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
import grl.k0;
import grl.m0;
import grl.n0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class AssetDetailsContext extends w0 implements e2 {
    public static final int ASSET_TYPE_FIELD_NUMBER = 1;
    private static final AssetDetailsContext DEFAULT_INSTANCE;
    public static final int EXCHANGE_STATUS_FIELD_NUMBER = 3;
    public static final int IN_HOLDINGS_FIELD_NUMBER = 4;
    public static final int IN_PRICE_ALERT_FIELD_NUMBER = 6;
    public static final int IN_WATCHLIST_FIELD_NUMBER = 5;
    private static volatile m2 PARSER = null;
    public static final int PENDING_ORDERS_FIELD_NUMBER = 7;
    public static final int SCREEN_SOURCE_FIELD_NUMBER = 8;
    public static final int SYMBOL_FIELD_NUMBER = 2;
    private int assetType_;
    private int bitField0_;
    private int exchangeStatus_;
    private boolean inHoldings_;
    private boolean inPriceAlert_;
    private boolean inWatchlist_;
    private boolean pendingOrders_;
    private String symbol_ = "";
    private String screenSource_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(AssetDetailsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AssetDetailsContext assetDetailsContext = new AssetDetailsContext();
        DEFAULT_INSTANCE = assetDetailsContext;
        w0.registerDefaultInstance(AssetDetailsContext.class, assetDetailsContext);
    }

    private AssetDetailsContext() {
    }

    private void clearAssetType() {
        this.bitField0_ &= -2;
        this.assetType_ = 0;
    }

    private void clearExchangeStatus() {
        this.bitField0_ &= -5;
        this.exchangeStatus_ = 0;
    }

    private void clearInHoldings() {
        this.bitField0_ &= -9;
        this.inHoldings_ = false;
    }

    private void clearInPriceAlert() {
        this.bitField0_ &= -33;
        this.inPriceAlert_ = false;
    }

    private void clearInWatchlist() {
        this.bitField0_ &= -17;
        this.inWatchlist_ = false;
    }

    private void clearPendingOrders() {
        this.bitField0_ &= -65;
        this.pendingOrders_ = false;
    }

    private void clearScreenSource() {
        this.bitField0_ &= -129;
        this.screenSource_ = getDefaultInstance().getScreenSource();
    }

    private void clearSymbol() {
        this.bitField0_ &= -3;
        this.symbol_ = getDefaultInstance().getSymbol();
    }

    public static AssetDetailsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static AssetDetailsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AssetDetailsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AssetDetailsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAssetType(k0 k0Var) {
        this.assetType_ = k0Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setAssetTypeValue(int i) {
        this.bitField0_ |= 1;
        this.assetType_ = i;
    }

    private void setExchangeStatus(m0 m0Var) {
        this.exchangeStatus_ = m0Var.getNumber();
        this.bitField0_ |= 4;
    }

    private void setExchangeStatusValue(int i) {
        this.bitField0_ |= 4;
        this.exchangeStatus_ = i;
    }

    private void setInHoldings(boolean z) {
        this.bitField0_ |= 8;
        this.inHoldings_ = z;
    }

    private void setInPriceAlert(boolean z) {
        this.bitField0_ |= 32;
        this.inPriceAlert_ = z;
    }

    private void setInWatchlist(boolean z) {
        this.bitField0_ |= 16;
        this.inWatchlist_ = z;
    }

    private void setPendingOrders(boolean z) {
        this.bitField0_ |= 64;
        this.pendingOrders_ = z;
    }

    private void setScreenSource(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.screenSource_ = str;
    }

    private void setScreenSourceBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.screenSource_ = pVar.m();
        this.bitField0_ |= 128;
    }

    private void setSymbol(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.symbol_ = str;
    }

    private void setSymbolBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.symbol_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (n0.f146147a[v0Var.ordinal()]) {
            case 1:
                return new AssetDetailsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bለ\u0007", new Object[]{"bitField0_", "assetType_", "symbol_", "exchangeStatus_", "inHoldings_", "inWatchlist_", "inPriceAlert_", "pendingOrders_", "screenSource_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AssetDetailsContext.class) {
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

    public k0 getAssetType() {
        k0 k0VarA = k0.a(this.assetType_);
        return k0VarA == null ? k0.UNRECOGNIZED : k0VarA;
    }

    public int getAssetTypeValue() {
        return this.assetType_;
    }

    public m0 getExchangeStatus() {
        m0 m0VarA = m0.a(this.exchangeStatus_);
        return m0VarA == null ? m0.UNRECOGNIZED : m0VarA;
    }

    public int getExchangeStatusValue() {
        return this.exchangeStatus_;
    }

    public boolean getInHoldings() {
        return this.inHoldings_;
    }

    public boolean getInPriceAlert() {
        return this.inPriceAlert_;
    }

    public boolean getInWatchlist() {
        return this.inWatchlist_;
    }

    public boolean getPendingOrders() {
        return this.pendingOrders_;
    }

    public String getScreenSource() {
        return this.screenSource_;
    }

    public p getScreenSourceBytes() {
        return p.d(this.screenSource_);
    }

    public String getSymbol() {
        return this.symbol_;
    }

    public p getSymbolBytes() {
        return p.d(this.symbol_);
    }

    public boolean hasAssetType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasExchangeStatus() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasInHoldings() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasInPriceAlert() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasInWatchlist() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPendingOrders() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasScreenSource() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSymbol() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(AssetDetailsContext assetDetailsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(assetDetailsContext);
    }

    public static AssetDetailsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AssetDetailsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AssetDetailsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AssetDetailsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AssetDetailsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AssetDetailsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AssetDetailsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AssetDetailsContext parseFrom(InputStream inputStream) throws IOException {
        return (AssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AssetDetailsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AssetDetailsContext parseFrom(t tVar) throws IOException {
        return (AssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AssetDetailsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
