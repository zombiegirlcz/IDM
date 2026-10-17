package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/search/CarSearchScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CarSearchScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CarSearchScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75567b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CarSearchScreenContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CarSearchScreenContract$InputData[i];
        }
    }

    public CarSearchScreenContract$InputData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CarSearchScreenContract$InputData)) {
            return false;
        }
        CarSearchScreenContract$InputData carSearchScreenContract$InputData = (CarSearchScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75566a, carSearchScreenContract$InputData.f75566a) && this.f75567b == carSearchScreenContract$InputData.f75567b;
    }

    public final int hashCode() {
        String str = this.f75566a;
        return Boolean.hashCode(this.f75567b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75566a);
        dest.writeInt(this.f75567b ? 1 : 0);
    }

    public CarSearchScreenContract$InputData(String str, boolean z) {
        this.f75566a = str;
        this.f75567b = z;
    }

    public /* synthetic */ CarSearchScreenContract$InputData(int i) {
        this(null, false);
    }
}
