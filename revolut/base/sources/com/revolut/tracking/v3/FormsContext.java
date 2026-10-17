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
import grl.j4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FormsContext extends w0 implements e2 {
    private static final FormsContext DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_ONBOARDING_FIELD_NUMBER = 5;
    private static volatile m2 PARSER = null;
    public static final int PRODUCT_IDENTIFIER_FIELD_NUMBER = 6;
    public static final int SCREEN_FIELD_NUMBER = 3;
    public static final int TICKET_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isOnboarding_;
    private String id_ = "";
    private String ticketId_ = "";
    private String screen_ = "";
    private String flowId_ = "";
    private String productIdentifier_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(FormsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        FormsContext formsContext = new FormsContext();
        DEFAULT_INSTANCE = formsContext;
        w0.registerDefaultInstance(FormsContext.class, formsContext);
    }

    private FormsContext() {
    }

    private void clearFlowId() {
        this.bitField0_ &= -9;
        this.flowId_ = getDefaultInstance().getFlowId();
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    private void clearIsOnboarding() {
        this.bitField0_ &= -17;
        this.isOnboarding_ = false;
    }

    private void clearProductIdentifier() {
        this.bitField0_ &= -33;
        this.productIdentifier_ = getDefaultInstance().getProductIdentifier();
    }

    private void clearScreen() {
        this.bitField0_ &= -5;
        this.screen_ = getDefaultInstance().getScreen();
    }

    private void clearTicketId() {
        this.bitField0_ &= -3;
        this.ticketId_ = getDefaultInstance().getTicketId();
    }

    public static FormsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static FormsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FormsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FormsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FormsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.flowId_ = str;
    }

    private void setFlowIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.flowId_ = pVar.m();
        this.bitField0_ |= 8;
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

    private void setIsOnboarding(boolean z) {
        this.bitField0_ |= 16;
        this.isOnboarding_ = z;
    }

    private void setProductIdentifier(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.productIdentifier_ = str;
    }

    private void setProductIdentifierBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.productIdentifier_ = pVar.m();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreen(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.screen_ = str;
    }

    private void setScreenBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.screen_ = pVar.m();
        this.bitField0_ |= 4;
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
        switch (j4.f146118a[v0Var.ordinal()]) {
            case 1:
                return new FormsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ဇ\u0004\u0006ለ\u0005", new Object[]{"bitField0_", "id_", "ticketId_", "screen_", "flowId_", "isOnboarding_", "productIdentifier_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (FormsContext.class) {
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

    public String getFlowId() {
        return this.flowId_;
    }

    public p getFlowIdBytes() {
        return p.d(this.flowId_);
    }

    public String getId() {
        return this.id_;
    }

    public p getIdBytes() {
        return p.d(this.id_);
    }

    public boolean getIsOnboarding() {
        return this.isOnboarding_;
    }

    public String getProductIdentifier() {
        return this.productIdentifier_;
    }

    public p getProductIdentifierBytes() {
        return p.d(this.productIdentifier_);
    }

    public String getScreen() {
        return this.screen_;
    }

    public p getScreenBytes() {
        return p.d(this.screen_);
    }

    public String getTicketId() {
        return this.ticketId_;
    }

    public p getTicketIdBytes() {
        return p.d(this.ticketId_);
    }

    public boolean hasFlowId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsOnboarding() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasProductIdentifier() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasScreen() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTicketId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(FormsContext formsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(formsContext);
    }

    public static FormsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FormsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FormsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (FormsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static FormsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (FormsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static FormsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (FormsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static FormsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FormsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FormsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (FormsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static FormsContext parseFrom(InputStream inputStream) throws IOException {
        return (FormsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FormsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FormsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FormsContext parseFrom(t tVar) throws IOException {
        return (FormsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static FormsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (FormsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
