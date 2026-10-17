package com.revolut.feature.transaction_details_pager.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/revolut/feature/transaction_details_pager/impl/ui/flow/TransactionDetailsPagerFlowContract$DetailsPage", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "feature_transaction_details_pager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionDetailsPagerFlowContract$DetailsPage implements PagerItem {

    @NotNull
    public static final Parcelable.Creator<TransactionDetailsPagerFlowContract$DetailsPage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedTransaction f91896a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionDetailsPagerFlowContract$DetailsPage((UnifiedTransaction) parcel.readParcelable(TransactionDetailsPagerFlowContract$DetailsPage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionDetailsPagerFlowContract$DetailsPage[i];
        }
    }

    public TransactionDetailsPagerFlowContract$DetailsPage(UnifiedTransaction transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f91896a = transaction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof TransactionDetailsPagerFlowContract$DetailsPage) && Intrinsics.f(this.f91896a.getF94575b(), ((TransactionDetailsPagerFlowContract$DetailsPage) obj2).f91896a.getF94575b());
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    /* JADX INFO: renamed from: getId */
    public final String getF86946b() {
        return this.f91896a.getF94575b();
    }

    public final int hashCode() {
        return this.f91896a.getF94575b().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91896a, i);
    }
}
