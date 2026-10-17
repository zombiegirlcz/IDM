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
import grl.r4;
import grl.t4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class HomeTotalWealthContext extends w0 implements e2 {
    public static final int CATEGORY_FIELD_NUMBER = 2;
    private static final HomeTotalWealthContext DEFAULT_INSTANCE;
    public static final int IS_FIRST_IMPRESSION_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String category_ = "";
    private boolean isFirstImpression_;
    private int state_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(HomeTotalWealthContext.DEFAULT_INSTANCE);
        }
    }

    static {
        HomeTotalWealthContext homeTotalWealthContext = new HomeTotalWealthContext();
        DEFAULT_INSTANCE = homeTotalWealthContext;
        w0.registerDefaultInstance(HomeTotalWealthContext.class, homeTotalWealthContext);
    }

    private HomeTotalWealthContext() {
    }

    private void clearCategory() {
        this.bitField0_ &= -3;
        this.category_ = getDefaultInstance().getCategory();
    }

    private void clearIsFirstImpression() {
        this.bitField0_ &= -5;
        this.isFirstImpression_ = false;
    }

    private void clearState() {
        this.bitField0_ &= -2;
        this.state_ = 0;
    }

    public static HomeTotalWealthContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static HomeTotalWealthContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HomeTotalWealthContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HomeTotalWealthContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HomeTotalWealthContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.category_ = str;
    }

    private void setCategoryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.category_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFirstImpression(boolean z) {
        this.bitField0_ |= 4;
        this.isFirstImpression_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(t4 t4Var) {
        this.state_ = t4Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setStateValue(int i) {
        this.bitField0_ |= 1;
        this.state_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (r4.f146189a[v0Var.ordinal()]) {
            case 1:
                return new HomeTotalWealthContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "state_", "category_", "isFirstImpression_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (HomeTotalWealthContext.class) {
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

    public String getCategory() {
        return this.category_;
    }

    public p getCategoryBytes() {
        return p.d(this.category_);
    }

    public boolean getIsFirstImpression() {
        return this.isFirstImpression_;
    }

    public t4 getState() {
        int i = this.state_;
        t4 t4Var = i != 0 ? i != 1 ? null : t4.INACTIVE : t4.ACTIVE;
        return t4Var == null ? t4.UNRECOGNIZED : t4Var;
    }

    public int getStateValue() {
        return this.state_;
    }

    public boolean hasCategory() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsFirstImpression() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasState() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(HomeTotalWealthContext homeTotalWealthContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(homeTotalWealthContext);
    }

    public static HomeTotalWealthContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (HomeTotalWealthContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static HomeTotalWealthContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (HomeTotalWealthContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static HomeTotalWealthContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (HomeTotalWealthContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static HomeTotalWealthContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (HomeTotalWealthContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static HomeTotalWealthContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HomeTotalWealthContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HomeTotalWealthContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (HomeTotalWealthContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static HomeTotalWealthContext parseFrom(InputStream inputStream) throws IOException {
        return (HomeTotalWealthContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HomeTotalWealthContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (HomeTotalWealthContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static HomeTotalWealthContext parseFrom(t tVar) throws IOException {
        return (HomeTotalWealthContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static HomeTotalWealthContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (HomeTotalWealthContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
