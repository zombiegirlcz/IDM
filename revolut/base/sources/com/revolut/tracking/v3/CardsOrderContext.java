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
import grl.u1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class CardsOrderContext extends w0 implements e2 {
    private static final CardsOrderContext DEFAULT_INSTANCE;
    public static final int IS_LAST_ADDRESS_UNAVAILABLE_FIELD_NUMBER = 1;
    public static final int IS_ONBOARDING_FIELD_NUMBER = 2;
    private static volatile m2 PARSER;
    private int bitField0_;
    private boolean isLastAddressUnavailable_;
    private boolean isOnboarding_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CardsOrderContext.DEFAULT_INSTANCE);
        }
    }

    static {
        CardsOrderContext cardsOrderContext = new CardsOrderContext();
        DEFAULT_INSTANCE = cardsOrderContext;
        w0.registerDefaultInstance(CardsOrderContext.class, cardsOrderContext);
    }

    private CardsOrderContext() {
    }

    private void clearIsLastAddressUnavailable() {
        this.bitField0_ &= -2;
        this.isLastAddressUnavailable_ = false;
    }

    private void clearIsOnboarding() {
        this.bitField0_ &= -3;
        this.isOnboarding_ = false;
    }

    public static CardsOrderContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CardsOrderContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CardsOrderContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardsOrderContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CardsOrderContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLastAddressUnavailable(boolean z) {
        this.bitField0_ |= 1;
        this.isLastAddressUnavailable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOnboarding(boolean z) {
        this.bitField0_ |= 2;
        this.isOnboarding_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (u1.f146210a[v0Var.ordinal()]) {
            case 1:
                return new CardsOrderContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "isLastAddressUnavailable_", "isOnboarding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CardsOrderContext.class) {
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

    public boolean getIsLastAddressUnavailable() {
        return this.isLastAddressUnavailable_;
    }

    public boolean getIsOnboarding() {
        return this.isOnboarding_;
    }

    public boolean hasIsLastAddressUnavailable() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsOnboarding() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(CardsOrderContext cardsOrderContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(cardsOrderContext);
    }

    public static CardsOrderContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CardsOrderContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CardsOrderContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CardsOrderContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CardsOrderContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CardsOrderContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CardsOrderContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CardsOrderContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CardsOrderContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CardsOrderContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CardsOrderContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CardsOrderContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CardsOrderContext parseFrom(InputStream inputStream) throws IOException {
        return (CardsOrderContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CardsOrderContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CardsOrderContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CardsOrderContext parseFrom(t tVar) throws IOException {
        return (CardsOrderContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CardsOrderContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CardsOrderContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
