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
import grl.l6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class InvestWatchlistContext extends w0 implements e2 {
    private static final InvestWatchlistContext DEFAULT_INSTANCE;
    public static final int NUMBER_ASSETS_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private int numberAssets_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(InvestWatchlistContext.DEFAULT_INSTANCE);
        }
    }

    static {
        InvestWatchlistContext investWatchlistContext = new InvestWatchlistContext();
        DEFAULT_INSTANCE = investWatchlistContext;
        w0.registerDefaultInstance(InvestWatchlistContext.class, investWatchlistContext);
    }

    private InvestWatchlistContext() {
    }

    private void clearNumberAssets() {
        this.bitField0_ &= -2;
        this.numberAssets_ = 0;
    }

    public static InvestWatchlistContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static InvestWatchlistContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InvestWatchlistContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestWatchlistContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InvestWatchlistContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setNumberAssets(int i) {
        this.bitField0_ |= 1;
        this.numberAssets_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (l6.f146134a[v0Var.ordinal()]) {
            case 1:
                return new InvestWatchlistContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "numberAssets_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (InvestWatchlistContext.class) {
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

    public int getNumberAssets() {
        return this.numberAssets_;
    }

    public boolean hasNumberAssets() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(InvestWatchlistContext investWatchlistContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(investWatchlistContext);
    }

    public static InvestWatchlistContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestWatchlistContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestWatchlistContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestWatchlistContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static InvestWatchlistContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (InvestWatchlistContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static InvestWatchlistContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestWatchlistContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static InvestWatchlistContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InvestWatchlistContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InvestWatchlistContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (InvestWatchlistContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static InvestWatchlistContext parseFrom(InputStream inputStream) throws IOException {
        return (InvestWatchlistContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InvestWatchlistContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InvestWatchlistContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InvestWatchlistContext parseFrom(t tVar) throws IOException {
        return (InvestWatchlistContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static InvestWatchlistContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (InvestWatchlistContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
