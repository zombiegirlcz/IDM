package com.revolut.feature.trading_orders.api.ui.details_pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading_orders/api/ui/details_pager/InvestOrderDetailsPagerFeatureContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_orders_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvestOrderDetailsPagerFeatureContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvestOrderDetailsPagerFeatureContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder f91744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvestOrdersParams f91745b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestOrderDetailsPagerFeatureContract$InputData((InvestOrder) parcel.readParcelable(InvestOrderDetailsPagerFeatureContract$InputData.class.getClassLoader()), (InvestOrdersParams) parcel.readParcelable(InvestOrderDetailsPagerFeatureContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestOrderDetailsPagerFeatureContract$InputData[i];
        }
    }

    public InvestOrderDetailsPagerFeatureContract$InputData(InvestOrder order, InvestOrdersParams filter) {
        Intrinsics.checkNotNullParameter(order, "order");
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f91744a = order;
        this.f91745b = filter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InvestOrderDetailsPagerFeatureContract$InputData)) {
            return false;
        }
        InvestOrderDetailsPagerFeatureContract$InputData investOrderDetailsPagerFeatureContract$InputData = (InvestOrderDetailsPagerFeatureContract$InputData) obj2;
        return Intrinsics.f(this.f91744a, investOrderDetailsPagerFeatureContract$InputData.f91744a) && Intrinsics.f(this.f91745b, investOrderDetailsPagerFeatureContract$InputData.f91745b);
    }

    public final int hashCode() {
        return this.f91745b.hashCode() + (this.f91744a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91744a, i);
        dest.writeParcelable(this.f91745b, i);
    }
}
