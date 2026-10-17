package com.revolut.retail.feature.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.retail.feature.api.AnalyticsAccount;
import ehe.n;
import hx7.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0004\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection;", "Landroid/os/Parcelable;", "Companion", "TotalWealth", "Spending", "Savings", "Pro", "a", "Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection$Pro;", "Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection$Savings;", "Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection$Spending;", "Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection$TotalWealth;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnalyticsAccountsSelection extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f99209a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection$Pro;", "Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pro implements AnalyticsAccountsSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f99205a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.retail.feature.api.AnalyticsAccountsSelection$Pro$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Pro a(Set accounts) throws Throwable {
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                if (accounts.isEmpty()) {
                    e.n(new IllegalArgumentException("AnalyticsAccounts set should not be empty set of pro"));
                    return new Pro(y0.b(AnalyticsAccount.Pro.All.f99196a));
                }
                Set set = accounts;
                boolean z = false;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator it8 = set.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        if (((AnalyticsAccount.Pro) it8.next()) instanceof AnalyticsAccount.Pro.All) {
                            z = true;
                            break;
                        }
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj2 : set) {
                    if ((((AnalyticsAccount.Pro) obj2) instanceof AnalyticsAccount.Pro.All) || !z) {
                        linkedHashSet.add(obj2);
                    }
                }
                return new Pro(linkedHashSet);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(Pro.class, parcel, linkedHashSet, iE, 1);
                }
                return new Pro(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        public Pro(Set set) {
            this.f99205a = set;
        }

        @Override // com.revolut.retail.feature.api.AnalyticsAccountsSelection
        /* JADX INFO: renamed from: R5, reason: from getter */
        public final Set getF99208a() {
            return this.f99205a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pro) && Intrinsics.f(this.f99205a, ((Pro) obj2).f99205a);
        }

        public final int hashCode() {
            return this.f99205a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f99205a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection$Savings;", "Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Savings implements AnalyticsAccountsSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f99206a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Savings> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.retail.feature.api.AnalyticsAccountsSelection$Savings$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Savings a(Set accounts) throws Throwable {
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                if (accounts.isEmpty()) {
                    e.n(new IllegalArgumentException("AnalyticsAccounts set should not be empty set of savings"));
                    return new Savings(y0.b(AnalyticsAccount.Savings.PersonalAll.f99203a));
                }
                Iterator it8 = accounts.iterator();
                boolean z = false;
                boolean z3 = false;
                while (it8.hasNext()) {
                    AnalyticsAccount.Savings savings = (AnalyticsAccount.Savings) it8.next();
                    if (savings instanceof AnalyticsAccount.Savings.PersonalAll) {
                        z = true;
                    } else if (savings instanceof AnalyticsAccount.Savings.JointAll) {
                        z3 = true;
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj2 : accounts) {
                    AnalyticsAccount.Savings savings2 = (AnalyticsAccount.Savings) obj2;
                    if (savings2 instanceof AnalyticsAccount.Savings.PersonalIndividual) {
                        if (!z) {
                            linkedHashSet.add(obj2);
                        }
                    } else if (!(savings2 instanceof AnalyticsAccount.Savings.JointIndividual) || !z3) {
                        linkedHashSet.add(obj2);
                    }
                }
                return new Savings(linkedHashSet);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(Savings.class, parcel, linkedHashSet, iE, 1);
                }
                return new Savings(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Savings[i];
            }
        }

        public Savings(Set set) {
            this.f99206a = set;
        }

        @Override // com.revolut.retail.feature.api.AnalyticsAccountsSelection
        /* JADX INFO: renamed from: R5, reason: from getter */
        public final Set getF99208a() {
            return this.f99206a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Savings) && Intrinsics.f(this.f99206a, ((Savings) obj2).f99206a);
        }

        public final int hashCode() {
            return this.f99206a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f99206a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection$Spending;", "Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Spending implements AnalyticsAccountsSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f99207a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<Spending> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.retail.feature.api.AnalyticsAccountsSelection$Spending$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Spending a(Set accounts) throws Throwable {
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                if (accounts.isEmpty()) {
                    e.n(new IllegalArgumentException("AnalyticsAccounts set should not be empty set of spending"));
                    return new Spending(y0.b(AnalyticsAccount.Personal.All.f99192a));
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it8 = accounts.iterator();
                boolean z = false;
                boolean z3 = false;
                while (it8.hasNext()) {
                    SpendingAnalyticsAccount spendingAnalyticsAccount = (SpendingAnalyticsAccount) it8.next();
                    if (spendingAnalyticsAccount instanceof AnalyticsAccount.Personal.All) {
                        z = true;
                    } else if (spendingAnalyticsAccount instanceof AnalyticsAccount.Joint.All) {
                        z3 = true;
                    } else if (spendingAnalyticsAccount instanceof AnalyticsAccount.Junior.All) {
                        linkedHashSet.add(((AnalyticsAccount.Junior.All) spendingAnalyticsAccount).f99184a);
                    }
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                for (Object obj2 : accounts) {
                    SpendingAnalyticsAccount spendingAnalyticsAccount2 = (SpendingAnalyticsAccount) obj2;
                    if (spendingAnalyticsAccount2 instanceof AnalyticsAccount.Personal) {
                        if ((spendingAnalyticsAccount2 instanceof AnalyticsAccount.Personal.All) || !z) {
                            linkedHashSet2.add(obj2);
                        }
                    } else if (spendingAnalyticsAccount2 instanceof AnalyticsAccount.Joint) {
                        if ((spendingAnalyticsAccount2 instanceof AnalyticsAccount.Joint.All) || !z3) {
                            linkedHashSet2.add(obj2);
                        }
                    } else if (!(spendingAnalyticsAccount2 instanceof AnalyticsAccount.Junior) || (spendingAnalyticsAccount2 instanceof AnalyticsAccount.Junior.All) || !linkedHashSet.contains(((AnalyticsAccount.Junior) spendingAnalyticsAccount2).getF99186a())) {
                        linkedHashSet2.add(obj2);
                    }
                }
                return new Spending(linkedHashSet2);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(Spending.class, parcel, linkedHashSet, iE, 1);
                }
                return new Spending(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Spending[i];
            }
        }

        public Spending(Set set) {
            this.f99207a = set;
        }

        @Override // com.revolut.retail.feature.api.AnalyticsAccountsSelection
        /* JADX INFO: renamed from: R5, reason: from getter */
        public final Set getF99208a() {
            return this.f99207a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Spending) && Intrinsics.f(this.f99207a, ((Spending) obj2).f99207a);
        }

        public final int hashCode() {
            return this.f99207a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f99207a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection$TotalWealth;", "Lcom/revolut/retail/feature/api/AnalyticsAccountsSelection;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TotalWealth implements AnalyticsAccountsSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f99208a;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        public static final Parcelable.Creator<TotalWealth> CREATOR = new b();

        /* JADX INFO: renamed from: com.revolut.retail.feature.api.AnalyticsAccountsSelection$TotalWealth$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static TotalWealth a(Set accounts) throws Throwable {
                Intrinsics.checkNotNullParameter(accounts, "accounts");
                boolean zIsEmpty = accounts.isEmpty();
                AnalyticsAccount.Personal.All all2 = AnalyticsAccount.Personal.All.f99192a;
                if (zIsEmpty) {
                    e.n(new IllegalArgumentException("Total wealth accounts should not be empty"));
                    return new TotalWealth(y0.b(all2));
                }
                Set linkedHashSet = new LinkedHashSet();
                for (Object obj2 : accounts) {
                    AnalyticsAccount analyticsAccount = (AnalyticsAccount) obj2;
                    if ((analyticsAccount instanceof AnalyticsAccount.Personal.All) || (analyticsAccount instanceof AnalyticsAccount.Joint.All) || (analyticsAccount instanceof AnalyticsAccount.Pro.All) || (analyticsAccount instanceof AnalyticsAccount.Junior.All) || (analyticsAccount instanceof AnalyticsAccount.Linked)) {
                        linkedHashSet.add(obj2);
                    } else if (!(analyticsAccount instanceof AnalyticsAccount.Pro.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JointAll) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JointIndividual) && !(analyticsAccount instanceof AnalyticsAccount.Savings.JuniorSaving) && !Intrinsics.f(analyticsAccount, AnalyticsAccount.Savings.PersonalAll.f99203a) && !(analyticsAccount instanceof AnalyticsAccount.Savings.PersonalIndividual) && !(analyticsAccount instanceof AnalyticsAccount.Joint.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Joint.Subaccount) && !(analyticsAccount instanceof AnalyticsAccount.Junior.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Personal.CreditCard) && !(analyticsAccount instanceof AnalyticsAccount.Personal.CurrencyPocket) && !(analyticsAccount instanceof AnalyticsAccount.Personal.Subaccount)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (linkedHashSet.isEmpty()) {
                    linkedHashSet = y0.b(all2);
                }
                return new TotalWealth(linkedHashSet);
            }
        }

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(TotalWealth.class, parcel, linkedHashSet, iE, 1);
                }
                return new TotalWealth(linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TotalWealth[i];
            }
        }

        public TotalWealth(Set set) {
            this.f99208a = set;
        }

        @Override // com.revolut.retail.feature.api.AnalyticsAccountsSelection
        /* JADX INFO: renamed from: R5, reason: from getter */
        public final Set getF99208a() {
            return this.f99208a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TotalWealth) && Intrinsics.f(this.f99208a, ((TotalWealth) obj2).f99208a);
        }

        public final int hashCode() {
            return this.f99208a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f99208a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    /* JADX INFO: renamed from: com.revolut.retail.feature.api.AnalyticsAccountsSelection$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f99209a = new Companion();

        private Companion() {
        }

        public static AnalyticsAccountsSelection a(AnalyticsAccount analyticsAccount) {
            Intrinsics.checkNotNullParameter(analyticsAccount, "analyticsAccount");
            if (analyticsAccount instanceof SpendingAnalyticsAccount) {
                Spending.Companion companion = Spending.INSTANCE;
                Set setB = y0.b(analyticsAccount);
                companion.getClass();
                return Spending.Companion.a(setB);
            }
            if (analyticsAccount instanceof AnalyticsAccount.Savings) {
                Savings.Companion companion2 = Savings.INSTANCE;
                Set setB2 = y0.b(analyticsAccount);
                companion2.getClass();
                return Savings.Companion.a(setB2);
            }
            if (!(analyticsAccount instanceof AnalyticsAccount.Pro)) {
                throw new NoWhenBranchMatchedException();
            }
            Pro.Companion companion3 = Pro.INSTANCE;
            Set setB3 = y0.b(analyticsAccount);
            companion3.getClass();
            return Pro.Companion.a(setB3);
        }
    }

    /* JADX INFO: renamed from: R5 */
    Set getF99208a();
}
