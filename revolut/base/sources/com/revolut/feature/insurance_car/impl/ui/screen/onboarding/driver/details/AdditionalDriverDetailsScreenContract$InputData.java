package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/onboarding/driver/details/AdditionalDriverDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalDriverDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AdditionalDriverDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdditionalDriver f75574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75575b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdditionalDriverDetailsScreenContract$InputData(parcel.readInt() == 0 ? null : AdditionalDriver.CREATOR.createFromParcel(parcel), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalDriverDetailsScreenContract$InputData[i];
        }
    }

    public AdditionalDriverDetailsScreenContract$InputData(AdditionalDriver additionalDriver, int i) {
        this.f75574a = additionalDriver;
        this.f75575b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalDriverDetailsScreenContract$InputData)) {
            return false;
        }
        AdditionalDriverDetailsScreenContract$InputData additionalDriverDetailsScreenContract$InputData = (AdditionalDriverDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75574a, additionalDriverDetailsScreenContract$InputData.f75574a) && this.f75575b == additionalDriverDetailsScreenContract$InputData.f75575b;
    }

    public final int hashCode() {
        AdditionalDriver additionalDriver = this.f75574a;
        return Integer.hashCode(this.f75575b) + ((additionalDriver == null ? 0 : additionalDriver.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AdditionalDriver additionalDriver = this.f75574a;
        if (additionalDriver == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalDriver.writeToParcel(dest, i);
        }
        dest.writeInt(this.f75575b);
    }
}
