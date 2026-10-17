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
import grl.l7;
import grl.n7;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class OutcomeViewContext extends w0 implements e2 {
    private static final OutcomeViewContext DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int ERROR_CODE_FIELD_NUMBER = 3;
    public static final int FILE_ID_FIELD_NUMBER = 5;
    public static final int IDENTIFIER_FIELD_NUMBER = 2;
    public static final int ORIGINAL_ERROR_FIELD_NUMBER = 10;
    public static final int ORIGINAL_IDENTIFIER_FIELD_NUMBER = 4;
    public static final int OUTCOME_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 6;
    private int bitField0_;
    private int outcome_;
    private String identifier_ = "";
    private String errorCode_ = "";
    private String originalIdentifier_ = "";
    private String fileId_ = "";
    private String title_ = "";
    private String description_ = "";
    private String primaryButton_ = "";
    private String secondaryButton_ = "";
    private String originalError_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(OutcomeViewContext.DEFAULT_INSTANCE);
        }
    }

    static {
        OutcomeViewContext outcomeViewContext = new OutcomeViewContext();
        DEFAULT_INSTANCE = outcomeViewContext;
        w0.registerDefaultInstance(OutcomeViewContext.class, outcomeViewContext);
    }

    private OutcomeViewContext() {
    }

    private void clearDescription() {
        this.bitField0_ &= -65;
        this.description_ = getDefaultInstance().getDescription();
    }

    private void clearErrorCode() {
        this.bitField0_ &= -5;
        this.errorCode_ = getDefaultInstance().getErrorCode();
    }

    private void clearFileId() {
        this.bitField0_ &= -17;
        this.fileId_ = getDefaultInstance().getFileId();
    }

    private void clearIdentifier() {
        this.bitField0_ &= -3;
        this.identifier_ = getDefaultInstance().getIdentifier();
    }

    private void clearOriginalError() {
        this.bitField0_ &= -513;
        this.originalError_ = getDefaultInstance().getOriginalError();
    }

    private void clearOriginalIdentifier() {
        this.bitField0_ &= -9;
        this.originalIdentifier_ = getDefaultInstance().getOriginalIdentifier();
    }

    private void clearOutcome() {
        this.bitField0_ &= -2;
        this.outcome_ = 0;
    }

    private void clearPrimaryButton() {
        this.bitField0_ &= -129;
        this.primaryButton_ = getDefaultInstance().getPrimaryButton();
    }

    private void clearSecondaryButton() {
        this.bitField0_ &= -257;
        this.secondaryButton_ = getDefaultInstance().getSecondaryButton();
    }

    private void clearTitle() {
        this.bitField0_ &= -33;
        this.title_ = getDefaultInstance().getTitle();
    }

    public static OutcomeViewContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static OutcomeViewContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OutcomeViewContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OutcomeViewContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OutcomeViewContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.description_ = str;
    }

    private void setDescriptionBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.description_ = pVar.m();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorCode(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.errorCode_ = str;
    }

    private void setErrorCodeBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.errorCode_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileId(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.fileId_ = str;
    }

    private void setFileIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.fileId_ = pVar.m();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifier(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.identifier_ = str;
    }

    private void setIdentifierBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.identifier_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalError(String str) {
        str.getClass();
        this.bitField0_ |= 512;
        this.originalError_ = str;
    }

    private void setOriginalErrorBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.originalError_ = pVar.m();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalIdentifier(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.originalIdentifier_ = str;
    }

    private void setOriginalIdentifierBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.originalIdentifier_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOutcome(n7 n7Var) {
        this.outcome_ = n7Var.getNumber();
        this.bitField0_ |= 1;
    }

    private void setOutcomeValue(int i) {
        this.bitField0_ |= 1;
        this.outcome_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryButton(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.primaryButton_ = str;
    }

    private void setPrimaryButtonBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.primaryButton_ = pVar.m();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryButton(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.secondaryButton_ = str;
    }

    private void setSecondaryButtonBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.secondaryButton_ = pVar.m();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.title_ = str;
    }

    private void setTitleBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.title_ = pVar.m();
        this.bitField0_ |= 32;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (l7.f146135a[v0Var.ordinal()]) {
            case 1:
                return new OutcomeViewContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t", new Object[]{"bitField0_", "outcome_", "identifier_", "errorCode_", "originalIdentifier_", "fileId_", "title_", "description_", "primaryButton_", "secondaryButton_", "originalError_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (OutcomeViewContext.class) {
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

    public String getDescription() {
        return this.description_;
    }

    public p getDescriptionBytes() {
        return p.d(this.description_);
    }

    public String getErrorCode() {
        return this.errorCode_;
    }

    public p getErrorCodeBytes() {
        return p.d(this.errorCode_);
    }

    public String getFileId() {
        return this.fileId_;
    }

    public p getFileIdBytes() {
        return p.d(this.fileId_);
    }

    public String getIdentifier() {
        return this.identifier_;
    }

    public p getIdentifierBytes() {
        return p.d(this.identifier_);
    }

    public String getOriginalError() {
        return this.originalError_;
    }

    public p getOriginalErrorBytes() {
        return p.d(this.originalError_);
    }

    public String getOriginalIdentifier() {
        return this.originalIdentifier_;
    }

    public p getOriginalIdentifierBytes() {
        return p.d(this.originalIdentifier_);
    }

    public n7 getOutcome() {
        n7 n7VarA = n7.a(this.outcome_);
        return n7VarA == null ? n7.UNRECOGNIZED : n7VarA;
    }

    public int getOutcomeValue() {
        return this.outcome_;
    }

    public String getPrimaryButton() {
        return this.primaryButton_;
    }

    public p getPrimaryButtonBytes() {
        return p.d(this.primaryButton_);
    }

    public String getSecondaryButton() {
        return this.secondaryButton_;
    }

    public p getSecondaryButtonBytes() {
        return p.d(this.secondaryButton_);
    }

    public String getTitle() {
        return this.title_;
    }

    public p getTitleBytes() {
        return p.d(this.title_);
    }

    public boolean hasDescription() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFileId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIdentifier() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOriginalError() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasOriginalIdentifier() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOutcome() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPrimaryButton() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSecondaryButton() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(OutcomeViewContext outcomeViewContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(outcomeViewContext);
    }

    public static OutcomeViewContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (OutcomeViewContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static OutcomeViewContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (OutcomeViewContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static OutcomeViewContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (OutcomeViewContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static OutcomeViewContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (OutcomeViewContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static OutcomeViewContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OutcomeViewContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OutcomeViewContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (OutcomeViewContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static OutcomeViewContext parseFrom(InputStream inputStream) throws IOException {
        return (OutcomeViewContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OutcomeViewContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (OutcomeViewContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static OutcomeViewContext parseFrom(t tVar) throws IOException {
        return (OutcomeViewContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static OutcomeViewContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (OutcomeViewContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
