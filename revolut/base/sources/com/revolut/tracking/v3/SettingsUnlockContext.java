package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import grl.dc;
import grl.fc;
import grl.hc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsUnlockContext extends w0 implements e2 {
    public static final int ACCESSIBILITY_SERVICES_FIELD_NUMBER = 3;
    private static final SettingsUnlockContext DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 1;
    public static final int OUTCOME_FIELD_NUMBER = 2;
    private static volatile m2 PARSER;
    private h3 accessibilityServices_;
    private int bitField0_;
    private int method_;
    private int outcome_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsUnlockContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsUnlockContext settingsUnlockContext = new SettingsUnlockContext();
        DEFAULT_INSTANCE = settingsUnlockContext;
        w0.registerDefaultInstance(SettingsUnlockContext.class, settingsUnlockContext);
    }

    private SettingsUnlockContext() {
    }

    private void clearAccessibilityServices() {
        this.accessibilityServices_ = null;
        this.bitField0_ &= -5;
    }

    private void clearMethod() {
        this.bitField0_ &= -2;
        this.method_ = 0;
    }

    private void clearOutcome() {
        this.bitField0_ &= -3;
        this.outcome_ = 0;
    }

    public static SettingsUnlockContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAccessibilityServices(h3 h3Var) {
        h3Var.getClass();
        h3 h3Var2 = this.accessibilityServices_;
        if (h3Var2 == null || h3Var2 == h3.getDefaultInstance()) {
            this.accessibilityServices_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder(this.accessibilityServices_);
            f3VarNewBuilder.f(h3Var);
            this.accessibilityServices_ = (h3) f3VarNewBuilder.b();
        }
        this.bitField0_ |= 4;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsUnlockContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsUnlockContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsUnlockContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsUnlockContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAccessibilityServices(h3 h3Var) {
        h3Var.getClass();
        this.accessibilityServices_ = h3Var;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(fc fcVar) {
        this.method_ = fcVar.getNumber();
        this.bitField0_ |= 1;
    }

    private void setMethodValue(int i) {
        this.bitField0_ |= 1;
        this.method_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutcome(hc hcVar) {
        this.outcome_ = hcVar.getNumber();
        this.bitField0_ |= 2;
    }

    private void setOutcomeValue(int i) {
        this.bitField0_ |= 2;
        this.outcome_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (dc.f146080a[v0Var.ordinal()]) {
            case 1:
                return new SettingsUnlockContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "method_", "outcome_", "accessibilityServices_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsUnlockContext.class) {
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

    public h3 getAccessibilityServices() {
        h3 h3Var = this.accessibilityServices_;
        return h3Var == null ? h3.getDefaultInstance() : h3Var;
    }

    public fc getMethod() {
        int i = this.method_;
        fc fcVar = i != 0 ? i != 1 ? i != 2 ? null : fc.Pin : fc.Fingerprint : fc.Face;
        return fcVar == null ? fc.UNRECOGNIZED : fcVar;
    }

    public int getMethodValue() {
        return this.method_;
    }

    public hc getOutcome() {
        hc hcVarA = hc.a(this.outcome_);
        return hcVarA == null ? hc.UNRECOGNIZED : hcVarA;
    }

    public int getOutcomeValue() {
        return this.outcome_;
    }

    public boolean hasAccessibilityServices() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMethod() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOutcome() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(SettingsUnlockContext settingsUnlockContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsUnlockContext);
    }

    public static SettingsUnlockContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsUnlockContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsUnlockContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsUnlockContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsUnlockContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsUnlockContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsUnlockContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsUnlockContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsUnlockContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsUnlockContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsUnlockContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsUnlockContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsUnlockContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsUnlockContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsUnlockContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsUnlockContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsUnlockContext parseFrom(t tVar) throws IOException {
        return (SettingsUnlockContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsUnlockContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsUnlockContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
