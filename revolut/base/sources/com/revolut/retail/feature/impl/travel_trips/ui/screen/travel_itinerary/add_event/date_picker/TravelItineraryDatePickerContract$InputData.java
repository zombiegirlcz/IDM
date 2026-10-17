package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.date_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/date_picker/TravelItineraryDatePickerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelItineraryDatePickerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelItineraryDatePickerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f101639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f101640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f101641c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelItineraryDatePickerContract$InputData((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelItineraryDatePickerContract$InputData[i];
        }
    }

    public TravelItineraryDatePickerContract$InputData(LocalDate minDate, LocalDate maxDate, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(minDate, "minDate");
        Intrinsics.checkNotNullParameter(maxDate, "maxDate");
        this.f101639a = minDate;
        this.f101640b = maxDate;
        this.f101641c = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelItineraryDatePickerContract$InputData)) {
            return false;
        }
        TravelItineraryDatePickerContract$InputData travelItineraryDatePickerContract$InputData = (TravelItineraryDatePickerContract$InputData) obj2;
        return Intrinsics.f(this.f101639a, travelItineraryDatePickerContract$InputData.f101639a) && Intrinsics.f(this.f101640b, travelItineraryDatePickerContract$InputData.f101640b) && Intrinsics.f(this.f101641c, travelItineraryDatePickerContract$InputData.f101641c);
    }

    public final int hashCode() {
        int iA = y.a(this.f101639a.hashCode() * 31, 31, this.f101640b);
        LocalDate localDate = this.f101641c;
        return iA + (localDate == null ? 0 : localDate.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101639a);
        dest.writeSerializable(this.f101640b);
        dest.writeSerializable(this.f101641c);
    }
}
