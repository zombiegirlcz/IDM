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
public final class AccountDetailsContext extends w0 implements e2 {
    public static final int CURRENCY_FIELD_NUMBER = 2;
    private static final AccountDetailsContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int TAB_FIELD_NUMBER = 1;
    private int bitField0_;
    private String tab_ = "";
    private String currency_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((AccountDetailsContext) this.f49761b).setCurrency(str);
        }

        private a() {
            super(AccountDetailsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AccountDetailsContext accountDetailsContext = new AccountDetailsContext();
        DEFAULT_INSTANCE = accountDetailsContext;
        w0.registerDefaultInstance(AccountDetailsContext.class, accountDetailsContext);
    }

    private AccountDetailsContext() {
    }

    private void clearCurrency() {
        this.bitField0_ &= -3;
        this.currency_ = getDefaultInstance().getCurrency();
    }

    private void clearTab() {
        this.bitField0_ &= -2;
        this.tab_ = getDefaultInstance().getTab();
    }

    public static AccountDetailsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static AccountDetailsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AccountDetailsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AccountDetailsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AccountDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrency(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.currency_ = str;
    }

    private void setCurrencyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.currency_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTab(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.tab_ = str;
    }

    private void setTabBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.tab_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (grl.e.f146083a[v0Var.ordinal()]) {
            case 1:
                return new AccountDetailsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "tab_", "currency_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AccountDetailsContext.class) {
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

    public String getCurrency() {
        return this.currency_;
    }

    public p getCurrencyBytes() {
        return p.d(this.currency_);
    }

    public String getTab() {
        return this.tab_;
    }

    public p getTabBytes() {
        return p.d(this.tab_);
    }

    public boolean hasCurrency() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTab() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(AccountDetailsContext accountDetailsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(accountDetailsContext);
    }

    public static AccountDetailsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AccountDetailsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AccountDetailsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AccountDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AccountDetailsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AccountDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AccountDetailsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AccountDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AccountDetailsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AccountDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AccountDetailsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AccountDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AccountDetailsContext parseFrom(InputStream inputStream) throws IOException {
        return (AccountDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AccountDetailsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AccountDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AccountDetailsContext parseFrom(t tVar) throws IOException {
        return (AccountDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AccountDetailsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AccountDetailsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
