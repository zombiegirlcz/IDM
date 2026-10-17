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
import grl.wd;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class UiInteractionDevice extends w0 implements e2 {
    private static final UiInteractionDevice DEFAULT_INSTANCE;
    public static final int EXTERNAL_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int VIRTUAL_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean external_;
    private String name_ = "";
    private boolean virtual_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(UiInteractionDevice.DEFAULT_INSTANCE);
        }
    }

    static {
        UiInteractionDevice uiInteractionDevice = new UiInteractionDevice();
        DEFAULT_INSTANCE = uiInteractionDevice;
        w0.registerDefaultInstance(UiInteractionDevice.class, uiInteractionDevice);
    }

    private UiInteractionDevice() {
    }

    private void clearExternal() {
        this.bitField0_ &= -5;
        this.external_ = false;
    }

    private void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    private void clearVirtual() {
        this.bitField0_ &= -3;
        this.virtual_ = false;
    }

    public static UiInteractionDevice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static UiInteractionDevice parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UiInteractionDevice) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UiInteractionDevice parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (UiInteractionDevice) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternal(boolean z) {
        this.bitField0_ |= 4;
        this.external_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    private void setNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.name_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVirtual(boolean z) {
        this.bitField0_ |= 2;
        this.virtual_ = z;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (wd.f146229a[v0Var.ordinal()]) {
            case 1:
                return new UiInteractionDevice();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "name_", "virtual_", "external_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (UiInteractionDevice.class) {
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

    public boolean getExternal() {
        return this.external_;
    }

    public String getName() {
        return this.name_;
    }

    public p getNameBytes() {
        return p.d(this.name_);
    }

    public boolean getVirtual() {
        return this.virtual_;
    }

    public boolean hasExternal() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVirtual() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(UiInteractionDevice uiInteractionDevice) {
        return (a) DEFAULT_INSTANCE.createBuilder(uiInteractionDevice);
    }

    public static UiInteractionDevice parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (UiInteractionDevice) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static UiInteractionDevice parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (UiInteractionDevice) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static UiInteractionDevice parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (UiInteractionDevice) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static UiInteractionDevice parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (UiInteractionDevice) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static UiInteractionDevice parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (UiInteractionDevice) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UiInteractionDevice parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (UiInteractionDevice) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static UiInteractionDevice parseFrom(InputStream inputStream) throws IOException {
        return (UiInteractionDevice) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UiInteractionDevice parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (UiInteractionDevice) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static UiInteractionDevice parseFrom(t tVar) throws IOException {
        return (UiInteractionDevice) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static UiInteractionDevice parseFrom(t tVar, d0 d0Var) throws IOException {
        return (UiInteractionDevice) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
