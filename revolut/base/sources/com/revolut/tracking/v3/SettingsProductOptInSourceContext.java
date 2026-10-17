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
import grl.pb;
import grl.rb;
import grl.tb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class SettingsProductOptInSourceContext extends w0 implements e2 {
    public static final int ACCOUNT_ID_FIELD_NUMBER = 1;
    public static final int ADDITIONAL_CONTEXT_FIELD_NUMBER = 3;
    private static final SettingsProductOptInSourceContext DEFAULT_INSTANCE;
    public static final int OPT_IN_SOURCE_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int PRODUCT_FIELD_NUMBER = 4;
    private String accountId_ = "";
    private String additionalContext_ = "";
    private int bitField0_;
    private int optInSource_;
    private int product_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsProductOptInSourceContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsProductOptInSourceContext settingsProductOptInSourceContext = new SettingsProductOptInSourceContext();
        DEFAULT_INSTANCE = settingsProductOptInSourceContext;
        w0.registerDefaultInstance(SettingsProductOptInSourceContext.class, settingsProductOptInSourceContext);
    }

    private SettingsProductOptInSourceContext() {
    }

    private void clearAccountId() {
        this.bitField0_ &= -2;
        this.accountId_ = getDefaultInstance().getAccountId();
    }

    private void clearAdditionalContext() {
        this.bitField0_ &= -5;
        this.additionalContext_ = getDefaultInstance().getAdditionalContext();
    }

    private void clearOptInSource() {
        this.bitField0_ &= -3;
        this.optInSource_ = 0;
    }

    private void clearProduct() {
        this.bitField0_ &= -9;
        this.product_ = 0;
    }

    public static SettingsProductOptInSourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsProductOptInSourceContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsProductOptInSourceContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsProductOptInSourceContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsProductOptInSourceContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccountId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.accountId_ = str;
    }

    private void setAccountIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.accountId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalContext(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.additionalContext_ = str;
    }

    private void setAdditionalContextBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.additionalContext_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptInSource(tb tbVar) {
        this.optInSource_ = tbVar.getNumber();
        this.bitField0_ |= 2;
    }

    private void setOptInSourceValue(int i) {
        this.bitField0_ |= 2;
        this.optInSource_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProduct(rb rbVar) {
        this.product_ = rbVar.getNumber();
        this.bitField0_ |= 8;
    }

    private void setProductValue(int i) {
        this.bitField0_ |= 8;
        this.product_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (pb.f146175a[v0Var.ordinal()]) {
            case 1:
                return new SettingsProductOptInSourceContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001\u0003ለ\u0002\u0004ဌ\u0003", new Object[]{"bitField0_", "accountId_", "optInSource_", "additionalContext_", "product_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsProductOptInSourceContext.class) {
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

    public String getAccountId() {
        return this.accountId_;
    }

    public p getAccountIdBytes() {
        return p.d(this.accountId_);
    }

    public String getAdditionalContext() {
        return this.additionalContext_;
    }

    public p getAdditionalContextBytes() {
        return p.d(this.additionalContext_);
    }

    public tb getOptInSource() {
        tb tbVarA = tb.a(this.optInSource_);
        return tbVarA == null ? tb.UNRECOGNIZED : tbVarA;
    }

    public int getOptInSourceValue() {
        return this.optInSource_;
    }

    public rb getProduct() {
        rb rbVar = this.product_ != 0 ? null : rb.LOYALTY;
        return rbVar == null ? rb.UNRECOGNIZED : rbVar;
    }

    public int getProductValue() {
        return this.product_;
    }

    public boolean hasAccountId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAdditionalContext() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasOptInSource() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasProduct() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(SettingsProductOptInSourceContext settingsProductOptInSourceContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsProductOptInSourceContext);
    }

    public static SettingsProductOptInSourceContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsProductOptInSourceContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsProductOptInSourceContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsProductOptInSourceContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsProductOptInSourceContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsProductOptInSourceContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsProductOptInSourceContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsProductOptInSourceContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsProductOptInSourceContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsProductOptInSourceContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsProductOptInSourceContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsProductOptInSourceContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsProductOptInSourceContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsProductOptInSourceContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsProductOptInSourceContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsProductOptInSourceContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsProductOptInSourceContext parseFrom(t tVar) throws IOException {
        return (SettingsProductOptInSourceContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsProductOptInSourceContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsProductOptInSourceContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
