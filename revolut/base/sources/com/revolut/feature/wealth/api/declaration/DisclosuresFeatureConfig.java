package com.revolut.feature.wealth.api.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "TradingDisclosuresFeatureConfig", "CryptoDisclosuresFeatureConfig", "CommoditiesDisclosuresFeatureConfig", "InvestCombinedDisclosuresFeatureConfig", "Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig$CommoditiesDisclosuresFeatureConfig;", "Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig$CryptoDisclosuresFeatureConfig;", "Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig$InvestCombinedDisclosuresFeatureConfig;", "Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig$TradingDisclosuresFeatureConfig;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class DisclosuresFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig$CommoditiesDisclosuresFeatureConfig;", "Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CommoditiesDisclosuresFeatureConfig extends DisclosuresFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CommoditiesDisclosuresFeatureConfig f95194a = new CommoditiesDisclosuresFeatureConfig();

        @NotNull
        public static final Parcelable.Creator<CommoditiesDisclosuresFeatureConfig> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CommoditiesDisclosuresFeatureConfig.f95194a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommoditiesDisclosuresFeatureConfig[i];
            }
        }

        private CommoditiesDisclosuresFeatureConfig() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig$CryptoDisclosuresFeatureConfig;", "Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoDisclosuresFeatureConfig extends DisclosuresFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CryptoDisclosuresFeatureConfig f95195a = new CryptoDisclosuresFeatureConfig();

        @NotNull
        public static final Parcelable.Creator<CryptoDisclosuresFeatureConfig> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoDisclosuresFeatureConfig.f95195a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoDisclosuresFeatureConfig[i];
            }
        }

        private CryptoDisclosuresFeatureConfig() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig$InvestCombinedDisclosuresFeatureConfig;", "Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvestCombinedDisclosuresFeatureConfig extends DisclosuresFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvestCombinedDisclosuresFeatureConfig f95196a = new InvestCombinedDisclosuresFeatureConfig();

        @NotNull
        public static final Parcelable.Creator<InvestCombinedDisclosuresFeatureConfig> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InvestCombinedDisclosuresFeatureConfig.f95196a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestCombinedDisclosuresFeatureConfig[i];
            }
        }

        private InvestCombinedDisclosuresFeatureConfig() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig$TradingDisclosuresFeatureConfig;", "Lcom/revolut/feature/wealth/api/declaration/DisclosuresFeatureConfig;", "<init>", "()V", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TradingDisclosuresFeatureConfig extends DisclosuresFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TradingDisclosuresFeatureConfig f95197a = new TradingDisclosuresFeatureConfig();

        @NotNull
        public static final Parcelable.Creator<TradingDisclosuresFeatureConfig> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TradingDisclosuresFeatureConfig.f95197a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingDisclosuresFeatureConfig[i];
            }
        }

        private TradingDisclosuresFeatureConfig() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private DisclosuresFeatureConfig() {
    }
}
