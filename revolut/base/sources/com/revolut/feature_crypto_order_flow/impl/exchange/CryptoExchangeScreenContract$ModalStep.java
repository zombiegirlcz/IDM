package com.revolut.feature_crypto_order_flow.impl.exchange;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import ip0.v7;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RecurringSettings", "LimitSettings", "TpslSettings", "BalanceBreakdown", "CryptoBalanceBreakdown", "CurrencyPicker", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$BalanceBreakdown;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$CryptoBalanceBreakdown;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$LimitSettings;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$RecurringSettings;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$TpslSettings;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoExchangeScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$BalanceBreakdown;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalanceBreakdown implements CryptoExchangeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BalanceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f96724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final StakingPocket f96725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f96726c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BalanceBreakdown((dj0.d) parcel.readSerializable(), (StakingPocket) parcel.readParcelable(BalanceBreakdown.class.getClassLoader()), (dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalanceBreakdown[i];
            }
        }

        public BalanceBreakdown(dj0.d pocketBalance, StakingPocket stakingPocket, dj0.d blockedByOpenRevXOrder) {
            Intrinsics.checkNotNullParameter(pocketBalance, "pocketBalance");
            Intrinsics.checkNotNullParameter(blockedByOpenRevXOrder, "blockedByOpenRevXOrder");
            this.f96724a = pocketBalance;
            this.f96725b = stakingPocket;
            this.f96726c = blockedByOpenRevXOrder;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BalanceBreakdown)) {
                return false;
            }
            BalanceBreakdown balanceBreakdown = (BalanceBreakdown) obj2;
            return Intrinsics.f(this.f96724a, balanceBreakdown.f96724a) && Intrinsics.f(this.f96725b, balanceBreakdown.f96725b) && Intrinsics.f(this.f96726c, balanceBreakdown.f96726c);
        }

        public final int hashCode() {
            int iHashCode = this.f96724a.hashCode() * 31;
            StakingPocket stakingPocket = this.f96725b;
            return this.f96726c.hashCode() + ((iHashCode + (stakingPocket == null ? 0 : stakingPocket.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96724a);
            dest.writeParcelable(this.f96725b, i);
            dest.writeSerializable(this.f96726c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$CryptoBalanceBreakdown;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CryptoBalanceBreakdown implements CryptoExchangeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CryptoBalanceBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f96727a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CryptoBalanceBreakdown((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CryptoBalanceBreakdown[i];
            }
        }

        public CryptoBalanceBreakdown(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f96727a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CryptoBalanceBreakdown) && Intrinsics.f(this.f96727a, ((CryptoBalanceBreakdown) obj2).f96727a);
        }

        public final int hashCode() {
            return this.f96727a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96727a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep;", "Buy", "Sell", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$CurrencyPicker$Buy;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$CurrencyPicker$Sell;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface CurrencyPicker extends CryptoExchangeScreenContract$ModalStep {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$CurrencyPicker$Buy;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$CurrencyPicker;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Buy implements CurrencyPicker {

            @NotNull
            public static final Parcelable.Creator<Buy> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CryptoOrderDraft f96728a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f96729b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f96730c;
            public final boolean d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Buy((CryptoOrderDraft) parcel.readParcelable(Buy.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Buy[i];
                }
            }

            public Buy(CryptoOrderDraft draft, boolean z, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(draft, "draft");
                this.f96728a = draft;
                this.f96729b = z;
                this.f96730c = z3;
                this.d = z4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Buy)) {
                    return false;
                }
                Buy buy = (Buy) obj2;
                return Intrinsics.f(this.f96728a, buy.f96728a) && this.f96729b == buy.f96729b && this.f96730c == buy.f96730c && this.d == buy.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f96728a.hashCode() * 31, 31, this.f96729b), 31, this.f96730c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f96728a, i);
                dest.writeInt(this.f96729b ? 1 : 0);
                dest.writeInt(this.f96730c ? 1 : 0);
                dest.writeInt(this.d ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$CurrencyPicker$Sell;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$CurrencyPicker;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Sell implements CurrencyPicker {

            @NotNull
            public static final Parcelable.Creator<Sell> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CryptoOrderDraft f96731a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Set f96732b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    CryptoOrderDraft cryptoOrderDraft = (CryptoOrderDraft) j6.a.f(parcel, "parcel", Sell.class);
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    int iD = 0;
                    while (iD != i) {
                        iD = v7.d(parcel, linkedHashSet, iD, 1);
                    }
                    return new Sell(cryptoOrderDraft, linkedHashSet);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Sell[i];
                }
            }

            public Sell(CryptoOrderDraft draft, Set currencies) {
                Intrinsics.checkNotNullParameter(draft, "draft");
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                this.f96731a = draft;
                this.f96732b = currencies;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Sell)) {
                    return false;
                }
                Sell sell = (Sell) obj2;
                return Intrinsics.f(this.f96731a, sell.f96731a) && Intrinsics.f(this.f96732b, sell.f96732b);
            }

            public final int hashCode() {
                return this.f96732b.hashCode() + (this.f96731a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f96731a, i);
                Iterator itV = n.v(this.f96732b, dest);
                while (itV.hasNext()) {
                    dest.writeSerializable((Serializable) itV.next());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$LimitSettings;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitSettings implements CryptoExchangeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LimitSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TakeProfitStopLossParams f96733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h f96734b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitSettings((TakeProfitStopLossParams) parcel.readParcelable(LimitSettings.class.getClassLoader()), h.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitSettings[i];
            }
        }

        public LimitSettings(TakeProfitStopLossParams params, h newExchangeOrderType) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(newExchangeOrderType, "newExchangeOrderType");
            this.f96733a = params;
            this.f96734b = newExchangeOrderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitSettings)) {
                return false;
            }
            LimitSettings limitSettings = (LimitSettings) obj2;
            return Intrinsics.f(this.f96733a, limitSettings.f96733a) && this.f96734b == limitSettings.f96734b;
        }

        public final int hashCode() {
            return this.f96734b.hashCode() + (this.f96733a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96733a, i);
            dest.writeString(this.f96734b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$RecurringSettings;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurringSettings implements CryptoExchangeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RecurringSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f96735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hua.c f96736b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurringSettings((LocalDate) parcel.readSerializable(), hua.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurringSettings[i];
            }
        }

        public RecurringSettings(LocalDate selectedDate, hua.c selectedPeriod) {
            Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
            Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
            this.f96735a = selectedDate;
            this.f96736b = selectedPeriod;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RecurringSettings)) {
                return false;
            }
            RecurringSettings recurringSettings = (RecurringSettings) obj2;
            return Intrinsics.f(this.f96735a, recurringSettings.f96735a) && this.f96736b == recurringSettings.f96736b;
        }

        public final int hashCode() {
            return this.f96736b.hashCode() + (this.f96735a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f96735a);
            dest.writeString(this.f96736b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep$TpslSettings;", "Lcom/revolut/feature_crypto_order_flow/impl/exchange/CryptoExchangeScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TpslSettings implements CryptoExchangeScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TpslSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TakeProfitStopLossParams f96737a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TpslSettings((TakeProfitStopLossParams) parcel.readParcelable(TpslSettings.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TpslSettings[i];
            }
        }

        public TpslSettings(TakeProfitStopLossParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f96737a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TpslSettings) && Intrinsics.f(this.f96737a, ((TpslSettings) obj2).f96737a);
        }

        public final int hashCode() {
            return this.f96737a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96737a, i);
        }
    }
}
