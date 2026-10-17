package com.revolut.feature.travel.miles.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/navigation/TravelMilesFlightSearchDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesFlightSearchDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<TravelMilesFlightSearchDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchLocation f94152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f94153b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesFlightSearchDestination((TravelMilesSearchLocation) parcel.readParcelable(TravelMilesFlightSearchDestination.class.getClassLoader()), (TravelMilesSearchLocation) parcel.readParcelable(TravelMilesFlightSearchDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesFlightSearchDestination[i];
        }
    }

    public TravelMilesFlightSearchDestination(TravelMilesSearchLocation travelMilesSearchLocation, TravelMilesSearchLocation travelMilesSearchLocation2) {
        this.f94152a = travelMilesSearchLocation;
        this.f94153b = travelMilesSearchLocation2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TravelMilesSearchLocation getF94153b() {
        return this.f94153b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TravelMilesSearchLocation getF94152a() {
        return this.f94152a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesFlightSearchDestination)) {
            return false;
        }
        TravelMilesFlightSearchDestination travelMilesFlightSearchDestination = (TravelMilesFlightSearchDestination) obj2;
        return Intrinsics.f(this.f94152a, travelMilesFlightSearchDestination.f94152a) && Intrinsics.f(this.f94153b, travelMilesFlightSearchDestination.f94153b);
    }

    public final int hashCode() {
        TravelMilesSearchLocation travelMilesSearchLocation = this.f94152a;
        int iHashCode = (travelMilesSearchLocation == null ? 0 : travelMilesSearchLocation.hashCode()) * 31;
        TravelMilesSearchLocation travelMilesSearchLocation2 = this.f94153b;
        return iHashCode + (travelMilesSearchLocation2 != null ? travelMilesSearchLocation2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94152a, i);
        dest.writeParcelable(this.f94153b, i);
    }

    public TravelMilesFlightSearchDestination() {
        this(null, null);
    }
}
