package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.manual_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import kl7.m2;
import kl7.o0;
import kl7.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/onboarding/car/manual_input/CarManualInputScreenContract$ManualCarInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CarManualInputScreenContract$ManualCarInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CarManualInputScreenContract$ManualCarInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f75559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75560c;
    public final String d;
    public final s0 e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m2 f75561g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CarVariation f75562h;
    public final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f75563j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CarManualInputScreenContract$ManualCarInfo(parcel.readString(), (b) parcel.readSerializable(), parcel.readString(), parcel.readString(), s0.valueOf(parcel.readString()), parcel.readInt(), m2.valueOf(parcel.readString()), CarVariation.CREATOR.createFromParcel(parcel), o0.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CarManualInputScreenContract$ManualCarInfo[i];
        }
    }

    public CarManualInputScreenContract$ManualCarInfo(String str, b countryCode, String make, String model, s0 fuelType, int i, m2 transmission, CarVariation variation, o0 estimatedValue, int i2) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(fuelType, "fuelType");
        Intrinsics.checkNotNullParameter(transmission, "transmission");
        Intrinsics.checkNotNullParameter(variation, "variation");
        Intrinsics.checkNotNullParameter(estimatedValue, "estimatedValue");
        this.f75558a = str;
        this.f75559b = countryCode;
        this.f75560c = make;
        this.d = model;
        this.e = fuelType;
        this.f = i;
        this.f75561g = transmission;
        this.f75562h = variation;
        this.i = estimatedValue;
        this.f75563j = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CarManualInputScreenContract$ManualCarInfo)) {
            return false;
        }
        CarManualInputScreenContract$ManualCarInfo carManualInputScreenContract$ManualCarInfo = (CarManualInputScreenContract$ManualCarInfo) obj2;
        return Intrinsics.f(this.f75558a, carManualInputScreenContract$ManualCarInfo.f75558a) && Intrinsics.f(this.f75559b, carManualInputScreenContract$ManualCarInfo.f75559b) && Intrinsics.f(this.f75560c, carManualInputScreenContract$ManualCarInfo.f75560c) && Intrinsics.f(this.d, carManualInputScreenContract$ManualCarInfo.d) && this.e == carManualInputScreenContract$ManualCarInfo.e && this.f == carManualInputScreenContract$ManualCarInfo.f && this.f75561g == carManualInputScreenContract$ManualCarInfo.f75561g && Intrinsics.f(this.f75562h, carManualInputScreenContract$ManualCarInfo.f75562h) && this.i == carManualInputScreenContract$ManualCarInfo.i && this.f75563j == carManualInputScreenContract$ManualCarInfo.f75563j;
    }

    public final int hashCode() {
        String str = this.f75558a;
        return Integer.hashCode(this.f75563j) + ((this.i.hashCode() + ((this.f75562h.hashCode() + ((this.f75561g.hashCode() + j6.a.b(this.f, (this.e.hashCode() + p.a.c(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f75559b.f297794a), 31, this.f75560c), 31, this.d)) * 31, 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75558a);
        dest.writeSerializable(this.f75559b);
        dest.writeString(this.f75560c);
        dest.writeString(this.d);
        dest.writeString(this.e.name());
        dest.writeInt(this.f);
        dest.writeString(this.f75561g.name());
        this.f75562h.writeToParcel(dest, i);
        dest.writeString(this.i.name());
        dest.writeInt(this.f75563j);
    }
}
