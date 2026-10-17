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
import grl.ub;
import grl.wb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsSecurityContext extends w0 implements e2 {
    private static final SettingsSecurityContext DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int PROTECTION_VERSION_FIELD_NUMBER = 5;
    public static final int REASONS_FIELD_NUMBER = 3;
    public static final int RESULT_FIELD_NUMBER = 2;
    public static final int SESSION_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private int kind_;
    private boolean result_;
    private String reasons_ = "";
    private String sessionId_ = "";
    private String protectionVersion_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsSecurityContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsSecurityContext settingsSecurityContext = new SettingsSecurityContext();
        DEFAULT_INSTANCE = settingsSecurityContext;
        w0.registerDefaultInstance(SettingsSecurityContext.class, settingsSecurityContext);
    }

    private SettingsSecurityContext() {
    }

    private void clearKind() {
        this.bitField0_ &= -2;
        this.kind_ = 0;
    }

    private void clearProtectionVersion() {
        this.bitField0_ &= -17;
        this.protectionVersion_ = getDefaultInstance().getProtectionVersion();
    }

    private void clearReasons() {
        this.bitField0_ &= -5;
        this.reasons_ = getDefaultInstance().getReasons();
    }

    private void clearResult() {
        this.bitField0_ &= -3;
        this.result_ = false;
    }

    private void clearSessionId() {
        this.bitField0_ &= -9;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    public static SettingsSecurityContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsSecurityContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsSecurityContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsSecurityContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsSecurityContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(wb wbVar) {
        this.kind_ = wbVar.getNumber();
        this.bitField0_ |= 1;
    }

    private void setKindValue(int i) {
        this.bitField0_ |= 1;
        this.kind_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProtectionVersion(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.protectionVersion_ = str;
    }

    private void setProtectionVersionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.protectionVersion_ = pVar.m();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasons(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.reasons_ = str;
    }

    private void setReasonsBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.reasons_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResult(boolean z) {
        this.bitField0_ |= 2;
        this.result_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.sessionId_ = str;
    }

    private void setSessionIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.sessionId_ = pVar.m();
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (ub.f146217a[v0Var.ordinal()]) {
            case 1:
                return new SettingsSecurityContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "kind_", "result_", "reasons_", "sessionId_", "protectionVersion_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsSecurityContext.class) {
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

    public wb getKind() {
        wb wbVarA = wb.a(this.kind_);
        return wbVarA == null ? wb.UNRECOGNIZED : wbVarA;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public String getProtectionVersion() {
        return this.protectionVersion_;
    }

    public p getProtectionVersionBytes() {
        return p.d(this.protectionVersion_);
    }

    public String getReasons() {
        return this.reasons_;
    }

    public p getReasonsBytes() {
        return p.d(this.reasons_);
    }

    public boolean getResult() {
        return this.result_;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public p getSessionIdBytes() {
        return p.d(this.sessionId_);
    }

    public boolean hasKind() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasProtectionVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasReasons() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasResult() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(SettingsSecurityContext settingsSecurityContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsSecurityContext);
    }

    public static SettingsSecurityContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsSecurityContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsSecurityContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsSecurityContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsSecurityContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsSecurityContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsSecurityContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsSecurityContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsSecurityContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsSecurityContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsSecurityContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsSecurityContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsSecurityContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsSecurityContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsSecurityContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsSecurityContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsSecurityContext parseFrom(t tVar) throws IOException {
        return (SettingsSecurityContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsSecurityContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsSecurityContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
