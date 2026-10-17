package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends w0 implements e2 {
    private static final h3 DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile m2 PARSER;
    private y1 fields_ = y1.f49836b;

    static {
        h3 h3Var = new h3();
        DEFAULT_INSTANCE = h3Var;
        w0.registerDefaultInstance(h3.class, h3Var);
    }

    private h3() {
    }

    public static h3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, d4> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private y1 internalGetFields() {
        return this.fields_;
    }

    private y1 internalGetMutableFields() {
        y1 y1Var = this.fields_;
        if (!y1Var.f49837a) {
            this.fields_ = y1Var.c();
        }
        return this.fields_;
    }

    public static f3 newBuilder() {
        return (f3) DEFAULT_INSTANCE.createBuilder();
    }

    public static h3 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (h3) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h3 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (h3) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (e3.f49703a[v0Var.ordinal()]) {
            case 1:
                return new h3();
            case 2:
                return new f3(DEFAULT_INSTANCE);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", g3.f49711a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (h3.class) {
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

    @Deprecated
    public Map<String, d4> getFields() {
        return getFieldsMap();
    }

    public int getFieldsCount() {
        return internalGetFields().size();
    }

    public Map<String, d4> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    public d4 getFieldsOrDefault(String str, d4 d4Var) {
        str.getClass();
        y1 y1VarInternalGetFields = internalGetFields();
        return y1VarInternalGetFields.containsKey(str) ? (d4) y1VarInternalGetFields.get(str) : d4Var;
    }

    public d4 getFieldsOrThrow(String str) {
        str.getClass();
        y1 y1VarInternalGetFields = internalGetFields();
        if (y1VarInternalGetFields.containsKey(str)) {
            return (d4) y1VarInternalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static f3 newBuilder(h3 h3Var) {
        return (f3) DEFAULT_INSTANCE.createBuilder(h3Var);
    }

    public static h3 parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (h3) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static h3 parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (h3) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static h3 parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (h3) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static h3 parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (h3) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static h3 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (h3) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static h3 parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (h3) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static h3 parseFrom(InputStream inputStream) throws IOException {
        return (h3) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static h3 parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (h3) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static h3 parseFrom(t tVar) throws IOException {
        return (h3) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static h3 parseFrom(t tVar, d0 d0Var) throws IOException {
        return (h3) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
