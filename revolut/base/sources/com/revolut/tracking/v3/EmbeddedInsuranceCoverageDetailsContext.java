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
import grl.z3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class EmbeddedInsuranceCoverageDetailsContext extends w0 implements e2 {
    public static final int COVERAGE_TYPE_FIELD_NUMBER = 1;
    private static final EmbeddedInsuranceCoverageDetailsContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String coverageType_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(EmbeddedInsuranceCoverageDetailsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        EmbeddedInsuranceCoverageDetailsContext embeddedInsuranceCoverageDetailsContext = new EmbeddedInsuranceCoverageDetailsContext();
        DEFAULT_INSTANCE = embeddedInsuranceCoverageDetailsContext;
        w0.registerDefaultInstance(EmbeddedInsuranceCoverageDetailsContext.class, embeddedInsuranceCoverageDetailsContext);
    }

    private EmbeddedInsuranceCoverageDetailsContext() {
    }

    private void clearCoverageType() {
        this.bitField0_ &= -2;
        this.coverageType_ = getDefaultInstance().getCoverageType();
    }

    public static EmbeddedInsuranceCoverageDetailsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCoverageType(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.coverageType_ = str;
    }

    private void setCoverageTypeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.coverageType_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (z3.f146242a[v0Var.ordinal()]) {
            case 1:
                return new EmbeddedInsuranceCoverageDetailsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "coverageType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (EmbeddedInsuranceCoverageDetailsContext.class) {
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

    public String getCoverageType() {
        return this.coverageType_;
    }

    public p getCoverageTypeBytes() {
        return p.d(this.coverageType_);
    }

    public boolean hasCoverageType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(EmbeddedInsuranceCoverageDetailsContext embeddedInsuranceCoverageDetailsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(embeddedInsuranceCoverageDetailsContext);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseFrom(InputStream inputStream) throws IOException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseFrom(t tVar) throws IOException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static EmbeddedInsuranceCoverageDetailsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (EmbeddedInsuranceCoverageDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
