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
import grl.a0;
import grl.c0;
import grl.y;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class AppearanceContext extends w0 implements e2 {
    public static final int BACKGROUND_FIELD_NUMBER = 2;
    private static final AppearanceContext DEFAULT_INSTANCE;
    public static final int MODE_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int background_;
    private int bitField0_;
    private int mode_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(AppearanceContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AppearanceContext appearanceContext = new AppearanceContext();
        DEFAULT_INSTANCE = appearanceContext;
        w0.registerDefaultInstance(AppearanceContext.class, appearanceContext);
    }

    private AppearanceContext() {
    }

    private void clearBackground() {
        this.bitField0_ &= -3;
        this.background_ = 0;
    }

    private void clearMode() {
        this.bitField0_ &= -2;
        this.mode_ = 0;
    }

    public static AppearanceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static AppearanceContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AppearanceContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AppearanceContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AppearanceContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBackground(a0 a0Var) {
        this.background_ = a0Var.getNumber();
        this.bitField0_ |= 2;
    }

    private void setBackgroundValue(int i) {
        this.bitField0_ |= 2;
        this.background_ = i;
    }

    private void setMode(c0 c0Var) {
        this.mode_ = c0Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setModeValue(int i) {
        this.bitField0_ |= 1;
        this.mode_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (y.f146236a[v0Var.ordinal()]) {
            case 1:
                return new AppearanceContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"bitField0_", "mode_", "background_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AppearanceContext.class) {
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

    public a0 getBackground() {
        a0 a0VarA = a0.a(this.background_);
        return a0VarA == null ? a0.UNRECOGNIZED : a0VarA;
    }

    public int getBackgroundValue() {
        return this.background_;
    }

    public c0 getMode() {
        int i = this.mode_;
        c0 c0Var = i != 0 ? i != 1 ? i != 2 ? null : c0.system : c0.dark : c0.light;
        return c0Var == null ? c0.UNRECOGNIZED : c0Var;
    }

    public int getModeValue() {
        return this.mode_;
    }

    public boolean hasBackground() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMode() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(AppearanceContext appearanceContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(appearanceContext);
    }

    public static AppearanceContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AppearanceContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AppearanceContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AppearanceContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AppearanceContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AppearanceContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AppearanceContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AppearanceContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AppearanceContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AppearanceContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AppearanceContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AppearanceContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AppearanceContext parseFrom(InputStream inputStream) throws IOException {
        return (AppearanceContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AppearanceContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AppearanceContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AppearanceContext parseFrom(t tVar) throws IOException {
        return (AppearanceContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AppearanceContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (AppearanceContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
