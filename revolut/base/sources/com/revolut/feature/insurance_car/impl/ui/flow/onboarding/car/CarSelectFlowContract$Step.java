package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CarSearch", "CarManualInput", "CarManualQuestions", "CarNctQuestions", "CarConfirmation", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step$CarConfirmation;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step$CarManualInput;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step$CarManualQuestions;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step$CarNctQuestions;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step$CarSearch;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CarSelectFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step$CarConfirmation;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CarConfirmation extends CarSelectFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CarConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InsurableCar f75393a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CarConfirmation(InsurableCar.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CarConfirmation[i];
            }
        }

        public CarConfirmation(InsurableCar car) {
            Intrinsics.checkNotNullParameter(car, "car");
            this.f75393a = car;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CarConfirmation) && Intrinsics.f(this.f75393a, ((CarConfirmation) obj2).f75393a);
        }

        public final int hashCode() {
            return this.f75393a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75393a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step$CarManualQuestions;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CarManualQuestions extends CarSelectFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CarManualQuestions f75395a = new CarManualQuestions();

        @NotNull
        public static final Parcelable.Creator<CarManualQuestions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CarManualQuestions.f75395a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CarManualQuestions[i];
            }
        }

        private CarManualQuestions() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step$CarNctQuestions;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CarNctQuestions extends CarSelectFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CarNctQuestions f75396a = new CarNctQuestions();

        @NotNull
        public static final Parcelable.Creator<CarNctQuestions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CarNctQuestions.f75396a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CarNctQuestions[i];
            }
        }

        private CarNctQuestions() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step$CarSearch;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CarSearch extends CarSelectFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CarSearch f75397a = new CarSearch();

        @NotNull
        public static final Parcelable.Creator<CarSearch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CarSearch.f75397a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CarSearch[i];
            }
        }

        private CarSearch() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private CarSelectFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step$CarManualInput;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CarManualInput extends CarSelectFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CarManualInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75394a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CarManualInput(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CarManualInput[i];
            }
        }

        public CarManualInput(String str) {
            this.f75394a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CarManualInput) && Intrinsics.f(this.f75394a, ((CarManualInput) obj2).f75394a);
        }

        public final int hashCode() {
            String str = this.f75394a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75394a);
        }

        public CarManualInput() {
            this(null);
        }
    }
}
