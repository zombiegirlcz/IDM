package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.estimated_value;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kl7.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/estimated_value/EstimatedCarValuePickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EstimatedCarValuePickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EstimatedCarValuePickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f75554a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EstimatedCarValuePickerScreenContract$InputData(parcel.readInt() == 0 ? null : o0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EstimatedCarValuePickerScreenContract$InputData[i];
        }
    }

    public EstimatedCarValuePickerScreenContract$InputData(o0 o0Var) {
        this.f75554a = o0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EstimatedCarValuePickerScreenContract$InputData) && this.f75554a == ((EstimatedCarValuePickerScreenContract$InputData) obj2).f75554a;
    }

    public final int hashCode() {
        o0 o0Var = this.f75554a;
        if (o0Var == null) {
            return 0;
        }
        return o0Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        o0 o0Var = this.f75554a;
        if (o0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(o0Var.name());
        }
    }
}
