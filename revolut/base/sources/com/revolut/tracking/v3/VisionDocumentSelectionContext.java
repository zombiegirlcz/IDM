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
import grl.yd;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class VisionDocumentSelectionContext extends w0 implements e2 {
    public static final int AVAILABLE_COUNTRIES_FIELD_NUMBER = 2;
    public static final int AVAILABLE_DOCUMENTS_FIELD_NUMBER = 1;
    private static final VisionDocumentSelectionContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER;
    private int bitField0_;
    private String availableDocuments_ = "";
    private String availableCountries_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(VisionDocumentSelectionContext.DEFAULT_INSTANCE);
        }
    }

    static {
        VisionDocumentSelectionContext visionDocumentSelectionContext = new VisionDocumentSelectionContext();
        DEFAULT_INSTANCE = visionDocumentSelectionContext;
        w0.registerDefaultInstance(VisionDocumentSelectionContext.class, visionDocumentSelectionContext);
    }

    private VisionDocumentSelectionContext() {
    }

    private void clearAvailableCountries() {
        this.bitField0_ &= -3;
        this.availableCountries_ = getDefaultInstance().getAvailableCountries();
    }

    private void clearAvailableDocuments() {
        this.bitField0_ &= -2;
        this.availableDocuments_ = getDefaultInstance().getAvailableDocuments();
    }

    public static VisionDocumentSelectionContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static VisionDocumentSelectionContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VisionDocumentSelectionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VisionDocumentSelectionContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VisionDocumentSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableCountries(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.availableCountries_ = str;
    }

    private void setAvailableCountriesBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.availableCountries_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvailableDocuments(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.availableDocuments_ = str;
    }

    private void setAvailableDocumentsBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.availableDocuments_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (yd.f146240a[v0Var.ordinal()]) {
            case 1:
                return new VisionDocumentSelectionContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "availableDocuments_", "availableCountries_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (VisionDocumentSelectionContext.class) {
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

    public String getAvailableCountries() {
        return this.availableCountries_;
    }

    public p getAvailableCountriesBytes() {
        return p.d(this.availableCountries_);
    }

    public String getAvailableDocuments() {
        return this.availableDocuments_;
    }

    public p getAvailableDocumentsBytes() {
        return p.d(this.availableDocuments_);
    }

    public boolean hasAvailableCountries() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAvailableDocuments() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(VisionDocumentSelectionContext visionDocumentSelectionContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(visionDocumentSelectionContext);
    }

    public static VisionDocumentSelectionContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (VisionDocumentSelectionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static VisionDocumentSelectionContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (VisionDocumentSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static VisionDocumentSelectionContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (VisionDocumentSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static VisionDocumentSelectionContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (VisionDocumentSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static VisionDocumentSelectionContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VisionDocumentSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VisionDocumentSelectionContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (VisionDocumentSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static VisionDocumentSelectionContext parseFrom(InputStream inputStream) throws IOException {
        return (VisionDocumentSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VisionDocumentSelectionContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (VisionDocumentSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static VisionDocumentSelectionContext parseFrom(t tVar) throws IOException {
        return (VisionDocumentSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static VisionDocumentSelectionContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (VisionDocumentSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
