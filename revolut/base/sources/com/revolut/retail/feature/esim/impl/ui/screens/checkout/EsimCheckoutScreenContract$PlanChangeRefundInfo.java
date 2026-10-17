package com.revolut.retail.feature.esim.impl.ui.screens.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundProration;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/checkout/EsimCheckoutScreenContract$PlanChangeRefundInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimCheckoutScreenContract$PlanChangeRefundInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimCheckoutScreenContract$PlanChangeRefundInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionRefundProration f100917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f100918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f100919c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimCheckoutScreenContract$PlanChangeRefundInfo((EsimSubscriptionRefundProration) parcel.readParcelable(EsimCheckoutScreenContract$PlanChangeRefundInfo.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimCheckoutScreenContract$PlanChangeRefundInfo[i];
        }
    }

    public EsimCheckoutScreenContract$PlanChangeRefundInfo(EsimSubscriptionRefundProration esimSubscriptionRefundProration, d refundAmount, double d) {
        Intrinsics.checkNotNullParameter(refundAmount, "refundAmount");
        this.f100917a = esimSubscriptionRefundProration;
        this.f100918b = refundAmount;
        this.f100919c = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimCheckoutScreenContract$PlanChangeRefundInfo)) {
            return false;
        }
        EsimCheckoutScreenContract$PlanChangeRefundInfo esimCheckoutScreenContract$PlanChangeRefundInfo = (EsimCheckoutScreenContract$PlanChangeRefundInfo) obj2;
        return Intrinsics.f(this.f100917a, esimCheckoutScreenContract$PlanChangeRefundInfo.f100917a) && Intrinsics.f(this.f100918b, esimCheckoutScreenContract$PlanChangeRefundInfo.f100918b) && Double.compare(this.f100919c, esimCheckoutScreenContract$PlanChangeRefundInfo.f100919c) == 0;
    }

    public final int hashCode() {
        EsimSubscriptionRefundProration esimSubscriptionRefundProration = this.f100917a;
        return Double.hashCode(this.f100919c) + v7.c((esimSubscriptionRefundProration == null ? 0 : esimSubscriptionRefundProration.hashCode()) * 31, 31, this.f100918b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f100917a, i);
        dest.writeSerializable(this.f100918b);
        dest.writeDouble(this.f100919c);
    }
}
