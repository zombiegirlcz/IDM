package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.target_price;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import wd6.e;
import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/placement/target_price/CommodityTargetPriceScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommodityTargetPriceScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CommodityTargetPriceScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f99912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f99913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f99914c;
    public final xi0.b d;
    public final e e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommodityTargetPriceScreenContract$InputData((BigDecimal) parcel.readSerializable(), h.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), e.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommodityTargetPriceScreenContract$InputData[i];
        }
    }

    public CommodityTargetPriceScreenContract$InputData(BigDecimal bigDecimal, h orderType, xi0.b orderBaseCurrency, xi0.b counterCurrency, e exchangeMode) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(orderBaseCurrency, "orderBaseCurrency");
        Intrinsics.checkNotNullParameter(counterCurrency, "counterCurrency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f99912a = bigDecimal;
        this.f99913b = orderType;
        this.f99914c = orderBaseCurrency;
        this.d = counterCurrency;
        this.e = exchangeMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommodityTargetPriceScreenContract$InputData)) {
            return false;
        }
        CommodityTargetPriceScreenContract$InputData commodityTargetPriceScreenContract$InputData = (CommodityTargetPriceScreenContract$InputData) obj2;
        return Intrinsics.f(this.f99912a, commodityTargetPriceScreenContract$InputData.f99912a) && this.f99913b == commodityTargetPriceScreenContract$InputData.f99913b && Intrinsics.f(this.f99914c, commodityTargetPriceScreenContract$InputData.f99914c) && Intrinsics.f(this.d, commodityTargetPriceScreenContract$InputData.d) && this.e == commodityTargetPriceScreenContract$InputData.e;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f99912a;
        return this.e.hashCode() + l.j(this.d, l.j(this.f99914c, c.b(this.f99913b, (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99912a);
        dest.writeString(this.f99913b.name());
        dest.writeSerializable(this.f99914c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e.name());
    }
}
