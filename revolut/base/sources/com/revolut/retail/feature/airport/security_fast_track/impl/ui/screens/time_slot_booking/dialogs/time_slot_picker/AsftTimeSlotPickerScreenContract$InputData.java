package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import java.time.LocalDate;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/dialogs/time_slot_picker/AsftTimeSlotPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftTimeSlotPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AsftTimeSlotPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeZone f98901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98903c;
    public final LocalDate d;
    public final AsftTimeSlot e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftTimeSlotPickerScreenContract$InputData((TimeZone) parcel.readSerializable(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), (AsftTimeSlot) parcel.readParcelable(AsftTimeSlotPickerScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftTimeSlotPickerScreenContract$InputData[i];
        }
    }

    public AsftTimeSlotPickerScreenContract$InputData(TimeZone airportTimeZone, String airportIataCode, String terminalId, LocalDate localDate, AsftTimeSlot asftTimeSlot) {
        Intrinsics.checkNotNullParameter(airportTimeZone, "airportTimeZone");
        Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        this.f98901a = airportTimeZone;
        this.f98902b = airportIataCode;
        this.f98903c = terminalId;
        this.d = localDate;
        this.e = asftTimeSlot;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftTimeSlotPickerScreenContract$InputData)) {
            return false;
        }
        AsftTimeSlotPickerScreenContract$InputData asftTimeSlotPickerScreenContract$InputData = (AsftTimeSlotPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f98901a, asftTimeSlotPickerScreenContract$InputData.f98901a) && Intrinsics.f(this.f98902b, asftTimeSlotPickerScreenContract$InputData.f98902b) && Intrinsics.f(this.f98903c, asftTimeSlotPickerScreenContract$InputData.f98903c) && Intrinsics.f(this.d, asftTimeSlotPickerScreenContract$InputData.d) && Intrinsics.f(this.e, asftTimeSlotPickerScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f98901a.hashCode() * 31, 31, this.f98902b), 31, this.f98903c);
        LocalDate localDate = this.d;
        int iHashCode = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        AsftTimeSlot asftTimeSlot = this.e;
        return iHashCode + (asftTimeSlot != null ? asftTimeSlot.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f98901a);
        dest.writeString(this.f98902b);
        dest.writeString(this.f98903c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
    }
}
