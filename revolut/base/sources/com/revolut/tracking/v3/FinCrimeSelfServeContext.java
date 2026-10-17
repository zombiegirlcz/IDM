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
import grl.i4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FinCrimeSelfServeContext extends w0 implements e2 {
    private static final FinCrimeSelfServeContext DEFAULT_INSTANCE;
    public static final int FLOW_NAME_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int TICKET_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private String flowName_ = "";
    private String ticketId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(FinCrimeSelfServeContext.DEFAULT_INSTANCE);
        }
    }

    static {
        FinCrimeSelfServeContext finCrimeSelfServeContext = new FinCrimeSelfServeContext();
        DEFAULT_INSTANCE = finCrimeSelfServeContext;
        w0.registerDefaultInstance(FinCrimeSelfServeContext.class, finCrimeSelfServeContext);
    }

    private FinCrimeSelfServeContext() {
    }

    private void clearFlowName() {
        this.bitField0_ &= -2;
        this.flowName_ = getDefaultInstance().getFlowName();
    }

    private void clearTicketId() {
        this.bitField0_ &= -3;
        this.ticketId_ = getDefaultInstance().getTicketId();
    }

    public static FinCrimeSelfServeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static FinCrimeSelfServeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FinCrimeSelfServeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FinCrimeSelfServeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FinCrimeSelfServeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.flowName_ = str;
    }

    private void setFlowNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.flowName_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTicketId(String str) {
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
        switch (i4.f146109a[v0Var.ordinal()]) {
            case 1:
                return new FinCrimeSelfServeContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "flowName_", "ticketId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (FinCrimeSelfServeContext.class) {
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

    public String getFlowName() {
        return this.flowName_;
    }

    public p getFlowNameBytes() {
        return p.d(this.flowName_);
    }

    public String getTicketId() {
        return this.ticketId_;
    }

    public p getTicketIdBytes() {
        return p.d(this.ticketId_);
    }

    public boolean hasFlowName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTicketId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(FinCrimeSelfServeContext finCrimeSelfServeContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(finCrimeSelfServeContext);
    }

    public static FinCrimeSelfServeContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FinCrimeSelfServeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FinCrimeSelfServeContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (FinCrimeSelfServeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static FinCrimeSelfServeContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (FinCrimeSelfServeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static FinCrimeSelfServeContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (FinCrimeSelfServeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static FinCrimeSelfServeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FinCrimeSelfServeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FinCrimeSelfServeContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (FinCrimeSelfServeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static FinCrimeSelfServeContext parseFrom(InputStream inputStream) throws IOException {
        return (FinCrimeSelfServeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FinCrimeSelfServeContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FinCrimeSelfServeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FinCrimeSelfServeContext parseFrom(t tVar) throws IOException {
        return (FinCrimeSelfServeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static FinCrimeSelfServeContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (FinCrimeSelfServeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
