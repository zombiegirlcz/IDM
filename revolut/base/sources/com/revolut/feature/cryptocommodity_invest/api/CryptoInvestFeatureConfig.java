package com.revolut.feature.cryptocommodity_invest.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig;", "Lcom/revolut/feature/cryptocommodity_invest/api/CryptoCommodityInvestFeatureConfig;", "<init>", "()V", "Invest", "AllCrypto", "CollectionDetails", "CollectionsHome", "Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig$AllCrypto;", "Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig$CollectionDetails;", "Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig$CollectionsHome;", "Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig$Invest;", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CryptoInvestFeatureConfig extends CryptoCommodityInvestFeatureConfig {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig$AllCrypto;", "Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig;", "<init>", "()V", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AllCrypto extends CryptoInvestFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllCrypto f71497a = new AllCrypto();

        @NotNull
        public static final Parcelable.Creator<AllCrypto> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllCrypto.f71497a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllCrypto[i];
            }
        }

        private AllCrypto() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig$CollectionDetails;", "Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CollectionDetails extends CryptoInvestFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CollectionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71498a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CollectionDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollectionDetails[i];
            }
        }

        public CollectionDetails(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f71498a = key;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CollectionDetails) && Intrinsics.f(this.f71498a, ((CollectionDetails) obj2).f71498a);
        }

        public final int hashCode() {
            return this.f71498a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71498a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig$CollectionsHome;", "Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig;", "<init>", "()V", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CollectionsHome extends CryptoInvestFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CollectionsHome f71499a = new CollectionsHome();

        @NotNull
        public static final Parcelable.Creator<CollectionsHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CollectionsHome.f71499a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollectionsHome[i];
            }
        }

        private CollectionsHome() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig$Invest;", "Lcom/revolut/feature/cryptocommodity_invest/api/CryptoInvestFeatureConfig;", "<init>", "()V", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Invest extends CryptoInvestFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Invest f71500a = new Invest();

        @NotNull
        public static final Parcelable.Creator<Invest> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Invest.f71500a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Invest[i];
            }
        }

        private Invest() {
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

    private CryptoInvestFeatureConfig() {
    }
}
