package com.revolut.retail.feature.beneficiary.impl.ui.bank_beneficiary_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EditLabel", "DeleteConfirmationDialog", "EditConfirmationDialog", "PdaDialog", "ChangeBackgroundDialog", "Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep$ChangeBackgroundDialog;", "Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep$DeleteConfirmationDialog;", "Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep$EditConfirmationDialog;", "Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep$EditLabel;", "Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep$PdaDialog;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BankBeneficiaryDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep$ChangeBackgroundDialog;", "Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangeBackgroundDialog implements BankBeneficiaryDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeBackgroundDialog f99662a = new ChangeBackgroundDialog();

        @NotNull
        public static final Parcelable.Creator<ChangeBackgroundDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangeBackgroundDialog.f99662a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeBackgroundDialog[i];
            }
        }

        private ChangeBackgroundDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep$DeleteConfirmationDialog;", "Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteConfirmationDialog implements BankBeneficiaryDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DeleteConfirmationDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99663a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteConfirmationDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteConfirmationDialog[i];
            }
        }

        public DeleteConfirmationDialog(String printableBeneficiaryName) {
            Intrinsics.checkNotNullParameter(printableBeneficiaryName, "printableBeneficiaryName");
            this.f99663a = printableBeneficiaryName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteConfirmationDialog) && Intrinsics.f(this.f99663a, ((DeleteConfirmationDialog) obj2).f99663a);
        }

        public final int hashCode() {
            return this.f99663a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99663a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep$EditConfirmationDialog;", "Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditConfirmationDialog implements BankBeneficiaryDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditConfirmationDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f99664a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditConfirmationDialog((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditConfirmationDialog[i];
            }
        }

        public EditConfirmationDialog(f5j.a recipient) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f99664a = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditConfirmationDialog) && Intrinsics.f(this.f99664a, ((EditConfirmationDialog) obj2).f99664a);
        }

        public final int hashCode() {
            return this.f99664a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99664a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep$EditLabel;", "Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditLabel implements BankBeneficiaryDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditLabel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f99665a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditLabel((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditLabel[i];
            }
        }

        public EditLabel(f5j.a recipient) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f99665a = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditLabel) && Intrinsics.f(this.f99665a, ((EditLabel) obj2).f99665a);
        }

        public final int hashCode() {
            return this.f99665a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f99665a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep$PdaDialog;", "Lcom/revolut/retail/feature/beneficiary/impl/ui/bank_beneficiary_details/BankBeneficiaryDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PdaDialog implements BankBeneficiaryDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PdaDialog f99666a = new PdaDialog();

        @NotNull
        public static final Parcelable.Creator<PdaDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PdaDialog.f99666a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PdaDialog[i];
            }
        }

        private PdaDialog() {
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
