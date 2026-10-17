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
import grl.k4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class FormsFooterButtonContext extends w0 implements e2 {
    private static final FormsFooterButtonContext DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 4;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int SCREEN_FIELD_NUMBER = 3;
    public static final int SCREEN_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private int index_;
    private String screenId_ = "";
    private String screen_ = "";
    private String flowId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(FormsFooterButtonContext.DEFAULT_INSTANCE);
        }
    }

    static {
        FormsFooterButtonContext formsFooterButtonContext = new FormsFooterButtonContext();
        DEFAULT_INSTANCE = formsFooterButtonContext;
        w0.registerDefaultInstance(FormsFooterButtonContext.class, formsFooterButtonContext);
    }

    private FormsFooterButtonContext() {
    }

    private void clearFlowId() {
        this.bitField0_ &= -9;
        this.flowId_ = getDefaultInstance().getFlowId();
    }

    private void clearIndex() {
        this.bitField0_ &= -2;
        this.index_ = 0;
    }

    private void clearScreen() {
        this.bitField0_ &= -5;
        this.screen_ = getDefaultInstance().getScreen();
    }

    private void clearScreenId() {
        this.bitField0_ &= -3;
        this.screenId_ = getDefaultInstance().getScreenId();
    }

    public static FormsFooterButtonContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static FormsFooterButtonContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FormsFooterButtonContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FormsFooterButtonContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FormsFooterButtonContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setIndex(int i) {
        this.bitField0_ |= 1;
        this.index_ = i;
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
    public void setScreenId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.screenId_ = str;
    }

    private void setScreenIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.screenId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (k4.f146126a[v0Var.ordinal()]) {
            case 1:
                return new FormsFooterButtonContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "index_", "screenId_", "screen_", "flowId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (FormsFooterButtonContext.class) {
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

    public int getIndex() {
        return this.index_;
    }

    public String getScreen() {
        return this.screen_;
    }

    public p getScreenBytes() {
        return p.d(this.screen_);
    }

    public String getScreenId() {
        return this.screenId_;
    }

    public p getScreenIdBytes() {
        return p.d(this.screenId_);
    }

    public boolean hasFlowId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIndex() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasScreen() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasScreenId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(FormsFooterButtonContext formsFooterButtonContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(formsFooterButtonContext);
    }

    public static FormsFooterButtonContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FormsFooterButtonContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FormsFooterButtonContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (FormsFooterButtonContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static FormsFooterButtonContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (FormsFooterButtonContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static FormsFooterButtonContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (FormsFooterButtonContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static FormsFooterButtonContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FormsFooterButtonContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FormsFooterButtonContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (FormsFooterButtonContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static FormsFooterButtonContext parseFrom(InputStream inputStream) throws IOException {
        return (FormsFooterButtonContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FormsFooterButtonContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (FormsFooterButtonContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static FormsFooterButtonContext parseFrom(t tVar) throws IOException {
        return (FormsFooterButtonContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static FormsFooterButtonContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (FormsFooterButtonContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
