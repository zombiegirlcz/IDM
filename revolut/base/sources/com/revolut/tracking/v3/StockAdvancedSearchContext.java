package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.k4;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import com.google.protobuf.x1;
import com.google.protobuf.y1;
import grl.bd;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class StockAdvancedSearchContext extends w0 implements e2 {
    private static final StockAdvancedSearchContext DEFAULT_INSTANCE;
    public static final int DIVIDEND_YIELD_FIELD_NUMBER = 2;
    public static final int MARKET_CAP_FIELD_NUMBER = 5;
    private static volatile m2 PARSER = null;
    public static final int PE_RATIO_FIELD_NUMBER = 1;
    public static final int SECTORS_FIELD_NUMBER = 4;
    public static final int Y_STOCK_PRICE_CHANGE_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean dividendYield_;
    private y1 marketCap_;
    private boolean peRatio_;
    private y1 sectors_;
    private boolean yStockPriceChange_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(StockAdvancedSearchContext.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x1 f106786a = new x1(k4.INT32, 0, k4.STRING, "");

        private b() {
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x1 f106787a = new x1(k4.INT32, 0, k4.STRING, "");

        private c() {
        }
    }

    static {
        StockAdvancedSearchContext stockAdvancedSearchContext = new StockAdvancedSearchContext();
        DEFAULT_INSTANCE = stockAdvancedSearchContext;
        w0.registerDefaultInstance(StockAdvancedSearchContext.class, stockAdvancedSearchContext);
    }

    private StockAdvancedSearchContext() {
        y1 y1Var = y1.f49836b;
        this.sectors_ = y1Var;
        this.marketCap_ = y1Var;
    }

    private void clearDividendYield() {
        this.bitField0_ &= -3;
        this.dividendYield_ = false;
    }

    private void clearPeRatio() {
        this.bitField0_ &= -2;
        this.peRatio_ = false;
    }

    private void clearYStockPriceChange() {
        this.bitField0_ &= -5;
        this.yStockPriceChange_ = false;
    }

    public static StockAdvancedSearchContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<Integer, String> getMutableMarketCapMap() {
        return internalGetMutableMarketCap();
    }

    private Map<Integer, String> getMutableSectorsMap() {
        return internalGetMutableSectors();
    }

    private y1 internalGetMarketCap() {
        return this.marketCap_;
    }

    private y1 internalGetMutableMarketCap() {
        y1 y1Var = this.marketCap_;
        if (!y1Var.f49837a) {
            this.marketCap_ = y1Var.c();
        }
        return this.marketCap_;
    }

    private y1 internalGetMutableSectors() {
        y1 y1Var = this.sectors_;
        if (!y1Var.f49837a) {
            this.sectors_ = y1Var.c();
        }
        return this.sectors_;
    }

    private y1 internalGetSectors() {
        return this.sectors_;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static StockAdvancedSearchContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StockAdvancedSearchContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StockAdvancedSearchContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StockAdvancedSearchContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDividendYield(boolean z) {
        this.bitField0_ |= 2;
        this.dividendYield_ = z;
    }

    private void setPeRatio(boolean z) {
        this.bitField0_ |= 1;
        this.peRatio_ = z;
    }

    private void setYStockPriceChange(boolean z) {
        this.bitField0_ |= 4;
        this.yStockPriceChange_ = z;
    }

    public boolean containsMarketCap(int i) {
        return internalGetMarketCap().containsKey(Integer.valueOf(i));
    }

    public boolean containsSectors(int i) {
        return internalGetSectors().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (bd.f146067a[v0Var.ordinal()]) {
            case 1:
                return new StockAdvancedSearchContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0002\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u00042\u00052", new Object[]{"bitField0_", "peRatio_", "dividendYield_", "yStockPriceChange_", "sectors_", c.f106787a, "marketCap_", b.f106786a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (StockAdvancedSearchContext.class) {
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

    public boolean getDividendYield() {
        return this.dividendYield_;
    }

    @Deprecated
    public Map<Integer, String> getMarketCap() {
        return getMarketCapMap();
    }

    public int getMarketCapCount() {
        return internalGetMarketCap().size();
    }

    public Map<Integer, String> getMarketCapMap() {
        return Collections.unmodifiableMap(internalGetMarketCap());
    }

    public String getMarketCapOrDefault(int i, String str) {
        y1 y1VarInternalGetMarketCap = internalGetMarketCap();
        return y1VarInternalGetMarketCap.containsKey(Integer.valueOf(i)) ? (String) y1VarInternalGetMarketCap.get(Integer.valueOf(i)) : str;
    }

    public String getMarketCapOrThrow(int i) {
        y1 y1VarInternalGetMarketCap = internalGetMarketCap();
        if (y1VarInternalGetMarketCap.containsKey(Integer.valueOf(i))) {
            return (String) y1VarInternalGetMarketCap.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public boolean getPeRatio() {
        return this.peRatio_;
    }

    @Deprecated
    public Map<Integer, String> getSectors() {
        return getSectorsMap();
    }

    public int getSectorsCount() {
        return internalGetSectors().size();
    }

    public Map<Integer, String> getSectorsMap() {
        return Collections.unmodifiableMap(internalGetSectors());
    }

    public String getSectorsOrDefault(int i, String str) {
        y1 y1VarInternalGetSectors = internalGetSectors();
        return y1VarInternalGetSectors.containsKey(Integer.valueOf(i)) ? (String) y1VarInternalGetSectors.get(Integer.valueOf(i)) : str;
    }

    public String getSectorsOrThrow(int i) {
        y1 y1VarInternalGetSectors = internalGetSectors();
        if (y1VarInternalGetSectors.containsKey(Integer.valueOf(i))) {
            return (String) y1VarInternalGetSectors.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public boolean getYStockPriceChange() {
        return this.yStockPriceChange_;
    }

    public boolean hasDividendYield() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPeRatio() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasYStockPriceChange() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(StockAdvancedSearchContext stockAdvancedSearchContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(stockAdvancedSearchContext);
    }

    public static StockAdvancedSearchContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (StockAdvancedSearchContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static StockAdvancedSearchContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (StockAdvancedSearchContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static StockAdvancedSearchContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (StockAdvancedSearchContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static StockAdvancedSearchContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (StockAdvancedSearchContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static StockAdvancedSearchContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StockAdvancedSearchContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StockAdvancedSearchContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (StockAdvancedSearchContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static StockAdvancedSearchContext parseFrom(InputStream inputStream) throws IOException {
        return (StockAdvancedSearchContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StockAdvancedSearchContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (StockAdvancedSearchContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static StockAdvancedSearchContext parseFrom(t tVar) throws IOException {
        return (StockAdvancedSearchContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static StockAdvancedSearchContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (StockAdvancedSearchContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
