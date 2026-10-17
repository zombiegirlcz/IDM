package com.revolut.feature.shops.impl.ui.items_details.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shops/impl/ui/items_details/cancellation/ShopsCancelOrderContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShopsCancelOrderContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ShopsCancelOrderContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f87217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f87219c;
    public final int d;
    public final Long e;
    public final double f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShopsCancelOrderContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShopsCancelOrderContract$InputData[i];
        }
    }

    public ShopsCancelOrderContract$InputData(String purchaseId, String refundingTo, String productName, int i, Long l2, double d) {
        Intrinsics.checkNotNullParameter(purchaseId, "purchaseId");
        Intrinsics.checkNotNullParameter(refundingTo, "refundingTo");
        Intrinsics.checkNotNullParameter(productName, "productName");
        this.f87217a = purchaseId;
        this.f87218b = refundingTo;
        this.f87219c = productName;
        this.d = i;
        this.e = l2;
        this.f = d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShopsCancelOrderContract$InputData)) {
            return false;
        }
        ShopsCancelOrderContract$InputData shopsCancelOrderContract$InputData = (ShopsCancelOrderContract$InputData) obj2;
        return Intrinsics.f(this.f87217a, shopsCancelOrderContract$InputData.f87217a) && Intrinsics.f(this.f87218b, shopsCancelOrderContract$InputData.f87218b) && Intrinsics.f(this.f87219c, shopsCancelOrderContract$InputData.f87219c) && this.d == shopsCancelOrderContract$InputData.d && Intrinsics.f(this.e, shopsCancelOrderContract$InputData.e) && Double.compare(this.f, shopsCancelOrderContract$InputData.f) == 0;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, p.a.c(p.a.c(this.f87217a.hashCode() * 31, 31, this.f87218b), 31, this.f87219c), 31);
        Long l2 = this.e;
        return Double.hashCode(this.f) + ((iB + (l2 == null ? 0 : l2.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f87217a);
        dest.writeString(this.f87218b);
        dest.writeString(this.f87219c);
        dest.writeInt(this.d);
        Long l2 = this.e;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeDouble(this.f);
    }
}
