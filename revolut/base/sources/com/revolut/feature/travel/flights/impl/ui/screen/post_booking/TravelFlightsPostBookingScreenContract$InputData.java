package com.revolut.feature.travel.flights.impl.ui.screen.post_booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/post_booking/TravelFlightsPostBookingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsPostBookingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsPostBookingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelFlightsPostBookingScreenContract$Tab f93389b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsPostBookingScreenContract$InputData(parcel.readString(), (TravelFlightsPostBookingScreenContract$Tab) parcel.readParcelable(TravelFlightsPostBookingScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsPostBookingScreenContract$InputData[i];
        }
    }

    public TravelFlightsPostBookingScreenContract$InputData(String bookingId, TravelFlightsPostBookingScreenContract$Tab travelFlightsPostBookingScreenContract$Tab) {
        Intrinsics.checkNotNullParameter(bookingId, "bookingId");
        this.f93388a = bookingId;
        this.f93389b = travelFlightsPostBookingScreenContract$Tab;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsPostBookingScreenContract$InputData)) {
            return false;
        }
        TravelFlightsPostBookingScreenContract$InputData travelFlightsPostBookingScreenContract$InputData = (TravelFlightsPostBookingScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93388a, travelFlightsPostBookingScreenContract$InputData.f93388a) && Intrinsics.f(this.f93389b, travelFlightsPostBookingScreenContract$InputData.f93389b);
    }

    public final int hashCode() {
        int iHashCode = this.f93388a.hashCode() * 31;
        TravelFlightsPostBookingScreenContract$Tab travelFlightsPostBookingScreenContract$Tab = this.f93389b;
        return iHashCode + (travelFlightsPostBookingScreenContract$Tab == null ? 0 : travelFlightsPostBookingScreenContract$Tab.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93388a);
        dest.writeParcelable(this.f93389b, i);
    }
}
