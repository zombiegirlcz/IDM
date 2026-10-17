package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import grl.rd;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class TravelMilesFlightSearchResultContext extends w0 implements e2 {
    public static final int APPLIED_FILTERS_FIELD_NUMBER = 3;
    private static final TravelMilesFlightSearchResultContext DEFAULT_INSTANCE;
    public static final int FLIGHTS_COUNT_FIELD_NUMBER = 1;
    public static final int HAS_MORE_PAGES_FIELD_NUMBER = 2;
    private static volatile m2 PARSER;
    private h3 appliedFilters_;
    private int bitField0_;
    private int flightsCount_;
    private boolean hasMorePages_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(TravelMilesFlightSearchResultContext.DEFAULT_INSTANCE);
        }
    }

    static {
        TravelMilesFlightSearchResultContext travelMilesFlightSearchResultContext = new TravelMilesFlightSearchResultContext();
        DEFAULT_INSTANCE = travelMilesFlightSearchResultContext;
        w0.registerDefaultInstance(TravelMilesFlightSearchResultContext.class, travelMilesFlightSearchResultContext);
    }

    private TravelMilesFlightSearchResultContext() {
    }

    private void clearAppliedFilters() {
        this.appliedFilters_ = null;
        this.bitField0_ &= -5;
    }

    private void clearFlightsCount() {
        this.bitField0_ &= -2;
        this.flightsCount_ = 0;
    }

    private void clearHasMorePages() {
        this.bitField0_ &= -3;
        this.hasMorePages_ = false;
    }

    public static TravelMilesFlightSearchResultContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAppliedFilters(h3 h3Var) {
        h3Var.getClass();
        h3 h3Var2 = this.appliedFilters_;
        if (h3Var2 == null || h3Var2 == h3.getDefaultInstance()) {
            this.appliedFilters_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder(this.appliedFilters_);
            f3VarNewBuilder.f(h3Var);
            this.appliedFilters_ = (h3) f3VarNewBuilder.b();
        }
        this.bitField0_ |= 4;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static TravelMilesFlightSearchResultContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TravelMilesFlightSearchResultContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TravelMilesFlightSearchResultContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TravelMilesFlightSearchResultContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppliedFilters(h3 h3Var) {
        h3Var.getClass();
        this.appliedFilters_ = h3Var;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlightsCount(int i) {
        this.bitField0_ |= 1;
        this.flightsCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasMorePages(boolean z) {
        this.bitField0_ |= 2;
        this.hasMorePages_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (rd.f146195a[v0Var.ordinal()]) {
            case 1:
                return new TravelMilesFlightSearchResultContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "flightsCount_", "hasMorePages_", "appliedFilters_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (TravelMilesFlightSearchResultContext.class) {
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

    public h3 getAppliedFilters() {
        h3 h3Var = this.appliedFilters_;
        return h3Var == null ? h3.getDefaultInstance() : h3Var;
    }

    public int getFlightsCount() {
        return this.flightsCount_;
    }

    public boolean getHasMorePages() {
        return this.hasMorePages_;
    }

    public boolean hasAppliedFilters() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFlightsCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHasMorePages() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(TravelMilesFlightSearchResultContext travelMilesFlightSearchResultContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(travelMilesFlightSearchResultContext);
    }

    public static TravelMilesFlightSearchResultContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (TravelMilesFlightSearchResultContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static TravelMilesFlightSearchResultContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (TravelMilesFlightSearchResultContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static TravelMilesFlightSearchResultContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (TravelMilesFlightSearchResultContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static TravelMilesFlightSearchResultContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (TravelMilesFlightSearchResultContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static TravelMilesFlightSearchResultContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TravelMilesFlightSearchResultContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TravelMilesFlightSearchResultContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (TravelMilesFlightSearchResultContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static TravelMilesFlightSearchResultContext parseFrom(InputStream inputStream) throws IOException {
        return (TravelMilesFlightSearchResultContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TravelMilesFlightSearchResultContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (TravelMilesFlightSearchResultContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static TravelMilesFlightSearchResultContext parseFrom(t tVar) throws IOException {
        return (TravelMilesFlightSearchResultContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static TravelMilesFlightSearchResultContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (TravelMilesFlightSearchResultContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
