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
import grl.u6;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class LifestyleOnboardingContext extends w0 implements e2 {
    public static final int CONFIG_ID_FIELD_NUMBER = 1;
    private static final LifestyleOnboardingContext DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 2;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String configId_ = "";
    private String itemId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(LifestyleOnboardingContext.DEFAULT_INSTANCE);
        }
    }

    static {
        LifestyleOnboardingContext lifestyleOnboardingContext = new LifestyleOnboardingContext();
        DEFAULT_INSTANCE = lifestyleOnboardingContext;
        w0.registerDefaultInstance(LifestyleOnboardingContext.class, lifestyleOnboardingContext);
    }

    private LifestyleOnboardingContext() {
    }

    private void clearConfigId() {
        this.bitField0_ &= -2;
        this.configId_ = getDefaultInstance().getConfigId();
    }

    private void clearItemId() {
        this.bitField0_ &= -3;
        this.itemId_ = getDefaultInstance().getItemId();
    }

    public static LifestyleOnboardingContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static LifestyleOnboardingContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LifestyleOnboardingContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LifestyleOnboardingContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (LifestyleOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setConfigId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.configId_ = str;
    }

    private void setConfigIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.configId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setItemId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.itemId_ = str;
    }

    private void setItemIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.itemId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (u6.f146214a[v0Var.ordinal()]) {
            case 1:
                return new LifestyleOnboardingContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "configId_", "itemId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (LifestyleOnboardingContext.class) {
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

    public String getConfigId() {
        return this.configId_;
    }

    public p getConfigIdBytes() {
        return p.d(this.configId_);
    }

    public String getItemId() {
        return this.itemId_;
    }

    public p getItemIdBytes() {
        return p.d(this.itemId_);
    }

    public boolean hasConfigId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasItemId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(LifestyleOnboardingContext lifestyleOnboardingContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(lifestyleOnboardingContext);
    }

    public static LifestyleOnboardingContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (LifestyleOnboardingContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static LifestyleOnboardingContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (LifestyleOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static LifestyleOnboardingContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (LifestyleOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static LifestyleOnboardingContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (LifestyleOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static LifestyleOnboardingContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (LifestyleOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LifestyleOnboardingContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (LifestyleOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static LifestyleOnboardingContext parseFrom(InputStream inputStream) throws IOException {
        return (LifestyleOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LifestyleOnboardingContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (LifestyleOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static LifestyleOnboardingContext parseFrom(t tVar) throws IOException {
        return (LifestyleOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static LifestyleOnboardingContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (LifestyleOnboardingContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
