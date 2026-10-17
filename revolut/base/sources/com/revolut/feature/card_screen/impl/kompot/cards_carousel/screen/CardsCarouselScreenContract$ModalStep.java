package com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.WalletTokenizationState;
import com.revolut.kompot.navigable.flow.FlowStep;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ShowAutoRenewalDialog", "ShowRenewedDialog", "ShowReissuedPhysicalCardDialog", "ShowAddToGoogleDialog", "NamelessCardDialog", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep$NamelessCardDialog;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep$ShowAddToGoogleDialog;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep$ShowAutoRenewalDialog;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep$ShowReissuedPhysicalCardDialog;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep$ShowRenewedDialog;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CardsCarouselScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep$NamelessCardDialog;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep;", "<init>", "()V", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NamelessCardDialog implements CardsCarouselScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NamelessCardDialog f65409a = new NamelessCardDialog();

        @NotNull
        public static final Parcelable.Creator<NamelessCardDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NamelessCardDialog.f65409a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NamelessCardDialog[i];
            }
        }

        private NamelessCardDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep$ShowAddToGoogleDialog;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowAddToGoogleDialog implements CardsCarouselScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowAddToGoogleDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f65410a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowAddToGoogleDialog((f0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAddToGoogleDialog[i];
            }
        }

        public ShowAddToGoogleDialog(f0 card) {
            Intrinsics.checkNotNullParameter(card, "card");
            this.f65410a = card;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowAddToGoogleDialog) && Intrinsics.f(this.f65410a, ((ShowAddToGoogleDialog) obj2).f65410a);
        }

        public final int hashCode() {
            return this.f65410a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65410a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep$ShowAutoRenewalDialog;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowAutoRenewalDialog implements CardsCarouselScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowAutoRenewalDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletTokenizationState f65411a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowAutoRenewalDialog(WalletTokenizationState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAutoRenewalDialog[i];
            }
        }

        public ShowAutoRenewalDialog(WalletTokenizationState walletTokenizationState) {
            Intrinsics.checkNotNullParameter(walletTokenizationState, "walletTokenizationState");
            this.f65411a = walletTokenizationState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowAutoRenewalDialog) && this.f65411a == ((ShowAutoRenewalDialog) obj2).f65411a;
        }

        public final int hashCode() {
            return this.f65411a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65411a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep$ShowReissuedPhysicalCardDialog;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowReissuedPhysicalCardDialog implements CardsCarouselScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowReissuedPhysicalCardDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f65412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f65413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f65414c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowReissuedPhysicalCardDialog(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowReissuedPhysicalCardDialog[i];
            }
        }

        public ShowReissuedPhysicalCardDialog(boolean z, boolean z3, boolean z4) {
            this.f65412a = z;
            this.f65413b = z3;
            this.f65414c = z4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ShowReissuedPhysicalCardDialog)) {
                return false;
            }
            ShowReissuedPhysicalCardDialog showReissuedPhysicalCardDialog = (ShowReissuedPhysicalCardDialog) obj2;
            return this.f65412a == showReissuedPhysicalCardDialog.f65412a && this.f65413b == showReissuedPhysicalCardDialog.f65413b && this.f65414c == showReissuedPhysicalCardDialog.f65414c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f65414c) + j6.a.c(Boolean.hashCode(this.f65412a) * 31, 31, this.f65413b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f65412a ? 1 : 0);
            dest.writeInt(this.f65413b ? 1 : 0);
            dest.writeInt(this.f65414c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep$ShowRenewedDialog;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/screen/CardsCarouselScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowRenewedDialog implements CardsCarouselScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ShowRenewedDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletTokenizationState f65415a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowRenewedDialog(WalletTokenizationState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowRenewedDialog[i];
            }
        }

        public ShowRenewedDialog(WalletTokenizationState walletTokenizationState) {
            Intrinsics.checkNotNullParameter(walletTokenizationState, "walletTokenizationState");
            this.f65415a = walletTokenizationState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowRenewedDialog) && this.f65415a == ((ShowRenewedDialog) obj2).f65415a;
        }

        public final int hashCode() {
            return this.f65415a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65415a.writeToParcel(dest, i);
        }
    }
}
