package com.revolut.retail.feature.balance.picker.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.shared.feature.wealth.models.holding.CashHoldingAvailability;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dj0.d;
import h30.l;
import ip0.v7;
import k1j.a;
import kii.e;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.g0;
import pcd.s;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "Landroid/os/Parcelable;", "PocketBalanceWrapper", "VaultBalanceWrapper", "ProVaultBalanceWrapper", "SavingsBalanceWrapper", "CreditCardBalanceWrapper", "RevPointsPocketBalanceWrapper", "RevPointsAccountBalanceWrapper", "JuniorPocketBalanceWrapper", "JuniorVaultBalanceWrapper", "JuniorSavingsBalanceWrapper", "TeenPocketBalanceWrapper", "TeenVaultBalanceWrapper", "TradingAccountBalanceWrapper", "NonExistingCurrencyBalanceWrapper", "DeFiBalanceWrapper", "CollateralBalanceWrapper", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$CollateralBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$CreditCardBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$DeFiBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$JuniorPocketBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$JuniorSavingsBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$JuniorVaultBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$NonExistingCurrencyBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$PocketBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$ProVaultBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$RevPointsAccountBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$RevPointsPocketBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$SavingsBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$TeenPocketBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$TeenVaultBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$TradingAccountBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$VaultBalanceWrapper;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BalanceWrapper implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f99405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f99406c;
    public final AccountId d;
    public final String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f99407g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$CollateralBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CollateralBalanceWrapper extends BalanceWrapper {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99408h;
        public final xi0.b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f99409j;
        public final d k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final a f99410l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final d f99411m;

        @NotNull
        public static final Parcelable.Creator<CollateralBalanceWrapper> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CollateralBalanceWrapper(parcel.readString(), (xi0.b) parcel.readSerializable(), parcel.readString(), (d) parcel.readSerializable(), a.valueOf(parcel.readString()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollateralBalanceWrapper[i];
            }
        }

        public CollateralBalanceWrapper(String str, xi0.b bVar, String str2, d dVar, a aVar, d dVar2) {
            super(str, Long.valueOf(dVar.f115082a), bVar, AccountId.Personal.f51414a, str2, dVar2, aVar);
            this.f99408h = str;
            this.i = bVar;
            this.f99409j = str2;
            this.k = dVar;
            this.f99410l = aVar;
            this.f99411m = dVar2;
            if (aVar != a.SPOT_MARGIN_COLLATERAL && aVar != a.FUTURES_COLLATERAL) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99411m;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getF99407g() {
            return this.f99410l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CollateralBalanceWrapper)) {
                return false;
            }
            CollateralBalanceWrapper collateralBalanceWrapper = (CollateralBalanceWrapper) obj2;
            return Intrinsics.f(this.f99408h, collateralBalanceWrapper.f99408h) && Intrinsics.f(this.i, collateralBalanceWrapper.i) && Intrinsics.f(this.f99409j, collateralBalanceWrapper.f99409j) && Intrinsics.f(this.k, collateralBalanceWrapper.k) && this.f99410l == collateralBalanceWrapper.f99410l && Intrinsics.f(this.f99411m, collateralBalanceWrapper.f99411m);
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final xi0.b getF99406c() {
            return this.i;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getDisplayName, reason: from getter */
        public final String getE() {
            return this.f99409j;
        }

        public final int hashCode() {
            int iHashCode = (this.f99410l.hashCode() + v7.c(p.a.c(l.j(this.i, this.f99408h.hashCode() * 31, 31), 31, this.f99409j), 31, this.k)) * 31;
            d dVar = this.f99411m;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99408h);
            dest.writeSerializable(this.i);
            dest.writeString(this.f99409j);
            dest.writeSerializable(this.k);
            dest.writeString(this.f99410l.name());
            dest.writeSerializable(this.f99411m);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$CreditCardBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCardBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<CreditCardBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99412h;
        public final CreditCard i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f99413j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCardBalanceWrapper((CreditCard) parcel.readParcelable(CreditCardBalanceWrapper.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardBalanceWrapper[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreditCardBalanceWrapper(CreditCard creditCard, d dVar, String displayName) {
            super(creditCard.f69793b, Long.valueOf(creditCard.d.f115082a), creditCard.f69798l, AccountId.Personal.f51414a, displayName, dVar, k1j.a.CREDIT_CARDS);
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(creditCard, "creditCard");
            this.f99412h = displayName;
            this.i = creditCard;
            this.f99413j = dVar;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99413j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditCardBalanceWrapper)) {
                return false;
            }
            CreditCardBalanceWrapper creditCardBalanceWrapper = (CreditCardBalanceWrapper) obj2;
            return Intrinsics.f(this.f99412h, creditCardBalanceWrapper.f99412h) && Intrinsics.f(this.i, creditCardBalanceWrapper.i) && Intrinsics.f(this.f99413j, creditCardBalanceWrapper.f99413j);
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getDisplayName, reason: from getter */
        public final String getE() {
            return this.f99412h;
        }

        public final int hashCode() {
            int iHashCode = (this.i.hashCode() + (this.f99412h.hashCode() * 31)) * 31;
            d dVar = this.f99413j;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99412h);
            dest.writeParcelable(this.i, i);
            dest.writeSerializable(this.f99413j);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$DeFiBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeFiBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<DeFiBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99414h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f99415j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final ej0.b f99416l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final d f99417m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final d f99418n;
        public final String o;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeFiBalanceWrapper(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ej0.b) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeFiBalanceWrapper[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeFiBalanceWrapper(String scopedAssetId, String assetName, String assetTicker, String str, ej0.b assetBalance, d balanceMoney, d dVar, String accountName) {
            super(scopedAssetId, Long.valueOf(balanceMoney.f115082a), balanceMoney.f115083b, AccountId.Personal.f51414a, assetName, dVar, k1j.a.DEFI);
            Intrinsics.checkNotNullParameter(scopedAssetId, "scopedAssetId");
            Intrinsics.checkNotNullParameter(assetName, "assetName");
            Intrinsics.checkNotNullParameter(assetTicker, "assetTicker");
            Intrinsics.checkNotNullParameter(assetBalance, "assetBalance");
            Intrinsics.checkNotNullParameter(balanceMoney, "balanceMoney");
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            this.f99414h = scopedAssetId;
            this.i = assetName;
            this.f99415j = assetTicker;
            this.k = str;
            this.f99416l = assetBalance;
            this.f99417m = balanceMoney;
            this.f99418n = dVar;
            this.o = accountName;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99418n;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DeFiBalanceWrapper)) {
                return false;
            }
            DeFiBalanceWrapper deFiBalanceWrapper = (DeFiBalanceWrapper) obj2;
            return Intrinsics.f(this.f99414h, deFiBalanceWrapper.f99414h) && Intrinsics.f(this.i, deFiBalanceWrapper.i) && Intrinsics.f(this.f99415j, deFiBalanceWrapper.f99415j) && Intrinsics.f(this.k, deFiBalanceWrapper.k) && Intrinsics.f(this.f99416l, deFiBalanceWrapper.f99416l) && Intrinsics.f(this.f99417m, deFiBalanceWrapper.f99417m) && Intrinsics.f(this.f99418n, deFiBalanceWrapper.f99418n) && Intrinsics.f(this.o, deFiBalanceWrapper.o);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f99414h.hashCode() * 31, 31, this.i), 31, this.f99415j);
            String str = this.k;
            int iC2 = v7.c(org.bouncycastle.jcajce.provider.digest.a.d(this.f99416l, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f99417m);
            d dVar = this.f99418n;
            return this.o.hashCode() + ((iC2 + (dVar != null ? dVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99414h);
            dest.writeString(this.i);
            dest.writeString(this.f99415j);
            dest.writeString(this.k);
            dest.writeSerializable(this.f99416l);
            dest.writeSerializable(this.f99417m);
            dest.writeSerializable(this.f99418n);
            dest.writeString(this.o);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$JuniorPocketBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorPocketBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<JuniorPocketBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99419h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final io3.d f99420j;
        public final JuniorInfo k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f99421l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final d f99422m;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorPocketBalanceWrapper(parcel.readString(), parcel.readString(), (io3.d) parcel.readSerializable(), JuniorInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorPocketBalanceWrapper[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JuniorPocketBalanceWrapper(String id10, String name, io3.d pocket, JuniorInfo ownerInfo, boolean z, d balanceBaseCurrency) {
            super(id10, Long.valueOf(balanceBaseCurrency.f115082a), balanceBaseCurrency.f115083b, AccountId.Personal.f51414a, name, balanceBaseCurrency, k1j.a.YOUTH_POCKETS);
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(ownerInfo, "ownerInfo");
            Intrinsics.checkNotNullParameter(balanceBaseCurrency, "balanceBaseCurrency");
            this.f99419h = id10;
            this.i = name;
            this.f99420j = pocket;
            this.k = ownerInfo;
            this.f99421l = z;
            this.f99422m = balanceBaseCurrency;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99422m;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorPocketBalanceWrapper)) {
                return false;
            }
            JuniorPocketBalanceWrapper juniorPocketBalanceWrapper = (JuniorPocketBalanceWrapper) obj2;
            return Intrinsics.f(this.f99419h, juniorPocketBalanceWrapper.f99419h) && Intrinsics.f(this.i, juniorPocketBalanceWrapper.i) && Intrinsics.f(this.f99420j, juniorPocketBalanceWrapper.f99420j) && Intrinsics.f(this.k, juniorPocketBalanceWrapper.k) && this.f99421l == juniorPocketBalanceWrapper.f99421l && Intrinsics.f(this.f99422m, juniorPocketBalanceWrapper.f99422m);
        }

        public final int hashCode() {
            return this.f99422m.hashCode() + j6.a.c((this.k.hashCode() + l.g(this.f99420j, p.a.c(this.f99419h.hashCode() * 31, 31, this.i), 31)) * 31, 31, this.f99421l);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99419h);
            dest.writeString(this.i);
            dest.writeSerializable(this.f99420j);
            this.k.writeToParcel(dest, i);
            dest.writeInt(this.f99421l ? 1 : 0);
            dest.writeSerializable(this.f99422m);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$JuniorSavingsBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorSavingsBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<JuniorSavingsBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SavingsAccountDetails f99423h;
        public final JuniorInfo i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f99424j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorSavingsBalanceWrapper((SavingsAccountDetails) parcel.readParcelable(JuniorSavingsBalanceWrapper.class.getClassLoader()), JuniorInfo.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorSavingsBalanceWrapper[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public JuniorSavingsBalanceWrapper(SavingsAccountDetails account, JuniorInfo ownerInfo, d dVar) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(ownerInfo, "ownerInfo");
            s sVar = account.f86460a;
            super(sVar.f(), dVar != null ? Long.valueOf(dVar.f115082a) : null, e.u(sVar, b.Companion), AccountId.Personal.f51414a, sVar.f234885h.f234859a, dVar, k1j.a.YOUTH_SAVINGS);
            this.f99423h = account;
            this.i = ownerInfo;
            this.f99424j = dVar;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99424j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorSavingsBalanceWrapper)) {
                return false;
            }
            JuniorSavingsBalanceWrapper juniorSavingsBalanceWrapper = (JuniorSavingsBalanceWrapper) obj2;
            return Intrinsics.f(this.f99423h, juniorSavingsBalanceWrapper.f99423h) && Intrinsics.f(this.i, juniorSavingsBalanceWrapper.i) && Intrinsics.f(this.f99424j, juniorSavingsBalanceWrapper.f99424j);
        }

        public final int hashCode() {
            int iHashCode = (this.i.hashCode() + (this.f99423h.hashCode() * 31)) * 31;
            d dVar = this.f99424j;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99423h, i);
            this.i.writeToParcel(dest, i);
            dest.writeSerializable(this.f99424j);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$JuniorVaultBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorVaultBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<JuniorVaultBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99425h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final s f99426j;
        public final JuniorInfo k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final d f99427l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorVaultBalanceWrapper(parcel.readString(), parcel.readString(), (s) parcel.readSerializable(), JuniorInfo.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorVaultBalanceWrapper[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JuniorVaultBalanceWrapper(String id10, String name, s vault, JuniorInfo ownerInfo, d balanceBaseCurrency) {
            super(vault.f(), Long.valueOf(balanceBaseCurrency.f115082a), balanceBaseCurrency.f115083b, AccountId.Personal.f51414a, name, balanceBaseCurrency, k1j.a.YOUTH_VAULTS);
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(ownerInfo, "ownerInfo");
            Intrinsics.checkNotNullParameter(balanceBaseCurrency, "balanceBaseCurrency");
            this.f99425h = id10;
            this.i = name;
            this.f99426j = vault;
            this.k = ownerInfo;
            this.f99427l = balanceBaseCurrency;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99427l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorVaultBalanceWrapper)) {
                return false;
            }
            JuniorVaultBalanceWrapper juniorVaultBalanceWrapper = (JuniorVaultBalanceWrapper) obj2;
            return Intrinsics.f(this.f99425h, juniorVaultBalanceWrapper.f99425h) && Intrinsics.f(this.i, juniorVaultBalanceWrapper.i) && Intrinsics.f(this.f99426j, juniorVaultBalanceWrapper.f99426j) && Intrinsics.f(this.k, juniorVaultBalanceWrapper.k) && Intrinsics.f(this.f99427l, juniorVaultBalanceWrapper.f99427l);
        }

        public final int hashCode() {
            return this.f99427l.hashCode() + ((this.k.hashCode() + ((this.f99426j.hashCode() + p.a.c(this.f99425h.hashCode() * 31, 31, this.i)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99425h);
            dest.writeString(this.i);
            dest.writeSerializable(this.f99426j);
            this.k.writeToParcel(dest, i);
            dest.writeSerializable(this.f99427l);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$NonExistingCurrencyBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NonExistingCurrencyBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<NonExistingCurrencyBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f99428h;
        public final AccountId i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final k1j.a f99429j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final d f99430l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NonExistingCurrencyBalanceWrapper((b) parcel.readSerializable(), (AccountId) parcel.readParcelable(NonExistingCurrencyBalanceWrapper.class.getClassLoader()), k1j.a.valueOf(parcel.readString()), parcel.readString(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NonExistingCurrencyBalanceWrapper[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NonExistingCurrencyBalanceWrapper(b currency, AccountId accountId, k1j.a type, String displayName, d dVar) {
            super(a0.d.r(type.name(), currency.f306286a), dVar != null ? Long.valueOf(dVar.f115082a) : null, currency, accountId, displayName, dVar, type);
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.f99428h = currency;
            this.i = accountId;
            this.f99429j = type;
            this.k = displayName;
            this.f99430l = dVar;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99430l;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: b, reason: from getter */
        public final k1j.a getF99407g() {
            return this.f99429j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NonExistingCurrencyBalanceWrapper)) {
                return false;
            }
            NonExistingCurrencyBalanceWrapper nonExistingCurrencyBalanceWrapper = (NonExistingCurrencyBalanceWrapper) obj2;
            return Intrinsics.f(this.f99428h, nonExistingCurrencyBalanceWrapper.f99428h) && Intrinsics.f(this.i, nonExistingCurrencyBalanceWrapper.i) && this.f99429j == nonExistingCurrencyBalanceWrapper.f99429j && Intrinsics.f(this.k, nonExistingCurrencyBalanceWrapper.k) && Intrinsics.f(this.f99430l, nonExistingCurrencyBalanceWrapper.f99430l);
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getD() {
            return this.i;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getCurrency, reason: from getter */
        public final b getF99406c() {
            return this.f99428h;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getDisplayName, reason: from getter */
        public final String getE() {
            return this.k;
        }

        public final int hashCode() {
            int iC = p.a.c((this.f99429j.hashCode() + l.b(this.i, this.f99428h.hashCode() * 31, 31)) * 31, 31, this.k);
            d dVar = this.f99430l;
            return iC + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99428h);
            dest.writeParcelable(this.i, i);
            dest.writeString(this.f99429j.name());
            dest.writeString(this.k);
            dest.writeSerializable(this.f99430l);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$PocketBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<PocketBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99431h;
        public final io3.d i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AccountId f99432j;
        public final d k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final k1j.a f99433l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketBalanceWrapper(parcel.readString(), (io3.d) parcel.readSerializable(), (AccountId) parcel.readParcelable(PocketBalanceWrapper.class.getClassLoader()), (d) parcel.readSerializable(), k1j.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketBalanceWrapper[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PocketBalanceWrapper(String displayName, io3.d pocket, AccountId accountId, d dVar, k1j.a type) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(type, "type");
            String str = pocket.f163145a;
            Long lValueOf = Long.valueOf(pocket.i);
            xi0.a aVar = b.Companion;
            String str2 = pocket.f163147c;
            aVar.getClass();
            super(str, lValueOf, xi0.a.a(str2), accountId, displayName, dVar, type);
            this.f99431h = displayName;
            this.i = pocket;
            this.f99432j = accountId;
            this.k = dVar;
            this.f99433l = type;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.k;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: b, reason: from getter */
        public final k1j.a getF99407g() {
            return this.f99433l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PocketBalanceWrapper)) {
                return false;
            }
            PocketBalanceWrapper pocketBalanceWrapper = (PocketBalanceWrapper) obj2;
            return Intrinsics.f(this.f99431h, pocketBalanceWrapper.f99431h) && Intrinsics.f(this.i, pocketBalanceWrapper.i) && Intrinsics.f(this.f99432j, pocketBalanceWrapper.f99432j) && Intrinsics.f(this.k, pocketBalanceWrapper.k) && this.f99433l == pocketBalanceWrapper.f99433l;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getD() {
            return this.f99432j;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getDisplayName, reason: from getter */
        public final String getE() {
            return this.f99431h;
        }

        public final int hashCode() {
            int iB = l.b(this.f99432j, l.g(this.i, this.f99431h.hashCode() * 31, 31), 31);
            d dVar = this.k;
            return this.f99433l.hashCode() + ((iB + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99431h);
            dest.writeSerializable(this.i);
            dest.writeParcelable(this.f99432j, i);
            dest.writeSerializable(this.k);
            dest.writeString(this.f99433l.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$ProVaultBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProVaultBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<ProVaultBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final s f99434h;
        public final d i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProVaultBalanceWrapper((s) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProVaultBalanceWrapper[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ProVaultBalanceWrapper(s vault, d dVar) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            String strF = vault.f();
            g0 g0Var = vault.f234885h;
            super(strF, Long.valueOf(g0Var.f234861c), e.u(vault, b.Companion), AccountId.Personal.f51414a, g0Var.f234859a, dVar, k1j.a.PRO_VAULTS);
            this.f99434h = vault;
            this.i = dVar;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProVaultBalanceWrapper)) {
                return false;
            }
            ProVaultBalanceWrapper proVaultBalanceWrapper = (ProVaultBalanceWrapper) obj2;
            return Intrinsics.f(this.f99434h, proVaultBalanceWrapper.f99434h) && Intrinsics.f(this.i, proVaultBalanceWrapper.i);
        }

        public final int hashCode() {
            int iHashCode = this.f99434h.hashCode() * 31;
            d dVar = this.i;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99434h);
            dest.writeSerializable(this.i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$RevPointsAccountBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsAccountBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<RevPointsAccountBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99435h;
        public final d i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f99436j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsAccountBalanceWrapper((d) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsAccountBalanceWrapper[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsAccountBalanceWrapper(d money, String pointsAccountId, String displayName) {
            super(pointsAccountId, Long.valueOf(money.f115082a), money.f115083b, AccountId.Personal.f51414a, displayName, money, k1j.a.REV_POINTS);
            Intrinsics.checkNotNullParameter(pointsAccountId, "pointsAccountId");
            Intrinsics.checkNotNullParameter(money, "money");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.f99435h = pointsAccountId;
            this.i = money;
            this.f99436j = displayName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevPointsAccountBalanceWrapper)) {
                return false;
            }
            RevPointsAccountBalanceWrapper revPointsAccountBalanceWrapper = (RevPointsAccountBalanceWrapper) obj2;
            return Intrinsics.f(this.f99435h, revPointsAccountBalanceWrapper.f99435h) && Intrinsics.f(this.i, revPointsAccountBalanceWrapper.i) && Intrinsics.f(this.f99436j, revPointsAccountBalanceWrapper.f99436j);
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getDisplayName, reason: from getter */
        public final String getE() {
            return this.f99436j;
        }

        public final int hashCode() {
            return this.f99436j.hashCode() + v7.c(this.f99435h.hashCode() * 31, 31, this.i);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99435h);
            dest.writeSerializable(this.i);
            dest.writeString(this.f99436j);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$RevPointsPocketBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsPocketBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<RevPointsPocketBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99437h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f99438j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsPocketBalanceWrapper((d) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsPocketBalanceWrapper[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsPocketBalanceWrapper(d balanceBaseCurrency, String id10, String name) {
            super(id10, Long.valueOf(balanceBaseCurrency.f115082a), balanceBaseCurrency.f115083b, AccountId.Personal.f51414a, name, balanceBaseCurrency, k1j.a.REV_POINTS_POCKETS);
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(balanceBaseCurrency, "balanceBaseCurrency");
            this.f99437h = id10;
            this.i = name;
            this.f99438j = balanceBaseCurrency;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99438j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevPointsPocketBalanceWrapper)) {
                return false;
            }
            RevPointsPocketBalanceWrapper revPointsPocketBalanceWrapper = (RevPointsPocketBalanceWrapper) obj2;
            return Intrinsics.f(this.f99437h, revPointsPocketBalanceWrapper.f99437h) && Intrinsics.f(this.i, revPointsPocketBalanceWrapper.i) && Intrinsics.f(this.f99438j, revPointsPocketBalanceWrapper.f99438j);
        }

        public final int hashCode() {
            return this.f99438j.hashCode() + p.a.c(this.f99437h.hashCode() * 31, 31, this.i);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99437h);
            dest.writeString(this.i);
            dest.writeSerializable(this.f99438j);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$SavingsBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "Disclaimers", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<SavingsBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SavingsAccountDetails f99439h;
        public final Disclaimers i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AccountId f99440j;
        public final d k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsBalanceWrapper((SavingsAccountDetails) parcel.readParcelable(SavingsBalanceWrapper.class.getClassLoader()), Disclaimers.CREATOR.createFromParcel(parcel), (AccountId) parcel.readParcelable(SavingsBalanceWrapper.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsBalanceWrapper[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SavingsBalanceWrapper(SavingsAccountDetails account, Disclaimers disclaimers, AccountId accountId, d dVar) {
            k1j.a aVar;
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            String strF = account.f86460a.f();
            s sVar = account.f86460a;
            Long lValueOf = Long.valueOf(sVar.f234885h.f234861c);
            b bVarU = e.u(sVar, b.Companion);
            String str = sVar.f234885h.f234859a;
            if (accountId instanceof AccountId.Joint) {
                aVar = k1j.a.JOINT_SAVINGS;
            } else {
                if (!(accountId instanceof AccountId.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = k1j.a.SAVINGS;
            }
            super(strF, lValueOf, bVarU, accountId, str, dVar, aVar);
            this.f99439h = account;
            this.i = disclaimers;
            this.f99440j = accountId;
            this.k = dVar;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.k;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SavingsBalanceWrapper)) {
                return false;
            }
            SavingsBalanceWrapper savingsBalanceWrapper = (SavingsBalanceWrapper) obj2;
            return Intrinsics.f(this.f99439h, savingsBalanceWrapper.f99439h) && Intrinsics.f(this.i, savingsBalanceWrapper.i) && Intrinsics.f(this.f99440j, savingsBalanceWrapper.f99440j) && Intrinsics.f(this.k, savingsBalanceWrapper.k);
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getD() {
            return this.f99440j;
        }

        public final int hashCode() {
            int iB = l.b(this.f99440j, (this.i.hashCode() + (this.f99439h.hashCode() * 31)) * 31, 31);
            d dVar = this.k;
            return iB + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99439h, i);
            this.i.writeToParcel(dest, i);
            dest.writeParcelable(this.f99440j, i);
            dest.writeSerializable(this.k);
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$SavingsBalanceWrapper$Disclaimers;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Disclaimers implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Disclaimers> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f99441a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Disclaimers((Clause) parcel.readParcelable(Disclaimers.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Disclaimers[i];
                }
            }

            public Disclaimers(Clause clause) {
                this.f99441a = clause;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Disclaimers) && Intrinsics.f(this.f99441a, ((Disclaimers) obj2).f99441a);
            }

            public final int hashCode() {
                Clause clause = this.f99441a;
                if (clause == null) {
                    return 0;
                }
                return clause.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f99441a, i);
            }

            public Disclaimers() {
                this(null);
            }
        }

        public /* synthetic */ SavingsBalanceWrapper(SavingsAccountDetails savingsAccountDetails, Disclaimers disclaimers, AccountId accountId, int i) {
            this(savingsAccountDetails, (i & 2) != 0 ? new Disclaimers(null) : disclaimers, accountId, (d) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$TeenPocketBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TeenPocketBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<TeenPocketBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f99442h;
        public final String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final io3.d f99443j;
        public final TeenInfo k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final d f99444l;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TeenPocketBalanceWrapper(parcel.readString(), parcel.readString(), (io3.d) parcel.readSerializable(), TeenInfo.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TeenPocketBalanceWrapper[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TeenPocketBalanceWrapper(String id10, String name, io3.d pocket, TeenInfo ownerInfo, d balanceBaseCurrency) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(ownerInfo, "ownerInfo");
            Intrinsics.checkNotNullParameter(balanceBaseCurrency, "balanceBaseCurrency");
            Long lValueOf = Long.valueOf(pocket.i);
            xi0.a aVar = b.Companion;
            String str = pocket.f163147c;
            aVar.getClass();
            super(id10, lValueOf, xi0.a.a(str), AccountId.Personal.f51414a, name, balanceBaseCurrency, k1j.a.TEEN_POCKETS);
            this.f99442h = id10;
            this.i = name;
            this.f99443j = pocket;
            this.k = ownerInfo;
            this.f99444l = balanceBaseCurrency;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99444l;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TeenPocketBalanceWrapper)) {
                return false;
            }
            TeenPocketBalanceWrapper teenPocketBalanceWrapper = (TeenPocketBalanceWrapper) obj2;
            return Intrinsics.f(this.f99442h, teenPocketBalanceWrapper.f99442h) && Intrinsics.f(this.i, teenPocketBalanceWrapper.i) && Intrinsics.f(this.f99443j, teenPocketBalanceWrapper.f99443j) && Intrinsics.f(this.k, teenPocketBalanceWrapper.k) && Intrinsics.f(this.f99444l, teenPocketBalanceWrapper.f99444l);
        }

        public final int hashCode() {
            return this.f99444l.hashCode() + ((this.k.hashCode() + l.g(this.f99443j, p.a.c(this.f99442h.hashCode() * 31, 31, this.i), 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99442h);
            dest.writeString(this.i);
            dest.writeSerializable(this.f99443j);
            this.k.writeToParcel(dest, i);
            dest.writeSerializable(this.f99444l);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$TeenVaultBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TeenVaultBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<TeenVaultBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final s f99445h;
        public final TeenInfo i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f99446j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TeenVaultBalanceWrapper((s) parcel.readSerializable(), TeenInfo.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TeenVaultBalanceWrapper[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public TeenVaultBalanceWrapper(s vault, TeenInfo ownerInfo, d balanceBaseCurrency) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(ownerInfo, "ownerInfo");
            Intrinsics.checkNotNullParameter(balanceBaseCurrency, "balanceBaseCurrency");
            String strF = vault.f();
            g0 g0Var = vault.f234885h;
            super(strF, Long.valueOf(g0Var.f234861c), e.u(vault, b.Companion), AccountId.Personal.f51414a, g0Var.f234859a, balanceBaseCurrency, k1j.a.TEEN_VAULTS);
            this.f99445h = vault;
            this.i = ownerInfo;
            this.f99446j = balanceBaseCurrency;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99446j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TeenVaultBalanceWrapper)) {
                return false;
            }
            TeenVaultBalanceWrapper teenVaultBalanceWrapper = (TeenVaultBalanceWrapper) obj2;
            return Intrinsics.f(this.f99445h, teenVaultBalanceWrapper.f99445h) && Intrinsics.f(this.i, teenVaultBalanceWrapper.i) && Intrinsics.f(this.f99446j, teenVaultBalanceWrapper.f99446j);
        }

        public final int hashCode() {
            return this.f99446j.hashCode() + ((this.i.hashCode() + (this.f99445h.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99445h);
            this.i.writeToParcel(dest, i);
            dest.writeSerializable(this.f99446j);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$TradingAccountBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TradingAccountBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<TradingAccountBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TradingAccount f99447h;
        public final CashHoldingAvailability i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f99448j;
        public final String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AccountId f99449l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final k1j.a f99450m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final d f99451n;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TradingAccountBalanceWrapper((TradingAccount) parcel.readParcelable(TradingAccountBalanceWrapper.class.getClassLoader()), (CashHoldingAvailability) parcel.readParcelable(TradingAccountBalanceWrapper.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readString(), (AccountId) parcel.readParcelable(TradingAccountBalanceWrapper.class.getClassLoader()), k1j.a.valueOf(parcel.readString()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TradingAccountBalanceWrapper[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TradingAccountBalanceWrapper(TradingAccount tradingAccount, CashHoldingAvailability cashHoldingAvailability, d availableToMove, String displayName, AccountId accountId, k1j.a type, d dVar) {
            super(cashHoldingAvailability.f105108a.f183150c, dVar != null ? Long.valueOf(dVar.f115082a) : null, cashHoldingAvailability.f105108a.f183149b.f115083b, accountId, displayName, dVar, type);
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(cashHoldingAvailability, "cashHoldingAvailability");
            Intrinsics.checkNotNullParameter(availableToMove, "availableToMove");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f99447h = tradingAccount;
            this.i = cashHoldingAvailability;
            this.f99448j = availableToMove;
            this.k = displayName;
            this.f99449l = accountId;
            this.f99450m = type;
            this.f99451n = dVar;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99451n;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: b, reason: from getter */
        public final k1j.a getF99407g() {
            return this.f99450m;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TradingAccountBalanceWrapper)) {
                return false;
            }
            TradingAccountBalanceWrapper tradingAccountBalanceWrapper = (TradingAccountBalanceWrapper) obj2;
            return Intrinsics.f(this.f99447h, tradingAccountBalanceWrapper.f99447h) && Intrinsics.f(this.i, tradingAccountBalanceWrapper.i) && Intrinsics.f(this.f99448j, tradingAccountBalanceWrapper.f99448j) && Intrinsics.f(this.k, tradingAccountBalanceWrapper.k) && Intrinsics.f(this.f99449l, tradingAccountBalanceWrapper.f99449l) && this.f99450m == tradingAccountBalanceWrapper.f99450m && Intrinsics.f(this.f99451n, tradingAccountBalanceWrapper.f99451n);
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getD() {
            return this.f99449l;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getDisplayName, reason: from getter */
        public final String getE() {
            return this.k;
        }

        public final int hashCode() {
            int iHashCode = (this.f99450m.hashCode() + l.b(this.f99449l, p.a.c(v7.c((this.i.hashCode() + (this.f99447h.hashCode() * 31)) * 31, 31, this.f99448j), 31, this.k), 31)) * 31;
            d dVar = this.f99451n;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99447h, i);
            dest.writeParcelable(this.i, i);
            dest.writeSerializable(this.f99448j);
            dest.writeString(this.k);
            dest.writeParcelable(this.f99449l, i);
            dest.writeString(this.f99450m.name());
            dest.writeSerializable(this.f99451n);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper$VaultBalanceWrapper;", "Lcom/revolut/retail/feature/balance/picker/api/models/BalanceWrapper;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VaultBalanceWrapper extends BalanceWrapper {

        @NotNull
        public static final Parcelable.Creator<VaultBalanceWrapper> CREATOR = new a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final s f99452h;
        public final AccountId i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d f99453j;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VaultBalanceWrapper((s) parcel.readSerializable(), (AccountId) parcel.readParcelable(VaultBalanceWrapper.class.getClassLoader()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VaultBalanceWrapper[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public VaultBalanceWrapper(s vault, AccountId accountId, d dVar) {
            k1j.a aVar;
            Intrinsics.checkNotNullParameter(vault, "vault");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            String strF = vault.f();
            g0 g0Var = vault.f234885h;
            Long lValueOf = Long.valueOf(g0Var.f234861c);
            b bVarU = e.u(vault, b.Companion);
            String str = g0Var.f234859a;
            if (accountId instanceof AccountId.Joint) {
                aVar = k1j.a.JOINT_VAULTS;
            } else {
                if (!(accountId instanceof AccountId.Personal)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = k1j.a.VAULTS;
            }
            super(strF, lValueOf, bVarU, accountId, str, dVar, aVar);
            this.f99452h = vault;
            this.i = accountId;
            this.f99453j = dVar;
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getF() {
            return this.f99453j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof VaultBalanceWrapper)) {
                return false;
            }
            VaultBalanceWrapper vaultBalanceWrapper = (VaultBalanceWrapper) obj2;
            return Intrinsics.f(this.f99452h, vaultBalanceWrapper.f99452h) && Intrinsics.f(this.i, vaultBalanceWrapper.i) && Intrinsics.f(this.f99453j, vaultBalanceWrapper.f99453j);
        }

        @Override // com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getD() {
            return this.i;
        }

        public final int hashCode() {
            int iB = l.b(this.i, this.f99452h.hashCode() * 31, 31);
            d dVar = this.f99453j;
            return iB + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99452h);
            dest.writeParcelable(this.i, i);
            dest.writeSerializable(this.f99453j);
        }
    }

    public BalanceWrapper(String str, Long l2, b bVar, AccountId accountId, String str2, d dVar, a aVar) {
        this.f99404a = str;
        this.f99405b = l2;
        this.f99406c = bVar;
        this.d = accountId;
        this.e = str2;
        this.f = dVar;
        this.f99407g = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public d getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public a getF99407g() {
        return this.f99407g;
    }

    /* JADX INFO: renamed from: getAccountId, reason: from getter */
    public AccountId getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: getCurrency, reason: from getter */
    public b getF99406c() {
        return this.f99406c;
    }

    /* JADX INFO: renamed from: getDisplayName, reason: from getter */
    public String getE() {
        return this.e;
    }
}
