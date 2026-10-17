package com.revolut.feature.apm.bills.bpay.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/bpay/impl/model/BPayPaymentData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_bpay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BPayPaymentData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BPayPaymentData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BPayBillerData f61212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f61213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f61214c;
    public final LocalDate d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BPayPaymentData(BPayBillerData.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BPayPaymentData[i];
        }
    }

    public BPayPaymentData(BPayBillerData billerData, d amount, d totalAmount, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(billerData, "billerData");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f61212a = billerData;
        this.f61213b = amount;
        this.f61214c = totalAmount;
        this.d = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BPayPaymentData)) {
            return false;
        }
        BPayPaymentData bPayPaymentData = (BPayPaymentData) obj2;
        return Intrinsics.f(this.f61212a, bPayPaymentData.f61212a) && Intrinsics.f(this.f61213b, bPayPaymentData.f61213b) && Intrinsics.f(this.f61214c, bPayPaymentData.f61214c) && Intrinsics.f(this.d, bPayPaymentData.d);
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(this.f61212a.hashCode() * 31, 31, this.f61213b), 31, this.f61214c);
        LocalDate localDate = this.d;
        return iC + (localDate == null ? 0 : localDate.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f61212a.writeToParcel(dest, i);
        dest.writeSerializable(this.f61213b);
        dest.writeSerializable(this.f61214c);
        dest.writeSerializable(this.d);
    }
}
