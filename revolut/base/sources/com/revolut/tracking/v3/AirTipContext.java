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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class AirTipContext extends w0 implements e2 {
    private static final AirTipContext DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    public static final int IS_FIRST_IMPRESSION_FIELD_NUMBER = 4;
    private static volatile m2 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isFirstImpression_;
    private String type_ = "";
    private String title_ = "";
    private String id_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(AirTipContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AirTipContext airTipContext = new AirTipContext();
        DEFAULT_INSTANCE = airTipContext;
        w0.registerDefaultInstance(AirTipContext.class, airTipContext);
    }

    private AirTipContext() {
    }

    private void clearId() {
        this.bitField0_ &= -5;
        this.id_ = getDefaultInstance().getId();
    }

    private void clearIsFirstImpression() {
        this.bitField0_ &= -9;
        this.isFirstImpression_ = false;
    }

    private void clearTitle() {
        this.bitField0_ &= -3;
        this.title_ = getDefaultInstance().getTitle();
    }

    private void clearType() {
        this.bitField0_ &= -2;
        this.type_ = getDefaultInstance().getType();
    }

    public static AirTipContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static AirTipContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AirTipContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AirTipContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AirTipContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.id_ = str;
    }

    private void setIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.id_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFirstImpression(boolean z) {
        this.bitField0_ |= 8;
        this.isFirstImpression_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.title_ = str;
    }

    private void setTitleBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.title_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.type_ = str;
    }

    private void setTypeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.type_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (grl.p.f146166a[v0Var.ordinal()]) {
            case 1:
                return new AirTipContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "type_", "title_", "id_", "isFirstImpression_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AirTipContext.class) {
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

    public boolean getIsFirstImpression() {
        return this.isFirstImpression_;
    }

    public String getTitle() {
        return this.title_;
    }

    public p getTitleBytes() {
        return p.d(this.title_);
    }

    public String getType() {
        return this.type_;
    }

    public p getTypeBytes() {
        return p.d(this.type_);
    }

    public boolean hasId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsFirstImpression() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(AirTipContext airTipContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(airTipContext);
    }

    public static AirTipContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AirTipContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AirTipContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AirTipContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AirTipContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AirTipContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AirTipContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AirTipContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AirTipContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AirTipContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AirTipContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AirTipContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AirTipContext parseFrom(InputStream inputStream) throws IOException {
        return (AirTipContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AirTipContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AirTipContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AirTipContext parseFrom(t tVar) throws IOException {
        return (AirTipContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AirTipContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AirTipContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
