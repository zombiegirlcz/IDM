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
import com.revolut.tracking.v3.CameraCaptureContext;
import com.revolut.tracking.v3.VisionDocumentSelectionContext;
import com.revolut.tracking.v3.VisionNfcContext;
import grl.ce;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class VisionVerificationContext extends w0 implements e2 {
    public static final int ATTEMPT_ID_FIELD_NUMBER = 7;
    public static final int ATTEMPT_INDEX_FIELD_NUMBER = 8;
    private static final VisionVerificationContext DEFAULT_INSTANCE;
    public static final int INNER_CONTEXT_FIELD_NUMBER = 5;
    private static volatile m2 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 1;
    public static final int STEP_ATTEMPT_FIELD_NUMBER = 4;
    public static final int STEP_NUMBER_FIELD_NUMBER = 3;
    public static final int TOKEN_HASH_FIELD_NUMBER = 2;
    public static final int VERIFICATION_ID_FIELD_NUMBER = 6;
    private int attemptIndex_;
    private int bitField0_;
    private Inner_context innerContext_;
    private int stepAttempt_;
    private int stepNumber_;
    private String source_ = "";
    private String tokenHash_ = "";
    private String verificationId_ = "";
    private String attemptId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class Inner_context extends w0 implements e2 {
        private static final Inner_context DEFAULT_INSTANCE;
        public static final int DOCUMENT_SELECTION_CONTEXT_FIELD_NUMBER = 2;
        public static final int NFC_CONTEXT_FIELD_NUMBER = 3;
        private static volatile m2 PARSER = null;
        public static final int STEP_CAPTURE_CONTEXT_FIELD_NUMBER = 1;
        private int innerContextCase_ = 0;
        private Object innerContext_;

        public static final class a extends p0 implements e2 {
            public /* synthetic */ a(int i) {
                this();
            }

            public final void h(CameraCaptureContext cameraCaptureContext) {
                c();
                ((Inner_context) this.f49761b).setStepCaptureContext(cameraCaptureContext);
            }

            private a() {
                super(Inner_context.DEFAULT_INSTANCE);
            }
        }

        static {
            Inner_context inner_context = new Inner_context();
            DEFAULT_INSTANCE = inner_context;
            w0.registerDefaultInstance(Inner_context.class, inner_context);
        }

        private Inner_context() {
        }

        private void clearDocumentSelectionContext() {
            if (this.innerContextCase_ == 2) {
                this.innerContextCase_ = 0;
                this.innerContext_ = null;
            }
        }

        private void clearInnerContext() {
            this.innerContextCase_ = 0;
            this.innerContext_ = null;
        }

        private void clearNfcContext() {
            if (this.innerContextCase_ == 3) {
                this.innerContextCase_ = 0;
                this.innerContext_ = null;
            }
        }

        private void clearStepCaptureContext() {
            if (this.innerContextCase_ == 1) {
                this.innerContextCase_ = 0;
                this.innerContext_ = null;
            }
        }

        public static Inner_context getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeDocumentSelectionContext(VisionDocumentSelectionContext visionDocumentSelectionContext) {
            visionDocumentSelectionContext.getClass();
            if (this.innerContextCase_ != 2 || this.innerContext_ == VisionDocumentSelectionContext.getDefaultInstance()) {
                this.innerContext_ = visionDocumentSelectionContext;
            } else {
                VisionDocumentSelectionContext.a aVarNewBuilder = VisionDocumentSelectionContext.newBuilder((VisionDocumentSelectionContext) this.innerContext_);
                aVarNewBuilder.f(visionDocumentSelectionContext);
                this.innerContext_ = aVarNewBuilder.b();
            }
            this.innerContextCase_ = 2;
        }

        private void mergeNfcContext(VisionNfcContext visionNfcContext) {
            visionNfcContext.getClass();
            if (this.innerContextCase_ != 3 || this.innerContext_ == VisionNfcContext.getDefaultInstance()) {
                this.innerContext_ = visionNfcContext;
            } else {
                VisionNfcContext.a aVarNewBuilder = VisionNfcContext.newBuilder((VisionNfcContext) this.innerContext_);
                aVarNewBuilder.f(visionNfcContext);
                this.innerContext_ = aVarNewBuilder.b();
            }
            this.innerContextCase_ = 3;
        }

        private void mergeStepCaptureContext(CameraCaptureContext cameraCaptureContext) {
            cameraCaptureContext.getClass();
            if (this.innerContextCase_ != 1 || this.innerContext_ == CameraCaptureContext.getDefaultInstance()) {
                this.innerContext_ = cameraCaptureContext;
            } else {
                CameraCaptureContext.a aVarNewBuilder = CameraCaptureContext.newBuilder((CameraCaptureContext) this.innerContext_);
                aVarNewBuilder.f(cameraCaptureContext);
                this.innerContext_ = aVarNewBuilder.b();
            }
            this.innerContextCase_ = 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Inner_context parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Inner_context) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Inner_context parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Inner_context) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDocumentSelectionContext(VisionDocumentSelectionContext visionDocumentSelectionContext) {
            visionDocumentSelectionContext.getClass();
            this.innerContext_ = visionDocumentSelectionContext;
            this.innerContextCase_ = 2;
        }

        private void setNfcContext(VisionNfcContext visionNfcContext) {
            visionNfcContext.getClass();
            this.innerContext_ = visionNfcContext;
            this.innerContextCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStepCaptureContext(CameraCaptureContext cameraCaptureContext) {
            cameraCaptureContext.getClass();
            this.innerContext_ = cameraCaptureContext;
            this.innerContextCase_ = 1;
        }

        @Override // com.google.protobuf.w0
        public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
            m2 q0Var;
            switch (ce.f146075a[v0Var.ordinal()]) {
                case 1:
                    return new Inner_context();
                case 2:
                    return new a(0);
                case 3:
                    return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"innerContext_", "innerContextCase_", CameraCaptureContext.class, VisionDocumentSelectionContext.class, VisionNfcContext.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (Inner_context.class) {
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

        public VisionDocumentSelectionContext getDocumentSelectionContext() {
            return this.innerContextCase_ == 2 ? (VisionDocumentSelectionContext) this.innerContext_ : VisionDocumentSelectionContext.getDefaultInstance();
        }

        public g getInnerContextCase() {
            int i = this.innerContextCase_;
            if (i == 0) {
                return g.INNERCONTEXT_NOT_SET;
            }
            if (i == 1) {
                return g.STEP_CAPTURE_CONTEXT;
            }
            if (i == 2) {
                return g.DOCUMENT_SELECTION_CONTEXT;
            }
            if (i != 3) {
                return null;
            }
            return g.NFC_CONTEXT;
        }

        public VisionNfcContext getNfcContext() {
            return this.innerContextCase_ == 3 ? (VisionNfcContext) this.innerContext_ : VisionNfcContext.getDefaultInstance();
        }

        public CameraCaptureContext getStepCaptureContext() {
            return this.innerContextCase_ == 1 ? (CameraCaptureContext) this.innerContext_ : CameraCaptureContext.getDefaultInstance();
        }

        public boolean hasDocumentSelectionContext() {
            return this.innerContextCase_ == 2;
        }

        public boolean hasNfcContext() {
            return this.innerContextCase_ == 3;
        }

        public boolean hasStepCaptureContext() {
            return this.innerContextCase_ == 1;
        }

        public static a newBuilder(Inner_context inner_context) {
            return (a) DEFAULT_INSTANCE.createBuilder(inner_context);
        }

        public static Inner_context parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Inner_context) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Inner_context parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
            return (Inner_context) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
        }

        public static Inner_context parseFrom(p pVar) throws InvalidProtocolBufferException {
            return (Inner_context) w0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static Inner_context parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
            return (Inner_context) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
        }

        public static Inner_context parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Inner_context) w0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Inner_context parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
            return (Inner_context) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
        }

        public static Inner_context parseFrom(InputStream inputStream) throws IOException {
            return (Inner_context) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Inner_context parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Inner_context) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Inner_context parseFrom(t tVar) throws IOException {
            return (Inner_context) w0.parseFrom(DEFAULT_INSTANCE, tVar);
        }

        public static Inner_context parseFrom(t tVar, d0 d0Var) throws IOException {
            return (Inner_context) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(Inner_context inner_context) {
            c();
            ((VisionVerificationContext) this.f49761b).setInnerContext(inner_context);
        }

        private a() {
            super(VisionVerificationContext.DEFAULT_INSTANCE);
        }
    }

    static {
        VisionVerificationContext visionVerificationContext = new VisionVerificationContext();
        DEFAULT_INSTANCE = visionVerificationContext;
        w0.registerDefaultInstance(VisionVerificationContext.class, visionVerificationContext);
    }

    private VisionVerificationContext() {
    }

    private void clearAttemptId() {
        this.bitField0_ &= -65;
        this.attemptId_ = getDefaultInstance().getAttemptId();
    }

    private void clearAttemptIndex() {
        this.bitField0_ &= -129;
        this.attemptIndex_ = 0;
    }

    private void clearInnerContext() {
        this.innerContext_ = null;
        this.bitField0_ &= -17;
    }

    private void clearSource() {
        this.bitField0_ &= -2;
        this.source_ = getDefaultInstance().getSource();
    }

    private void clearStepAttempt() {
        this.bitField0_ &= -9;
        this.stepAttempt_ = 0;
    }

    private void clearStepNumber() {
        this.bitField0_ &= -5;
        this.stepNumber_ = 0;
    }

    private void clearTokenHash() {
        this.bitField0_ &= -3;
        this.tokenHash_ = getDefaultInstance().getTokenHash();
    }

    private void clearVerificationId() {
        this.bitField0_ &= -33;
        this.verificationId_ = getDefaultInstance().getVerificationId();
    }

    public static VisionVerificationContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeInnerContext(Inner_context inner_context) {
        inner_context.getClass();
        Inner_context inner_context2 = this.innerContext_;
        if (inner_context2 == null || inner_context2 == Inner_context.getDefaultInstance()) {
            this.innerContext_ = inner_context;
        } else {
            Inner_context.a aVarNewBuilder = Inner_context.newBuilder(this.innerContext_);
            aVarNewBuilder.f(inner_context);
            this.innerContext_ = (Inner_context) aVarNewBuilder.b();
        }
        this.bitField0_ |= 16;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static VisionVerificationContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VisionVerificationContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VisionVerificationContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VisionVerificationContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAttemptId(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.attemptId_ = str;
    }

    private void setAttemptIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.attemptId_ = pVar.m();
        this.bitField0_ |= 64;
    }

    private void setAttemptIndex(int i) {
        this.bitField0_ |= 128;
        this.attemptIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInnerContext(Inner_context inner_context) {
        inner_context.getClass();
        this.innerContext_ = inner_context;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.source_ = str;
    }

    private void setSourceBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.source_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setStepAttempt(int i) {
        this.bitField0_ |= 8;
        this.stepAttempt_ = i;
    }

    private void setStepNumber(int i) {
        this.bitField0_ |= 4;
        this.stepNumber_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTokenHash(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.tokenHash_ = str;
    }

    private void setTokenHashBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.tokenHash_ = pVar.m();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerificationId(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.verificationId_ = str;
    }

    private void setVerificationIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.verificationId_ = pVar.m();
        this.bitField0_ |= 32;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (ce.f146075a[v0Var.ordinal()]) {
            case 1:
                return new VisionVerificationContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003င\u0002\u0004င\u0003\u0005ဉ\u0004\u0006ለ\u0005\u0007ለ\u0006\bင\u0007", new Object[]{"bitField0_", "source_", "tokenHash_", "stepNumber_", "stepAttempt_", "innerContext_", "verificationId_", "attemptId_", "attemptIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (VisionVerificationContext.class) {
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

    public String getAttemptId() {
        return this.attemptId_;
    }

    public p getAttemptIdBytes() {
        return p.d(this.attemptId_);
    }

    public int getAttemptIndex() {
        return this.attemptIndex_;
    }

    public Inner_context getInnerContext() {
        Inner_context inner_context = this.innerContext_;
        return inner_context == null ? Inner_context.getDefaultInstance() : inner_context;
    }

    public String getSource() {
        return this.source_;
    }

    public p getSourceBytes() {
        return p.d(this.source_);
    }

    public int getStepAttempt() {
        return this.stepAttempt_;
    }

    public int getStepNumber() {
        return this.stepNumber_;
    }

    public String getTokenHash() {
        return this.tokenHash_;
    }

    public p getTokenHashBytes() {
        return p.d(this.tokenHash_);
    }

    public String getVerificationId() {
        return this.verificationId_;
    }

    public p getVerificationIdBytes() {
        return p.d(this.verificationId_);
    }

    public boolean hasAttemptId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasAttemptIndex() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasInnerContext() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStepAttempt() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStepNumber() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTokenHash() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVerificationId() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(VisionVerificationContext visionVerificationContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(visionVerificationContext);
    }

    public static VisionVerificationContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (VisionVerificationContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static VisionVerificationContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (VisionVerificationContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static VisionVerificationContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (VisionVerificationContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static VisionVerificationContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (VisionVerificationContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static VisionVerificationContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VisionVerificationContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VisionVerificationContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (VisionVerificationContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static VisionVerificationContext parseFrom(InputStream inputStream) throws IOException {
        return (VisionVerificationContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VisionVerificationContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (VisionVerificationContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static VisionVerificationContext parseFrom(t tVar) throws IOException {
        return (VisionVerificationContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static VisionVerificationContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (VisionVerificationContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
