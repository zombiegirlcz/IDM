package com.revolut.feature_travel_hotels_models.booking.amendment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentNewPricing;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsBookingAmendmentNewPricing implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsBookingAmendmentNewPricing> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsBookingAmendmentPrice f97862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelHotelsBookingAmendmentPrice f97863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f97864c;
    public final HotelsPropertyCashback d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<TravelHotelsBookingAmendmentPrice> creator = TravelHotelsBookingAmendmentPrice.CREATOR;
            return new TravelHotelsBookingAmendmentNewPricing(creator.createFromParcel(parcel), creator.createFromParcel(parcel), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : HotelsPropertyCashback.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsBookingAmendmentNewPricing[i];
        }
    }

    public TravelHotelsBookingAmendmentNewPricing(TravelHotelsBookingAmendmentPrice overallPrice, TravelHotelsBookingAmendmentPrice priceInRequestedCurrency, d dVar, HotelsPropertyCashback hotelsPropertyCashback) {
        Intrinsics.checkNotNullParameter(overallPrice, "overallPrice");
        Intrinsics.checkNotNullParameter(priceInRequestedCurrency, "priceInRequestedCurrency");
        this.f97862a = overallPrice;
        this.f97863b = priceInRequestedCurrency;
        this.f97864c = dVar;
        this.d = hotelsPropertyCashback;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsBookingAmendmentNewPricing)) {
            return false;
        }
        TravelHotelsBookingAmendmentNewPricing travelHotelsBookingAmendmentNewPricing = (TravelHotelsBookingAmendmentNewPricing) obj2;
        return Intrinsics.f(this.f97862a, travelHotelsBookingAmendmentNewPricing.f97862a) && Intrinsics.f(this.f97863b, travelHotelsBookingAmendmentNewPricing.f97863b) && Intrinsics.f(this.f97864c, travelHotelsBookingAmendmentNewPricing.f97864c) && Intrinsics.f(this.d, travelHotelsBookingAmendmentNewPricing.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f97863b.hashCode() + (this.f97862a.hashCode() * 31)) * 31;
        d dVar = this.f97864c;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        HotelsPropertyCashback hotelsPropertyCashback = this.d;
        return iHashCode2 + (hotelsPropertyCashback != null ? hotelsPropertyCashback.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f97862a.writeToParcel(dest, i);
        this.f97863b.writeToParcel(dest, i);
        dest.writeSerializable(this.f97864c);
        HotelsPropertyCashback hotelsPropertyCashback = this.d;
        if (hotelsPropertyCashback == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyCashback.writeToParcel(dest, i);
        }
    }
}
