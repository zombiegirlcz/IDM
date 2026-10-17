package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.k4;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import com.google.protobuf.x1;
import com.google.protobuf.y1;
import grl.sd;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class TroubleshooterContext extends w0 implements e2 {
    private static final TroubleshooterContext DEFAULT_INSTANCE;
    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int TROUBLESHOOTERS_FIELD_NUMBER = 3;
    private int bitField0_;
    private y1 troubleshooters_ = y1.f49836b;
    private String entityId_ = "";
    private String key_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(TroubleshooterContext.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x1 f106788a = new x1(k4.INT32, 0, k4.STRING, "");

        private b() {
        }
    }

    static {
        TroubleshooterContext troubleshooterContext = new TroubleshooterContext();
        DEFAULT_INSTANCE = troubleshooterContext;
        w0.registerDefaultInstance(TroubleshooterContext.class, troubleshooterContext);
    }

    private TroubleshooterContext() {
    }

    private void clearEntityId() {
        this.bitField0_ &= -2;
        this.entityId_ = getDefaultInstance().getEntityId();
    }

    private void clearKey() {
        this.bitField0_ &= -3;
        this.key_ = getDefaultInstance().getKey();
    }

    public static TroubleshooterContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, String> getMutableTroubleshootersMap() {
        return internalGetMutableTroubleshooters();
    }

    private y1 internalGetMutableTroubleshooters() {
        y1 y1Var = this.troubleshooters_;
        if (!y1Var.f49837a) {
            this.troubleshooters_ = y1Var.c();
        }
        return this.troubleshooters_;
    }

    private y1 internalGetTroubleshooters() {
        return this.troubleshooters_;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static TroubleshooterContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TroubleshooterContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TroubleshooterContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TroubleshooterContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntityId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.entityId_ = str;
    }

    private void setEntityIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.entityId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.key_ = str;
    }

    private void setKeyBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.key_ = pVar.m();
        this.bitField0_ |= 2;
    }

    public boolean containsTroubleshooters(int i) {
        return internalGetTroubleshooters().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (sd.f146202a[v0Var.ordinal()]) {
            case 1:
                return new TroubleshooterContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u00032", new Object[]{"bitField0_", "entityId_", "key_", "troubleshooters_", b.f106788a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (TroubleshooterContext.class) {
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

    public String getEntityId() {
        return this.entityId_;
    }

    public p getEntityIdBytes() {
        return p.d(this.entityId_);
    }

    public String getKey() {
        return this.key_;
    }

    public p getKeyBytes() {
        return p.d(this.key_);
    }

    @Deprecated
    public Map<Integer, String> getTroubleshooters() {
        return getTroubleshootersMap();
    }

    public int getTroubleshootersCount() {
        return internalGetTroubleshooters().size();
    }

    public Map<Integer, String> getTroubleshootersMap() {
        return Collections.unmodifiableMap(internalGetTroubleshooters());
    }

    public String getTroubleshootersOrDefault(int i, String str) {
        y1 y1VarInternalGetTroubleshooters = internalGetTroubleshooters();
        return y1VarInternalGetTroubleshooters.containsKey(Integer.valueOf(i)) ? (String) y1VarInternalGetTroubleshooters.get(Integer.valueOf(i)) : str;
    }

    public String getTroubleshootersOrThrow(int i) {
        y1 y1VarInternalGetTroubleshooters = internalGetTroubleshooters();
        if (y1VarInternalGetTroubleshooters.containsKey(Integer.valueOf(i))) {
            return (String) y1VarInternalGetTroubleshooters.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    public boolean hasEntityId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasKey() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(TroubleshooterContext troubleshooterContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(troubleshooterContext);
    }

    public static TroubleshooterContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (TroubleshooterContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static TroubleshooterContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (TroubleshooterContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static TroubleshooterContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (TroubleshooterContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static TroubleshooterContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (TroubleshooterContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static TroubleshooterContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TroubleshooterContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TroubleshooterContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (TroubleshooterContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static TroubleshooterContext parseFrom(InputStream inputStream) throws IOException {
        return (TroubleshooterContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TroubleshooterContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (TroubleshooterContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static TroubleshooterContext parseFrom(t tVar) throws IOException {
        return (TroubleshooterContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static TroubleshooterContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (TroubleshooterContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
