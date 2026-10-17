package com.revolut.feature.travel.flights.models.domain.search;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/search/FlightSearchFilterPriceRange;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FlightSearchFilterPriceRange implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FlightSearchFilterPriceRange> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f93575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f93576b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FlightSearchFilterPriceRange((d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FlightSearchFilterPriceRange[i];
        }
    }

    public FlightSearchFilterPriceRange(d minimum, d maximum) {
        Intrinsics.checkNotNullParameter(minimum, "minimum");
        Intrinsics.checkNotNullParameter(maximum, "maximum");
        this.f93575a = minimum;
        this.f93576b = maximum;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FlightSearchFilterPriceRange)) {
            return false;
        }
        FlightSearchFilterPriceRange flightSearchFilterPriceRange = (FlightSearchFilterPriceRange) obj2;
        return Intrinsics.f(this.f93575a, flightSearchFilterPriceRange.f93575a) && Intrinsics.f(this.f93576b, flightSearchFilterPriceRange.f93576b);
    }

    public final int hashCode() {
        return this.f93576b.hashCode() + (this.f93575a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f93575a);
        dest.writeSerializable(this.f93576b);
    }
}
