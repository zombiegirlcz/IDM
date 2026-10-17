package com.revolut.feature.travel.flights.models.domain.booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.flights.models.domain.payment.PointsRedeemOption;
import com.revolut.feature.travel.flights.models.domain.payment.PriceWithPoints;
import com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsAirProductPriceBreakdown;
import com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsCarrierPriceBreakdown;
import com.revolut.feature.travel.flights.models.domain.payment.TravelFlightsExtraProductsPriceBreakdown;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/booking/BookingPreviewPayment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BookingPreviewPayment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BookingPreviewPayment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f93452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriceWithPoints f93453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f93454c;
    public final d d;
    public final d e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f93455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TravelFlightsAirProductPriceBreakdown f93456h;
    public final TravelFlightsExtraProductsPriceBreakdown i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            PriceWithPoints priceWithPointsCreateFromParcel = PriceWithPoints.CREATOR.createFromParcel(parcel);
            RevPoints revPoints = (RevPoints) parcel.readParcelable(BookingPreviewPayment.class.getClassLoader());
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(PointsRedeemOption.CREATOR, parcel, arrayList2, iA2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsCarrierPriceBreakdown.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new BookingPreviewPayment(dVar, priceWithPointsCreateFromParcel, revPoints, dVar2, dVar3, arrayList2, arrayList, parcel.readInt() == 0 ? null : TravelFlightsAirProductPriceBreakdown.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TravelFlightsExtraProductsPriceBreakdown.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BookingPreviewPayment[i];
        }
    }

    public BookingPreviewPayment(d total, PriceWithPoints priceWithPoints, RevPoints rewardPoints, d dVar, d tax, ArrayList pointsRedeemOptions, ArrayList arrayList, TravelFlightsAirProductPriceBreakdown travelFlightsAirProductPriceBreakdown, TravelFlightsExtraProductsPriceBreakdown travelFlightsExtraProductsPriceBreakdown) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(priceWithPoints, "priceWithPoints");
        Intrinsics.checkNotNullParameter(rewardPoints, "rewardPoints");
        Intrinsics.checkNotNullParameter(tax, "tax");
        Intrinsics.checkNotNullParameter(pointsRedeemOptions, "pointsRedeemOptions");
        this.f93452a = total;
        this.f93453b = priceWithPoints;
        this.f93454c = rewardPoints;
        this.d = dVar;
        this.e = tax;
        this.f = pointsRedeemOptions;
        this.f93455g = arrayList;
        this.f93456h = travelFlightsAirProductPriceBreakdown;
        this.i = travelFlightsExtraProductsPriceBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BookingPreviewPayment)) {
            return false;
        }
        BookingPreviewPayment bookingPreviewPayment = (BookingPreviewPayment) obj2;
        return Intrinsics.f(this.f93452a, bookingPreviewPayment.f93452a) && Intrinsics.f(this.f93453b, bookingPreviewPayment.f93453b) && Intrinsics.f(this.f93454c, bookingPreviewPayment.f93454c) && Intrinsics.f(this.d, bookingPreviewPayment.d) && Intrinsics.f(this.e, bookingPreviewPayment.e) && this.f.equals(bookingPreviewPayment.f) && Intrinsics.f(this.f93455g, bookingPreviewPayment.f93455g) && Intrinsics.f(this.f93456h, bookingPreviewPayment.f93456h) && Intrinsics.f(this.i, bookingPreviewPayment.i);
    }

    public final int hashCode() {
        int iC = v7.c((this.f93453b.hashCode() + (this.f93452a.hashCode() * 31)) * 31, 31, this.f93454c.f83960a);
        d dVar = this.d;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, v7.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.e), 31);
        List list = this.f93455g;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        TravelFlightsAirProductPriceBreakdown travelFlightsAirProductPriceBreakdown = this.f93456h;
        int iHashCode2 = (iHashCode + (travelFlightsAirProductPriceBreakdown == null ? 0 : travelFlightsAirProductPriceBreakdown.hashCode())) * 31;
        TravelFlightsExtraProductsPriceBreakdown travelFlightsExtraProductsPriceBreakdown = this.i;
        return iHashCode2 + (travelFlightsExtraProductsPriceBreakdown != null ? travelFlightsExtraProductsPriceBreakdown.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f93452a);
        this.f93453b.writeToParcel(dest, i);
        dest.writeParcelable(this.f93454c, i);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            ((PointsRedeemOption) itY.next()).writeToParcel(dest, i);
        }
        List list = this.f93455g;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((TravelFlightsCarrierPriceBreakdown) itQ.next()).writeToParcel(dest, i);
            }
        }
        TravelFlightsAirProductPriceBreakdown travelFlightsAirProductPriceBreakdown = this.f93456h;
        if (travelFlightsAirProductPriceBreakdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelFlightsAirProductPriceBreakdown.writeToParcel(dest, i);
        }
        TravelFlightsExtraProductsPriceBreakdown travelFlightsExtraProductsPriceBreakdown = this.i;
        if (travelFlightsExtraProductsPriceBreakdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelFlightsExtraProductsPriceBreakdown.writeToParcel(dest, i);
        }
    }
}
