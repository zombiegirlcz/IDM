package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import kl7.m1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/Policy;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Policy implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Policy> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InsurableCar f75287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1 f75288c;
    public final String d;
    public final String e;
    public final ZonedDateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZonedDateTime f75289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f75290h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CancellationDetails f75291j;
    public final FailedPaymentDetails k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RenewalDetails f75292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PaymentAmount f75293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f75294n;
    public final boolean o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Policy(parcel.readString(), InsurableCar.CREATOR.createFromParcel(parcel), m1.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (ZonedDateTime) parcel.readSerializable(), (ZonedDateTime) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : CancellationDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FailedPaymentDetails.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RenewalDetails.CREATOR.createFromParcel(parcel) : null, PaymentAmount.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Policy[i];
        }
    }

    public Policy(String id10, InsurableCar car, m1 status, String str, String policyNumber, ZonedDateTime startDateTime, ZonedDateTime endDateTime, LocalDate localDate, LocalDate renewalDate, CancellationDetails cancellationDetails, FailedPaymentDetails failedPaymentDetails, RenewalDetails renewalDetails, PaymentAmount payment, int i, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(car, "car");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(policyNumber, "policyNumber");
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        Intrinsics.checkNotNullParameter(endDateTime, "endDateTime");
        Intrinsics.checkNotNullParameter(renewalDate, "renewalDate");
        Intrinsics.checkNotNullParameter(payment, "payment");
        this.f75286a = id10;
        this.f75287b = car;
        this.f75288c = status;
        this.d = str;
        this.e = policyNumber;
        this.f = startDateTime;
        this.f75289g = endDateTime;
        this.f75290h = localDate;
        this.i = renewalDate;
        this.f75291j = cancellationDetails;
        this.k = failedPaymentDetails;
        this.f75292l = renewalDetails;
        this.f75293m = payment;
        this.f75294n = i;
        this.o = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Policy)) {
            return false;
        }
        Policy policy = (Policy) obj2;
        return Intrinsics.f(this.f75286a, policy.f75286a) && Intrinsics.f(this.f75287b, policy.f75287b) && this.f75288c == policy.f75288c && Intrinsics.f(this.d, policy.d) && Intrinsics.f(this.e, policy.e) && Intrinsics.f(this.f, policy.f) && Intrinsics.f(this.f75289g, policy.f75289g) && Intrinsics.f(this.f75290h, policy.f75290h) && Intrinsics.f(this.i, policy.i) && Intrinsics.f(this.f75291j, policy.f75291j) && Intrinsics.f(this.k, policy.k) && Intrinsics.f(this.f75292l, policy.f75292l) && Intrinsics.f(this.f75293m, policy.f75293m) && this.f75294n == policy.f75294n && this.o == policy.o;
    }

    public final int hashCode() {
        int iHashCode = (this.f75288c.hashCode() + ((this.f75287b.hashCode() + (this.f75286a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iH = l.h(this.f75289g, l.h(this.f, p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31), 31);
        LocalDate localDate = this.f75290h;
        int iA = y.a((iH + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.i);
        CancellationDetails cancellationDetails = this.f75291j;
        int iHashCode2 = (iA + (cancellationDetails == null ? 0 : cancellationDetails.hashCode())) * 31;
        FailedPaymentDetails failedPaymentDetails = this.k;
        int iHashCode3 = (iHashCode2 + (failedPaymentDetails == null ? 0 : failedPaymentDetails.hashCode())) * 31;
        RenewalDetails renewalDetails = this.f75292l;
        return Boolean.hashCode(this.o) + j6.a.b(this.f75294n, (this.f75293m.hashCode() + ((iHashCode3 + (renewalDetails != null ? renewalDetails.hashCode() : 0)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75286a);
        this.f75287b.writeToParcel(dest, i);
        dest.writeString(this.f75288c.name());
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f75289g);
        dest.writeSerializable(this.f75290h);
        dest.writeSerializable(this.i);
        CancellationDetails cancellationDetails = this.f75291j;
        if (cancellationDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cancellationDetails.writeToParcel(dest, i);
        }
        FailedPaymentDetails failedPaymentDetails = this.k;
        if (failedPaymentDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            failedPaymentDetails.writeToParcel(dest, i);
        }
        RenewalDetails renewalDetails = this.f75292l;
        if (renewalDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            renewalDetails.writeToParcel(dest, i);
        }
        this.f75293m.writeToParcel(dest, i);
        dest.writeInt(this.f75294n);
        dest.writeInt(this.o ? 1 : 0);
    }
}
