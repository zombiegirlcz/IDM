package com.revolut.feature.cryptocommodity_invest.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class CryptoCommodityInvestApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/CryptoCommodityInvestApi$Toggles$CryptoDiscoverAllKompotMigration;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoDiscoverAllKompotMigration extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CryptoDiscoverAllKompotMigration f71494c = new CryptoDiscoverAllKompotMigration();

        @NotNull
        public static final Parcelable.Creator<CryptoDiscoverAllKompotMigration> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoDiscoverAllKompotMigration.f71494c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoDiscoverAllKompotMigration[i];
            }
        }

        private CryptoDiscoverAllKompotMigration() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cryptoDiscoverAllKompotMigration");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/CryptoCommodityInvestApi$Toggles$CryptoIsraelExpansion;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CryptoIsraelExpansion extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CryptoIsraelExpansion f71495c = new CryptoIsraelExpansion();

        @NotNull
        public static final Parcelable.Creator<CryptoIsraelExpansion> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CryptoIsraelExpansion.f71495c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoIsraelExpansion[i];
            }
        }

        private CryptoIsraelExpansion() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cryptoIsraelExpansion");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/CryptoCommodityInvestApi$Toggles$TradeTrendingSection;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TradeTrendingSection extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TradeTrendingSection f71496c = new TradeTrendingSection();

        @NotNull
        public static final Parcelable.Creator<TradeTrendingSection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TradeTrendingSection.f71496c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradeTrendingSection[i];
            }
        }

        private TradeTrendingSection() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cryptoTrendingAssets");
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

    private CryptoCommodityInvestApi$Toggles() {
    }

    public static List a() {
        return v.k(TradeTrendingSection.f71496c, CryptoIsraelExpansion.f71495c, CryptoDiscoverAllKompotMigration.f71494c);
    }
}
