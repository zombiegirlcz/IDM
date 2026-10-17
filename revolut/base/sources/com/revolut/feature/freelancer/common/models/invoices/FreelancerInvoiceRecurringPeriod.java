package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sr6.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerInvoiceRecurringPeriod;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "sr6/l", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerInvoiceRecurringPeriod implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f73401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73402b;

    @NotNull
    public static final Parcelable.Creator<FreelancerInvoiceRecurringPeriod> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerInvoiceRecurringPeriod(l.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerInvoiceRecurringPeriod[i];
        }
    }

    public FreelancerInvoiceRecurringPeriod(l period, int i) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f73401a = period;
        this.f73402b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerInvoiceRecurringPeriod)) {
            return false;
        }
        FreelancerInvoiceRecurringPeriod freelancerInvoiceRecurringPeriod = (FreelancerInvoiceRecurringPeriod) obj2;
        return this.f73401a == freelancerInvoiceRecurringPeriod.f73401a && this.f73402b == freelancerInvoiceRecurringPeriod.f73402b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f73402b) + (this.f73401a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73401a.name());
        dest.writeInt(this.f73402b);
    }
}
