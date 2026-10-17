package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/onboarding/proof_of_driving_number/driver_number_input/DriverNumberInputScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CountryPickerStep", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/proof_of_driving_number/driver_number_input/DriverNumberInputScreenContract$ModalStep$CountryPickerStep;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DriverNumberInputScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/proof_of_driving_number/driver_number_input/DriverNumberInputScreenContract$ModalStep$CountryPickerStep;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/proof_of_driving_number/driver_number_input/DriverNumberInputScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountryPickerStep extends DriverNumberInputScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CountryPickerStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75620a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountryPickerStep(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryPickerStep[i];
            }
        }

        public CountryPickerStep(String driverId) {
            Intrinsics.checkNotNullParameter(driverId, "driverId");
            this.f75620a = driverId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CountryPickerStep) && Intrinsics.f(this.f75620a, ((CountryPickerStep) obj2).f75620a);
        }

        public final int hashCode() {
            return this.f75620a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75620a);
        }
    }

    private DriverNumberInputScreenContract$ModalStep() {
    }
}
