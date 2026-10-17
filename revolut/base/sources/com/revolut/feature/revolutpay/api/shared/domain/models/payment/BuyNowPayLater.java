package com.revolut.feature.revolutpay.api.shared.domain.models.payment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/domain/models/payment/BuyNowPayLater;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BuyNowPayLater implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84339b;

    @NotNull
    public static final Parcelable.Creator<BuyNowPayLater> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BuyNowPayLater(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BuyNowPayLater[i];
        }
    }

    public BuyNowPayLater(String payLaterFacilityId, String indicativeOfferId) {
        Intrinsics.checkNotNullParameter(payLaterFacilityId, "payLaterFacilityId");
        Intrinsics.checkNotNullParameter(indicativeOfferId, "indicativeOfferId");
        this.f84338a = payLaterFacilityId;
        this.f84339b = indicativeOfferId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BuyNowPayLater)) {
            return false;
        }
        BuyNowPayLater buyNowPayLater = (BuyNowPayLater) obj2;
        return Intrinsics.f(this.f84338a, buyNowPayLater.f84338a) && Intrinsics.f(this.f84339b, buyNowPayLater.f84339b);
    }

    public final int hashCode() {
        return this.f84339b.hashCode() + (this.f84338a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84338a);
        dest.writeString(this.f84339b);
    }
}
