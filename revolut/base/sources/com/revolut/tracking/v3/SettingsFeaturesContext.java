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
import grl.bb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsFeaturesContext extends w0 implements e2 {
    public static final int APPLIED_FEATURE_FLAGS_FIELD_NUMBER = 2;
    private static final SettingsFeaturesContext DEFAULT_INSTANCE;
    public static final int FEATURE_FLAGS_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int RECEIVED_FEATURE_FLAGS_FIELD_NUMBER = 3;
    private h3 appliedFeatureFlags_;
    private int bitField0_;
    private h3 featureFlags_;
    private h3 receivedFeatureFlags_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsFeaturesContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsFeaturesContext settingsFeaturesContext = new SettingsFeaturesContext();
        DEFAULT_INSTANCE = settingsFeaturesContext;
        w0.registerDefaultInstance(SettingsFeaturesContext.class, settingsFeaturesContext);
    }

    private SettingsFeaturesContext() {
    }

    private void clearAppliedFeatureFlags() {
        this.appliedFeatureFlags_ = null;
        this.bitField0_ &= -3;
    }

    private void clearFeatureFlags() {
        this.featureFlags_ = null;
        this.bitField0_ &= -2;
    }

    private void clearReceivedFeatureFlags() {
        this.receivedFeatureFlags_ = null;
        this.bitField0_ &= -5;
    }

    public static SettingsFeaturesContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAppliedFeatureFlags(h3 h3Var) {
        h3Var.getClass();
        h3 h3Var2 = this.appliedFeatureFlags_;
        if (h3Var2 == null || h3Var2 == h3.getDefaultInstance()) {
            this.appliedFeatureFlags_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder(this.appliedFeatureFlags_);
            f3VarNewBuilder.f(h3Var);
            this.appliedFeatureFlags_ = (h3) f3VarNewBuilder.b();
        }
        this.bitField0_ |= 2;
    }

    private void mergeFeatureFlags(h3 h3Var) {
        h3Var.getClass();
        h3 h3Var2 = this.featureFlags_;
        if (h3Var2 == null || h3Var2 == h3.getDefaultInstance()) {
            this.featureFlags_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder(this.featureFlags_);
            f3VarNewBuilder.f(h3Var);
            this.featureFlags_ = (h3) f3VarNewBuilder.b();
        }
        this.bitField0_ |= 1;
    }

    private void mergeReceivedFeatureFlags(h3 h3Var) {
        h3Var.getClass();
        h3 h3Var2 = this.receivedFeatureFlags_;
        if (h3Var2 == null || h3Var2 == h3.getDefaultInstance()) {
            this.receivedFeatureFlags_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder(this.receivedFeatureFlags_);
            f3VarNewBuilder.f(h3Var);
            this.receivedFeatureFlags_ = (h3) f3VarNewBuilder.b();
        }
        this.bitField0_ |= 4;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsFeaturesContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsFeaturesContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsFeaturesContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsFeaturesContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppliedFeatureFlags(h3 h3Var) {
        h3Var.getClass();
        this.appliedFeatureFlags_ = h3Var;
        this.bitField0_ |= 2;
    }

    private void setFeatureFlags(h3 h3Var) {
        h3Var.getClass();
        this.featureFlags_ = h3Var;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceivedFeatureFlags(h3 h3Var) {
        h3Var.getClass();
        this.receivedFeatureFlags_ = h3Var;
        this.bitField0_ |= 4;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (bb.f146066a[v0Var.ordinal()]) {
            case 1:
                return new SettingsFeaturesContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "featureFlags_", "appliedFeatureFlags_", "receivedFeatureFlags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsFeaturesContext.class) {
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

    public h3 getAppliedFeatureFlags() {
        h3 h3Var = this.appliedFeatureFlags_;
        return h3Var == null ? h3.getDefaultInstance() : h3Var;
    }

    public h3 getFeatureFlags() {
        h3 h3Var = this.featureFlags_;
        return h3Var == null ? h3.getDefaultInstance() : h3Var;
    }

    public h3 getReceivedFeatureFlags() {
        h3 h3Var = this.receivedFeatureFlags_;
        return h3Var == null ? h3.getDefaultInstance() : h3Var;
    }

    public boolean hasAppliedFeatureFlags() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFeatureFlags() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasReceivedFeatureFlags() {
        return (this.bitField0_ & 4) != 0;
    }

    public static a newBuilder(SettingsFeaturesContext settingsFeaturesContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsFeaturesContext);
    }

    public static SettingsFeaturesContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsFeaturesContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsFeaturesContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsFeaturesContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsFeaturesContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsFeaturesContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsFeaturesContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsFeaturesContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsFeaturesContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsFeaturesContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsFeaturesContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsFeaturesContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsFeaturesContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsFeaturesContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsFeaturesContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsFeaturesContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsFeaturesContext parseFrom(t tVar) throws IOException {
        return (SettingsFeaturesContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsFeaturesContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsFeaturesContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
