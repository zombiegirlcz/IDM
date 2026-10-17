package com.revolut.feature.travel.flights.models.domain.payment;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/payment/TravelFlightsAirProductTravellerTypePriceBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsAirProductTravellerTypePriceBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsAirProductTravellerTypePriceBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f93546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f93548c;
    public final d d;
    public final d e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f93549g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            j jVarValueOf = j.valueOf(parcel.readString());
            int i = parcel.readInt();
            d dVar = (d) parcel.readSerializable();
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            d dVar4 = (d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsCarrierPriceBreakdown.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new TravelFlightsAirProductTravellerTypePriceBreakdown(jVarValueOf, i, dVar, dVar2, dVar3, dVar4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsAirProductTravellerTypePriceBreakdown[i];
        }
    }

    public TravelFlightsAirProductTravellerTypePriceBreakdown(j type, int i, d total, d flightFare, d taxesAndFees, d dVar, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(flightFare, "flightFare");
        Intrinsics.checkNotNullParameter(taxesAndFees, "taxesAndFees");
        this.f93546a = type;
        this.f93547b = i;
        this.f93548c = total;
        this.d = flightFare;
        this.e = taxesAndFees;
        this.f = dVar;
        this.f93549g = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsAirProductTravellerTypePriceBreakdown)) {
            return false;
        }
        TravelFlightsAirProductTravellerTypePriceBreakdown travelFlightsAirProductTravellerTypePriceBreakdown = (TravelFlightsAirProductTravellerTypePriceBreakdown) obj2;
        return this.f93546a == travelFlightsAirProductTravellerTypePriceBreakdown.f93546a && this.f93547b == travelFlightsAirProductTravellerTypePriceBreakdown.f93547b && Intrinsics.f(this.f93548c, travelFlightsAirProductTravellerTypePriceBreakdown.f93548c) && Intrinsics.f(this.d, travelFlightsAirProductTravellerTypePriceBreakdown.d) && Intrinsics.f(this.e, travelFlightsAirProductTravellerTypePriceBreakdown.e) && Intrinsics.f(this.f, travelFlightsAirProductTravellerTypePriceBreakdown.f) && Intrinsics.f(this.f93549g, travelFlightsAirProductTravellerTypePriceBreakdown.f93549g);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(v7.c(j6.a.b(this.f93547b, this.f93546a.hashCode() * 31, 31), 31, this.f93548c), 31, this.d), 31, this.e);
        d dVar = this.f;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List list = this.f93549g;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93546a.name());
        dest.writeInt(this.f93547b);
        dest.writeSerializable(this.f93548c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        List list = this.f93549g;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((TravelFlightsCarrierPriceBreakdown) itQ.next()).writeToParcel(dest, i);
        }
    }
}
