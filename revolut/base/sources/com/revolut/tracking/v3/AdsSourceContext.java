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
import grl.l;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class AdsSourceContext extends w0 implements e2 {
    private static final AdsSourceContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String source_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(AdsSourceContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AdsSourceContext adsSourceContext = new AdsSourceContext();
        DEFAULT_INSTANCE = adsSourceContext;
        w0.registerDefaultInstance(AdsSourceContext.class, adsSourceContext);
    }

    private AdsSourceContext() {
    }

    private void clearSource() {
        this.bitField0_ &= -2;
        this.source_ = getDefaultInstance().getSource();
    }

    public static AdsSourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static AdsSourceContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdsSourceContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdsSourceContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AdsSourceContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.source_ = str;
    }

    private void setSourceBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.source_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (l.f146131a[v0Var.ordinal()]) {
            case 1:
                return new AdsSourceContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "source_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AdsSourceContext.class) {
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

    public String getSource() {
        return this.source_;
    }

    public p getSourceBytes() {
        return p.d(this.source_);
    }

    public boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(AdsSourceContext adsSourceContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(adsSourceContext);
    }

    public static AdsSourceContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AdsSourceContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AdsSourceContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AdsSourceContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AdsSourceContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AdsSourceContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AdsSourceContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AdsSourceContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AdsSourceContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AdsSourceContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AdsSourceContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AdsSourceContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AdsSourceContext parseFrom(InputStream inputStream) throws IOException {
        return (AdsSourceContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AdsSourceContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AdsSourceContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AdsSourceContext parseFrom(t tVar) throws IOException {
        return (AdsSourceContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AdsSourceContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AdsSourceContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
