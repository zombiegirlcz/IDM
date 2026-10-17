package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.beneficiary.ConfirmationResult;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/review/BankTransferReviewScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BeneficiaryDetails", "RemoveScannedBill", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/review/BankTransferReviewScreenContract$ModalStep$BeneficiaryDetails;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/review/BankTransferReviewScreenContract$ModalStep$RemoveScannedBill;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BankTransferReviewScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/review/BankTransferReviewScreenContract$ModalStep$BeneficiaryDetails;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/review/BankTransferReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BeneficiaryDetails implements BankTransferReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BeneficiaryDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConfirmationResult f102125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102126b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BeneficiaryDetails((ConfirmationResult) parcel.readParcelable(BeneficiaryDetails.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BeneficiaryDetails[i];
            }
        }

        public BeneficiaryDetails(ConfirmationResult confirmationResult, String str) {
            this.f102125a = confirmationResult;
            this.f102126b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BeneficiaryDetails)) {
                return false;
            }
            BeneficiaryDetails beneficiaryDetails = (BeneficiaryDetails) obj2;
            return Intrinsics.f(this.f102125a, beneficiaryDetails.f102125a) && Intrinsics.f(this.f102126b, beneficiaryDetails.f102126b);
        }

        public final int hashCode() {
            ConfirmationResult confirmationResult = this.f102125a;
            int iHashCode = (confirmationResult == null ? 0 : confirmationResult.hashCode()) * 31;
            String str = this.f102126b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102125a, i);
            dest.writeString(this.f102126b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/review/BankTransferReviewScreenContract$ModalStep$RemoveScannedBill;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/review/BankTransferReviewScreenContract$ModalStep;", "<init>", "()V", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoveScannedBill implements BankTransferReviewScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RemoveScannedBill f102127a = new RemoveScannedBill();

        @NotNull
        public static final Parcelable.Creator<RemoveScannedBill> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RemoveScannedBill.f102127a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveScannedBill[i];
            }
        }

        private RemoveScannedBill() {
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
