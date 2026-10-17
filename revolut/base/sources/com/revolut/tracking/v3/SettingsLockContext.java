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
import grl.cb;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsLockContext extends w0 implements e2 {
    private static final SettingsLockContext DEFAULT_INSTANCE;
    public static final int IS_DEVICE_LOCK_PROTECTED_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private boolean isDeviceLockProtected_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsLockContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsLockContext settingsLockContext = new SettingsLockContext();
        DEFAULT_INSTANCE = settingsLockContext;
        w0.registerDefaultInstance(SettingsLockContext.class, settingsLockContext);
    }

    private SettingsLockContext() {
    }

    private void clearIsDeviceLockProtected() {
        this.bitField0_ &= -2;
        this.isDeviceLockProtected_ = false;
    }

    public static SettingsLockContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsLockContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsLockContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsLockContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsLockContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDeviceLockProtected(boolean z) {
        this.bitField0_ |= 1;
        this.isDeviceLockProtected_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (cb.f146073a[v0Var.ordinal()]) {
            case 1:
                return new SettingsLockContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isDeviceLockProtected_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsLockContext.class) {
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

    public boolean getIsDeviceLockProtected() {
        return this.isDeviceLockProtected_;
    }

    public boolean hasIsDeviceLockProtected() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(SettingsLockContext settingsLockContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsLockContext);
    }

    public static SettingsLockContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsLockContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsLockContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsLockContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsLockContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsLockContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsLockContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsLockContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsLockContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsLockContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsLockContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsLockContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsLockContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsLockContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsLockContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsLockContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsLockContext parseFrom(t tVar) throws IOException {
        return (SettingsLockContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsLockContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsLockContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
