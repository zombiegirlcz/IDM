package com.revolut.retail.feature.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import io3.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount;", "Landroid/os/Parcelable;", "Personal", "Joint", "Savings", "Junior", "Pro", "Linked", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Pro;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings;", "Lcom/revolut/retail/feature/api/SpendingAnalyticsAccount;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AnalyticsAccount extends Parcelable {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Joint;", "Lcom/revolut/retail/feature/api/SpendingAnalyticsAccount;", "All", "Subaccount", "CurrencyPocket", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Joint$All;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Joint$CurrencyPocket;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Joint$Subaccount;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Joint extends SpendingAnalyticsAccount {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Joint$All;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Joint;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class All implements Joint {

            @NotNull
            public static final Parcelable.Creator<All> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AccountId.Joint f99179a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new All((AccountId.Joint) parcel.readParcelable(All.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new All[i];
                }
            }

            public All(AccountId.Joint accountId) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f99179a = accountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof All) && Intrinsics.f(this.f99179a, ((All) obj2).f99179a);
            }

            @Override // com.revolut.retail.feature.api.AnalyticsAccount.Joint
            /* JADX INFO: renamed from: getAccountId, reason: from getter */
            public final AccountId.Joint getF99182a() {
                return this.f99179a;
            }

            public final int hashCode() {
                return this.f99179a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f99179a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Joint$CurrencyPocket;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Joint;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CurrencyPocket implements Joint {

            @NotNull
            public static final Parcelable.Creator<CurrencyPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AccountId.Joint f99180a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99181b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CurrencyPocket((AccountId.Joint) parcel.readParcelable(CurrencyPocket.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CurrencyPocket[i];
                }
            }

            public CurrencyPocket(AccountId.Joint accountId, String pocketId) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f99180a = accountId;
                this.f99181b = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CurrencyPocket)) {
                    return false;
                }
                CurrencyPocket currencyPocket = (CurrencyPocket) obj2;
                return Intrinsics.f(this.f99180a, currencyPocket.f99180a) && Intrinsics.f(this.f99181b, currencyPocket.f99181b);
            }

            @Override // com.revolut.retail.feature.api.AnalyticsAccount.Joint
            /* JADX INFO: renamed from: getAccountId, reason: from getter */
            public final AccountId.Joint getF99182a() {
                return this.f99180a;
            }

            public final int hashCode() {
                return this.f99181b.hashCode() + (this.f99180a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f99180a, i);
                dest.writeString(this.f99181b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Joint$Subaccount;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Joint;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Subaccount implements Joint {

            @NotNull
            public static final Parcelable.Creator<Subaccount> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AccountId.Joint f99182a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99183b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Subaccount((AccountId.Joint) parcel.readParcelable(Subaccount.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Subaccount[i];
                }
            }

            public Subaccount(AccountId.Joint accountId, String subaccountId) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                this.f99182a = accountId;
                this.f99183b = subaccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Subaccount)) {
                    return false;
                }
                Subaccount subaccount = (Subaccount) obj2;
                return Intrinsics.f(this.f99182a, subaccount.f99182a) && Intrinsics.f(this.f99183b, subaccount.f99183b);
            }

            @Override // com.revolut.retail.feature.api.AnalyticsAccount.Joint
            /* JADX INFO: renamed from: getAccountId, reason: from getter */
            public final AccountId.Joint getF99182a() {
                return this.f99182a;
            }

            public final int hashCode() {
                return this.f99183b.hashCode() + (this.f99182a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f99182a, i);
                dest.writeString(this.f99183b);
            }
        }

        /* JADX INFO: renamed from: getAccountId */
        AccountId.Joint getF99182a();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Junior;", "Lcom/revolut/retail/feature/api/SpendingAnalyticsAccount;", "All", "CurrencyPocket", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Junior$All;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Junior$CurrencyPocket;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Junior extends SpendingAnalyticsAccount {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Junior$All;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Junior;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class All implements Junior {

            @NotNull
            public static final Parcelable.Creator<All> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99184a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99185b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new All(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new All[i];
                }
            }

            public All(String juniorId, String firstName) {
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                this.f99184a = juniorId;
                this.f99185b = firstName;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof All)) {
                    return false;
                }
                All all2 = (All) obj2;
                return Intrinsics.f(this.f99184a, all2.f99184a) && Intrinsics.f(this.f99185b, all2.f99185b);
            }

            @Override // com.revolut.retail.feature.api.AnalyticsAccount.Junior
            /* JADX INFO: renamed from: getFirstName, reason: from getter */
            public final String getF99187b() {
                return this.f99185b;
            }

            @Override // com.revolut.retail.feature.api.AnalyticsAccount.Junior
            /* JADX INFO: renamed from: getJuniorId, reason: from getter */
            public final String getF99186a() {
                return this.f99184a;
            }

            public final int hashCode() {
                return this.f99185b.hashCode() + (this.f99184a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99184a);
                dest.writeString(this.f99185b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Junior$CurrencyPocket;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Junior;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CurrencyPocket implements Junior {

            @NotNull
            public static final Parcelable.Creator<CurrencyPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99187b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f99188c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CurrencyPocket(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CurrencyPocket[i];
                }
            }

            public CurrencyPocket(String juniorId, String firstName, String pocketId) {
                Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f99186a = juniorId;
                this.f99187b = firstName;
                this.f99188c = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CurrencyPocket)) {
                    return false;
                }
                CurrencyPocket currencyPocket = (CurrencyPocket) obj2;
                return Intrinsics.f(this.f99186a, currencyPocket.f99186a) && Intrinsics.f(this.f99187b, currencyPocket.f99187b) && Intrinsics.f(this.f99188c, currencyPocket.f99188c);
            }

            @Override // com.revolut.retail.feature.api.AnalyticsAccount.Junior
            /* JADX INFO: renamed from: getFirstName, reason: from getter */
            public final String getF99187b() {
                return this.f99187b;
            }

            @Override // com.revolut.retail.feature.api.AnalyticsAccount.Junior
            /* JADX INFO: renamed from: getJuniorId, reason: from getter */
            public final String getF99186a() {
                return this.f99186a;
            }

            public final int hashCode() {
                return this.f99188c.hashCode() + p.a.c(this.f99186a.hashCode() * 31, 31, this.f99187b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99186a);
                dest.writeString(this.f99187b);
                dest.writeString(this.f99188c);
            }
        }

        /* JADX INFO: renamed from: getFirstName */
        String getF99187b();

        /* JADX INFO: renamed from: getJuniorId */
        String getF99186a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Linked;", "Lcom/revolut/retail/feature/api/SpendingAnalyticsAccount;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Linked implements SpendingAnalyticsAccount {

        @NotNull
        public static final Parcelable.Creator<Linked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f99190b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f99191c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Linked((b) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Linked[i];
            }
        }

        public Linked(b bVar, String pocketId, String str, String pocketName) {
            Intrinsics.checkNotNullParameter(pocketId, "pocketId");
            Intrinsics.checkNotNullParameter(pocketName, "pocketName");
            this.f99189a = pocketId;
            this.f99190b = bVar;
            this.f99191c = str;
            this.d = pocketName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Linked)) {
                return false;
            }
            Linked linked = (Linked) obj2;
            return Intrinsics.f(this.f99189a, linked.f99189a) && Intrinsics.f(this.f99190b, linked.f99190b) && Intrinsics.f(this.f99191c, linked.f99191c) && Intrinsics.f(this.d, linked.d);
        }

        public final int hashCode() {
            int iHashCode = this.f99189a.hashCode() * 31;
            b bVar = this.f99190b;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f99191c;
            return this.d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99189a);
            dest.writeSerializable(this.f99190b);
            dest.writeString(this.f99191c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal;", "Lcom/revolut/retail/feature/api/SpendingAnalyticsAccount;", "All", "Subaccount", "CurrencyPocket", "CreditCard", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal$All;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal$CreditCard;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal$CurrencyPocket;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal$Subaccount;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Personal extends SpendingAnalyticsAccount {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal$All;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal;", "<init>", "()V", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class All implements Personal {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final All f99192a = new All();

            @NotNull
            public static final Parcelable.Creator<All> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return All.f99192a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new All[i];
                }
            }

            private All() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal$CreditCard;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CreditCard implements Personal {

            @NotNull
            public static final Parcelable.Creator<CreditCard> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99193a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CreditCard(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CreditCard[i];
                }
            }

            public CreditCard(String pocketId) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f99193a = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CreditCard) && Intrinsics.f(this.f99193a, ((CreditCard) obj2).f99193a);
            }

            public final int hashCode() {
                return this.f99193a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99193a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal$CurrencyPocket;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CurrencyPocket implements Personal {

            @NotNull
            public static final Parcelable.Creator<CurrencyPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99194a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CurrencyPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CurrencyPocket[i];
                }
            }

            public CurrencyPocket(String pocketId) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f99194a = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CurrencyPocket) && Intrinsics.f(this.f99194a, ((CurrencyPocket) obj2).f99194a);
            }

            public final int hashCode() {
                return this.f99194a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99194a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal$Subaccount;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Personal;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Subaccount implements Personal {

            @NotNull
            public static final Parcelable.Creator<Subaccount> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99195a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Subaccount(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Subaccount[i];
                }
            }

            public Subaccount(String subaccountId) {
                Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
                this.f99195a = subaccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Subaccount) && Intrinsics.f(this.f99195a, ((Subaccount) obj2).f99195a);
            }

            public final int hashCode() {
                return this.f99195a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99195a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Pro;", "Lcom/revolut/retail/feature/api/AnalyticsAccount;", "All", "CurrencyPocket", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Pro$All;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Pro$CurrencyPocket;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Pro extends AnalyticsAccount {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Pro$All;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Pro;", "<init>", "()V", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class All implements Pro {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final All f99196a = new All();

            @NotNull
            public static final Parcelable.Creator<All> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return All.f99196a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new All[i];
                }
            }

            private All() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Pro$CurrencyPocket;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Pro;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CurrencyPocket implements Pro {

            @NotNull
            public static final Parcelable.Creator<CurrencyPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99197a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CurrencyPocket(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CurrencyPocket[i];
                }
            }

            public CurrencyPocket(String pocketId) {
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                this.f99197a = pocketId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CurrencyPocket) && Intrinsics.f(this.f99197a, ((CurrencyPocket) obj2).f99197a);
            }

            public final int hashCode() {
                return this.f99197a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99197a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings;", "Lcom/revolut/retail/feature/api/AnalyticsAccount;", "PersonalIndividual", "PersonalAll", "JuniorSaving", "JointIndividual", "JointAll", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings$JointAll;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings$JointIndividual;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings$JuniorSaving;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings$PersonalAll;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings$PersonalIndividual;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Savings extends AnalyticsAccount {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings$JointAll;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JointAll implements Savings {

            @NotNull
            public static final Parcelable.Creator<JointAll> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AccountId.Joint f99198a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new JointAll((AccountId.Joint) parcel.readParcelable(JointAll.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new JointAll[i];
                }
            }

            public JointAll(AccountId.Joint jointAccountId) {
                Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
                this.f99198a = jointAccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof JointAll) && Intrinsics.f(this.f99198a, ((JointAll) obj2).f99198a);
            }

            public final int hashCode() {
                return this.f99198a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f99198a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings$JointIndividual;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JointIndividual implements Savings {

            @NotNull
            public static final Parcelable.Creator<JointIndividual> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AccountId.Joint f99199a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99200b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new JointIndividual((AccountId.Joint) parcel.readParcelable(JointIndividual.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new JointIndividual[i];
                }
            }

            public JointIndividual(AccountId.Joint jointAccountId, String savingsAccountId) {
                Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
                Intrinsics.checkNotNullParameter(savingsAccountId, "savingsAccountId");
                this.f99199a = jointAccountId;
                this.f99200b = savingsAccountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof JointIndividual)) {
                    return false;
                }
                JointIndividual jointIndividual = (JointIndividual) obj2;
                return Intrinsics.f(this.f99199a, jointIndividual.f99199a) && Intrinsics.f(this.f99200b, jointIndividual.f99200b);
            }

            public final int hashCode() {
                return this.f99200b.hashCode() + (this.f99199a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f99199a, i);
                dest.writeString(this.f99200b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings$JuniorSaving;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class JuniorSaving implements Savings {

            @NotNull
            public static final Parcelable.Creator<JuniorSaving> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99202b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new JuniorSaving(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new JuniorSaving[i];
                }
            }

            public JuniorSaving(String accountId, String ownerId) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                this.f99201a = accountId;
                this.f99202b = ownerId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof JuniorSaving)) {
                    return false;
                }
                JuniorSaving juniorSaving = (JuniorSaving) obj2;
                return Intrinsics.f(this.f99201a, juniorSaving.f99201a) && Intrinsics.f(this.f99202b, juniorSaving.f99202b);
            }

            public final int hashCode() {
                return this.f99202b.hashCode() + (this.f99201a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99201a);
                dest.writeString(this.f99202b);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings$PersonalAll;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings;", "<init>", "()V", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class PersonalAll implements Savings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final PersonalAll f99203a = new PersonalAll();

            @NotNull
            public static final Parcelable.Creator<PersonalAll> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return PersonalAll.f99203a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PersonalAll[i];
                }
            }

            private PersonalAll() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings$PersonalIndividual;", "Lcom/revolut/retail/feature/api/AnalyticsAccount$Savings;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PersonalIndividual implements Savings {

            @NotNull
            public static final Parcelable.Creator<PersonalIndividual> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99204a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PersonalIndividual(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PersonalIndividual[i];
                }
            }

            public PersonalIndividual(String accountId) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f99204a = accountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PersonalIndividual) && Intrinsics.f(this.f99204a, ((PersonalIndividual) obj2).f99204a);
            }

            public final int hashCode() {
                return this.f99204a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99204a);
            }
        }
    }
}
