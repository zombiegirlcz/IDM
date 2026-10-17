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
import grl.ra;
import grl.ta;
import grl.va;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsAppLifecycleContext extends w0 implements e2 {
    private static final SettingsAppLifecycleContext DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private int event_;
    private int kind_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsAppLifecycleContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsAppLifecycleContext settingsAppLifecycleContext = new SettingsAppLifecycleContext();
        DEFAULT_INSTANCE = settingsAppLifecycleContext;
        w0.registerDefaultInstance(SettingsAppLifecycleContext.class, settingsAppLifecycleContext);
    }

    private SettingsAppLifecycleContext() {
    }

    private void clearEvent() {
        this.bitField0_ &= -3;
        this.event_ = 0;
    }

    private void clearKind() {
        this.bitField0_ &= -2;
        this.kind_ = 0;
    }

    public static SettingsAppLifecycleContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsAppLifecycleContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsAppLifecycleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsAppLifecycleContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsAppLifecycleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEvent(ta taVar) {
        this.event_ = taVar.getNumber();
        this.bitField0_ |= 2;
    }

    private void setEventValue(int i) {
        this.bitField0_ |= 2;
        this.event_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(va vaVar) {
        this.kind_ = vaVar.getNumber();
        this.bitField0_ |= 1;
    }

    private void setKindValue(int i) {
        this.bitField0_ |= 1;
        this.kind_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (ra.f146193a[v0Var.ordinal()]) {
            case 1:
                return new SettingsAppLifecycleContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "kind_", "event_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsAppLifecycleContext.class) {
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

    public ta getEvent() {
        int i = this.event_;
        ta taVar = i != 0 ? i != 1 ? null : ta.closed : ta.opened;
        return taVar == null ? ta.UNRECOGNIZED : taVar;
    }

    public int getEventValue() {
        return this.event_;
    }

    public va getKind() {
        int i = this.kind_;
        va vaVar = i != 0 ? i != 1 ? null : va.App : va.Watch;
        return vaVar == null ? va.UNRECOGNIZED : vaVar;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public boolean hasEvent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasKind() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(SettingsAppLifecycleContext settingsAppLifecycleContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsAppLifecycleContext);
    }

    public static SettingsAppLifecycleContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsAppLifecycleContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsAppLifecycleContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsAppLifecycleContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsAppLifecycleContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsAppLifecycleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsAppLifecycleContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsAppLifecycleContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsAppLifecycleContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsAppLifecycleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsAppLifecycleContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsAppLifecycleContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsAppLifecycleContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsAppLifecycleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsAppLifecycleContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsAppLifecycleContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsAppLifecycleContext parseFrom(t tVar) throws IOException {
        return (SettingsAppLifecycleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsAppLifecycleContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsAppLifecycleContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
