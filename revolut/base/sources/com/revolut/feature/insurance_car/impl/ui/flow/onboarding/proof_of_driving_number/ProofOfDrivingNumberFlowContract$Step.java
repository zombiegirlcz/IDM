package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.proof_of_driving_number;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/onboarding/proof_of_driving_number/ProofOfDrivingNumberFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Prompt", "DrivingNumberInput", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/proof_of_driving_number/ProofOfDrivingNumberFlowContract$Step$DrivingNumberInput;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/proof_of_driving_number/ProofOfDrivingNumberFlowContract$Step$Prompt;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProofOfDrivingNumberFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/proof_of_driving_number/ProofOfDrivingNumberFlowContract$Step$DrivingNumberInput;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/proof_of_driving_number/ProofOfDrivingNumberFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DrivingNumberInput extends ProofOfDrivingNumberFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DrivingNumberInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75438a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DrivingNumberInput(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DrivingNumberInput[i];
            }
        }

        public DrivingNumberInput(String applicationFormId) {
            Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
            this.f75438a = applicationFormId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DrivingNumberInput) && Intrinsics.f(this.f75438a, ((DrivingNumberInput) obj2).f75438a);
        }

        public final int hashCode() {
            return this.f75438a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75438a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/proof_of_driving_number/ProofOfDrivingNumberFlowContract$Step$Prompt;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/proof_of_driving_number/ProofOfDrivingNumberFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Prompt extends ProofOfDrivingNumberFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Prompt f75439a = new Prompt();

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Prompt.f75439a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        private Prompt() {
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

    private ProofOfDrivingNumberFlowContract$Step() {
    }
}
