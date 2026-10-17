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
import grl.n;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class AirMilesPointsTopUpContext extends w0 implements e2 {
    private static final AirMilesPointsTopUpContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PARTNERNAME_FIELD_NUMBER = 2;
    public static final int RESULTID_FIELD_NUMBER = 1;
    public static final int TOPUPID_FIELD_NUMBER = 3;
    private int bitField0_;
    private String resultId_ = "";
    private String partnerName_ = "";
    private String topUpId_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(AirMilesPointsTopUpContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AirMilesPointsTopUpContext airMilesPointsTopUpContext = new AirMilesPointsTopUpContext();
        DEFAULT_INSTANCE = airMilesPointsTopUpContext;
        w0.registerDefaultInstance(AirMilesPointsTopUpContext.class, airMilesPointsTopUpContext);
    }

    private AirMilesPointsTopUpContext() {
    }

    private void clearPartnerName() {
        this.bitField0_ &= -3;
        this.partnerName_ = getDefaultInstance().getPartnerName();
    }

    private void clearResultId() {
        this.bitField0_ &= -2;
        this.resultId_ = getDefaultInstance().getResultId();
    }

    private void clearTopUpId() {
        this.bitField0_ &= -5;
        this.topUpId_ = getDefaultInstance().getTopUpId();
    }

    public static AirMilesPointsTopUpContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static AirMilesPointsTopUpContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AirMilesPointsTopUpContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AirMilesPointsTopUpContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AirMilesPointsTopUpContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartnerName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.partnerName_ = str;
    }

    private void setPartnerNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.partnerName_ = pVar.m();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTopUpId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.topUpId_ = str;
    }

    private void setTopUpIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.topUpId_ = pVar.m();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (n.f146146a[v0Var.ordinal()]) {
            case 1:
                return new AirMilesPointsTopUpContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "resultId_", "partnerName_", "topUpId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AirMilesPointsTopUpContext.class) {
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

    public String getPartnerName() {
        return this.partnerName_;
    }

    public p getPartnerNameBytes() {
        return p.d(this.partnerName_);
    }

    public String getResultId() {
        return this.resultId_;
    }

    public p getResultIdBytes() {
        return p.d(this.resultId_);
    }

    public String getTopUpId() {
        return this.topUpId_;
    }

    public p getTopUpIdBytes() {
        return p.d(this.topUpId_);
    }

    public boolean hasPartnerName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasResultId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTopUpId() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(AirMilesPointsTopUpContext airMilesPointsTopUpContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(airMilesPointsTopUpContext);
    }

    public static AirMilesPointsTopUpContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AirMilesPointsTopUpContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AirMilesPointsTopUpContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AirMilesPointsTopUpContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AirMilesPointsTopUpContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AirMilesPointsTopUpContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AirMilesPointsTopUpContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AirMilesPointsTopUpContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AirMilesPointsTopUpContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AirMilesPointsTopUpContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AirMilesPointsTopUpContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AirMilesPointsTopUpContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AirMilesPointsTopUpContext parseFrom(InputStream inputStream) throws IOException {
        return (AirMilesPointsTopUpContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AirMilesPointsTopUpContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AirMilesPointsTopUpContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AirMilesPointsTopUpContext parseFrom(t tVar) throws IOException {
        return (AirMilesPointsTopUpContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AirMilesPointsTopUpContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AirMilesPointsTopUpContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
