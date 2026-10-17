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
import grl.rc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class SpareChangeContext extends w0 implements e2 {
    private static final SpareChangeContext DEFAULT_INSTANCE;
    public static final int MULTIPLIER_SELECTED_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String multiplierSelected_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((SpareChangeContext) this.f49761b).setMultiplierSelected(str);
        }

        private a() {
            super(SpareChangeContext.DEFAULT_INSTANCE);
        }
    }

    static {
        SpareChangeContext spareChangeContext = new SpareChangeContext();
        DEFAULT_INSTANCE = spareChangeContext;
        w0.registerDefaultInstance(SpareChangeContext.class, spareChangeContext);
    }

    private SpareChangeContext() {
    }

    private void clearMultiplierSelected() {
        this.bitField0_ &= -2;
        this.multiplierSelected_ = getDefaultInstance().getMultiplierSelected();
    }

    public static SpareChangeContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static SpareChangeContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpareChangeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpareChangeContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SpareChangeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMultiplierSelected(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.multiplierSelected_ = str;
    }

    private void setMultiplierSelectedBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.multiplierSelected_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (rc.f146194a[v0Var.ordinal()]) {
            case 1:
                return new SpareChangeContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"bitField0_", "multiplierSelected_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (SpareChangeContext.class) {
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

    public String getMultiplierSelected() {
        return this.multiplierSelected_;
    }

    public p getMultiplierSelectedBytes() {
        return p.d(this.multiplierSelected_);
    }

    public boolean hasMultiplierSelected() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(SpareChangeContext spareChangeContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(spareChangeContext);
    }

    public static SpareChangeContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SpareChangeContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SpareChangeContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (SpareChangeContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static SpareChangeContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (SpareChangeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static SpareChangeContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (SpareChangeContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static SpareChangeContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SpareChangeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SpareChangeContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (SpareChangeContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static SpareChangeContext parseFrom(InputStream inputStream) throws IOException {
        return (SpareChangeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpareChangeContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (SpareChangeContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static SpareChangeContext parseFrom(t tVar) throws IOException {
        return (SpareChangeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static SpareChangeContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (SpareChangeContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
