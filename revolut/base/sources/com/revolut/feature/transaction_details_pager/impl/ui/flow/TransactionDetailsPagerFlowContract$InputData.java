package com.revolut.feature.transaction_details_pager.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rhf.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transaction_details_pager/impl/ui/flow/TransactionDetailsPagerFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transaction_details_pager_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionDetailsPagerFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionDetailsPagerFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedTransaction f91897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnifiedTransactionsFilter f91898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91899c;
    public final d d;
    public final Set e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            UnifiedTransaction unifiedTransaction = (UnifiedTransaction) j6.a.f(parcel, "parcel", TransactionDetailsPagerFlowContract$InputData.class);
            UnifiedTransactionsFilter unifiedTransactionsFilter = (UnifiedTransactionsFilter) parcel.readParcelable(TransactionDetailsPagerFlowContract$InputData.class.getClassLoader());
            String string = parcel.readString();
            d dVarValueOf = d.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = com.revolut.data.database.models.openbanking.d.e(TransactionDetailsPagerFlowContract$InputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new TransactionDetailsPagerFlowContract$InputData(unifiedTransaction, unifiedTransactionsFilter, string, dVarValueOf, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionDetailsPagerFlowContract$InputData[i];
        }
    }

    public TransactionDetailsPagerFlowContract$InputData(UnifiedTransaction selectedTransaction, UnifiedTransactionsFilter unifiedTransactionsFilter, String searchQuery, d entryPoint, Set additionalConfig) {
        Intrinsics.checkNotNullParameter(selectedTransaction, "selectedTransaction");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(additionalConfig, "additionalConfig");
        this.f91897a = selectedTransaction;
        this.f91898b = unifiedTransactionsFilter;
        this.f91899c = searchQuery;
        this.d = entryPoint;
        this.e = additionalConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionDetailsPagerFlowContract$InputData)) {
            return false;
        }
        TransactionDetailsPagerFlowContract$InputData transactionDetailsPagerFlowContract$InputData = (TransactionDetailsPagerFlowContract$InputData) obj2;
        return Intrinsics.f(this.f91897a, transactionDetailsPagerFlowContract$InputData.f91897a) && Intrinsics.f(this.f91898b, transactionDetailsPagerFlowContract$InputData.f91898b) && Intrinsics.f(this.f91899c, transactionDetailsPagerFlowContract$InputData.f91899c) && this.d == transactionDetailsPagerFlowContract$InputData.d && Intrinsics.f(this.e, transactionDetailsPagerFlowContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = this.f91897a.hashCode() * 31;
        UnifiedTransactionsFilter unifiedTransactionsFilter = this.f91898b;
        return this.e.hashCode() + ((this.d.hashCode() + p.a.c((iHashCode + (unifiedTransactionsFilter == null ? 0 : unifiedTransactionsFilter.hashCode())) * 31, 31, this.f91899c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91897a, i);
        dest.writeParcelable(this.f91898b, i);
        dest.writeString(this.f91899c);
        dest.writeString(this.d.name());
        Iterator itV = n.v(this.e, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
