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
import grl.pa;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SearchQueryContext extends w0 implements e2 {
    private static final SearchQueryContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 1;
    private int bitField0_;
    private String query_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((SearchQueryContext) this.f49761b).setQuery(str);
        }

        private a() {
            super(SearchQueryContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SearchQueryContext searchQueryContext = new SearchQueryContext();
        DEFAULT_INSTANCE = searchQueryContext;
        w0.registerDefaultInstance(SearchQueryContext.class, searchQueryContext);
    }

    private SearchQueryContext() {
    }

    private void clearQuery() {
        this.bitField0_ &= -2;
        this.query_ = getDefaultInstance().getQuery();
    }

    public static SearchQueryContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SearchQueryContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SearchQueryContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchQueryContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SearchQueryContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuery(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.query_ = str;
    }

    private void setQueryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.query_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (pa.f146174a[v0Var.ordinal()]) {
            case 1:
                return new SearchQueryContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "query_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SearchQueryContext.class) {
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

    public String getQuery() {
        return this.query_;
    }

    public p getQueryBytes() {
        return p.d(this.query_);
    }

    public boolean hasQuery() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(SearchQueryContext searchQueryContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(searchQueryContext);
    }

    public static SearchQueryContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SearchQueryContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SearchQueryContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SearchQueryContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SearchQueryContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SearchQueryContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SearchQueryContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SearchQueryContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SearchQueryContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SearchQueryContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SearchQueryContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SearchQueryContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SearchQueryContext parseFrom(InputStream inputStream) throws IOException {
        return (SearchQueryContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SearchQueryContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SearchQueryContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SearchQueryContext parseFrom(t tVar) throws IOException {
        return (SearchQueryContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SearchQueryContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SearchQueryContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
