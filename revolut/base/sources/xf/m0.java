package xf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.e1;
import com.google.protobuf.f1;
import com.google.protobuf.g1;
import com.google.protobuf.m2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends com.google.protobuf.w0 implements n0 {
    private static final m0 DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final f1 sessionVerbosity_converter_ = new l(1);
    private int bitField0_;
    private String sessionId_ = "";
    private e1 sessionVerbosity_ = com.google.protobuf.w0.emptyIntList();

    static {
        m0 m0Var = new m0();
        DEFAULT_INSTANCE = m0Var;
        com.google.protobuf.w0.registerDefaultInstance(m0.class, m0Var);
    }

    private m0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSessionVerbosity(Iterable<? extends o0> iterable) {
        ensureSessionVerbosityIsMutable();
        for (o0 o0Var : iterable) {
            ((com.google.protobuf.x0) this.sessionVerbosity_).b(o0Var.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessionVerbosity(o0 o0Var) {
        o0Var.getClass();
        ensureSessionVerbosityIsMutable();
        ((com.google.protobuf.x0) this.sessionVerbosity_).b(o0Var.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionVerbosity() {
        this.sessionVerbosity_ = com.google.protobuf.w0.emptyIntList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureSessionVerbosityIsMutable() {
        e1 e1Var = this.sessionVerbosity_;
        if (((com.google.protobuf.c) e1Var).f49688a) {
            return;
        }
        this.sessionVerbosity_ = com.google.protobuf.w0.mutableCopy(e1Var);
    }

    public static m0 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l0 newBuilder() {
        return (l0) DEFAULT_INSTANCE.createBuilder();
    }

    public static m0 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (m0) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m0 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (m0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(com.google.protobuf.p pVar) {
        this.sessionId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionVerbosity(int i, o0 o0Var) {
        o0Var.getClass();
        ensureSessionVerbosityIsMutable();
        e1 e1Var = this.sessionVerbosity_;
        int number = o0Var.getNumber();
        com.google.protobuf.x0 x0Var = (com.google.protobuf.x0) e1Var;
        x0Var.a();
        x0Var.c(i);
        int[] iArr = x0Var.f49828b;
        int i2 = iArr[i];
        iArr[i] = number;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(com.google.protobuf.v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (k0.f304730a[v0Var.ordinal()]) {
            case 1:
                return new m0();
            case 2:
                return new l0(DEFAULT_INSTANCE);
            case 3:
                return com.google.protobuf.w0.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", m.f304733c});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (m0.class) {
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

    public String getSessionId() {
        return this.sessionId_;
    }

    public com.google.protobuf.p getSessionIdBytes() {
        return com.google.protobuf.p.d(this.sessionId_);
    }

    public o0 getSessionVerbosity(int i) {
        o0 o0VarA = o0.a(((com.google.protobuf.x0) this.sessionVerbosity_).d(i));
        return o0VarA == null ? o0.SESSION_VERBOSITY_NONE : o0VarA;
    }

    public int getSessionVerbosityCount() {
        return this.sessionVerbosity_.size();
    }

    public List<o0> getSessionVerbosityList() {
        return new g1(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static l0 newBuilder(m0 m0Var) {
        return (l0) DEFAULT_INSTANCE.createBuilder(m0Var);
    }

    public static m0 parseDelimitedFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (m0) com.google.protobuf.w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static m0 parseFrom(ByteBuffer byteBuffer, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (m0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static m0 parseFrom(com.google.protobuf.p pVar) throws InvalidProtocolBufferException {
        return (m0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static m0 parseFrom(com.google.protobuf.p pVar, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (m0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static m0 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (m0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m0 parseFrom(byte[] bArr, com.google.protobuf.d0 d0Var) throws InvalidProtocolBufferException {
        return (m0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static m0 parseFrom(InputStream inputStream) throws IOException {
        return (m0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m0 parseFrom(InputStream inputStream, com.google.protobuf.d0 d0Var) throws IOException {
        return (m0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static m0 parseFrom(com.google.protobuf.t tVar) throws IOException {
        return (m0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static m0 parseFrom(com.google.protobuf.t tVar, com.google.protobuf.d0 d0Var) throws IOException {
        return (m0) com.google.protobuf.w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
