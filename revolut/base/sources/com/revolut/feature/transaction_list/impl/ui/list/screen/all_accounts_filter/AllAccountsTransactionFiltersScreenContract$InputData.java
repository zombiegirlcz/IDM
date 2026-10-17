package com.revolut.feature.transaction_list.impl.ui.list.screen.all_accounts_filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transaction_list/impl/ui/list/screen/all_accounts_filter/AllAccountsTransactionFiltersScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AllAccountsTransactionFiltersScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AllAccountsTransactionFiltersScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsListFilterType.ConfigurableFilter.AccountFilters f91922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionsListFilterType.ConfigurableFilter.AccountFilters f91923b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AllAccountsTransactionFiltersScreenContract$InputData((TransactionsListFilterType.ConfigurableFilter.AccountFilters) parcel.readParcelable(AllAccountsTransactionFiltersScreenContract$InputData.class.getClassLoader()), (TransactionsListFilterType.ConfigurableFilter.AccountFilters) parcel.readParcelable(AllAccountsTransactionFiltersScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AllAccountsTransactionFiltersScreenContract$InputData[i];
        }
    }

    public AllAccountsTransactionFiltersScreenContract$InputData(TransactionsListFilterType.ConfigurableFilter.AccountFilters defaultAccounts, TransactionsListFilterType.ConfigurableFilter.AccountFilters accounts) {
        Intrinsics.checkNotNullParameter(defaultAccounts, "defaultAccounts");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f91922a = defaultAccounts;
        this.f91923b = accounts;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AllAccountsTransactionFiltersScreenContract$InputData)) {
            return false;
        }
        AllAccountsTransactionFiltersScreenContract$InputData allAccountsTransactionFiltersScreenContract$InputData = (AllAccountsTransactionFiltersScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91922a, allAccountsTransactionFiltersScreenContract$InputData.f91922a) && Intrinsics.f(this.f91923b, allAccountsTransactionFiltersScreenContract$InputData.f91923b);
    }

    public final int hashCode() {
        return this.f91923b.hashCode() + (this.f91922a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91922a, i);
        dest.writeParcelable(this.f91923b, i);
    }
}
