package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.order_type_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import wd6.e;
import wd6.h;
import wp5.y;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/placement/order_type_selection/CommodityOrderTypeSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommodityOrderTypeSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CommodityOrderTypeSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f99909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f99910c;
    public final Set d;
    public final Set e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            e eVarValueOf = e.valueOf(parcel.readString());
            h hVarValueOf = h.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(h.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                linkedHashSet2.add(h.valueOf(parcel.readString()));
            }
            return new CommodityOrderTypeSelectionScreenContract$InputData(bVar, eVarValueOf, hVarValueOf, linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommodityOrderTypeSelectionScreenContract$InputData[i];
        }
    }

    public CommodityOrderTypeSelectionScreenContract$InputData(b orderBaseCurrency, e exchangeMode, h currentOrderType, Set availableOrderTypes, Set disabledOrderTypes) {
        Intrinsics.checkNotNullParameter(orderBaseCurrency, "orderBaseCurrency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currentOrderType, "currentOrderType");
        Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
        Intrinsics.checkNotNullParameter(disabledOrderTypes, "disabledOrderTypes");
        this.f99908a = orderBaseCurrency;
        this.f99909b = exchangeMode;
        this.f99910c = currentOrderType;
        this.d = availableOrderTypes;
        this.e = disabledOrderTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommodityOrderTypeSelectionScreenContract$InputData)) {
            return false;
        }
        CommodityOrderTypeSelectionScreenContract$InputData commodityOrderTypeSelectionScreenContract$InputData = (CommodityOrderTypeSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f99908a, commodityOrderTypeSelectionScreenContract$InputData.f99908a) && this.f99909b == commodityOrderTypeSelectionScreenContract$InputData.f99909b && this.f99910c == commodityOrderTypeSelectionScreenContract$InputData.f99910c && Intrinsics.f(this.d, commodityOrderTypeSelectionScreenContract$InputData.d) && Intrinsics.f(this.e, commodityOrderTypeSelectionScreenContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.f(c.b(this.f99910c, y.g(this.f99909b, this.f99908a.hashCode() * 31, 31), 31), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99908a);
        dest.writeString(this.f99909b.name());
        dest.writeString(this.f99910c.name());
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString(((h) itV.next()).name());
        }
        Iterator itV2 = n.v(this.e, dest);
        while (itV2.hasNext()) {
            dest.writeString(((h) itV2.next()).name());
        }
    }
}
