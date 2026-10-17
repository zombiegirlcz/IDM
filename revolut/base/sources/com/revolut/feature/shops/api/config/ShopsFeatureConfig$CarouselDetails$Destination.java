package com.revolut.feature.shops.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shops/api/config/ShopsFeatureConfig$CarouselDetails$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsFeatureConfig$CarouselDetails$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ShopsFeatureConfig$CarouselDetails$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86985b;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsFeatureConfig$CarouselDetails$Destination(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsFeatureConfig$CarouselDetails$Destination[i];
        }
    }

    public ShopsFeatureConfig$CarouselDetails$Destination(String carouselId, String carouselTitle) {
        Intrinsics.checkNotNullParameter(carouselId, "carouselId");
        Intrinsics.checkNotNullParameter(carouselTitle, "carouselTitle");
        this.f86984a = carouselId;
        this.f86985b = carouselTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsFeatureConfig$CarouselDetails$Destination)) {
            return false;
        }
        ShopsFeatureConfig$CarouselDetails$Destination shopsFeatureConfig$CarouselDetails$Destination = (ShopsFeatureConfig$CarouselDetails$Destination) obj2;
        return Intrinsics.f(this.f86984a, shopsFeatureConfig$CarouselDetails$Destination.f86984a) && Intrinsics.f(this.f86985b, shopsFeatureConfig$CarouselDetails$Destination.f86985b);
    }

    public final int hashCode() {
        return this.f86985b.hashCode() + (this.f86984a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86984a);
        dest.writeString(this.f86985b);
    }
}
