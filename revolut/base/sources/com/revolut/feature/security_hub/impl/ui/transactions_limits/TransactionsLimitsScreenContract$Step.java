package com.revolut.feature.security_hub.impl.ui.transactions_limits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DailyLimitDialog", "WeeklyLimitDialog", "MonetisationDialog", "LimitDisableConfirmation", "WalletBalanceDialog", "YearlyBalanceDialog", "DailyLimitInfoDialog", "ReadOnlyLimitDialog", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$DailyLimitDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$DailyLimitInfoDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$LimitDisableConfirmation;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$MonetisationDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$ReadOnlyLimitDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$WalletBalanceDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$WeeklyLimitDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$YearlyBalanceDialog;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionsLimitsScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$DailyLimitDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DailyLimitDialog implements TransactionsLimitsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DailyLimitDialog f85739a = new DailyLimitDialog();

        @NotNull
        public static final Parcelable.Creator<DailyLimitDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DailyLimitDialog.f85739a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DailyLimitDialog[i];
            }
        }

        private DailyLimitDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$DailyLimitInfoDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DailyLimitInfoDialog implements TransactionsLimitsScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<DailyLimitInfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutboundTransactionLimit f85740a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DailyLimitInfoDialog(OutboundTransactionLimit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DailyLimitInfoDialog[i];
            }
        }

        public DailyLimitInfoDialog(OutboundTransactionLimit transactionLimit) {
            Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
            this.f85740a = transactionLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DailyLimitInfoDialog) && Intrinsics.f(this.f85740a, ((DailyLimitInfoDialog) obj2).f85740a);
        }

        public final int hashCode() {
            return this.f85740a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f85740a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$LimitDisableConfirmation;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LimitDisableConfirmation implements TransactionsLimitsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LimitDisableConfirmation f85741a = new LimitDisableConfirmation();

        @NotNull
        public static final Parcelable.Creator<LimitDisableConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LimitDisableConfirmation.f85741a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitDisableConfirmation[i];
            }
        }

        private LimitDisableConfirmation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$MonetisationDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MonetisationDialog implements TransactionsLimitsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MonetisationDialog f85742a = new MonetisationDialog();

        @NotNull
        public static final Parcelable.Creator<MonetisationDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MonetisationDialog.f85742a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MonetisationDialog[i];
            }
        }

        private MonetisationDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$ReadOnlyLimitDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReadOnlyLimitDialog implements TransactionsLimitsScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReadOnlyLimitDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutboundTransactionLimit f85743a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReadOnlyLimitDialog(OutboundTransactionLimit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReadOnlyLimitDialog[i];
            }
        }

        public ReadOnlyLimitDialog(OutboundTransactionLimit transactionLimit) {
            Intrinsics.checkNotNullParameter(transactionLimit, "transactionLimit");
            this.f85743a = transactionLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReadOnlyLimitDialog) && Intrinsics.f(this.f85743a, ((ReadOnlyLimitDialog) obj2).f85743a);
        }

        public final int hashCode() {
            return this.f85743a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f85743a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$WalletBalanceDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WalletBalanceDialog implements TransactionsLimitsScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<WalletBalanceDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletLimit.CounterLimit f85744a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WalletBalanceDialog((WalletLimit.CounterLimit) parcel.readParcelable(WalletBalanceDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletBalanceDialog[i];
            }
        }

        public WalletBalanceDialog(WalletLimit.CounterLimit counterLimit) {
            Intrinsics.checkNotNullParameter(counterLimit, "counterLimit");
            this.f85744a = counterLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WalletBalanceDialog) && Intrinsics.f(this.f85744a, ((WalletBalanceDialog) obj2).f85744a);
        }

        public final int hashCode() {
            return this.f85744a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85744a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$WeeklyLimitDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WeeklyLimitDialog implements TransactionsLimitsScreenContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WeeklyLimitDialog f85745a = new WeeklyLimitDialog();

        @NotNull
        public static final Parcelable.Creator<WeeklyLimitDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WeeklyLimitDialog.f85745a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WeeklyLimitDialog[i];
            }
        }

        private WeeklyLimitDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step$YearlyBalanceDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_limits/TransactionsLimitsScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class YearlyBalanceDialog implements TransactionsLimitsScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<YearlyBalanceDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletLimit.CounterLimit f85746a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new YearlyBalanceDialog((WalletLimit.CounterLimit) parcel.readParcelable(YearlyBalanceDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new YearlyBalanceDialog[i];
            }
        }

        public YearlyBalanceDialog(WalletLimit.CounterLimit counterLimit) {
            Intrinsics.checkNotNullParameter(counterLimit, "counterLimit");
            this.f85746a = counterLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof YearlyBalanceDialog) && Intrinsics.f(this.f85746a, ((YearlyBalanceDialog) obj2).f85746a);
        }

        public final int hashCode() {
            return this.f85746a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85746a, i);
        }
    }
}
