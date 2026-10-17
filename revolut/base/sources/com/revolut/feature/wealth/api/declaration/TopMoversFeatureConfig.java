package com.revolut.feature.wealth.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mzg.e;
import mzg.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/TopMoversFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "TradingTopMovers", "CryptoTopMovers", "mzg/f", "mzg/e", "Lcom/revolut/feature/wealth/api/declaration/TopMoversFeatureConfig$CryptoTopMovers;", "Lcom/revolut/feature/wealth/api/declaration/TopMoversFeatureConfig$TradingTopMovers;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TopMoversFeatureConfig implements FeatureConfig {
    private TopMoversFeatureConfig() {
    }

    /* JADX INFO: renamed from: a */
    public abstract e getF95216b();

    /* JADX INFO: renamed from: b */
    public abstract f getF95215a();

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/TopMoversFeatureConfig$TradingTopMovers;", "Lcom/revolut/feature/wealth/api/declaration/TopMoversFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingTopMovers extends TopMoversFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<TradingTopMovers> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f95215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f95216b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradingTopMovers(f.valueOf(parcel.readString()), e.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingTopMovers[i];
            }
        }

        public TradingTopMovers(f timeSpan, e filter) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.f95215a = timeSpan;
            this.f95216b = filter;
        }

        @Override // com.revolut.feature.wealth.api.declaration.TopMoversFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getF95216b() {
            return this.f95216b;
        }

        @Override // com.revolut.feature.wealth.api.declaration.TopMoversFeatureConfig
        /* JADX INFO: renamed from: b, reason: from getter */
        public final f getF95215a() {
            return this.f95215a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingTopMovers)) {
                return false;
            }
            TradingTopMovers tradingTopMovers = (TradingTopMovers) obj2;
            return this.f95215a == tradingTopMovers.f95215a && this.f95216b == tradingTopMovers.f95216b;
        }

        public final int hashCode() {
            return this.f95216b.hashCode() + (this.f95215a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95215a.name());
            dest.writeString(this.f95216b.name());
        }

        public TradingTopMovers() {
            this(f.ONE_DAY, e.ALL);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/TopMoversFeatureConfig$CryptoTopMovers;", "Lcom/revolut/feature/wealth/api/declaration/TopMoversFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoTopMovers extends TopMoversFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CryptoTopMovers> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f95212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f95213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AnalyticsProduct f95214c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoTopMovers(f.valueOf(parcel.readString()), e.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(CryptoTopMovers.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoTopMovers[i];
            }
        }

        public CryptoTopMovers(f timeSpan, e filter, AnalyticsProduct analyticsProduct) {
            Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
            Intrinsics.checkNotNullParameter(filter, "filter");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            this.f95212a = timeSpan;
            this.f95213b = filter;
            this.f95214c = analyticsProduct;
        }

        @Override // com.revolut.feature.wealth.api.declaration.TopMoversFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getF95216b() {
            return this.f95213b;
        }

        @Override // com.revolut.feature.wealth.api.declaration.TopMoversFeatureConfig
        /* JADX INFO: renamed from: b, reason: from getter */
        public final f getF95215a() {
            return this.f95212a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CryptoTopMovers)) {
                return false;
            }
            CryptoTopMovers cryptoTopMovers = (CryptoTopMovers) obj2;
            return this.f95212a == cryptoTopMovers.f95212a && this.f95213b == cryptoTopMovers.f95213b && Intrinsics.f(this.f95214c, cryptoTopMovers.f95214c);
        }

        public final int hashCode() {
            return this.f95214c.hashCode() + ((this.f95213b.hashCode() + (this.f95212a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f95212a.name());
            dest.writeString(this.f95213b.name());
            dest.writeParcelable(this.f95214c, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public CryptoTopMovers() {
            f fVar = f.ONE_DAY;
            e eVar = e.ALL;
            k9 k9Var = k9.Crypto;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            this(fVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
        }
    }
}
