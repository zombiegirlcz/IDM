package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/TravelFlightsLegalAcceptance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsLegalAcceptance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsLegalAcceptance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsPartnerLegalReference f93475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f93476b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            TravelFlightsPartnerLegalReference travelFlightsPartnerLegalReferenceCreateFromParcel = TravelFlightsPartnerLegalReference.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsAirlineLegalReference.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TravelFlightsLegalAcceptance(travelFlightsPartnerLegalReferenceCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsLegalAcceptance[i];
        }
    }

    public TravelFlightsLegalAcceptance(TravelFlightsPartnerLegalReference partner, ArrayList airlines) {
        Intrinsics.checkNotNullParameter(partner, "partner");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        this.f93475a = partner;
        this.f93476b = airlines;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsLegalAcceptance)) {
            return false;
        }
        TravelFlightsLegalAcceptance travelFlightsLegalAcceptance = (TravelFlightsLegalAcceptance) obj2;
        return Intrinsics.f(this.f93475a, travelFlightsLegalAcceptance.f93475a) && this.f93476b.equals(travelFlightsLegalAcceptance.f93476b);
    }

    public final int hashCode() {
        return this.f93476b.hashCode() + (this.f93475a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f93475a.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f93476b, dest);
        while (itY.hasNext()) {
            ((TravelFlightsAirlineLegalReference) itY.next()).writeToParcel(dest, i);
        }
    }
}
