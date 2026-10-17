package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerInvoiceTaxRate;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerInvoiceTaxRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerInvoiceTaxRate> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f73420c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerInvoiceTaxRate(parcel.readDouble(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerInvoiceTaxRate[i];
        }
    }

    public FreelancerInvoiceTaxRate(double d, String id10, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f73418a = id10;
        this.f73419b = name;
        this.f73420c = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerInvoiceTaxRate)) {
            return false;
        }
        FreelancerInvoiceTaxRate freelancerInvoiceTaxRate = (FreelancerInvoiceTaxRate) obj2;
        return Intrinsics.f(this.f73418a, freelancerInvoiceTaxRate.f73418a) && Intrinsics.f(this.f73419b, freelancerInvoiceTaxRate.f73419b) && Double.compare(this.f73420c, freelancerInvoiceTaxRate.f73420c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f73420c) + p.a.c(this.f73418a.hashCode() * 31, 31, this.f73419b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73418a);
        dest.writeString(this.f73419b);
        dest.writeDouble(this.f73420c);
    }
}
