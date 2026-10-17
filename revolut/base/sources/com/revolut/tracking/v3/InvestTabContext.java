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
import grl.fe;
import grl.he;
import grl.i6;
import grl.k6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class InvestTabContext extends w0 implements e2 {
    public static final int CFD_STATUS_FIELD_NUMBER = 7;
    public static final int COMMODITIES_STATUS_FIELD_NUMBER = 2;
    private static final InvestTabContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PENDING_ORDERS_FIELD_NUMBER = 4;
    public static final int PNL_FIELD_NUMBER = 5;
    public static final int ROBO_STATUS_FIELD_NUMBER = 3;
    public static final int STOCKS_STATUS_FIELD_NUMBER = 1;
    public static final int TAB_FIELD_NUMBER = 6;
    private int bitField0_;
    private int cfdStatus_;
    private int commoditiesStatus_;
    private boolean pendingOrders_;
    private int pnl_;
    private int roboStatus_;
    private int stocksStatus_;
    private int tab_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(InvestTabContext.DEFAULT_INSTANCE);
        }
    }

    static {
        InvestTabContext investTabContext = new InvestTabContext();
        DEFAULT_INSTANCE = investTabContext;
        w0.registerDefaultInstance(InvestTabContext.class, investTabContext);
    }

    private InvestTabContext() {
    }

    private void clearCfdStatus() {
        this.bitField0_ &= -65;
        this.cfdStatus_ = 0;
    }

    private void clearCommoditiesStatus() {
        this.bitField0_ &= -3;
        this.commoditiesStatus_ = 0;
    }

    private void clearPendingOrders() {
        this.bitField0_ &= -9;
        this.pendingOrders_ = false;
    }

    private void clearPnl() {
        this.bitField0_ &= -17;
        this.pnl_ = 0;
    }

    private void clearRoboStatus() {
        this.bitField0_ &= -5;
        this.roboStatus_ = 0;
    }

    private void clearStocksStatus() {
        this.bitField0_ &= -2;
        this.stocksStatus_ = 0;
    }

    private void clearTab() {
        this.bitField0_ &= -33;
        this.tab_ = 0;
    }

    public static InvestTabContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static InvestTabContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InvestTabContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestTabContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InvestTabContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCfdStatus(he heVar) {
        this.cfdStatus_ = heVar.getNumber();
        this.bitField0_ |= 64;
    }

    private void setCfdStatusValue(int i) {
        this.bitField0_ |= 64;
        this.cfdStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommoditiesStatus(he heVar) {
        this.commoditiesStatus_ = heVar.getNumber();
        this.bitField0_ |= 2;
    }

    private void setCommoditiesStatusValue(int i) {
        this.bitField0_ |= 2;
        this.commoditiesStatus_ = i;
    }

    private void setPendingOrders(boolean z) {
        this.bitField0_ |= 8;
        this.pendingOrders_ = z;
    }

    private void setPnl(fe feVar) {
        this.pnl_ = feVar.getNumber();
        this.bitField0_ |= 16;
    }

    private void setPnlValue(int i) {
        this.bitField0_ |= 16;
        this.pnl_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoboStatus(he heVar) {
        this.roboStatus_ = heVar.getNumber();
        this.bitField0_ |= 4;
    }

    private void setRoboStatusValue(int i) {
        this.bitField0_ |= 4;
        this.roboStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStocksStatus(he heVar) {
        this.stocksStatus_ = heVar.getNumber();
        this.bitField0_ |= 1;
    }

    private void setStocksStatusValue(int i) {
        this.bitField0_ |= 1;
        this.stocksStatus_ = i;
    }

    private void setTab(k6 k6Var) {
        this.tab_ = k6Var.getNumber();
        this.bitField0_ |= 32;
    }

    private void setTabValue(int i) {
        this.bitField0_ |= 32;
        this.tab_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (i6.f146110a[v0Var.ordinal()]) {
            case 1:
                return new InvestTabContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"bitField0_", "stocksStatus_", "commoditiesStatus_", "roboStatus_", "pendingOrders_", "pnl_", "tab_", "cfdStatus_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (InvestTabContext.class) {
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

    public he getCfdStatus() {
        he heVarA = he.a(this.cfdStatus_);
        return heVarA == null ? he.UNRECOGNIZED : heVarA;
    }

    public int getCfdStatusValue() {
        return this.cfdStatus_;
    }

    public he getCommoditiesStatus() {
        he heVarA = he.a(this.commoditiesStatus_);
        return heVarA == null ? he.UNRECOGNIZED : heVarA;
    }

    public int getCommoditiesStatusValue() {
        return this.commoditiesStatus_;
    }

    public boolean getPendingOrders() {
        return this.pendingOrders_;
    }

    public fe getPnl() {
        fe feVarA = fe.a(this.pnl_);
        return feVarA == null ? fe.UNRECOGNIZED : feVarA;
    }

    public int getPnlValue() {
        return this.pnl_;
    }

    public he getRoboStatus() {
        he heVarA = he.a(this.roboStatus_);
        return heVarA == null ? he.UNRECOGNIZED : heVarA;
    }

    public int getRoboStatusValue() {
        return this.roboStatus_;
    }

    public he getStocksStatus() {
        he heVarA = he.a(this.stocksStatus_);
        return heVarA == null ? he.UNRECOGNIZED : heVarA;
    }

    public int getStocksStatusValue() {
        return this.stocksStatus_;
    }

    public k6 getTab() {
        k6 k6VarA = k6.a(this.tab_);
        return k6VarA == null ? k6.UNRECOGNIZED : k6VarA;
    }

    public int getTabValue() {
        return this.tab_;
    }

    public boolean hasCfdStatus() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCommoditiesStatus() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPendingOrders() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPnl() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRoboStatus() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasStocksStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTab() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(InvestTabContext investTabContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(investTabContext);
    }

    public static InvestTabContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestTabContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestTabContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestTabContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static InvestTabContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (InvestTabContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static InvestTabContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestTabContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static InvestTabContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InvestTabContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InvestTabContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestTabContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static InvestTabContext parseFrom(InputStream inputStream) throws IOException {
        return (InvestTabContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestTabContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestTabContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestTabContext parseFrom(t tVar) throws IOException {
        return (InvestTabContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static InvestTabContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (InvestTabContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
