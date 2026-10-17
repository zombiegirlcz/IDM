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
import com.revolut.tracking.v3.UiInteractionDevice;
import grl.td;
import grl.vd;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class UiInteraction extends w0 implements e2 {
    private static final UiInteraction DEFAULT_INSTANCE;
    public static final int DEVICE_FIELD_NUMBER = 2;
    public static final int ERASERS_FIELD_NUMBER = 3;
    public static final int FINGERS_FIELD_NUMBER = 4;
    public static final int MOUSES_FIELD_NUMBER = 5;
    private static volatile m2 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    public static final int STYLUSES_FIELD_NUMBER = 6;
    public static final int UNKNOWN_TOOLS_FIELD_NUMBER = 7;
    private int bitField0_;
    private UiInteractionDevice device_;
    private int erasers_;
    private int fingers_;
    private int mouses_;
    private int source_;
    private int styluses_;
    private int unknownTools_;

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(UiInteraction.DEFAULT_INSTANCE);
        }
    }

    static {
        UiInteraction uiInteraction = new UiInteraction();
        DEFAULT_INSTANCE = uiInteraction;
        w0.registerDefaultInstance(UiInteraction.class, uiInteraction);
    }

    private UiInteraction() {
    }

    private void clearDevice() {
        this.device_ = null;
        this.bitField0_ &= -3;
    }

    private void clearErasers() {
        this.bitField0_ &= -5;
        this.erasers_ = 0;
    }

    private void clearFingers() {
        this.bitField0_ &= -9;
        this.fingers_ = 0;
    }

    private void clearMouses() {
        this.bitField0_ &= -17;
        this.mouses_ = 0;
    }

    private void clearSource() {
        this.bitField0_ &= -2;
        this.source_ = 0;
    }

    private void clearStyluses() {
        this.bitField0_ &= -33;
        this.styluses_ = 0;
    }

    private void clearUnknownTools() {
        this.bitField0_ &= -65;
        this.unknownTools_ = 0;
    }

    public static UiInteraction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDevice(UiInteractionDevice uiInteractionDevice) {
        uiInteractionDevice.getClass();
        UiInteractionDevice uiInteractionDevice2 = this.device_;
        if (uiInteractionDevice2 == null || uiInteractionDevice2 == UiInteractionDevice.getDefaultInstance()) {
            this.device_ = uiInteractionDevice;
        } else {
            UiInteractionDevice.a aVarNewBuilder = UiInteractionDevice.newBuilder(this.device_);
            aVarNewBuilder.f(uiInteractionDevice);
            this.device_ = (UiInteractionDevice) aVarNewBuilder.b();
        }
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static UiInteraction parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UiInteraction) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UiInteraction parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UiInteraction) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDevice(UiInteractionDevice uiInteractionDevice) {
        uiInteractionDevice.getClass();
        this.device_ = uiInteractionDevice;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErasers(int i) {
        this.bitField0_ |= 4;
        this.erasers_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFingers(int i) {
        this.bitField0_ |= 8;
        this.fingers_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMouses(int i) {
        this.bitField0_ |= 16;
        this.mouses_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(vd vdVar) {
        this.source_ = vdVar.getNumber();
        this.bitField0_ |= 1;
    }

    private void setSourceValue(int i) {
        this.bitField0_ |= 1;
        this.source_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStyluses(int i) {
        this.bitField0_ |= 32;
        this.styluses_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnknownTools(int i) {
        this.bitField0_ |= 64;
        this.unknownTools_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (td.f146208a[v0Var.ordinal()]) {
            case 1:
                return new UiInteraction();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"bitField0_", "source_", "device_", "erasers_", "fingers_", "mouses_", "styluses_", "unknownTools_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (UiInteraction.class) {
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

    public UiInteractionDevice getDevice() {
        UiInteractionDevice uiInteractionDevice = this.device_;
        return uiInteractionDevice == null ? UiInteractionDevice.getDefaultInstance() : uiInteractionDevice;
    }

    public int getErasers() {
        return this.erasers_;
    }

    public int getFingers() {
        return this.fingers_;
    }

    public int getMouses() {
        return this.mouses_;
    }

    public vd getSource() {
        vd vdVarA = vd.a(this.source_);
        return vdVarA == null ? vd.UNRECOGNIZED : vdVarA;
    }

    public int getSourceValue() {
        return this.source_;
    }

    public int getStyluses() {
        return this.styluses_;
    }

    public int getUnknownTools() {
        return this.unknownTools_;
    }

    public boolean hasDevice() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasErasers() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFingers() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMouses() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStyluses() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasUnknownTools() {
        return (this.bitField0_ & 64) != 0;
    }

    public static a newBuilder(UiInteraction uiInteraction) {
        return (a) DEFAULT_INSTANCE.createBuilder(uiInteraction);
    }

    public static UiInteraction parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (UiInteraction) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static UiInteraction parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (UiInteraction) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static UiInteraction parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (UiInteraction) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static UiInteraction parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (UiInteraction) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static UiInteraction parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UiInteraction) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UiInteraction parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (UiInteraction) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static UiInteraction parseFrom(InputStream inputStream) throws IOException {
        return (UiInteraction) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UiInteraction parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (UiInteraction) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static UiInteraction parseFrom(t tVar) throws IOException {
        return (UiInteraction) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static UiInteraction parseFrom(t tVar, d0 d0Var) throws IOException {
        return (UiInteraction) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
