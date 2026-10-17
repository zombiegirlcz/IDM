package com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/impl/travel_trips/ui/screen/travel_itinerary/add_event/TravelItineraryAddEventContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_travel_trips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelItineraryAddEventContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TravelItineraryAddEventContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f101618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f101619c;
    public final String d;
    public final TravelItineraryAddEventContract$Mode e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelItineraryAddEventContract$InputData(parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readString(), (TravelItineraryAddEventContract$Mode) parcel.readParcelable(TravelItineraryAddEventContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelItineraryAddEventContract$InputData[i];
        }
    }

    public TravelItineraryAddEventContract$InputData(String itineraryId, LocalDate minDate, LocalDate maxDate, String countryCode, TravelItineraryAddEventContract$Mode mode) {
        Intrinsics.checkNotNullParameter(itineraryId, "itineraryId");
        Intrinsics.checkNotNullParameter(minDate, "minDate");
        Intrinsics.checkNotNullParameter(maxDate, "maxDate");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f101617a = itineraryId;
        this.f101618b = minDate;
        this.f101619c = maxDate;
        this.d = countryCode;
        this.e = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelItineraryAddEventContract$InputData)) {
            return false;
        }
        TravelItineraryAddEventContract$InputData travelItineraryAddEventContract$InputData = (TravelItineraryAddEventContract$InputData) obj2;
        return Intrinsics.f(this.f101617a, travelItineraryAddEventContract$InputData.f101617a) && Intrinsics.f(this.f101618b, travelItineraryAddEventContract$InputData.f101618b) && Intrinsics.f(this.f101619c, travelItineraryAddEventContract$InputData.f101619c) && Intrinsics.f(this.d, travelItineraryAddEventContract$InputData.d) && Intrinsics.f(this.e, travelItineraryAddEventContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(y.a(y.a(this.f101617a.hashCode() * 31, 31, this.f101618b), 31, this.f101619c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101617a);
        dest.writeSerializable(this.f101618b);
        dest.writeSerializable(this.f101619c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }
}
