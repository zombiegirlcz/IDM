package com.revolut.feature.travel.flights.impl.ui.screen.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreviewParams;
import com.revolut.feature.travel.flights.models.domain.search.TravelFlightsItinerary;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/checkout/TravelFlightsCheckoutScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsCheckoutScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsCheckoutScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BookingPreviewParams f93297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelFlightsItinerary f93298b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsCheckoutScreenContract$InputData((BookingPreviewParams) parcel.readParcelable(TravelFlightsCheckoutScreenContract$InputData.class.getClassLoader()), (TravelFlightsItinerary) parcel.readParcelable(TravelFlightsCheckoutScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsCheckoutScreenContract$InputData[i];
        }
    }

    public TravelFlightsCheckoutScreenContract$InputData(BookingPreviewParams bookingPreviewParams, TravelFlightsItinerary travelFlightsItinerary) {
        Intrinsics.checkNotNullParameter(bookingPreviewParams, "bookingPreviewParams");
        this.f93297a = bookingPreviewParams;
        this.f93298b = travelFlightsItinerary;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsCheckoutScreenContract$InputData)) {
            return false;
        }
        TravelFlightsCheckoutScreenContract$InputData travelFlightsCheckoutScreenContract$InputData = (TravelFlightsCheckoutScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93297a, travelFlightsCheckoutScreenContract$InputData.f93297a) && Intrinsics.f(this.f93298b, travelFlightsCheckoutScreenContract$InputData.f93298b);
    }

    public final int hashCode() {
        int iHashCode = this.f93297a.hashCode() * 31;
        TravelFlightsItinerary travelFlightsItinerary = this.f93298b;
        return iHashCode + (travelFlightsItinerary == null ? 0 : travelFlightsItinerary.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93297a, i);
        dest.writeParcelable(this.f93298b, i);
    }
}
