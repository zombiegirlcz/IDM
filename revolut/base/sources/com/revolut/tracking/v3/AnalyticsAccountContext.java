package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.f3;
import com.google.protobuf.h3;
import com.google.protobuf.k4;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import com.google.protobuf.x1;
import com.google.protobuf.y1;
import grl.t;
import grl.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class AnalyticsAccountContext extends w0 implements e2 {
    public static final int ANALYTICS_ACCOUNT_TYPE_FIELD_NUMBER = 1;
    public static final int ANALYTICS_PERIODS_FROM_CURRENT_FIELD_NUMBER = 3;
    public static final int ANALYTICS_PERIOD_SIZES_FIELD_NUMBER = 2;
    public static final int ANALYTICS_SELECTED_ACCOUNTS_FIELD_NUMBER = 5;
    private static final AnalyticsAccountContext DEFAULT_INSTANCE;
    public static final int IS_REV_POINTS_BANNER_SHOWN_FIELD_NUMBER = 4;
    private static volatile m2 PARSER;
    private int analyticsAccountType_;
    private y1 analyticsPeriodSizes_;
    private y1 analyticsPeriodsFromCurrent_;
    private h3 analyticsSelectedAccounts_;
    private int bitField0_;
    private boolean isRevPointsBannerShown_;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x1 f106782a = new x1(k4.INT32, 0, k4.STRING, "");

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x1 f106783a;

        static {
            k4 k4Var = k4.INT32;
            f106783a = new x1(k4Var, 0, k4Var, 0);
        }

        private b() {
        }
    }

    public static final class c extends p0 implements e2 {
        public /* synthetic */ c(int i) {
            this();
        }

        private c() {
            super(AnalyticsAccountContext.DEFAULT_INSTANCE);
        }
    }

    static {
        AnalyticsAccountContext analyticsAccountContext = new AnalyticsAccountContext();
        DEFAULT_INSTANCE = analyticsAccountContext;
        w0.registerDefaultInstance(AnalyticsAccountContext.class, analyticsAccountContext);
    }

    private AnalyticsAccountContext() {
        y1 y1Var = y1.f49836b;
        this.analyticsPeriodSizes_ = y1Var;
        this.analyticsPeriodsFromCurrent_ = y1Var;
    }

    private void clearAnalyticsAccountType() {
        this.bitField0_ &= -2;
        this.analyticsAccountType_ = 0;
    }

    private void clearAnalyticsSelectedAccounts() {
        this.analyticsSelectedAccounts_ = null;
        this.bitField0_ &= -5;
    }

    private void clearIsRevPointsBannerShown() {
        this.bitField0_ &= -3;
        this.isRevPointsBannerShown_ = false;
    }

    public static AnalyticsAccountContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, String> getMutableAnalyticsPeriodSizesMap() {
        return internalGetMutableAnalyticsPeriodSizes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<Integer, Integer> getMutableAnalyticsPeriodsFromCurrentMap() {
        return internalGetMutableAnalyticsPeriodsFromCurrent();
    }

    private y1 internalGetAnalyticsPeriodSizes() {
        return this.analyticsPeriodSizes_;
    }

    private y1 internalGetAnalyticsPeriodsFromCurrent() {
        return this.analyticsPeriodsFromCurrent_;
    }

    private y1 internalGetMutableAnalyticsPeriodSizes() {
        y1 y1Var = this.analyticsPeriodSizes_;
        if (!y1Var.f49837a) {
            this.analyticsPeriodSizes_ = y1Var.c();
        }
        return this.analyticsPeriodSizes_;
    }

    private y1 internalGetMutableAnalyticsPeriodsFromCurrent() {
        y1 y1Var = this.analyticsPeriodsFromCurrent_;
        if (!y1Var.f49837a) {
            this.analyticsPeriodsFromCurrent_ = y1Var.c();
        }
        return this.analyticsPeriodsFromCurrent_;
    }

    private void mergeAnalyticsSelectedAccounts(h3 h3Var) {
        h3Var.getClass();
        h3 h3Var2 = this.analyticsSelectedAccounts_;
        if (h3Var2 == null || h3Var2 == h3.getDefaultInstance()) {
            this.analyticsSelectedAccounts_ = h3Var;
        } else {
            f3 f3VarNewBuilder = h3.newBuilder(this.analyticsSelectedAccounts_);
            f3VarNewBuilder.f(h3Var);
            this.analyticsSelectedAccounts_ = (h3) f3VarNewBuilder.b();
        }
        this.bitField0_ |= 4;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static AnalyticsAccountContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AnalyticsAccountContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnalyticsAccountContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AnalyticsAccountContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsAccountType(v vVar) {
        this.analyticsAccountType_ = vVar.getNumber();
        this.bitField0_ |= 1;
    }

    private void setAnalyticsAccountTypeValue(int i) {
        this.bitField0_ |= 1;
        this.analyticsAccountType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsSelectedAccounts(h3 h3Var) {
        h3Var.getClass();
        this.analyticsSelectedAccounts_ = h3Var;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsRevPointsBannerShown(boolean z) {
        this.bitField0_ |= 2;
        this.isRevPointsBannerShown_ = z;
    }

    public boolean containsAnalyticsPeriodSizes(int i) {
        return internalGetAnalyticsPeriodSizes().containsKey(Integer.valueOf(i));
    }

    public boolean containsAnalyticsPeriodsFromCurrent(int i) {
        return internalGetAnalyticsPeriodsFromCurrent().containsKey(Integer.valueOf(i));
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (t.f146203a[v0Var.ordinal()]) {
            case 1:
                return new AnalyticsAccountContext();
            case 2:
                return new c(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0002\u0000\u0000\u0001ဌ\u0000\u00022\u00032\u0004ဇ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "analyticsAccountType_", "analyticsPeriodSizes_", a.f106782a, "analyticsPeriodsFromCurrent_", b.f106783a, "isRevPointsBannerShown_", "analyticsSelectedAccounts_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (AnalyticsAccountContext.class) {
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

    public v getAnalyticsAccountType() {
        v vVar;
        switch (this.analyticsAccountType_) {
            case 0:
                vVar = v.PERSONAL;
                break;
            case 1:
                vVar = v.JOINT;
                break;
            case 2:
                vVar = v.LINKED;
                break;
            case 3:
                vVar = v.PRO;
                break;
            case 4:
                vVar = v.SAVINGS;
                break;
            case 5:
                vVar = v.CREDIT;
                break;
            case 6:
                vVar = v.YOUTH;
                break;
            default:
                vVar = null;
                break;
        }
        return vVar == null ? v.UNRECOGNIZED : vVar;
    }

    public int getAnalyticsAccountTypeValue() {
        return this.analyticsAccountType_;
    }

    @Deprecated
    public Map<Integer, String> getAnalyticsPeriodSizes() {
        return getAnalyticsPeriodSizesMap();
    }

    public int getAnalyticsPeriodSizesCount() {
        return internalGetAnalyticsPeriodSizes().size();
    }

    public Map<Integer, String> getAnalyticsPeriodSizesMap() {
        return Collections.unmodifiableMap(internalGetAnalyticsPeriodSizes());
    }

    public String getAnalyticsPeriodSizesOrDefault(int i, String str) {
        y1 y1VarInternalGetAnalyticsPeriodSizes = internalGetAnalyticsPeriodSizes();
        return y1VarInternalGetAnalyticsPeriodSizes.containsKey(Integer.valueOf(i)) ? (String) y1VarInternalGetAnalyticsPeriodSizes.get(Integer.valueOf(i)) : str;
    }

    public String getAnalyticsPeriodSizesOrThrow(int i) {
        y1 y1VarInternalGetAnalyticsPeriodSizes = internalGetAnalyticsPeriodSizes();
        if (y1VarInternalGetAnalyticsPeriodSizes.containsKey(Integer.valueOf(i))) {
            return (String) y1VarInternalGetAnalyticsPeriodSizes.get(Integer.valueOf(i));
        }
        throw new IllegalArgumentException();
    }

    @Deprecated
    public Map<Integer, Integer> getAnalyticsPeriodsFromCurrent() {
        return getAnalyticsPeriodsFromCurrentMap();
    }

    public int getAnalyticsPeriodsFromCurrentCount() {
        return internalGetAnalyticsPeriodsFromCurrent().size();
    }

    public Map<Integer, Integer> getAnalyticsPeriodsFromCurrentMap() {
        return Collections.unmodifiableMap(internalGetAnalyticsPeriodsFromCurrent());
    }

    public int getAnalyticsPeriodsFromCurrentOrDefault(int i, int i2) {
        y1 y1VarInternalGetAnalyticsPeriodsFromCurrent = internalGetAnalyticsPeriodsFromCurrent();
        return y1VarInternalGetAnalyticsPeriodsFromCurrent.containsKey(Integer.valueOf(i)) ? ((Integer) y1VarInternalGetAnalyticsPeriodsFromCurrent.get(Integer.valueOf(i))).intValue() : i2;
    }

    public int getAnalyticsPeriodsFromCurrentOrThrow(int i) {
        y1 y1VarInternalGetAnalyticsPeriodsFromCurrent = internalGetAnalyticsPeriodsFromCurrent();
        if (y1VarInternalGetAnalyticsPeriodsFromCurrent.containsKey(Integer.valueOf(i))) {
            return ((Integer) y1VarInternalGetAnalyticsPeriodsFromCurrent.get(Integer.valueOf(i))).intValue();
        }
        throw new IllegalArgumentException();
    }

    public h3 getAnalyticsSelectedAccounts() {
        h3 h3Var = this.analyticsSelectedAccounts_;
        return h3Var == null ? h3.getDefaultInstance() : h3Var;
    }

    public boolean getIsRevPointsBannerShown() {
        return this.isRevPointsBannerShown_;
    }

    public boolean hasAnalyticsAccountType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAnalyticsSelectedAccounts() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsRevPointsBannerShown() {
        return (this.bitField0_ & 2) != 0;
    }

    public static c newBuilder(AnalyticsAccountContext analyticsAccountContext) {
        return (c) DEFAULT_INSTANCE.createBuilder(analyticsAccountContext);
    }

    public static AnalyticsAccountContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AnalyticsAccountContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AnalyticsAccountContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (AnalyticsAccountContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static AnalyticsAccountContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (AnalyticsAccountContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static AnalyticsAccountContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (AnalyticsAccountContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static AnalyticsAccountContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AnalyticsAccountContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AnalyticsAccountContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (AnalyticsAccountContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static AnalyticsAccountContext parseFrom(InputStream inputStream) throws IOException {
        return (AnalyticsAccountContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnalyticsAccountContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (AnalyticsAccountContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static AnalyticsAccountContext parseFrom(com.google.protobuf.t tVar) throws IOException {
        return (AnalyticsAccountContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static AnalyticsAccountContext parseFrom(com.google.protobuf.t tVar, d0 d0Var) throws IOException {
        return (AnalyticsAccountContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
