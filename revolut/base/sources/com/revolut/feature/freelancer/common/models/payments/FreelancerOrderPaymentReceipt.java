package com.revolut.feature.freelancer.common.models.payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderPayment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/payments/FreelancerOrderPaymentReceipt;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOrderPaymentReceipt implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AcquiringOrderPayment f73459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerPaymentReceipt f73460b;

    @NotNull
    public static final Parcelable.Creator<FreelancerOrderPaymentReceipt> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerOrderPaymentReceipt(AcquiringOrderPayment.CREATOR.createFromParcel(parcel), FreelancerPaymentReceipt.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOrderPaymentReceipt[i];
        }
    }

    public FreelancerOrderPaymentReceipt(AcquiringOrderPayment payment, FreelancerPaymentReceipt receipt) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        this.f73459a = payment;
        this.f73460b = receipt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerOrderPaymentReceipt)) {
            return false;
        }
        FreelancerOrderPaymentReceipt freelancerOrderPaymentReceipt = (FreelancerOrderPaymentReceipt) obj2;
        return Intrinsics.f(this.f73459a, freelancerOrderPaymentReceipt.f73459a) && Intrinsics.f(this.f73460b, freelancerOrderPaymentReceipt.f73460b);
    }

    public final int hashCode() {
        return this.f73460b.hashCode() + (this.f73459a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f73459a.writeToParcel(dest, i);
        this.f73460b.writeToParcel(dest, i);
    }
}
