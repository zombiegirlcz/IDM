package com.revolut.feature_travel_hotels_models.booking.amendment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.property.Pricing;
import com.revolut.feature_travel_hotels_models.property.room.TravelHotelsRatePricing;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentCostWithOldPricing;", "Lcom/revolut/feature_travel_hotels_models/property/room/TravelHotelsRatePricing;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsBookingAmendmentCostWithOldPricing implements TravelHotelsRatePricing {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsBookingAmendmentCostWithOldPricing> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsBookingAmendmentCost f97858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pricing f97859b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelHotelsBookingAmendmentCostWithOldPricing((TravelHotelsBookingAmendmentCost) parcel.readParcelable(TravelHotelsBookingAmendmentCostWithOldPricing.class.getClassLoader()), Pricing.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsBookingAmendmentCostWithOldPricing[i];
        }
    }

    public TravelHotelsBookingAmendmentCostWithOldPricing(TravelHotelsBookingAmendmentCost amendmentCost, Pricing oldPricing) {
        Intrinsics.checkNotNullParameter(amendmentCost, "amendmentCost");
        Intrinsics.checkNotNullParameter(oldPricing, "oldPricing");
        this.f97858a = amendmentCost;
        this.f97859b = oldPricing;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsBookingAmendmentCostWithOldPricing)) {
            return false;
        }
        TravelHotelsBookingAmendmentCostWithOldPricing travelHotelsBookingAmendmentCostWithOldPricing = (TravelHotelsBookingAmendmentCostWithOldPricing) obj2;
        return Intrinsics.f(this.f97858a, travelHotelsBookingAmendmentCostWithOldPricing.f97858a) && Intrinsics.f(this.f97859b, travelHotelsBookingAmendmentCostWithOldPricing.f97859b);
    }

    public final int hashCode() {
        return this.f97859b.hashCode() + (this.f97858a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97858a, i);
        this.f97859b.writeToParcel(dest, i);
    }
}
