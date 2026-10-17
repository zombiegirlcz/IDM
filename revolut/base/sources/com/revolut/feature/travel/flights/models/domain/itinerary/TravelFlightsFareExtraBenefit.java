package com.revolut.feature.travel.flights.models.domain.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/itinerary/TravelFlightsFareExtraBenefit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsFareExtraBenefit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsFareExtraBenefit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93524b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsFareExtraBenefit(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsFareExtraBenefit[i];
        }
    }

    public TravelFlightsFareExtraBenefit(boolean z, String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f93523a = z;
        this.f93524b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsFareExtraBenefit)) {
            return false;
        }
        TravelFlightsFareExtraBenefit travelFlightsFareExtraBenefit = (TravelFlightsFareExtraBenefit) obj2;
        return this.f93523a == travelFlightsFareExtraBenefit.f93523a && Intrinsics.f(this.f93524b, travelFlightsFareExtraBenefit.f93524b);
    }

    public final int hashCode() {
        return this.f93524b.hashCode() + (Boolean.hashCode(this.f93523a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f93523a ? 1 : 0);
        dest.writeString(this.f93524b);
    }
}
