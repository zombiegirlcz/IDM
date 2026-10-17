package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/FailedPaymentDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FailedPaymentDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FailedPaymentDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f75216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f75217b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FailedPaymentDetails((d) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FailedPaymentDetails[i];
        }
    }

    public FailedPaymentDetails(d payment, LocalDate cancellationDate) {
        Intrinsics.checkNotNullParameter(cancellationDate, "cancellationDate");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f75216a = cancellationDate;
        this.f75217b = payment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FailedPaymentDetails)) {
            return false;
        }
        FailedPaymentDetails failedPaymentDetails = (FailedPaymentDetails) obj2;
        return Intrinsics.f(this.f75216a, failedPaymentDetails.f75216a) && Intrinsics.f(this.f75217b, failedPaymentDetails.f75217b);
    }

    public final int hashCode() {
        return this.f75217b.hashCode() + (this.f75216a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f75216a);
        dest.writeSerializable(this.f75217b);
    }
}
