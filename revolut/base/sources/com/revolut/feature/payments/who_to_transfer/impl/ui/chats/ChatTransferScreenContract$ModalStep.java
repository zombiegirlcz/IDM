package com.revolut.feature.payments.who_to_transfer.impl.ui.chats;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zm3.l;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DeleteRevolutContactChatDialog", "DeleteBankChatDialog", "DeleteCardChatDialog", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$ModalStep$DeleteBankChatDialog;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$ModalStep$DeleteCardChatDialog;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$ModalStep$DeleteRevolutContactChatDialog;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChatTransferScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$ModalStep$DeleteBankChatDialog;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteBankChatDialog implements ChatTransferScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DeleteBankChatDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f80153a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteBankChatDialog((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteBankChatDialog[i];
            }
        }

        public DeleteBankChatDialog(f5j.a beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f80153a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteBankChatDialog) && Intrinsics.f(this.f80153a, ((DeleteBankChatDialog) obj2).f80153a);
        }

        public final int hashCode() {
            return this.f80153a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80153a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$ModalStep$DeleteCardChatDialog;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteCardChatDialog implements ChatTransferScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DeleteCardChatDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwnerWithStats f80154a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteCardChatDialog((CardOwnerWithStats) parcel.readParcelable(DeleteCardChatDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteCardChatDialog[i];
            }
        }

        public DeleteCardChatDialog(CardOwnerWithStats cardOwner) {
            Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
            this.f80154a = cardOwner;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteCardChatDialog) && Intrinsics.f(this.f80154a, ((DeleteCardChatDialog) obj2).f80154a);
        }

        public final int hashCode() {
            return this.f80154a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f80154a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$ModalStep$DeleteRevolutContactChatDialog;", "Lcom/revolut/feature/payments/who_to_transfer/impl/ui/chats/ChatTransferScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteRevolutContactChatDialog implements ChatTransferScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DeleteRevolutContactChatDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f80155a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DeleteRevolutContactChatDialog((l) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteRevolutContactChatDialog[i];
            }
        }

        public DeleteRevolutContactChatDialog(l contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f80155a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteRevolutContactChatDialog) && Intrinsics.f(this.f80155a, ((DeleteRevolutContactChatDialog) obj2).f80155a);
        }

        public final int hashCode() {
            return this.f80155a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f80155a);
        }
    }
}
