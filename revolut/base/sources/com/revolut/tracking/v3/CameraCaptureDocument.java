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
import grl.k1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class CameraCaptureDocument extends w0 implements e2 {
    public static final int COUNTRY_FIELD_NUMBER = 2;
    private static final CameraCaptureDocument DEFAULT_INSTANCE;
    public static final int DOCUMENT_TYPE_FIELD_NUMBER = 1;
    public static final int PAGE_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int PREDICTED_COUNTRY_FIELD_NUMBER = 5;
    public static final int PREDICTED_DOCUMENT_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String documentType_ = "";
    private String country_ = "";
    private String page_ = "";
    private String predictedDocumentType_ = "";
    private String predictedCountry_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(CameraCaptureDocument.DEFAULT_INSTANCE);
        }
    }

    static {
        CameraCaptureDocument cameraCaptureDocument = new CameraCaptureDocument();
        DEFAULT_INSTANCE = cameraCaptureDocument;
        w0.registerDefaultInstance(CameraCaptureDocument.class, cameraCaptureDocument);
    }

    private CameraCaptureDocument() {
    }

    private void clearCountry() {
        this.bitField0_ &= -3;
        this.country_ = getDefaultInstance().getCountry();
    }

    private void clearDocumentType() {
        this.bitField0_ &= -2;
        this.documentType_ = getDefaultInstance().getDocumentType();
    }

    private void clearPage() {
        this.bitField0_ &= -5;
        this.page_ = getDefaultInstance().getPage();
    }

    private void clearPredictedCountry() {
        this.bitField0_ &= -17;
        this.predictedCountry_ = getDefaultInstance().getPredictedCountry();
    }

    private void clearPredictedDocumentType() {
        this.bitField0_ &= -9;
        this.predictedDocumentType_ = getDefaultInstance().getPredictedDocumentType();
    }

    public static CameraCaptureDocument getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static CameraCaptureDocument parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CameraCaptureDocument) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CameraCaptureDocument parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CameraCaptureDocument) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountry(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.country_ = str;
    }

    private void setCountryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.country_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentType(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.documentType_ = str;
    }

    private void setDocumentTypeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.documentType_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPage(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.page_ = str;
    }

    private void setPageBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.page_ = pVar.m();
        this.bitField0_ |= 4;
    }

    private void setPredictedCountry(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.predictedCountry_ = str;
    }

    private void setPredictedCountryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.predictedCountry_ = pVar.m();
        this.bitField0_ |= 16;
    }

    private void setPredictedDocumentType(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.predictedDocumentType_ = str;
    }

    private void setPredictedDocumentTypeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.predictedDocumentType_ = pVar.m();
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (k1.f146123a[v0Var.ordinal()]) {
            case 1:
                return new CameraCaptureDocument();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004", new Object[]{"bitField0_", "documentType_", "country_", "page_", "predictedDocumentType_", "predictedCountry_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (CameraCaptureDocument.class) {
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

    public String getCountry() {
        return this.country_;
    }

    public p getCountryBytes() {
        return p.d(this.country_);
    }

    public String getDocumentType() {
        return this.documentType_;
    }

    public p getDocumentTypeBytes() {
        return p.d(this.documentType_);
    }

    public String getPage() {
        return this.page_;
    }

    public p getPageBytes() {
        return p.d(this.page_);
    }

    public String getPredictedCountry() {
        return this.predictedCountry_;
    }

    public p getPredictedCountryBytes() {
        return p.d(this.predictedCountry_);
    }

    public String getPredictedDocumentType() {
        return this.predictedDocumentType_;
    }

    public p getPredictedDocumentTypeBytes() {
        return p.d(this.predictedDocumentType_);
    }

    public boolean hasCountry() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDocumentType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPage() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPredictedCountry() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPredictedDocumentType() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(CameraCaptureDocument cameraCaptureDocument) {
        return (a) DEFAULT_INSTANCE.createBuilder(cameraCaptureDocument);
    }

    public static CameraCaptureDocument parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CameraCaptureDocument) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CameraCaptureDocument parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCaptureDocument) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static CameraCaptureDocument parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (CameraCaptureDocument) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static CameraCaptureDocument parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCaptureDocument) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static CameraCaptureDocument parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CameraCaptureDocument) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CameraCaptureDocument parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (CameraCaptureDocument) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static CameraCaptureDocument parseFrom(InputStream inputStream) throws IOException {
        return (CameraCaptureDocument) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CameraCaptureDocument parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (CameraCaptureDocument) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static CameraCaptureDocument parseFrom(t tVar) throws IOException {
        return (CameraCaptureDocument) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static CameraCaptureDocument parseFrom(t tVar, d0 d0Var) throws IOException {
        return (CameraCaptureDocument) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
