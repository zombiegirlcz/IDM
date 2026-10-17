package com.revolut.feature.travel.flights.models.domain.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/payment/Payment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Payment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Payment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f93534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriceWithPoints f93535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f93536c;
    public final d d;
    public final d e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelFlightsAirProductPriceBreakdown f93537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TravelFlightsExtraProductsPriceBreakdown f93538h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            PriceWithPoints priceWithPointsCreateFromParcel = parcel.readInt() == 0 ? null : PriceWithPoints.CREATOR.createFromParcel(parcel);
            RevPoints revPoints = (RevPoints) parcel.readParcelable(Payment.class.getClassLoader());
            d dVar2 = (d) parcel.readSerializable();
            d dVar3 = (d) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsCarrierPriceBreakdown.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new Payment(dVar, priceWithPointsCreateFromParcel, revPoints, dVar2, dVar3, arrayList, parcel.readInt() == 0 ? null : TravelFlightsAirProductPriceBreakdown.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TravelFlightsExtraProductsPriceBreakdown.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Payment[i];
        }
    }

    public Payment(d total, PriceWithPoints priceWithPoints, RevPoints rewardPoints, d dVar, d tax, List list, TravelFlightsAirProductPriceBreakdown travelFlightsAirProductPriceBreakdown, TravelFlightsExtraProductsPriceBreakdown travelFlightsExtraProductsPriceBreakdown) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(rewardPoints, "rewardPoints");
        Intrinsics.checkNotNullParameter(tax, "tax");
        this.f93534a = total;
        this.f93535b = priceWithPoints;
        this.f93536c = rewardPoints;
        this.d = dVar;
        this.e = tax;
        this.f = list;
        this.f93537g = travelFlightsAirProductPriceBreakdown;
        this.f93538h = travelFlightsExtraProductsPriceBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Payment)) {
            return false;
        }
        Payment payment = (Payment) obj2;
        return Intrinsics.f(this.f93534a, payment.f93534a) && Intrinsics.f(this.f93535b, payment.f93535b) && Intrinsics.f(this.f93536c, payment.f93536c) && Intrinsics.f(this.d, payment.d) && Intrinsics.f(this.e, payment.e) && Intrinsics.f(this.f, payment.f) && Intrinsics.f(this.f93537g, payment.f93537g) && Intrinsics.f(this.f93538h, payment.f93538h);
    }

    public final int hashCode() {
        int iHashCode = this.f93534a.hashCode() * 31;
        PriceWithPoints priceWithPoints = this.f93535b;
        int iC = v7.c((iHashCode + (priceWithPoints == null ? 0 : priceWithPoints.hashCode())) * 31, 31, this.f93536c.f83960a);
        d dVar = this.d;
        int iC2 = v7.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.e);
        List list = this.f;
        int iHashCode2 = (iC2 + (list == null ? 0 : list.hashCode())) * 31;
        TravelFlightsAirProductPriceBreakdown travelFlightsAirProductPriceBreakdown = this.f93537g;
        int iHashCode3 = (iHashCode2 + (travelFlightsAirProductPriceBreakdown == null ? 0 : travelFlightsAirProductPriceBreakdown.hashCode())) * 31;
        TravelFlightsExtraProductsPriceBreakdown travelFlightsExtraProductsPriceBreakdown = this.f93538h;
        return iHashCode3 + (travelFlightsExtraProductsPriceBreakdown != null ? travelFlightsExtraProductsPriceBreakdown.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f93534a);
        PriceWithPoints priceWithPoints = this.f93535b;
        if (priceWithPoints == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            priceWithPoints.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f93536c, i);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((TravelFlightsCarrierPriceBreakdown) itQ.next()).writeToParcel(dest, i);
            }
        }
        TravelFlightsAirProductPriceBreakdown travelFlightsAirProductPriceBreakdown = this.f93537g;
        if (travelFlightsAirProductPriceBreakdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelFlightsAirProductPriceBreakdown.writeToParcel(dest, i);
        }
        TravelFlightsExtraProductsPriceBreakdown travelFlightsExtraProductsPriceBreakdown = this.f93538h;
        if (travelFlightsExtraProductsPriceBreakdown == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelFlightsExtraProductsPriceBreakdown.writeToParcel(dest, i);
        }
    }
}
