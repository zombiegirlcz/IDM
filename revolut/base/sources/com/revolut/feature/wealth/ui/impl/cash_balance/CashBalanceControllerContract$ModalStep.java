package com.revolut.feature.wealth.ui.impl.cash_balance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior.isa.api.navigation.JuniorIsaAccountOwnership;
import com.revolut.feature.wealth.ui.api.navigation.cash_balance.CashBalanceInfoDialogInputData;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingSelectorInputData;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pih.j;
import prk.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AvailableToWithdrawDialog", "JisaAvailableToWithdrawDialog", "UnsettledDialog", "CashHoldingsSelectorDialog", "CashBalanceInfoDialog", "KompotDescriptor", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$AvailableToWithdrawDialog;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$CashBalanceInfoDialog;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$CashHoldingsSelectorDialog;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$JisaAvailableToWithdrawDialog;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$KompotDescriptor;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$UnsettledDialog;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CashBalanceControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$AvailableToWithdrawDialog;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AvailableToWithdrawDialog implements CashBalanceControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AvailableToWithdrawDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kel.b f95953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f95954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TradingLegalEntityInformation f95955c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AvailableToWithdrawDialog((kel.b) parcel.readSerializable(), (TradingAccount) parcel.readParcelable(AvailableToWithdrawDialog.class.getClassLoader()), (TradingLegalEntityInformation) parcel.readParcelable(AvailableToWithdrawDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AvailableToWithdrawDialog[i];
            }
        }

        public AvailableToWithdrawDialog(kel.b cashHolding, TradingAccount tradingAccount, TradingLegalEntityInformation tradingLegalEntityInformation) {
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
            this.f95953a = cashHolding;
            this.f95954b = tradingAccount;
            this.f95955c = tradingLegalEntityInformation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AvailableToWithdrawDialog)) {
                return false;
            }
            AvailableToWithdrawDialog availableToWithdrawDialog = (AvailableToWithdrawDialog) obj2;
            return Intrinsics.f(this.f95953a, availableToWithdrawDialog.f95953a) && Intrinsics.f(this.f95954b, availableToWithdrawDialog.f95954b) && Intrinsics.f(this.f95955c, availableToWithdrawDialog.f95955c);
        }

        public final int hashCode() {
            return this.f95955c.hashCode() + o.b(this.f95954b, this.f95953a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95953a);
            dest.writeParcelable(this.f95954b, i);
            dest.writeParcelable(this.f95955c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$CashBalanceInfoDialog;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashBalanceInfoDialog implements CashBalanceControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CashBalanceInfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CashBalanceInfoDialogInputData f95956a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashBalanceInfoDialog((CashBalanceInfoDialogInputData) parcel.readParcelable(CashBalanceInfoDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashBalanceInfoDialog[i];
            }
        }

        public CashBalanceInfoDialog(CashBalanceInfoDialogInputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f95956a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CashBalanceInfoDialog) && Intrinsics.f(this.f95956a, ((CashBalanceInfoDialog) obj2).f95956a);
        }

        public final int hashCode() {
            return this.f95956a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95956a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$CashHoldingsSelectorDialog;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CashHoldingsSelectorDialog implements CashBalanceControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CashHoldingsSelectorDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CashHoldingSelectorInputData f95957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zjh.o f95958b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CashHoldingsSelectorDialog((CashHoldingSelectorInputData) parcel.readParcelable(CashHoldingsSelectorDialog.class.getClassLoader()), zjh.o.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CashHoldingsSelectorDialog[i];
            }
        }

        public CashHoldingsSelectorDialog(CashHoldingSelectorInputData inputData, zjh.o actionType) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            Intrinsics.checkNotNullParameter(actionType, "actionType");
            this.f95957a = inputData;
            this.f95958b = actionType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CashHoldingsSelectorDialog)) {
                return false;
            }
            CashHoldingsSelectorDialog cashHoldingsSelectorDialog = (CashHoldingsSelectorDialog) obj2;
            return Intrinsics.f(this.f95957a, cashHoldingsSelectorDialog.f95957a) && this.f95958b == cashHoldingsSelectorDialog.f95958b;
        }

        public final int hashCode() {
            return this.f95958b.hashCode() + (this.f95957a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95957a, i);
            dest.writeString(this.f95958b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$JisaAvailableToWithdrawDialog;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JisaAvailableToWithdrawDialog implements CashBalanceControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<JisaAvailableToWithdrawDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorIsaAccountOwnership f95959a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JisaAvailableToWithdrawDialog((JuniorIsaAccountOwnership) parcel.readParcelable(JisaAvailableToWithdrawDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JisaAvailableToWithdrawDialog[i];
            }
        }

        public JisaAvailableToWithdrawDialog(JuniorIsaAccountOwnership jisaOwnership) {
            Intrinsics.checkNotNullParameter(jisaOwnership, "jisaOwnership");
            this.f95959a = jisaOwnership;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JisaAvailableToWithdrawDialog) && Intrinsics.f(this.f95959a, ((JisaAvailableToWithdrawDialog) obj2).f95959a);
        }

        public final int hashCode() {
            return this.f95959a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95959a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$KompotDescriptor;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class KompotDescriptor implements CashBalanceControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<KompotDescriptor> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableControllerDescriptor f95960a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new KompotDescriptor((ParcelableControllerDescriptor) parcel.readParcelable(KompotDescriptor.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KompotDescriptor[i];
            }
        }

        public KompotDescriptor(ParcelableControllerDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f95960a = descriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof KompotDescriptor) && Intrinsics.f(this.f95960a, ((KompotDescriptor) obj2).f95960a);
        }

        public final int hashCode() {
            return this.f95960a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95960a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep$UnsettledDialog;", "Lcom/revolut/feature/wealth/ui/impl/cash_balance/CashBalanceControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnsettledDialog implements CashBalanceControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UnsettledDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final kel.b f95961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TradingAccount f95962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f95963c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnsettledDialog((kel.b) parcel.readSerializable(), (TradingAccount) parcel.readParcelable(UnsettledDialog.class.getClassLoader()), j.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnsettledDialog[i];
            }
        }

        public UnsettledDialog(kel.b cashHolding, TradingAccount tradingAccount, j configuration) {
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f95961a = cashHolding;
            this.f95962b = tradingAccount;
            this.f95963c = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UnsettledDialog)) {
                return false;
            }
            UnsettledDialog unsettledDialog = (UnsettledDialog) obj2;
            return Intrinsics.f(this.f95961a, unsettledDialog.f95961a) && Intrinsics.f(this.f95962b, unsettledDialog.f95962b) && this.f95963c == unsettledDialog.f95963c;
        }

        public final int hashCode() {
            return this.f95963c.hashCode() + o.b(this.f95962b, this.f95961a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f95961a);
            dest.writeParcelable(this.f95962b, i);
            dest.writeString(this.f95963c.name());
        }
    }
}
