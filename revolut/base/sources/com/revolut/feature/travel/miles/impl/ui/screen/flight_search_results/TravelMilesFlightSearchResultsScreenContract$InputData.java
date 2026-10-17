package com.revolut.feature.travel.miles.impl.ui.screen.flight_search_results;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/flight_search_results/TravelMilesFlightSearchResultsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesFlightSearchResultsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelMilesFlightSearchResultsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesSearchLocation f94308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f94309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f94310c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesFlightSearchResultsScreenContract$InputData((TravelMilesSearchLocation) parcel.readParcelable(TravelMilesFlightSearchResultsScreenContract$InputData.class.getClassLoader()), (TravelMilesSearchLocation) parcel.readParcelable(TravelMilesFlightSearchResultsScreenContract$InputData.class.getClassLoader()), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesFlightSearchResultsScreenContract$InputData[i];
        }
    }

    public TravelMilesFlightSearchResultsScreenContract$InputData(TravelMilesSearchLocation origin, TravelMilesSearchLocation destination, LocalDate date) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f94308a = origin;
        this.f94309b = destination;
        this.f94310c = date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesFlightSearchResultsScreenContract$InputData)) {
            return false;
        }
        TravelMilesFlightSearchResultsScreenContract$InputData travelMilesFlightSearchResultsScreenContract$InputData = (TravelMilesFlightSearchResultsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94308a, travelMilesFlightSearchResultsScreenContract$InputData.f94308a) && Intrinsics.f(this.f94309b, travelMilesFlightSearchResultsScreenContract$InputData.f94309b) && Intrinsics.f(this.f94310c, travelMilesFlightSearchResultsScreenContract$InputData.f94310c);
    }

    public final int hashCode() {
        return this.f94310c.hashCode() + ((this.f94309b.hashCode() + (this.f94308a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f94308a, i);
        dest.writeParcelable(this.f94309b, i);
        dest.writeSerializable(this.f94310c);
    }
}
