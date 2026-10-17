package com.revolut.feature.shops.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shops/api/config/ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f86995b;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination.class, parcel, arrayList, iE, 1);
            }
            return new ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination[i];
        }
    }

    public ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination(String source, List promptTypes) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(promptTypes, "promptTypes");
        this.f86994a = source;
        this.f86995b = promptTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination)) {
            return false;
        }
        ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination shopsFeatureConfig$PersonalizedOffersFullscreen$Destination = (ShopsFeatureConfig$PersonalizedOffersFullscreen$Destination) obj2;
        return Intrinsics.f(this.f86994a, shopsFeatureConfig$PersonalizedOffersFullscreen$Destination.f86994a) && Intrinsics.f(this.f86995b, shopsFeatureConfig$PersonalizedOffersFullscreen$Destination.f86995b);
    }

    public final int hashCode() {
        return this.f86995b.hashCode() + (this.f86994a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86994a);
        Iterator itV = p.a.v(this.f86995b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
