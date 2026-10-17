package com.revolut.feature.freelancer.common.models.orders;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import sr6.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/orders/FreelancerOrderInvoiceDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOrderInvoiceDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerOrderInvoiceDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f73451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73452c;
    public final DateTime d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f73453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DateTime f73454h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerOrderInvoiceDetails(parcel.readString(), n.valueOf(parcel.readString()), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOrderInvoiceDetails[i];
        }
    }

    public FreelancerOrderInvoiceDetails(String id10, n status, String numberFormatted, DateTime dueDate, DateTime dateTime, DateTime dateTime2, DateTime createdDate, DateTime updatedDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(numberFormatted, "numberFormatted");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        this.f73450a = id10;
        this.f73451b = status;
        this.f73452c = numberFormatted;
        this.d = dueDate;
        this.e = dateTime;
        this.f = dateTime2;
        this.f73453g = createdDate;
        this.f73454h = updatedDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerOrderInvoiceDetails)) {
            return false;
        }
        FreelancerOrderInvoiceDetails freelancerOrderInvoiceDetails = (FreelancerOrderInvoiceDetails) obj2;
        return Intrinsics.f(this.f73450a, freelancerOrderInvoiceDetails.f73450a) && this.f73451b == freelancerOrderInvoiceDetails.f73451b && Intrinsics.f(this.f73452c, freelancerOrderInvoiceDetails.f73452c) && Intrinsics.f(this.d, freelancerOrderInvoiceDetails.d) && Intrinsics.f(this.e, freelancerOrderInvoiceDetails.e) && Intrinsics.f(this.f, freelancerOrderInvoiceDetails.f) && Intrinsics.f(this.f73453g, freelancerOrderInvoiceDetails.f73453g) && Intrinsics.f(this.f73454h, freelancerOrderInvoiceDetails.f73454h);
    }

    public final int hashCode() {
        int iF = b.f(this.d, p.a.c((this.f73451b.hashCode() + (this.f73450a.hashCode() * 31)) * 31, 31, this.f73452c), 31);
        DateTime dateTime = this.e;
        int iHashCode = (iF + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f;
        return this.f73454h.hashCode() + b.f(this.f73453g, (iHashCode + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73450a);
        dest.writeString(this.f73451b.name());
        dest.writeString(this.f73452c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f73453g);
        dest.writeSerializable(this.f73454h);
    }
}
