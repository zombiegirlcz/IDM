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
import grl.p9;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class RevPointsBuyingContext extends w0 implements e2 {
    public static final int DECREASED_AMOUNT_FIELD_NUMBER = 7;
    private static final RevPointsBuyingContext DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 9;
    public static final int INCREASED_AMOUNT_FIELD_NUMBER = 6;
    public static final int IS_DEACTIVATION_FIELD_NUMBER = 5;
    public static final int IS_DEPRECATED_FIELD_NUMBER = 8;
    public static final int IS_RECURRING_FIELD_NUMBER = 3;
    public static final int IS_UPSELL_FIELD_NUMBER = 4;
    private static volatile m2 PARSER = null;
    public static final int POINTS_AMOUNT_FIELD_NUMBER = 1;
    public static final int STANDING_ORDER_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean decreasedAmount_;
    private int errorCode_;
    private boolean increasedAmount_;
    private boolean isDeactivation_;
    private boolean isDeprecated_;
    private boolean isRecurring_;
    private boolean isUpsell_;
    private double pointsAmount_;
    private String standingOrderId_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        public final void h(boolean z) {
            c();
            ((RevPointsBuyingContext) this.f49761b).setIsDeprecated(z);
        }

        public final void i(boolean z) {
            c();
            ((RevPointsBuyingContext) this.f49761b).setIsRecurring(z);
        }

        public final void j(double d) {
            c();
            ((RevPointsBuyingContext) this.f49761b).setPointsAmount(d);
        }

        private a() {
            super(RevPointsBuyingContext.DEFAULT_INSTANCE);
        }
    }

    static {
        RevPointsBuyingContext revPointsBuyingContext = new RevPointsBuyingContext();
        DEFAULT_INSTANCE = revPointsBuyingContext;
        w0.registerDefaultInstance(RevPointsBuyingContext.class, revPointsBuyingContext);
    }

    private RevPointsBuyingContext() {
    }

    private void clearDecreasedAmount() {
        this.bitField0_ &= -65;
        this.decreasedAmount_ = false;
    }

    private void clearErrorCode() {
        this.bitField0_ &= -257;
        this.errorCode_ = 0;
    }

    private void clearIncreasedAmount() {
        this.bitField0_ &= -33;
        this.increasedAmount_ = false;
    }

    private void clearIsDeactivation() {
        this.bitField0_ &= -17;
        this.isDeactivation_ = false;
    }

    private void clearIsDeprecated() {
        this.bitField0_ &= -129;
        this.isDeprecated_ = false;
    }

    private void clearIsRecurring() {
        this.bitField0_ &= -5;
        this.isRecurring_ = false;
    }

    private void clearIsUpsell() {
        this.bitField0_ &= -9;
        this.isUpsell_ = false;
    }

    private void clearPointsAmount() {
        this.bitField0_ &= -2;
        this.pointsAmount_ = 0.0d;
    }

    private void clearStandingOrderId() {
        this.bitField0_ &= -3;
        this.standingOrderId_ = getDefaultInstance().getStandingOrderId();
    }

    public static RevPointsBuyingContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static RevPointsBuyingContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RevPointsBuyingContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RevPointsBuyingContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RevPointsBuyingContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDecreasedAmount(boolean z) {
        this.bitField0_ |= 64;
        this.decreasedAmount_ = z;
    }

    private void setErrorCode(int i) {
        this.bitField0_ |= 256;
        this.errorCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncreasedAmount(boolean z) {
        this.bitField0_ |= 32;
        this.increasedAmount_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDeactivation(boolean z) {
        this.bitField0_ |= 16;
        this.isDeactivation_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsDeprecated(boolean z) {
        this.bitField0_ |= 128;
        this.isDeprecated_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRecurring(boolean z) {
        this.bitField0_ |= 4;
        this.isRecurring_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsUpsell(boolean z) {
        this.bitField0_ |= 8;
        this.isUpsell_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointsAmount(double d) {
        this.bitField0_ |= 1;
        this.pointsAmount_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStandingOrderId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.standingOrderId_ = str;
    }

    private void setStandingOrderIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.standingOrderId_ = pVar.m();
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (p9.f146173a[v0Var.ordinal()]) {
            case 1:
                return new RevPointsBuyingContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001က\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tင\b", new Object[]{"bitField0_", "pointsAmount_", "standingOrderId_", "isRecurring_", "isUpsell_", "isDeactivation_", "increasedAmount_", "decreasedAmount_", "isDeprecated_", "errorCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (RevPointsBuyingContext.class) {
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

    public boolean getDecreasedAmount() {
        return this.decreasedAmount_;
    }

    public int getErrorCode() {
        return this.errorCode_;
    }

    public boolean getIncreasedAmount() {
        return this.increasedAmount_;
    }

    public boolean getIsDeactivation() {
        return this.isDeactivation_;
    }

    public boolean getIsDeprecated() {
        return this.isDeprecated_;
    }

    public boolean getIsRecurring() {
        return this.isRecurring_;
    }

    public boolean getIsUpsell() {
        return this.isUpsell_;
    }

    public double getPointsAmount() {
        return this.pointsAmount_;
    }

    public String getStandingOrderId() {
        return this.standingOrderId_;
    }

    public p getStandingOrderIdBytes() {
        return p.d(this.standingOrderId_);
    }

    public boolean hasDecreasedAmount() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasErrorCode() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasIncreasedAmount() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasIsDeactivation() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIsDeprecated() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasIsRecurring() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsUpsell() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPointsAmount() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStandingOrderId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(RevPointsBuyingContext revPointsBuyingContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(revPointsBuyingContext);
    }

    public static RevPointsBuyingContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RevPointsBuyingContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RevPointsBuyingContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsBuyingContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static RevPointsBuyingContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (RevPointsBuyingContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RevPointsBuyingContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsBuyingContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static RevPointsBuyingContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RevPointsBuyingContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RevPointsBuyingContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsBuyingContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static RevPointsBuyingContext parseFrom(InputStream inputStream) throws IOException {
        return (RevPointsBuyingContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RevPointsBuyingContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RevPointsBuyingContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RevPointsBuyingContext parseFrom(t tVar) throws IOException {
        return (RevPointsBuyingContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static RevPointsBuyingContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (RevPointsBuyingContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
