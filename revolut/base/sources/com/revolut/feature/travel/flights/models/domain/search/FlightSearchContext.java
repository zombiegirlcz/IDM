package com.revolut.feature.travel.flights.models.domain.search;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/search/FlightSearchContext;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlightSearchContext implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlightSearchContext> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlightSearchContextPassengers f93567c;
    public final LocalDate d;
    public final LocalDate e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlightSearchContext(parcel.readString(), parcel.readString(), FlightSearchContextPassengers.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlightSearchContext[i];
        }
    }

    public FlightSearchContext(String originCityName, String destinationCityName, FlightSearchContextPassengers passengers, LocalDate departureDate, LocalDate localDate, String destinationImageUrl) {
        Intrinsics.checkNotNullParameter(originCityName, "originCityName");
        Intrinsics.checkNotNullParameter(destinationCityName, "destinationCityName");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        Intrinsics.checkNotNullParameter(destinationImageUrl, "destinationImageUrl");
        this.f93565a = originCityName;
        this.f93566b = destinationCityName;
        this.f93567c = passengers;
        this.d = departureDate;
        this.e = localDate;
        this.f = destinationImageUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlightSearchContext)) {
            return false;
        }
        FlightSearchContext flightSearchContext = (FlightSearchContext) obj2;
        return Intrinsics.f(this.f93565a, flightSearchContext.f93565a) && Intrinsics.f(this.f93566b, flightSearchContext.f93566b) && Intrinsics.f(this.f93567c, flightSearchContext.f93567c) && Intrinsics.f(this.d, flightSearchContext.d) && Intrinsics.f(this.e, flightSearchContext.e) && Intrinsics.f(this.f, flightSearchContext.f);
    }

    public final int hashCode() {
        int iA = y.a((this.f93567c.hashCode() + p.a.c(this.f93565a.hashCode() * 31, 31, this.f93566b)) * 31, 31, this.d);
        LocalDate localDate = this.e;
        return this.f.hashCode() + ((iA + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93565a);
        dest.writeString(this.f93566b);
        this.f93567c.writeToParcel(dest, i);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
    }
}
