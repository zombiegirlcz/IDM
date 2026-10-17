package com.revolut.feature.transaction_list.impl.ui.list.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
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
import rhf.h;
import tof.q6;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transaction_list/impl/ui/list/flow/TransactionListFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transaction_list_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransactionListFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransactionListFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f91901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f91902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f91903c;
    public final boolean d;
    public final TransactionsListFilterType e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AccountId f91904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f91905h;
    public final g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TransactionDestination f91906j;
    public final q6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f91907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecurringPaymentAccount f91908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecurringPaymentFilter f91909n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f91910p;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Clause clause = (Clause) j6.a.f(parcel, "parcel", TransactionListFlowContract$InputData.class);
            Clause clause2 = (Clause) parcel.readParcelable(TransactionListFlowContract$InputData.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(TransactionListFlowContract$InputData.class.getClassLoader());
            boolean z = parcel.readInt() != 0;
            TransactionsListFilterType transactionsListFilterType = (TransactionsListFilterType) parcel.readParcelable(TransactionListFlowContract$InputData.class.getClassLoader());
            String string = parcel.readString();
            AccountId accountId = (AccountId) parcel.readParcelable(TransactionListFlowContract$InputData.class.getClassLoader());
            h hVarValueOf = h.valueOf(parcel.readString());
            g gVarValueOf = g.valueOf(parcel.readString());
            TransactionDestination transactionDestination = (TransactionDestination) parcel.readParcelable(TransactionListFlowContract$InputData.class.getClassLoader());
            q6 q6Var = (q6) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            boolean z3 = z;
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new TransactionListFlowContract$InputData(clause, clause2, image, z3, transactionsListFilterType, string, accountId, hVarValueOf, gVarValueOf, transactionDestination, q6Var, linkedHashSet, (RecurringPaymentAccount) parcel.readParcelable(TransactionListFlowContract$InputData.class.getClassLoader()), (RecurringPaymentFilter) parcel.readParcelable(TransactionListFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransactionListFlowContract$InputData[i];
        }
    }

    public TransactionListFlowContract$InputData(Clause title, Clause clause, Image image, boolean z, TransactionsListFilterType filterType, String initialSearchQuery, AccountId accountId, h selectedTab, g entrypoint, TransactionDestination navigationDestination, q6 transactionScope, Set remotelyFoundTransactionGroupIds, RecurringPaymentAccount recurringPaymentAccount, RecurringPaymentFilter recurringPaymentFilter, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(initialSearchQuery, "initialSearchQuery");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        Intrinsics.checkNotNullParameter(navigationDestination, "navigationDestination");
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        Intrinsics.checkNotNullParameter(remotelyFoundTransactionGroupIds, "remotelyFoundTransactionGroupIds");
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        this.f91901a = title;
        this.f91902b = clause;
        this.f91903c = image;
        this.d = z;
        this.e = filterType;
        this.f = initialSearchQuery;
        this.f91904g = accountId;
        this.f91905h = selectedTab;
        this.i = entrypoint;
        this.f91906j = navigationDestination;
        this.k = transactionScope;
        this.f91907l = remotelyFoundTransactionGroupIds;
        this.f91908m = recurringPaymentAccount;
        this.f91909n = recurringPaymentFilter;
        this.o = z3;
        this.f91910p = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransactionListFlowContract$InputData)) {
            return false;
        }
        TransactionListFlowContract$InputData transactionListFlowContract$InputData = (TransactionListFlowContract$InputData) obj2;
        return Intrinsics.f(this.f91901a, transactionListFlowContract$InputData.f91901a) && Intrinsics.f(this.f91902b, transactionListFlowContract$InputData.f91902b) && Intrinsics.f(this.f91903c, transactionListFlowContract$InputData.f91903c) && this.d == transactionListFlowContract$InputData.d && Intrinsics.f(this.e, transactionListFlowContract$InputData.e) && Intrinsics.f(this.f, transactionListFlowContract$InputData.f) && Intrinsics.f(this.f91904g, transactionListFlowContract$InputData.f91904g) && this.f91905h == transactionListFlowContract$InputData.f91905h && this.i == transactionListFlowContract$InputData.i && Intrinsics.f(this.f91906j, transactionListFlowContract$InputData.f91906j) && Intrinsics.f(this.k, transactionListFlowContract$InputData.k) && Intrinsics.f(this.f91907l, transactionListFlowContract$InputData.f91907l) && Intrinsics.f(this.f91908m, transactionListFlowContract$InputData.f91908m) && Intrinsics.f(this.f91909n, transactionListFlowContract$InputData.f91909n) && this.o == transactionListFlowContract$InputData.o && this.f91910p == transactionListFlowContract$InputData.f91910p;
    }

    public final int hashCode() {
        int iHashCode = this.f91901a.hashCode() * 31;
        Clause clause = this.f91902b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f91903c;
        int iHashCode3 = (this.f91908m.hashCode() + p.a.f((this.k.hashCode() + ((this.f91906j.hashCode() + ((this.i.hashCode() + ((this.f91905h.hashCode() + l.b(this.f91904g, p.a.c((this.e.hashCode() + j6.a.c((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.d)) * 31, 31, this.f), 31)) * 31)) * 31)) * 31)) * 31, 31, this.f91907l)) * 31;
        RecurringPaymentFilter recurringPaymentFilter = this.f91909n;
        return Boolean.hashCode(this.f91910p) + j6.a.c((iHashCode3 + (recurringPaymentFilter != null ? recurringPaymentFilter.hashCode() : 0)) * 31, 31, this.o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91901a, i);
        dest.writeParcelable(this.f91902b, i);
        dest.writeParcelable(this.f91903c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeParcelable(this.f91904g, i);
        dest.writeString(this.f91905h.name());
        dest.writeString(this.i.name());
        dest.writeParcelable(this.f91906j, i);
        dest.writeSerializable(this.k);
        Iterator itV = n.v(this.f91907l, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeParcelable(this.f91908m, i);
        dest.writeParcelable(this.f91909n, i);
        dest.writeInt(this.o ? 1 : 0);
        dest.writeInt(this.f91910p ? 1 : 0);
    }
}
