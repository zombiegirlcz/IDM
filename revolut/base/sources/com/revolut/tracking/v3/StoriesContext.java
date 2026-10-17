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
import grl.dd;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class StoriesContext extends w0 implements e2 {
    public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
    private static final StoriesContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int STORIES_IDS_FIELD_NUMBER = 1;
    private int bitField0_;
    private String storiesIds_ = "";
    private String countryCode_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((StoriesContext) this.f49761b).setCountryCode(str);
        }

        public final void i(String str) {
            c();
            ((StoriesContext) this.f49761b).setStoriesIds(str);
        }

        private a() {
            super(StoriesContext.DEFAULT_INSTANCE);
        }
    }

    static {
        StoriesContext storiesContext = new StoriesContext();
        DEFAULT_INSTANCE = storiesContext;
        w0.registerDefaultInstance(StoriesContext.class, storiesContext);
    }

    private StoriesContext() {
    }

    private void clearCountryCode() {
        this.bitField0_ &= -3;
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    private void clearStoriesIds() {
        this.bitField0_ &= -2;
        this.storiesIds_ = getDefaultInstance().getStoriesIds();
    }

    public static StoriesContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static StoriesContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StoriesContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StoriesContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StoriesContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountryCode(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.countryCode_ = str;
    }

    private void setCountryCodeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.countryCode_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStoriesIds(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.storiesIds_ = str;
    }

    private void setStoriesIdsBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.storiesIds_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (dd.f146081a[v0Var.ordinal()]) {
            case 1:
                return new StoriesContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "storiesIds_", "countryCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (StoriesContext.class) {
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

    public String getCountryCode() {
        return this.countryCode_;
    }

    public p getCountryCodeBytes() {
        return p.d(this.countryCode_);
    }

    public String getStoriesIds() {
        return this.storiesIds_;
    }

    public p getStoriesIdsBytes() {
        return p.d(this.storiesIds_);
    }

    public boolean hasCountryCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStoriesIds() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(StoriesContext storiesContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(storiesContext);
    }

    public static StoriesContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (StoriesContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static StoriesContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (StoriesContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static StoriesContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (StoriesContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static StoriesContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (StoriesContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static StoriesContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StoriesContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StoriesContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (StoriesContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static StoriesContext parseFrom(InputStream inputStream) throws IOException {
        return (StoriesContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StoriesContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (StoriesContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static StoriesContext parseFrom(t tVar) throws IOException {
        return (StoriesContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static StoriesContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (StoriesContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
