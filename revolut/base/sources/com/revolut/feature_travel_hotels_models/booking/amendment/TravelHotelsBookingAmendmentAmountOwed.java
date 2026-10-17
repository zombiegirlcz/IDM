package com.revolut.feature_travel_hotels_models.booking.amendment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/booking/amendment/TravelHotelsBookingAmendmentAmountOwed;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelHotelsBookingAmendmentAmountOwed implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelHotelsBookingAmendmentAmountOwed> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsBookingAmendmentOwedPrice f97842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelHotelsBookingAmendmentOwedPrice f97843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f97844c;
    public final RevPoints d;
    public final HotelsPropertyCashback e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<TravelHotelsBookingAmendmentOwedPrice> creator = TravelHotelsBookingAmendmentOwedPrice.CREATOR;
            TravelHotelsBookingAmendmentOwedPrice travelHotelsBookingAmendmentOwedPriceCreateFromParcel = creator.createFromParcel(parcel);
            TravelHotelsBookingAmendmentOwedPrice travelHotelsBookingAmendmentOwedPriceCreateFromParcel2 = creator.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(HotelsPointsRedeemOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TravelHotelsBookingAmendmentAmountOwed(travelHotelsBookingAmendmentOwedPriceCreateFromParcel, travelHotelsBookingAmendmentOwedPriceCreateFromParcel2, arrayList, (RevPoints) parcel.readParcelable(TravelHotelsBookingAmendmentAmountOwed.class.getClassLoader()), parcel.readInt() == 0 ? null : HotelsPropertyCashback.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelHotelsBookingAmendmentAmountOwed[i];
        }
    }

    public TravelHotelsBookingAmendmentAmountOwed(TravelHotelsBookingAmendmentOwedPrice overallPrice, TravelHotelsBookingAmendmentOwedPrice priceInRequestedCurrency, ArrayList pointsRedeemOptions, RevPoints revPoints, HotelsPropertyCashback hotelsPropertyCashback) {
        Intrinsics.checkNotNullParameter(overallPrice, "overallPrice");
        Intrinsics.checkNotNullParameter(priceInRequestedCurrency, "priceInRequestedCurrency");
        Intrinsics.checkNotNullParameter(pointsRedeemOptions, "pointsRedeemOptions");
        this.f97842a = overallPrice;
        this.f97843b = priceInRequestedCurrency;
        this.f97844c = pointsRedeemOptions;
        this.d = revPoints;
        this.e = hotelsPropertyCashback;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelHotelsBookingAmendmentAmountOwed)) {
            return false;
        }
        TravelHotelsBookingAmendmentAmountOwed travelHotelsBookingAmendmentAmountOwed = (TravelHotelsBookingAmendmentAmountOwed) obj2;
        return Intrinsics.f(this.f97842a, travelHotelsBookingAmendmentAmountOwed.f97842a) && Intrinsics.f(this.f97843b, travelHotelsBookingAmendmentAmountOwed.f97843b) && this.f97844c.equals(travelHotelsBookingAmendmentAmountOwed.f97844c) && Intrinsics.f(this.d, travelHotelsBookingAmendmentAmountOwed.d) && Intrinsics.f(this.e, travelHotelsBookingAmendmentAmountOwed.e);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f97844c, v7.c(this.f97842a.f97865a.hashCode() * 31, 31, this.f97843b.f97865a), 31);
        RevPoints revPoints = this.d;
        int iHashCode = (iB + (revPoints == null ? 0 : revPoints.f83960a.hashCode())) * 31;
        HotelsPropertyCashback hotelsPropertyCashback = this.e;
        return iHashCode + (hotelsPropertyCashback != null ? hotelsPropertyCashback.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f97842a.writeToParcel(dest, i);
        this.f97843b.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f97844c, dest);
        while (itY.hasNext()) {
            ((HotelsPointsRedeemOption) itY.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
        HotelsPropertyCashback hotelsPropertyCashback = this.e;
        if (hotelsPropertyCashback == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            hotelsPropertyCashback.writeToParcel(dest, i);
        }
    }
}
