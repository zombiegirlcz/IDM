package com.revolut.feature.travel.flights.impl.ui.screen.search_filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchFilterOptions;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchRequestFilters;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/search_filters/TravelFlightsSearchFiltersScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsSearchFiltersScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsSearchFiltersScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightSearchFilterOptions f93398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlightSearchRequestFilters f93399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93400c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsSearchFiltersScreenContract$InputData((FlightSearchFilterOptions) parcel.readParcelable(TravelFlightsSearchFiltersScreenContract$InputData.class.getClassLoader()), (FlightSearchRequestFilters) parcel.readParcelable(TravelFlightsSearchFiltersScreenContract$InputData.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsSearchFiltersScreenContract$InputData[i];
        }
    }

    public TravelFlightsSearchFiltersScreenContract$InputData(FlightSearchFilterOptions filterOptions, FlightSearchRequestFilters flightSearchRequestFilters, int i) {
        Intrinsics.checkNotNullParameter(filterOptions, "filterOptions");
        this.f93398a = filterOptions;
        this.f93399b = flightSearchRequestFilters;
        this.f93400c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsSearchFiltersScreenContract$InputData)) {
            return false;
        }
        TravelFlightsSearchFiltersScreenContract$InputData travelFlightsSearchFiltersScreenContract$InputData = (TravelFlightsSearchFiltersScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93398a, travelFlightsSearchFiltersScreenContract$InputData.f93398a) && Intrinsics.f(this.f93399b, travelFlightsSearchFiltersScreenContract$InputData.f93399b) && this.f93400c == travelFlightsSearchFiltersScreenContract$InputData.f93400c;
    }

    public final int hashCode() {
        int iHashCode = this.f93398a.hashCode() * 31;
        FlightSearchRequestFilters flightSearchRequestFilters = this.f93399b;
        return Integer.hashCode(this.f93400c) + ((iHashCode + (flightSearchRequestFilters == null ? 0 : flightSearchRequestFilters.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93398a, i);
        dest.writeParcelable(this.f93399b, i);
        dest.writeInt(this.f93400c);
    }
}
