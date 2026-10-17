package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import grl.j3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class DiagnosticContext extends w0 implements e2 {
    private static final DiagnosticContext DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String name_ = "";
    private h3 parameters_;

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(String str) {
            c();
            ((DiagnosticContext) this.f49761b).setName(str);
        }

        public final void i(h3 h3Var) {
            c();
            ((DiagnosticContext) this.f49761b).setParameters(h3Var);
        }

        private a() {
            super(DiagnosticContext.DEFAULT_INSTANCE);
        }
    }

    static {
        DiagnosticContext diagnosticContext = new DiagnosticContext();
        DEFAULT_INSTANCE = diagnosticContext;
        w0.registerDefaultInstance(DiagnosticContext.class, diagnosticContext);
    }

    private DiagnosticContext() {
    }

    private void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    private void clearParameters() {
        this.parameters_ = null;
        this.bitField0_ &= -3;
    }

    public static DiagnosticContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeParameters(h3 h3Var) {
        h3Var.getClass();
        h3 h3Var2 = this.parameters_;
        if (h3Var2 == null || h3Var2 == h3.getDefaultInstance()) {
            this.parameters_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder(this.parameters_);
            f3VarNewBuilder.f(h3Var);
            this.parameters_ = (h3) f3VarNewBuilder.b();
        }
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DiagnosticContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DiagnosticContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DiagnosticContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DiagnosticContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    private void setNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.name_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParameters(h3 h3Var) {
        h3Var.getClass();
        this.parameters_ = h3Var;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (j3.f146117a[v0Var.ordinal()]) {
            case 1:
                return new DiagnosticContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "name_", "parameters_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (DiagnosticContext.class) {
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

    public String getName() {
        return this.name_;
    }

    public p getNameBytes() {
        return p.d(this.name_);
    }

    public h3 getParameters() {
        h3 h3Var = this.parameters_;
        return h3Var == null ? h3.getDefaultInstance() : h3Var;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasParameters() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(DiagnosticContext diagnosticContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(diagnosticContext);
    }

    public static DiagnosticContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (DiagnosticContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static DiagnosticContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (DiagnosticContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static DiagnosticContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (DiagnosticContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static DiagnosticContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (DiagnosticContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static DiagnosticContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DiagnosticContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DiagnosticContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (DiagnosticContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static DiagnosticContext parseFrom(InputStream inputStream) throws IOException {
        return (DiagnosticContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DiagnosticContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (DiagnosticContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static DiagnosticContext parseFrom(t tVar) throws IOException {
        return (DiagnosticContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static DiagnosticContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (DiagnosticContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
