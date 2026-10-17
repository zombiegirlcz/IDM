package com.revolut.feature.transaction_list.impl.ui.list.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Past", "TransactionFilter", "AllAccountsTransactionFilter", "Lcom/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$Step$AllAccountsTransactionFilter;", "Lcom/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$Step$Past;", "Lcom/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$Step$TransactionFilter;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionListFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$Step$AllAccountsTransactionFilter;", "Lcom/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllAccountsTransactionFilter implements TransactionListFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AllAccountsTransactionFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransactionsListFilterType.ConfigurableFilter.AccountFilters f91911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransactionsListFilterType.ConfigurableFilter.AccountFilters f91912b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllAccountsTransactionFilter((TransactionsListFilterType.ConfigurableFilter.AccountFilters) parcel.readParcelable(AllAccountsTransactionFilter.class.getClassLoader()), (TransactionsListFilterType.ConfigurableFilter.AccountFilters) parcel.readParcelable(AllAccountsTransactionFilter.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllAccountsTransactionFilter[i];
            }
        }

        public AllAccountsTransactionFilter(TransactionsListFilterType.ConfigurableFilter.AccountFilters defaultAccountsFilters, TransactionsListFilterType.ConfigurableFilter.AccountFilters accountsFilters) {
            Intrinsics.checkNotNullParameter(defaultAccountsFilters, "defaultAccountsFilters");
            Intrinsics.checkNotNullParameter(accountsFilters, "accountsFilters");
            this.f91911a = defaultAccountsFilters;
            this.f91912b = accountsFilters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AllAccountsTransactionFilter)) {
                return false;
            }
            AllAccountsTransactionFilter allAccountsTransactionFilter = (AllAccountsTransactionFilter) obj2;
            return Intrinsics.f(this.f91911a, allAccountsTransactionFilter.f91911a) && Intrinsics.f(this.f91912b, allAccountsTransactionFilter.f91912b);
        }

        public final int hashCode() {
            return this.f91912b.hashCode() + (this.f91911a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f91911a, i);
            dest.writeParcelable(this.f91912b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$Step$Past;", "Lcom/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$Step;", "<init>", "()V", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Past implements TransactionListFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Past f91913a = new Past();

        @NotNull
        public static final Parcelable.Creator<Past> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Past.f91913a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Past[i];
            }
        }

        private Past() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$Step$TransactionFilter;", "Lcom/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionFilter implements TransactionListFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransactionFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f91914a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(TransactionFilter.class, parcel, arrayList, iE, 1);
                }
                return new TransactionFilter(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionFilter[i];
            }
        }

        public TransactionFilter(List customTransactionFilters) {
            Intrinsics.checkNotNullParameter(customTransactionFilters, "customTransactionFilters");
            this.f91914a = customTransactionFilters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionFilter) && Intrinsics.f(this.f91914a, ((TransactionFilter) obj2).f91914a);
        }

        public final int hashCode() {
            return this.f91914a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f91914a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
