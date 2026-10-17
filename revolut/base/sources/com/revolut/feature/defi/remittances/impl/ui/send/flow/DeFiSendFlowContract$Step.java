package com.revolut.feature.defi.remittances.impl.ui.send.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.defi.remittances.impl.domain.model.DeFiTransferQuoteRequest;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.kompot.navigable.flow.FlowStep;
import k71.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "WalletList", "Chat", "AmountInput", "Review", "AddBeneficiary", "WalletDetails", "TransactionDetails", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$AddBeneficiary;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$AmountInput;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$Chat;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$Review;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$TransactionDetails;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$WalletDetails;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$WalletList;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DeFiSendFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$AddBeneficiary;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddBeneficiary implements DeFiSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddBeneficiary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71841a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddBeneficiary(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddBeneficiary[i];
            }
        }

        public AddBeneficiary(String str) {
            this.f71841a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddBeneficiary) && Intrinsics.f(this.f71841a, ((AddBeneficiary) obj2).f71841a);
        }

        public final int hashCode() {
            String str = this.f71841a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71841a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$AmountInput;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountInput implements DeFiSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AmountInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoAddress f71842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71843b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountInput((CryptoAddress) parcel.readParcelable(AmountInput.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountInput[i];
            }
        }

        public AmountInput(CryptoAddress wallet, boolean z) {
            Intrinsics.checkNotNullParameter(wallet, "wallet");
            this.f71842a = wallet;
            this.f71843b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AmountInput)) {
                return false;
            }
            AmountInput amountInput = (AmountInput) obj2;
            return Intrinsics.f(this.f71842a, amountInput.f71842a) && this.f71843b == amountInput.f71843b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71843b) + (this.f71842a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71842a, i);
            dest.writeInt(this.f71843b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$Chat;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Chat implements DeFiSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Chat> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTransferRecipient f71844a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Chat((ChatTransferRecipient) parcel.readParcelable(Chat.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Chat[i];
            }
        }

        public Chat(ChatTransferRecipient recipient) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f71844a = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Chat) && Intrinsics.f(this.f71844a, ((Chat) obj2).f71844a);
        }

        public final int hashCode() {
            return this.f71844a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71844a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$Review;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review implements DeFiSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DeFiTransferQuoteRequest f71845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71846b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(DeFiTransferQuoteRequest.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(DeFiTransferQuoteRequest quoteRequest, boolean z) {
            Intrinsics.checkNotNullParameter(quoteRequest, "quoteRequest");
            this.f71845a = quoteRequest;
            this.f71846b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return Intrinsics.f(this.f71845a, review.f71845a) && this.f71846b == review.f71846b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71846b) + (this.f71845a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f71845a.writeToParcel(dest, i);
            dest.writeInt(this.f71846b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$TransactionDetails;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionDetails implements DeFiSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TransactionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f71847a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionDetails((i) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionDetails[i];
            }
        }

        public TransactionDetails(i descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f71847a = descriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionDetails) && Intrinsics.f(this.f71847a, ((TransactionDetails) obj2).f71847a);
        }

        public final int hashCode() {
            return this.f71847a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71847a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$WalletDetails;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WalletDetails implements DeFiSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WalletDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71848a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WalletDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletDetails[i];
            }
        }

        public WalletDetails(String beneficiaryId) {
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.f71848a = beneficiaryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WalletDetails) && Intrinsics.f(this.f71848a, ((WalletDetails) obj2).f71848a);
        }

        public final int hashCode() {
            return this.f71848a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71848a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step$WalletList;", "Lcom/revolut/feature/defi/remittances/impl/ui/send/flow/DeFiSendFlowContract$Step;", "<init>", "()V", "feature_defi_remittances_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WalletList implements DeFiSendFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WalletList f71849a = new WalletList();

        @NotNull
        public static final Parcelable.Creator<WalletList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WalletList.f71849a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletList[i];
            }
        }

        private WalletList() {
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
