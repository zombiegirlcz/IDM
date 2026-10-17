package com.revolut.feature.travel.flights.models.domain.extra_products;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/extra_products/TravelFlightsExtraProductCarrierPriceBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsExtraProductCarrierPriceBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsExtraProductCarrierPriceBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f93508c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsExtraProductCarrierPriceBreakdown((d) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsExtraProductCarrierPriceBreakdown[i];
        }
    }

    public TravelFlightsExtraProductCarrierPriceBreakdown(d dVar, String str, String str2) {
        this.f93506a = str;
        this.f93507b = str2;
        this.f93508c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsExtraProductCarrierPriceBreakdown)) {
            return false;
        }
        TravelFlightsExtraProductCarrierPriceBreakdown travelFlightsExtraProductCarrierPriceBreakdown = (TravelFlightsExtraProductCarrierPriceBreakdown) obj2;
        return Intrinsics.f(this.f93506a, travelFlightsExtraProductCarrierPriceBreakdown.f93506a) && Intrinsics.f(this.f93507b, travelFlightsExtraProductCarrierPriceBreakdown.f93507b) && Intrinsics.f(this.f93508c, travelFlightsExtraProductCarrierPriceBreakdown.f93508c);
    }

    public final int hashCode() {
        String str = this.f93506a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f93507b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.f93508c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93506a);
        dest.writeString(this.f93507b);
        dest.writeSerializable(this.f93508c);
    }
}
