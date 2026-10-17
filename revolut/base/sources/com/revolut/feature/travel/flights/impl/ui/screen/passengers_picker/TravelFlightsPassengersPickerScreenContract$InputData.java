package com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.flights.models.domain.search.Passengers;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsPassengersPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsPassengersPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Passengers f93377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f93378b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsPassengersPickerScreenContract$InputData((Passengers) parcel.readParcelable(TravelFlightsPassengersPickerScreenContract$InputData.class.getClassLoader()), d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsPassengersPickerScreenContract$InputData[i];
        }
    }

    public TravelFlightsPassengersPickerScreenContract$InputData(Passengers passengers, d cabinClass) {
        Intrinsics.checkNotNullParameter(passengers, "passengers");
        Intrinsics.checkNotNullParameter(cabinClass, "cabinClass");
        this.f93377a = passengers;
        this.f93378b = cabinClass;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsPassengersPickerScreenContract$InputData)) {
            return false;
        }
        TravelFlightsPassengersPickerScreenContract$InputData travelFlightsPassengersPickerScreenContract$InputData = (TravelFlightsPassengersPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93377a, travelFlightsPassengersPickerScreenContract$InputData.f93377a) && this.f93378b == travelFlightsPassengersPickerScreenContract$InputData.f93378b;
    }

    public final int hashCode() {
        return this.f93378b.hashCode() + (this.f93377a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f93377a, i);
        dest.writeString(this.f93378b.name());
    }
}
