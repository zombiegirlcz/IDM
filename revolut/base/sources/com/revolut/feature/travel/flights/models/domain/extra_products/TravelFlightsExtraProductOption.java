package com.revolut.feature.travel.flights.models.domain.extra_products;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/extra_products/TravelFlightsExtraProductOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsExtraProductOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsExtraProductOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f93510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93511c;
    public final d d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            String string2 = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsExtraProductCarrierPriceBreakdown.CREATOR, parcel, arrayList2, iA, i);
                }
                arrayList = arrayList2;
            }
            return new TravelFlightsExtraProductOption(string, z, string2, dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsExtraProductOption[i];
        }
    }

    public TravelFlightsExtraProductOption(String travellerReference, boolean z, String str, d dVar, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(travellerReference, "travellerReference");
        this.f93509a = travellerReference;
        this.f93510b = z;
        this.f93511c = str;
        this.d = dVar;
        this.e = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsExtraProductOption)) {
            return false;
        }
        TravelFlightsExtraProductOption travelFlightsExtraProductOption = (TravelFlightsExtraProductOption) obj2;
        return Intrinsics.f(this.f93509a, travelFlightsExtraProductOption.f93509a) && this.f93510b == travelFlightsExtraProductOption.f93510b && Intrinsics.f(this.f93511c, travelFlightsExtraProductOption.f93511c) && Intrinsics.f(this.d, travelFlightsExtraProductOption.d) && Intrinsics.f(this.e, travelFlightsExtraProductOption.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f93509a.hashCode() * 31, 31, this.f93510b);
        String str = this.f93511c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        d dVar = this.d;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List list = this.e;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93509a);
        dest.writeInt(this.f93510b ? 1 : 0);
        dest.writeString(this.f93511c);
        dest.writeSerializable(this.d);
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((TravelFlightsExtraProductCarrierPriceBreakdown) itQ.next()).writeToParcel(dest, i);
        }
    }
}
