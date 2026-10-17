package com.revolut.feature.insurance_car.impl.ui.flow.policy;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/policy/CarPolicyFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CarPolicyFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CarPolicyFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CarPolicyFlowContract$Step f75469b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CarPolicyFlowContract$InputData(parcel.readString(), (CarPolicyFlowContract$Step) parcel.readParcelable(CarPolicyFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CarPolicyFlowContract$InputData[i];
        }
    }

    public CarPolicyFlowContract$InputData(String policyId, CarPolicyFlowContract$Step carPolicyFlowContract$Step) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        this.f75468a = policyId;
        this.f75469b = carPolicyFlowContract$Step;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CarPolicyFlowContract$InputData)) {
            return false;
        }
        CarPolicyFlowContract$InputData carPolicyFlowContract$InputData = (CarPolicyFlowContract$InputData) obj2;
        return Intrinsics.f(this.f75468a, carPolicyFlowContract$InputData.f75468a) && Intrinsics.f(this.f75469b, carPolicyFlowContract$InputData.f75469b);
    }

    public final int hashCode() {
        int iHashCode = this.f75468a.hashCode() * 31;
        CarPolicyFlowContract$Step carPolicyFlowContract$Step = this.f75469b;
        return iHashCode + (carPolicyFlowContract$Step == null ? 0 : carPolicyFlowContract$Step.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75468a);
        dest.writeParcelable(this.f75469b, i);
    }
}
