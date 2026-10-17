package com.revolut.trading.orders.ui.details_pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.retail.trading.core.domain.orders.InvestOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/revolut/trading/orders/ui/details_pager/InvestOrderDetailsPagerFlowContract$DetailsPagerItem", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestOrderDetailsPagerFlowContract$DetailsPagerItem implements PagerItem {

    @NotNull
    public static final Parcelable.Creator<InvestOrderDetailsPagerFlowContract$DetailsPagerItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestOrder f106817a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestOrderDetailsPagerFlowContract$DetailsPagerItem((InvestOrder) parcel.readParcelable(InvestOrderDetailsPagerFlowContract$DetailsPagerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestOrderDetailsPagerFlowContract$DetailsPagerItem[i];
        }
    }

    public InvestOrderDetailsPagerFlowContract$DetailsPagerItem(InvestOrder order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.f106817a = order;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof InvestOrderDetailsPagerFlowContract$DetailsPagerItem) && Intrinsics.f(this.f106817a.k5(), ((InvestOrderDetailsPagerFlowContract$DetailsPagerItem) obj2).f106817a.k5());
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    /* JADX INFO: renamed from: getId */
    public final String getF98432a() {
        return this.f106817a.k5();
    }

    public final int hashCode() {
        return this.f106817a.k5().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106817a, i);
    }
}
