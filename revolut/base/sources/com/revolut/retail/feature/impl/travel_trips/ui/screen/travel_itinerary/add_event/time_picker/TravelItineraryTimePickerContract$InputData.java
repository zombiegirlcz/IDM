package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.time_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/time_picker/TravelItineraryTimePickerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelItineraryTimePickerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelItineraryTimePickerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalTime f101642a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelItineraryTimePickerContract$InputData((LocalTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelItineraryTimePickerContract$InputData[i];
        }
    }

    public TravelItineraryTimePickerContract$InputData(LocalTime localTime) {
        this.f101642a = localTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof TravelItineraryTimePickerContract$InputData) && Intrinsics.f(this.f101642a, ((TravelItineraryTimePickerContract$InputData) obj2).f101642a);
    }

    public final int hashCode() {
        LocalTime localTime = this.f101642a;
        if (localTime == null) {
            return 0;
        }
        return localTime.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101642a);
    }
}
