package com.revolut.feature.push_to_card.impl.ui.card_recipient_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EditLabel", "DeleteConfirmationDialog", "ChangeBackgroundDialog", "Lcom/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreenContract$ModalStep$ChangeBackgroundDialog;", "Lcom/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreenContract$ModalStep$DeleteConfirmationDialog;", "Lcom/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreenContract$ModalStep$EditLabel;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardRecipientDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreenContract$ModalStep$ChangeBackgroundDialog;", "Lcom/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChangeBackgroundDialog implements CardRecipientDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChangeBackgroundDialog f81602a = new ChangeBackgroundDialog();

        @NotNull
        public static final Parcelable.Creator<ChangeBackgroundDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChangeBackgroundDialog.f81602a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreenContract$ModalStep$DeleteConfirmationDialog;", "Lcom/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeleteConfirmationDialog implements CardRecipientDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DeleteConfirmationDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81603a;

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

        public DeleteConfirmationDialog(String cardOwnerFullName) {
            Intrinsics.checkNotNullParameter(cardOwnerFullName, "cardOwnerFullName");
            this.f81603a = cardOwnerFullName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeleteConfirmationDialog) && Intrinsics.f(this.f81603a, ((DeleteConfirmationDialog) obj2).f81603a);
        }

        public final int hashCode() {
            return this.f81603a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81603a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreenContract$ModalStep$EditLabel;", "Lcom/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditLabel implements CardRecipientDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditLabel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwner f81604a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditLabel((CardOwner) parcel.readParcelable(EditLabel.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditLabel[i];
            }
        }

        public EditLabel(CardOwner cardOwner) {
            Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
            this.f81604a = cardOwner;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditLabel) && Intrinsics.f(this.f81604a, ((EditLabel) obj2).f81604a);
        }

        public final int hashCode() {
            return this.f81604a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81604a, i);
        }
    }
}
