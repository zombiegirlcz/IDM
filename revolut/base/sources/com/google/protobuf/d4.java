package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class d4 extends w0 implements e4 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final d4 DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        d4 d4Var = new d4();
        DEFAULT_INSTANCE = d4Var;
        w0.registerDefaultInstance(d4.class, d4Var);
    }

    private d4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static d4 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(s1 s1Var) {
        s1Var.getClass();
        if (this.kindCase_ != 6 || this.kind_ == s1.getDefaultInstance()) {
            this.kind_ = s1Var;
        } else {
            r1 r1VarNewBuilder = s1.newBuilder((s1) this.kind_);
            r1VarNewBuilder.f(s1Var);
            this.kind_ = r1VarNewBuilder.b();
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(h3 h3Var) {
        h3Var.getClass();
        if (this.kindCase_ != 5 || this.kind_ == h3.getDefaultInstance()) {
            this.kind_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder((h3) this.kind_);
            f3VarNewBuilder.f(h3Var);
            this.kind_ = f3VarNewBuilder.b();
        }
        this.kindCase_ = 5;
    }

    public static b4 newBuilder() {
        return (b4) DEFAULT_INSTANCE.createBuilder();
    }

    public static d4 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (d4) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d4 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (d4) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(s1 s1Var) {
        s1Var.getClass();
        this.kind_ = s1Var;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(l2 l2Var) {
        this.kind_ = Integer.valueOf(l2Var.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int i) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double d) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(p pVar) {
        b.checkByteStringIsUtf8(pVar);
        this.kind_ = pVar.m();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(h3 h3Var) {
        h3Var.getClass();
        this.kind_ = h3Var;
        this.kindCase_ = 5;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (a4.f49683a[v0Var.ordinal()]) {
            case 1:
                return new d4();
            case 2:
                return new b4(DEFAULT_INSTANCE);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", h3.class, s1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (d4.class) {
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

    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    public c4 getKindCase() {
        switch (this.kindCase_) {
            case 0:
                return c4.KIND_NOT_SET;
            case 1:
                return c4.NULL_VALUE;
            case 2:
                return c4.NUMBER_VALUE;
            case 3:
                return c4.STRING_VALUE;
            case 4:
                return c4.BOOL_VALUE;
            case 5:
                return c4.STRUCT_VALUE;
            case 6:
                return c4.LIST_VALUE;
            default:
                return null;
        }
    }

    public s1 getListValue() {
        return this.kindCase_ == 6 ? (s1) this.kind_ : s1.getDefaultInstance();
    }

    public l2 getNullValue() {
        if (this.kindCase_ != 1) {
            return l2.NULL_VALUE;
        }
        l2 l2Var = ((Integer) this.kind_).intValue() != 0 ? null : l2.NULL_VALUE;
        return l2Var == null ? l2.UNRECOGNIZED : l2Var;
    }

    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    public String getStringValue() {
        return this.kindCase_ == 3 ? (String) this.kind_ : "";
    }

    public p getStringValueBytes() {
        return p.d(this.kindCase_ == 3 ? (String) this.kind_ : "");
    }

    public h3 getStructValue() {
        return this.kindCase_ == 5 ? (h3) this.kind_ : h3.getDefaultInstance();
    }

    public boolean hasBoolValue() {
        return this.kindCase_ == 4;
    }

    public boolean hasListValue() {
        return this.kindCase_ == 6;
    }

    public boolean hasNullValue() {
        return this.kindCase_ == 1;
    }

    public boolean hasNumberValue() {
        return this.kindCase_ == 2;
    }

    public boolean hasStringValue() {
        return this.kindCase_ == 3;
    }

    public boolean hasStructValue() {
        return this.kindCase_ == 5;
    }

    public static b4 newBuilder(d4 d4Var) {
        return (b4) DEFAULT_INSTANCE.createBuilder(d4Var);
    }

    public static d4 parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (d4) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static d4 parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (d4) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static d4 parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (d4) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static d4 parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (d4) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static d4 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (d4) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d4 parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (d4) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static d4 parseFrom(InputStream inputStream) throws IOException {
        return (d4) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d4 parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (d4) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static d4 parseFrom(t tVar) throws IOException {
        return (d4) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static d4 parseFrom(t tVar, d0 d0Var) throws IOException {
        return (d4) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
