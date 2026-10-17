package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.kompot.navigable.flow.FlowState;
import kl7.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/onboarding/main/CarOnboardingFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CarOnboardingFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CarOnboardingFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationForm f75402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f1 f75404c;
    public final Boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ApplicationForm applicationFormCreateFromParcel = ApplicationForm.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            Boolean boolValueOf = null;
            f1 f1VarValueOf = parcel.readInt() == 0 ? null : f1.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CarOnboardingFlowContract$State(applicationFormCreateFromParcel, string, f1VarValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CarOnboardingFlowContract$State[i];
        }
    }

    public CarOnboardingFlowContract$State(ApplicationForm applicationForm, String str, f1 f1Var, Boolean bool) {
        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
        this.f75402a = applicationForm;
        this.f75403b = str;
        this.f75404c = f1Var;
        this.d = bool;
    }

    public static CarOnboardingFlowContract$State a(CarOnboardingFlowContract$State carOnboardingFlowContract$State, ApplicationForm applicationForm, String str, f1 f1Var, Boolean bool, int i) {
        if ((i & 1) != 0) {
            applicationForm = carOnboardingFlowContract$State.f75402a;
        }
        if ((i & 2) != 0) {
            str = carOnboardingFlowContract$State.f75403b;
        }
        if ((i & 4) != 0) {
            f1Var = carOnboardingFlowContract$State.f75404c;
        }
        if ((i & 8) != 0) {
            bool = carOnboardingFlowContract$State.d;
        }
        carOnboardingFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
        return new CarOnboardingFlowContract$State(applicationForm, str, f1Var, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CarOnboardingFlowContract$State)) {
            return false;
        }
        CarOnboardingFlowContract$State carOnboardingFlowContract$State = (CarOnboardingFlowContract$State) obj2;
        return Intrinsics.f(this.f75402a, carOnboardingFlowContract$State.f75402a) && Intrinsics.f(this.f75403b, carOnboardingFlowContract$State.f75403b) && this.f75404c == carOnboardingFlowContract$State.f75404c && Intrinsics.f(this.d, carOnboardingFlowContract$State.d);
    }

    public final int hashCode() {
        int iHashCode = this.f75402a.hashCode() * 31;
        String str = this.f75403b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        f1 f1Var = this.f75404c;
        int iHashCode3 = (iHashCode2 + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f75402a.writeToParcel(dest, i);
        dest.writeString(this.f75403b);
        f1 f1Var = this.f75404c;
        if (f1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(f1Var.name());
        }
        Boolean bool = this.d;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
