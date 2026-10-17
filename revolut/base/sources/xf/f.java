package xf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.m2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public final class f extends com.google.protobuf.w0 implements g {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final f DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        com.google.protobuf.w0.registerDefaultInstance(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimeUs() {
        this.bitField0_ &= -2;
        this.clientTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsedAppJavaHeapMemoryKb() {
        this.bitField0_ &= -3;
        this.usedAppJavaHeapMemoryKb_ = 0;
    }

    public static f getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static e newBuilder() {
        return (e) DEFAULT_INSTANCE.createBuilder();
    }

    public static f parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (f) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (f) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setUsedAppJavaHeapMemoryKb(int i) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(com.google.protobuf.v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (d.f304726a[v0Var.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new e(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.w0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (f.class) {
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

    public int getUsedAppJavaHeapMemoryKb() {
        return this.usedAppJavaHeapMemoryKb_;
    }

    public boolean hasClientTimeUs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUsedAppJavaHeapMemoryKb() {
        return (this.bitField0_ & 2) != 0;
    }

    public static e newBuilder(f fVar) {
        return (e) DEFAULT_INSTANCE.createBuilder(fVar);
    }

    public static f parseDelimitedFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (f) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static f parseFrom(ByteBuffer byteBuffer, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (f) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static f parseFrom(com.google.protobuf.p pVar) throws InvalidProtocolBufferException {
        return (f) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static f parseFrom(com.google.protobuf.p pVar, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (f) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static f parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (f) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static f parseFrom(byte[] bArr, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (f) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static f parseFrom(InputStream inputStream) throws IOException {
        return (f) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static f parseFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (f) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static f parseFrom(com.google.protobuf.t tVar) throws IOException {
        return (f) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static f parseFrom(com.google.protobuf.t tVar, com.google.protobuf.d0 d0Var) throws IOException {
        return (f) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
