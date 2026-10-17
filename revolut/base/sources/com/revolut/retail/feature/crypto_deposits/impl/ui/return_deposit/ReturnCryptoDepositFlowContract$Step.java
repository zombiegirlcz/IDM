package com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddressList", "Chat", "Summary", "BeneficiaryDetails", "AddBeneficiary", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step$AddBeneficiary;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step$AddressList;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step$BeneficiaryDetails;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step$Chat;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step$Summary;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ReturnCryptoDepositFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step$AddBeneficiary;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddBeneficiary implements ReturnCryptoDepositFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddBeneficiary f100117a = new AddBeneficiary();

        @NotNull
        public static final Parcelable.Creator<AddBeneficiary> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddBeneficiary.f100117a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddBeneficiary[i];
            }
        }

        private AddBeneficiary() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof AddBeneficiary);
        }

        public final int hashCode() {
            return -2055633836;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step$AddressList;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressList implements ReturnCryptoDepositFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddressList f100118a = new AddressList();

        @NotNull
        public static final Parcelable.Creator<AddressList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddressList.f100118a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressList[i];
            }
        }

        private AddressList() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof AddressList);
        }

        public final int hashCode() {
            return 2033466338;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step$BeneficiaryDetails;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BeneficiaryDetails implements ReturnCryptoDepositFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BeneficiaryDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoAddress f100119a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BeneficiaryDetails((CryptoAddress) parcel.readParcelable(BeneficiaryDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BeneficiaryDetails[i];
            }
        }

        public BeneficiaryDetails(CryptoAddress beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f100119a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BeneficiaryDetails) && Intrinsics.f(this.f100119a, ((BeneficiaryDetails) obj2).f100119a);
        }

        public final int hashCode() {
            return this.f100119a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100119a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step$Chat;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chat implements ReturnCryptoDepositFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoAddress f100120a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chat((CryptoAddress) parcel.readParcelable(Chat.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chat[i];
            }
        }

        public Chat(CryptoAddress beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f100120a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chat) && Intrinsics.f(this.f100120a, ((Chat) obj2).f100120a);
        }

        public final int hashCode() {
            return this.f100120a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100120a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step$Summary;", "Lcom/revolut/retail/feature/crypto_deposits/impl/ui/return_deposit/ReturnCryptoDepositFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Summary implements ReturnCryptoDepositFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Summary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoAddress f100121a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Summary((CryptoAddress) parcel.readParcelable(Summary.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Summary[i];
            }
        }

        public Summary(CryptoAddress beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f100121a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Summary) && Intrinsics.f(this.f100121a, ((Summary) obj2).f100121a);
        }

        public final int hashCode() {
            return this.f100121a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f100121a, i);
        }
    }
}
