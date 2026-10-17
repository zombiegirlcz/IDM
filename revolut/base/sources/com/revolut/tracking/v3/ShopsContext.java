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
import com.revolut.tracking.v3.RewardsImpressionMetadata;
import com.revolut.tracking.v3.ShopsImpressionMetadata;
import grl.oc;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public final class ShopsContext extends w0 implements e2 {
    public static final int ANALYTICS_REF_FIELD_NUMBER = 4;
    private static final ShopsContext DEFAULT_INSTANCE;
    public static final int IS_LINKOUT_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 2;
    private static volatile m2 PARSER = null;
    public static final int PLACEMENT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isLinkout_;
    private Metadata metadata_;
    private String placementId_ = "";
    private String analyticsRef_ = "";

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
            switch (oc.f146164a[v0Var.ordinal()]) {
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

        public f getMetadataCase() {
            int i = this.metadataCase_;
            if (i == 0) {
                return f.METADATA_NOT_SET;
            }
            if (i == 1) {
                return f.SHOPS;
            }
            if (i != 2) {
                return null;
            }
            return f.REWARDS;
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

        public final void h(String str) {
            c();
            ((ShopsContext) this.f49761b).setAnalyticsRef(str);
        }

        public final void i(boolean z) {
            c();
            ((ShopsContext) this.f49761b).setIsLinkout(z);
        }

        public final void j(String str) {
            c();
            ((ShopsContext) this.f49761b).setPlacementId(str);
        }

        private a() {
            super(ShopsContext.DEFAULT_INSTANCE);
        }
    }

    static {
        ShopsContext shopsContext = new ShopsContext();
        DEFAULT_INSTANCE = shopsContext;
        w0.registerDefaultInstance(ShopsContext.class, shopsContext);
    }

    private ShopsContext() {
    }

    private void clearAnalyticsRef() {
        this.bitField0_ &= -9;
        this.analyticsRef_ = getDefaultInstance().getAnalyticsRef();
    }

    private void clearIsLinkout() {
        this.bitField0_ &= -5;
        this.isLinkout_ = false;
    }

    private void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPlacementId() {
        this.bitField0_ &= -2;
        this.placementId_ = getDefaultInstance().getPlacementId();
    }

    public static ShopsContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static ShopsContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ShopsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShopsContext parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ShopsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m2 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsRef(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.analyticsRef_ = str;
    }

    private void setAnalyticsRefBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.analyticsRef_ = pVar.m();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLinkout(boolean z) {
        this.bitField0_ |= 4;
        this.isLinkout_ = z;
    }

    private void setMetadata(Metadata metadata) {
        metadata.getClass();
        this.metadata_ = metadata;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.placementId_ = str;
    }

    private void setPlacementIdBytes(p pVar) {
        com.google.protobuf.b.checkByteStringIsUtf8(pVar);
        this.placementId_ = pVar.m();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.w0
    public final Object dynamicMethod(v0 v0Var, Object obj2, Object obj3) {
        m2 q0Var;
        switch (oc.f146164a[v0Var.ordinal()]) {
            case 1:
                return new ShopsContext();
            case 2:
                return new a(0);
            case 3:
                return w0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "placementId_", "metadata_", "isLinkout_", "analyticsRef_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                m2 m2Var = PARSER;
                if (m2Var != null) {
                    return m2Var;
                }
                synchronized (ShopsContext.class) {
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

    public boolean hasAnalyticsRef() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsLinkout() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPlacementId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static a newBuilder(ShopsContext shopsContext) {
        return (a) DEFAULT_INSTANCE.createBuilder(shopsContext);
    }

    public static ShopsContext parseDelimitedFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ShopsContext) w0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ShopsContext parseFrom(ByteBuffer byteBuffer, d0 d0Var) throws InvalidProtocolBufferException {
        return (ShopsContext) w0.parseFrom(DEFAULT_INSTANCE, byteBuffer, d0Var);
    }

    public static ShopsContext parseFrom(p pVar) throws InvalidProtocolBufferException {
        return (ShopsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar);
    }

    public static ShopsContext parseFrom(p pVar, d0 d0Var) throws InvalidProtocolBufferException {
        return (ShopsContext) w0.parseFrom(DEFAULT_INSTANCE, pVar, d0Var);
    }

    public static ShopsContext parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ShopsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ShopsContext parseFrom(byte[] bArr, d0 d0Var) throws InvalidProtocolBufferException {
        return (ShopsContext) w0.parseFrom(DEFAULT_INSTANCE, bArr, d0Var);
    }

    public static ShopsContext parseFrom(InputStream inputStream) throws IOException {
        return (ShopsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ShopsContext parseFrom(InputStream inputStream, d0 d0Var) throws IOException {
        return (ShopsContext) w0.parseFrom(DEFAULT_INSTANCE, inputStream, d0Var);
    }

    public static ShopsContext parseFrom(t tVar) throws IOException {
        return (ShopsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar);
    }

    public static ShopsContext parseFrom(t tVar, d0 d0Var) throws IOException {
        return (ShopsContext) w0.parseFrom(DEFAULT_INSTANCE, tVar, d0Var);
    }
}
