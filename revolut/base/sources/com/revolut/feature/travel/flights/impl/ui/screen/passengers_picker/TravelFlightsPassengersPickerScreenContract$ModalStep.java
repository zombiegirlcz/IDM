package com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChildBirthDatePicker", "AddAdultForInfant", "RemoveAdultForInfant", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$ModalStep$AddAdultForInfant;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$ModalStep$ChildBirthDatePicker;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$ModalStep$RemoveAdultForInfant;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TravelFlightsPassengersPickerScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$ModalStep$AddAdultForInfant;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddAdultForInfant implements TravelFlightsPassengersPickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddAdultForInfant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelFlightsPassengersPickerScreenContract$Child f93379a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddAdultForInfant(TravelFlightsPassengersPickerScreenContract$Child.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddAdultForInfant[i];
            }
        }

        public AddAdultForInfant(TravelFlightsPassengersPickerScreenContract$Child infant) {
            Intrinsics.checkNotNullParameter(infant, "infant");
            this.f93379a = infant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddAdultForInfant) && Intrinsics.f(this.f93379a, ((AddAdultForInfant) obj2).f93379a);
        }

        public final int hashCode() {
            return this.f93379a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93379a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$ModalStep$ChildBirthDatePicker;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChildBirthDatePicker implements TravelFlightsPassengersPickerScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f93380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f93381b;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<ChildBirthDatePicker> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$ModalStep$ChildBirthDatePicker$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChildBirthDatePicker(parcel.readInt(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChildBirthDatePicker[i];
            }
        }

        public ChildBirthDatePicker(int i, LocalDate localDate) {
            this.f93380a = i;
            this.f93381b = localDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChildBirthDatePicker)) {
                return false;
            }
            ChildBirthDatePicker childBirthDatePicker = (ChildBirthDatePicker) obj2;
            return this.f93380a == childBirthDatePicker.f93380a && Intrinsics.f(this.f93381b, childBirthDatePicker.f93381b);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f93380a) * 31;
            LocalDate localDate = this.f93381b;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f93380a);
            dest.writeSerializable(this.f93381b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$ModalStep$RemoveAdultForInfant;", "Lcom/revolut/feature/travel/flights/impl/ui/screen/passengers_picker/TravelFlightsPassengersPickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoveAdultForInfant implements TravelFlightsPassengersPickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RemoveAdultForInfant> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelFlightsPassengersPickerScreenContract$Child f93382a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoveAdultForInfant(TravelFlightsPassengersPickerScreenContract$Child.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveAdultForInfant[i];
            }
        }

        public RemoveAdultForInfant(TravelFlightsPassengersPickerScreenContract$Child infant) {
            Intrinsics.checkNotNullParameter(infant, "infant");
            this.f93382a = infant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemoveAdultForInfant) && Intrinsics.f(this.f93382a, ((RemoveAdultForInfant) obj2).f93382a);
        }

        public final int hashCode() {
            return this.f93382a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f93382a.writeToParcel(dest, i);
        }
    }
}
