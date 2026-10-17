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
import grl.g0;
import grl.i2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class CommoditiesSourceContext extends w0 implements e2 {
    private static final CommoditiesSourceContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int source_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CommoditiesSourceContext.DEFAULT_INSTANCE);
        }
    }

    static {
        CommoditiesSourceContext commoditiesSourceContext = new CommoditiesSourceContext();
        DEFAULT_INSTANCE = commoditiesSourceContext;
        w0.registerDefaultInstance(CommoditiesSourceContext.class, commoditiesSourceContext);
    }

    private CommoditiesSourceContext() {
    }

    private void clearSource() {
        this.bitField0_ &= -2;
        this.source_ = 0;
    }

    public static CommoditiesSourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CommoditiesSourceContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommoditiesSourceContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommoditiesSourceContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommoditiesSourceContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setSource(g0 g0Var) {
        this.source_ = g0Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setSourceValue(int i) {
        this.bitField0_ |= 1;
        this.source_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (i2.f146107a[v0Var.ordinal()]) {
            case 1:
                return new CommoditiesSourceContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "source_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CommoditiesSourceContext.class) {
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

    public g0 getSource() {
        g0 g0VarA = g0.a(this.source_);
        return g0VarA == null ? g0.UNRECOGNIZED : g0VarA;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(CommoditiesSourceContext commoditiesSourceContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(commoditiesSourceContext);
    }

    public static CommoditiesSourceContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CommoditiesSourceContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CommoditiesSourceContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CommoditiesSourceContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CommoditiesSourceContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CommoditiesSourceContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CommoditiesSourceContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CommoditiesSourceContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CommoditiesSourceContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommoditiesSourceContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommoditiesSourceContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CommoditiesSourceContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CommoditiesSourceContext parseFrom(InputStream inputStream) throws IOException {
        return (CommoditiesSourceContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommoditiesSourceContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CommoditiesSourceContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CommoditiesSourceContext parseFrom(t tVar) throws IOException {
        return (CommoditiesSourceContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CommoditiesSourceContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CommoditiesSourceContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
