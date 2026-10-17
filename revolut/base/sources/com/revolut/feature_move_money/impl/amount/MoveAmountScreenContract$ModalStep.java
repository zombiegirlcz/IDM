package com.revolut.feature_move_money.impl.amount;

import android.os.Parcel;
import android.os.Parcelable;
import b6i.j;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.UnsettledDialogInputData;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserInputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"com/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "OptionsSelector", "SchedulingSettings", "StopOrderSettings", "LimitOrderSettings", "BalancePicker", "CurrencyPicker", "OrderAutomations", "OrderBasedOnExchange", "UnsettledDialog", "TaaInvestAllowanceDialog", "JisaCashHoldingAvailableToWithdrawInfoDialog", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$BalancePicker;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$JisaCashHoldingAvailableToWithdrawInfoDialog;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$LimitOrderSettings;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$OptionsSelector;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$OrderAutomations;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$OrderBasedOnExchange;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$SchedulingSettings;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$StopOrderSettings;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$TaaInvestAllowanceDialog;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$UnsettledDialog;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MoveAmountScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$BalancePicker;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalancePicker implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BalancePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BalanceSelector$InputData f97253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x5i.d f97254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AccountWrapper f97255c;
        public final j d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BalancePicker((BalanceSelector$InputData) parcel.readParcelable(BalancePicker.class.getClassLoader()), x5i.d.valueOf(parcel.readString()), (AccountWrapper) parcel.readParcelable(BalancePicker.class.getClassLoader()), j.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalancePicker[i];
            }
        }

        public BalancePicker(BalanceSelector$InputData inputData, x5i.d destinationType, AccountWrapper oppositeAccount, j inputPosition) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(destinationType, "destinationType");
            Intrinsics.checkNotNullParameter(oppositeAccount, "oppositeAccount");
            Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
            this.f97253a = inputData;
            this.f97254b = destinationType;
            this.f97255c = oppositeAccount;
            this.d = inputPosition;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BalancePicker)) {
                return false;
            }
            BalancePicker balancePicker = (BalancePicker) obj2;
            return Intrinsics.f(this.f97253a, balancePicker.f97253a) && this.f97254b == balancePicker.f97254b && Intrinsics.f(this.f97255c, balancePicker.f97255c) && this.d == balancePicker.d;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f97255c.hashCode() + ((this.f97254b.hashCode() + (this.f97253a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97253a, i);
            dest.writeString(this.f97254b.name());
            dest.writeParcelable(this.f97255c, i);
            dest.writeString(this.d.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPicker implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CurrencyPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CurrencyChooserInputData f97256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f97257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final x5i.d f97258c;
        public final AccountWrapper d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyPicker((CurrencyChooserInputData) parcel.readParcelable(CurrencyPicker.class.getClassLoader()), j.valueOf(parcel.readString()), x5i.d.valueOf(parcel.readString()), (AccountWrapper) parcel.readParcelable(CurrencyPicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPicker[i];
            }
        }

        public CurrencyPicker(CurrencyChooserInputData inputData, j inputPosition, x5i.d destinationType, AccountWrapper oppositeAccount) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
            Intrinsics.checkNotNullParameter(destinationType, "destinationType");
            Intrinsics.checkNotNullParameter(oppositeAccount, "oppositeAccount");
            this.f97256a = inputData;
            this.f97257b = inputPosition;
            this.f97258c = destinationType;
            this.d = oppositeAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyPicker)) {
                return false;
            }
            CurrencyPicker currencyPicker = (CurrencyPicker) obj2;
            return Intrinsics.f(this.f97256a, currencyPicker.f97256a) && this.f97257b == currencyPicker.f97257b && this.f97258c == currencyPicker.f97258c && Intrinsics.f(this.d, currencyPicker.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f97258c.hashCode() + ((this.f97257b.hashCode() + (this.f97256a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97256a, i);
            dest.writeString(this.f97257b.name());
            dest.writeString(this.f97258c.name());
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$JisaCashHoldingAvailableToWithdrawInfoDialog;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JisaCashHoldingAvailableToWithdrawInfoDialog implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<JisaCashHoldingAvailableToWithdrawInfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount.TaxAdvantage.JIsa f97259a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JisaCashHoldingAvailableToWithdrawInfoDialog((TradingAccount.TaxAdvantage.JIsa) parcel.readParcelable(JisaCashHoldingAvailableToWithdrawInfoDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JisaCashHoldingAvailableToWithdrawInfoDialog[i];
            }
        }

        public JisaCashHoldingAvailableToWithdrawInfoDialog(TradingAccount.TaxAdvantage.JIsa jisaTradingAccount) {
            Intrinsics.checkNotNullParameter(jisaTradingAccount, "jisaTradingAccount");
            this.f97259a = jisaTradingAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JisaCashHoldingAvailableToWithdrawInfoDialog) && Intrinsics.f(this.f97259a, ((JisaCashHoldingAvailableToWithdrawInfoDialog) obj2).f97259a);
        }

        public final int hashCode() {
            return this.f97259a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97259a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$OptionsSelector;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptionsSelector implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OptionsSelector> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveAmountScreenContract$OrderContext f97262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OrderMode f97263b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptionsSelector(MoveAmountScreenContract$OrderContext.CREATOR.createFromParcel(parcel), (OrderMode) parcel.readParcelable(OptionsSelector.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptionsSelector[i];
            }
        }

        public OptionsSelector(MoveAmountScreenContract$OrderContext orderContext, OrderMode orderMode) {
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            this.f97262a = orderContext;
            this.f97263b = orderMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OptionsSelector)) {
                return false;
            }
            OptionsSelector optionsSelector = (OptionsSelector) obj2;
            return Intrinsics.f(this.f97262a, optionsSelector.f97262a) && Intrinsics.f(this.f97263b, optionsSelector.f97263b);
        }

        public final int hashCode() {
            int iHashCode = this.f97262a.hashCode() * 31;
            OrderMode orderMode = this.f97263b;
            return iHashCode + (orderMode == null ? 0 : orderMode.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97262a.writeToParcel(dest, i);
            dest.writeParcelable(this.f97263b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$OrderAutomations;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderAutomations implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OrderAutomations> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveAmountScreenContract$OrderContext f97264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OrderMode f97265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f97266c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderAutomations(MoveAmountScreenContract$OrderContext.CREATOR.createFromParcel(parcel), (OrderMode) parcel.readParcelable(OrderAutomations.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderAutomations[i];
            }
        }

        public OrderAutomations(MoveAmountScreenContract$OrderContext orderContext, OrderMode orderMode, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            this.f97264a = orderContext;
            this.f97265b = orderMode;
            this.f97266c = z;
            this.d = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderAutomations)) {
                return false;
            }
            OrderAutomations orderAutomations = (OrderAutomations) obj2;
            return Intrinsics.f(this.f97264a, orderAutomations.f97264a) && Intrinsics.f(this.f97265b, orderAutomations.f97265b) && this.f97266c == orderAutomations.f97266c && this.d == orderAutomations.d;
        }

        public final int hashCode() {
            int iHashCode = this.f97264a.hashCode() * 31;
            OrderMode orderMode = this.f97265b;
            return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (orderMode == null ? 0 : orderMode.hashCode())) * 31, 31, this.f97266c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97264a.writeToParcel(dest, i);
            dest.writeParcelable(this.f97265b, i);
            dest.writeInt(this.f97266c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$OrderBasedOnExchange;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderBasedOnExchange implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<OrderBasedOnExchange> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveAmountScreenContract$OrderContext f97267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OrderMode f97268b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderBasedOnExchange(MoveAmountScreenContract$OrderContext.CREATOR.createFromParcel(parcel), (OrderMode) parcel.readParcelable(OrderBasedOnExchange.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderBasedOnExchange[i];
            }
        }

        public OrderBasedOnExchange(MoveAmountScreenContract$OrderContext orderContext, OrderMode orderMode) {
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            this.f97267a = orderContext;
            this.f97268b = orderMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderBasedOnExchange)) {
                return false;
            }
            OrderBasedOnExchange orderBasedOnExchange = (OrderBasedOnExchange) obj2;
            return Intrinsics.f(this.f97267a, orderBasedOnExchange.f97267a) && Intrinsics.f(this.f97268b, orderBasedOnExchange.f97268b);
        }

        public final int hashCode() {
            int iHashCode = this.f97267a.hashCode() * 31;
            OrderMode orderMode = this.f97268b;
            return iHashCode + (orderMode == null ? 0 : orderMode.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97267a.writeToParcel(dest, i);
            dest.writeParcelable(this.f97268b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$SchedulingSettings;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SchedulingSettings implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SchedulingSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferScheduleData f97269a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m1l.a f97270b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SchedulingSettings((TransferScheduleData) parcel.readParcelable(SchedulingSettings.class.getClassLoader()), m1l.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SchedulingSettings[i];
            }
        }

        public SchedulingSettings(TransferScheduleData scheduleData, m1l.a scheduleMode) {
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
            this.f97269a = scheduleData;
            this.f97270b = scheduleMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SchedulingSettings)) {
                return false;
            }
            SchedulingSettings schedulingSettings = (SchedulingSettings) obj2;
            return Intrinsics.f(this.f97269a, schedulingSettings.f97269a) && this.f97270b == schedulingSettings.f97270b;
        }

        public final int hashCode() {
            return this.f97270b.hashCode() + (this.f97269a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97269a, i);
            dest.writeString(this.f97270b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$TaaInvestAllowanceDialog;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaaInvestAllowanceDialog implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TaaInvestAllowanceDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TradingAccount.TaxAdvantage f97273a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaaInvestAllowanceDialog((TradingAccount.TaxAdvantage) parcel.readParcelable(TaaInvestAllowanceDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaaInvestAllowanceDialog[i];
            }
        }

        public TaaInvestAllowanceDialog(TradingAccount.TaxAdvantage tradingAccount) {
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            this.f97273a = tradingAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaaInvestAllowanceDialog) && Intrinsics.f(this.f97273a, ((TaaInvestAllowanceDialog) obj2).f97273a);
        }

        public final int hashCode() {
            return this.f97273a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97273a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$UnsettledDialog;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnsettledDialog implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UnsettledDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnsettledDialogInputData f97274a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnsettledDialog((UnsettledDialogInputData) parcel.readParcelable(UnsettledDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnsettledDialog[i];
            }
        }

        public UnsettledDialog(UnsettledDialogInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f97274a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnsettledDialog) && Intrinsics.f(this.f97274a, ((UnsettledDialog) obj2).f97274a);
        }

        public final int hashCode() {
            return this.f97274a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97274a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$LimitOrderSettings;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitOrderSettings implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LimitOrderSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveAmountScreenContract$OrderContext f97260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97261b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LimitOrderSettings(MoveAmountScreenContract$OrderContext.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitOrderSettings[i];
            }
        }

        public LimitOrderSettings(MoveAmountScreenContract$OrderContext orderContext, String prefilledRate) {
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            Intrinsics.checkNotNullParameter(prefilledRate, "prefilledRate");
            this.f97260a = orderContext;
            this.f97261b = prefilledRate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LimitOrderSettings)) {
                return false;
            }
            LimitOrderSettings limitOrderSettings = (LimitOrderSettings) obj2;
            return Intrinsics.f(this.f97260a, limitOrderSettings.f97260a) && Intrinsics.f(this.f97261b, limitOrderSettings.f97261b);
        }

        public final int hashCode() {
            return this.f97261b.hashCode() + (this.f97260a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97260a.writeToParcel(dest, i);
            dest.writeString(this.f97261b);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LimitOrderSettings(MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext) {
            this(moveAmountScreenContract$OrderContext, "");
            m70.a.c(t0.f186434a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep$StopOrderSettings;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StopOrderSettings implements MoveAmountScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<StopOrderSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveAmountScreenContract$OrderContext f97271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97272b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StopOrderSettings(MoveAmountScreenContract$OrderContext.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StopOrderSettings[i];
            }
        }

        public StopOrderSettings(MoveAmountScreenContract$OrderContext orderContext, String prefilledRate) {
            Intrinsics.checkNotNullParameter(orderContext, "orderContext");
            Intrinsics.checkNotNullParameter(prefilledRate, "prefilledRate");
            this.f97271a = orderContext;
            this.f97272b = prefilledRate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StopOrderSettings)) {
                return false;
            }
            StopOrderSettings stopOrderSettings = (StopOrderSettings) obj2;
            return Intrinsics.f(this.f97271a, stopOrderSettings.f97271a) && Intrinsics.f(this.f97272b, stopOrderSettings.f97272b);
        }

        public final int hashCode() {
            return this.f97272b.hashCode() + (this.f97271a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97271a.writeToParcel(dest, i);
            dest.writeString(this.f97272b);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ StopOrderSettings(MoveAmountScreenContract$OrderContext moveAmountScreenContract$OrderContext) {
            this(moveAmountScreenContract$OrderContext, "");
            m70.a.c(t0.f186434a);
        }
    }
}
