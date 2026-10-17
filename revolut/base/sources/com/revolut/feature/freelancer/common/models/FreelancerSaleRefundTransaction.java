package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerSaleRefundTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerSaleRefundTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerSaleRefundTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f73330b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerSaleRefundTransaction((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerSaleRefundTransaction[i];
        }
    }

    public FreelancerSaleRefundTransaction(d money, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f73329a = id10;
        this.f73330b = money;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerSaleRefundTransaction)) {
            return false;
        }
        FreelancerSaleRefundTransaction freelancerSaleRefundTransaction = (FreelancerSaleRefundTransaction) obj2;
        return Intrinsics.f(this.f73329a, freelancerSaleRefundTransaction.f73329a) && Intrinsics.f(this.f73330b, freelancerSaleRefundTransaction.f73330b);
    }

    public final int hashCode() {
        return this.f73330b.hashCode() + (this.f73329a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73329a);
        dest.writeSerializable(this.f73330b);
    }
}
