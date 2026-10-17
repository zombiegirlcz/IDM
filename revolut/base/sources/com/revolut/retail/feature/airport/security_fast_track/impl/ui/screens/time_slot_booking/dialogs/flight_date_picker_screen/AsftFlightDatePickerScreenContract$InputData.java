package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.flight_date_picker_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/dialogs/flight_date_picker_screen/AsftFlightDatePickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AsftFlightDatePickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AsftFlightDatePickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f98895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f98896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f98897c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet2.add(DayOfWeek.valueOf(parcel.readString()));
                }
                linkedHashSet = linkedHashSet2;
            }
            return new AsftFlightDatePickerScreenContract$InputData(localDate, localDate2, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AsftFlightDatePickerScreenContract$InputData[i];
        }
    }

    public AsftFlightDatePickerScreenContract$InputData(LocalDate minAvailableDate, LocalDate localDate, Set set) {
        Intrinsics.checkNotNullParameter(minAvailableDate, "minAvailableDate");
        this.f98895a = minAvailableDate;
        this.f98896b = localDate;
        this.f98897c = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AsftFlightDatePickerScreenContract$InputData)) {
            return false;
        }
        AsftFlightDatePickerScreenContract$InputData asftFlightDatePickerScreenContract$InputData = (AsftFlightDatePickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f98895a, asftFlightDatePickerScreenContract$InputData.f98895a) && Intrinsics.f(this.f98896b, asftFlightDatePickerScreenContract$InputData.f98896b) && Intrinsics.f(this.f98897c, asftFlightDatePickerScreenContract$InputData.f98897c);
    }

    public final int hashCode() {
        int iHashCode = this.f98895a.hashCode() * 31;
        LocalDate localDate = this.f98896b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Set set = this.f98897c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f98895a);
        dest.writeSerializable(this.f98896b);
        Set set = this.f98897c;
        if (set == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = e.q(dest, 1, set);
        while (itQ.hasNext()) {
            dest.writeString(((DayOfWeek) itQ.next()).name());
        }
    }
}
