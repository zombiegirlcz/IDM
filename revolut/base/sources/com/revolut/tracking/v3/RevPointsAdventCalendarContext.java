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
import grl.o9;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class RevPointsAdventCalendarContext extends w0 implements e2 {
    public static final int ANALYTICS_REF_FIELD_NUMBER = 3;
    private static final RevPointsAdventCalendarContext DEFAULT_INSTANCE;
    public static final int IS_LINKOUT_FIELD_NUMBER = 2;
    public static final int LINKOUT_ID_FIELD_NUMBER = 1;
    private static volatile m2 PARSER = null;
    public static final int PLACEMENT_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean isLinkout_;
    private String linkoutId_ = "";
    private String analyticsRef_ = "";
    private String placementId_ = "";

    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(RevPointsAdventCalendarContext.DEFAULT_INSTANCE);
        }
    }

    static {
        RevPointsAdventCalendarContext revPointsAdventCalendarContext = new RevPointsAdventCalendarContext();
        DEFAULT_INSTANCE = revPointsAdventCalendarContext;
        w0.registerDefaultInstance(RevPointsAdventCalendarContext.class, revPointsAdventCalendarContext);
    }

    private RevPointsAdventCalendarContext() {
    }

    private void clearAnalyticsRef() {
        this.bitField0_ &= -5;
        this.analyticsRef_ = getDefaultInstance().getAnalyticsRef();
    }

    private void clearIsLinkout() {
        this.bitField0_ &= -3;
        this.isLinkout_ = false;
    }

    private void clearLinkoutId() {
        this.bitField0_ &= -2;
        this.linkoutId_ = getDefaultInstance().getLinkoutId();
    }

    private void clearPlacementId() {
        this.bitField0_ &= -9;
        this.placementId_ = getDefaultInstance().getPlacementId();
    }

    public static RevPointsAdventCalendarContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static RevPointsAdventCalendarContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RevPointsAdventCalendarContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RevPointsAdventCalendarContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (RevPointsAdventCalendarContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsRef(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.analyticsRef_ = str;
    }

    private void setAnalyticsRefBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.analyticsRef_ = pVar.m();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLinkout(boolean z) {
        this.bitField0_ |= 2;
        this.isLinkout_ = z;
    }

    private void setLinkoutId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.linkoutId_ = str;
    }

    private void setLinkoutIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.linkoutId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementId(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.placementId_ = str;
    }

    private void setPlacementIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.placementId_ = pVar.m();
        this.bitField0_ |= 8;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (o9.f146162a[v0Var.ordinal()]) {
            case 1:
                return new RevPointsAdventCalendarContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "linkoutId_", "isLinkout_", "analyticsRef_", "placementId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (RevPointsAdventCalendarContext.class) {
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

    public String getAnalyticsRef() {
        return this.analyticsRef_;
    }

    public p getAnalyticsRefBytes() {
        return p.d(this.analyticsRef_);
    }

    public boolean getIsLinkout() {
        return this.isLinkout_;
    }

    public String getLinkoutId() {
        return this.linkoutId_;
    }

    public p getLinkoutIdBytes() {
        return p.d(this.linkoutId_);
    }

    public String getPlacementId() {
        return this.placementId_;
    }

    public p getPlacementIdBytes() {
        return p.d(this.placementId_);
    }

    public boolean hasAnalyticsRef() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIsLinkout() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLinkoutId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPlacementId() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(RevPointsAdventCalendarContext revPointsAdventCalendarContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(revPointsAdventCalendarContext);
    }

    public static RevPointsAdventCalendarContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RevPointsAdventCalendarContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RevPointsAdventCalendarContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsAdventCalendarContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static RevPointsAdventCalendarContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (RevPointsAdventCalendarContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static RevPointsAdventCalendarContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsAdventCalendarContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static RevPointsAdventCalendarContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (RevPointsAdventCalendarContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RevPointsAdventCalendarContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (RevPointsAdventCalendarContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static RevPointsAdventCalendarContext parseFrom(InputStream inputStream) throws IOException {
        return (RevPointsAdventCalendarContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RevPointsAdventCalendarContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (RevPointsAdventCalendarContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static RevPointsAdventCalendarContext parseFrom(t tVar) throws IOException {
        return (RevPointsAdventCalendarContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static RevPointsAdventCalendarContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (RevPointsAdventCalendarContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
