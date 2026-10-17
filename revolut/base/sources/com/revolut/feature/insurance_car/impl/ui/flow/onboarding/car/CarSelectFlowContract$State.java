package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input.CarManualInputScreenContract$ManualCarInfo;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/onboarding/car/CarSelectFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CarSelectFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CarSelectFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CarManualInputScreenContract$ManualCarInfo f75391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InsurableCar f75392b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CarSelectFlowContract$State(parcel.readInt() == 0 ? null : CarManualInputScreenContract$ManualCarInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InsurableCar.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CarSelectFlowContract$State[i];
        }
    }

    public CarSelectFlowContract$State(CarManualInputScreenContract$ManualCarInfo carManualInputScreenContract$ManualCarInfo, InsurableCar insurableCar) {
        this.f75391a = carManualInputScreenContract$ManualCarInfo;
        this.f75392b = insurableCar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CarSelectFlowContract$State)) {
            return false;
        }
        CarSelectFlowContract$State carSelectFlowContract$State = (CarSelectFlowContract$State) obj2;
        return Intrinsics.f(this.f75391a, carSelectFlowContract$State.f75391a) && Intrinsics.f(this.f75392b, carSelectFlowContract$State.f75392b);
    }

    public final int hashCode() {
        CarManualInputScreenContract$ManualCarInfo carManualInputScreenContract$ManualCarInfo = this.f75391a;
        int iHashCode = (carManualInputScreenContract$ManualCarInfo == null ? 0 : carManualInputScreenContract$ManualCarInfo.hashCode()) * 31;
        InsurableCar insurableCar = this.f75392b;
        return iHashCode + (insurableCar != null ? insurableCar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CarManualInputScreenContract$ManualCarInfo carManualInputScreenContract$ManualCarInfo = this.f75391a;
        if (carManualInputScreenContract$ManualCarInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            carManualInputScreenContract$ManualCarInfo.writeToParcel(dest, i);
        }
        InsurableCar insurableCar = this.f75392b;
        if (insurableCar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            insurableCar.writeToParcel(dest, i);
        }
    }

    public CarSelectFlowContract$State() {
        this(null, null);
    }
}
