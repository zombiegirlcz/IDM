package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e2;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import grl.d0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class ArticleContext extends w0 implements e2 {
    public static final int ARTICLE_ID_FIELD_NUMBER = 1;
    public static final int ARTICLE_NAME_FIELD_NUMBER = 2;
    private static final ArticleContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int SCREEN_SOURCE_FIELD_NUMBER = 3;
    public static final int WIDGET_SOURCE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String articleId_ = "";
    private String articleName_ = "";
    private String screenSource_ = "";
    private String widgetSource_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(ArticleContext.DEFAULT_INSTANCE);
        }
    }

    static {
        ArticleContext articleContext = new ArticleContext();
        DEFAULT_INSTANCE = articleContext;
        w0.registerDefaultInstance(ArticleContext.class, articleContext);
    }

    private ArticleContext() {
    }

    private void clearArticleId() {
        this.bitField0_ &= -2;
        this.articleId_ = getDefaultInstance().getArticleId();
    }

    private void clearArticleName() {
        this.bitField0_ &= -3;
        this.articleName_ = getDefaultInstance().getArticleName();
    }

    private void clearScreenSource() {
        this.bitField0_ &= -5;
        this.screenSource_ = getDefaultInstance().getScreenSource();
    }

    private void clearWidgetSource() {
        this.bitField0_ &= -9;
        this.widgetSource_ = getDefaultInstance().getWidgetSource();
    }

    public static ArticleContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ArticleContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArticleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArticleContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArticleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setArticleId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.articleId_ = str;
    }

    private void setArticleIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.articleId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setArticleName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.articleName_ = str;
    }

    private void setArticleNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.articleName_ = pVar.m();
        this.bitField0_ |= 2;
    }

    private void setScreenSource(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.screenSource_ = str;
    }

    private void setScreenSourceBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.screenSource_ = pVar.m();
        this.bitField0_ |= 4;
    }

    private void setWidgetSource(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.widgetSource_ = str;
    }

    private void setWidgetSourceBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.widgetSource_ = pVar.m();
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (d0.f146077a[v0Var.ordinal()]) {
            case 1:
                return new ArticleContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "articleId_", "articleName_", "screenSource_", "widgetSource_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ArticleContext.class) {
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

    public String getArticleId() {
        return this.articleId_;
    }

    public p getArticleIdBytes() {
        return p.d(this.articleId_);
    }

    public String getArticleName() {
        return this.articleName_;
    }

    public p getArticleNameBytes() {
        return p.d(this.articleName_);
    }

    public String getScreenSource() {
        return this.screenSource_;
    }

    public p getScreenSourceBytes() {
        return p.d(this.screenSource_);
    }

    public String getWidgetSource() {
        return this.widgetSource_;
    }

    public p getWidgetSourceBytes() {
        return p.d(this.widgetSource_);
    }

    public boolean hasArticleId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasArticleName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasScreenSource() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWidgetSource() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(ArticleContext articleContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(articleContext);
    }

    public static ArticleContext parseDelimitedFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (ArticleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ArticleContext parseFrom(ByteBuffer byteBuffer, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (ArticleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ArticleContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ArticleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ArticleContext parseFrom(p pVar, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (ArticleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ArticleContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ArticleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArticleContext parseFrom(byte[] bArr, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (ArticleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ArticleContext parseFrom(InputStream inputStream) throws IOException {
        return (ArticleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArticleContext parseFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (ArticleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ArticleContext parseFrom(t tVar) throws IOException {
        return (ArticleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ArticleContext parseFrom(t tVar, com.google.protobuf.d0 d0Var) throws IOException {
        return (ArticleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
