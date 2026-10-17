package com.revolut.feature.payments.air.widget.impl.ui.chat;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments.air.widget.impl.model.WidgetRecipient;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient;", "Landroid/os/Parcelable;", "ToCreate", "Created", "PeerToPeer", "Beneficiary", "NewBeneficiary", "Card", "NewCard", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$Created;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$ToCreate;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ResolvedRecipient extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$Beneficiary;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$Created;", "", "toString", "()Ljava/lang/String;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Beneficiary implements Created {

        @NotNull
        public static final Parcelable.Creator<Beneficiary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5j.a f79108a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Beneficiary((f5j.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Beneficiary[i];
            }
        }

        public Beneficiary(f5j.a beneficiary) {
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f79108a = beneficiary;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Beneficiary) && Intrinsics.f(this.f79108a, ((Beneficiary) obj2).f79108a);
        }

        public final int hashCode() {
            return this.f79108a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79108a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$Card;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$Created;", "", "toString", "()Ljava/lang/String;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Card implements Created {

        @NotNull
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardOwner f79109a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Card((CardOwner) parcel.readParcelable(Card.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card(CardOwner cardOwner) {
            Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
            this.f79109a = cardOwner;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Card) && Intrinsics.f(this.f79109a, ((Card) obj2).f79109a);
        }

        public final int hashCode() {
            return this.f79109a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79109a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$Created;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$Beneficiary;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$Card;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$PeerToPeer;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Created extends ResolvedRecipient {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$NewBeneficiary;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$ToCreate;", "", "toString", "()Ljava/lang/String;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewBeneficiary implements ToCreate {

        @NotNull
        public static final Parcelable.Creator<NewBeneficiary> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WidgetRecipient.NewBeneficiary f79110a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewBeneficiary(WidgetRecipient.NewBeneficiary.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewBeneficiary[i];
            }
        }

        public NewBeneficiary(WidgetRecipient.NewBeneficiary recipient) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f79110a = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewBeneficiary) && Intrinsics.f(this.f79110a, ((NewBeneficiary) obj2).f79110a);
        }

        public final int hashCode() {
            return this.f79110a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f79110a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$NewCard;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$ToCreate;", "", "toString", "()Ljava/lang/String;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewCard implements ToCreate {

        @NotNull
        public static final Parcelable.Creator<NewCard> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WidgetRecipient.NewCard f79111a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NewCard(WidgetRecipient.NewCard.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewCard[i];
            }
        }

        public NewCard(WidgetRecipient.NewCard recipient) {
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f79111a = recipient;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NewCard) && Intrinsics.f(this.f79111a, ((NewCard) obj2).f79111a);
        }

        public final int hashCode() {
            return this.f79111a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f79111a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$PeerToPeer;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$Created;", "", "toString", "()Ljava/lang/String;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PeerToPeer implements Created {

        @NotNull
        public static final Parcelable.Creator<PeerToPeer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zm3.a f79112a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PeerToPeer((zm3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PeerToPeer[i];
            }
        }

        public PeerToPeer(zm3.a contact) {
            Intrinsics.checkNotNullParameter(contact, "contact");
            this.f79112a = contact;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PeerToPeer) && Intrinsics.f(this.f79112a, ((PeerToPeer) obj2).f79112a);
        }

        public final int hashCode() {
            return this.f79112a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f79112a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$ToCreate;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$NewBeneficiary;", "Lcom/revolut/feature/payments/air/widget/impl/ui/chat/ResolvedRecipient$NewCard;", "feature_payments_air_widget_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ToCreate extends ResolvedRecipient {
    }
}
