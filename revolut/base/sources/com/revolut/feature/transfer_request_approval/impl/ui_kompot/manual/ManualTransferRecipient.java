package com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferRecipient;", "Landroid/os/Parcelable;", "Internal", "Apm", "BankBeneficiary", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferRecipient$Apm;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferRecipient$BankBeneficiary;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferRecipient$Internal;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ManualTransferRecipient extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferRecipient$Apm;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferRecipient;", "", "toString", "()Ljava/lang/String;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Apm implements ManualTransferRecipient {

        @NotNull
        public static final Parcelable.Creator<Apm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ApmContact f92458a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Apm((ApmContact) parcel.readParcelable(Apm.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Apm[i];
            }
        }

        public Apm(ApmContact contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f92458a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Apm) && Intrinsics.f(this.f92458a, ((Apm) obj2).f92458a);
        }

        public final int hashCode() {
            return this.f92458a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92458a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferRecipient$BankBeneficiary;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferRecipient;", "", "toString", "()Ljava/lang/String;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankBeneficiary implements ManualTransferRecipient {

        @NotNull
        public static final Parcelable.Creator<BankBeneficiary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f92459a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankBeneficiary((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankBeneficiary[i];
            }
        }

        public BankBeneficiary(f5j.a beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f92459a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BankBeneficiary) && Intrinsics.f(this.f92459a, ((BankBeneficiary) obj2).f92459a);
        }

        public final int hashCode() {
            return this.f92459a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92459a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferRecipient$Internal;", "Lcom/revolut/feature/transfer_request_approval/impl/ui_kompot/manual/ManualTransferRecipient;", "", "toString", "()Ljava/lang/String;", "feature_transfer_request_approval_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Internal implements ManualTransferRecipient {

        @NotNull
        public static final Parcelable.Creator<Internal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.a f92460a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Internal((zm3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Internal[i];
            }
        }

        public Internal(zm3.a contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f92460a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Internal) && Intrinsics.f(this.f92460a, ((Internal) obj2).f92460a);
        }

        public final int hashCode() {
            return this.f92460a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f92460a);
        }
    }
}
