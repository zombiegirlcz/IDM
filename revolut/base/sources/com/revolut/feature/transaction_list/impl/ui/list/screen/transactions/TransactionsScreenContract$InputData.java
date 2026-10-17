package com.revolut.feature.transaction_list.impl.ui.list.screen.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import rhf.g;
import tof.q6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transaction_list/impl/ui/list/screen/transactions/TransactionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsListFilterType f91925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f91926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransactionDestination f91927c;
    public final g d;
    public final q6 e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecurringPaymentAccount f91928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RecurringPaymentFilter f91929h;
    public final Clause i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f91930j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f91931l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TransactionsListFilterType transactionsListFilterType = (TransactionsListFilterType) j6.a.f(parcel, "parcel", TransactionsScreenContract$InputData.class);
            AccountId accountId = (AccountId) parcel.readParcelable(TransactionsScreenContract$InputData.class.getClassLoader());
            TransactionDestination transactionDestination = (TransactionDestination) parcel.readParcelable(TransactionsScreenContract$InputData.class.getClassLoader());
            g gVarValueOf = g.valueOf(parcel.readString());
            q6 q6Var = (q6) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new TransactionsScreenContract$InputData(transactionsListFilterType, accountId, transactionDestination, gVarValueOf, q6Var, linkedHashSet, (RecurringPaymentAccount) parcel.readParcelable(TransactionsScreenContract$InputData.class.getClassLoader()), (RecurringPaymentFilter) parcel.readParcelable(TransactionsScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(TransactionsScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(TransactionsScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionsScreenContract$InputData[i];
        }
    }

    public TransactionsScreenContract$InputData(TransactionsListFilterType filter, AccountId accountId, TransactionDestination transactionDetailsNavigationDestination, g entrypoint, q6 transactionScope, Set remotelyFoundTransactionGroupIds, RecurringPaymentAccount recurringPaymentAccount, RecurringPaymentFilter recurringPaymentFilter, Clause title, Clause clause, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(transactionDetailsNavigationDestination, "transactionDetailsNavigationDestination");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        Intrinsics.checkNotNullParameter(remotelyFoundTransactionGroupIds, "remotelyFoundTransactionGroupIds");
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f91925a = filter;
        this.f91926b = accountId;
        this.f91927c = transactionDetailsNavigationDestination;
        this.d = entrypoint;
        this.e = transactionScope;
        this.f = remotelyFoundTransactionGroupIds;
        this.f91928g = recurringPaymentAccount;
        this.f91929h = recurringPaymentFilter;
        this.i = title;
        this.f91930j = clause;
        this.k = z;
        this.f91931l = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionsScreenContract$InputData)) {
            return false;
        }
        TransactionsScreenContract$InputData transactionsScreenContract$InputData = (TransactionsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91925a, transactionsScreenContract$InputData.f91925a) && Intrinsics.f(this.f91926b, transactionsScreenContract$InputData.f91926b) && Intrinsics.f(this.f91927c, transactionsScreenContract$InputData.f91927c) && this.d == transactionsScreenContract$InputData.d && Intrinsics.f(this.e, transactionsScreenContract$InputData.e) && Intrinsics.f(this.f, transactionsScreenContract$InputData.f) && Intrinsics.f(this.f91928g, transactionsScreenContract$InputData.f91928g) && Intrinsics.f(this.f91929h, transactionsScreenContract$InputData.f91929h) && Intrinsics.f(this.i, transactionsScreenContract$InputData.i) && Intrinsics.f(this.f91930j, transactionsScreenContract$InputData.f91930j) && this.k == transactionsScreenContract$InputData.k && this.f91931l == transactionsScreenContract$InputData.f91931l;
    }

    public final int hashCode() {
        int iHashCode = (this.f91928g.hashCode() + p.a.f((this.e.hashCode() + ((this.d.hashCode() + ((this.f91927c.hashCode() + l.b(this.f91926b, this.f91925a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.f)) * 31;
        RecurringPaymentFilter recurringPaymentFilter = this.f91929h;
        int iA = p.a.a((iHashCode + (recurringPaymentFilter == null ? 0 : recurringPaymentFilter.hashCode())) * 31, 31, this.i);
        Clause clause = this.f91930j;
        return Boolean.hashCode(this.f91931l) + j6.a.c((iA + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91925a, i);
        dest.writeParcelable(this.f91926b, i);
        dest.writeParcelable(this.f91927c, i);
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        Iterator itV = n.v(this.f, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeParcelable(this.f91928g, i);
        dest.writeParcelable(this.f91929h, i);
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f91930j, i);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeInt(this.f91931l ? 1 : 0);
    }
}
