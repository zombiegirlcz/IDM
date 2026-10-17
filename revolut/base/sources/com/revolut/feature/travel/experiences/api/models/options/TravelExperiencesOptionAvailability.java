package com.revolut.feature.travel.experiences.api.models.options;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.experiences.api.models.pricing_breakdown.TravelExperiencesPricingBreakdown;
import com.revolut.feature.travel.experiences.models.TravelExperiencesCashback;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/options/TravelExperiencesOptionAvailability;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesOptionAvailability implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesOptionAvailability> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencesPricingBreakdown f92866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencesPricingBreakdown f92867c;
    public final String d;
    public final TravelExperiencesCashback e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RevPoints f92868g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Parcelable.Creator<TravelExperiencesPricingBreakdown> creator = TravelExperiencesPricingBreakdown.CREATOR;
            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownCreateFromParcel = creator.createFromParcel(parcel);
            TravelExperiencesPricingBreakdown travelExperiencesPricingBreakdownCreateFromParcel2 = creator.createFromParcel(parcel);
            String string2 = parcel.readString();
            TravelExperiencesCashback travelExperiencesCashback = (TravelExperiencesCashback) parcel.readParcelable(TravelExperiencesOptionAvailability.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TravelExperiencesOptionAvailability.class, parcel, arrayList, iE, 1);
            }
            return new TravelExperiencesOptionAvailability(string, travelExperiencesPricingBreakdownCreateFromParcel, travelExperiencesPricingBreakdownCreateFromParcel2, string2, travelExperiencesCashback, arrayList, (RevPoints) parcel.readParcelable(TravelExperiencesOptionAvailability.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesOptionAvailability[i];
        }
    }

    public TravelExperiencesOptionAvailability(String id10, TravelExperiencesPricingBreakdown pricing, TravelExperiencesPricingBreakdown pricingInRequestedCurrency, String bookingToken, TravelExperiencesCashback cashback, ArrayList pointsOptions, RevPoints revPoints) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        Intrinsics.checkNotNullParameter(pricingInRequestedCurrency, "pricingInRequestedCurrency");
        Intrinsics.checkNotNullParameter(bookingToken, "bookingToken");
        Intrinsics.checkNotNullParameter(cashback, "cashback");
        Intrinsics.checkNotNullParameter(pointsOptions, "pointsOptions");
        this.f92865a = id10;
        this.f92866b = pricing;
        this.f92867c = pricingInRequestedCurrency;
        this.d = bookingToken;
        this.e = cashback;
        this.f = pointsOptions;
        this.f92868g = revPoints;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesOptionAvailability)) {
            return false;
        }
        TravelExperiencesOptionAvailability travelExperiencesOptionAvailability = (TravelExperiencesOptionAvailability) obj2;
        return Intrinsics.f(this.f92865a, travelExperiencesOptionAvailability.f92865a) && Intrinsics.f(this.f92866b, travelExperiencesOptionAvailability.f92866b) && Intrinsics.f(this.f92867c, travelExperiencesOptionAvailability.f92867c) && Intrinsics.f(this.d, travelExperiencesOptionAvailability.d) && Intrinsics.f(this.e, travelExperiencesOptionAvailability.e) && this.f.equals(travelExperiencesOptionAvailability.f) && Intrinsics.f(this.f92868g, travelExperiencesOptionAvailability.f92868g);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, (this.e.hashCode() + p.a.c((this.f92867c.hashCode() + ((this.f92866b.hashCode() + (this.f92865a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31, 31);
        RevPoints revPoints = this.f92868g;
        return iB + (revPoints == null ? 0 : revPoints.f83960a.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92865a);
        this.f92866b.writeToParcel(dest, i);
        this.f92867c.writeToParcel(dest, i);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeParcelable(this.f92868g, i);
    }
}
