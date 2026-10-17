package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/FreelancerInvoiceStatusDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerInvoiceStatusDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerInvoiceStatusDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f73412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f73413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f73414c;
    public final DateTime d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerInvoiceStatusDetails((DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerInvoiceStatusDetails[i];
        }
    }

    public FreelancerInvoiceStatusDetails(DateTime createdDate, DateTime updatedDate, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        this.f73412a = createdDate;
        this.f73413b = updatedDate;
        this.f73414c = dateTime;
        this.d = dateTime2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerInvoiceStatusDetails)) {
            return false;
        }
        FreelancerInvoiceStatusDetails freelancerInvoiceStatusDetails = (FreelancerInvoiceStatusDetails) obj2;
        return Intrinsics.f(this.f73412a, freelancerInvoiceStatusDetails.f73412a) && Intrinsics.f(this.f73413b, freelancerInvoiceStatusDetails.f73413b) && Intrinsics.f(this.f73414c, freelancerInvoiceStatusDetails.f73414c) && Intrinsics.f(this.d, freelancerInvoiceStatusDetails.d);
    }

    public final int hashCode() {
        int iF = b.f(this.f73413b, this.f73412a.hashCode() * 31, 31);
        DateTime dateTime = this.f73414c;
        int iHashCode = (iF + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.d;
        return iHashCode + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f73412a);
        dest.writeSerializable(this.f73413b);
        dest.writeSerializable(this.f73414c);
        dest.writeSerializable(this.d);
    }
}
