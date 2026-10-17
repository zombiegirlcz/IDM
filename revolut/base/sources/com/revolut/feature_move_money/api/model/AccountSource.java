package com.revolut.feature_move_money.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardPaymentDetails;
import com.revolut.feature.credit.card.api.models.limits.CreditCardLimits;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import com.revolut.retail.feature.balance.picker.api.models.TeenInfo;
import com.revolut.shared.feature.move_money.api.interactor.CollateralDetails;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import dj0.d;
import h30.l;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0010\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource;", "Landroid/os/Parcelable;", "<init>", "()V", "PocketSource", "VaultSource", "SavingsSource", "CreditCardSource", "RevPointsPocketSource", "JuniorPocketSource", "JuniorVaultSource", "JuniorSavingsSource", "TeenPocketSource", "TeenVaultSource", "JointVaultSource", "JointSavingsSource", "InvestCashHolding", "NonExistingCurrencyAccount", "SpotMarginCollateralSource", "FuturesCollateralSource", "Lcom/revolut/feature_move_money/api/model/AccountSource$CreditCardSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$FuturesCollateralSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$InvestCashHolding;", "Lcom/revolut/feature_move_money/api/model/AccountSource$JointSavingsSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$JointVaultSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$JuniorPocketSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$JuniorSavingsSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$JuniorVaultSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$NonExistingCurrencyAccount;", "Lcom/revolut/feature_move_money/api/model/AccountSource$PocketSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$RevPointsPocketSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$SavingsSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$SpotMarginCollateralSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$TeenPocketSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$TeenVaultSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource$VaultSource;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AccountSource implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$CreditCardSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditCardSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<CreditCardSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditCard f97192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditCardPaymentDetails f97193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CreditCardLimits f97194c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreditCardSource((CreditCard) parcel.readParcelable(CreditCardSource.class.getClassLoader()), (CreditCardPaymentDetails) parcel.readParcelable(CreditCardSource.class.getClassLoader()), (CreditCardLimits) parcel.readParcelable(CreditCardSource.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardSource[i];
            }
        }

        public CreditCardSource(CreditCard creditCard, CreditCardPaymentDetails paymentDetails, CreditCardLimits creditCardLimits) {
            Intrinsics.checkNotNullParameter(creditCard, "creditCard");
            Intrinsics.checkNotNullParameter(paymentDetails, "paymentDetails");
            this.f97192a = creditCard;
            this.f97193b = paymentDetails;
            this.f97194c = creditCardLimits;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditCardSource)) {
                return false;
            }
            CreditCardSource creditCardSource = (CreditCardSource) obj2;
            return Intrinsics.f(this.f97192a, creditCardSource.f97192a) && Intrinsics.f(this.f97193b, creditCardSource.f97193b) && Intrinsics.f(this.f97194c, creditCardSource.f97194c);
        }

        public final int hashCode() {
            int iHashCode = (this.f97193b.hashCode() + (this.f97192a.hashCode() * 31)) * 31;
            CreditCardLimits creditCardLimits = this.f97194c;
            return iHashCode + (creditCardLimits == null ? 0 : creditCardLimits.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97192a, i);
            dest.writeParcelable(this.f97193b, i);
            dest.writeParcelable(this.f97194c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$FuturesCollateralSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FuturesCollateralSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<FuturesCollateralSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f97195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f97196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f97197c;
        public final CollateralDetails d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FuturesCollateralSource(parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (CollateralDetails) parcel.readParcelable(FuturesCollateralSource.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FuturesCollateralSource[i];
            }
        }

        public FuturesCollateralSource(String id10, d withdrawable, d balance, CollateralDetails collateralDetails) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(withdrawable, "withdrawable");
            Intrinsics.checkNotNullParameter(balance, "balance");
            this.f97195a = id10;
            this.f97196b = withdrawable;
            this.f97197c = balance;
            this.d = collateralDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FuturesCollateralSource)) {
                return false;
            }
            FuturesCollateralSource futuresCollateralSource = (FuturesCollateralSource) obj2;
            return Intrinsics.f(this.f97195a, futuresCollateralSource.f97195a) && Intrinsics.f(this.f97196b, futuresCollateralSource.f97196b) && Intrinsics.f(this.f97197c, futuresCollateralSource.f97197c) && Intrinsics.f(this.d, futuresCollateralSource.d);
        }

        public final int hashCode() {
            int iC = v7.c(v7.c(this.f97195a.hashCode() * 31, 31, this.f97196b), 31, this.f97197c);
            CollateralDetails collateralDetails = this.d;
            return iC + (collateralDetails == null ? 0 : collateralDetails.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f97195a);
            dest.writeSerializable(this.f97196b);
            dest.writeSerializable(this.f97197c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$InvestCashHolding;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvestCashHolding extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<InvestCashHolding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount f97198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final kel.b f97199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f97200c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvestCashHolding((TradingAccount) parcel.readParcelable(InvestCashHolding.class.getClassLoader()), (kel.b) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvestCashHolding[i];
            }
        }

        public InvestCashHolding(TradingAccount tradingAccount, kel.b cashHolding, d availableToMove) {
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            Intrinsics.checkNotNullParameter(availableToMove, "availableToMove");
            this.f97198a = tradingAccount;
            this.f97199b = cashHolding;
            this.f97200c = availableToMove;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InvestCashHolding)) {
                return false;
            }
            InvestCashHolding investCashHolding = (InvestCashHolding) obj2;
            return Intrinsics.f(this.f97198a, investCashHolding.f97198a) && Intrinsics.f(this.f97199b, investCashHolding.f97199b) && Intrinsics.f(this.f97200c, investCashHolding.f97200c);
        }

        public final int hashCode() {
            return this.f97200c.hashCode() + ((this.f97199b.hashCode() + (this.f97198a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97198a, i);
            dest.writeSerializable(this.f97199b);
            dest.writeSerializable(this.f97200c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$JointSavingsSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointSavingsSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<JointSavingsSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsAccountDetails f97201a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointSavingsSource((SavingsAccountDetails) parcel.readParcelable(JointSavingsSource.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointSavingsSource[i];
            }
        }

        public JointSavingsSource(SavingsAccountDetails account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.f97201a = account;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JointSavingsSource) && Intrinsics.f(this.f97201a, ((JointSavingsSource) obj2).f97201a);
        }

        public final int hashCode() {
            return this.f97201a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97201a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$JointVaultSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointVaultSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<JointVaultSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f97202a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointVaultSource((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointVaultSource[i];
            }
        }

        public JointVaultSource(s vault) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f97202a = vault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JointVaultSource) && Intrinsics.f(this.f97202a, ((JointVaultSource) obj2).f97202a);
        }

        public final int hashCode() {
            return this.f97202a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97202a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$JuniorPocketSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorPocketSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<JuniorPocketSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorInfo f97203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io3.d f97204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f97205c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorPocketSource((JuniorInfo) parcel.readParcelable(JuniorPocketSource.class.getClassLoader()), (io3.d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorPocketSource[i];
            }
        }

        public JuniorPocketSource(JuniorInfo juniorInfo, io3.d pocket, boolean z) {
            Intrinsics.checkNotNullParameter(juniorInfo, "juniorInfo");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f97203a = juniorInfo;
            this.f97204b = pocket;
            this.f97205c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorPocketSource)) {
                return false;
            }
            JuniorPocketSource juniorPocketSource = (JuniorPocketSource) obj2;
            return Intrinsics.f(this.f97203a, juniorPocketSource.f97203a) && Intrinsics.f(this.f97204b, juniorPocketSource.f97204b) && this.f97205c == juniorPocketSource.f97205c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f97205c) + l.g(this.f97204b, this.f97203a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97203a, i);
            dest.writeSerializable(this.f97204b);
            dest.writeInt(this.f97205c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$JuniorSavingsSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorSavingsSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<JuniorSavingsSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorInfo f97206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SavingsAccountDetails f97207b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorSavingsSource((JuniorInfo) parcel.readParcelable(JuniorSavingsSource.class.getClassLoader()), (SavingsAccountDetails) parcel.readParcelable(JuniorSavingsSource.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorSavingsSource[i];
            }
        }

        public JuniorSavingsSource(JuniorInfo juniorInfo, SavingsAccountDetails account) {
            Intrinsics.checkNotNullParameter(juniorInfo, "juniorInfo");
            Intrinsics.checkNotNullParameter(account, "account");
            this.f97206a = juniorInfo;
            this.f97207b = account;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorSavingsSource)) {
                return false;
            }
            JuniorSavingsSource juniorSavingsSource = (JuniorSavingsSource) obj2;
            return Intrinsics.f(this.f97206a, juniorSavingsSource.f97206a) && Intrinsics.f(this.f97207b, juniorSavingsSource.f97207b);
        }

        public final int hashCode() {
            return this.f97207b.hashCode() + (this.f97206a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97206a, i);
            dest.writeParcelable(this.f97207b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$JuniorVaultSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorVaultSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<JuniorVaultSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorInfo f97208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f97209b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorVaultSource((JuniorInfo) parcel.readParcelable(JuniorVaultSource.class.getClassLoader()), (s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorVaultSource[i];
            }
        }

        public JuniorVaultSource(JuniorInfo juniorInfo, s vault) {
            Intrinsics.checkNotNullParameter(juniorInfo, "juniorInfo");
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f97208a = juniorInfo;
            this.f97209b = vault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorVaultSource)) {
                return false;
            }
            JuniorVaultSource juniorVaultSource = (JuniorVaultSource) obj2;
            return Intrinsics.f(this.f97208a, juniorVaultSource.f97208a) && Intrinsics.f(this.f97209b, juniorVaultSource.f97209b);
        }

        public final int hashCode() {
            return this.f97209b.hashCode() + (this.f97208a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97208a, i);
            dest.writeSerializable(this.f97209b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$NonExistingCurrencyAccount;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NonExistingCurrencyAccount extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<NonExistingCurrencyAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f97210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f97211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io3.l f97212c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NonExistingCurrencyAccount((AccountId) parcel.readParcelable(NonExistingCurrencyAccount.class.getClassLoader()), io3.l.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NonExistingCurrencyAccount[i];
            }
        }

        public NonExistingCurrencyAccount(AccountId accountId, io3.l pocketType, xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            this.f97210a = currency;
            this.f97211b = accountId;
            this.f97212c = pocketType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NonExistingCurrencyAccount)) {
                return false;
            }
            NonExistingCurrencyAccount nonExistingCurrencyAccount = (NonExistingCurrencyAccount) obj2;
            return Intrinsics.f(this.f97210a, nonExistingCurrencyAccount.f97210a) && Intrinsics.f(this.f97211b, nonExistingCurrencyAccount.f97211b) && this.f97212c == nonExistingCurrencyAccount.f97212c;
        }

        public final int hashCode() {
            return this.f97212c.hashCode() + l.b(this.f97211b, this.f97210a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97210a);
            dest.writeParcelable(this.f97211b, i);
            dest.writeString(this.f97212c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$PocketSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<PocketSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io3.d f97213a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketSource((io3.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketSource[i];
            }
        }

        public PocketSource(io3.d pocket) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f97213a = pocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PocketSource) && Intrinsics.f(this.f97213a, ((PocketSource) obj2).f97213a);
        }

        public final int hashCode() {
            return this.f97213a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97213a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$RevPointsPocketSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsPocketSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<RevPointsPocketSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsPocketInfo f97214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f97215b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                RevPointsPocketInfo revPointsPocketInfo = (RevPointsPocketInfo) j6.a.f(parcel, "parcel", RevPointsPocketSource.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(RevPointsPocketSource.class, parcel, arrayList, iE, 1);
                }
                return new RevPointsPocketSource(revPointsPocketInfo, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsPocketSource[i];
            }
        }

        public RevPointsPocketSource(RevPointsPocketInfo revPointsPocketInfo, List thresholds) {
            Intrinsics.checkNotNullParameter(revPointsPocketInfo, "revPointsPocketInfo");
            Intrinsics.checkNotNullParameter(thresholds, "thresholds");
            this.f97214a = revPointsPocketInfo;
            this.f97215b = thresholds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevPointsPocketSource)) {
                return false;
            }
            RevPointsPocketSource revPointsPocketSource = (RevPointsPocketSource) obj2;
            return Intrinsics.f(this.f97214a, revPointsPocketSource.f97214a) && Intrinsics.f(this.f97215b, revPointsPocketSource.f97215b);
        }

        public final int hashCode() {
            return this.f97215b.hashCode() + (this.f97214a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97214a, i);
            Iterator itV = p.a.v(this.f97215b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$SavingsSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SavingsSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<SavingsSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsAccountDetails f97216a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavingsSource((SavingsAccountDetails) parcel.readParcelable(SavingsSource.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsSource[i];
            }
        }

        public SavingsSource(SavingsAccountDetails account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.f97216a = account;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SavingsSource) && Intrinsics.f(this.f97216a, ((SavingsSource) obj2).f97216a);
        }

        public final int hashCode() {
            return this.f97216a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97216a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$SpotMarginCollateralSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SpotMarginCollateralSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<SpotMarginCollateralSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f97217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f97218b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SpotMarginCollateralSource((d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SpotMarginCollateralSource[i];
            }
        }

        public SpotMarginCollateralSource(d withdrawable, d balance) {
            Intrinsics.checkNotNullParameter(withdrawable, "withdrawable");
            Intrinsics.checkNotNullParameter(balance, "balance");
            this.f97217a = withdrawable;
            this.f97218b = balance;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SpotMarginCollateralSource)) {
                return false;
            }
            SpotMarginCollateralSource spotMarginCollateralSource = (SpotMarginCollateralSource) obj2;
            return Intrinsics.f(this.f97217a, spotMarginCollateralSource.f97217a) && Intrinsics.f(this.f97218b, spotMarginCollateralSource.f97218b);
        }

        public final int hashCode() {
            return this.f97218b.hashCode() + (this.f97217a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97217a);
            dest.writeSerializable(this.f97218b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$TeenPocketSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TeenPocketSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<TeenPocketSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeenInfo f97219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io3.d f97220b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TeenPocketSource((TeenInfo) parcel.readParcelable(TeenPocketSource.class.getClassLoader()), (io3.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TeenPocketSource[i];
            }
        }

        public TeenPocketSource(TeenInfo teenInfo, io3.d pocket) {
            Intrinsics.checkNotNullParameter(teenInfo, "teenInfo");
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            this.f97219a = teenInfo;
            this.f97220b = pocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TeenPocketSource)) {
                return false;
            }
            TeenPocketSource teenPocketSource = (TeenPocketSource) obj2;
            return Intrinsics.f(this.f97219a, teenPocketSource.f97219a) && Intrinsics.f(this.f97220b, teenPocketSource.f97220b);
        }

        public final int hashCode() {
            return this.f97220b.hashCode() + (this.f97219a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97219a, i);
            dest.writeSerializable(this.f97220b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$TeenVaultSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TeenVaultSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<TeenVaultSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TeenInfo f97221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s f97222b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TeenVaultSource((TeenInfo) parcel.readParcelable(TeenVaultSource.class.getClassLoader()), (s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TeenVaultSource[i];
            }
        }

        public TeenVaultSource(TeenInfo teenInfo, s vault) {
            Intrinsics.checkNotNullParameter(teenInfo, "teenInfo");
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f97221a = teenInfo;
            this.f97222b = vault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TeenVaultSource)) {
                return false;
            }
            TeenVaultSource teenVaultSource = (TeenVaultSource) obj2;
            return Intrinsics.f(this.f97221a, teenVaultSource.f97221a) && Intrinsics.f(this.f97222b, teenVaultSource.f97222b);
        }

        public final int hashCode() {
            return this.f97222b.hashCode() + (this.f97221a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97221a, i);
            dest.writeSerializable(this.f97222b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/model/AccountSource$VaultSource;", "Lcom/revolut/feature_move_money/api/model/AccountSource;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VaultSource extends AccountSource {

        @NotNull
        public static final Parcelable.Creator<VaultSource> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f97223a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VaultSource((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VaultSource[i];
            }
        }

        public VaultSource(s vault) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f97223a = vault;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VaultSource) && Intrinsics.f(this.f97223a, ((VaultSource) obj2).f97223a);
        }

        public final int hashCode() {
            return this.f97223a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97223a);
        }
    }

    private AccountSource() {
    }
}
