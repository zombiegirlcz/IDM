package com.revolut.feature.travel.flights.models.domain.payment;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o7g.b;
import o7g.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/payment/TravelFlightsExtraProductGroupPriceBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsExtraProductGroupPriceBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsExtraProductGroupPriceBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f93556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f93557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f93558c;
    public final dj0.d d;
    public final dj0.d e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = b.valueOf(parcel.readString());
            d dVarValueOf = d.valueOf(parcel.readString());
            int i = parcel.readInt();
            dj0.d dVar = (dj0.d) parcel.readSerializable();
            dj0.d dVar2 = (dj0.d) parcel.readSerializable();
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
            return new TravelFlightsExtraProductGroupPriceBreakdown(bVarValueOf, dVarValueOf, i, dVar, dVar2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsExtraProductGroupPriceBreakdown[i];
        }
    }

    public TravelFlightsExtraProductGroupPriceBreakdown(b category, d subType, int i, dj0.d total, dj0.d dVar, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f93556a = category;
        this.f93557b = subType;
        this.f93558c = i;
        this.d = total;
        this.e = dVar;
        this.f = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsExtraProductGroupPriceBreakdown)) {
            return false;
        }
        TravelFlightsExtraProductGroupPriceBreakdown travelFlightsExtraProductGroupPriceBreakdown = (TravelFlightsExtraProductGroupPriceBreakdown) obj2;
        return this.f93556a == travelFlightsExtraProductGroupPriceBreakdown.f93556a && this.f93557b == travelFlightsExtraProductGroupPriceBreakdown.f93557b && this.f93558c == travelFlightsExtraProductGroupPriceBreakdown.f93558c && Intrinsics.f(this.d, travelFlightsExtraProductGroupPriceBreakdown.d) && Intrinsics.f(this.e, travelFlightsExtraProductGroupPriceBreakdown.e) && Intrinsics.f(this.f, travelFlightsExtraProductGroupPriceBreakdown.f);
    }

    public final int hashCode() {
        int iC = v7.c(j6.a.b(this.f93558c, (this.f93557b.hashCode() + (this.f93556a.hashCode() * 31)) * 31, 31), 31, this.d);
        dj0.d dVar = this.e;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List list = this.f;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93556a.name());
        dest.writeString(this.f93557b.name());
        dest.writeInt(this.f93558c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        List list = this.f;
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
