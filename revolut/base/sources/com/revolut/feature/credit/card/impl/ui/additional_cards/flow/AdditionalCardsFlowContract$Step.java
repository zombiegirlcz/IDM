package com.revolut.feature.credit.card.impl.ui.additional_cards.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/card/impl/ui/additional_cards/flow/AdditionalCardsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AdditionalCards", "CardholderDetails", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/flow/AdditionalCardsFlowContract$Step$AdditionalCards;", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/flow/AdditionalCardsFlowContract$Step$CardholderDetails;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AdditionalCardsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/flow/AdditionalCardsFlowContract$Step$AdditionalCards;", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/flow/AdditionalCardsFlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AdditionalCards extends AdditionalCardsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AdditionalCards f69021a = new AdditionalCards();

        @NotNull
        public static final Parcelable.Creator<AdditionalCards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AdditionalCards.f69021a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalCards[i];
            }
        }

        private AdditionalCards() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/flow/AdditionalCardsFlowContract$Step$CardholderDetails;", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/flow/AdditionalCardsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardholderDetails extends AdditionalCardsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardholderDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69023b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardholderDetails(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardholderDetails[i];
            }
        }

        public CardholderDetails(String cardholderId, String userName) {
            Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
            Intrinsics.checkNotNullParameter(userName, "userName");
            this.f69022a = cardholderId;
            this.f69023b = userName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardholderDetails)) {
                return false;
            }
            CardholderDetails cardholderDetails = (CardholderDetails) obj2;
            return Intrinsics.f(this.f69022a, cardholderDetails.f69022a) && Intrinsics.f(this.f69023b, cardholderDetails.f69023b);
        }

        public final int hashCode() {
            return this.f69023b.hashCode() + (this.f69022a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69022a);
            dest.writeString(this.f69023b);
        }
    }

    private AdditionalCardsFlowContract$Step() {
    }
}
