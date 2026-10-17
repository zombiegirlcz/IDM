package com.revolut.feature.security_hub.impl.ui.transactions_day_night_limits.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "OtherPaymentsAndTransfers", "TransfersToIndividuals", "ChangeRequest", "ForeignCurrencyExchange", "AnnualInbound", "ReadOnlyLimitDialog", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$AnnualInbound;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$ChangeRequest;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$ForeignCurrencyExchange;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$OtherPaymentsAndTransfers;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$ReadOnlyLimitDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$TransfersToIndividuals;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransactionsDayNightLimitsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$AnnualInbound;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnnualInbound implements TransactionsDayNightLimitsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AnnualInbound> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletLimit.CounterLimit f85721a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AnnualInbound((WalletLimit.CounterLimit) parcel.readParcelable(AnnualInbound.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnnualInbound[i];
            }
        }

        public AnnualInbound(WalletLimit.CounterLimit counterLimit) {
            Intrinsics.checkNotNullParameter(counterLimit, "counterLimit");
            this.f85721a = counterLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AnnualInbound) && Intrinsics.f(this.f85721a, ((AnnualInbound) obj2).f85721a);
        }

        public final int hashCode() {
            return this.f85721a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85721a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$ChangeRequest;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeRequest implements TransactionsDayNightLimitsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ChangeRequest> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutboundTransactionLimit f85722a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeRequest(OutboundTransactionLimit.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeRequest[i];
            }
        }

        public ChangeRequest(OutboundTransactionLimit limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f85722a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeRequest) && Intrinsics.f(this.f85722a, ((ChangeRequest) obj2).f85722a);
        }

        public final int hashCode() {
            return this.f85722a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f85722a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$ForeignCurrencyExchange;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForeignCurrencyExchange implements TransactionsDayNightLimitsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ForeignCurrencyExchange f85723a = new ForeignCurrencyExchange();

        @NotNull
        public static final Parcelable.Creator<ForeignCurrencyExchange> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ForeignCurrencyExchange.f85723a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForeignCurrencyExchange[i];
            }
        }

        private ForeignCurrencyExchange() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$OtherPaymentsAndTransfers;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OtherPaymentsAndTransfers implements TransactionsDayNightLimitsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OtherPaymentsAndTransfers f85724a = new OtherPaymentsAndTransfers();

        @NotNull
        public static final Parcelable.Creator<OtherPaymentsAndTransfers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OtherPaymentsAndTransfers.f85724a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OtherPaymentsAndTransfers[i];
            }
        }

        private OtherPaymentsAndTransfers() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$ReadOnlyLimitDialog;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReadOnlyLimitDialog implements TransactionsDayNightLimitsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ReadOnlyLimitDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutboundTransactionLimit f85725a;

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

        public ReadOnlyLimitDialog(OutboundTransactionLimit limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f85725a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReadOnlyLimitDialog) && Intrinsics.f(this.f85725a, ((ReadOnlyLimitDialog) obj2).f85725a);
        }

        public final int hashCode() {
            return this.f85725a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f85725a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep$TransfersToIndividuals;", "Lcom/revolut/feature/security_hub/impl/ui/transactions_day_night_limits/screen/TransactionsDayNightLimitsScreenContract$ModalStep;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransfersToIndividuals implements TransactionsDayNightLimitsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransfersToIndividuals f85726a = new TransfersToIndividuals();

        @NotNull
        public static final Parcelable.Creator<TransfersToIndividuals> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransfersToIndividuals.f85726a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransfersToIndividuals[i];
            }
        }

        private TransfersToIndividuals() {
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
}
