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
import grl.wa;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsAppSizeContext extends w0 implements e2 {
    public static final int APPKB_FIELD_NUMBER = 1;
    public static final int CACHEKB_FIELD_NUMBER = 3;
    public static final int DATAKB_FIELD_NUMBER = 2;
    private static final SettingsAppSizeContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER;
    private int appKB_;
    private int bitField0_;
    private int cacheKB_;
    private int dataKB_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsAppSizeContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsAppSizeContext settingsAppSizeContext = new SettingsAppSizeContext();
        DEFAULT_INSTANCE = settingsAppSizeContext;
        w0.registerDefaultInstance(SettingsAppSizeContext.class, settingsAppSizeContext);
    }

    private SettingsAppSizeContext() {
    }

    private void clearAppKB() {
        this.bitField0_ &= -2;
        this.appKB_ = 0;
    }

    private void clearCacheKB() {
        this.bitField0_ &= -5;
        this.cacheKB_ = 0;
    }

    private void clearDataKB() {
        this.bitField0_ &= -3;
        this.dataKB_ = 0;
    }

    public static SettingsAppSizeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsAppSizeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsAppSizeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsAppSizeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsAppSizeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAppKB(int i) {
        this.bitField0_ |= 1;
        this.appKB_ = i;
    }

    private void setCacheKB(int i) {
        this.bitField0_ |= 4;
        this.cacheKB_ = i;
    }

    private void setDataKB(int i) {
        this.bitField0_ |= 2;
        this.dataKB_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (wa.f146228a[v0Var.ordinal()]) {
            case 1:
                return new SettingsAppSizeContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "appKB_", "dataKB_", "cacheKB_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsAppSizeContext.class) {
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

    public int getAppKB() {
        return this.appKB_;
    }

    public int getCacheKB() {
        return this.cacheKB_;
    }

    public int getDataKB() {
        return this.dataKB_;
    }

    public boolean hasAppKB() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCacheKB() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDataKB() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(SettingsAppSizeContext settingsAppSizeContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsAppSizeContext);
    }

    public static SettingsAppSizeContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsAppSizeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsAppSizeContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsAppSizeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsAppSizeContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsAppSizeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsAppSizeContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsAppSizeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsAppSizeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsAppSizeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsAppSizeContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsAppSizeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsAppSizeContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsAppSizeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsAppSizeContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsAppSizeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsAppSizeContext parseFrom(t tVar) throws IOException {
        return (SettingsAppSizeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsAppSizeContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsAppSizeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
