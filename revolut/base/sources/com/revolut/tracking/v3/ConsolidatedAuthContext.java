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
import grl.j2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class ConsolidatedAuthContext extends w0 implements e2 {
    private static final ConsolidatedAuthContext DEFAULT_INSTANCE;
    public static final int DETECTED_COUNTRY_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String detectedCountry_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(ConsolidatedAuthContext.DEFAULT_INSTANCE);
        }
    }

    static {
        ConsolidatedAuthContext consolidatedAuthContext = new ConsolidatedAuthContext();
        DEFAULT_INSTANCE = consolidatedAuthContext;
        w0.registerDefaultInstance(ConsolidatedAuthContext.class, consolidatedAuthContext);
    }

    private ConsolidatedAuthContext() {
    }

    private void clearDetectedCountry() {
        this.bitField0_ &= -2;
        this.detectedCountry_ = getDefaultInstance().getDetectedCountry();
    }

    public static ConsolidatedAuthContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ConsolidatedAuthContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConsolidatedAuthContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConsolidatedAuthContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ConsolidatedAuthContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetectedCountry(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.detectedCountry_ = str;
    }

    private void setDetectedCountryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.detectedCountry_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (j2.f146116a[v0Var.ordinal()]) {
            case 1:
                return new ConsolidatedAuthContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "detectedCountry_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ConsolidatedAuthContext.class) {
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

    public String getDetectedCountry() {
        return this.detectedCountry_;
    }

    public p getDetectedCountryBytes() {
        return p.d(this.detectedCountry_);
    }

    public boolean hasDetectedCountry() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(ConsolidatedAuthContext consolidatedAuthContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(consolidatedAuthContext);
    }

    public static ConsolidatedAuthContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ConsolidatedAuthContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ConsolidatedAuthContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (ConsolidatedAuthContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ConsolidatedAuthContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ConsolidatedAuthContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ConsolidatedAuthContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (ConsolidatedAuthContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ConsolidatedAuthContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ConsolidatedAuthContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ConsolidatedAuthContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (ConsolidatedAuthContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ConsolidatedAuthContext parseFrom(InputStream inputStream) throws IOException {
        return (ConsolidatedAuthContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ConsolidatedAuthContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ConsolidatedAuthContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ConsolidatedAuthContext parseFrom(t tVar) throws IOException {
        return (ConsolidatedAuthContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ConsolidatedAuthContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (ConsolidatedAuthContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
