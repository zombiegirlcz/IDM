package xf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.m2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class q extends com.google.protobuf.w0 implements r {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final q DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        com.google.protobuf.w0.registerDefaultInstance(q.class, qVar);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemTimeUs() {
        this.bitField0_ &= -5;
        this.systemTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserTimeUs() {
        this.bitField0_ &= -3;
        this.userTimeUs_ = 0L;
    }

    public static q getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static q parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (q) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (q) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimeUs(long j2) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemTimeUs(long j2) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserTimeUs(long j2) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(com.google.protobuf.v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (o.f304735a[v0Var.ordinal()]) {
            case 1:
                return new q();
            case 2:
                return new p(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.w0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (q.class) {
                    try {
                        q0Var = PARSER;
                        if (q0Var == null) {
                            q0Var = new com.google.protobuf.q0(DEFAULT_INSTANCE);
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

    public long getClientTimeUs() {
        return this.clientTimeUs_;
    }

    public long getSystemTimeUs() {
        return this.systemTimeUs_;
    }

    public long getUserTimeUs() {
        return this.userTimeUs_;
    }

    public boolean hasClientTimeUs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSystemTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUserTimeUs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static p newBuilder(q qVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(qVar);
    }

    public static q parseDelimitedFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (q) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static q parseFrom(ByteBuffer byteBuffer, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (q) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static q parseFrom(com.google.protobuf.p pVar) throws InvalidProtocolBufferException {
        return (q) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static q parseFrom(com.google.protobuf.p pVar, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (q) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static q parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (q) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static q parseFrom(byte[] bArr, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (q) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static q parseFrom(InputStream inputStream) throws IOException {
        return (q) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static q parseFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (q) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static q parseFrom(com.google.protobuf.t tVar) throws IOException {
        return (q) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static q parseFrom(com.google.protobuf.t tVar, com.google.protobuf.d0 d0Var) throws IOException {
        return (q) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
