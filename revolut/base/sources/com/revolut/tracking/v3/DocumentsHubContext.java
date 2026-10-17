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
import grl.q3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class DocumentsHubContext extends w0 implements e2 {
    private static final DocumentsHubContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 1;
    public static final int PRODUCT_FIELD_NUMBER = 2;
    public static final int TAB_FIELD_NUMBER = 3;
    private int bitField0_;
    private String path_ = "";
    private String product_ = "";
    private String tab_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(DocumentsHubContext.DEFAULT_INSTANCE);
        }
    }

    static {
        DocumentsHubContext documentsHubContext = new DocumentsHubContext();
        DEFAULT_INSTANCE = documentsHubContext;
        w0.registerDefaultInstance(DocumentsHubContext.class, documentsHubContext);
    }

    private DocumentsHubContext() {
    }

    private void clearPath() {
        this.bitField0_ &= -2;
        this.path_ = getDefaultInstance().getPath();
    }

    private void clearProduct() {
        this.bitField0_ &= -3;
        this.product_ = getDefaultInstance().getProduct();
    }

    private void clearTab() {
        this.bitField0_ &= -5;
        this.tab_ = getDefaultInstance().getTab();
    }

    public static DocumentsHubContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DocumentsHubContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentsHubContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentsHubContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DocumentsHubContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.path_ = str;
    }

    private void setPathBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.path_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProduct(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.product_ = str;
    }

    private void setProductBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.product_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTab(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.tab_ = str;
    }

    private void setTabBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.tab_ = pVar.m();
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (q3.f146180a[v0Var.ordinal()]) {
            case 1:
                return new DocumentsHubContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "path_", "product_", "tab_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (DocumentsHubContext.class) {
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

    public String getPath() {
        return this.path_;
    }

    public p getPathBytes() {
        return p.d(this.path_);
    }

    public String getProduct() {
        return this.product_;
    }

    public p getProductBytes() {
        return p.d(this.product_);
    }

    public String getTab() {
        return this.tab_;
    }

    public p getTabBytes() {
        return p.d(this.tab_);
    }

    public boolean hasPath() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasProduct() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTab() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(DocumentsHubContext documentsHubContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(documentsHubContext);
    }

    public static DocumentsHubContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (DocumentsHubContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static DocumentsHubContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (DocumentsHubContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static DocumentsHubContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (DocumentsHubContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static DocumentsHubContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (DocumentsHubContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static DocumentsHubContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DocumentsHubContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DocumentsHubContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (DocumentsHubContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static DocumentsHubContext parseFrom(InputStream inputStream) throws IOException {
        return (DocumentsHubContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentsHubContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (DocumentsHubContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static DocumentsHubContext parseFrom(t tVar) throws IOException {
        return (DocumentsHubContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static DocumentsHubContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (DocumentsHubContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
