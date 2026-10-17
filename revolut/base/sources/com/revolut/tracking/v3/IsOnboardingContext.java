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
import grl.m6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class IsOnboardingContext extends w0 implements e2 {
    private static final IsOnboardingContext DEFAULT_INSTANCE;
    public static final int IS_ONBOARDING_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private boolean isOnboarding_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(IsOnboardingContext.DEFAULT_INSTANCE);
        }
    }

    static {
        IsOnboardingContext isOnboardingContext = new IsOnboardingContext();
        DEFAULT_INSTANCE = isOnboardingContext;
        w0.registerDefaultInstance(IsOnboardingContext.class, isOnboardingContext);
    }

    private IsOnboardingContext() {
    }

    private void clearIsOnboarding() {
        this.bitField0_ &= -2;
        this.isOnboarding_ = false;
    }

    public static IsOnboardingContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static IsOnboardingContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (IsOnboardingContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IsOnboardingContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (IsOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIsOnboarding(boolean z) {
        this.bitField0_ |= 1;
        this.isOnboarding_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (m6.f146142a[v0Var.ordinal()]) {
            case 1:
                return new IsOnboardingContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isOnboarding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (IsOnboardingContext.class) {
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

    public boolean getIsOnboarding() {
        return this.isOnboarding_;
    }

    public boolean hasIsOnboarding() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(IsOnboardingContext isOnboardingContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(isOnboardingContext);
    }

    public static IsOnboardingContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (IsOnboardingContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static IsOnboardingContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (IsOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static IsOnboardingContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (IsOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static IsOnboardingContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (IsOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static IsOnboardingContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (IsOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static IsOnboardingContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (IsOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static IsOnboardingContext parseFrom(InputStream inputStream) throws IOException {
        return (IsOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static IsOnboardingContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (IsOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static IsOnboardingContext parseFrom(t tVar) throws IOException {
        return (IsOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static IsOnboardingContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (IsOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
