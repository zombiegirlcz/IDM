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
import grl.f5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class InboxProductArticleContext extends w0 implements e2 {
    private static final InboxProductArticleContext DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ORIGIN_MESSAGE_ID_FIELD_NUMBER = 2;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String id_ = "";
    private String originMessageId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(InboxProductArticleContext.DEFAULT_INSTANCE);
        }
    }

    static {
        InboxProductArticleContext inboxProductArticleContext = new InboxProductArticleContext();
        DEFAULT_INSTANCE = inboxProductArticleContext;
        w0.registerDefaultInstance(InboxProductArticleContext.class, inboxProductArticleContext);
    }

    private InboxProductArticleContext() {
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    private void clearOriginMessageId() {
        this.bitField0_ &= -3;
        this.originMessageId_ = getDefaultInstance().getOriginMessageId();
    }

    public static InboxProductArticleContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static InboxProductArticleContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InboxProductArticleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InboxProductArticleContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InboxProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    private void setIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.id_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginMessageId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.originMessageId_ = str;
    }

    private void setOriginMessageIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.originMessageId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (f5.f146092a[v0Var.ordinal()]) {
            case 1:
                return new InboxProductArticleContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "id_", "originMessageId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (InboxProductArticleContext.class) {
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

    public String getId() {
        return this.id_;
    }

    public p getIdBytes() {
        return p.d(this.id_);
    }

    public String getOriginMessageId() {
        return this.originMessageId_;
    }

    public p getOriginMessageIdBytes() {
        return p.d(this.originMessageId_);
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOriginMessageId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(InboxProductArticleContext inboxProductArticleContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(inboxProductArticleContext);
    }

    public static InboxProductArticleContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InboxProductArticleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InboxProductArticleContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (InboxProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static InboxProductArticleContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (InboxProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static InboxProductArticleContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (InboxProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static InboxProductArticleContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InboxProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InboxProductArticleContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (InboxProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static InboxProductArticleContext parseFrom(InputStream inputStream) throws IOException {
        return (InboxProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InboxProductArticleContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (InboxProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static InboxProductArticleContext parseFrom(t tVar) throws IOException {
        return (InboxProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static InboxProductArticleContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (InboxProductArticleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
