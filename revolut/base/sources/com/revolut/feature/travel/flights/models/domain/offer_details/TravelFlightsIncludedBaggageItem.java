package com.revolut.feature.travel.flights.models.domain.offer_details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q7g.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/offer_details/TravelFlightsIncludedBaggageItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "q7g/b", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsIncludedBaggageItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsIncludedBaggageItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f93528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93530c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsIncludedBaggageItem(b.valueOf(parcel.readString()), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsIncludedBaggageItem[i];
        }
    }

    public TravelFlightsIncludedBaggageItem(b type, int i, String description) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f93528a = type;
        this.f93529b = i;
        this.f93530c = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsIncludedBaggageItem)) {
            return false;
        }
        TravelFlightsIncludedBaggageItem travelFlightsIncludedBaggageItem = (TravelFlightsIncludedBaggageItem) obj2;
        return this.f93528a == travelFlightsIncludedBaggageItem.f93528a && this.f93529b == travelFlightsIncludedBaggageItem.f93529b && Intrinsics.f(this.f93530c, travelFlightsIncludedBaggageItem.f93530c);
    }

    public final int hashCode() {
        return this.f93530c.hashCode() + j6.a.b(this.f93529b, this.f93528a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93528a.name());
        dest.writeInt(this.f93529b);
        dest.writeString(this.f93530c);
    }
}
