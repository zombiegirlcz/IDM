package com.revolut.feature.crypto.withdraw.impl.ui_v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.SupportedSendRecipientInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.CryptoSendConfirmationControllerContract$InputData;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "WalletsList", "ChatScreen", "AmountInput", "SubmitWalletDetails", "Confirmation", "WalletDetails", "CreateCryptoRecipient", "CreateBankRecipient", "BankTransfer", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$AmountInput;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$BankTransfer;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$ChatScreen;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$Confirmation;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$CreateBankRecipient;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$CreateCryptoRecipient;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$SubmitWalletDetails;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$WalletDetails;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$WalletsList;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoSendFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$AmountInput;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountInput implements CryptoSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AmountInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoAddress f71188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f71189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f71190c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountInput((CryptoAddress) parcel.readParcelable(AmountInput.class.getClassLoader()), (b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountInput[i];
            }
        }

        public AmountInput(CryptoAddress beneficiary, b bVar, boolean z) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f71188a = beneficiary;
            this.f71189b = bVar;
            this.f71190c = z;
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
            return Intrinsics.f(this.f71188a, amountInput.f71188a) && Intrinsics.f(this.f71189b, amountInput.f71189b) && this.f71190c == amountInput.f71190c;
        }

        public final int hashCode() {
            int iHashCode = this.f71188a.hashCode() * 31;
            b bVar = this.f71189b;
            return Boolean.hashCode(this.f71190c) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71188a, i);
            dest.writeSerializable(this.f71189b);
            dest.writeInt(this.f71190c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$BankTransfer;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTransfer implements CryptoSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BankTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f71191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferMoneyPocket f71192b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankTransfer((f5j.a) parcel.readSerializable(), (TransferMoneyPocket) parcel.readParcelable(BankTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTransfer[i];
            }
        }

        public BankTransfer(f5j.a beneficiary, TransferMoneyPocket moneyPocket) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(moneyPocket, "moneyPocket");
            this.f71191a = beneficiary;
            this.f71192b = moneyPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BankTransfer)) {
                return false;
            }
            BankTransfer bankTransfer = (BankTransfer) obj2;
            return Intrinsics.f(this.f71191a, bankTransfer.f71191a) && Intrinsics.f(this.f71192b, bankTransfer.f71192b);
        }

        public final int hashCode() {
            return this.f71192b.hashCode() + (this.f71191a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71191a);
            dest.writeParcelable(this.f71192b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$ChatScreen;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatScreen implements CryptoSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChatScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTransferRecipient f71193a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChatScreen((ChatTransferRecipient) parcel.readParcelable(ChatScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChatScreen[i];
            }
        }

        public ChatScreen(ChatTransferRecipient recipient) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f71193a = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChatScreen) && Intrinsics.f(this.f71193a, ((ChatScreen) obj2).f71193a);
        }

        public final int hashCode() {
            return this.f71193a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71193a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$Confirmation;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation implements CryptoSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoSendConfirmationControllerContract$InputData f71194a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(CryptoSendConfirmationControllerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(CryptoSendConfirmationControllerContract$InputData input) {
            Intrinsics.checkNotNullParameter(input, "input");
            this.f71194a = input;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Confirmation) && Intrinsics.f(this.f71194a, ((Confirmation) obj2).f71194a);
        }

        public final int hashCode() {
            return this.f71194a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f71194a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$CreateBankRecipient;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateBankRecipient implements CryptoSendFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateBankRecipient f71195a = new CreateBankRecipient();

        @NotNull
        public static final Parcelable.Creator<CreateBankRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateBankRecipient.f71195a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateBankRecipient[i];
            }
        }

        private CreateBankRecipient() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$CreateCryptoRecipient;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateCryptoRecipient implements CryptoSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateCryptoRecipient> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f71196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f71197b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateCryptoRecipient(parcel.readString(), (b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateCryptoRecipient[i];
            }
        }

        public CreateCryptoRecipient(String str, b bVar) {
            this.f71196a = bVar;
            this.f71197b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateCryptoRecipient)) {
                return false;
            }
            CreateCryptoRecipient createCryptoRecipient = (CreateCryptoRecipient) obj2;
            return Intrinsics.f(this.f71196a, createCryptoRecipient.f71196a) && Intrinsics.f(this.f71197b, createCryptoRecipient.f71197b);
        }

        public final int hashCode() {
            b bVar = this.f71196a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            String str = this.f71197b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71196a);
            dest.writeString(this.f71197b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$SubmitWalletDetails;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubmitWalletDetails implements CryptoSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SubmitWalletDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f71199b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubmitWalletDetails(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubmitWalletDetails[i];
            }
        }

        public SubmitWalletDetails(String beneficiaryId, boolean z) {
            Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
            this.f71198a = beneficiaryId;
            this.f71199b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubmitWalletDetails)) {
                return false;
            }
            SubmitWalletDetails submitWalletDetails = (SubmitWalletDetails) obj2;
            return Intrinsics.f(this.f71198a, submitWalletDetails.f71198a) && this.f71199b == submitWalletDetails.f71199b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f71199b) + (this.f71198a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71198a);
            dest.writeInt(this.f71199b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$WalletDetails;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WalletDetails implements CryptoSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WalletDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f71200a;

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
            this.f71200a = beneficiaryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WalletDetails) && Intrinsics.f(this.f71200a, ((WalletDetails) obj2).f71200a);
        }

        public final int hashCode() {
            return this.f71200a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f71200a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step$WalletsList;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/CryptoSendFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WalletsList implements CryptoSendFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WalletsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f71201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SupportedSendRecipientInput f71202b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WalletsList((b) parcel.readSerializable(), (SupportedSendRecipientInput) parcel.readParcelable(WalletsList.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletsList[i];
            }
        }

        public WalletsList(b bVar, SupportedSendRecipientInput supportedSendRecipientInput) {
            Intrinsics.checkNotNullParameter(supportedSendRecipientInput, "supportedSendRecipientInput");
            this.f71201a = bVar;
            this.f71202b = supportedSendRecipientInput;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WalletsList)) {
                return false;
            }
            WalletsList walletsList = (WalletsList) obj2;
            return Intrinsics.f(this.f71201a, walletsList.f71201a) && Intrinsics.f(this.f71202b, walletsList.f71202b);
        }

        public final int hashCode() {
            b bVar = this.f71201a;
            return this.f71202b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71201a);
            dest.writeParcelable(this.f71202b, i);
        }
    }
}
