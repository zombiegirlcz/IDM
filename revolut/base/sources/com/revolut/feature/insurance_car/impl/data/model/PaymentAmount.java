package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kl7.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/PaymentAmount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentAmount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentAmount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f75275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f75276b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentAmount(f1.valueOf(parcel.readString()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentAmount[i];
        }
    }

    public PaymentAmount(f1 paymentFrequency, d amount) {
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f75275a = paymentFrequency;
        this.f75276b = amount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentAmount)) {
            return false;
        }
        PaymentAmount paymentAmount = (PaymentAmount) obj2;
        return this.f75275a == paymentAmount.f75275a && Intrinsics.f(this.f75276b, paymentAmount.f75276b);
    }

    public final int hashCode() {
        return this.f75276b.hashCode() + (this.f75275a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75275a.name());
        dest.writeSerializable(this.f75276b);
    }
}
