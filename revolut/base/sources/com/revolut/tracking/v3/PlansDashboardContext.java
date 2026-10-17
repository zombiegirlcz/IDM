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
import grl.i8;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class PlansDashboardContext extends w0 implements e2 {
    public static final int CONTAINS_STANDARD_PLAN_FIELD_NUMBER = 1;
    private static final PlansDashboardContext DEFAULT_INSTANCE;
    public static final int IS_DISCOUNT_FIELD_NUMBER = 2;
    public static final int IS_FREETRIAL_FIELD_NUMBER = 3;
    public static final int IS_ONBOARDING_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 7;
    private static volatile m2 PARSER = null;
    public static final int PLAN_NAME_FIELD_NUMBER = 5;
    public static final int SOURCE_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean containsStandardPlan_;
    private boolean isDiscount_;
    private boolean isFreetrial_;
    private boolean isOnboarding_;
    private h3 metadata_;
    private String planName_ = "";
    private String source_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(PlansDashboardContext.DEFAULT_INSTANCE);
        }
    }

    static {
        PlansDashboardContext plansDashboardContext = new PlansDashboardContext();
        DEFAULT_INSTANCE = plansDashboardContext;
        w0.registerDefaultInstance(PlansDashboardContext.class, plansDashboardContext);
    }

    private PlansDashboardContext() {
    }

    private void clearContainsStandardPlan() {
        this.bitField0_ &= -2;
        this.containsStandardPlan_ = false;
    }

    private void clearIsDiscount() {
        this.bitField0_ &= -3;
        this.isDiscount_ = false;
    }

    private void clearIsFreetrial() {
        this.bitField0_ &= -5;
        this.isFreetrial_ = false;
    }

    private void clearIsOnboarding() {
        this.bitField0_ &= -9;
        this.isOnboarding_ = false;
    }

    private void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -65;
    }

    private void clearPlanName() {
        this.bitField0_ &= -17;
        this.planName_ = getDefaultInstance().getPlanName();
    }

    private void clearSource() {
        this.bitField0_ &= -33;
        this.source_ = getDefaultInstance().getSource();
    }

    public static PlansDashboardContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMetadata(h3 h3Var) {
        h3Var.getClass();
        h3 h3Var2 = this.metadata_;
        if (h3Var2 == null || h3Var2 == h3.getDefaultInstance()) {
            this.metadata_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder(this.metadata_);
            f3VarNewBuilder.f(h3Var);
            this.metadata_ = (h3) f3VarNewBuilder.b();
        }
        this.bitField0_ |= 64;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static PlansDashboardContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PlansDashboardContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlansDashboardContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PlansDashboardContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setContainsStandardPlan(boolean z) {
        this.bitField0_ |= 1;
        this.containsStandardPlan_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDiscount(boolean z) {
        this.bitField0_ |= 2;
        this.isDiscount_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFreetrial(boolean z) {
        this.bitField0_ |= 4;
        this.isFreetrial_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOnboarding(boolean z) {
        this.bitField0_ |= 8;
        this.isOnboarding_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(h3 h3Var) {
        h3Var.getClass();
        this.metadata_ = h3Var;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlanName(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.planName_ = str;
    }

    private void setPlanNameBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.planName_ = pVar.m();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSource(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.source_ = str;
    }

    private void setSourceBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.source_ = pVar.m();
        this.bitField0_ |= 32;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (i8.f146111a[v0Var.ordinal()]) {
            case 1:
                return new PlansDashboardContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "containsStandardPlan_", "isDiscount_", "isFreetrial_", "isOnboarding_", "planName_", "source_", "metadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (PlansDashboardContext.class) {
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

    public boolean getContainsStandardPlan() {
        return this.containsStandardPlan_;
    }

    public boolean getIsDiscount() {
        return this.isDiscount_;
    }

    public boolean getIsFreetrial() {
        return this.isFreetrial_;
    }

    public boolean getIsOnboarding() {
        return this.isOnboarding_;
    }

    public h3 getMetadata() {
        h3 h3Var = this.metadata_;
        return h3Var == null ? h3.getDefaultInstance() : h3Var;
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

    public boolean hasContainsStandardPlan() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsDiscount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsFreetrial() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsOnboarding() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasPlanName() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSource() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(PlansDashboardContext plansDashboardContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(plansDashboardContext);
    }

    public static PlansDashboardContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (PlansDashboardContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static PlansDashboardContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (PlansDashboardContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static PlansDashboardContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (PlansDashboardContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static PlansDashboardContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (PlansDashboardContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static PlansDashboardContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PlansDashboardContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PlansDashboardContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (PlansDashboardContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static PlansDashboardContext parseFrom(InputStream inputStream) throws IOException {
        return (PlansDashboardContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PlansDashboardContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (PlansDashboardContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static PlansDashboardContext parseFrom(t tVar) throws IOException {
        return (PlansDashboardContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static PlansDashboardContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (PlansDashboardContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
