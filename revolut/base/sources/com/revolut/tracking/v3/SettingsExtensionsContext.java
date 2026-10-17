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
import grl.ab;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsExtensionsContext extends w0 implements e2 {
    private static final SettingsExtensionsContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int WATCHAPPINSTALLED_FIELD_NUMBER = 3;
    public static final int WATCHCOMPLICATIONENABLED_FIELD_NUMBER = 4;
    public static final int WATCH_FIELD_NUMBER = 1;
    public static final int WIDGETS_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean watchAppInstalled_;
    private boolean watchComplicationEnabled_;
    private boolean watch_;
    private boolean widgets_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsExtensionsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsExtensionsContext settingsExtensionsContext = new SettingsExtensionsContext();
        DEFAULT_INSTANCE = settingsExtensionsContext;
        w0.registerDefaultInstance(SettingsExtensionsContext.class, settingsExtensionsContext);
    }

    private SettingsExtensionsContext() {
    }

    private void clearWatch() {
        this.bitField0_ &= -2;
        this.watch_ = false;
    }

    private void clearWatchAppInstalled() {
        this.bitField0_ &= -5;
        this.watchAppInstalled_ = false;
    }

    private void clearWatchComplicationEnabled() {
        this.bitField0_ &= -9;
        this.watchComplicationEnabled_ = false;
    }

    private void clearWidgets() {
        this.bitField0_ &= -3;
        this.widgets_ = false;
    }

    public static SettingsExtensionsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsExtensionsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsExtensionsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsExtensionsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsExtensionsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setWatch(boolean z) {
        this.bitField0_ |= 1;
        this.watch_ = z;
    }

    private void setWatchAppInstalled(boolean z) {
        this.bitField0_ |= 4;
        this.watchAppInstalled_ = z;
    }

    private void setWatchComplicationEnabled(boolean z) {
        this.bitField0_ |= 8;
        this.watchComplicationEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgets(boolean z) {
        this.bitField0_ |= 2;
        this.widgets_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (ab.f146059a[v0Var.ordinal()]) {
            case 1:
                return new SettingsExtensionsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "watch_", "widgets_", "watchAppInstalled_", "watchComplicationEnabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsExtensionsContext.class) {
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

    public boolean getWatch() {
        return this.watch_;
    }

    public boolean getWatchAppInstalled() {
        return this.watchAppInstalled_;
    }

    public boolean getWatchComplicationEnabled() {
        return this.watchComplicationEnabled_;
    }

    public boolean getWidgets() {
        return this.widgets_;
    }

    public boolean hasWatch() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasWatchAppInstalled() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasWatchComplicationEnabled() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasWidgets() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(SettingsExtensionsContext settingsExtensionsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsExtensionsContext);
    }

    public static SettingsExtensionsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsExtensionsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsExtensionsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsExtensionsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsExtensionsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsExtensionsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsExtensionsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsExtensionsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsExtensionsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsExtensionsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsExtensionsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsExtensionsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsExtensionsContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsExtensionsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsExtensionsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsExtensionsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsExtensionsContext parseFrom(t tVar) throws IOException {
        return (SettingsExtensionsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsExtensionsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsExtensionsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
