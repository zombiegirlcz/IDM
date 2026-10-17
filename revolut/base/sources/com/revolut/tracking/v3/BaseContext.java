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
import grl.r0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class BaseContext extends w0 implements e2 {
    public static final int CONTEXT_TYPE_FIELD_NUMBER = 2;
    private static final BaseContext DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 5;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int RATE_FIELD_NUMBER = 4;
    public static final int SUCCESSFUL_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean successful_;
    private String id_ = "";
    private String contextType_ = "";
    private String rate_ = "";
    private String errorMessage_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(BaseContext.DEFAULT_INSTANCE);
        }
    }

    static {
        BaseContext baseContext = new BaseContext();
        DEFAULT_INSTANCE = baseContext;
        w0.registerDefaultInstance(BaseContext.class, baseContext);
    }

    private BaseContext() {
    }

    private void clearContextType() {
        this.bitField0_ &= -3;
        this.contextType_ = getDefaultInstance().getContextType();
    }

    private void clearErrorMessage() {
        this.bitField0_ &= -17;
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    private void clearRate() {
        this.bitField0_ &= -9;
        this.rate_ = getDefaultInstance().getRate();
    }

    private void clearSuccessful() {
        this.bitField0_ &= -5;
        this.successful_ = false;
    }

    public static BaseContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static BaseContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BaseContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BaseContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BaseContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextType(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.contextType_ = str;
    }

    private void setContextTypeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.contextType_ = pVar.m();
        this.bitField0_ |= 2;
    }

    private void setErrorMessage(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.errorMessage_ = str;
    }

    private void setErrorMessageBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.errorMessage_ = pVar.m();
        this.bitField0_ |= 16;
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

    private void setRate(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.rate_ = str;
    }

    private void setRateBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.rate_ = pVar.m();
        this.bitField0_ |= 8;
    }

    private void setSuccessful(boolean z) {
        this.bitField0_ |= 4;
        this.successful_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (r0.f146187a[v0Var.ordinal()]) {
            case 1:
                return new BaseContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "id_", "contextType_", "successful_", "rate_", "errorMessage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (BaseContext.class) {
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

    public String getContextType() {
        return this.contextType_;
    }

    public p getContextTypeBytes() {
        return p.d(this.contextType_);
    }

    public String getErrorMessage() {
        return this.errorMessage_;
    }

    public p getErrorMessageBytes() {
        return p.d(this.errorMessage_);
    }

    public String getId() {
        return this.id_;
    }

    public p getIdBytes() {
        return p.d(this.id_);
    }

    public String getRate() {
        return this.rate_;
    }

    public p getRateBytes() {
        return p.d(this.rate_);
    }

    public boolean getSuccessful() {
        return this.successful_;
    }

    public boolean hasContextType() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasErrorMessage() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRate() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSuccessful() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(BaseContext baseContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(baseContext);
    }

    public static BaseContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (BaseContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static BaseContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (BaseContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static BaseContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (BaseContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static BaseContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (BaseContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static BaseContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BaseContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BaseContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (BaseContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static BaseContext parseFrom(InputStream inputStream) throws IOException {
        return (BaseContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BaseContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (BaseContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static BaseContext parseFrom(t tVar) throws IOException {
        return (BaseContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static BaseContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (BaseContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
