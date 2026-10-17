package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s1 extends w0 implements e2 {
    private static final s1 DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private i1 values_ = w0.emptyProtobufList();

    static {
        s1 s1Var = new s1();
        DEFAULT_INSTANCE = s1Var;
        w0.registerDefaultInstance(s1.class, s1Var);
    }

    private s1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends d4> iterable) {
        ensureValuesIsMutable();
        b.addAll(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(d4 d4Var) {
        d4Var.getClass();
        ensureValuesIsMutable();
        this.values_.add(d4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = w0.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        i1 i1Var = this.values_;
        if (((c) i1Var).f49688a) {
            return;
        }
        this.values_ = w0.mutableCopy(i1Var);
    }

    public static s1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static r1 newBuilder() {
        return (r1) DEFAULT_INSTANCE.createBuilder();
    }

    public static s1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (s1) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (s1) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i) {
        ensureValuesIsMutable();
        this.values_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i, d4 d4Var) {
        d4Var.getClass();
        ensureValuesIsMutable();
        this.values_.set(i, d4Var);
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (q1.f49774a[v0Var.ordinal()]) {
            case 1:
                return new s1();
            case 2:
                return new r1();
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", d4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (s1.class) {
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

    public d4 getValues(int i) {
        return (d4) this.values_.get(i);
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List<d4> getValuesList() {
        return this.values_;
    }

    public e4 getValuesOrBuilder(int i) {
        return (e4) this.values_.get(i);
    }

    public List<? extends e4> getValuesOrBuilderList() {
        return this.values_;
    }

    public static r1 newBuilder(s1 s1Var) {
        return (r1) DEFAULT_INSTANCE.createBuilder(s1Var);
    }

    public static s1 parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (s1) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static s1 parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (s1) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static s1 parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (s1) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i, d4 d4Var) {
        d4Var.getClass();
        ensureValuesIsMutable();
        this.values_.add(i, d4Var);
    }

    public static s1 parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (s1) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static s1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (s1) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static s1 parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (s1) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static s1 parseFrom(InputStream inputStream) throws IOException {
        return (s1) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static s1 parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (s1) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static s1 parseFrom(t tVar) throws IOException {
        return (s1) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static s1 parseFrom(t tVar, d0 d0Var) throws IOException {
        return (s1) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
