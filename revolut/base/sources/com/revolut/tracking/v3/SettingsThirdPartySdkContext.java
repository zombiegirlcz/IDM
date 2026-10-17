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
import grl.ac;
import grl.cc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class SettingsThirdPartySdkContext extends w0 implements e2 {
    private static final SettingsThirdPartySdkContext DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int PARAMETERS_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int VENDOR_FIELD_NUMBER = 1;
    private int bitField0_;
    private int event_;
    private h3 parameters_;
    private String vendor_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsThirdPartySdkContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsThirdPartySdkContext settingsThirdPartySdkContext = new SettingsThirdPartySdkContext();
        DEFAULT_INSTANCE = settingsThirdPartySdkContext;
        w0.registerDefaultInstance(SettingsThirdPartySdkContext.class, settingsThirdPartySdkContext);
    }

    private SettingsThirdPartySdkContext() {
    }

    private void clearEvent() {
        this.bitField0_ &= -3;
        this.event_ = 0;
    }

    private void clearParameters() {
        this.parameters_ = null;
        this.bitField0_ &= -5;
    }

    private void clearVendor() {
        this.bitField0_ &= -2;
        this.vendor_ = getDefaultInstance().getVendor();
    }

    public static SettingsThirdPartySdkContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeParameters(h3 h3Var) {
        h3Var.getClass();
        h3 h3Var2 = this.parameters_;
        if (h3Var2 == null || h3Var2 == h3.getDefaultInstance()) {
            this.parameters_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder(this.parameters_);
            f3VarNewBuilder.f(h3Var);
            this.parameters_ = (h3) f3VarNewBuilder.b();
        }
        this.bitField0_ |= 4;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsThirdPartySdkContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsThirdPartySdkContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsThirdPartySdkContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsThirdPartySdkContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(cc ccVar) {
        this.event_ = ccVar.getNumber();
        this.bitField0_ |= 2;
    }

    private void setEventValue(int i) {
        this.bitField0_ |= 2;
        this.event_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameters(h3 h3Var) {
        h3Var.getClass();
        this.parameters_ = h3Var;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVendor(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.vendor_ = str;
    }

    private void setVendorBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.vendor_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (ac.f146060a[v0Var.ordinal()]) {
            case 1:
                return new SettingsThirdPartySdkContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "vendor_", "event_", "parameters_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsThirdPartySdkContext.class) {
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

    public cc getEvent() {
        cc ccVarA = cc.a(this.event_);
        return ccVarA == null ? cc.UNRECOGNIZED : ccVarA;
    }

    public int getEventValue() {
        return this.event_;
    }

    public h3 getParameters() {
        h3 h3Var = this.parameters_;
        return h3Var == null ? h3.getDefaultInstance() : h3Var;
    }

    public String getVendor() {
        return this.vendor_;
    }

    public p getVendorBytes() {
        return p.d(this.vendor_);
    }

    public boolean hasEvent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasParameters() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVendor() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(SettingsThirdPartySdkContext settingsThirdPartySdkContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsThirdPartySdkContext);
    }

    public static SettingsThirdPartySdkContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsThirdPartySdkContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsThirdPartySdkContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsThirdPartySdkContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsThirdPartySdkContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsThirdPartySdkContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsThirdPartySdkContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsThirdPartySdkContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsThirdPartySdkContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsThirdPartySdkContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsThirdPartySdkContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsThirdPartySdkContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsThirdPartySdkContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsThirdPartySdkContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsThirdPartySdkContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsThirdPartySdkContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsThirdPartySdkContext parseFrom(t tVar) throws IOException {
        return (SettingsThirdPartySdkContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsThirdPartySdkContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsThirdPartySdkContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
