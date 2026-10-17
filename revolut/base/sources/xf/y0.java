package xf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e2;
import com.google.protobuf.m2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends com.google.protobuf.w0 implements e2 {
    private static final y0 DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    static {
        y0 y0Var = new y0();
        DEFAULT_INSTANCE = y0Var;
        com.google.protobuf.w0.registerDefaultInstance(y0.class, y0Var);
    }

    private y0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchDestination() {
        this.bitField0_ &= -2;
        this.dispatchDestination_ = 0;
    }

    public static y0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static w0 newBuilder() {
        return (w0) DEFAULT_INSTANCE.createBuilder();
    }

    public static y0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (y0) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y0 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (y0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchDestination(x0 x0Var) {
        this.dispatchDestination_ = x0Var.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(com.google.protobuf.v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (v0.f304741a[v0Var.ordinal()]) {
            case 1:
                return new y0();
            case 2:
                return new w0();
            case 3:
                return com.google.protobuf.w0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "dispatchDestination_", c0.d});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (y0.class) {
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

    public x0 getDispatchDestination() {
        x0 x0VarA = x0.a(this.dispatchDestination_);
        return x0VarA == null ? x0.SOURCE_UNKNOWN : x0VarA;
    }

    public boolean hasDispatchDestination() {
        return (this.bitField0_ & 1) != 0;
    }

    public static w0 newBuilder(y0 y0Var) {
        return (w0) DEFAULT_INSTANCE.createBuilder(y0Var);
    }

    public static y0 parseDelimitedFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (y0) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static y0 parseFrom(ByteBuffer byteBuffer, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (y0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static y0 parseFrom(com.google.protobuf.p pVar) throws InvalidProtocolBufferException {
        return (y0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static y0 parseFrom(com.google.protobuf.p pVar, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (y0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static y0 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (y0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static y0 parseFrom(byte[] bArr, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (y0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static y0 parseFrom(InputStream inputStream) throws IOException {
        return (y0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y0 parseFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (y0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static y0 parseFrom(com.google.protobuf.t tVar) throws IOException {
        return (y0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static y0 parseFrom(com.google.protobuf.t tVar, com.google.protobuf.d0 d0Var) throws IOException {
        return (y0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
