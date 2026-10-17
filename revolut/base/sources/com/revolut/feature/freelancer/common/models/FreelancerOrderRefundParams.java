package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerOrderRefundParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOrderRefundParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerOrderRefundParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f73310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73311b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(FreelancerSaleRefundTransaction.CREATOR, parcel, arrayList, iA, 1);
            }
            return new FreelancerOrderRefundParams(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOrderRefundParams[i];
        }
    }

    public FreelancerOrderRefundParams(List transactionsToRefund, String description) {
        Intrinsics.checkNotNullParameter(transactionsToRefund, "transactionsToRefund");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f73310a = transactionsToRefund;
        this.f73311b = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerOrderRefundParams)) {
            return false;
        }
        FreelancerOrderRefundParams freelancerOrderRefundParams = (FreelancerOrderRefundParams) obj2;
        return Intrinsics.f(this.f73310a, freelancerOrderRefundParams.f73310a) && Intrinsics.f(this.f73311b, freelancerOrderRefundParams.f73311b);
    }

    public final int hashCode() {
        return this.f73311b.hashCode() + (this.f73310a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f73310a, dest);
        while (itV.hasNext()) {
            ((FreelancerSaleRefundTransaction) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f73311b);
    }
}
