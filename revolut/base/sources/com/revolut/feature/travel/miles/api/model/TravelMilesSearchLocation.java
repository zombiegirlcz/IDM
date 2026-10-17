package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchLocation;", "Landroid/os/Parcelable;", "<init>", "()V", "City", "Airport", "Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchLocation$Airport;", "Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchLocation$City;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelMilesSearchLocation implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchLocation$Airport;", "Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchLocation;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Airport extends TravelMilesSearchLocation {

        @NotNull
        public static final Parcelable.Creator<Airport> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94142b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Airport(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Airport[i];
            }
        }

        public Airport(String city, String iataCode) {
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(iataCode, "iataCode");
            this.f94141a = city;
            this.f94142b = iataCode;
        }

        @Override // com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF94143a() {
            return this.f94141a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Airport)) {
                return false;
            }
            Airport airport = (Airport) obj2;
            return Intrinsics.f(this.f94141a, airport.f94141a) && Intrinsics.f(this.f94142b, airport.f94142b);
        }

        public final int hashCode() {
            return this.f94142b.hashCode() + (this.f94141a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94141a);
            dest.writeString(this.f94142b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchLocation$City;", "Lcom/revolut/feature/travel/miles/api/model/TravelMilesSearchLocation;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class City extends TravelMilesSearchLocation {

        @NotNull
        public static final Parcelable.Creator<City> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94144b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new City(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new City[i];
            }
        }

        public City(String city, String countryCode) {
            Intrinsics.checkNotNullParameter(city, "city");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f94143a = city;
            this.f94144b = countryCode;
        }

        @Override // com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF94143a() {
            return this.f94143a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof City)) {
                return false;
            }
            City city = (City) obj2;
            return Intrinsics.f(this.f94143a, city.f94143a) && Intrinsics.f(this.f94144b, city.f94144b);
        }

        public final int hashCode() {
            return this.f94144b.hashCode() + (this.f94143a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94143a);
            dest.writeString(this.f94144b);
        }
    }

    private TravelMilesSearchLocation() {
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF94143a();
}
