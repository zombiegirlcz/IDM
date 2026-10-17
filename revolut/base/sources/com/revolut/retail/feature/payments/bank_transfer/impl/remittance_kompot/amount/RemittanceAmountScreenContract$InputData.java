package com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/amount/RemittanceAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "NewTransfer", "WithTransferData", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/amount/RemittanceAmountScreenContract$InputData$NewTransfer;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/amount/RemittanceAmountScreenContract$InputData$WithTransferData;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RemittanceAmountScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/amount/RemittanceAmountScreenContract$InputData$NewTransfer;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/amount/RemittanceAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTransfer implements RemittanceAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<NewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RemittancePaymentsCountryData f102025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferFlowType f102026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TransferMoneyPocket f102027c;
        public final m1l.a d;
        public final TransferScheduleData e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewTransfer((RemittancePaymentsCountryData) parcel.readParcelable(NewTransfer.class.getClassLoader()), (TransferFlowType) parcel.readParcelable(NewTransfer.class.getClassLoader()), (TransferMoneyPocket) parcel.readParcelable(NewTransfer.class.getClassLoader()), m1l.a.valueOf(parcel.readString()), (TransferScheduleData) parcel.readParcelable(NewTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewTransfer[i];
            }
        }

        public NewTransfer(RemittancePaymentsCountryData countryData, TransferFlowType flowType, TransferMoneyPocket moneyPocket, m1l.a scheduleMode, TransferScheduleData scheduleData) {
            Intrinsics.checkNotNullParameter(countryData, "countryData");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
            Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            this.f102025a = countryData;
            this.f102026b = flowType;
            this.f102027c = moneyPocket;
            this.d = scheduleMode;
            this.e = scheduleData;
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData
        /* JADX INFO: renamed from: K, reason: from getter */
        public final TransferFlowType getF102029b() {
            return this.f102026b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewTransfer)) {
                return false;
            }
            NewTransfer newTransfer = (NewTransfer) obj2;
            return Intrinsics.f(this.f102025a, newTransfer.f102025a) && Intrinsics.f(this.f102026b, newTransfer.f102026b) && Intrinsics.f(this.f102027c, newTransfer.f102027c) && this.d == newTransfer.d && Intrinsics.f(this.e, newTransfer.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f102027c.hashCode() + d.c(this.f102026b, this.f102025a.hashCode() * 31, 31)) * 31)) * 31);
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData
        /* JADX INFO: renamed from: i3, reason: from getter */
        public final RemittancePaymentsCountryData getF102028a() {
            return this.f102025a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102025a, i);
            dest.writeParcelable(this.f102026b, i);
            dest.writeParcelable(this.f102027c, i);
            dest.writeString(this.d.name());
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/amount/RemittanceAmountScreenContract$InputData$WithTransferData;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/amount/RemittanceAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithTransferData implements RemittanceAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<WithTransferData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RemittancePaymentsCountryData f102028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferFlowType f102029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RemittanceTransferData f102030c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithTransferData((RemittancePaymentsCountryData) parcel.readParcelable(WithTransferData.class.getClassLoader()), (TransferFlowType) parcel.readParcelable(WithTransferData.class.getClassLoader()), RemittanceTransferData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithTransferData[i];
            }
        }

        public WithTransferData(RemittancePaymentsCountryData countryData, TransferFlowType flowType, RemittanceTransferData transferData) {
            Intrinsics.checkNotNullParameter(countryData, "countryData");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(transferData, "transferData");
            this.f102028a = countryData;
            this.f102029b = flowType;
            this.f102030c = transferData;
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData
        /* JADX INFO: renamed from: K, reason: from getter */
        public final TransferFlowType getF102029b() {
            return this.f102029b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithTransferData)) {
                return false;
            }
            WithTransferData withTransferData = (WithTransferData) obj2;
            return Intrinsics.f(this.f102028a, withTransferData.f102028a) && Intrinsics.f(this.f102029b, withTransferData.f102029b) && Intrinsics.f(this.f102030c, withTransferData.f102030c);
        }

        public final int hashCode() {
            return this.f102030c.hashCode() + d.c(this.f102029b, this.f102028a.hashCode() * 31, 31);
        }

        @Override // com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreenContract$InputData
        /* JADX INFO: renamed from: i3, reason: from getter */
        public final RemittancePaymentsCountryData getF102028a() {
            return this.f102028a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102028a, i);
            dest.writeParcelable(this.f102029b, i);
            this.f102030c.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: renamed from: K */
    TransferFlowType getF102029b();

    /* JADX INFO: renamed from: i3 */
    RemittancePaymentsCountryData getF102028a();
}
