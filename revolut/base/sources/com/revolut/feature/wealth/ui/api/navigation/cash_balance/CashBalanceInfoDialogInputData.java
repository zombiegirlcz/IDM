package com.revolut.feature.wealth.ui.api.navigation.cash_balance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceInfoDialogInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "Consolidated", "Specific", "MarginBorrowingLimitInfoDialog", "Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceInfoDialogInputData$Consolidated;", "Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceInfoDialogInputData$MarginBorrowingLimitInfoDialog;", "Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceInfoDialogInputData$Specific;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CashBalanceInfoDialogInputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceInfoDialogInputData$Consolidated;", "Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceInfoDialogInputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consolidated implements CashBalanceInfoDialogInputData {

        @NotNull
        public static final Parcelable.Creator<Consolidated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f95920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingLegalEntityInformation f95921b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Consolidated(arrayList, (TradingLegalEntityInformation) parcel.readParcelable(Consolidated.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consolidated[i];
            }
        }

        public Consolidated(List convertedCashHoldings, TradingLegalEntityInformation tradingLegalEntityInformation) {
            Intrinsics.checkNotNullParameter(convertedCashHoldings, "convertedCashHoldings");
            this.f95920a = convertedCashHoldings;
            this.f95921b = tradingLegalEntityInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Consolidated)) {
                return false;
            }
            Consolidated consolidated = (Consolidated) obj2;
            return Intrinsics.f(this.f95920a, consolidated.f95920a) && Intrinsics.f(this.f95921b, consolidated.f95921b);
        }

        public final int hashCode() {
            int iHashCode = this.f95920a.hashCode() * 31;
            TradingLegalEntityInformation tradingLegalEntityInformation = this.f95921b;
            return iHashCode + (tradingLegalEntityInformation == null ? 0 : tradingLegalEntityInformation.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f95920a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeParcelable(this.f95921b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceInfoDialogInputData$MarginBorrowingLimitInfoDialog;", "Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceInfoDialogInputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarginBorrowingLimitInfoDialog implements CashBalanceInfoDialogInputData {

        @NotNull
        public static final Parcelable.Creator<MarginBorrowingLimitInfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CombinedBuyingPowerConverted.MarginBorrowingLimit f95922a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarginBorrowingLimitInfoDialog((CombinedBuyingPowerConverted.MarginBorrowingLimit) parcel.readParcelable(MarginBorrowingLimitInfoDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarginBorrowingLimitInfoDialog[i];
            }
        }

        public MarginBorrowingLimitInfoDialog(CombinedBuyingPowerConverted.MarginBorrowingLimit marginBorrowingLimit) {
            Intrinsics.checkNotNullParameter(marginBorrowingLimit, "marginBorrowingLimit");
            this.f95922a = marginBorrowingLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarginBorrowingLimitInfoDialog) && Intrinsics.f(this.f95922a, ((MarginBorrowingLimitInfoDialog) obj2).f95922a);
        }

        public final int hashCode() {
            return this.f95922a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95922a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceInfoDialogInputData$Specific;", "Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/CashBalanceInfoDialogInputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Specific implements CashBalanceInfoDialogInputData {

        @NotNull
        public static final Parcelable.Creator<Specific> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f95923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f95924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TradingLegalEntityInformation f95925c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Specific((b) parcel.readSerializable(), (TradingAccount) parcel.readParcelable(Specific.class.getClassLoader()), (TradingLegalEntityInformation) parcel.readParcelable(Specific.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Specific[i];
            }
        }

        public Specific(b cashHolding, TradingAccount tradingAccount, TradingLegalEntityInformation tradingLegalEntityInformation) {
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f95923a = cashHolding;
            this.f95924b = tradingAccount;
            this.f95925c = tradingLegalEntityInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Specific)) {
                return false;
            }
            Specific specific = (Specific) obj2;
            return Intrinsics.f(this.f95923a, specific.f95923a) && Intrinsics.f(this.f95924b, specific.f95924b) && Intrinsics.f(this.f95925c, specific.f95925c);
        }

        public final int hashCode() {
            int iB = o.b(this.f95924b, this.f95923a.hashCode() * 31, 31);
            TradingLegalEntityInformation tradingLegalEntityInformation = this.f95925c;
            return iB + (tradingLegalEntityInformation == null ? 0 : tradingLegalEntityInformation.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95923a);
            dest.writeParcelable(this.f95924b, i);
            dest.writeParcelable(this.f95925c, i);
        }
    }
}
