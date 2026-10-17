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
import grl.kb;
import grl.mb;
import grl.ob;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SettingsPermissionsContext extends w0 implements e2 {
    private static final SettingsPermissionsContext DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private int kind_;
    private int state_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(SettingsPermissionsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SettingsPermissionsContext settingsPermissionsContext = new SettingsPermissionsContext();
        DEFAULT_INSTANCE = settingsPermissionsContext;
        w0.registerDefaultInstance(SettingsPermissionsContext.class, settingsPermissionsContext);
    }

    private SettingsPermissionsContext() {
    }

    private void clearKind() {
        this.bitField0_ &= -2;
        this.kind_ = 0;
    }

    private void clearState() {
        this.bitField0_ &= -3;
        this.state_ = 0;
    }

    public static SettingsPermissionsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SettingsPermissionsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SettingsPermissionsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsPermissionsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SettingsPermissionsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(mb mbVar) {
        this.kind_ = mbVar.getNumber();
        this.bitField0_ |= 1;
    }

    private void setKindValue(int i) {
        this.bitField0_ |= 1;
        this.kind_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(ob obVar) {
        this.state_ = obVar.getNumber();
        this.bitField0_ |= 2;
    }

    private void setStateValue(int i) {
        this.bitField0_ |= 2;
        this.state_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (kb.f146130a[v0Var.ordinal()]) {
            case 1:
                return new SettingsPermissionsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "kind_", "state_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SettingsPermissionsContext.class) {
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

    public mb getKind() {
        mb mbVarA = mb.a(this.kind_);
        return mbVarA == null ? mb.UNRECOGNIZED : mbVarA;
    }

    public int getKindValue() {
        return this.kind_;
    }

    public ob getState() {
        int i = this.state_;
        ob obVar = i != 0 ? i != 1 ? i != 2 ? null : ob.Unavailable : ob.Disabled : ob.Enabled;
        return obVar == null ? ob.UNRECOGNIZED : obVar;
    }

    public int getStateValue() {
        return this.state_;
    }

    public boolean hasKind() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasState() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(SettingsPermissionsContext settingsPermissionsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(settingsPermissionsContext);
    }

    public static SettingsPermissionsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsPermissionsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsPermissionsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsPermissionsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SettingsPermissionsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SettingsPermissionsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SettingsPermissionsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsPermissionsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SettingsPermissionsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SettingsPermissionsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SettingsPermissionsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SettingsPermissionsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SettingsPermissionsContext parseFrom(InputStream inputStream) throws IOException {
        return (SettingsPermissionsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SettingsPermissionsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SettingsPermissionsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SettingsPermissionsContext parseFrom(t tVar) throws IOException {
        return (SettingsPermissionsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SettingsPermissionsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SettingsPermissionsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
