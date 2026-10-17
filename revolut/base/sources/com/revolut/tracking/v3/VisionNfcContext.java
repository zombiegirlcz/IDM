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
import grl.be;
import grl.zd;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class VisionNfcContext extends w0 implements e2 {
    public static final int DATA_GROUPS_FAILED_TO_PARSE_FIELD_NUMBER = 9;
    public static final int DATA_GROUPS_PARSED_FIELD_NUMBER = 8;
    private static final VisionNfcContext DEFAULT_INSTANCE;
    public static final int DOCUMENT_COUNTRY_FIELD_NUMBER = 2;
    public static final int DOCUMENT_TYPE_FIELD_NUMBER = 1;
    public static final int ERRORS_FIELD_NUMBER = 7;
    public static final int MRZ_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int SCAN_ATTEMPTS_FIELD_NUMBER = 4;
    public static final int SUCCESSFUL_SCAN_FIELD_NUMBER = 5;
    public static final int SUCCESSFUL_SCAN_TIME_FIELD_NUMBER = 6;
    private int bitField0_;
    private int mrz_;
    private int scanAttempts_;
    private double successfulScanTime_;
    private boolean successfulScan_;
    private String documentType_ = "";
    private String documentCountry_ = "";
    private String errors_ = "";
    private String dataGroupsParsed_ = "";
    private String dataGroupsFailedToParse_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(VisionNfcContext.DEFAULT_INSTANCE);
        }
    }

    static {
        VisionNfcContext visionNfcContext = new VisionNfcContext();
        DEFAULT_INSTANCE = visionNfcContext;
        w0.registerDefaultInstance(VisionNfcContext.class, visionNfcContext);
    }

    private VisionNfcContext() {
    }

    private void clearDataGroupsFailedToParse() {
        this.bitField0_ &= -257;
        this.dataGroupsFailedToParse_ = getDefaultInstance().getDataGroupsFailedToParse();
    }

    private void clearDataGroupsParsed() {
        this.bitField0_ &= -129;
        this.dataGroupsParsed_ = getDefaultInstance().getDataGroupsParsed();
    }

    private void clearDocumentCountry() {
        this.bitField0_ &= -3;
        this.documentCountry_ = getDefaultInstance().getDocumentCountry();
    }

    private void clearDocumentType() {
        this.bitField0_ &= -2;
        this.documentType_ = getDefaultInstance().getDocumentType();
    }

    private void clearErrors() {
        this.bitField0_ &= -65;
        this.errors_ = getDefaultInstance().getErrors();
    }

    private void clearMrz() {
        this.bitField0_ &= -5;
        this.mrz_ = 0;
    }

    private void clearScanAttempts() {
        this.bitField0_ &= -9;
        this.scanAttempts_ = 0;
    }

    private void clearSuccessfulScan() {
        this.bitField0_ &= -17;
        this.successfulScan_ = false;
    }

    private void clearSuccessfulScanTime() {
        this.bitField0_ &= -33;
        this.successfulScanTime_ = 0.0d;
    }

    public static VisionNfcContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static VisionNfcContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VisionNfcContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VisionNfcContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VisionNfcContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDataGroupsFailedToParse(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.dataGroupsFailedToParse_ = str;
    }

    private void setDataGroupsFailedToParseBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.dataGroupsFailedToParse_ = pVar.m();
        this.bitField0_ |= 256;
    }

    private void setDataGroupsParsed(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.dataGroupsParsed_ = str;
    }

    private void setDataGroupsParsedBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.dataGroupsParsed_ = pVar.m();
        this.bitField0_ |= 128;
    }

    private void setDocumentCountry(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.documentCountry_ = str;
    }

    private void setDocumentCountryBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.documentCountry_ = pVar.m();
        this.bitField0_ |= 2;
    }

    private void setDocumentType(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.documentType_ = str;
    }

    private void setDocumentTypeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.documentType_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setErrors(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.errors_ = str;
    }

    private void setErrorsBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.errors_ = pVar.m();
        this.bitField0_ |= 64;
    }

    private void setMrz(be beVar) {
        this.mrz_ = beVar.getNumber();
        this.bitField0_ |= 4;
    }

    private void setMrzValue(int i) {
        this.bitField0_ |= 4;
        this.mrz_ = i;
    }

    private void setScanAttempts(int i) {
        this.bitField0_ |= 8;
        this.scanAttempts_ = i;
    }

    private void setSuccessfulScan(boolean z) {
        this.bitField0_ |= 16;
        this.successfulScan_ = z;
    }

    private void setSuccessfulScanTime(double d) {
        this.bitField0_ |= 32;
        this.successfulScanTime_ = d;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (zd.f146245a[v0Var.ordinal()]) {
            case 1:
                return new VisionNfcContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006က\u0005\u0007ለ\u0006\bለ\u0007\tለ\b", new Object[]{"bitField0_", "documentType_", "documentCountry_", "mrz_", "scanAttempts_", "successfulScan_", "successfulScanTime_", "errors_", "dataGroupsParsed_", "dataGroupsFailedToParse_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (VisionNfcContext.class) {
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

    public String getDataGroupsFailedToParse() {
        return this.dataGroupsFailedToParse_;
    }

    public p getDataGroupsFailedToParseBytes() {
        return p.d(this.dataGroupsFailedToParse_);
    }

    public String getDataGroupsParsed() {
        return this.dataGroupsParsed_;
    }

    public p getDataGroupsParsedBytes() {
        return p.d(this.dataGroupsParsed_);
    }

    public String getDocumentCountry() {
        return this.documentCountry_;
    }

    public p getDocumentCountryBytes() {
        return p.d(this.documentCountry_);
    }

    public String getDocumentType() {
        return this.documentType_;
    }

    public p getDocumentTypeBytes() {
        return p.d(this.documentType_);
    }

    public String getErrors() {
        return this.errors_;
    }

    public p getErrorsBytes() {
        return p.d(this.errors_);
    }

    public be getMrz() {
        int i = this.mrz_;
        be beVar = i != 0 ? i != 1 ? i != 2 ? null : be.DETECTED_VALID : be.DETECTED_INVALID : be.NOT_DETECTED;
        return beVar == null ? be.UNRECOGNIZED : beVar;
    }

    public int getMrzValue() {
        return this.mrz_;
    }

    public int getScanAttempts() {
        return this.scanAttempts_;
    }

    public boolean getSuccessfulScan() {
        return this.successfulScan_;
    }

    public double getSuccessfulScanTime() {
        return this.successfulScanTime_;
    }

    public boolean hasDataGroupsFailedToParse() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasDataGroupsParsed() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasDocumentCountry() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDocumentType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasErrors() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasMrz() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasScanAttempts() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSuccessfulScan() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSuccessfulScanTime() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(VisionNfcContext visionNfcContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(visionNfcContext);
    }

    public static VisionNfcContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (VisionNfcContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static VisionNfcContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (VisionNfcContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static VisionNfcContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (VisionNfcContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static VisionNfcContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (VisionNfcContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static VisionNfcContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VisionNfcContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VisionNfcContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (VisionNfcContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static VisionNfcContext parseFrom(InputStream inputStream) throws IOException {
        return (VisionNfcContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VisionNfcContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (VisionNfcContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static VisionNfcContext parseFrom(t tVar) throws IOException {
        return (VisionNfcContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static VisionNfcContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (VisionNfcContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
