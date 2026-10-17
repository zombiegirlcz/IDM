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
import grl.h0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class AssetCollectionContext extends w0 implements e2 {
    public static final int COLLECTION_ID_FIELD_NUMBER = 1;
    public static final int COLLECTION_NAME_FIELD_NUMBER = 2;
    private static final AssetCollectionContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String collectionId_ = "";
    private String collectionName_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(AssetCollectionContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AssetCollectionContext assetCollectionContext = new AssetCollectionContext();
        DEFAULT_INSTANCE = assetCollectionContext;
        w0.registerDefaultInstance(AssetCollectionContext.class, assetCollectionContext);
    }

    private AssetCollectionContext() {
    }

    private void clearCollectionId() {
        this.bitField0_ &= -2;
        this.collectionId_ = getDefaultInstance().getCollectionId();
    }

    private void clearCollectionName() {
        this.bitField0_ &= -3;
        this.collectionName_ = getDefaultInstance().getCollectionName();
    }

    public static AssetCollectionContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static AssetCollectionContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AssetCollectionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AssetCollectionContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AssetCollectionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCollectionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.collectionId_ = str;
    }

    private void setCollectionIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.collectionId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setCollectionName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.collectionName_ = str;
    }

    private void setCollectionNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.collectionName_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (h0.f146101a[v0Var.ordinal()]) {
            case 1:
                return new AssetCollectionContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "collectionId_", "collectionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AssetCollectionContext.class) {
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

    public String getCollectionId() {
        return this.collectionId_;
    }

    public p getCollectionIdBytes() {
        return p.d(this.collectionId_);
    }

    public String getCollectionName() {
        return this.collectionName_;
    }

    public p getCollectionNameBytes() {
        return p.d(this.collectionName_);
    }

    public boolean hasCollectionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCollectionName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(AssetCollectionContext assetCollectionContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(assetCollectionContext);
    }

    public static AssetCollectionContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AssetCollectionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AssetCollectionContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AssetCollectionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AssetCollectionContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AssetCollectionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AssetCollectionContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AssetCollectionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AssetCollectionContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AssetCollectionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AssetCollectionContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AssetCollectionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AssetCollectionContext parseFrom(InputStream inputStream) throws IOException {
        return (AssetCollectionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AssetCollectionContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AssetCollectionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AssetCollectionContext parseFrom(t tVar) throws IOException {
        return (AssetCollectionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AssetCollectionContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AssetCollectionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
