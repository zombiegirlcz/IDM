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
import grl.db;
import grl.fb;
import grl.hb;
import grl.jb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsMultifactorContext extends w0 implements e2 {
    public static final int ACCESSIBILITY_SERVICES_FIELD_NUMBER = 2;
    public static final int CODE_AUTOFILLED_FIELD_NUMBER = 1;
    private static final SettingsMultifactorContext DEFAULT_INSTANCE;
    public static final int FLOW_FIELD_NUMBER = 5;
    public static final int KIND_FIELD_NUMBER = 4;
    public static final int OUTCOME_FIELD_NUMBER = 3;
    private static volatile m2 PARSER;
    private h3 accessibilityServices_;
    private int bitField0_;
    private boolean codeAutofilled_;
    private int flow_;
    private int kind_;
    private int outcome_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsMultifactorContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsMultifactorContext settingsMultifactorContext = new SettingsMultifactorContext();
        DEFAULT_INSTANCE = settingsMultifactorContext;
        w0.registerDefaultInstance(SettingsMultifactorContext.class, settingsMultifactorContext);
    }

    private SettingsMultifactorContext() {
    }

    private void clearAccessibilityServices() {
        this.accessibilityServices_ = null;
        this.bitField0_ &= -3;
    }

    private void clearCodeAutofilled() {
        this.bitField0_ &= -2;
        this.codeAutofilled_ = false;
    }

    private void clearFlow() {
        this.bitField0_ &= -17;
        this.flow_ = 0;
    }

    private void clearKind() {
        this.bitField0_ &= -9;
        this.kind_ = 0;
    }

    private void clearOutcome() {
        this.bitField0_ &= -5;
        this.outcome_ = 0;
    }

    public static SettingsMultifactorContext getDefaultInstance() {
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
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsMultifactorContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsMultifactorContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsMultifactorContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsMultifactorContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAccessibilityServices(h3 h3Var) {
        h3Var.getClass();
        this.accessibilityServices_ = h3Var;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeAutofilled(boolean z) {
        this.bitField0_ |= 1;
        this.codeAutofilled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlow(fb fbVar) {
        this.flow_ = fbVar.getNumber();
        this.bitField0_ |= 16;
    }

    private void setFlowValue(int i) {
        this.bitField0_ |= 16;
        this.flow_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(hb hbVar) {
        this.kind_ = hbVar.getNumber();
        this.bitField0_ |= 8;
    }

    private void setKindValue(int i) {
        this.bitField0_ |= 8;
        this.kind_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutcome(jb jbVar) {
        this.outcome_ = jbVar.getNumber();
        this.bitField0_ |= 4;
    }

    private void setOutcomeValue(int i) {
        this.bitField0_ |= 4;
        this.outcome_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (db.f146079a[v0Var.ordinal()]) {
            case 1:
                return new SettingsMultifactorContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"bitField0_", "codeAutofilled_", "accessibilityServices_", "outcome_", "kind_", "flow_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsMultifactorContext.class) {
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

    public boolean getCodeAutofilled() {
        return this.codeAutofilled_;
    }

    public fb getFlow() {
        fb fbVarA = fb.a(this.flow_);
        return fbVarA == null ? fb.UNRECOGNIZED : fbVarA;
    }

    public int getFlowValue() {
        return this.flow_;
    }

    public hb getKind() {
        hb hbVarA = hb.a(this.kind_);
        return hbVarA == null ? hb.UNRECOGNIZED : hbVarA;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public jb getOutcome() {
        jb jbVarA = jb.a(this.outcome_);
        return jbVarA == null ? jb.UNRECOGNIZED : jbVarA;
    }

    public int getOutcomeValue() {
        return this.outcome_;
    }

    public boolean hasAccessibilityServices() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCodeAutofilled() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFlow() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasKind() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOutcome() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(SettingsMultifactorContext settingsMultifactorContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsMultifactorContext);
    }

    public static SettingsMultifactorContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsMultifactorContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsMultifactorContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsMultifactorContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsMultifactorContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsMultifactorContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsMultifactorContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsMultifactorContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsMultifactorContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsMultifactorContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsMultifactorContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsMultifactorContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsMultifactorContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsMultifactorContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsMultifactorContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsMultifactorContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsMultifactorContext parseFrom(t tVar) throws IOException {
        return (SettingsMultifactorContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsMultifactorContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsMultifactorContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
