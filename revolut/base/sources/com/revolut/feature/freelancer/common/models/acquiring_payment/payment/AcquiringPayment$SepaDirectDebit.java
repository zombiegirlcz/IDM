package com.revolut.feature.freelancer.common.models.acquiring_payment.payment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/freelancer/common/models/acquiring_payment/payment/AcquiringPayment$SepaDirectDebit", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AcquiringPayment$SepaDirectDebit implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73364a;

    @NotNull
    public static final Parcelable.Creator<AcquiringPayment$SepaDirectDebit> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AcquiringPayment$SepaDirectDebit(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AcquiringPayment$SepaDirectDebit[i];
        }
    }

    public AcquiringPayment$SepaDirectDebit(String lastFour) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        this.f73364a = lastFour;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AcquiringPayment$SepaDirectDebit) && Intrinsics.f(this.f73364a, ((AcquiringPayment$SepaDirectDebit) obj2).f73364a);
    }

    public final int hashCode() {
        return this.f73364a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73364a);
    }
}
