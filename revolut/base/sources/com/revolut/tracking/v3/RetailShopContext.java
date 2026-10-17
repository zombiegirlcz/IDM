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
import grl.l9;
import grl.n9;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class RetailShopContext extends w0 implements e2 {
    private static final RetailShopContext DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private int entryPoint_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(RetailShopContext.DEFAULT_INSTANCE);
        }
    }

    static {
        RetailShopContext retailShopContext = new RetailShopContext();
        DEFAULT_INSTANCE = retailShopContext;
        w0.registerDefaultInstance(RetailShopContext.class, retailShopContext);
    }

    private RetailShopContext() {
    }

    private void clearEntryPoint() {
        this.bitField0_ &= -2;
        this.entryPoint_ = 0;
    }

    public static RetailShopContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static RetailShopContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RetailShopContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetailShopContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RetailShopContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEntryPoint(n9 n9Var) {
        this.entryPoint_ = n9Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setEntryPointValue(int i) {
        this.bitField0_ |= 1;
        this.entryPoint_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (l9.f146137a[v0Var.ordinal()]) {
            case 1:
                return new RetailShopContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "entryPoint_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (RetailShopContext.class) {
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

    public n9 getEntryPoint() {
        int i = this.entryPoint_;
        n9 n9Var = i != 0 ? i != 1 ? null : n9.App : n9.DeepLink;
        return n9Var == null ? n9.UNRECOGNIZED : n9Var;
    }

    public int getEntryPointValue() {
        return this.entryPoint_;
    }

    public boolean hasEntryPoint() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(RetailShopContext retailShopContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(retailShopContext);
    }

    public static RetailShopContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RetailShopContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RetailShopContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (RetailShopContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static RetailShopContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (RetailShopContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RetailShopContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (RetailShopContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static RetailShopContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RetailShopContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RetailShopContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (RetailShopContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static RetailShopContext parseFrom(InputStream inputStream) throws IOException {
        return (RetailShopContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RetailShopContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RetailShopContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RetailShopContext parseFrom(t tVar) throws IOException {
        return (RetailShopContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static RetailShopContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (RetailShopContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
