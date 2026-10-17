package com.revolut.feature.revolutpay.order_tracking.models.delivery;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/models/delivery/DeliveryCarrier;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_revolut_pay_order_tracking_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeliveryCarrier implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84656c;
    public final String d;
    public final boolean e;

    @NotNull
    public static final Parcelable.Creator<DeliveryCarrier> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeliveryCarrier(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeliveryCarrier[i];
        }
    }

    public DeliveryCarrier(String id10, String name, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f84654a = id10;
        this.f84655b = name;
        this.f84656c = str;
        this.d = str2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeliveryCarrier)) {
            return false;
        }
        DeliveryCarrier deliveryCarrier = (DeliveryCarrier) obj2;
        return Intrinsics.f(this.f84654a, deliveryCarrier.f84654a) && Intrinsics.f(this.f84655b, deliveryCarrier.f84655b) && Intrinsics.f(this.f84656c, deliveryCarrier.f84656c) && Intrinsics.f(this.d, deliveryCarrier.d) && this.e == deliveryCarrier.e;
    }

    public final int hashCode() {
        int iC = a.c(this.f84654a.hashCode() * 31, 31, this.f84655b);
        String str = this.f84656c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84654a);
        dest.writeString(this.f84655b);
        dest.writeString(this.f84656c);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
    }
}
