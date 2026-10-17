package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundProration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimSubscriptionRefundBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimSubscriptionRefundBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimSubscriptionRefundBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimSubscriptionRefundProration f100503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimSubscriptionRefundProration.DataUsage f100504b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimSubscriptionRefundBreakdown((EsimSubscriptionRefundProration) parcel.readParcelable(EsimSubscriptionRefundBreakdown.class.getClassLoader()), parcel.readInt() == 0 ? null : EsimSubscriptionRefundProration.DataUsage.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimSubscriptionRefundBreakdown[i];
        }
    }

    public EsimSubscriptionRefundBreakdown(EsimSubscriptionRefundProration esimSubscriptionRefundProration, EsimSubscriptionRefundProration.DataUsage dataUsage) {
        this.f100503a = esimSubscriptionRefundProration;
        this.f100504b = dataUsage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimSubscriptionRefundBreakdown)) {
            return false;
        }
        EsimSubscriptionRefundBreakdown esimSubscriptionRefundBreakdown = (EsimSubscriptionRefundBreakdown) obj2;
        return Intrinsics.f(this.f100503a, esimSubscriptionRefundBreakdown.f100503a) && Intrinsics.f(this.f100504b, esimSubscriptionRefundBreakdown.f100504b);
    }

    public final int hashCode() {
        EsimSubscriptionRefundProration esimSubscriptionRefundProration = this.f100503a;
        int iHashCode = (esimSubscriptionRefundProration == null ? 0 : esimSubscriptionRefundProration.hashCode()) * 31;
        EsimSubscriptionRefundProration.DataUsage dataUsage = this.f100504b;
        return iHashCode + (dataUsage != null ? dataUsage.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f100503a, i);
        EsimSubscriptionRefundProration.DataUsage dataUsage = this.f100504b;
        if (dataUsage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dataUsage.writeToParcel(dest, i);
        }
    }
}
