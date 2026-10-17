package com.revolut.feature.card_screen.impl.kompot.cards_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "CardList", "ReactivateCard", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$InputData$CardList;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$InputData$ReactivateCard;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardsListFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$InputData$CardList;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardList extends CardsListFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CardList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CardsListFlowContract$PreSelectedVariant f65445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b93.d f65446c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardList(parcel.readString(), (CardsListFlowContract$PreSelectedVariant) parcel.readParcelable(CardList.class.getClassLoader()), b93.d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardList[i];
            }
        }

        public CardList() {
            this(null, 7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardList)) {
                return false;
            }
            CardList cardList = (CardList) obj2;
            return Intrinsics.f(this.f65444a, cardList.f65444a) && Intrinsics.f(this.f65445b, cardList.f65445b) && this.f65446c == cardList.f65446c;
        }

        public final int hashCode() {
            String str = this.f65444a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            CardsListFlowContract$PreSelectedVariant cardsListFlowContract$PreSelectedVariant = this.f65445b;
            return this.f65446c.hashCode() + ((iHashCode + (cardsListFlowContract$PreSelectedVariant != null ? cardsListFlowContract$PreSelectedVariant.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65444a);
            dest.writeParcelable(this.f65445b, i);
            dest.writeString(this.f65446c.name());
        }

        public CardList(String str, CardsListFlowContract$PreSelectedVariant cardsListFlowContract$PreSelectedVariant, b93.d cardScope) {
            Intrinsics.checkNotNullParameter(cardScope, "cardScope");
            this.f65444a = str;
            this.f65445b = cardsListFlowContract$PreSelectedVariant;
            this.f65446c = cardScope;
        }

        public /* synthetic */ CardList(CardsListFlowContract$PreSelectedVariant cardsListFlowContract$PreSelectedVariant, int i) {
            this(null, (i & 2) != 0 ? null : cardsListFlowContract$PreSelectedVariant, b93.d.ALL);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$InputData$ReactivateCard;", "Lcom/revolut/feature/card_screen/impl/kompot/cards_list/CardsListFlowContract$InputData;", "<init>", "()V", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReactivateCard extends CardsListFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReactivateCard f65447a = new ReactivateCard();

        @NotNull
        public static final Parcelable.Creator<ReactivateCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReactivateCard.f65447a;
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

    private CardsListFlowContract$InputData() {
    }
}
