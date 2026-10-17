package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.time.Duration;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/api/model/TravelMilesSearchFlightDetails$FlightSegment", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesSearchFlightDetails$FlightSegment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesSearchFlightDetails$FlightSegment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94130c;
    public final String d;
    public final String e;
    public final TravelMilesSearchAirlineIcon f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDateTime f94131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDateTime f94132h;
    public final Duration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f94133j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f94134l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f94135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TravelMilesSearchFlightDetails$NextConnection f94136n;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesSearchFlightDetails$FlightSegment(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (TravelMilesSearchAirlineIcon) parcel.readParcelable(TravelMilesSearchFlightDetails$FlightSegment.class.getClassLoader()), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (Duration) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : TravelMilesSearchFlightDetails$NextConnection.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesSearchFlightDetails$FlightSegment[i];
        }
    }

    public TravelMilesSearchFlightDetails$FlightSegment(String segmentId, String flightNumber, String str, String airlineName, String airlineRef, TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon, LocalDateTime departsAt, LocalDateTime arrivesAt, Duration duration, String departureAirport, String arrivalAirport, String departureDescription, String arrivalDescription, TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection) {
        Intrinsics.checkNotNullParameter(segmentId, "segmentId");
        Intrinsics.checkNotNullParameter(flightNumber, "flightNumber");
        Intrinsics.checkNotNullParameter(airlineName, "airlineName");
        Intrinsics.checkNotNullParameter(airlineRef, "airlineRef");
        Intrinsics.checkNotNullParameter(departsAt, "departsAt");
        Intrinsics.checkNotNullParameter(arrivesAt, "arrivesAt");
        Intrinsics.checkNotNullParameter(departureAirport, "departureAirport");
        Intrinsics.checkNotNullParameter(arrivalAirport, "arrivalAirport");
        Intrinsics.checkNotNullParameter(departureDescription, "departureDescription");
        Intrinsics.checkNotNullParameter(arrivalDescription, "arrivalDescription");
        this.f94128a = segmentId;
        this.f94129b = flightNumber;
        this.f94130c = str;
        this.d = airlineName;
        this.e = airlineRef;
        this.f = travelMilesSearchAirlineIcon;
        this.f94131g = departsAt;
        this.f94132h = arrivesAt;
        this.i = duration;
        this.f94133j = departureAirport;
        this.k = arrivalAirport;
        this.f94134l = departureDescription;
        this.f94135m = arrivalDescription;
        this.f94136n = travelMilesSearchFlightDetails$NextConnection;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesSearchFlightDetails$FlightSegment)) {
            return false;
        }
        TravelMilesSearchFlightDetails$FlightSegment travelMilesSearchFlightDetails$FlightSegment = (TravelMilesSearchFlightDetails$FlightSegment) obj2;
        return Intrinsics.f(this.f94128a, travelMilesSearchFlightDetails$FlightSegment.f94128a) && Intrinsics.f(this.f94129b, travelMilesSearchFlightDetails$FlightSegment.f94129b) && Intrinsics.f(this.f94130c, travelMilesSearchFlightDetails$FlightSegment.f94130c) && Intrinsics.f(this.d, travelMilesSearchFlightDetails$FlightSegment.d) && Intrinsics.f(this.e, travelMilesSearchFlightDetails$FlightSegment.e) && Intrinsics.f(this.f, travelMilesSearchFlightDetails$FlightSegment.f) && Intrinsics.f(this.f94131g, travelMilesSearchFlightDetails$FlightSegment.f94131g) && Intrinsics.f(this.f94132h, travelMilesSearchFlightDetails$FlightSegment.f94132h) && Intrinsics.f(this.i, travelMilesSearchFlightDetails$FlightSegment.i) && Intrinsics.f(this.f94133j, travelMilesSearchFlightDetails$FlightSegment.f94133j) && Intrinsics.f(this.k, travelMilesSearchFlightDetails$FlightSegment.k) && Intrinsics.f(this.f94134l, travelMilesSearchFlightDetails$FlightSegment.f94134l) && Intrinsics.f(this.f94135m, travelMilesSearchFlightDetails$FlightSegment.f94135m) && Intrinsics.f(this.f94136n, travelMilesSearchFlightDetails$FlightSegment.f94136n);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f94128a.hashCode() * 31, 31, this.f94129b);
        String str = this.f94130c;
        int iC2 = p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        TravelMilesSearchAirlineIcon travelMilesSearchAirlineIcon = this.f;
        int i = v7.i(this.f94132h, v7.i(this.f94131g, (iC2 + (travelMilesSearchAirlineIcon == null ? 0 : travelMilesSearchAirlineIcon.hashCode())) * 31, 31), 31);
        Duration duration = this.i;
        int iC3 = p.a.c(p.a.c(p.a.c(p.a.c((i + (duration == null ? 0 : duration.hashCode())) * 31, 31, this.f94133j), 31, this.k), 31, this.f94134l), 31, this.f94135m);
        TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = this.f94136n;
        return iC3 + (travelMilesSearchFlightDetails$NextConnection != null ? travelMilesSearchFlightDetails$NextConnection.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94128a);
        dest.writeString(this.f94129b);
        dest.writeString(this.f94130c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeSerializable(this.f94131g);
        dest.writeSerializable(this.f94132h);
        dest.writeSerializable(this.i);
        dest.writeString(this.f94133j);
        dest.writeString(this.k);
        dest.writeString(this.f94134l);
        dest.writeString(this.f94135m);
        TravelMilesSearchFlightDetails$NextConnection travelMilesSearchFlightDetails$NextConnection = this.f94136n;
        if (travelMilesSearchFlightDetails$NextConnection == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelMilesSearchFlightDetails$NextConnection.writeToParcel(dest, i);
        }
    }
}
