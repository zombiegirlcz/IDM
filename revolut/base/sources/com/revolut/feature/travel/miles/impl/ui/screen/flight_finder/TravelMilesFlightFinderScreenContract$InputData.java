package com.revolut.feature.travel.miles.impl.ui.screen.flight_finder;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/flight_finder/TravelMilesFlightFinderScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesFlightFinderScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelMilesFlightFinderScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchLocation f94282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f94283b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesFlightFinderScreenContract$InputData((TravelMilesSearchLocation) parcel.readParcelable(TravelMilesFlightFinderScreenContract$InputData.class.getClassLoader()), (TravelMilesSearchLocation) parcel.readParcelable(TravelMilesFlightFinderScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesFlightFinderScreenContract$InputData[i];
        }
    }

    public TravelMilesFlightFinderScreenContract$InputData(TravelMilesSearchLocation travelMilesSearchLocation, TravelMilesSearchLocation travelMilesSearchLocation2) {
        this.f94282a = travelMilesSearchLocation;
        this.f94283b = travelMilesSearchLocation2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesFlightFinderScreenContract$InputData)) {
            return false;
        }
        TravelMilesFlightFinderScreenContract$InputData travelMilesFlightFinderScreenContract$InputData = (TravelMilesFlightFinderScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94282a, travelMilesFlightFinderScreenContract$InputData.f94282a) && Intrinsics.f(this.f94283b, travelMilesFlightFinderScreenContract$InputData.f94283b);
    }

    public final int hashCode() {
        TravelMilesSearchLocation travelMilesSearchLocation = this.f94282a;
        int iHashCode = (travelMilesSearchLocation == null ? 0 : travelMilesSearchLocation.hashCode()) * 31;
        TravelMilesSearchLocation travelMilesSearchLocation2 = this.f94283b;
        return iHashCode + (travelMilesSearchLocation2 != null ? travelMilesSearchLocation2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94282a, i);
        dest.writeParcelable(this.f94283b, i);
    }

    public TravelMilesFlightFinderScreenContract$InputData() {
        this(null, null);
    }
}
