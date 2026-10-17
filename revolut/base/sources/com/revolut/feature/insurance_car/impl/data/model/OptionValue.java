package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/OptionValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OptionValue implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OptionValue> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f75270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75271c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            String string2 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new OptionValue(string, dVar, string2, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OptionValue[i];
        }
    }

    public OptionValue(String id10, d price, String str, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f75269a = id10;
        this.f75270b = price;
        this.f75271c = str;
        this.d = z;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OptionValue)) {
            return false;
        }
        OptionValue optionValue = (OptionValue) obj2;
        return Intrinsics.f(this.f75269a, optionValue.f75269a) && Intrinsics.f(this.f75270b, optionValue.f75270b) && Intrinsics.f(this.f75271c, optionValue.f75271c) && this.d == optionValue.d && this.e == optionValue.e;
    }

    public final int hashCode() {
        int iC = v7.c(this.f75269a.hashCode() * 31, 31, this.f75270b);
        String str = this.f75271c;
        return Boolean.hashCode(this.e) + j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75269a);
        dest.writeSerializable(this.f75270b);
        dest.writeString(this.f75271c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}
