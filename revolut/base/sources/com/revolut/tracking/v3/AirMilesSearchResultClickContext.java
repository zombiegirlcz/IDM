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
import grl.o;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class AirMilesSearchResultClickContext extends w0 implements e2 {
    public static final int AIRLINES_FIELD_NUMBER = 2;
    private static final AirMilesSearchResultClickContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PARTNER_FIELD_NUMBER = 3;
    public static final int RESULTID_FIELD_NUMBER = 1;
    private int bitField0_;
    private y1 airlines_ = y1.f49836b;
    private String resultId_ = "";
    private String partner_ = "";

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x1 f106781a = new x1(k4.INT32, 0, k4.STRING, "");

        private a() {
        }
    }

    public static final class b extends p0 implements e2 {
        public /* synthetic */ b(int i) {
            this();
        }

        private b() {
            super(AirMilesSearchResultClickContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AirMilesSearchResultClickContext airMilesSearchResultClickContext = new AirMilesSearchResultClickContext();
        DEFAULT_INSTANCE = airMilesSearchResultClickContext;
        w0.registerDefaultInstance(AirMilesSearchResultClickContext.class, airMilesSearchResultClickContext);
    }

    private AirMilesSearchResultClickContext() {
    }

    private void clearPartner() {
        this.bitField0_ &= -3;
        this.partner_ = getDefaultInstance().getPartner();
    }

    private void clearResultId() {
        this.bitField0_ &= -2;
        this.resultId_ = getDefaultInstance().getResultId();
    }

    public static AirMilesSearchResultClickContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, String> getMutableAirlinesMap() {
        return internalGetMutableAirlines();
    }

    private y1 internalGetAirlines() {
        return this.airlines_;
    }

    private y1 internalGetMutableAirlines() {
        y1 y1Var = this.airlines_;
        if (!y1Var.f49837a) {
            this.airlines_ = y1Var.c();
        }
        return this.airlines_;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AirMilesSearchResultClickContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AirMilesSearchResultClickContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AirMilesSearchResultClickContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AirMilesSearchResultClickContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartner(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.partner_ = str;
    }

    private void setPartnerBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.partner_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResultId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.resultId_ = str;
    }

    private void setResultIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.resultId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    public boolean containsAirlines(int i) {
        return internalGetAirlines().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (o.f146154a[v0Var.ordinal()]) {
            case 1:
                return new AirMilesSearchResultClickContext();
            case 2:
                return new b(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ለ\u0000\u00022\u0003ለ\u0001", new Object[]{"bitField0_", "resultId_", "airlines_", a.f106781a, "partner_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AirMilesSearchResultClickContext.class) {
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

    @Deprecated
    public Map<Integer, String> getAirlines() {
        return getAirlinesMap();
    }

    public int getAirlinesCount() {
        return internalGetAirlines().size();
    }

    public Map<Integer, String> getAirlinesMap() {
        return Collections.unmodifiableMap(internalGetAirlines());
    }

    public String getAirlinesOrDefault(int i, String str) {
        y1 y1VarInternalGetAirlines = internalGetAirlines();
        return y1VarInternalGetAirlines.containsKey(Integer.valueOf(i)) ? (String) y1VarInternalGetAirlines.get(Integer.valueOf(i)) : str;
    }

    public String getAirlinesOrThrow(int i) {
        y1 y1VarInternalGetAirlines = internalGetAirlines();
        if (y1VarInternalGetAirlines.containsKey(Integer.valueOf(i))) {
            return (String) y1VarInternalGetAirlines.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public String getPartner() {
        return this.partner_;
    }

    public p getPartnerBytes() {
        return p.d(this.partner_);
    }

    public String getResultId() {
        return this.resultId_;
    }

    public p getResultIdBytes() {
        return p.d(this.resultId_);
    }

    public boolean hasPartner() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasResultId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(AirMilesSearchResultClickContext airMilesSearchResultClickContext) {
        return (b) DEFAULT_INSTANCE.createBuilder(airMilesSearchResultClickContext);
    }

    public static AirMilesSearchResultClickContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AirMilesSearchResultClickContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AirMilesSearchResultClickContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AirMilesSearchResultClickContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AirMilesSearchResultClickContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AirMilesSearchResultClickContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AirMilesSearchResultClickContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AirMilesSearchResultClickContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AirMilesSearchResultClickContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AirMilesSearchResultClickContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AirMilesSearchResultClickContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AirMilesSearchResultClickContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AirMilesSearchResultClickContext parseFrom(InputStream inputStream) throws IOException {
        return (AirMilesSearchResultClickContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AirMilesSearchResultClickContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AirMilesSearchResultClickContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AirMilesSearchResultClickContext parseFrom(t tVar) throws IOException {
        return (AirMilesSearchResultClickContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AirMilesSearchResultClickContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AirMilesSearchResultClickContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
