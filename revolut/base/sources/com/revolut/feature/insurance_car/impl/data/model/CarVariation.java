package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kl7.c;
import kl7.m2;
import kl7.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/CarVariation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CarVariation implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CarVariation> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75194c;
    public final c d;
    public final Integer e;
    public final Integer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0 f75195g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m2 f75196h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f75197j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CarVariation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), s0.valueOf(parcel.readString()), m2.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CarVariation[i];
        }
    }

    public CarVariation(String id10, String abiCode, String str, c cVar, Integer num, Integer num2, s0 fuelType, m2 transmissionType, int i, Integer num3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(abiCode, "abiCode");
        Intrinsics.checkNotNullParameter(fuelType, "fuelType");
        Intrinsics.checkNotNullParameter(transmissionType, "transmissionType");
        this.f75192a = id10;
        this.f75193b = abiCode;
        this.f75194c = str;
        this.d = cVar;
        this.e = num;
        this.f = num2;
        this.f75195g = fuelType;
        this.f75196h = transmissionType;
        this.i = i;
        this.f75197j = num3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CarVariation)) {
            return false;
        }
        CarVariation carVariation = (CarVariation) obj2;
        return Intrinsics.f(this.f75192a, carVariation.f75192a) && Intrinsics.f(this.f75193b, carVariation.f75193b) && Intrinsics.f(this.f75194c, carVariation.f75194c) && this.d == carVariation.d && Intrinsics.f(this.e, carVariation.e) && Intrinsics.f(this.f, carVariation.f) && this.f75195g == carVariation.f75195g && this.f75196h == carVariation.f75196h && this.i == carVariation.i && Intrinsics.f(this.f75197j, carVariation.f75197j);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f75192a.hashCode() * 31, 31, this.f75193b);
        String str = this.f75194c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.d;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iB = j6.a.b(this.i, (this.f75196h.hashCode() + ((this.f75195g.hashCode() + ((iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31)) * 31, 31);
        Integer num3 = this.f75197j;
        return iB + (num3 != null ? num3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75192a);
        dest.writeString(this.f75193b);
        dest.writeString(this.f75194c);
        c cVar = this.d;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.f;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeString(this.f75195g.name());
        dest.writeString(this.f75196h.name());
        dest.writeInt(this.i);
        Integer num3 = this.f75197j;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num3);
        }
    }
}
