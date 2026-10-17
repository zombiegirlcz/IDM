package com.revolut.feature.wealth.impl.ui.invest.transactions.details.pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/revolut/feature/wealth/impl/ui/invest/transactions/details/pager/InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem implements PagerItem {

    @NotNull
    public static final Parcelable.Creator<InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InvestTransaction f95576a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem((InvestTransaction) parcel.readParcelable(InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem[i];
        }
    }

    public InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem(InvestTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f95576a = transaction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem) && Intrinsics.f(this.f95576a.getId(), ((InvestTransactionDetailsPagerFlowContract$TransactionDetailsPagerItem) obj2).f95576a.getId());
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    public final String getId() {
        return this.f95576a.getId();
    }

    public final int hashCode() {
        return this.f95576a.getId().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95576a, i);
    }
}
