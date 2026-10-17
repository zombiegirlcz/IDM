package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.tutorial;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import wd6.h;
import wp5.y;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/placement/tutorial/CommodityTutorialScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommodityTutorialScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CommodityTutorialScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f99929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f99930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f99931c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommodityTutorialScreenContract$InputData(h.valueOf(parcel.readString()), e.valueOf(parcel.readString()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommodityTutorialScreenContract$InputData[i];
        }
    }

    public CommodityTutorialScreenContract$InputData(h orderType, e exchangeMode, b currency) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f99929a = orderType;
        this.f99930b = exchangeMode;
        this.f99931c = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommodityTutorialScreenContract$InputData)) {
            return false;
        }
        CommodityTutorialScreenContract$InputData commodityTutorialScreenContract$InputData = (CommodityTutorialScreenContract$InputData) obj2;
        return this.f99929a == commodityTutorialScreenContract$InputData.f99929a && this.f99930b == commodityTutorialScreenContract$InputData.f99930b && Intrinsics.f(this.f99931c, commodityTutorialScreenContract$InputData.f99931c);
    }

    public final int hashCode() {
        return this.f99931c.hashCode() + y.g(this.f99930b, this.f99929a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99929a.name());
        dest.writeString(this.f99930b.name());
        dest.writeSerializable(this.f99931c);
    }
}
