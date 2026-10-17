package com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "ForTradingAccount", "ForSelectedCashHolding", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$InputData$ForSelectedCashHolding;", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$InputData$ForTradingAccount;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CashHoldingsInfoFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$InputData$ForSelectedCashHolding;", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ForSelectedCashHolding implements CashHoldingsInfoFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ForSelectedCashHolding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kel.b f96001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f96002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WealthDisclaimersContract$Disclaimer$Investment f96003c;
        public final hel.b d;
        public final TradingAccount e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForSelectedCashHolding((kel.b) parcel.readSerializable(), (Clause) parcel.readParcelable(ForSelectedCashHolding.class.getClassLoader()), (WealthDisclaimersContract$Disclaimer$Investment) parcel.readParcelable(ForSelectedCashHolding.class.getClassLoader()), hel.b.valueOf(parcel.readString()), (TradingAccount) parcel.readParcelable(ForSelectedCashHolding.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForSelectedCashHolding[i];
            }
        }

        public ForSelectedCashHolding(kel.b cashHolding, Clause explanationTitle, WealthDisclaimersContract$Disclaimer$Investment disclaimersData, hel.b tradingContext, TradingAccount tradingAccount) {
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            Intrinsics.checkNotNullParameter(explanationTitle, "explanationTitle");
            Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
            Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f96001a = cashHolding;
            this.f96002b = explanationTitle;
            this.f96003c = disclaimersData;
            this.d = tradingContext;
            this.e = tradingAccount;
        }

        @Override // com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData
        /* JADX INFO: renamed from: N, reason: from getter */
        public final TradingAccount getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ForSelectedCashHolding)) {
                return false;
            }
            ForSelectedCashHolding forSelectedCashHolding = (ForSelectedCashHolding) obj2;
            return Intrinsics.f(this.f96001a, forSelectedCashHolding.f96001a) && Intrinsics.f(this.f96002b, forSelectedCashHolding.f96002b) && Intrinsics.f(this.f96003c, forSelectedCashHolding.f96003c) && this.d == forSelectedCashHolding.d && Intrinsics.f(this.e, forSelectedCashHolding.e);
        }

        @Override // com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData
        /* JADX INFO: renamed from: f8, reason: from getter */
        public final WealthDisclaimersContract$Disclaimer$Investment getF96006c() {
            return this.f96003c;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f96003c.hashCode() + p.a.a(this.f96001a.hashCode() * 31, 31, this.f96002b)) * 31)) * 31);
        }

        @Override // com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData
        /* JADX INFO: renamed from: r0, reason: from getter */
        public final hel.b getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96001a);
            dest.writeParcelable(this.f96002b, i);
            dest.writeParcelable(this.f96003c, i);
            dest.writeString(this.d.name());
            dest.writeParcelable(this.e, i);
        }

        @Override // com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData
        /* JADX INFO: renamed from: y4, reason: from getter */
        public final Clause getF96005b() {
            return this.f96002b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$InputData$ForTradingAccount;", "Lcom/revolut/feature/wealth/ui/impl/holding/disclaimer/flow/CashHoldingsInfoFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ForTradingAccount implements CashHoldingsInfoFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ForTradingAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f96004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f96005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WealthDisclaimersContract$Disclaimer$Investment f96006c;
        public final hel.b d;
        public final TradingAccount e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ForTradingAccount((Clause) parcel.readParcelable(ForTradingAccount.class.getClassLoader()), (Clause) parcel.readParcelable(ForTradingAccount.class.getClassLoader()), (WealthDisclaimersContract$Disclaimer$Investment) parcel.readParcelable(ForTradingAccount.class.getClassLoader()), hel.b.valueOf(parcel.readString()), (TradingAccount) parcel.readParcelable(ForTradingAccount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForTradingAccount[i];
            }
        }

        public ForTradingAccount(Clause selectorTitle, Clause explanationTitle, WealthDisclaimersContract$Disclaimer$Investment disclaimersData, hel.b tradingContext, TradingAccount tradingAccount) {
            Intrinsics.checkNotNullParameter(selectorTitle, "selectorTitle");
            Intrinsics.checkNotNullParameter(explanationTitle, "explanationTitle");
            Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
            Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f96004a = selectorTitle;
            this.f96005b = explanationTitle;
            this.f96006c = disclaimersData;
            this.d = tradingContext;
            this.e = tradingAccount;
        }

        @Override // com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData
        /* JADX INFO: renamed from: N, reason: from getter */
        public final TradingAccount getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ForTradingAccount)) {
                return false;
            }
            ForTradingAccount forTradingAccount = (ForTradingAccount) obj2;
            return Intrinsics.f(this.f96004a, forTradingAccount.f96004a) && Intrinsics.f(this.f96005b, forTradingAccount.f96005b) && Intrinsics.f(this.f96006c, forTradingAccount.f96006c) && this.d == forTradingAccount.d && Intrinsics.f(this.e, forTradingAccount.e);
        }

        @Override // com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData
        /* JADX INFO: renamed from: f8, reason: from getter */
        public final WealthDisclaimersContract$Disclaimer$Investment getF96006c() {
            return this.f96006c;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f96006c.hashCode() + p.a.a(this.f96004a.hashCode() * 31, 31, this.f96005b)) * 31)) * 31);
        }

        @Override // com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData
        /* JADX INFO: renamed from: r0, reason: from getter */
        public final hel.b getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96004a, i);
            dest.writeParcelable(this.f96005b, i);
            dest.writeParcelable(this.f96006c, i);
            dest.writeString(this.d.name());
            dest.writeParcelable(this.e, i);
        }

        @Override // com.revolut.feature.wealth.ui.impl.holding.disclaimer.flow.CashHoldingsInfoFlowContract$InputData
        /* JADX INFO: renamed from: y4, reason: from getter */
        public final Clause getF96005b() {
            return this.f96005b;
        }
    }

    /* JADX INFO: renamed from: N */
    TradingAccount getE();

    /* JADX INFO: renamed from: f8 */
    WealthDisclaimersContract$Disclaimer$Investment getF96006c();

    /* JADX INFO: renamed from: r0 */
    hel.b getD();

    /* JADX INFO: renamed from: y4 */
    Clause getF96005b();
}
