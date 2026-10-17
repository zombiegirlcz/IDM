package com.revolut.feature.shops.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shops/api/config/ShopsFeatureConfig$AuctionBid$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsFeatureConfig$AuctionBid$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ShopsFeatureConfig$AuctionBid$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86981b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsFeatureConfig$AuctionBid$Destination(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsFeatureConfig$AuctionBid$Destination[i];
        }
    }

    public ShopsFeatureConfig$AuctionBid$Destination(String auctionId, String str) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        this.f86980a = auctionId;
        this.f86981b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsFeatureConfig$AuctionBid$Destination)) {
            return false;
        }
        ShopsFeatureConfig$AuctionBid$Destination shopsFeatureConfig$AuctionBid$Destination = (ShopsFeatureConfig$AuctionBid$Destination) obj2;
        return Intrinsics.f(this.f86980a, shopsFeatureConfig$AuctionBid$Destination.f86980a) && Intrinsics.f(this.f86981b, shopsFeatureConfig$AuctionBid$Destination.f86981b);
    }

    public final int hashCode() {
        int iHashCode = this.f86980a.hashCode() * 31;
        String str = this.f86981b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86980a);
        dest.writeString(this.f86981b);
    }
}
