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
import grl.r9;
import grl.t9;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class RevPointsGenericWidgetContext extends w0 implements e2 {
    private static final RevPointsGenericWidgetContext DEFAULT_INSTANCE;
    public static final int IS_FIRST_IMPRESSION_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isFirstImpression_;
    private int state_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(t9 t9Var) {
            c();
            ((RevPointsGenericWidgetContext) this.f49761b).setState(t9Var);
        }

        private a() {
            super(RevPointsGenericWidgetContext.DEFAULT_INSTANCE);
        }
    }

    static {
        RevPointsGenericWidgetContext revPointsGenericWidgetContext = new RevPointsGenericWidgetContext();
        DEFAULT_INSTANCE = revPointsGenericWidgetContext;
        w0.registerDefaultInstance(RevPointsGenericWidgetContext.class, revPointsGenericWidgetContext);
    }

    private RevPointsGenericWidgetContext() {
    }

    private void clearIsFirstImpression() {
        this.bitField0_ &= -3;
        this.isFirstImpression_ = false;
    }

    private void clearState() {
        this.bitField0_ &= -2;
        this.state_ = 0;
    }

    public static RevPointsGenericWidgetContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static RevPointsGenericWidgetContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RevPointsGenericWidgetContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RevPointsGenericWidgetContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RevPointsGenericWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFirstImpression(boolean z) {
        this.bitField0_ |= 2;
        this.isFirstImpression_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(t9 t9Var) {
        this.state_ = t9Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setStateValue(int i) {
        this.bitField0_ |= 1;
        this.state_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (r9.f146192a[v0Var.ordinal()]) {
            case 1:
                return new RevPointsGenericWidgetContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "state_", "isFirstImpression_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (RevPointsGenericWidgetContext.class) {
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

    public boolean getIsFirstImpression() {
        return this.isFirstImpression_;
    }

    public t9 getState() {
        int i = this.state_;
        t9 t9Var = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : t9.ERROR : t9.LOADING : t9.EMPTY : t9.DATA;
        return t9Var == null ? t9.UNRECOGNIZED : t9Var;
    }

    public int getStateValue() {
        return this.state_;
    }

    public boolean hasIsFirstImpression() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasState() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(RevPointsGenericWidgetContext revPointsGenericWidgetContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(revPointsGenericWidgetContext);
    }

    public static RevPointsGenericWidgetContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RevPointsGenericWidgetContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RevPointsGenericWidgetContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsGenericWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static RevPointsGenericWidgetContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (RevPointsGenericWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RevPointsGenericWidgetContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsGenericWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static RevPointsGenericWidgetContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RevPointsGenericWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RevPointsGenericWidgetContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsGenericWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static RevPointsGenericWidgetContext parseFrom(InputStream inputStream) throws IOException {
        return (RevPointsGenericWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RevPointsGenericWidgetContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RevPointsGenericWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RevPointsGenericWidgetContext parseFrom(t tVar) throws IOException {
        return (RevPointsGenericWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static RevPointsGenericWidgetContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (RevPointsGenericWidgetContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
