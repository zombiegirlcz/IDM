package com.revolut.feature.travel.flights.models.domain.search;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.d;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/search/FlightSearchQuery;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlightSearchQuery implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlightSearchQuery> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocationPoint f93577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationPoint f93578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f93579c;
    public final LocalDate d;
    public final Passengers e;
    public final d f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<LocationPoint> creator = LocationPoint.CREATOR;
            return new FlightSearchQuery(creator.createFromParcel(parcel), creator.createFromParcel(parcel), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), Passengers.CREATOR.createFromParcel(parcel), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlightSearchQuery[i];
        }
    }

    public FlightSearchQuery(LocationPoint origin, LocationPoint destination, LocalDate departureDate, LocalDate localDate, Passengers passengers, d cabinClass) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        this.f93577a = origin;
        this.f93578b = destination;
        this.f93579c = departureDate;
        this.d = localDate;
        this.e = passengers;
        this.f = cabinClass;
    }

    public static FlightSearchQuery a(FlightSearchQuery flightSearchQuery, LocationPoint locationPoint, LocationPoint locationPoint2, LocalDate localDate, LocalDate localDate2, Passengers passengers, d dVar, int i) {
        if ((i & 1) != 0) {
            locationPoint = flightSearchQuery.f93577a;
        }
        LocationPoint origin = locationPoint;
        if ((i & 2) != 0) {
            locationPoint2 = flightSearchQuery.f93578b;
        }
        LocationPoint destination = locationPoint2;
        if ((i & 4) != 0) {
            localDate = flightSearchQuery.f93579c;
        }
        LocalDate departureDate = localDate;
        if ((i & 8) != 0) {
            localDate2 = flightSearchQuery.d;
        }
        LocalDate localDate3 = localDate2;
        if ((i & 16) != 0) {
            passengers = flightSearchQuery.e;
        }
        Passengers passengers2 = passengers;
        if ((i & 32) != 0) {
            dVar = flightSearchQuery.f;
        }
        d cabinClass = dVar;
        flightSearchQuery.getClass();
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        Intrinsics.checkNotNullParameter(passengers2, "passengers");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        return new FlightSearchQuery(origin, destination, departureDate, localDate3, passengers2, cabinClass);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlightSearchQuery)) {
            return false;
        }
        FlightSearchQuery flightSearchQuery = (FlightSearchQuery) obj2;
        return Intrinsics.f(this.f93577a, flightSearchQuery.f93577a) && Intrinsics.f(this.f93578b, flightSearchQuery.f93578b) && Intrinsics.f(this.f93579c, flightSearchQuery.f93579c) && Intrinsics.f(this.d, flightSearchQuery.d) && Intrinsics.f(this.e, flightSearchQuery.e) && this.f == flightSearchQuery.f;
    }

    public final int hashCode() {
        int iA = y.a((this.f93578b.hashCode() + (this.f93577a.hashCode() * 31)) * 31, 31, this.f93579c);
        LocalDate localDate = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iA + (localDate == null ? 0 : localDate.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f93577a.writeToParcel(dest, i);
        this.f93578b.writeToParcel(dest, i);
        dest.writeSerializable(this.f93579c);
        dest.writeSerializable(this.d);
        this.e.writeToParcel(dest, i);
        dest.writeString(this.f.name());
    }
}
