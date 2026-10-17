package com.revolut.feature.travel.flights.impl.ui.screen.discover;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.search.LocationPoint;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.d;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/discover/TravelFlightsDiscoverScreenContract$SearchParameters", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsDiscoverScreenContract$SearchParameters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsDiscoverScreenContract$SearchParameters> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationPoint f93332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationPoint f93333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f93334c;
    public final LocalDate d;
    public final Passengers e;
    public final d f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsDiscoverScreenContract$SearchParameters((LocationPoint) parcel.readParcelable(TravelFlightsDiscoverScreenContract$SearchParameters.class.getClassLoader()), (LocationPoint) parcel.readParcelable(TravelFlightsDiscoverScreenContract$SearchParameters.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (Passengers) parcel.readParcelable(TravelFlightsDiscoverScreenContract$SearchParameters.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsDiscoverScreenContract$SearchParameters[i];
        }
    }

    public TravelFlightsDiscoverScreenContract$SearchParameters() {
        this(0);
    }

    public static TravelFlightsDiscoverScreenContract$SearchParameters a(TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParameters, LocationPoint locationPoint, LocationPoint locationPoint2, LocalDate localDate, LocalDate localDate2, Passengers passengers, d dVar, int i) {
        if ((i & 1) != 0) {
            locationPoint = travelFlightsDiscoverScreenContract$SearchParameters.f93332a;
        }
        LocationPoint locationPoint3 = locationPoint;
        if ((i & 2) != 0) {
            locationPoint2 = travelFlightsDiscoverScreenContract$SearchParameters.f93333b;
        }
        LocationPoint locationPoint4 = locationPoint2;
        if ((i & 4) != 0) {
            localDate = travelFlightsDiscoverScreenContract$SearchParameters.f93334c;
        }
        LocalDate localDate3 = localDate;
        if ((i & 8) != 0) {
            localDate2 = travelFlightsDiscoverScreenContract$SearchParameters.d;
        }
        LocalDate localDate4 = localDate2;
        if ((i & 16) != 0) {
            passengers = travelFlightsDiscoverScreenContract$SearchParameters.e;
        }
        Passengers passengers2 = passengers;
        if ((i & 32) != 0) {
            dVar = travelFlightsDiscoverScreenContract$SearchParameters.f;
        }
        d cabinClass = dVar;
        travelFlightsDiscoverScreenContract$SearchParameters.getClass();
        Intrinsics.checkNotNullParameter(passengers2, "passengers");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        return new TravelFlightsDiscoverScreenContract$SearchParameters(locationPoint3, locationPoint4, localDate3, localDate4, passengers2, cabinClass);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsDiscoverScreenContract$SearchParameters)) {
            return false;
        }
        TravelFlightsDiscoverScreenContract$SearchParameters travelFlightsDiscoverScreenContract$SearchParameters = (TravelFlightsDiscoverScreenContract$SearchParameters) obj2;
        return Intrinsics.f(this.f93332a, travelFlightsDiscoverScreenContract$SearchParameters.f93332a) && Intrinsics.f(this.f93333b, travelFlightsDiscoverScreenContract$SearchParameters.f93333b) && Intrinsics.f(this.f93334c, travelFlightsDiscoverScreenContract$SearchParameters.f93334c) && Intrinsics.f(this.d, travelFlightsDiscoverScreenContract$SearchParameters.d) && Intrinsics.f(this.e, travelFlightsDiscoverScreenContract$SearchParameters.e) && this.f == travelFlightsDiscoverScreenContract$SearchParameters.f;
    }

    public final int hashCode() {
        LocationPoint locationPoint = this.f93332a;
        int iHashCode = (locationPoint == null ? 0 : locationPoint.hashCode()) * 31;
        LocationPoint locationPoint2 = this.f93333b;
        int iHashCode2 = (iHashCode + (locationPoint2 == null ? 0 : locationPoint2.hashCode())) * 31;
        LocalDate localDate = this.f93334c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode3 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93332a, i);
        dest.writeParcelable(this.f93333b, i);
        dest.writeSerializable(this.f93334c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
    }

    public TravelFlightsDiscoverScreenContract$SearchParameters(LocationPoint locationPoint, LocationPoint locationPoint2, LocalDate localDate, LocalDate localDate2, Passengers passengers, d cabinClass) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        this.f93332a = locationPoint;
        this.f93333b = locationPoint2;
        this.f93334c = localDate;
        this.d = localDate2;
        this.e = passengers;
        this.f = cabinClass;
    }

    public TravelFlightsDiscoverScreenContract$SearchParameters(int i) {
        this(null, null, null, null, new Passengers(1, f0.f322471a), d.ECONOMY);
    }
}
