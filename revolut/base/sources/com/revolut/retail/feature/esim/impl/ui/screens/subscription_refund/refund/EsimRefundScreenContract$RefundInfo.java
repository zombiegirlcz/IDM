package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundProration;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreenContract$RefundInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimRefundScreenContract$RefundInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimRefundScreenContract$RefundInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionRefundProration f101450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f101451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f101452c;
    public final double d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimRefundScreenContract$RefundInfo((EsimSubscriptionRefundProration) parcel.readParcelable(EsimRefundScreenContract$RefundInfo.class.getClassLoader()), parcel.readInt() != 0, (d) parcel.readSerializable(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimRefundScreenContract$RefundInfo[i];
        }
    }

    public EsimRefundScreenContract$RefundInfo(EsimSubscriptionRefundProration esimSubscriptionRefundProration, boolean z, d refundAmount, double d) {
        Intrinsics.checkNotNullParameter(refundAmount, "refundAmount");
        this.f101450a = esimSubscriptionRefundProration;
        this.f101451b = z;
        this.f101452c = refundAmount;
        this.d = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimRefundScreenContract$RefundInfo)) {
            return false;
        }
        EsimRefundScreenContract$RefundInfo esimRefundScreenContract$RefundInfo = (EsimRefundScreenContract$RefundInfo) obj2;
        return Intrinsics.f(this.f101450a, esimRefundScreenContract$RefundInfo.f101450a) && this.f101451b == esimRefundScreenContract$RefundInfo.f101451b && Intrinsics.f(this.f101452c, esimRefundScreenContract$RefundInfo.f101452c) && Double.compare(this.d, esimRefundScreenContract$RefundInfo.d) == 0;
    }

    public final int hashCode() {
        EsimSubscriptionRefundProration esimSubscriptionRefundProration = this.f101450a;
        return Double.hashCode(this.d) + v7.c(j6.a.c((esimSubscriptionRefundProration == null ? 0 : esimSubscriptionRefundProration.hashCode()) * 31, 31, this.f101451b), 31, this.f101452c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f101450a, i);
        dest.writeInt(this.f101451b ? 1 : 0);
        dest.writeSerializable(this.f101452c);
        dest.writeDouble(this.d);
    }
}
