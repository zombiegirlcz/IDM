package com.revolut.feature.insurance_car.impl.ui.screen.policy.telematic_device.activate;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/policy/telematic_device/activate/ActivateTelematicsDeviceScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActivateTelematicsDeviceScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ActivateTelematicsDeviceScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f75675a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActivateTelematicsDeviceScreenContract$InputData((LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActivateTelematicsDeviceScreenContract$InputData[i];
        }
    }

    public ActivateTelematicsDeviceScreenContract$InputData(LocalDate localDate) {
        this.f75675a = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ActivateTelematicsDeviceScreenContract$InputData) && Intrinsics.f(this.f75675a, ((ActivateTelematicsDeviceScreenContract$InputData) obj2).f75675a);
    }

    public final int hashCode() {
        LocalDate localDate = this.f75675a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f75675a);
    }

    public ActivateTelematicsDeviceScreenContract$InputData() {
        this(null);
    }
}
