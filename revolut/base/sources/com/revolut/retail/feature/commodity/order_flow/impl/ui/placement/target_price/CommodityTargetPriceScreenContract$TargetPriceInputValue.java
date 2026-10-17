package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/placement/target_price/CommodityTargetPriceScreenContract$TargetPriceInputValue", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommodityTargetPriceScreenContract$TargetPriceInputValue implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CommodityTargetPriceScreenContract$TargetPriceInputValue> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f99921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f99922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f99923c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CommodityTargetPriceScreenContract$TargetPriceInputValue(bigDecimal, boolValueOf, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommodityTargetPriceScreenContract$TargetPriceInputValue[i];
        }
    }

    public CommodityTargetPriceScreenContract$TargetPriceInputValue(BigDecimal value, Boolean bool, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f99921a = value;
        this.f99922b = bool;
        this.f99923c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommodityTargetPriceScreenContract$TargetPriceInputValue)) {
            return false;
        }
        CommodityTargetPriceScreenContract$TargetPriceInputValue commodityTargetPriceScreenContract$TargetPriceInputValue = (CommodityTargetPriceScreenContract$TargetPriceInputValue) obj2;
        return Intrinsics.f(this.f99921a, commodityTargetPriceScreenContract$TargetPriceInputValue.f99921a) && Intrinsics.f(this.f99922b, commodityTargetPriceScreenContract$TargetPriceInputValue.f99922b) && this.f99923c == commodityTargetPriceScreenContract$TargetPriceInputValue.f99923c;
    }

    public final int hashCode() {
        int iHashCode = this.f99921a.hashCode() * 31;
        Boolean bool = this.f99922b;
        return Boolean.hashCode(this.f99923c) + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99921a);
        Boolean bool = this.f99922b;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        dest.writeInt(this.f99923c ? 1 : 0);
    }
}
