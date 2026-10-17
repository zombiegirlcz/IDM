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
import grl.u4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class HotelsSearchContext extends w0 implements e2 {
    public static final int CURRENCY_FIELD_NUMBER = 2;
    private static final HotelsSearchContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private int bitField0_;
    private String properties_ = "";
    private String currency_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(HotelsSearchContext.DEFAULT_INSTANCE);
        }
    }

    static {
        HotelsSearchContext hotelsSearchContext = new HotelsSearchContext();
        DEFAULT_INSTANCE = hotelsSearchContext;
        w0.registerDefaultInstance(HotelsSearchContext.class, hotelsSearchContext);
    }

    private HotelsSearchContext() {
    }

    private void clearCurrency() {
        this.bitField0_ &= -3;
        this.currency_ = getDefaultInstance().getCurrency();
    }

    private void clearProperties() {
        this.bitField0_ &= -2;
        this.properties_ = getDefaultInstance().getProperties();
    }

    public static HotelsSearchContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static HotelsSearchContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HotelsSearchContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HotelsSearchContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HotelsSearchContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrency(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.currency_ = str;
    }

    private void setCurrencyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.currency_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProperties(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.properties_ = str;
    }

    private void setPropertiesBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.properties_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (u4.f146213a[v0Var.ordinal()]) {
            case 1:
                return new HotelsSearchContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "properties_", "currency_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (HotelsSearchContext.class) {
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

    public String getCurrency() {
        return this.currency_;
    }

    public p getCurrencyBytes() {
        return p.d(this.currency_);
    }

    public String getProperties() {
        return this.properties_;
    }

    public p getPropertiesBytes() {
        return p.d(this.properties_);
    }

    public boolean hasCurrency() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProperties() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(HotelsSearchContext hotelsSearchContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(hotelsSearchContext);
    }

    public static HotelsSearchContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (HotelsSearchContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static HotelsSearchContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (HotelsSearchContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static HotelsSearchContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (HotelsSearchContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static HotelsSearchContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (HotelsSearchContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static HotelsSearchContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HotelsSearchContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HotelsSearchContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (HotelsSearchContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static HotelsSearchContext parseFrom(InputStream inputStream) throws IOException {
        return (HotelsSearchContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HotelsSearchContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (HotelsSearchContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static HotelsSearchContext parseFrom(t tVar) throws IOException {
        return (HotelsSearchContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static HotelsSearchContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (HotelsSearchContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
