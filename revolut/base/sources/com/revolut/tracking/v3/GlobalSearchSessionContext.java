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
import grl.n4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class GlobalSearchSessionContext extends w0 implements e2 {
    public static final int BLOCKS_FIELD_NUMBER = 6;
    public static final int CONTEXT_FIELD_NUMBER = 7;
    private static final GlobalSearchSessionContext DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 1;
    public static final int REMOTE_ITEMS_FIELD_NUMBER = 3;
    public static final int REMOTE_ITEMS_REQ_ERROR_FIELD_NUMBER = 5;
    public static final int REMOTE_ITEMS_REQ_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private long duration_;
    private boolean remoteItemsReqError_;
    private long remoteItemsReqTime_;
    private String query_ = "";
    private String remoteItems_ = "";
    private String blocks_ = "";
    private String context_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(GlobalSearchSessionContext.DEFAULT_INSTANCE);
        }
    }

    static {
        GlobalSearchSessionContext globalSearchSessionContext = new GlobalSearchSessionContext();
        DEFAULT_INSTANCE = globalSearchSessionContext;
        w0.registerDefaultInstance(GlobalSearchSessionContext.class, globalSearchSessionContext);
    }

    private GlobalSearchSessionContext() {
    }

    private void clearBlocks() {
        this.bitField0_ &= -33;
        this.blocks_ = getDefaultInstance().getBlocks();
    }

    private void clearContext() {
        this.bitField0_ &= -65;
        this.context_ = getDefaultInstance().getContext();
    }

    private void clearDuration() {
        this.bitField0_ &= -3;
        this.duration_ = 0L;
    }

    private void clearQuery() {
        this.bitField0_ &= -2;
        this.query_ = getDefaultInstance().getQuery();
    }

    private void clearRemoteItems() {
        this.bitField0_ &= -5;
        this.remoteItems_ = getDefaultInstance().getRemoteItems();
    }

    private void clearRemoteItemsReqError() {
        this.bitField0_ &= -17;
        this.remoteItemsReqError_ = false;
    }

    private void clearRemoteItemsReqTime() {
        this.bitField0_ &= -9;
        this.remoteItemsReqTime_ = 0L;
    }

    public static GlobalSearchSessionContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static GlobalSearchSessionContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GlobalSearchSessionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GlobalSearchSessionContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GlobalSearchSessionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBlocks(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.blocks_ = str;
    }

    private void setBlocksBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.blocks_ = pVar.m();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.context_ = str;
    }

    private void setContextBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.context_ = pVar.m();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDuration(long j2) {
        this.bitField0_ |= 2;
        this.duration_ = j2;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteItems(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.remoteItems_ = str;
    }

    private void setRemoteItemsBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.remoteItems_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteItemsReqError(boolean z) {
        this.bitField0_ |= 16;
        this.remoteItemsReqError_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoteItemsReqTime(long j2) {
        this.bitField0_ |= 8;
        this.remoteItemsReqTime_ = j2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (n4.f146150a[v0Var.ordinal()]) {
            case 1:
                return new GlobalSearchSessionContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ለ\u0002\u0004ဂ\u0003\u0005ဇ\u0004\u0006ለ\u0005\u0007ለ\u0006", new Object[]{"bitField0_", "query_", "duration_", "remoteItems_", "remoteItemsReqTime_", "remoteItemsReqError_", "blocks_", "context_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (GlobalSearchSessionContext.class) {
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

    public String getBlocks() {
        return this.blocks_;
    }

    public p getBlocksBytes() {
        return p.d(this.blocks_);
    }

    public String getContext() {
        return this.context_;
    }

    public p getContextBytes() {
        return p.d(this.context_);
    }

    public long getDuration() {
        return this.duration_;
    }

    public String getQuery() {
        return this.query_;
    }

    public p getQueryBytes() {
        return p.d(this.query_);
    }

    public String getRemoteItems() {
        return this.remoteItems_;
    }

    public p getRemoteItemsBytes() {
        return p.d(this.remoteItems_);
    }

    public boolean getRemoteItemsReqError() {
        return this.remoteItemsReqError_;
    }

    public long getRemoteItemsReqTime() {
        return this.remoteItemsReqTime_;
    }

    public boolean hasBlocks() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasContext() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasDuration() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasQuery() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRemoteItems() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRemoteItemsReqError() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRemoteItemsReqTime() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(GlobalSearchSessionContext globalSearchSessionContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(globalSearchSessionContext);
    }

    public static GlobalSearchSessionContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (GlobalSearchSessionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static GlobalSearchSessionContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (GlobalSearchSessionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static GlobalSearchSessionContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (GlobalSearchSessionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static GlobalSearchSessionContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (GlobalSearchSessionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static GlobalSearchSessionContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GlobalSearchSessionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GlobalSearchSessionContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (GlobalSearchSessionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static GlobalSearchSessionContext parseFrom(InputStream inputStream) throws IOException {
        return (GlobalSearchSessionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GlobalSearchSessionContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (GlobalSearchSessionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static GlobalSearchSessionContext parseFrom(t tVar) throws IOException {
        return (GlobalSearchSessionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static GlobalSearchSessionContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (GlobalSearchSessionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
