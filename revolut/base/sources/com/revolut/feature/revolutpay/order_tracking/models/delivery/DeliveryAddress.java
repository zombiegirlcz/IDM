package com.revolut.feature.revolutpay.order_tracking.models.delivery;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/models/delivery/DeliveryAddress;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_order_tracking_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryAddress implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84653c;

    @NotNull
    public static final Parcelable.Creator<DeliveryAddress> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeliveryAddress(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeliveryAddress[i];
        }
    }

    public DeliveryAddress(String str, String str2, String str3) {
        this.f84651a = str;
        this.f84652b = str2;
        this.f84653c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeliveryAddress)) {
            return false;
        }
        DeliveryAddress deliveryAddress = (DeliveryAddress) obj2;
        return Intrinsics.f(this.f84651a, deliveryAddress.f84651a) && Intrinsics.f(this.f84652b, deliveryAddress.f84652b) && Intrinsics.f(this.f84653c, deliveryAddress.f84653c);
    }

    public final int hashCode() {
        String str = this.f84651a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84652b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84653c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84651a);
        dest.writeString(this.f84652b);
        dest.writeString(this.f84653c);
    }
}
