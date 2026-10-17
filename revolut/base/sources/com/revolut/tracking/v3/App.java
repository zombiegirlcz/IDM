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
import grl.x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class App extends w0 implements e2 {
    public static final int BUILD_NUMBER_FIELD_NUMBER = 4;
    private static final App DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LOCALE_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private int buildNumber_;
    private String id_ = "";
    private String version_ = "";
    private String locale_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(App.DEFAULT_INSTANCE);
        }
    }

    static {
        App app = new App();
        DEFAULT_INSTANCE = app;
        w0.registerDefaultInstance(App.class, app);
    }

    private App() {
    }

    private void clearBuildNumber() {
        this.bitField0_ &= -9;
        this.buildNumber_ = 0;
    }

    private void clearId() {
        this.bitField0_ &= -2;
        this.id_ = getDefaultInstance().getId();
    }

    private void clearLocale() {
        this.bitField0_ &= -5;
        this.locale_ = getDefaultInstance().getLocale();
    }

    private void clearVersion() {
        this.bitField0_ &= -3;
        this.version_ = getDefaultInstance().getVersion();
    }

    public static App getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static App parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (App) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static App parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (App) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildNumber(int i) {
        this.bitField0_ |= 8;
        this.buildNumber_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.id_ = str;
    }

    private void setIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.id_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.locale_ = str;
    }

    private void setLocaleBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.locale_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.version_ = str;
    }

    private void setVersionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.version_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (x.f146230a[v0Var.ordinal()]) {
            case 1:
                return new App();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"bitField0_", "id_", "version_", "locale_", "buildNumber_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (App.class) {
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

    public int getBuildNumber() {
        return this.buildNumber_;
    }

    public String getId() {
        return this.id_;
    }

    public p getIdBytes() {
        return p.d(this.id_);
    }

    public String getLocale() {
        return this.locale_;
    }

    public p getLocaleBytes() {
        return p.d(this.locale_);
    }

    public String getVersion() {
        return this.version_;
    }

    public p getVersionBytes() {
        return p.d(this.version_);
    }

    public boolean hasBuildNumber() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(App app) {
        return (a) DEFAULT_INSTANCE.createBuilder(app);
    }

    public static App parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (App) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static App parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (App) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static App parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (App) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static App parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (App) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (App) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static App parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (App) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static App parseFrom(InputStream inputStream) throws IOException {
        return (App) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static App parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (App) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static App parseFrom(t tVar) throws IOException {
        return (App) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static App parseFrom(t tVar, d0 d0Var) throws IOException {
        return (App) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
