package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;
import kl7.m2;
import kl7.o0;
import kl7.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/InsurableCar;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsurableCar implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InsurableCar> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75228c;
    public final String d;
    public final int e;
    public final s0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m2 f75229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f75230h;
    public final Boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Boolean f75231j;
    public final CarManualInput k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f75232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o0 f75233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ZonedDateTime f75234n;
    public final ZonedDateTime o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            s0 s0VarValueOf = parcel.readInt() == 0 ? null : s0.valueOf(parcel.readString());
            m2 m2VarValueOf = parcel.readInt() == 0 ? null : m2.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            CarManualInput carManualInputCreateFromParcel = parcel.readInt() == 0 ? null : CarManualInput.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new InsurableCar(string, string2, string3, string4, i, s0VarValueOf, m2VarValueOf, numValueOf, boolValueOf, boolValueOf2, carManualInputCreateFromParcel, boolValueOf3, parcel.readInt() != 0 ? o0.valueOf(parcel.readString()) : null, (ZonedDateTime) parcel.readSerializable(), (ZonedDateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsurableCar[i];
        }
    }

    public InsurableCar(String str, String str2, String make, String model, int i, s0 s0Var, m2 m2Var, Integer num, Boolean bool, Boolean bool2, CarManualInput carManualInput, Boolean bool3, o0 o0Var, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f75226a = str;
        this.f75227b = str2;
        this.f75228c = make;
        this.d = model;
        this.e = i;
        this.f = s0Var;
        this.f75229g = m2Var;
        this.f75230h = num;
        this.i = bool;
        this.f75231j = bool2;
        this.k = carManualInput;
        this.f75232l = bool3;
        this.f75233m = o0Var;
        this.f75234n = zonedDateTime;
        this.o = zonedDateTime2;
    }

    public static InsurableCar a(InsurableCar insurableCar, Boolean bool, Boolean bool2, o0 o0Var, int i) {
        String str = insurableCar.f75226a;
        String str2 = insurableCar.f75227b;
        String make = insurableCar.f75228c;
        String model = insurableCar.d;
        int i2 = insurableCar.e;
        s0 s0Var = insurableCar.f;
        m2 m2Var = insurableCar.f75229g;
        Integer num = insurableCar.f75230h;
        Boolean bool3 = (i & 256) != 0 ? insurableCar.i : bool;
        Boolean bool4 = (i & 512) != 0 ? insurableCar.f75231j : bool2;
        CarManualInput carManualInput = insurableCar.k;
        Boolean bool5 = bool3;
        Boolean bool6 = bool4;
        Boolean bool7 = insurableCar.f75232l;
        o0 o0Var2 = (i & 4096) != 0 ? insurableCar.f75233m : o0Var;
        ZonedDateTime zonedDateTime = insurableCar.f75234n;
        ZonedDateTime zonedDateTime2 = insurableCar.o;
        insurableCar.getClass();
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        return new InsurableCar(str, str2, make, model, i2, s0Var, m2Var, num, bool5, bool6, carManualInput, bool7, o0Var2, zonedDateTime, zonedDateTime2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsurableCar)) {
            return false;
        }
        InsurableCar insurableCar = (InsurableCar) obj2;
        return Intrinsics.f(this.f75226a, insurableCar.f75226a) && Intrinsics.f(this.f75227b, insurableCar.f75227b) && Intrinsics.f(this.f75228c, insurableCar.f75228c) && Intrinsics.f(this.d, insurableCar.d) && this.e == insurableCar.e && this.f == insurableCar.f && this.f75229g == insurableCar.f75229g && Intrinsics.f(this.f75230h, insurableCar.f75230h) && Intrinsics.f(this.i, insurableCar.i) && Intrinsics.f(this.f75231j, insurableCar.f75231j) && Intrinsics.f(this.k, insurableCar.k) && Intrinsics.f(this.f75232l, insurableCar.f75232l) && this.f75233m == insurableCar.f75233m && Intrinsics.f(this.f75234n, insurableCar.f75234n) && Intrinsics.f(this.o, insurableCar.o);
    }

    public final int hashCode() {
        String str = this.f75226a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f75227b;
        int iB = j6.a.b(this.e, p.a.c(p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f75228c), 31, this.d), 31);
        s0 s0Var = this.f;
        int iHashCode2 = (iB + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        m2 m2Var = this.f75229g;
        int iHashCode3 = (iHashCode2 + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        Integer num = this.f75230h;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f75231j;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CarManualInput carManualInput = this.k;
        int iHashCode7 = (iHashCode6 + (carManualInput == null ? 0 : carManualInput.hashCode())) * 31;
        Boolean bool3 = this.f75232l;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        o0 o0Var = this.f75233m;
        int iHashCode9 = (iHashCode8 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.f75234n;
        int iHashCode10 = (iHashCode9 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.o;
        return iHashCode10 + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75226a);
        dest.writeString(this.f75227b);
        dest.writeString(this.f75228c);
        dest.writeString(this.d);
        dest.writeInt(this.e);
        s0 s0Var = this.f;
        if (s0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(s0Var.name());
        }
        m2 m2Var = this.f75229g;
        if (m2Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(m2Var.name());
        }
        Integer num = this.f75230h;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Boolean bool = this.i;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        Boolean bool2 = this.f75231j;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        CarManualInput carManualInput = this.k;
        if (carManualInput == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            carManualInput.writeToParcel(dest, i);
        }
        Boolean bool3 = this.f75232l;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool3);
        }
        o0 o0Var = this.f75233m;
        if (o0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(o0Var.name());
        }
        dest.writeSerializable(this.f75234n);
        dest.writeSerializable(this.o);
    }
}
