package com.revolut.shared.feature.move_money.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u001b\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "Landroid/os/Parcelable;", "<init>", "()V", "FiatAccountsAll", "FiatCurrencyAccount", "InvestCashHolding", "RevXFiatAccount", "CryptoCurrencyAccount", "CryptoCurrencyNonExistentAccount", "CommodityAccount", "CommodityCurrencyNonExistentAccount", "CurrencyAccount", "JointAll", "JointAccount", "ProAll", "ProAccount", "ProVaultAccount", "CreditCardAccount", "SavingsAccount", "JuniorSavingsAccount", "JointSavingsAccount", "VaultAccount", "JuniorVaultAccount", "TeenVaultAccount", "JointVaultAccount", "RevPointsPocket", "FiatCurrencyJuniorAccount", "FiatCurrencyTeenAccount", "SpotMarginCollateralAccount", "FuturesCollateralAccount", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CommodityAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CommodityCurrencyNonExistentAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CreditCardAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CryptoCurrencyAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CryptoCurrencyNonExistentAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CurrencyAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$FiatAccountsAll;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$FiatCurrencyAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$FiatCurrencyJuniorAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$FiatCurrencyTeenAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$FuturesCollateralAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$InvestCashHolding;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JointAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JointAll;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JointSavingsAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JointVaultAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JuniorSavingsAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JuniorVaultAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$ProAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$ProAll;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$ProVaultAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$RevPointsPocket;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$RevXFiatAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$SavingsAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$SpotMarginCollateralAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$TeenVaultAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$VaultAccount;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class StartUpPocket implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CommodityAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CommodityAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<CommodityAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104841a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CommodityAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommodityAccount[i];
            }
        }

        public CommodityAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104841a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CommodityAccount) && Intrinsics.f(this.f104841a, ((CommodityAccount) obj2).f104841a);
        }

        public final int hashCode() {
            return this.f104841a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104841a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CommodityCurrencyNonExistentAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class CommodityCurrencyNonExistentAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<CommodityCurrencyNonExistentAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f104842a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CommodityCurrencyNonExistentAccount((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommodityCurrencyNonExistentAccount[i];
            }
        }

        public CommodityCurrencyNonExistentAccount(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f104842a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CommodityCurrencyNonExistentAccount) && Intrinsics.f(this.f104842a, ((CommodityCurrencyNonExistentAccount) obj2).f104842a);
        }

        public final int hashCode() {
            return this.f104842a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104842a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CreditCardAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCardAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<CreditCardAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104843a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCardAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardAccount[i];
            }
        }

        public CreditCardAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104843a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreditCardAccount) && Intrinsics.f(this.f104843a, ((CreditCardAccount) obj2).f104843a);
        }

        public final int hashCode() {
            return this.f104843a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104843a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CryptoCurrencyAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoCurrencyAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<CryptoCurrencyAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104844a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoCurrencyAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoCurrencyAccount[i];
            }
        }

        public CryptoCurrencyAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104844a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoCurrencyAccount) && Intrinsics.f(this.f104844a, ((CryptoCurrencyAccount) obj2).f104844a);
        }

        public final int hashCode() {
            return this.f104844a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104844a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CryptoCurrencyNonExistentAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class CryptoCurrencyNonExistentAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<CryptoCurrencyNonExistentAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f104845a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoCurrencyNonExistentAccount((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoCurrencyNonExistentAccount[i];
            }
        }

        public CryptoCurrencyNonExistentAccount(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f104845a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoCurrencyNonExistentAccount) && Intrinsics.f(this.f104845a, ((CryptoCurrencyNonExistentAccount) obj2).f104845a);
        }

        public final int hashCode() {
            return this.f104845a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104845a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$CurrencyAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<CurrencyAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f104846a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyAccount((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyAccount[i];
            }
        }

        public CurrencyAccount(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f104846a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CurrencyAccount) && Intrinsics.f(this.f104846a, ((CurrencyAccount) obj2).f104846a);
        }

        public final int hashCode() {
            return this.f104846a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104846a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$FiatAccountsAll;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "<init>", "()V", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FiatAccountsAll extends StartUpPocket {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FiatAccountsAll f104847a = new FiatAccountsAll();

        @NotNull
        public static final Parcelable.Creator<FiatAccountsAll> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FiatAccountsAll.f104847a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FiatAccountsAll[i];
            }
        }

        private FiatAccountsAll() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$FiatCurrencyAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FiatCurrencyAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<FiatCurrencyAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104848a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FiatCurrencyAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FiatCurrencyAccount[i];
            }
        }

        public FiatCurrencyAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104848a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FiatCurrencyAccount) && Intrinsics.f(this.f104848a, ((FiatCurrencyAccount) obj2).f104848a);
        }

        public final int hashCode() {
            return this.f104848a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104848a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$FiatCurrencyJuniorAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FiatCurrencyJuniorAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<FiatCurrencyJuniorAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104849a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FiatCurrencyJuniorAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FiatCurrencyJuniorAccount[i];
            }
        }

        public FiatCurrencyJuniorAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104849a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FiatCurrencyJuniorAccount) && Intrinsics.f(this.f104849a, ((FiatCurrencyJuniorAccount) obj2).f104849a);
        }

        public final int hashCode() {
            return this.f104849a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104849a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$FiatCurrencyTeenAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FiatCurrencyTeenAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<FiatCurrencyTeenAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104850a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FiatCurrencyTeenAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FiatCurrencyTeenAccount[i];
            }
        }

        public FiatCurrencyTeenAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104850a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FiatCurrencyTeenAccount) && Intrinsics.f(this.f104850a, ((FiatCurrencyTeenAccount) obj2).f104850a);
        }

        public final int hashCode() {
            return this.f104850a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104850a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$FuturesCollateralAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FuturesCollateralAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<FuturesCollateralAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f104851a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FuturesCollateralAccount((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FuturesCollateralAccount[i];
            }
        }

        public FuturesCollateralAccount(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f104851a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FuturesCollateralAccount) && Intrinsics.f(this.f104851a, ((FuturesCollateralAccount) obj2).f104851a);
        }

        public final int hashCode() {
            return this.f104851a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104851a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$InvestCashHolding;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestCashHolding extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<InvestCashHolding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104852a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestCashHolding(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestCashHolding[i];
            }
        }

        public InvestCashHolding(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104852a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvestCashHolding) && Intrinsics.f(this.f104852a, ((InvestCashHolding) obj2).f104852a);
        }

        public final int hashCode() {
            return this.f104852a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104852a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JointAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<JointAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104853a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointAccount[i];
            }
        }

        public JointAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104853a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JointAccount) && Intrinsics.f(this.f104853a, ((JointAccount) obj2).f104853a);
        }

        public final int hashCode() {
            return this.f104853a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104853a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JointAll;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "<init>", "()V", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class JointAll extends StartUpPocket {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final JointAll f104854a = new JointAll();

        @NotNull
        public static final Parcelable.Creator<JointAll> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return JointAll.f104854a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointAll[i];
            }
        }

        private JointAll() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JointSavingsAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointSavingsAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<JointSavingsAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104855a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointSavingsAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointSavingsAccount[i];
            }
        }

        public JointSavingsAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104855a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JointSavingsAccount) && Intrinsics.f(this.f104855a, ((JointSavingsAccount) obj2).f104855a);
        }

        public final int hashCode() {
            return this.f104855a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104855a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JointVaultAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointVaultAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<JointVaultAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104856a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointVaultAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointVaultAccount[i];
            }
        }

        public JointVaultAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104856a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JointVaultAccount) && Intrinsics.f(this.f104856a, ((JointVaultAccount) obj2).f104856a);
        }

        public final int hashCode() {
            return this.f104856a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104856a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JuniorSavingsAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorSavingsAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<JuniorSavingsAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104857a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorSavingsAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorSavingsAccount[i];
            }
        }

        public JuniorSavingsAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104857a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JuniorSavingsAccount) && Intrinsics.f(this.f104857a, ((JuniorSavingsAccount) obj2).f104857a);
        }

        public final int hashCode() {
            return this.f104857a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104857a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$JuniorVaultAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorVaultAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<JuniorVaultAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104858a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorVaultAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorVaultAccount[i];
            }
        }

        public JuniorVaultAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104858a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JuniorVaultAccount) && Intrinsics.f(this.f104858a, ((JuniorVaultAccount) obj2).f104858a);
        }

        public final int hashCode() {
            return this.f104858a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104858a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$ProAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<ProAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104859a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProAccount[i];
            }
        }

        public ProAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104859a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProAccount) && Intrinsics.f(this.f104859a, ((ProAccount) obj2).f104859a);
        }

        public final int hashCode() {
            return this.f104859a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104859a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$ProAll;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "<init>", "()V", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProAll extends StartUpPocket {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProAll f104860a = new ProAll();

        @NotNull
        public static final Parcelable.Creator<ProAll> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProAll.f104860a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProAll[i];
            }
        }

        private ProAll() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$ProVaultAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProVaultAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<ProVaultAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104861a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProVaultAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProVaultAccount[i];
            }
        }

        public ProVaultAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104861a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProVaultAccount) && Intrinsics.f(this.f104861a, ((ProVaultAccount) obj2).f104861a);
        }

        public final int hashCode() {
            return this.f104861a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104861a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$RevPointsPocket;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "<init>", "()V", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsPocket extends StartUpPocket {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsPocket f104862a = new RevPointsPocket();

        @NotNull
        public static final Parcelable.Creator<RevPointsPocket> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsPocket.f104862a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsPocket[i];
            }
        }

        private RevPointsPocket() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$RevXFiatAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevXFiatAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<RevXFiatAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104863a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevXFiatAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevXFiatAccount[i];
            }
        }

        public RevXFiatAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104863a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevXFiatAccount) && Intrinsics.f(this.f104863a, ((RevXFiatAccount) obj2).f104863a);
        }

        public final int hashCode() {
            return this.f104863a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104863a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$SavingsAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<SavingsAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104864a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsAccount[i];
            }
        }

        public SavingsAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104864a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SavingsAccount) && Intrinsics.f(this.f104864a, ((SavingsAccount) obj2).f104864a);
        }

        public final int hashCode() {
            return this.f104864a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104864a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$SpotMarginCollateralAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SpotMarginCollateralAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<SpotMarginCollateralAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f104865a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SpotMarginCollateralAccount((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpotMarginCollateralAccount[i];
            }
        }

        public SpotMarginCollateralAccount(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f104865a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SpotMarginCollateralAccount) && Intrinsics.f(this.f104865a, ((SpotMarginCollateralAccount) obj2).f104865a);
        }

        public final int hashCode() {
            return this.f104865a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f104865a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$TeenVaultAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TeenVaultAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<TeenVaultAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104866a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TeenVaultAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TeenVaultAccount[i];
            }
        }

        public TeenVaultAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104866a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TeenVaultAccount) && Intrinsics.f(this.f104866a, ((TeenVaultAccount) obj2).f104866a);
        }

        public final int hashCode() {
            return this.f104866a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104866a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket$VaultAccount;", "Lcom/revolut/shared/feature/move_money/api/navigation/StartUpPocket;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VaultAccount extends StartUpPocket {

        @NotNull
        public static final Parcelable.Creator<VaultAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104867a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VaultAccount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VaultAccount[i];
            }
        }

        public VaultAccount(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f104867a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VaultAccount) && Intrinsics.f(this.f104867a, ((VaultAccount) obj2).f104867a);
        }

        public final int hashCode() {
            return this.f104867a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104867a);
        }
    }

    private StartUpPocket() {
    }
}
