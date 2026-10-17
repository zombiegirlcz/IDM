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
import grl.v1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class ChatContext extends w0 implements e2 {
    public static final int CURRENT_STATE_FIELD_NUMBER = 3;
    private static final ChatContext DEFAULT_INSTANCE;
    public static final int ENTRY_POINT_FIELD_NUMBER = 4;
    public static final int INSTANCE_ID_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int SUGGESTIONS_SHOWN_FIELD_NUMBER = 5;
    public static final int TICKET_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private String ticketId_ = "";
    private String instanceId_ = "";
    private String currentState_ = "";
    private String entryPoint_ = "";
    private String suggestionsShown_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(ChatContext.DEFAULT_INSTANCE);
        }
    }

    static {
        ChatContext chatContext = new ChatContext();
        DEFAULT_INSTANCE = chatContext;
        w0.registerDefaultInstance(ChatContext.class, chatContext);
    }

    private ChatContext() {
    }

    private void clearCurrentState() {
        this.bitField0_ &= -5;
        this.currentState_ = getDefaultInstance().getCurrentState();
    }

    private void clearEntryPoint() {
        this.bitField0_ &= -9;
        this.entryPoint_ = getDefaultInstance().getEntryPoint();
    }

    private void clearInstanceId() {
        this.bitField0_ &= -3;
        this.instanceId_ = getDefaultInstance().getInstanceId();
    }

    private void clearSuggestionsShown() {
        this.bitField0_ &= -17;
        this.suggestionsShown_ = getDefaultInstance().getSuggestionsShown();
    }

    private void clearTicketId() {
        this.bitField0_ &= -2;
        this.ticketId_ = getDefaultInstance().getTicketId();
    }

    public static ChatContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ChatContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ChatContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ChatContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentState(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.currentState_ = str;
    }

    private void setCurrentStateBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.currentState_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntryPoint(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.entryPoint_ = str;
    }

    private void setEntryPointBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.entryPoint_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstanceId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.instanceId_ = str;
    }

    private void setInstanceIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.instanceId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuggestionsShown(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.suggestionsShown_ = str;
    }

    private void setSuggestionsShownBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.suggestionsShown_ = pVar.m();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTicketId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.ticketId_ = str;
    }

    private void setTicketIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.ticketId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (v1.f146219a[v0Var.ordinal()]) {
            case 1:
                return new ChatContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "ticketId_", "instanceId_", "currentState_", "entryPoint_", "suggestionsShown_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ChatContext.class) {
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

    public String getCurrentState() {
        return this.currentState_;
    }

    public p getCurrentStateBytes() {
        return p.d(this.currentState_);
    }

    public String getEntryPoint() {
        return this.entryPoint_;
    }

    public p getEntryPointBytes() {
        return p.d(this.entryPoint_);
    }

    public String getInstanceId() {
        return this.instanceId_;
    }

    public p getInstanceIdBytes() {
        return p.d(this.instanceId_);
    }

    public String getSuggestionsShown() {
        return this.suggestionsShown_;
    }

    public p getSuggestionsShownBytes() {
        return p.d(this.suggestionsShown_);
    }

    public String getTicketId() {
        return this.ticketId_;
    }

    public p getTicketIdBytes() {
        return p.d(this.ticketId_);
    }

    public boolean hasCurrentState() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasEntryPoint() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasInstanceId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSuggestionsShown() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTicketId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(ChatContext chatContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(chatContext);
    }

    public static ChatContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ChatContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ChatContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (ChatContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ChatContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ChatContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ChatContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (ChatContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ChatContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ChatContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ChatContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (ChatContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ChatContext parseFrom(InputStream inputStream) throws IOException {
        return (ChatContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ChatContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ChatContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ChatContext parseFrom(t tVar) throws IOException {
        return (ChatContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ChatContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (ChatContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
