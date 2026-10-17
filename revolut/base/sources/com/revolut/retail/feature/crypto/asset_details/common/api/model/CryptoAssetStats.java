package com.revolut.retail.feature.crypto.asset_details.common.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/common/api/model/CryptoAssetStats;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "MarketCapRank", "feature_crypto_asset_details_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAssetStats implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoAssetStats> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f99942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MarketCapRank f99943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f99944c;
    public final d d;
    public final d e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/common/api/model/CryptoAssetStats$MarketCapRank;", "Landroid/os/Parcelable;", "Value", "Undefined", "Lcom/revolut/retail/feature/crypto/asset_details/common/api/model/CryptoAssetStats$MarketCapRank$Undefined;", "Lcom/revolut/retail/feature/crypto/asset_details/common/api/model/CryptoAssetStats$MarketCapRank$Value;", "feature_crypto_asset_details_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface MarketCapRank extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/common/api/model/CryptoAssetStats$MarketCapRank$Undefined;", "Lcom/revolut/retail/feature/crypto/asset_details/common/api/model/CryptoAssetStats$MarketCapRank;", "<init>", "()V", "feature_crypto_asset_details_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Undefined implements MarketCapRank {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Undefined f99945a = new Undefined();

            @NotNull
            public static final Parcelable.Creator<Undefined> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Undefined.f99945a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Undefined[i];
                }
            }

            private Undefined() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.retail.feature.crypto.asset_details.common.api.model.CryptoAssetStats.MarketCapRank
            /* JADX INFO: renamed from: getValue */
            public final Integer getF99946a() {
                return null;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/asset_details/common/api/model/CryptoAssetStats$MarketCapRank$Value;", "Lcom/revolut/retail/feature/crypto/asset_details/common/api/model/CryptoAssetStats$MarketCapRank;", "", "toString", "()Ljava/lang/String;", "feature_crypto_asset_details_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Value implements MarketCapRank {

            @NotNull
            public static final Parcelable.Creator<Value> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Integer f99946a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Value(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Value[i];
                }
            }

            public Value(Integer num) {
                this.f99946a = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Value) && Intrinsics.f(this.f99946a, ((Value) obj2).f99946a);
            }

            @Override // com.revolut.retail.feature.crypto.asset_details.common.api.model.CryptoAssetStats.MarketCapRank
            /* JADX INFO: renamed from: getValue, reason: from getter */
            public final Integer getF99946a() {
                return this.f99946a;
            }

            public final int hashCode() {
                Integer num = this.f99946a;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.f99946a;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    p.a.B(dest, 1, num);
                }
            }
        }

        /* JADX INFO: renamed from: getValue */
        Integer getF99946a();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            MarketCapRank value;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            if (i == 0) {
                value = new MarketCapRank.Value(null);
            } else if (i == 1) {
                value = new MarketCapRank.Value(Integer.valueOf(parcel.readInt()));
            } else {
                if (i != 2) {
                    throw new IllegalStateException(("Unexpected market cap rank marker: " + i).toString());
                }
                value = MarketCapRank.Undefined.f99945a;
            }
            return new CryptoAssetStats(dVar, value, (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAssetStats[i];
        }
    }

    public CryptoAssetStats(d dVar, MarketCapRank marketCapRank, d dVar2, d dVar3, d dVar4) {
        Intrinsics.checkNotNullParameter(marketCapRank, "marketCapRank");
        this.f99942a = dVar;
        this.f99943b = marketCapRank;
        this.f99944c = dVar2;
        this.d = dVar3;
        this.e = dVar4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAssetStats)) {
            return false;
        }
        CryptoAssetStats cryptoAssetStats = (CryptoAssetStats) obj2;
        return Intrinsics.f(this.f99942a, cryptoAssetStats.f99942a) && Intrinsics.f(this.f99943b, cryptoAssetStats.f99943b) && Intrinsics.f(this.f99944c, cryptoAssetStats.f99944c) && Intrinsics.f(this.d, cryptoAssetStats.d) && Intrinsics.f(this.e, cryptoAssetStats.e);
    }

    public final int hashCode() {
        d dVar = this.f99942a;
        int iHashCode = (this.f99943b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31)) * 31;
        d dVar2 = this.f99944c;
        int iHashCode2 = (iHashCode + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        d dVar3 = this.d;
        int iHashCode3 = (iHashCode2 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.e;
        return iHashCode3 + (dVar4 != null ? dVar4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        parcel.writeSerializable(this.f99942a);
        MarketCapRank marketCapRank = this.f99943b;
        Intrinsics.checkNotNullParameter(marketCapRank, "<this>");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (marketCapRank instanceof MarketCapRank.Value) {
            Integer num = ((MarketCapRank.Value) marketCapRank).f99946a;
            parcel.writeInt(num == null ? 0 : 1);
            if (num != null) {
                parcel.writeInt(num.intValue());
            }
        } else {
            if (!Intrinsics.f(marketCapRank, MarketCapRank.Undefined.f99945a)) {
                throw new NoWhenBranchMatchedException();
            }
            parcel.writeInt(2);
        }
        parcel.writeSerializable(this.f99944c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
    }
}
