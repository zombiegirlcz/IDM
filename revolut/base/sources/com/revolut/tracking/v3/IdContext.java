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
import grl.y4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class IdContext extends w0 implements e2 {
    private static final IdContext DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String id_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((IdContext) this.f49761b).setId(str);
        }

        private a() {
            super(IdContext.DEFAULT_INSTANCE);
        }
    }

    static {
        IdContext idContext = new IdContext();
        DEFAULT_INSTANCE = idContext;
        w0.registerDefaultInstance(IdContext.class, idContext);
    }

    private IdContext() {
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    public static IdContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static IdContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IdContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IdContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IdContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (y4.f146238a[v0Var.ordinal()]) {
            case 1:
                return new IdContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "id_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (IdContext.class) {
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

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(IdContext idContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(idContext);
    }

    public static IdContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (IdContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static IdContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (IdContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static IdContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (IdContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static IdContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (IdContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static IdContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IdContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IdContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (IdContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static IdContext parseFrom(InputStream inputStream) throws IOException {
        return (IdContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IdContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (IdContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static IdContext parseFrom(t tVar) throws IOException {
        return (IdContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static IdContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (IdContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
