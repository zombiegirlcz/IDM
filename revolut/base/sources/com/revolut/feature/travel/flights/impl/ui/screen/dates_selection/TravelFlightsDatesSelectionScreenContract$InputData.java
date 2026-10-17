package com.revolut.feature.travel.flights.impl.ui.screen.dates_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/dates_selection/TravelFlightsDatesSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsDatesSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelFlightsDatesSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f93320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f93321b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsDatesSelectionScreenContract$InputData((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsDatesSelectionScreenContract$InputData[i];
        }
    }

    public TravelFlightsDatesSelectionScreenContract$InputData(LocalDate localDate, LocalDate localDate2) {
        this.f93320a = localDate;
        this.f93321b = localDate2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsDatesSelectionScreenContract$InputData)) {
            return false;
        }
        TravelFlightsDatesSelectionScreenContract$InputData travelFlightsDatesSelectionScreenContract$InputData = (TravelFlightsDatesSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f93320a, travelFlightsDatesSelectionScreenContract$InputData.f93320a) && Intrinsics.f(this.f93321b, travelFlightsDatesSelectionScreenContract$InputData.f93321b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f93320a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f93321b;
        return iHashCode + (localDate2 != null ? localDate2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f93320a);
        dest.writeSerializable(this.f93321b);
    }
}
