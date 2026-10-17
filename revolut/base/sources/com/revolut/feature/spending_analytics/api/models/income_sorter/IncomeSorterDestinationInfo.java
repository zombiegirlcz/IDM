package com.revolut.feature.spending_analytics.api.models.income_sorter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import h30.l;
import hzi.d;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import krf.c;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo;", "Landroid/os/Parcelable;", "Savings", "SubaccountPocket", "JointPocket", "RoboPortfolio", "Investment", "PersonalCurrencyPocket", "PeerToPeerTransfer", "BankTransfer", "Crypto", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$BankTransfer;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Crypto;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Investment;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$JointPocket;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$PeerToPeerTransfer;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$PersonalCurrencyPocket;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$RoboPortfolio;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Savings;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$SubaccountPocket;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IncomeSorterDestinationInfo extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$BankTransfer;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTransfer implements IncomeSorterDestinationInfo {

        @NotNull
        public static final Parcelable.Creator<BankTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f87456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f87458c;
        public final c d;
        public final d e;
        public final zld.a f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankTransfer((f5j.a) parcel.readSerializable(), parcel.readString(), (b) parcel.readSerializable(), (c) parcel.readSerializable(), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), zld.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTransfer[i];
            }
        }

        public BankTransfer(f5j.a beneficiary, String str, b currency, c cVar, d dVar, zld.a state) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f87456a = beneficiary;
            this.f87457b = str;
            this.f87458c = currency;
            this.d = cVar;
            this.e = dVar;
            this.f = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BankTransfer)) {
                return false;
            }
            BankTransfer bankTransfer = (BankTransfer) obj2;
            return Intrinsics.f(this.f87456a, bankTransfer.f87456a) && Intrinsics.f(this.f87457b, bankTransfer.f87457b) && Intrinsics.f(this.f87458c, bankTransfer.f87458c) && Intrinsics.f(this.d, bankTransfer.d) && this.e == bankTransfer.e && this.f == bankTransfer.f;
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        public final IncomeSorterDestinationId getId() {
            return new IncomeSorterDestinationId.Beneficiary(this.f87456a.f132329a, this.f87457b, this.d, this.e);
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final zld.a getE() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = this.f87456a.hashCode() * 31;
            String str = this.f87457b;
            int iJ = l.j(this.f87458c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            c cVar = this.d;
            int iHashCode2 = (iJ + (cVar == null ? 0 : cVar.hashCode())) * 31;
            d dVar = this.e;
            return this.f.hashCode() + ((iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87456a);
            dest.writeString(this.f87457b);
            dest.writeSerializable(this.f87458c);
            dest.writeSerializable(this.d);
            d dVar = this.e;
            if (dVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(dVar.name());
            }
            dest.writeString(this.f.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Crypto;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo;", "CryptoPocket", "RevXFiatPocket", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Crypto$CryptoPocket;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Crypto$RevXFiatPocket;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Crypto extends IncomeSorterDestinationInfo {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Crypto$CryptoPocket;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Crypto;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CryptoPocket implements Crypto {

            @NotNull
            public static final Parcelable.Creator<CryptoPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f87459a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final dj0.d f87460b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final zld.a f87461c;
            public final io3.d d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    b bVar = (b) parcel.readSerializable();
                    return new CryptoPocket((dj0.d) parcel.readSerializable(), (io3.d) parcel.readSerializable(), bVar, zld.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CryptoPocket[i];
                }
            }

            public CryptoPocket(dj0.d balance, io3.d dVar, b currency, zld.a state) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(balance, "balance");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f87459a = currency;
                this.f87460b = balance;
                this.f87461c = state;
                this.d = dVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CryptoPocket)) {
                    return false;
                }
                CryptoPocket cryptoPocket = (CryptoPocket) obj2;
                return Intrinsics.f(this.f87459a, cryptoPocket.f87459a) && Intrinsics.f(this.f87460b, cryptoPocket.f87460b) && this.f87461c == cryptoPocket.f87461c && Intrinsics.f(this.d, cryptoPocket.d);
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Crypto
            /* JADX INFO: renamed from: getBalance, reason: from getter */
            public final dj0.d getF87463b() {
                return this.f87460b;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Crypto
            /* JADX INFO: renamed from: getCurrency, reason: from getter */
            public final b getF87462a() {
                return this.f87459a;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
            public final IncomeSorterDestinationId getId() {
                io3.d dVar = this.d;
                return dVar != null ? new IncomeSorterDestinationId.Pocket(dVar.f163145a) : new IncomeSorterDestinationId.Crypto(this.f87459a);
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
            /* JADX INFO: renamed from: getState, reason: from getter */
            public final zld.a getE() {
                return this.f87461c;
            }

            public final int hashCode() {
                int iHashCode = (this.f87461c.hashCode() + v7.c(this.f87459a.hashCode() * 31, 31, this.f87460b)) * 31;
                io3.d dVar = this.d;
                return iHashCode + (dVar == null ? 0 : dVar.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f87459a);
                dest.writeSerializable(this.f87460b);
                dest.writeString(this.f87461c.name());
                dest.writeSerializable(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Crypto$RevXFiatPocket;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Crypto;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RevXFiatPocket implements Crypto {

            @NotNull
            public static final Parcelable.Creator<RevXFiatPocket> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f87462a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final dj0.d f87463b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final io3.d f87464c;
            public final zld.a d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RevXFiatPocket((dj0.d) parcel.readSerializable(), (io3.d) parcel.readSerializable(), (b) parcel.readSerializable(), zld.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RevXFiatPocket[i];
                }
            }

            public RevXFiatPocket(dj0.d balance, io3.d pocket, b currency, zld.a state) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(balance, "balance");
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f87462a = currency;
                this.f87463b = balance;
                this.f87464c = pocket;
                this.d = state;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof RevXFiatPocket)) {
                    return false;
                }
                RevXFiatPocket revXFiatPocket = (RevXFiatPocket) obj2;
                return Intrinsics.f(this.f87462a, revXFiatPocket.f87462a) && Intrinsics.f(this.f87463b, revXFiatPocket.f87463b) && Intrinsics.f(this.f87464c, revXFiatPocket.f87464c) && this.d == revXFiatPocket.d;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Crypto
            /* JADX INFO: renamed from: getBalance, reason: from getter */
            public final dj0.d getF87463b() {
                return this.f87463b;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Crypto
            /* JADX INFO: renamed from: getCurrency, reason: from getter */
            public final b getF87462a() {
                return this.f87462a;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
            public final IncomeSorterDestinationId getId() {
                return new IncomeSorterDestinationId.Pocket(this.f87464c.f163145a);
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
            /* JADX INFO: renamed from: getState, reason: from getter */
            public final zld.a getE() {
                return this.d;
            }

            public final int hashCode() {
                return this.d.hashCode() + l.g(this.f87464c, v7.c(this.f87462a.hashCode() * 31, 31, this.f87463b), 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f87462a);
                dest.writeSerializable(this.f87463b);
                dest.writeSerializable(this.f87464c);
                dest.writeString(this.d.name());
            }
        }

        /* JADX INFO: renamed from: getBalance */
        dj0.d getF87463b();

        /* JADX INFO: renamed from: getCurrency */
        b getF87462a();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Investment;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo;", "CashHolding", "Instrument", "com/revolut/feature/spending_analytics/api/models/income_sorter/a", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Investment$CashHolding;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Investment$Instrument;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Investment extends IncomeSorterDestinationInfo {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Investment$CashHolding;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Investment;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CashHolding implements Investment {

            @NotNull
            public static final Parcelable.Creator<CashHolding> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f87465a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final dj0.d f87466b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final dj0.d f87467c;
            public final boolean d;
            public final String e;
            public final com.revolut.feature.spending_analytics.api.models.income_sorter.a f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final hel.b f87468g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final zld.a f87469h;
            public final String i;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CashHolding((b) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), parcel.readInt() != 0, parcel.readString(), com.revolut.feature.spending_analytics.api.models.income_sorter.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : hel.b.valueOf(parcel.readString()), zld.a.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CashHolding[i];
                }
            }

            public CashHolding(b cashHoldingCurrency, dj0.d balance, dj0.d balanceInHoldingCurrency, boolean z, String portfolioId, com.revolut.feature.spending_analytics.api.models.income_sorter.a investmentType, hel.b bVar, zld.a state, String str) {
                Intrinsics.checkNotNullParameter(cashHoldingCurrency, "cashHoldingCurrency");
                Intrinsics.checkNotNullParameter(balance, "balance");
                Intrinsics.checkNotNullParameter(balanceInHoldingCurrency, "balanceInHoldingCurrency");
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(investmentType, "investmentType");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f87465a = cashHoldingCurrency;
                this.f87466b = balance;
                this.f87467c = balanceInHoldingCurrency;
                this.d = z;
                this.e = portfolioId;
                this.f = investmentType;
                this.f87468g = bVar;
                this.f87469h = state;
                this.i = str;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment
            /* JADX INFO: renamed from: Y8, reason: from getter */
            public final com.revolut.feature.spending_analytics.api.models.income_sorter.a getK() {
                return this.f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CashHolding)) {
                    return false;
                }
                CashHolding cashHolding = (CashHolding) obj2;
                return Intrinsics.f(this.f87465a, cashHolding.f87465a) && Intrinsics.f(this.f87466b, cashHolding.f87466b) && Intrinsics.f(this.f87467c, cashHolding.f87467c) && this.d == cashHolding.d && Intrinsics.f(this.e, cashHolding.e) && this.f == cashHolding.f && this.f87468g == cashHolding.f87468g && this.f87469h == cashHolding.f87469h && Intrinsics.f(this.i, cashHolding.i);
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getF87475j() {
                return this.e;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
            public final IncomeSorterDestinationId getId() {
                return new IncomeSorterDestinationId.Portfolio(this.e, this.f87465a);
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
            /* JADX INFO: renamed from: getState, reason: from getter */
            public final zld.a getE() {
                return this.f87469h;
            }

            public final int hashCode() {
                int iHashCode = (this.f.hashCode() + p.a.c(j6.a.c(v7.c(v7.c(this.f87465a.hashCode() * 31, 31, this.f87466b), 31, this.f87467c), 31, this.d), 31, this.e)) * 31;
                hel.b bVar = this.f87468g;
                int iHashCode2 = (this.f87469h.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
                String str = this.i;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment
            /* JADX INFO: renamed from: r0, reason: from getter */
            public final hel.b getF87476l() {
                return this.f87468g;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment
            /* JADX INFO: renamed from: s7, reason: from getter */
            public final String getF87478n() {
                return this.i;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f87465a);
                dest.writeSerializable(this.f87466b);
                dest.writeSerializable(this.f87467c);
                dest.writeInt(this.d ? 1 : 0);
                dest.writeString(this.e);
                dest.writeString(this.f.name());
                hel.b bVar = this.f87468g;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
                }
                dest.writeString(this.f87469h.name());
                dest.writeString(this.i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Investment$Instrument;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Investment;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Instrument implements Investment {

            @NotNull
            public static final Parcelable.Creator<Instrument> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f87470a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f87471b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f87472c;
            public final b d;
            public final BigDecimal e;
            public final dj0.d f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final dj0.d f87473g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final dj0.d f87474h;
            public final BigDecimal i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final String f87475j;
            public final com.revolut.feature.spending_analytics.api.models.income_sorter.a k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final hel.b f87476l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final zld.a f87477m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final String f87478n;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Instrument(parcel.readString(), parcel.readString(), parcel.readString(), (b) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), com.revolut.feature.spending_analytics.api.models.income_sorter.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : hel.b.valueOf(parcel.readString()), zld.a.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Instrument[i];
                }
            }

            public Instrument(String securityReference, String name, String symbol, b currency, BigDecimal bigDecimal, dj0.d dVar, dj0.d dVar2, dj0.d dVar3, BigDecimal bigDecimal2, String portfolioId, com.revolut.feature.spending_analytics.api.models.income_sorter.a investmentType, hel.b bVar, zld.a state, String str) {
                Intrinsics.checkNotNullParameter(securityReference, "securityReference");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(investmentType, "investmentType");
                Intrinsics.checkNotNullParameter(state, "state");
                this.f87470a = securityReference;
                this.f87471b = name;
                this.f87472c = symbol;
                this.d = currency;
                this.e = bigDecimal;
                this.f = dVar;
                this.f87473g = dVar2;
                this.f87474h = dVar3;
                this.i = bigDecimal2;
                this.f87475j = portfolioId;
                this.k = investmentType;
                this.f87476l = bVar;
                this.f87477m = state;
                this.f87478n = str;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment
            /* JADX INFO: renamed from: Y8, reason: from getter */
            public final com.revolut.feature.spending_analytics.api.models.income_sorter.a getK() {
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
                if (!(obj2 instanceof Instrument)) {
                    return false;
                }
                Instrument instrument = (Instrument) obj2;
                return Intrinsics.f(this.f87470a, instrument.f87470a) && Intrinsics.f(this.f87471b, instrument.f87471b) && Intrinsics.f(this.f87472c, instrument.f87472c) && Intrinsics.f(this.d, instrument.d) && Intrinsics.f(this.e, instrument.e) && Intrinsics.f(this.f, instrument.f) && Intrinsics.f(this.f87473g, instrument.f87473g) && Intrinsics.f(this.f87474h, instrument.f87474h) && Intrinsics.f(this.i, instrument.i) && Intrinsics.f(this.f87475j, instrument.f87475j) && this.k == instrument.k && this.f87476l == instrument.f87476l && this.f87477m == instrument.f87477m && Intrinsics.f(this.f87478n, instrument.f87478n);
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment
            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getF87475j() {
                return this.f87475j;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
            public final IncomeSorterDestinationId getId() {
                b.Companion.getClass();
                return new IncomeSorterDestinationId.Portfolio(this.f87475j, xi0.a.a(this.f87470a));
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
            /* JADX INFO: renamed from: getState, reason: from getter */
            public final zld.a getE() {
                return this.f87477m;
            }

            public final int hashCode() {
                int iJ = l.j(this.d, p.a.c(p.a.c(this.f87470a.hashCode() * 31, 31, this.f87471b), 31, this.f87472c), 31);
                BigDecimal bigDecimal = this.e;
                int iHashCode = (iJ + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
                dj0.d dVar = this.f;
                int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
                dj0.d dVar2 = this.f87473g;
                int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
                dj0.d dVar3 = this.f87474h;
                int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
                BigDecimal bigDecimal2 = this.i;
                int iHashCode5 = (this.k.hashCode() + p.a.c((iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31, 31, this.f87475j)) * 31;
                hel.b bVar = this.f87476l;
                int iHashCode6 = (this.f87477m.hashCode() + ((iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
                String str = this.f87478n;
                return iHashCode6 + (str != null ? str.hashCode() : 0);
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment
            /* JADX INFO: renamed from: r0, reason: from getter */
            public final hel.b getF87476l() {
                return this.f87476l;
            }

            @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo.Investment
            /* JADX INFO: renamed from: s7, reason: from getter */
            public final String getF87478n() {
                return this.f87478n;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f87470a);
                dest.writeString(this.f87471b);
                dest.writeString(this.f87472c);
                dest.writeSerializable(this.d);
                dest.writeSerializable(this.e);
                dest.writeSerializable(this.f);
                dest.writeSerializable(this.f87473g);
                dest.writeSerializable(this.f87474h);
                dest.writeSerializable(this.i);
                dest.writeString(this.f87475j);
                dest.writeString(this.k.name());
                hel.b bVar = this.f87476l;
                if (bVar == null) {
                    dest.writeInt(0);
                } else {
                    org.bouncycastle.jcajce.provider.digest.a.u(dest, 1, bVar);
                }
                dest.writeString(this.f87477m.name());
                dest.writeString(this.f87478n);
            }
        }

        /* JADX INFO: renamed from: Y8 */
        a getK();

        /* JADX INFO: renamed from: g */
        String getF87475j();

        /* JADX INFO: renamed from: r0 */
        hel.b getF87476l();

        /* JADX INFO: renamed from: s7 */
        String getF87478n();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$JointPocket;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JointPocket implements IncomeSorterDestinationInfo {

        @NotNull
        public static final Parcelable.Creator<JointPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io3.d f87479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zld.a f87480b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JointPocket((io3.d) parcel.readSerializable(), zld.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JointPocket[i];
            }
        }

        public JointPocket(io3.d pocket, zld.a state) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f87479a = pocket;
            this.f87480b = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JointPocket)) {
                return false;
            }
            JointPocket jointPocket = (JointPocket) obj2;
            return Intrinsics.f(this.f87479a, jointPocket.f87479a) && this.f87480b == jointPocket.f87480b;
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        public final IncomeSorterDestinationId getId() {
            return new IncomeSorterDestinationId.Pocket(this.f87479a.f163145a);
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final zld.a getE() {
            return this.f87480b;
        }

        public final int hashCode() {
            return this.f87480b.hashCode() + (this.f87479a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87479a);
            dest.writeString(this.f87480b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$PeerToPeerTransfer;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeerToPeerTransfer implements IncomeSorterDestinationInfo {

        @NotNull
        public static final Parcelable.Creator<PeerToPeerTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.l f87481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f87483c;
        public final c d;
        public final zld.a e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PeerToPeerTransfer((zm3.l) parcel.readSerializable(), parcel.readString(), (b) parcel.readSerializable(), (c) parcel.readSerializable(), zld.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeerToPeerTransfer[i];
            }
        }

        public PeerToPeerTransfer(zm3.l contact, String str, b currency, c cVar, zld.a state) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f87481a = contact;
            this.f87482b = str;
            this.f87483c = currency;
            this.d = cVar;
            this.e = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PeerToPeerTransfer)) {
                return false;
            }
            PeerToPeerTransfer peerToPeerTransfer = (PeerToPeerTransfer) obj2;
            return Intrinsics.f(this.f87481a, peerToPeerTransfer.f87481a) && Intrinsics.f(this.f87482b, peerToPeerTransfer.f87482b) && Intrinsics.f(this.f87483c, peerToPeerTransfer.f87483c) && Intrinsics.f(this.d, peerToPeerTransfer.d) && this.e == peerToPeerTransfer.e;
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        public final IncomeSorterDestinationId getId() {
            return new IncomeSorterDestinationId.PeerToPeer(this.f87481a.getCode(), this.f87482b, this.d);
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final zld.a getE() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = this.f87481a.hashCode() * 31;
            String str = this.f87482b;
            int iJ = l.j(this.f87483c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            c cVar = this.d;
            return this.e.hashCode() + ((iJ + (cVar != null ? cVar.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87481a);
            dest.writeString(this.f87482b);
            dest.writeSerializable(this.f87483c);
            dest.writeSerializable(this.d);
            dest.writeString(this.e.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$PersonalCurrencyPocket;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalCurrencyPocket implements IncomeSorterDestinationInfo {

        @NotNull
        public static final Parcelable.Creator<PersonalCurrencyPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io3.d f87484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zld.a f87485b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalCurrencyPocket((io3.d) parcel.readSerializable(), zld.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalCurrencyPocket[i];
            }
        }

        public PersonalCurrencyPocket(io3.d pocket, zld.a state) {
            Intrinsics.checkNotNullParameter(pocket, "pocket");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f87484a = pocket;
            this.f87485b = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PersonalCurrencyPocket)) {
                return false;
            }
            PersonalCurrencyPocket personalCurrencyPocket = (PersonalCurrencyPocket) obj2;
            return Intrinsics.f(this.f87484a, personalCurrencyPocket.f87484a) && this.f87485b == personalCurrencyPocket.f87485b;
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        public final IncomeSorterDestinationId getId() {
            return new IncomeSorterDestinationId.Pocket(this.f87484a.f163145a);
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final zld.a getE() {
            return this.f87485b;
        }

        public final int hashCode() {
            return this.f87485b.hashCode() + (this.f87484a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f87484a);
            dest.writeString(this.f87485b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$RoboPortfolio;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RoboPortfolio implements IncomeSorterDestinationInfo {

        @NotNull
        public static final Parcelable.Creator<RoboPortfolio> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RoboPortfolioInfo f87486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f87487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f87488c;
        public final zld.a d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RoboPortfolio((RoboPortfolioInfo) parcel.readParcelable(RoboPortfolio.class.getClassLoader()), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), zld.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RoboPortfolio[i];
            }
        }

        public RoboPortfolio(RoboPortfolioInfo portfolio, dj0.d balance, dj0.d balanceInPortfolioCurrency, zld.a state) {
            Intrinsics.checkNotNullParameter(portfolio, "portfolio");
            Intrinsics.checkNotNullParameter(balance, "balance");
            Intrinsics.checkNotNullParameter(balanceInPortfolioCurrency, "balanceInPortfolioCurrency");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f87486a = portfolio;
            this.f87487b = balance;
            this.f87488c = balanceInPortfolioCurrency;
            this.d = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RoboPortfolio)) {
                return false;
            }
            RoboPortfolio roboPortfolio = (RoboPortfolio) obj2;
            return Intrinsics.f(this.f87486a, roboPortfolio.f87486a) && Intrinsics.f(this.f87487b, roboPortfolio.f87487b) && Intrinsics.f(this.f87488c, roboPortfolio.f87488c) && this.d == roboPortfolio.d;
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        public final IncomeSorterDestinationId getId() {
            RoboPortfolioInfo roboPortfolioInfo = this.f87486a;
            return new IncomeSorterDestinationId.Portfolio(roboPortfolioInfo.f95703c, roboPortfolioInfo.f);
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final zld.a getE() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + v7.c(v7.c(this.f87486a.hashCode() * 31, 31, this.f87487b), 31, this.f87488c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87486a, i);
            dest.writeSerializable(this.f87487b);
            dest.writeSerializable(this.f87488c);
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$Savings;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Savings implements IncomeSorterDestinationInfo {

        @NotNull
        public static final Parcelable.Creator<Savings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SavingsAccountDetails f87489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dj0.d f87490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final zld.a f87491c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Savings((SavingsAccountDetails) parcel.readParcelable(Savings.class.getClassLoader()), (dj0.d) parcel.readSerializable(), zld.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Savings[i];
            }
        }

        public Savings(SavingsAccountDetails savingsAccountDetails, dj0.d dVar, zld.a state) {
            Intrinsics.checkNotNullParameter(savingsAccountDetails, "savingsAccountDetails");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f87489a = savingsAccountDetails;
            this.f87490b = dVar;
            this.f87491c = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Savings)) {
                return false;
            }
            Savings savings = (Savings) obj2;
            return Intrinsics.f(this.f87489a, savings.f87489a) && Intrinsics.f(this.f87490b, savings.f87490b) && this.f87491c == savings.f87491c;
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        public final IncomeSorterDestinationId getId() {
            return new IncomeSorterDestinationId.Savings(this.f87489a.f86460a.f234881a);
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final zld.a getE() {
            return this.f87491c;
        }

        public final int hashCode() {
            int iHashCode = this.f87489a.hashCode() * 31;
            dj0.d dVar = this.f87490b;
            return this.f87491c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87489a, i);
            dest.writeSerializable(this.f87490b);
            dest.writeString(this.f87491c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo$SubaccountPocket;", "Lcom/revolut/feature/spending_analytics/api/models/income_sorter/IncomeSorterDestinationInfo;", "", "toString", "()Ljava/lang/String;", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubaccountPocket implements IncomeSorterDestinationInfo {

        @NotNull
        public static final Parcelable.Creator<SubaccountPocket> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subaccount f87492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f87493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f87494c;
        public final dj0.d d;
        public final zld.a e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubaccountPocket((Subaccount) parcel.readParcelable(SubaccountPocket.class.getClassLoader()), (Image) parcel.readParcelable(SubaccountPocket.class.getClassLoader()), (dj0.d) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), zld.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubaccountPocket[i];
            }
        }

        public SubaccountPocket(Subaccount subaccount, Image icon, dj0.d dVar, dj0.d dVar2, zld.a state) {
            Intrinsics.checkNotNullParameter(subaccount, "subaccount");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f87492a = subaccount;
            this.f87493b = icon;
            this.f87494c = dVar;
            this.d = dVar2;
            this.e = state;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubaccountPocket)) {
                return false;
            }
            SubaccountPocket subaccountPocket = (SubaccountPocket) obj2;
            return Intrinsics.f(this.f87492a, subaccountPocket.f87492a) && Intrinsics.f(this.f87493b, subaccountPocket.f87493b) && Intrinsics.f(this.f87494c, subaccountPocket.f87494c) && Intrinsics.f(this.d, subaccountPocket.d) && this.e == subaccountPocket.e;
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        public final IncomeSorterDestinationId getId() {
            String pocketId = this.f87492a.getPocketId();
            if (pocketId != null) {
                return new IncomeSorterDestinationId.Pocket(pocketId);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo
        /* JADX INFO: renamed from: getState, reason: from getter */
        public final zld.a getE() {
            return this.e;
        }

        public final int hashCode() {
            int iC = a10.b.c(this.f87493b, this.f87492a.hashCode() * 31, 31);
            dj0.d dVar = this.f87494c;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            dj0.d dVar2 = this.d;
            return this.e.hashCode() + ((iHashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f87492a, i);
            dest.writeParcelable(this.f87493b, i);
            dest.writeSerializable(this.f87494c);
            dest.writeSerializable(this.d);
            dest.writeString(this.e.name());
        }
    }

    IncomeSorterDestinationId getId();

    /* JADX INFO: renamed from: getState */
    zld.a getE();
}
