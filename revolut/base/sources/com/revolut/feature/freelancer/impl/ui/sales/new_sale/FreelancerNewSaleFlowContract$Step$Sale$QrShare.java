package com.revolut.feature.freelancer.impl.ui.sales.new_sale;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/sales/new_sale/FreelancerNewSaleFlowContract$Step$Sale$QrShare", "", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerNewSaleFlowContract$Step$Sale$QrShare implements FreelancerNewSaleFlowContract$Step {

    @NotNull
    public static final Parcelable.Creator<FreelancerNewSaleFlowContract$Step$Sale$QrShare> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f74152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74153b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerNewSaleFlowContract$Step$Sale$QrShare((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerNewSaleFlowContract$Step$Sale$QrShare[i];
        }
    }

    public FreelancerNewSaleFlowContract$Step$Sale$QrShare(d dVar, String qrCodeUrl) {
        Intrinsics.checkNotNullParameter(qrCodeUrl, "qrCodeUrl");
        this.f74152a = dVar;
        this.f74153b = qrCodeUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerNewSaleFlowContract$Step$Sale$QrShare)) {
            return false;
        }
        FreelancerNewSaleFlowContract$Step$Sale$QrShare freelancerNewSaleFlowContract$Step$Sale$QrShare = (FreelancerNewSaleFlowContract$Step$Sale$QrShare) obj2;
        return Intrinsics.f(this.f74152a, freelancerNewSaleFlowContract$Step$Sale$QrShare.f74152a) && Intrinsics.f(this.f74153b, freelancerNewSaleFlowContract$Step$Sale$QrShare.f74153b);
    }

    public final int hashCode() {
        d dVar = this.f74152a;
        return this.f74153b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74152a);
        dest.writeString(this.f74153b);
    }
}
