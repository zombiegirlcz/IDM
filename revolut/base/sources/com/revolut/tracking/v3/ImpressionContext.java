package com.revolut.tracking.v3;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.d0;
import com.google.protobuf.e2;
import com.google.protobuf.j3;
import com.google.protobuf.k3;
import com.google.protobuf.m2;
import com.google.protobuf.p;
import com.google.protobuf.p0;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.google.protobuf.v0;
import com.google.protobuf.w0;
import com.revolut.tracking.v3.RewardsImpressionMetadata;
import com.revolut.tracking.v3.ShopsImpressionMetadata;
import grl.b5;
import grl.d5;
import grl.z4;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class ImpressionContext extends w0 implements e2 {
    public static final int ANALYTICS_REF_FIELD_NUMBER = 15;
    public static final int CLICK_TIMESTAMP_FIELD_NUMBER = 11;
    public static final int COMPONENT_ID_FIELD_NUMBER = 17;
    public static final int CREATIVE_URL_FIELD_NUMBER = 1;
    private static final ImpressionContext DEFAULT_INSTANCE;
    public static final int IMPRESSION_TYPE_FIELD_NUMBER = 13;
    public static final int IS_FIRST_IMPRESSION_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 12;
    private static volatile m2 PARSER = null;
    public static final int PLACEMENT_ID_FIELD_NUMBER = 3;
    public static final int PLACEMENT_TYPE_FIELD_NUMBER = 14;
    public static final int SLOT_POSITION_FIELD_NUMBER = 16;
    public static final int VIEW_TIMESTAMP_IN_FIELD_NUMBER = 9;
    public static final int VIEW_TIMESTAMP_OUT_FIELD_NUMBER = 10;
    public static final int VISIBILITY_100_TIME_MS_FIELD_NUMBER = 8;
    public static final int VISIBILITY_GE25_TIME_MS_FIELD_NUMBER = 5;
    public static final int VISIBILITY_GE50_TIME_MS_FIELD_NUMBER = 6;
    public static final int VISIBILITY_GE75_TIME_MS_FIELD_NUMBER = 7;
    public static final int VISIBILITY_L25_TIME_MS_FIELD_NUMBER = 4;
    private int bitField0_;
    private k3 clickTimestamp_;
    private int impressionType_;
    private boolean isFirstImpression_;
    private Metadata metadata_;
    private int placementType_;
    private int slotPosition_;
    private k3 viewTimestampIn_;
    private k3 viewTimestampOut_;
    private int visibility100TimeMs_;
    private int visibilityGe25TimeMs_;
    private int visibilityGe50TimeMs_;
    private int visibilityGe75TimeMs_;
    private int visibilityL25TimeMs_;
    private String creativeUrl_ = "";
    private String placementId_ = "";
    private String analyticsRef_ = "";
    private String componentId_ = "";

    /* JADX INFO: loaded from: classes12.dex */
    public static final class Metadata extends w0 implements e2 {
        private static final Metadata DEFAULT_INSTANCE;
        private static volatile m2 PARSER = null;
        public static final int REWARDS_FIELD_NUMBER = 2;
        public static final int SHOPS_FIELD_NUMBER = 1;
        private int metadataCase_ = 0;
        private Object metadata_;

        public static final class a extends p0 implements e2 {
            public /* synthetic */ a(int i) {
                this();
            }

            private a() {
                super(Metadata.DEFAULT_INSTANCE);
            }
        }

        static {
            Metadata metadata = new Metadata();
            DEFAULT_INSTANCE = metadata;
            w0.registerDefaultInstance(Metadata.class, metadata);
        }

        private Metadata() {
        }

        private void clearMetadata() {
            this.metadataCase_ = 0;
            this.metadata_ = null;
        }

        private void clearRewards() {
            if (this.metadataCase_ == 2) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        private void clearShops() {
            if (this.metadataCase_ == 1) {
                this.metadataCase_ = 0;
                this.metadata_ = null;
            }
        }

        public static Metadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeRewards(RewardsImpressionMetadata rewardsImpressionMetadata) {
            rewardsImpressionMetadata.getClass();
            if (this.metadataCase_ != 2 || this.metadata_ == RewardsImpressionMetadata.getDefaultInstance()) {
                this.metadata_ = rewardsImpressionMetadata;
            } else {
                RewardsImpressionMetadata.a aVarNewBuilder = RewardsImpressionMetadata.newBuilder((RewardsImpressionMetadata) this.metadata_);
                aVarNewBuilder.f(rewardsImpressionMetadata);
                this.metadata_ = aVarNewBuilder.b();
            }
            this.metadataCase_ = 2;
        }

        private void mergeShops(ShopsImpressionMetadata shopsImpressionMetadata) {
            shopsImpressionMetadata.getClass();
            if (this.metadataCase_ != 1 || this.metadata_ == ShopsImpressionMetadata.getDefaultInstance()) {
                this.metadata_ = shopsImpressionMetadata;
            } else {
                ShopsImpressionMetadata.a aVarNewBuilder = ShopsImpressionMetadata.newBuilder((ShopsImpressionMetadata) this.metadata_);
                aVarNewBuilder.f(shopsImpressionMetadata);
                this.metadata_ = aVarNewBuilder.b();
            }
            this.metadataCase_ = 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Metadata) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static m2 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRewards(RewardsImpressionMetadata rewardsImpressionMetadata) {
            rewardsImpressionMetadata.getClass();
            this.metadata_ = rewardsImpressionMetadata;
            this.metadataCase_ = 2;
        }

        private void setShops(ShopsImpressionMetadata shopsImpressionMetadata) {
            shopsImpressionMetadata.getClass();
            this.metadata_ = shopsImpressionMetadata;
            this.metadataCase_ = 1;
        }

        @Override // com.google.protobuf.w0
        public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
            m2 q0Var;
            switch (z4.f146243a[v0Var.ordinal()]) {
                case 1:
                    return new Metadata();
                case 2:
                    return new a(0);
                case 3:
                    return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"metadata_", "metadataCase_", ShopsImpressionMetadata.class, RewardsImpressionMetadata.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    m2 m2Var = PARSER;
                    if (m2Var != null) {
                        return m2Var;
                    }
                    synchronized (Metadata.class) {
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

        public e getMetadataCase() {
            int i = this.metadataCase_;
            if (i == 0) {
                return e.METADATA_NOT_SET;
            }
            if (i == 1) {
                return e.SHOPS;
            }
            if (i != 2) {
                return null;
            }
            return e.REWARDS;
        }

        public RewardsImpressionMetadata getRewards() {
            return this.metadataCase_ == 2 ? (RewardsImpressionMetadata) this.metadata_ : RewardsImpressionMetadata.getDefaultInstance();
        }

        public ShopsImpressionMetadata getShops() {
            return this.metadataCase_ == 1 ? (ShopsImpressionMetadata) this.metadata_ : ShopsImpressionMetadata.getDefaultInstance();
        }

        public boolean hasRewards() {
            return this.metadataCase_ == 2;
        }

        public boolean hasShops() {
            return this.metadataCase_ == 1;
        }

        public static a newBuilder(Metadata metadata) {
            return (a) DEFAULT_INSTANCE.createBuilder(metadata);
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Metadata) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
        }

        public static Metadata parseFrom(p pVar) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, pVar);
        }

        public static Metadata parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
        }

        public static Metadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Metadata parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
        }

        public static Metadata parseFrom(InputStream inputStream) throws IOException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
        }

        public static Metadata parseFrom(t tVar) throws IOException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, tVar);
        }

        public static Metadata parseFrom(t tVar, d0 d0Var) throws IOException {
            return (Metadata) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a extends p0 implements e2 {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(ImpressionContext.DEFAULT_INSTANCE);
        }
    }

    static {
        ImpressionContext impressionContext = new ImpressionContext();
        DEFAULT_INSTANCE = impressionContext;
        w0.registerDefaultInstance(ImpressionContext.class, impressionContext);
    }

    private ImpressionContext() {
    }

    private void clearAnalyticsRef() {
        this.bitField0_ &= -16385;
        this.analyticsRef_ = getDefaultInstance().getAnalyticsRef();
    }

    private void clearClickTimestamp() {
        this.clickTimestamp_ = null;
        this.bitField0_ &= -1025;
    }

    private void clearComponentId() {
        this.bitField0_ &= -65537;
        this.componentId_ = getDefaultInstance().getComponentId();
    }

    private void clearCreativeUrl() {
        this.bitField0_ &= -2;
        this.creativeUrl_ = getDefaultInstance().getCreativeUrl();
    }

    private void clearImpressionType() {
        this.bitField0_ &= -4097;
        this.impressionType_ = 0;
    }

    private void clearIsFirstImpression() {
        this.bitField0_ &= -3;
        this.isFirstImpression_ = false;
    }

    private void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2049;
    }

    private void clearPlacementId() {
        this.bitField0_ &= -5;
        this.placementId_ = getDefaultInstance().getPlacementId();
    }

    private void clearPlacementType() {
        this.bitField0_ &= -8193;
        this.placementType_ = 0;
    }

    private void clearSlotPosition() {
        this.bitField0_ &= -32769;
        this.slotPosition_ = 0;
    }

    private void clearViewTimestampIn() {
        this.viewTimestampIn_ = null;
        this.bitField0_ &= -257;
    }

    private void clearViewTimestampOut() {
        this.viewTimestampOut_ = null;
        this.bitField0_ &= -513;
    }

    private void clearVisibility100TimeMs() {
        this.bitField0_ &= -129;
        this.visibility100TimeMs_ = 0;
    }

    private void clearVisibilityGe25TimeMs() {
        this.bitField0_ &= -17;
        this.visibilityGe25TimeMs_ = 0;
    }

    private void clearVisibilityGe50TimeMs() {
        this.bitField0_ &= -33;
        this.visibilityGe50TimeMs_ = 0;
    }

    private void clearVisibilityGe75TimeMs() {
        this.bitField0_ &= -65;
        this.visibilityGe75TimeMs_ = 0;
    }

    private void clearVisibilityL25TimeMs() {
        this.bitField0_ &= -9;
        this.visibilityL25TimeMs_ = 0;
    }

    public static ImpressionContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeClickTimestamp(k3 k3Var) {
        k3Var.getClass();
        k3 k3Var2 = this.clickTimestamp_;
        if (k3Var2 == null || k3Var2 == k3.getDefaultInstance()) {
            this.clickTimestamp_ = k3Var;
        } else {
            j3 j3VarNewBuilder = k3.newBuilder(this.clickTimestamp_);
            j3VarNewBuilder.f(k3Var);
            this.clickTimestamp_ = (k3) j3VarNewBuilder.b();
        }
        this.bitField0_ |= 1024;
    }

    private void mergeMetadata(Metadata metadata) {
        metadata.getClass();
        Metadata metadata2 = this.metadata_;
        if (metadata2 == null || metadata2 == Metadata.getDefaultInstance()) {
            this.metadata_ = metadata;
        } else {
            Metadata.a aVarNewBuilder = Metadata.newBuilder(this.metadata_);
            aVarNewBuilder.f(metadata);
            this.metadata_ = (Metadata) aVarNewBuilder.b();
        }
        this.bitField0_ |= 2048;
    }

    private void mergeViewTimestampIn(k3 k3Var) {
        k3Var.getClass();
        k3 k3Var2 = this.viewTimestampIn_;
        if (k3Var2 == null || k3Var2 == k3.getDefaultInstance()) {
            this.viewTimestampIn_ = k3Var;
        } else {
            j3 j3VarNewBuilder = k3.newBuilder(this.viewTimestampIn_);
            j3VarNewBuilder.f(k3Var);
            this.viewTimestampIn_ = (k3) j3VarNewBuilder.b();
        }
        this.bitField0_ |= 256;
    }

    private void mergeViewTimestampOut(k3 k3Var) {
        k3Var.getClass();
        k3 k3Var2 = this.viewTimestampOut_;
        if (k3Var2 == null || k3Var2 == k3.getDefaultInstance()) {
            this.viewTimestampOut_ = k3Var;
        } else {
            j3 j3VarNewBuilder = k3.newBuilder(this.viewTimestampOut_);
            j3VarNewBuilder.f(k3Var);
            this.viewTimestampOut_ = (k3) j3VarNewBuilder.b();
        }
        this.bitField0_ |= 512;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ImpressionContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ImpressionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImpressionContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ImpressionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsRef(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.analyticsRef_ = str;
    }

    private void setAnalyticsRefBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.analyticsRef_ = pVar.m();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickTimestamp(k3 k3Var) {
        k3Var.getClass();
        this.clickTimestamp_ = k3Var;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setComponentId(String str) {
        str.getClass();
        this.bitField0_ |= 65536;
        this.componentId_ = str;
    }

    private void setComponentIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.componentId_ = pVar.m();
        this.bitField0_ |= 65536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.creativeUrl_ = str;
    }

    private void setCreativeUrlBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.creativeUrl_ = pVar.m();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressionType(b5 b5Var) {
        this.impressionType_ = b5Var.getNumber();
        this.bitField0_ |= 4096;
    }

    private void setImpressionTypeValue(int i) {
        this.bitField0_ |= 4096;
        this.impressionType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFirstImpression(boolean z) {
        this.bitField0_ |= 2;
        this.isFirstImpression_ = z;
    }

    private void setMetadata(Metadata metadata) {
        metadata.getClass();
        this.metadata_ = metadata;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.placementId_ = str;
    }

    private void setPlacementIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.placementId_ = pVar.m();
        this.bitField0_ |= 4;
    }

    private void setPlacementType(d5 d5Var) {
        this.placementType_ = d5Var.getNumber();
        this.bitField0_ |= 8192;
    }

    private void setPlacementTypeValue(int i) {
        this.bitField0_ |= 8192;
        this.placementType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSlotPosition(int i) {
        this.bitField0_ |= 32768;
        this.slotPosition_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewTimestampIn(k3 k3Var) {
        k3Var.getClass();
        this.viewTimestampIn_ = k3Var;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewTimestampOut(k3 k3Var) {
        k3Var.getClass();
        this.viewTimestampOut_ = k3Var;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibility100TimeMs(int i) {
        this.bitField0_ |= 128;
        this.visibility100TimeMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibilityGe25TimeMs(int i) {
        this.bitField0_ |= 16;
        this.visibilityGe25TimeMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibilityGe50TimeMs(int i) {
        this.bitField0_ |= 32;
        this.visibilityGe50TimeMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibilityGe75TimeMs(int i) {
        this.bitField0_ |= 64;
        this.visibilityGe75TimeMs_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibilityL25TimeMs(int i) {
        this.bitField0_ |= 8;
        this.visibilityL25TimeMs_ = i;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (z4.f146243a[v0Var.ordinal()]) {
            case 1:
                return new ImpressionContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ለ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဌ\f\u000eဌ\r\u000fለ\u000e\u0010င\u000f\u0011ለ\u0010", new Object[]{"bitField0_", "creativeUrl_", "isFirstImpression_", "placementId_", "visibilityL25TimeMs_", "visibilityGe25TimeMs_", "visibilityGe50TimeMs_", "visibilityGe75TimeMs_", "visibility100TimeMs_", "viewTimestampIn_", "viewTimestampOut_", "clickTimestamp_", "metadata_", "impressionType_", "placementType_", "analyticsRef_", "slotPosition_", "componentId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ImpressionContext.class) {
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

    public k3 getClickTimestamp() {
        k3 k3Var = this.clickTimestamp_;
        return k3Var == null ? k3.getDefaultInstance() : k3Var;
    }

    public String getComponentId() {
        return this.componentId_;
    }

    public p getComponentIdBytes() {
        return p.d(this.componentId_);
    }

    public String getCreativeUrl() {
        return this.creativeUrl_;
    }

    public p getCreativeUrlBytes() {
        return p.d(this.creativeUrl_);
    }

    public b5 getImpressionType() {
        b5 b5VarA = b5.a(this.impressionType_);
        return b5VarA == null ? b5.UNRECOGNIZED : b5VarA;
    }

    public int getImpressionTypeValue() {
        return this.impressionType_;
    }

    public boolean getIsFirstImpression() {
        return this.isFirstImpression_;
    }

    public Metadata getMetadata() {
        Metadata metadata = this.metadata_;
        return metadata == null ? Metadata.getDefaultInstance() : metadata;
    }

    public String getPlacementId() {
        return this.placementId_;
    }

    public p getPlacementIdBytes() {
        return p.d(this.placementId_);
    }

    public d5 getPlacementType() {
        d5 d5VarA = d5.a(this.placementType_);
        return d5VarA == null ? d5.UNRECOGNIZED : d5VarA;
    }

    public int getPlacementTypeValue() {
        return this.placementType_;
    }

    public int getSlotPosition() {
        return this.slotPosition_;
    }

    public k3 getViewTimestampIn() {
        k3 k3Var = this.viewTimestampIn_;
        return k3Var == null ? k3.getDefaultInstance() : k3Var;
    }

    public k3 getViewTimestampOut() {
        k3 k3Var = this.viewTimestampOut_;
        return k3Var == null ? k3.getDefaultInstance() : k3Var;
    }

    public int getVisibility100TimeMs() {
        return this.visibility100TimeMs_;
    }

    public int getVisibilityGe25TimeMs() {
        return this.visibilityGe25TimeMs_;
    }

    public int getVisibilityGe50TimeMs() {
        return this.visibilityGe50TimeMs_;
    }

    public int getVisibilityGe75TimeMs() {
        return this.visibilityGe75TimeMs_;
    }

    public int getVisibilityL25TimeMs() {
        return this.visibilityL25TimeMs_;
    }

    public boolean hasAnalyticsRef() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasClickTimestamp() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasComponentId() {
        return (this.bitField0_ & 65536) != 0;
    }

    public boolean hasCreativeUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasImpressionType() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasIsFirstImpression() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasPlacementId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPlacementType() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasSlotPosition() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasViewTimestampIn() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasViewTimestampOut() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasVisibility100TimeMs() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasVisibilityGe25TimeMs() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasVisibilityGe50TimeMs() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasVisibilityGe75TimeMs() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasVisibilityL25TimeMs() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(ImpressionContext impressionContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(impressionContext);
    }

    public static ImpressionContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ImpressionContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ImpressionContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (ImpressionContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ImpressionContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ImpressionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ImpressionContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (ImpressionContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ImpressionContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ImpressionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ImpressionContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (ImpressionContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ImpressionContext parseFrom(InputStream inputStream) throws IOException {
        return (ImpressionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ImpressionContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ImpressionContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ImpressionContext parseFrom(t tVar) throws IOException {
        return (ImpressionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ImpressionContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (ImpressionContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
