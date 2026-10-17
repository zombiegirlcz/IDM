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
import grl.s0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class BehaviourFingerprintContext extends w0 implements e2 {
    public static final int ACTION_FIELD_NUMBER = 1;
    private static final BehaviourFingerprintContext DEFAULT_INSTANCE;
    public static final int FINGERPRINT_FIELD_NUMBER = 2;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String action_ = "";
    private String fingerprint_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(BehaviourFingerprintContext.DEFAULT_INSTANCE);
        }
    }

    static {
        BehaviourFingerprintContext behaviourFingerprintContext = new BehaviourFingerprintContext();
        DEFAULT_INSTANCE = behaviourFingerprintContext;
        w0.registerDefaultInstance(BehaviourFingerprintContext.class, behaviourFingerprintContext);
    }

    private BehaviourFingerprintContext() {
    }

    private void clearAction() {
        this.bitField0_ &= -2;
        this.action_ = getDefaultInstance().getAction();
    }

    private void clearFingerprint() {
        this.bitField0_ &= -3;
        this.fingerprint_ = getDefaultInstance().getFingerprint();
    }

    public static BehaviourFingerprintContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static BehaviourFingerprintContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BehaviourFingerprintContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BehaviourFingerprintContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BehaviourFingerprintContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAction(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.action_ = str;
    }

    private void setActionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.action_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setFingerprint(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.fingerprint_ = str;
    }

    private void setFingerprintBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.fingerprint_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (s0.f146196a[v0Var.ordinal()]) {
            case 1:
                return new BehaviourFingerprintContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "action_", "fingerprint_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (BehaviourFingerprintContext.class) {
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

    public String getAction() {
        return this.action_;
    }

    public p getActionBytes() {
        return p.d(this.action_);
    }

    public String getFingerprint() {
        return this.fingerprint_;
    }

    public p getFingerprintBytes() {
        return p.d(this.fingerprint_);
    }

    public boolean hasAction() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFingerprint() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(BehaviourFingerprintContext behaviourFingerprintContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(behaviourFingerprintContext);
    }

    public static BehaviourFingerprintContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (BehaviourFingerprintContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static BehaviourFingerprintContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (BehaviourFingerprintContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static BehaviourFingerprintContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (BehaviourFingerprintContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static BehaviourFingerprintContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (BehaviourFingerprintContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static BehaviourFingerprintContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BehaviourFingerprintContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BehaviourFingerprintContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (BehaviourFingerprintContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static BehaviourFingerprintContext parseFrom(InputStream inputStream) throws IOException {
        return (BehaviourFingerprintContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BehaviourFingerprintContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (BehaviourFingerprintContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static BehaviourFingerprintContext parseFrom(t tVar) throws IOException {
        return (BehaviourFingerprintContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static BehaviourFingerprintContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (BehaviourFingerprintContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
