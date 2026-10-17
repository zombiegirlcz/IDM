package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kl7.b1;
import kl7.c1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/OneTimePayment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "kl7/c1", "kl7/b1", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OneTimePayment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OneTimePayment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f75266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f75267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f75268c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneTimePayment(c1.valueOf(parcel.readString()), b1.valueOf(parcel.readString()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OneTimePayment[i];
        }
    }

    public OneTimePayment(c1 type, b1 direction, d price) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f75266a = type;
        this.f75267b = direction;
        this.f75268c = price;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OneTimePayment)) {
            return false;
        }
        OneTimePayment oneTimePayment = (OneTimePayment) obj2;
        return this.f75266a == oneTimePayment.f75266a && this.f75267b == oneTimePayment.f75267b && Intrinsics.f(this.f75268c, oneTimePayment.f75268c);
    }

    public final int hashCode() {
        return this.f75268c.hashCode() + ((this.f75267b.hashCode() + (this.f75266a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75266a.name());
        dest.writeString(this.f75267b.name());
        dest.writeSerializable(this.f75268c);
    }
}
