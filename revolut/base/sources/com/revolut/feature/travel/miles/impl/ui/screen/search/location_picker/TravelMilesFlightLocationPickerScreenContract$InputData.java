package com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.miles.api.model.TravelMilesSearchLocation;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lig.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/miles/impl/ui/screen/search/location_picker/TravelMilesFlightLocationPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelMilesFlightLocationPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelMilesFlightLocationPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f94381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelMilesSearchLocation f94382b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelMilesFlightLocationPickerScreenContract$InputData(h.valueOf(parcel.readString()), (TravelMilesSearchLocation) parcel.readParcelable(TravelMilesFlightLocationPickerScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelMilesFlightLocationPickerScreenContract$InputData[i];
        }
    }

    public TravelMilesFlightLocationPickerScreenContract$InputData(h type, TravelMilesSearchLocation travelMilesSearchLocation) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f94381a = type;
        this.f94382b = travelMilesSearchLocation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelMilesFlightLocationPickerScreenContract$InputData)) {
            return false;
        }
        TravelMilesFlightLocationPickerScreenContract$InputData travelMilesFlightLocationPickerScreenContract$InputData = (TravelMilesFlightLocationPickerScreenContract$InputData) obj2;
        return this.f94381a == travelMilesFlightLocationPickerScreenContract$InputData.f94381a && Intrinsics.f(this.f94382b, travelMilesFlightLocationPickerScreenContract$InputData.f94382b);
    }

    public final int hashCode() {
        int iHashCode = this.f94381a.hashCode() * 31;
        TravelMilesSearchLocation travelMilesSearchLocation = this.f94382b;
        return iHashCode + (travelMilesSearchLocation == null ? 0 : travelMilesSearchLocation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94381a.name());
        dest.writeParcelable(this.f94382b, i);
    }
}
