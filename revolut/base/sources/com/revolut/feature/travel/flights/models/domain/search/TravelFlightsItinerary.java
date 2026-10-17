package com.revolut.feature.travel.flights.models.domain.search;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/search/TravelFlightsItinerary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsItinerary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsItinerary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlightSearchContext f93597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlightSearchResultItem f93598b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsItinerary(FlightSearchContext.CREATOR.createFromParcel(parcel), FlightSearchResultItem.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsItinerary[i];
        }
    }

    public TravelFlightsItinerary(FlightSearchContext header, FlightSearchResultItem body) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f93597a = header;
        this.f93598b = body;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsItinerary)) {
            return false;
        }
        TravelFlightsItinerary travelFlightsItinerary = (TravelFlightsItinerary) obj2;
        return Intrinsics.f(this.f93597a, travelFlightsItinerary.f93597a) && Intrinsics.f(this.f93598b, travelFlightsItinerary.f93598b);
    }

    public final int hashCode() {
        return this.f93598b.hashCode() + (this.f93597a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f93597a.writeToParcel(dest, i);
        this.f93598b.writeToParcel(dest, i);
    }
}
