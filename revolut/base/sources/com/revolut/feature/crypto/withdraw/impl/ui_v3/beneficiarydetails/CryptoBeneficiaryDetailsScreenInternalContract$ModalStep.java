package com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "MultichainInfo", "ChangeBackgroundDialog", "BelongToYouDialog", "CommonRemittanceField", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep$BelongToYouDialog;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep$ChangeBackgroundDialog;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep$CommonRemittanceField;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep$MultichainInfo;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoBeneficiaryDetailsScreenInternalContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep$BelongToYouDialog;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BelongToYouDialog implements CryptoBeneficiaryDetailsScreenInternalContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BelongToYouDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71285a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BelongToYouDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BelongToYouDialog[i];
            }
        }

        public BelongToYouDialog(String cryptoAddressId) {
            Intrinsics.checkNotNullParameter(cryptoAddressId, "cryptoAddressId");
            this.f71285a = cryptoAddressId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BelongToYouDialog) && Intrinsics.f(this.f71285a, ((BelongToYouDialog) obj2).f71285a);
        }

        public final int hashCode() {
            return this.f71285a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71285a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep$ChangeBackgroundDialog;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangeBackgroundDialog implements CryptoBeneficiaryDetailsScreenInternalContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeBackgroundDialog f71286a = new ChangeBackgroundDialog();

        @NotNull
        public static final Parcelable.Creator<ChangeBackgroundDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangeBackgroundDialog.f71286a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep$CommonRemittanceField;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CommonRemittanceField implements CryptoBeneficiaryDetailsScreenInternalContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CommonRemittanceField> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransactionCryptoRemittanceAction f71287a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CommonRemittanceField((TransactionCryptoRemittanceAction) parcel.readParcelable(CommonRemittanceField.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CommonRemittanceField[i];
            }
        }

        public CommonRemittanceField(TransactionCryptoRemittanceAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f71287a = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CommonRemittanceField) && Intrinsics.f(this.f71287a, ((CommonRemittanceField) obj2).f71287a);
        }

        public final int hashCode() {
            return this.f71287a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71287a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep$MultichainInfo;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/beneficiarydetails/CryptoBeneficiaryDetailsScreenInternalContract$ModalStep;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MultichainInfo implements CryptoBeneficiaryDetailsScreenInternalContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MultichainInfo f71288a = new MultichainInfo();

        @NotNull
        public static final Parcelable.Creator<MultichainInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MultichainInfo.f71288a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MultichainInfo[i];
            }
        }

        private MultichainInfo() {
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
