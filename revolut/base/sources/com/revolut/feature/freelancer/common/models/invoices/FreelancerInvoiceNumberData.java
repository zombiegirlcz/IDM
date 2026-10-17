package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerInvoiceNumberData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerInvoiceNumberData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerInvoiceNumberData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73400c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerInvoiceNumberData(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerInvoiceNumberData[i];
        }
    }

    public FreelancerInvoiceNumberData(String number, String str, boolean z) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f73398a = number;
        this.f73399b = str;
        this.f73400c = z;
    }

    public static FreelancerInvoiceNumberData a(FreelancerInvoiceNumberData freelancerInvoiceNumberData, String number, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            number = freelancerInvoiceNumberData.f73398a;
        }
        if ((i & 2) != 0) {
            str = freelancerInvoiceNumberData.f73399b;
        }
        if ((i & 4) != 0) {
            z = freelancerInvoiceNumberData.f73400c;
        }
        freelancerInvoiceNumberData.getClass();
        Intrinsics.checkNotNullParameter(number, "number");
        return new FreelancerInvoiceNumberData(number, str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerInvoiceNumberData)) {
            return false;
        }
        FreelancerInvoiceNumberData freelancerInvoiceNumberData = (FreelancerInvoiceNumberData) obj2;
        return Intrinsics.f(this.f73398a, freelancerInvoiceNumberData.f73398a) && Intrinsics.f(this.f73399b, freelancerInvoiceNumberData.f73399b) && this.f73400c == freelancerInvoiceNumberData.f73400c;
    }

    public final int hashCode() {
        int iHashCode = this.f73398a.hashCode() * 31;
        String str = this.f73399b;
        return Boolean.hashCode(this.f73400c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73398a);
        dest.writeString(this.f73399b);
        dest.writeInt(this.f73400c ? 1 : 0);
    }
}
