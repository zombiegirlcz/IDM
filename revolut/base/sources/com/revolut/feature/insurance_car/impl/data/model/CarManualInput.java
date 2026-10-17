package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/CarManualInput;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CarManualInput implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CarManualInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f75188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f75189c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f75190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f75191h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            boolean z11 = false;
            boolean z12 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z12 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z6 = z;
            }
            return new CarManualInput(string, bVar, i, z11, z12, z3, z4, z6);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CarManualInput[i];
        }
    }

    public CarManualInput(String abiCode, b registrationCountryCode, int i, boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        Intrinsics.checkNotNullParameter(abiCode, "abiCode");
        Intrinsics.checkNotNullParameter(registrationCountryCode, "registrationCountryCode");
        this.f75187a = abiCode;
        this.f75188b = registrationCountryCode;
        this.f75189c = i;
        this.d = z;
        this.e = z3;
        this.f = z4;
        this.f75190g = z6;
        this.f75191h = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CarManualInput)) {
            return false;
        }
        CarManualInput carManualInput = (CarManualInput) obj2;
        return Intrinsics.f(this.f75187a, carManualInput.f75187a) && Intrinsics.f(this.f75188b, carManualInput.f75188b) && this.f75189c == carManualInput.f75189c && this.d == carManualInput.d && this.e == carManualInput.e && this.f == carManualInput.f && this.f75190g == carManualInput.f75190g && this.f75191h == carManualInput.f75191h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75191h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.f75189c, p.a.c(this.f75187a.hashCode() * 31, 31, this.f75188b.f297794a), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.f75190g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75187a);
        dest.writeSerializable(this.f75188b);
        dest.writeInt(this.f75189c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f75190g ? 1 : 0);
        dest.writeInt(this.f75191h ? 1 : 0);
    }
}
