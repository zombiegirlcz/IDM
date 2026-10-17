package com.revolut.feature.travel.miles.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/api/model/TravelMilesSearchFlightDetails$SegmentsBreakdown", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesSearchFlightDetails$SegmentsBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelMilesSearchFlightDetails$SegmentsBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f94139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f94140b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelMilesSearchFlightDetails$FlightSegment.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TravelMilesSearchFlightDetails$SegmentsBreakdown(localDate, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesSearchFlightDetails$SegmentsBreakdown[i];
        }
    }

    public TravelMilesSearchFlightDetails$SegmentsBreakdown(LocalDate arrivalDate, ArrayList segments) {
        Intrinsics.checkNotNullParameter(arrivalDate, "arrivalDate");
        Intrinsics.checkNotNullParameter(segments, "segments");
        this.f94139a = arrivalDate;
        this.f94140b = segments;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesSearchFlightDetails$SegmentsBreakdown)) {
            return false;
        }
        TravelMilesSearchFlightDetails$SegmentsBreakdown travelMilesSearchFlightDetails$SegmentsBreakdown = (TravelMilesSearchFlightDetails$SegmentsBreakdown) obj2;
        return Intrinsics.f(this.f94139a, travelMilesSearchFlightDetails$SegmentsBreakdown.f94139a) && this.f94140b.equals(travelMilesSearchFlightDetails$SegmentsBreakdown.f94140b);
    }

    public final int hashCode() {
        return this.f94140b.hashCode() + (this.f94139a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f94139a);
        Iterator itY = j6.a.y(this.f94140b, dest);
        while (itY.hasNext()) {
            ((TravelMilesSearchFlightDetails$FlightSegment) itY.next()).writeToParcel(dest, i);
        }
    }
}
