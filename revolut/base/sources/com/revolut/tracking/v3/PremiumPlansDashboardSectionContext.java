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
import grl.l8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class PremiumPlansDashboardSectionContext extends w0 implements e2 {
    private static final PremiumPlansDashboardSectionContext DEFAULT_INSTANCE;
    public static final int IS_FIRST_IMPRESSION_FIELD_NUMBER = 3;
    private static volatile m2 PARSER = null;
    public static final int PLAN_NAME_FIELD_NUMBER = 1;
    public static final int SECTION_NAME_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isFirstImpression_;
    private String planName_ = "";
    private String sectionName_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(PremiumPlansDashboardSectionContext.DEFAULT_INSTANCE);
        }
    }

    static {
        PremiumPlansDashboardSectionContext premiumPlansDashboardSectionContext = new PremiumPlansDashboardSectionContext();
        DEFAULT_INSTANCE = premiumPlansDashboardSectionContext;
        w0.registerDefaultInstance(PremiumPlansDashboardSectionContext.class, premiumPlansDashboardSectionContext);
    }

    private PremiumPlansDashboardSectionContext() {
    }

    private void clearIsFirstImpression() {
        this.bitField0_ &= -5;
        this.isFirstImpression_ = false;
    }

    private void clearPlanName() {
        this.bitField0_ &= -2;
        this.planName_ = getDefaultInstance().getPlanName();
    }

    private void clearSectionName() {
        this.bitField0_ &= -3;
        this.sectionName_ = getDefaultInstance().getSectionName();
    }

    public static PremiumPlansDashboardSectionContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static PremiumPlansDashboardSectionContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PremiumPlansDashboardSectionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiumPlansDashboardSectionContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PremiumPlansDashboardSectionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setIsFirstImpression(boolean z) {
        this.bitField0_ |= 4;
        this.isFirstImpression_ = z;
    }

    private void setPlanName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.planName_ = str;
    }

    private void setPlanNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.planName_ = pVar.m();
        this.bitField0_ |= 1;
    }

    private void setSectionName(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sectionName_ = str;
    }

    private void setSectionNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.sectionName_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (l8.f146136a[v0Var.ordinal()]) {
            case 1:
                return new PremiumPlansDashboardSectionContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "planName_", "sectionName_", "isFirstImpression_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (PremiumPlansDashboardSectionContext.class) {
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

    public boolean getIsFirstImpression() {
        return this.isFirstImpression_;
    }

    public String getPlanName() {
        return this.planName_;
    }

    public p getPlanNameBytes() {
        return p.d(this.planName_);
    }

    public String getSectionName() {
        return this.sectionName_;
    }

    public p getSectionNameBytes() {
        return p.d(this.sectionName_);
    }

    public boolean hasIsFirstImpression() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPlanName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSectionName() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(PremiumPlansDashboardSectionContext premiumPlansDashboardSectionContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(premiumPlansDashboardSectionContext);
    }

    public static PremiumPlansDashboardSectionContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (PremiumPlansDashboardSectionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static PremiumPlansDashboardSectionContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (PremiumPlansDashboardSectionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static PremiumPlansDashboardSectionContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (PremiumPlansDashboardSectionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static PremiumPlansDashboardSectionContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (PremiumPlansDashboardSectionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static PremiumPlansDashboardSectionContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PremiumPlansDashboardSectionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PremiumPlansDashboardSectionContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (PremiumPlansDashboardSectionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static PremiumPlansDashboardSectionContext parseFrom(InputStream inputStream) throws IOException {
        return (PremiumPlansDashboardSectionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PremiumPlansDashboardSectionContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (PremiumPlansDashboardSectionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static PremiumPlansDashboardSectionContext parseFrom(t tVar) throws IOException {
        return (PremiumPlansDashboardSectionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static PremiumPlansDashboardSectionContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (PremiumPlansDashboardSectionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
