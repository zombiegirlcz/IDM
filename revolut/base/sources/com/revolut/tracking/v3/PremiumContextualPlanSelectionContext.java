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
import grl.k8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class PremiumContextualPlanSelectionContext extends w0 implements e2 {
    private static final PremiumContextualPlanSelectionContext DEFAULT_INSTANCE;
    private static volatile m2 PARSER = null;
    public static final int PLAN_NAME_FIELD_NUMBER = 2;
    public static final int SOURCE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String source_ = "";
    private String planName_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(PremiumContextualPlanSelectionContext.DEFAULT_INSTANCE);
        }
    }

    static {
        PremiumContextualPlanSelectionContext premiumContextualPlanSelectionContext = new PremiumContextualPlanSelectionContext();
        DEFAULT_INSTANCE = premiumContextualPlanSelectionContext;
        w0.registerDefaultInstance(PremiumContextualPlanSelectionContext.class, premiumContextualPlanSelectionContext);
    }

    private PremiumContextualPlanSelectionContext() {
    }

    private void clearPlanName() {
        this.bitField0_ &= -3;
        this.planName_ = getDefaultInstance().getPlanName();
    }

    private void clearSource() {
        this.bitField0_ &= -2;
        this.source_ = getDefaultInstance().getSource();
    }

    public static PremiumContextualPlanSelectionContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static PremiumContextualPlanSelectionContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PremiumContextualPlanSelectionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiumContextualPlanSelectionContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PremiumContextualPlanSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.planName_ = str;
    }

    private void setPlanNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.planName_ = pVar.m();
        this.bitField0_ |= 2;
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

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (k8.f146129a[v0Var.ordinal()]) {
            case 1:
                return new PremiumContextualPlanSelectionContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "source_", "planName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (PremiumContextualPlanSelectionContext.class) {
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

    public String getPlanName() {
        return this.planName_;
    }

    public p getPlanNameBytes() {
        return p.d(this.planName_);
    }

    public String getSource() {
        return this.source_;
    }

    public p getSourceBytes() {
        return p.d(this.source_);
    }

    public boolean hasPlanName() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(PremiumContextualPlanSelectionContext premiumContextualPlanSelectionContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(premiumContextualPlanSelectionContext);
    }

    public static PremiumContextualPlanSelectionContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (PremiumContextualPlanSelectionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static PremiumContextualPlanSelectionContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (PremiumContextualPlanSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static PremiumContextualPlanSelectionContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (PremiumContextualPlanSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static PremiumContextualPlanSelectionContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (PremiumContextualPlanSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static PremiumContextualPlanSelectionContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PremiumContextualPlanSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PremiumContextualPlanSelectionContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (PremiumContextualPlanSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static PremiumContextualPlanSelectionContext parseFrom(InputStream inputStream) throws IOException {
        return (PremiumContextualPlanSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiumContextualPlanSelectionContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (PremiumContextualPlanSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static PremiumContextualPlanSelectionContext parseFrom(t tVar) throws IOException {
        return (PremiumContextualPlanSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static PremiumContextualPlanSelectionContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (PremiumContextualPlanSelectionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
