package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/AsftTimeSlotBookingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftTimeSlotBookingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AsftTimeSlotBookingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98883b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftTimeSlotBookingScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftTimeSlotBookingScreenContract$InputData[i];
        }
    }

    public AsftTimeSlotBookingScreenContract$InputData(String airportIataCode, String airportTerminalId) {
        Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
        Intrinsics.checkNotNullParameter(airportTerminalId, "airportTerminalId");
        this.f98882a = airportIataCode;
        this.f98883b = airportTerminalId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftTimeSlotBookingScreenContract$InputData)) {
            return false;
        }
        AsftTimeSlotBookingScreenContract$InputData asftTimeSlotBookingScreenContract$InputData = (AsftTimeSlotBookingScreenContract$InputData) obj2;
        return Intrinsics.f(this.f98882a, asftTimeSlotBookingScreenContract$InputData.f98882a) && Intrinsics.f(this.f98883b, asftTimeSlotBookingScreenContract$InputData.f98883b);
    }

    public final int hashCode() {
        return this.f98883b.hashCode() + (this.f98882a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98882a);
        dest.writeString(this.f98883b);
    }
}
