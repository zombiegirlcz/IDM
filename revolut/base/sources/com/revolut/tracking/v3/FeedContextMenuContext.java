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
import grl.h4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedContextMenuContext extends w0 implements e2 {
    private static final FeedContextMenuContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int WIDGETID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String widgetId_ = "";
    private String size_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(FeedContextMenuContext.DEFAULT_INSTANCE);
        }
    }

    static {
        FeedContextMenuContext feedContextMenuContext = new FeedContextMenuContext();
        DEFAULT_INSTANCE = feedContextMenuContext;
        w0.registerDefaultInstance(FeedContextMenuContext.class, feedContextMenuContext);
    }

    private FeedContextMenuContext() {
    }

    private void clearSize() {
        this.bitField0_ &= -3;
        this.size_ = getDefaultInstance().getSize();
    }

    private void clearWidgetId() {
        this.bitField0_ &= -2;
        this.widgetId_ = getDefaultInstance().getWidgetId();
    }

    public static FeedContextMenuContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static FeedContextMenuContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FeedContextMenuContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedContextMenuContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FeedContextMenuContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.size_ = str;
    }

    private void setSizeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.size_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgetId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.widgetId_ = str;
    }

    private void setWidgetIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.widgetId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (h4.f146102a[v0Var.ordinal()]) {
            case 1:
                return new FeedContextMenuContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "widgetId_", "size_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (FeedContextMenuContext.class) {
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

    public String getSize() {
        return this.size_;
    }

    public p getSizeBytes() {
        return p.d(this.size_);
    }

    public String getWidgetId() {
        return this.widgetId_;
    }

    public p getWidgetIdBytes() {
        return p.d(this.widgetId_);
    }

    public boolean hasSize() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWidgetId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(FeedContextMenuContext feedContextMenuContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(feedContextMenuContext);
    }

    public static FeedContextMenuContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FeedContextMenuContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FeedContextMenuContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (FeedContextMenuContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static FeedContextMenuContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (FeedContextMenuContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static FeedContextMenuContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (FeedContextMenuContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static FeedContextMenuContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FeedContextMenuContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FeedContextMenuContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (FeedContextMenuContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static FeedContextMenuContext parseFrom(InputStream inputStream) throws IOException {
        return (FeedContextMenuContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FeedContextMenuContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FeedContextMenuContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FeedContextMenuContext parseFrom(t tVar) throws IOException {
        return (FeedContextMenuContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static FeedContextMenuContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (FeedContextMenuContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
