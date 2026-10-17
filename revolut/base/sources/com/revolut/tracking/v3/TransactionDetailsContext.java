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
import grl.pd;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class TransactionDetailsContext extends w0 implements e2 {
    private static final TransactionDetailsContext DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_REV_POINTS_BANNER_SHOWED_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int TICKET_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isRevPointsBannerShowed_;
    private String id_ = "";
    private String ticketId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(TransactionDetailsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        TransactionDetailsContext transactionDetailsContext = new TransactionDetailsContext();
        DEFAULT_INSTANCE = transactionDetailsContext;
        w0.registerDefaultInstance(TransactionDetailsContext.class, transactionDetailsContext);
    }

    private TransactionDetailsContext() {
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    private void clearIsRevPointsBannerShowed() {
        this.bitField0_ &= -5;
        this.isRevPointsBannerShowed_ = false;
    }

    private void clearTicketId() {
        this.bitField0_ &= -3;
        this.ticketId_ = getDefaultInstance().getTicketId();
    }

    public static TransactionDetailsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransactionDetailsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TransactionDetailsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransactionDetailsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TransactionDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setIsRevPointsBannerShowed(boolean z) {
        this.bitField0_ |= 4;
        this.isRevPointsBannerShowed_ = z;
    }

    private void setTicketId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.ticketId_ = str;
    }

    private void setTicketIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.ticketId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (pd.f146177a[v0Var.ordinal()]) {
            case 1:
                return new TransactionDetailsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "id_", "ticketId_", "isRevPointsBannerShowed_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (TransactionDetailsContext.class) {
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

    public boolean getIsRevPointsBannerShowed() {
        return this.isRevPointsBannerShowed_;
    }

    public String getTicketId() {
        return this.ticketId_;
    }

    public p getTicketIdBytes() {
        return p.d(this.ticketId_);
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsRevPointsBannerShowed() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTicketId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(TransactionDetailsContext transactionDetailsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(transactionDetailsContext);
    }

    public static TransactionDetailsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (TransactionDetailsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static TransactionDetailsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (TransactionDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static TransactionDetailsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (TransactionDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static TransactionDetailsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (TransactionDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static TransactionDetailsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TransactionDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransactionDetailsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (TransactionDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static TransactionDetailsContext parseFrom(InputStream inputStream) throws IOException {
        return (TransactionDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransactionDetailsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (TransactionDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static TransactionDetailsContext parseFrom(t tVar) throws IOException {
        return (TransactionDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static TransactionDetailsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (TransactionDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
