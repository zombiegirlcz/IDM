package com.revolut.feature.freelancer.common.models.acquiring_payment.payment;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pr6.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_payment/payment/AcquiringPaymentFee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "pr6/h", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AcquiringPaymentFee implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f73365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f73366b;

    @NotNull
    public static final Parcelable.Creator<AcquiringPaymentFee> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AcquiringPaymentFee((d) parcel.readSerializable(), h.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AcquiringPaymentFee[i];
        }
    }

    public AcquiringPaymentFee(d money, h type) {
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f73365a = money;
        this.f73366b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AcquiringPaymentFee)) {
            return false;
        }
        AcquiringPaymentFee acquiringPaymentFee = (AcquiringPaymentFee) obj2;
        return Intrinsics.f(this.f73365a, acquiringPaymentFee.f73365a) && this.f73366b == acquiringPaymentFee.f73366b;
    }

    public final int hashCode() {
        return this.f73366b.hashCode() + (this.f73365a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f73365a);
        dest.writeString(this.f73366b.name());
    }
}
