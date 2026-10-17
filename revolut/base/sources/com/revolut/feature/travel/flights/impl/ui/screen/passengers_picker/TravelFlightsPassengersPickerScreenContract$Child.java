package com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m7g.i;
import m7g.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$Child", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelFlightsPassengersPickerScreenContract$Child implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f93375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f93376b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<TravelFlightsPassengersPickerScreenContract$Child> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$Child$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelFlightsPassengersPickerScreenContract$Child(parcel.readInt(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelFlightsPassengersPickerScreenContract$Child[i];
        }
    }

    public TravelFlightsPassengersPickerScreenContract$Child(int i, LocalDate birthDate) {
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        this.f93375a = i;
        this.f93376b = birthDate;
    }

    public final boolean a(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        j.Companion.getClass();
        return i.a(this.f93376b, date) == j.INFANT;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelFlightsPassengersPickerScreenContract$Child)) {
            return false;
        }
        TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child = (TravelFlightsPassengersPickerScreenContract$Child) obj2;
        return this.f93375a == travelFlightsPassengersPickerScreenContract$Child.f93375a && Intrinsics.f(this.f93376b, travelFlightsPassengersPickerScreenContract$Child.f93376b);
    }

    public final int hashCode() {
        return this.f93376b.hashCode() + (Integer.hashCode(this.f93375a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f93375a);
        dest.writeSerializable(this.f93376b);
    }
}
