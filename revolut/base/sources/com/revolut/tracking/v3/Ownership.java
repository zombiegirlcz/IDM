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
import grl.o7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class Ownership extends w0 implements e2 {
    private static final Ownership DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int TEAM_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private int teamId_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(int i) {
            c();
            ((Ownership) this.f49761b).setTeamId(i);
        }

        private a() {
            super(Ownership.DEFAULT_INSTANCE);
        }
    }

    static {
        Ownership ownership = new Ownership();
        DEFAULT_INSTANCE = ownership;
        w0.registerDefaultInstance(Ownership.class, ownership);
    }

    private Ownership() {
    }

    private void clearTeamId() {
        this.bitField0_ &= -2;
        this.teamId_ = 0;
    }

    public static Ownership getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static Ownership parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Ownership) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ownership parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Ownership) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTeamId(int i) {
        this.bitField0_ |= 1;
        this.teamId_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (o7.f146161a[v0Var.ordinal()]) {
            case 1:
                return new Ownership();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"bitField0_", "teamId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (Ownership.class) {
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

    public int getTeamId() {
        return this.teamId_;
    }

    public boolean hasTeamId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(Ownership ownership) {
        return (a) DEFAULT_INSTANCE.createBuilder(ownership);
    }

    public static Ownership parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (Ownership) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static Ownership parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (Ownership) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static Ownership parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (Ownership) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static Ownership parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (Ownership) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static Ownership parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Ownership) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Ownership parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (Ownership) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static Ownership parseFrom(InputStream inputStream) throws IOException {
        return (Ownership) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Ownership parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (Ownership) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static Ownership parseFrom(t tVar) throws IOException {
        return (Ownership) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static Ownership parseFrom(t tVar, d0 d0Var) throws IOException {
        return (Ownership) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
