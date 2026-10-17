package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/placement/target_price/CommodityTargetPriceScreenContract$InputModelSettings", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommodityTargetPriceScreenContract$InputModelSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CommodityTargetPriceScreenContract$InputModelSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f99915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99916b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommodityTargetPriceScreenContract$InputModelSettings(parcel.readInt(), (xi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommodityTargetPriceScreenContract$InputModelSettings[i];
        }
    }

    public CommodityTargetPriceScreenContract$InputModelSettings(int i, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f99915a = currency;
        this.f99916b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommodityTargetPriceScreenContract$InputModelSettings)) {
            return false;
        }
        CommodityTargetPriceScreenContract$InputModelSettings commodityTargetPriceScreenContract$InputModelSettings = (CommodityTargetPriceScreenContract$InputModelSettings) obj2;
        return Intrinsics.f(this.f99915a, commodityTargetPriceScreenContract$InputModelSettings.f99915a) && this.f99916b == commodityTargetPriceScreenContract$InputModelSettings.f99916b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99916b) + (this.f99915a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99915a);
        dest.writeInt(this.f99916b);
    }
}
