package com.revolut.feature.transactions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i7;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType;", "Landroid/os/Parcelable;", "<init>", "()V", "ByAccounts", "ByTransactionsFilter", "NoFilters", "SelectableFilterSection", "ConfigurableFilter", "TransactionFilterItem", "Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ByAccounts;", "Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ByTransactionsFilter;", "Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$NoFilters;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransactionsListFilterType implements Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ConfigurableFilter;", "Landroid/os/Parcelable;", "<init>", "()V", "SelectableFilters", "AccountFilters", "Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ConfigurableFilter$AccountFilters;", "Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ConfigurableFilter$SelectableFilters;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ConfigurableFilter implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ConfigurableFilter$AccountFilters;", "Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ConfigurableFilter;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AccountFilters extends ConfigurableFilter {

            @NotNull
            public static final Parcelable.Creator<AccountFilters> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f92012a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Set f92013b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iE = 0;
                    int iE2 = 0;
                    while (iE2 != i) {
                        iE2 = com.revolut.data.database.models.openbanking.d.e(AccountFilters.class, parcel, linkedHashSet, iE2, 1);
                    }
                    int i2 = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
                    while (iE != i2) {
                        iE = com.revolut.data.database.models.openbanking.d.e(AccountFilters.class, parcel, linkedHashSet2, iE, 1);
                    }
                    return new AccountFilters(linkedHashSet, linkedHashSet2);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AccountFilters[i];
                }
            }

            public AccountFilters(Set accountsIds, Set additionalFilters) {
                Intrinsics.checkNotNullParameter(accountsIds, "accountsIds");
                Intrinsics.checkNotNullParameter(additionalFilters, "additionalFilters");
                this.f92012a = accountsIds;
                this.f92013b = additionalFilters;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof AccountFilters)) {
                    return false;
                }
                AccountFilters accountFilters = (AccountFilters) obj2;
                return Intrinsics.f(this.f92012a, accountFilters.f92012a) && Intrinsics.f(this.f92013b, accountFilters.f92013b);
            }

            public final int hashCode() {
                return this.f92013b.hashCode() + (this.f92012a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = n.v(this.f92012a, dest);
                while (itV.hasNext()) {
                    dest.writeParcelable((Parcelable) itV.next(), i);
                }
                Iterator itV2 = n.v(this.f92013b, dest);
                while (itV2.hasNext()) {
                    dest.writeParcelable((Parcelable) itV2.next(), i);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ConfigurableFilter$SelectableFilters;", "Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ConfigurableFilter;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SelectableFilters extends ConfigurableFilter {

            @NotNull
            public static final Parcelable.Creator<SelectableFilters> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f92014a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    int iA = 0;
                    while (iA != i) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(SelectableFilterSection.CREATOR, parcel, arrayList, iA, 1);
                    }
                    return new SelectableFilters(arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SelectableFilters[i];
                }
            }

            public SelectableFilters(List filterSections) {
                Intrinsics.checkNotNullParameter(filterSections, "filterSections");
                this.f92014a = filterSections;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SelectableFilters) && Intrinsics.f(this.f92014a, ((SelectableFilters) obj2).f92014a);
            }

            public final int hashCode() {
                return this.f92014a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Iterator itV = p.a.v(this.f92014a, dest);
                while (itV.hasNext()) {
                    ((SelectableFilterSection) itV.next()).writeToParcel(dest, i);
                }
            }
        }

        private ConfigurableFilter() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$NoFilters;", "Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType;", "<init>", "()V", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoFilters extends TransactionsListFilterType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoFilters f92015a = new NoFilters();

        @NotNull
        public static final Parcelable.Creator<NoFilters> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoFilters.f92015a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoFilters[i];
            }
        }

        private NoFilters() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$SelectableFilterSection;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/transactions/api/navigation/d", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectableFilterSection implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelectableFilterSection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f92016a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f92017b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f92018c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TransactionFilterItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new SelectableFilterSection(arrayList, (Clause) parcel.readParcelable(SelectableFilterSection.class.getClassLoader()), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectableFilterSection[i];
            }
        }

        public SelectableFilterSection(List items, Clause sectionName, d selectionType) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(sectionName, "sectionName");
            Intrinsics.checkNotNullParameter(selectionType, "selectionType");
            this.f92016a = items;
            this.f92017b = sectionName;
            this.f92018c = selectionType;
        }

        public static SelectableFilterSection a(SelectableFilterSection selectableFilterSection, ArrayList items) {
            Clause sectionName = selectableFilterSection.f92017b;
            d selectionType = selectableFilterSection.f92018c;
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(sectionName, "sectionName");
            Intrinsics.checkNotNullParameter(selectionType, "selectionType");
            return new SelectableFilterSection(items, sectionName, selectionType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectableFilterSection)) {
                return false;
            }
            SelectableFilterSection selectableFilterSection = (SelectableFilterSection) obj2;
            return Intrinsics.f(this.f92016a, selectableFilterSection.f92016a) && Intrinsics.f(this.f92017b, selectableFilterSection.f92017b) && this.f92018c == selectableFilterSection.f92018c;
        }

        public final int hashCode() {
            return this.f92018c.hashCode() + p.a.a(this.f92016a.hashCode() * 31, 31, this.f92017b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f92016a, dest);
            while (itV.hasNext()) {
                ((TransactionFilterItem) itV.next()).writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f92017b, i);
            dest.writeString(this.f92018c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$TransactionFilterItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionFilterItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<TransactionFilterItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f92019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f92020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final i7 f92021c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionFilterItem(parcel.readInt() != 0, (Clause) parcel.readParcelable(TransactionFilterItem.class.getClassLoader()), (i7) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionFilterItem[i];
            }
        }

        public TransactionFilterItem(boolean z, Clause title, i7 i7Var) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f92019a = z;
            this.f92020b = title;
            this.f92021c = i7Var;
        }

        public static TransactionFilterItem a(TransactionFilterItem transactionFilterItem, boolean z) {
            Clause title = transactionFilterItem.f92020b;
            i7 i7Var = transactionFilterItem.f92021c;
            transactionFilterItem.getClass();
            Intrinsics.checkNotNullParameter(title, "title");
            return new TransactionFilterItem(z, title, i7Var);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionFilterItem)) {
                return false;
            }
            TransactionFilterItem transactionFilterItem = (TransactionFilterItem) obj2;
            return this.f92019a == transactionFilterItem.f92019a && Intrinsics.f(this.f92020b, transactionFilterItem.f92020b) && Intrinsics.f(this.f92021c, transactionFilterItem.f92021c);
        }

        public final int hashCode() {
            int iA = p.a.a(Boolean.hashCode(this.f92019a) * 31, 31, this.f92020b);
            i7 i7Var = this.f92021c;
            return iA + (i7Var == null ? 0 : i7Var.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f92019a ? 1 : 0);
            dest.writeParcelable(this.f92020b, i);
            dest.writeSerializable(this.f92021c);
        }
    }

    private TransactionsListFilterType() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ByAccounts;", "Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByAccounts extends TransactionsListFilterType {

        @NotNull
        public static final Parcelable.Creator<ByAccounts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConfigurableFilter.AccountFilters f92007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransactionContext f92008b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ByAccounts(ConfigurableFilter.AccountFilters.CREATOR.createFromParcel(parcel), (TransactionContext) parcel.readParcelable(ByAccounts.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByAccounts[i];
            }
        }

        public ByAccounts(ConfigurableFilter.AccountFilters accountsFilter, TransactionContext transactionContext) {
            Intrinsics.checkNotNullParameter(accountsFilter, "accountsFilter");
            this.f92007a = accountsFilter;
            this.f92008b = transactionContext;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ByAccounts)) {
                return false;
            }
            ByAccounts byAccounts = (ByAccounts) obj2;
            return Intrinsics.f(this.f92007a, byAccounts.f92007a) && Intrinsics.f(this.f92008b, byAccounts.f92008b);
        }

        public final int hashCode() {
            int iHashCode = this.f92007a.hashCode() * 31;
            TransactionContext transactionContext = this.f92008b;
            return iHashCode + (transactionContext == null ? 0 : transactionContext.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f92007a.writeToParcel(dest, i);
            dest.writeParcelable(this.f92008b, i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ByAccounts(ProductAccountDescriptor$Value.Main accountId, TransactionContext transactionContext) {
            this(new ConfigurableFilter.AccountFilters(y0.b(accountId), h0.f322473a), transactionContext);
            Intrinsics.checkNotNullParameter(accountId, "accountId");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType$ByTransactionsFilter;", "Lcom/revolut/feature/transactions/api/navigation/TransactionsListFilterType;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ByTransactionsFilter extends TransactionsListFilterType {

        @NotNull
        public static final Parcelable.Creator<ByTransactionsFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i7 f92009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransactionContext f92010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f92011c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                i7 i7Var = (i7) parcel.readSerializable();
                TransactionContext transactionContext = (TransactionContext) parcel.readParcelable(ByTransactionsFilter.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SelectableFilterSection.CREATOR, parcel, arrayList, iA, 1);
                }
                return new ByTransactionsFilter(i7Var, transactionContext, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ByTransactionsFilter[i];
            }
        }

        public ByTransactionsFilter(i7 transactionsFilter, TransactionContext transactionContext, List selectableTransactionsFilters) {
            Intrinsics.checkNotNullParameter(transactionsFilter, "transactionsFilter");
            Intrinsics.checkNotNullParameter(transactionContext, "transactionContext");
            Intrinsics.checkNotNullParameter(selectableTransactionsFilters, "selectableTransactionsFilters");
            this.f92009a = transactionsFilter;
            this.f92010b = transactionContext;
            this.f92011c = selectableTransactionsFilters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ByTransactionsFilter)) {
                return false;
            }
            ByTransactionsFilter byTransactionsFilter = (ByTransactionsFilter) obj2;
            return Intrinsics.f(this.f92009a, byTransactionsFilter.f92009a) && Intrinsics.f(this.f92010b, byTransactionsFilter.f92010b) && Intrinsics.f(this.f92011c, byTransactionsFilter.f92011c);
        }

        public final int hashCode() {
            return this.f92011c.hashCode() + ((this.f92010b.hashCode() + (this.f92009a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92009a);
            dest.writeParcelable(this.f92010b, i);
            Iterator itV = p.a.v(this.f92011c, dest);
            while (itV.hasNext()) {
                ((SelectableFilterSection) itV.next()).writeToParcel(dest, i);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ByTransactionsFilter(i7 i7Var, TransactionContext transactionContext, List list, int i) {
            if ((i & 2) != 0) {
                TransactionContext.INSTANCE.getClass();
                transactionContext = TransactionContext.f60264c;
            }
            this(i7Var, transactionContext, (i & 4) != 0 ? f0.f322471a : list);
        }
    }
}
