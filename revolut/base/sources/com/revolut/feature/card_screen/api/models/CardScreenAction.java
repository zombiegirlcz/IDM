package com.revolut.feature.card_screen.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "Landroid/os/Parcelable;", "<init>", "()V", "AddToGooglePay", "AddToGooglePayDialog", "Select", "PinTriesConfirmation", "Unfreeze", "CreateDisposableCard", "SelectDisposableCard", "Idle", "OrderNew", "ShowBlockedDueToPinOrCVVDialog", "UnblockPinAndCVV", "OneClickActivate", "VirtualCardDesignChanged", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$AddToGooglePay;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$AddToGooglePayDialog;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$CreateDisposableCard;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$Idle;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$OneClickActivate;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$OrderNew;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$PinTriesConfirmation;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$Select;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$SelectDisposableCard;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$ShowBlockedDueToPinOrCVVDialog;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$UnblockPinAndCVV;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$Unfreeze;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction$VirtualCardDesignChanged;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardScreenAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$AddToGooglePayDialog;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddToGooglePayDialog extends CardScreenAction {

        @NotNull
        public static final Parcelable.Creator<AddToGooglePayDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65327a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddToGooglePayDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddToGooglePayDialog[i];
            }
        }

        public AddToGooglePayDialog(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f65327a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddToGooglePayDialog) && Intrinsics.f(this.f65327a, ((AddToGooglePayDialog) obj2).f65327a);
        }

        public final int hashCode() {
            return this.f65327a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65327a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$CreateDisposableCard;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "<init>", "()V", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreateDisposableCard extends CardScreenAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CreateDisposableCard f65328a = new CreateDisposableCard();

        @NotNull
        public static final Parcelable.Creator<CreateDisposableCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreateDisposableCard.f65328a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateDisposableCard[i];
            }
        }

        private CreateDisposableCard() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$Idle;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "<init>", "()V", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Idle extends CardScreenAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Idle f65329a = new Idle();

        @NotNull
        public static final Parcelable.Creator<Idle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Idle.f65329a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Idle[i];
            }
        }

        private Idle() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$OneClickActivate;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneClickActivate extends CardScreenAction {

        @NotNull
        public static final Parcelable.Creator<OneClickActivate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65330a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OneClickActivate(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneClickActivate[i];
            }
        }

        public OneClickActivate(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f65330a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OneClickActivate) && Intrinsics.f(this.f65330a, ((OneClickActivate) obj2).f65330a);
        }

        public final int hashCode() {
            return this.f65330a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65330a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$OrderNew;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "<init>", "()V", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderNew extends CardScreenAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OrderNew f65331a = new OrderNew();

        @NotNull
        public static final Parcelable.Creator<OrderNew> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderNew.f65331a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderNew[i];
            }
        }

        private OrderNew() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$PinTriesConfirmation;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PinTriesConfirmation extends CardScreenAction {

        @NotNull
        public static final Parcelable.Creator<PinTriesConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65332a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PinTriesConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PinTriesConfirmation[i];
            }
        }

        public PinTriesConfirmation(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f65332a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PinTriesConfirmation) && Intrinsics.f(this.f65332a, ((PinTriesConfirmation) obj2).f65332a);
        }

        public final int hashCode() {
            return this.f65332a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65332a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$SelectDisposableCard;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "<init>", "()V", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectDisposableCard extends CardScreenAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectDisposableCard f65336a = new SelectDisposableCard();

        @NotNull
        public static final Parcelable.Creator<SelectDisposableCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectDisposableCard.f65336a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectDisposableCard[i];
            }
        }

        private SelectDisposableCard() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$ShowBlockedDueToPinOrCVVDialog;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowBlockedDueToPinOrCVVDialog extends CardScreenAction {

        @NotNull
        public static final Parcelable.Creator<ShowBlockedDueToPinOrCVVDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65337a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowBlockedDueToPinOrCVVDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowBlockedDueToPinOrCVVDialog[i];
            }
        }

        public ShowBlockedDueToPinOrCVVDialog(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f65337a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowBlockedDueToPinOrCVVDialog) && Intrinsics.f(this.f65337a, ((ShowBlockedDueToPinOrCVVDialog) obj2).f65337a);
        }

        public final int hashCode() {
            return this.f65337a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65337a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$UnblockPinAndCVV;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UnblockPinAndCVV extends CardScreenAction {

        @NotNull
        public static final Parcelable.Creator<UnblockPinAndCVV> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65338a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UnblockPinAndCVV(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnblockPinAndCVV[i];
            }
        }

        public UnblockPinAndCVV(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f65338a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UnblockPinAndCVV) && Intrinsics.f(this.f65338a, ((UnblockPinAndCVV) obj2).f65338a);
        }

        public final int hashCode() {
            return this.f65338a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65338a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$Unfreeze;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unfreeze extends CardScreenAction {

        @NotNull
        public static final Parcelable.Creator<Unfreeze> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65339a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unfreeze(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unfreeze[i];
            }
        }

        public Unfreeze(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f65339a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unfreeze) && Intrinsics.f(this.f65339a, ((Unfreeze) obj2).f65339a);
        }

        public final int hashCode() {
            return this.f65339a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65339a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$VirtualCardDesignChanged;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VirtualCardDesignChanged extends CardScreenAction {

        @NotNull
        public static final Parcelable.Creator<VirtualCardDesignChanged> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f65340a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VirtualCardDesignChanged((f0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VirtualCardDesignChanged[i];
            }
        }

        public VirtualCardDesignChanged(f0 previousCard) {
            Intrinsics.checkNotNullParameter(previousCard, "previousCard");
            this.f65340a = previousCard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VirtualCardDesignChanged) && Intrinsics.f(this.f65340a, ((VirtualCardDesignChanged) obj2).f65340a);
        }

        public final int hashCode() {
            return this.f65340a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65340a);
        }
    }

    private CardScreenAction() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$AddToGooglePay;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddToGooglePay extends CardScreenAction {

        @NotNull
        public static final Parcelable.Creator<AddToGooglePay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65326a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddToGooglePay(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddToGooglePay[i];
            }
        }

        public AddToGooglePay(String str) {
            this.f65326a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddToGooglePay) && Intrinsics.f(this.f65326a, ((AddToGooglePay) obj2).f65326a);
        }

        public final int hashCode() {
            String str = this.f65326a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65326a);
        }

        public AddToGooglePay() {
            this((String) null);
        }

        public /* synthetic */ AddToGooglePay(int i) {
            this((String) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/api/models/CardScreenAction$Select;", "Lcom/revolut/feature/card_screen/api/models/CardScreenAction;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Select extends CardScreenAction {

        @NotNull
        public static final Parcelable.Creator<Select> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f65334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f65335c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Select(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Select[i];
            }
        }

        public Select(String cardId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f65333a = cardId;
            this.f65334b = z;
            this.f65335c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Select)) {
                return false;
            }
            Select select = (Select) obj2;
            return Intrinsics.f(this.f65333a, select.f65333a) && this.f65334b == select.f65334b && this.f65335c == select.f65335c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f65335c) + j6.a.c(this.f65333a.hashCode() * 31, 31, this.f65334b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65333a);
            dest.writeInt(this.f65334b ? 1 : 0);
            dest.writeInt(this.f65335c ? 1 : 0);
        }

        public /* synthetic */ Select(String str, int i, boolean z, boolean z3) {
            this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z3);
        }
    }
}
