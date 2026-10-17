package com.revolut.feature.travel.flights.impl.ui.screen.passengers_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/passengers_details/TravelFlightsPassengersDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsPassengersDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsPassengersDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f93356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f93357c;
    public final Passengers d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsPassengersDetailsScreenContract$InputData(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (Passengers) parcel.readParcelable(TravelFlightsPassengersDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsPassengersDetailsScreenContract$InputData[i];
        }
    }

    public TravelFlightsPassengersDetailsScreenContract$InputData(String offerId, LocalDate departureDate, LocalDate localDate, Passengers passengers) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(departureDate, "departureDate");
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        this.f93355a = offerId;
        this.f93356b = departureDate;
        this.f93357c = localDate;
        this.d = passengers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsPassengersDetailsScreenContract$InputData)) {
            return false;
        }
        TravelFlightsPassengersDetailsScreenContract$InputData travelFlightsPassengersDetailsScreenContract$InputData = (TravelFlightsPassengersDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93355a, travelFlightsPassengersDetailsScreenContract$InputData.f93355a) && Intrinsics.f(this.f93356b, travelFlightsPassengersDetailsScreenContract$InputData.f93356b) && Intrinsics.f(this.f93357c, travelFlightsPassengersDetailsScreenContract$InputData.f93357c) && Intrinsics.f(this.d, travelFlightsPassengersDetailsScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iA = y.a(this.f93355a.hashCode() * 31, 31, this.f93356b);
        LocalDate localDate = this.f93357c;
        return this.d.hashCode() + ((iA + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93355a);
        dest.writeSerializable(this.f93356b);
        dest.writeSerializable(this.f93357c);
        dest.writeParcelable(this.d, i);
    }
}
