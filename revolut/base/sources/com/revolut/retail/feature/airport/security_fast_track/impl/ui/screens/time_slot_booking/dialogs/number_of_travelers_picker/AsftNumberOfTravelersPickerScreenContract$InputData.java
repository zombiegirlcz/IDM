package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/dialogs/number_of_travelers_picker/AsftNumberOfTravelersPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftNumberOfTravelersPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AsftNumberOfTravelersPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98900c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AsftNumberOfTravelersPickerScreenContract$InputData(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftNumberOfTravelersPickerScreenContract$InputData[i];
        }
    }

    public AsftNumberOfTravelersPickerScreenContract$InputData(String airportIataCode, String terminalId, int i) {
        Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
        Intrinsics.checkNotNullParameter(terminalId, "terminalId");
        this.f98898a = airportIataCode;
        this.f98899b = terminalId;
        this.f98900c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftNumberOfTravelersPickerScreenContract$InputData)) {
            return false;
        }
        AsftNumberOfTravelersPickerScreenContract$InputData asftNumberOfTravelersPickerScreenContract$InputData = (AsftNumberOfTravelersPickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f98898a, asftNumberOfTravelersPickerScreenContract$InputData.f98898a) && Intrinsics.f(this.f98899b, asftNumberOfTravelersPickerScreenContract$InputData.f98899b) && this.f98900c == asftNumberOfTravelersPickerScreenContract$InputData.f98900c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98900c) + p.a.c(this.f98898a.hashCode() * 31, 31, this.f98899b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98898a);
        dest.writeString(this.f98899b);
        dest.writeInt(this.f98900c);
    }
}
