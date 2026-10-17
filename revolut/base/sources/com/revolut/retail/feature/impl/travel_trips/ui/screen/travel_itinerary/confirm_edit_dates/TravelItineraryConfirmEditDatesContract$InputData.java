package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.confirm_edit_dates;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/confirm_edit_dates/TravelItineraryConfirmEditDatesContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelItineraryConfirmEditDatesContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelItineraryConfirmEditDatesContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f101644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f101645c;
    public final LocalDate d;
    public final LocalDate e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelItineraryConfirmEditDatesContract$InputData(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelItineraryConfirmEditDatesContract$InputData[i];
        }
    }

    public TravelItineraryConfirmEditDatesContract$InputData(String itineraryId, LocalDate prevStartDate, LocalDate prevEndDate, LocalDate newStartDate, LocalDate newEndDate) {
        Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
        Intrinsics.checkNotNullParameter(prevStartDate, "prevStartDate");
        Intrinsics.checkNotNullParameter(prevEndDate, "prevEndDate");
        Intrinsics.checkNotNullParameter(newStartDate, "newStartDate");
        Intrinsics.checkNotNullParameter(newEndDate, "newEndDate");
        this.f101643a = itineraryId;
        this.f101644b = prevStartDate;
        this.f101645c = prevEndDate;
        this.d = newStartDate;
        this.e = newEndDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelItineraryConfirmEditDatesContract$InputData)) {
            return false;
        }
        TravelItineraryConfirmEditDatesContract$InputData travelItineraryConfirmEditDatesContract$InputData = (TravelItineraryConfirmEditDatesContract$InputData) obj2;
        return Intrinsics.f(this.f101643a, travelItineraryConfirmEditDatesContract$InputData.f101643a) && Intrinsics.f(this.f101644b, travelItineraryConfirmEditDatesContract$InputData.f101644b) && Intrinsics.f(this.f101645c, travelItineraryConfirmEditDatesContract$InputData.f101645c) && Intrinsics.f(this.d, travelItineraryConfirmEditDatesContract$InputData.d) && Intrinsics.f(this.e, travelItineraryConfirmEditDatesContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + y.a(y.a(y.a(this.f101643a.hashCode() * 31, 31, this.f101644b), 31, this.f101645c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101643a);
        dest.writeSerializable(this.f101644b);
        dest.writeSerializable(this.f101645c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
