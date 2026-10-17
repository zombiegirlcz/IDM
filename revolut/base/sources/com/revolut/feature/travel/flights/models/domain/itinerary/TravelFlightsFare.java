package com.revolut.feature.travel.flights.models.domain.itinerary;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.extra_products.TravelFlightsExtraProduct;
import com.revolut.feature.travel.flights.models.domain.payment.Payment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/models/domain/itinerary/TravelFlightsFare;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsFare implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsFare> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f93518c;
    public final ArrayList d;
    public final ArrayList e;
    public final Payment f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f93519g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsFareBaggageItem.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA2 = 0;
            while (iA2 != i2) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsFareExtraBenefit.CREATOR, parcel, arrayList2, iA2, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            int iA3 = 0;
            while (iA3 != i3) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(TravelFlightsExtraProduct.CREATOR, parcel, arrayList3, iA3, 1);
            }
            return new TravelFlightsFare(string, string2, arrayList, arrayList2, arrayList3, Payment.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsFare[i];
        }
    }

    public TravelFlightsFare(String id10, String str, ArrayList includedBaggage, ArrayList extraBenefits, ArrayList extraProducts, Payment payment, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(includedBaggage, "includedBaggage");
        Intrinsics.checkNotNullParameter(extraBenefits, "extraBenefits");
        Intrinsics.checkNotNullParameter(extraProducts, "extraProducts");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f93516a = id10;
        this.f93517b = str;
        this.f93518c = includedBaggage;
        this.d = extraBenefits;
        this.e = extraProducts;
        this.f = payment;
        this.f93519g = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsFare)) {
            return false;
        }
        TravelFlightsFare travelFlightsFare = (TravelFlightsFare) obj2;
        return Intrinsics.f(this.f93516a, travelFlightsFare.f93516a) && Intrinsics.f(this.f93517b, travelFlightsFare.f93517b) && this.f93518c.equals(travelFlightsFare.f93518c) && this.d.equals(travelFlightsFare.d) && this.e.equals(travelFlightsFare.e) && Intrinsics.f(this.f, travelFlightsFare.f) && this.f93519g == travelFlightsFare.f93519g;
    }

    public final int hashCode() {
        int iHashCode = this.f93516a.hashCode() * 31;
        String str = this.f93517b;
        return Boolean.hashCode(this.f93519g) + ((this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f93518c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93516a);
        dest.writeString(this.f93517b);
        Iterator itY = j6.a.y(this.f93518c, dest);
        while (itY.hasNext()) {
            ((TravelFlightsFareBaggageItem) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.d, dest);
        while (itY2.hasNext()) {
            ((TravelFlightsFareExtraBenefit) itY2.next()).writeToParcel(dest, i);
        }
        Iterator itY3 = j6.a.y(this.e, dest);
        while (itY3.hasNext()) {
            ((TravelFlightsExtraProduct) itY3.next()).writeToParcel(dest, i);
        }
        this.f.writeToParcel(dest, i);
        dest.writeInt(this.f93519g ? 1 : 0);
    }
}
