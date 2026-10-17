package com.revolut.feature.freelancer.common.models.invoices;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sr6.i;
import sr6.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/invoices/InvoiceMethodsDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvoiceMethodsDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvoiceMethodsDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f73440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f73441b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvoiceMethodsDetails(i.valueOf(parcel.readString()), o.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvoiceMethodsDetails[i];
        }
    }

    public InvoiceMethodsDetails(i paymentMethod, o status) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f73440a = paymentMethod;
        this.f73441b = status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvoiceMethodsDetails)) {
            return false;
        }
        InvoiceMethodsDetails invoiceMethodsDetails = (InvoiceMethodsDetails) obj2;
        return this.f73440a == invoiceMethodsDetails.f73440a && this.f73441b == invoiceMethodsDetails.f73441b;
    }

    public final int hashCode() {
        return this.f73441b.hashCode() + (this.f73440a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73440a.name());
        dest.writeString(this.f73441b.name());
    }
}
