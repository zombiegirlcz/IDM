package com.revolut.feature.travel.flights.models.domain.search;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/search/FlightSearchContextPassengers;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlightSearchContextPassengers implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlightSearchContextPassengers> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93569b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlightSearchContextPassengers(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlightSearchContextPassengers[i];
        }
    }

    public FlightSearchContextPassengers(int i, int i2) {
        this.f93568a = i;
        this.f93569b = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlightSearchContextPassengers)) {
            return false;
        }
        FlightSearchContextPassengers flightSearchContextPassengers = (FlightSearchContextPassengers) obj2;
        return this.f93568a == flightSearchContextPassengers.f93568a && this.f93569b == flightSearchContextPassengers.f93569b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f93569b) + (Integer.hashCode(this.f93568a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f93568a);
        dest.writeInt(this.f93569b);
    }
}
