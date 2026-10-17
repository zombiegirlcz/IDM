package com.revolut.retail.feature.commodity.order_flow.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommodityOrderFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CommodityOrderFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CommodityOrderFlowConfig f99810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f99811b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CommodityOrderFlowContract$InputData((CommodityOrderFlowConfig) parcel.readParcelable(CommodityOrderFlowContract$InputData.class.getClassLoader()), (NaviCommand) parcel.readParcelable(CommodityOrderFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CommodityOrderFlowContract$InputData[i];
        }
    }

    public CommodityOrderFlowContract$InputData(CommodityOrderFlowConfig config, NaviCommand naviCommand) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f99810a = config;
        this.f99811b = naviCommand;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CommodityOrderFlowContract$InputData)) {
            return false;
        }
        CommodityOrderFlowContract$InputData commodityOrderFlowContract$InputData = (CommodityOrderFlowContract$InputData) obj2;
        return Intrinsics.f(this.f99810a, commodityOrderFlowContract$InputData.f99810a) && Intrinsics.f(this.f99811b, commodityOrderFlowContract$InputData.f99811b);
    }

    public final int hashCode() {
        int iHashCode = this.f99810a.hashCode() * 31;
        NaviCommand naviCommand = this.f99811b;
        return iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f99810a, i);
        dest.writeParcelable(this.f99811b, i);
    }
}
