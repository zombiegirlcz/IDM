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
import grl.v6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class LinkContext extends w0 implements e2 {
    private static final LinkContext DEFAULT_INSTANCE;
    public static final int HREF_FIELD_NUMBER = 1;
    public static final int IS_EXTERNAL_FIELD_NUMBER = 2;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String href_ = "";
    private boolean isExternal_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(LinkContext.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkContext linkContext = new LinkContext();
        DEFAULT_INSTANCE = linkContext;
        w0.registerDefaultInstance(LinkContext.class, linkContext);
    }

    private LinkContext() {
    }

    private void clearHref() {
        this.bitField0_ &= -2;
        this.href_ = getDefaultInstance().getHref();
    }

    private void clearIsExternal() {
        this.bitField0_ &= -3;
        this.isExternal_ = false;
    }

    public static LinkContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LinkContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LinkContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHref(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.href_ = str;
    }

    private void setHrefBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.href_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setIsExternal(boolean z) {
        this.bitField0_ |= 2;
        this.isExternal_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (v6.f146221a[v0Var.ordinal()]) {
            case 1:
                return new LinkContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "href_", "isExternal_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (LinkContext.class) {
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

    public String getHref() {
        return this.href_;
    }

    public p getHrefBytes() {
        return p.d(this.href_);
    }

    public boolean getIsExternal() {
        return this.isExternal_;
    }

    public boolean hasHref() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsExternal() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(LinkContext linkContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(linkContext);
    }

    public static LinkContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (LinkContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static LinkContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (LinkContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static LinkContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (LinkContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static LinkContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (LinkContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static LinkContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LinkContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (LinkContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static LinkContext parseFrom(InputStream inputStream) throws IOException {
        return (LinkContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (LinkContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static LinkContext parseFrom(t tVar) throws IOException {
        return (LinkContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static LinkContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (LinkContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
