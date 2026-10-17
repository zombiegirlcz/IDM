package com.revolut.feature.card_screen.impl.kompot.cards_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.kompot.navigable.flow.FlowStep;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CardsList", "ReactivateCard", "TerminatedCardChargeback", "CardsCarousel", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step$CardsCarousel;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step$CardsList;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step$ReactivateCard;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step$TerminatedCardChargeback;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardsListFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step$CardsCarousel;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardsCarousel extends CardsListFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardsCarousel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n63.b f65452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b93.d f65453c;
        public final AccountId d;
        public final CardScreenAction e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardsCarousel(parcel.readString(), n63.b.valueOf(parcel.readString()), b93.d.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(CardsCarousel.class.getClassLoader()), (CardScreenAction) parcel.readParcelable(CardsCarousel.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardsCarousel[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CardsCarousel() {
            this(null, 0 == true ? 1 : 0, 31);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardsCarousel)) {
                return false;
            }
            CardsCarousel cardsCarousel = (CardsCarousel) obj2;
            return Intrinsics.f(this.f65451a, cardsCarousel.f65451a) && this.f65452b == cardsCarousel.f65452b && this.f65453c == cardsCarousel.f65453c && Intrinsics.f(this.d, cardsCarousel.d) && Intrinsics.f(this.e, cardsCarousel.e);
        }

        public final int hashCode() {
            String str = this.f65451a;
            return this.e.hashCode() + l.b(this.d, (this.f65453c.hashCode() + ((this.f65452b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65451a);
            dest.writeString(this.f65452b.name());
            dest.writeString(this.f65453c.name());
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }

        public CardsCarousel(String str, n63.b flowName, b93.d cardScope, AccountId accountId, CardScreenAction action) {
            Intrinsics.checkNotNullParameter(flowName, "flowName");
            Intrinsics.checkNotNullParameter(cardScope, "cardScope");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f65451a = str;
            this.f65452b = flowName;
            this.f65453c = cardScope;
            this.d = accountId;
            this.e = action;
        }

        public /* synthetic */ CardsCarousel(b93.d dVar, CardScreenAction.Select select, int i) {
            this(null, n63.b.RETAIL, (i & 4) != 0 ? b93.d.RETAIL : dVar, AccountId.Personal.f51414a, (i & 16) != 0 ? CardScreenAction.Idle.f65329a : select);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step$ReactivateCard;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step;", "<init>", "()V", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReactivateCard extends CardsListFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReactivateCard f65457a = new ReactivateCard();

        @NotNull
        public static final Parcelable.Creator<ReactivateCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReactivateCard.f65457a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReactivateCard[i];
            }
        }

        private ReactivateCard() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step$TerminatedCardChargeback;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TerminatedCardChargeback extends CardsListFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TerminatedCardChargeback> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TerminatedCard f65458a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TerminatedCardChargeback((TerminatedCard) parcel.readParcelable(TerminatedCardChargeback.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TerminatedCardChargeback[i];
            }
        }

        public TerminatedCardChargeback(TerminatedCard terminatedCard) {
            Intrinsics.checkNotNullParameter(terminatedCard, "terminatedCard");
            this.f65458a = terminatedCard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TerminatedCardChargeback) && Intrinsics.f(this.f65458a, ((TerminatedCardChargeback) obj2).f65458a);
        }

        public final int hashCode() {
            return this.f65458a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65458a, i);
        }
    }

    private CardsListFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step$CardsList;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardsList extends CardsListFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CardsListFlowContract$PreSelectedVariant f65455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b93.d f65456c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardsList(parcel.readString(), (CardsListFlowContract$PreSelectedVariant) parcel.readParcelable(CardsList.class.getClassLoader()), b93.d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardsList[i];
            }
        }

        public CardsList(String str, CardsListFlowContract$PreSelectedVariant cardsListFlowContract$PreSelectedVariant, b93.d cardScope) {
            Intrinsics.checkNotNullParameter(cardScope, "cardScope");
            this.f65454a = str;
            this.f65455b = cardsListFlowContract$PreSelectedVariant;
            this.f65456c = cardScope;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardsList)) {
                return false;
            }
            CardsList cardsList = (CardsList) obj2;
            return Intrinsics.f(this.f65454a, cardsList.f65454a) && Intrinsics.f(this.f65455b, cardsList.f65455b) && this.f65456c == cardsList.f65456c;
        }

        public final int hashCode() {
            String str = this.f65454a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            CardsListFlowContract$PreSelectedVariant cardsListFlowContract$PreSelectedVariant = this.f65455b;
            return this.f65456c.hashCode() + ((iHashCode + (cardsListFlowContract$PreSelectedVariant != null ? cardsListFlowContract$PreSelectedVariant.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65454a);
            dest.writeParcelable(this.f65455b, i);
            dest.writeString(this.f65456c.name());
        }

        public CardsList() {
            this(null, null, b93.d.ALL);
        }
    }
}
