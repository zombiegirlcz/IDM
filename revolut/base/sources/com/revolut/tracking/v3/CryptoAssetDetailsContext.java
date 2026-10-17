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
import grl.t2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class CryptoAssetDetailsContext extends w0 implements e2 {
    public static final int CURRENCY_FIELD_NUMBER = 1;
    private static final CryptoAssetDetailsContext DEFAULT_INSTANCE;
    public static final int DISPLAYCURRENCY_FIELD_NUMBER = 2;
    public static final int HOLDING_BALANCE_FIELD_NUMBER = 3;
    public static final int IN_PRICE_ALERT_FIELD_NUMBER = 6;
    public static final int IN_WATCHLIST_FIELD_NUMBER = 5;
    private static volatile m2 PARSER = null;
    public static final int STAKING_BALANCE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String currency_ = "";
    private String displayCurrency_ = "";
    private boolean holdingBalance_;
    private boolean inPriceAlert_;
    private boolean inWatchlist_;
    private boolean stakingBalance_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CryptoAssetDetailsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        CryptoAssetDetailsContext cryptoAssetDetailsContext = new CryptoAssetDetailsContext();
        DEFAULT_INSTANCE = cryptoAssetDetailsContext;
        w0.registerDefaultInstance(CryptoAssetDetailsContext.class, cryptoAssetDetailsContext);
    }

    private CryptoAssetDetailsContext() {
    }

    private void clearCurrency() {
        this.bitField0_ &= -2;
        this.currency_ = getDefaultInstance().getCurrency();
    }

    private void clearDisplayCurrency() {
        this.bitField0_ &= -3;
        this.displayCurrency_ = getDefaultInstance().getDisplayCurrency();
    }

    private void clearHoldingBalance() {
        this.bitField0_ &= -5;
        this.holdingBalance_ = false;
    }

    private void clearInPriceAlert() {
        this.bitField0_ &= -33;
        this.inPriceAlert_ = false;
    }

    private void clearInWatchlist() {
        this.bitField0_ &= -17;
        this.inWatchlist_ = false;
    }

    private void clearStakingBalance() {
        this.bitField0_ &= -9;
        this.stakingBalance_ = false;
    }

    public static CryptoAssetDetailsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CryptoAssetDetailsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CryptoAssetDetailsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CryptoAssetDetailsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CryptoAssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrency(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.currency_ = str;
    }

    private void setCurrencyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.currency_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayCurrency(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.displayCurrency_ = str;
    }

    private void setDisplayCurrencyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.displayCurrency_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHoldingBalance(boolean z) {
        this.bitField0_ |= 4;
        this.holdingBalance_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInPriceAlert(boolean z) {
        this.bitField0_ |= 32;
        this.inPriceAlert_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInWatchlist(boolean z) {
        this.bitField0_ |= 16;
        this.inWatchlist_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStakingBalance(boolean z) {
        this.bitField0_ |= 8;
        this.stakingBalance_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (t2.f146206a[v0Var.ordinal()]) {
            case 1:
                return new CryptoAssetDetailsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "currency_", "displayCurrency_", "holdingBalance_", "stakingBalance_", "inWatchlist_", "inPriceAlert_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CryptoAssetDetailsContext.class) {
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

    public String getCurrency() {
        return this.currency_;
    }

    public p getCurrencyBytes() {
        return p.d(this.currency_);
    }

    public String getDisplayCurrency() {
        return this.displayCurrency_;
    }

    public p getDisplayCurrencyBytes() {
        return p.d(this.displayCurrency_);
    }

    public boolean getHoldingBalance() {
        return this.holdingBalance_;
    }

    public boolean getInPriceAlert() {
        return this.inPriceAlert_;
    }

    public boolean getInWatchlist() {
        return this.inWatchlist_;
    }

    public boolean getStakingBalance() {
        return this.stakingBalance_;
    }

    public boolean hasCurrency() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDisplayCurrency() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHoldingBalance() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasInPriceAlert() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasInWatchlist() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasStakingBalance() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(CryptoAssetDetailsContext cryptoAssetDetailsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(cryptoAssetDetailsContext);
    }

    public static CryptoAssetDetailsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CryptoAssetDetailsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CryptoAssetDetailsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CryptoAssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CryptoAssetDetailsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CryptoAssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CryptoAssetDetailsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CryptoAssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CryptoAssetDetailsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CryptoAssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CryptoAssetDetailsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CryptoAssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CryptoAssetDetailsContext parseFrom(InputStream inputStream) throws IOException {
        return (CryptoAssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CryptoAssetDetailsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CryptoAssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CryptoAssetDetailsContext parseFrom(t tVar) throws IOException {
        return (CryptoAssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CryptoAssetDetailsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CryptoAssetDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
