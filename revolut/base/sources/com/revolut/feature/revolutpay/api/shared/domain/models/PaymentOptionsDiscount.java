package com.revolut.feature.revolutpay.api.shared.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.revpoints.RevPoints;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/PaymentOptionsDiscount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentOptionsDiscount implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentOptionsDiscount> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f84332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84333b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentOptionsDiscount((d) parcel.readSerializable(), RevPoints.CREATOR.createFromParcel(parcel).f84427a);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentOptionsDiscount[i];
        }
    }

    public PaymentOptionsDiscount(d payAmount, long j2) {
        Intrinsics.checkNotNullParameter(payAmount, "payAmount");
        this.f84332a = payAmount;
        this.f84333b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentOptionsDiscount)) {
            return false;
        }
        PaymentOptionsDiscount paymentOptionsDiscount = (PaymentOptionsDiscount) obj2;
        return Intrinsics.f(this.f84332a, paymentOptionsDiscount.f84332a) && RevPoints.a(this.f84333b, paymentOptionsDiscount.f84333b);
    }

    public final int hashCode() {
        return Long.hashCode(this.f84333b) + (this.f84332a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f84332a);
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f84333b);
    }
}
