package com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.flow.ReusableFlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ChatScreen", "BankTransfer", "CardTransfer", "Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlowContract$Step$BankTransfer;", "Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlowContract$Step$CardTransfer;", "Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlowContract$Step$ChatScreen;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferOnlyChatToTransferFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlowContract$Step$BankTransfer;", "Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTransfer implements TransferOnlyChatToTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BankTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTransferRecipient.BeneficiaryRecipient f79804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferMoneyPocket f79805b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankTransfer((ChatTransferRecipient.BeneficiaryRecipient) parcel.readParcelable(BankTransfer.class.getClassLoader()), (TransferMoneyPocket) parcel.readParcelable(BankTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTransfer[i];
            }
        }

        public BankTransfer(ChatTransferRecipient.BeneficiaryRecipient chatTransferRecipient, TransferMoneyPocket transferMoneyPocket) {
            Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
            this.f79804a = chatTransferRecipient;
            this.f79805b = transferMoneyPocket;
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
            return Intrinsics.f(this.f79804a, bankTransfer.f79804a) && Intrinsics.f(this.f79805b, bankTransfer.f79805b);
        }

        public final int hashCode() {
            int iHashCode = this.f79804a.hashCode() * 31;
            TransferMoneyPocket transferMoneyPocket = this.f79805b;
            return iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79804a, i);
            dest.writeParcelable(this.f79805b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlowContract$Step$CardTransfer;", "Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardTransfer implements TransferOnlyChatToTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTransferRecipient.CardRecipient f79806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferMoneyPocket f79807b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardTransfer((ChatTransferRecipient.CardRecipient) parcel.readParcelable(CardTransfer.class.getClassLoader()), (TransferMoneyPocket) parcel.readParcelable(CardTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardTransfer[i];
            }
        }

        public CardTransfer(ChatTransferRecipient.CardRecipient chatTransferRecipient, TransferMoneyPocket transferMoneyPocket) {
            Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
            this.f79806a = chatTransferRecipient;
            this.f79807b = transferMoneyPocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardTransfer)) {
                return false;
            }
            CardTransfer cardTransfer = (CardTransfer) obj2;
            return Intrinsics.f(this.f79806a, cardTransfer.f79806a) && Intrinsics.f(this.f79807b, cardTransfer.f79807b);
        }

        public final int hashCode() {
            int iHashCode = this.f79806a.f79718a.hashCode() * 31;
            TransferMoneyPocket transferMoneyPocket = this.f79807b;
            return iHashCode + (transferMoneyPocket == null ? 0 : transferMoneyPocket.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79806a, i);
            dest.writeParcelable(this.f79807b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlowContract$Step$ChatScreen;", "Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlowContract$Step;", "Lcom/revolut/kompot/navigable/flow/ReusableFlowStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChatScreen implements TransferOnlyChatToTransferFlowContract$Step, ReusableFlowStep {

        @NotNull
        public static final Parcelable.Creator<ChatScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChatTransferRecipient f79808a;

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

        public ChatScreen(ChatTransferRecipient chatTransferRecipient) {
            Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
            this.f79808a = chatTransferRecipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChatScreen) && Intrinsics.f(this.f79808a, ((ChatScreen) obj2).f79808a);
        }

        @Override // com.revolut.kompot.navigable.flow.ReusableFlowStep
        public final String getKey() {
            return "chat";
        }

        public final int hashCode() {
            return this.f79808a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79808a, i);
        }
    }
}
