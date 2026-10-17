package com.revolut.feature.travel.flights.models.domain.offer_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProduct;
import com.revolut.feature.travel.flights.models.domain.itinerary.PassengerRequirement;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/offer_details/TravelFlightsOfferDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsOfferDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsOfferDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f93532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f93533c;
    public final List d;
    public final Payment e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsIncludedBaggageItem.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsExtraProduct.CREATOR, parcel, arrayList2, iA2, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int iA3 = 0;
            while (iA3 != i3) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(PassengerRequirement.CREATOR, parcel, arrayList3, iA3, 1);
            }
            Payment paymentCreateFromParcel = Payment.CREATOR.createFromParcel(parcel);
            int i5 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList4.add(h.valueOf(parcel.readString()));
            }
            return new TravelFlightsOfferDetails(string, arrayList, arrayList2, arrayList3, paymentCreateFromParcel, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsOfferDetails[i];
        }
    }

    public TravelFlightsOfferDetails(String id10, List includedBaggage, List extraProducts, List passengerRequirements, Payment payment, List notifications) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(includedBaggage, "includedBaggage");
        Intrinsics.checkNotNullParameter(extraProducts, "extraProducts");
        Intrinsics.checkNotNullParameter(passengerRequirements, "passengerRequirements");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        this.f93531a = id10;
        this.f93532b = includedBaggage;
        this.f93533c = extraProducts;
        this.d = passengerRequirements;
        this.e = payment;
        this.f = notifications;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsOfferDetails)) {
            return false;
        }
        TravelFlightsOfferDetails travelFlightsOfferDetails = (TravelFlightsOfferDetails) obj2;
        return Intrinsics.f(this.f93531a, travelFlightsOfferDetails.f93531a) && Intrinsics.f(this.f93532b, travelFlightsOfferDetails.f93532b) && Intrinsics.f(this.f93533c, travelFlightsOfferDetails.f93533c) && Intrinsics.f(this.d, travelFlightsOfferDetails.d) && Intrinsics.f(this.e, travelFlightsOfferDetails.e) && Intrinsics.f(this.f, travelFlightsOfferDetails.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + p.a.d(p.a.d(p.a.d(this.f93531a.hashCode() * 31, 31, this.f93532b), 31, this.f93533c), 31, this.d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93531a);
        Iterator itV = p.a.v(this.f93532b, dest);
        while (itV.hasNext()) {
            ((TravelFlightsIncludedBaggageItem) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f93533c, dest);
        while (itV2.hasNext()) {
            ((TravelFlightsExtraProduct) itV2.next()).writeToParcel(dest, i);
        }
        Iterator itV3 = p.a.v(this.d, dest);
        while (itV3.hasNext()) {
            ((PassengerRequirement) itV3.next()).writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        Iterator itV4 = p.a.v(this.f, dest);
        while (itV4.hasNext()) {
            dest.writeString(((h) itV4.next()).name());
        }
    }
}
