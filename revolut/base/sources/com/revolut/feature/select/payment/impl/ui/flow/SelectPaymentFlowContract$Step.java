package com.revolut.feature.select.payment.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.select.payment.api.models.IntroScreenConfiguration;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "SelectPayment", "AddCard", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$AddCard;", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro;", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$SelectPayment;", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SelectPaymentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$AddCard;", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step;", "<init>", "()V", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddCard extends SelectPaymentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddCard f85812a = new AddCard();

        @NotNull
        public static final Parcelable.Creator<AddCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddCard.f85812a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddCard[i];
            }
        }

        private AddCard() {
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

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro;", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step;", "<init>", "()V", "NoAddedCards", "AtLeastOneAddedCard", "CardExpired", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro$AtLeastOneAddedCard;", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro$CardExpired;", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro$NoAddedCards;", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Intro extends SelectPaymentFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro$AtLeastOneAddedCard;", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro;", "", "toString", "()Ljava/lang/String;", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AtLeastOneAddedCard extends Intro {

            @NotNull
            public static final Parcelable.Creator<AtLeastOneAddedCard> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IntroScreenConfiguration f85813a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AtLeastOneAddedCard((IntroScreenConfiguration) parcel.readParcelable(AtLeastOneAddedCard.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AtLeastOneAddedCard[i];
                }
            }

            public AtLeastOneAddedCard(IntroScreenConfiguration screenConfiguration) {
                Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
                this.f85813a = screenConfiguration;
            }

            @Override // com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step.Intro
            /* JADX INFO: renamed from: a, reason: from getter */
            public final IntroScreenConfiguration getF85815a() {
                return this.f85813a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AtLeastOneAddedCard) && Intrinsics.f(this.f85813a, ((AtLeastOneAddedCard) obj2).f85813a);
            }

            public final int hashCode() {
                return this.f85813a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f85813a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro$CardExpired;", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro;", "", "toString", "()Ljava/lang/String;", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CardExpired extends Intro {

            @NotNull
            public static final Parcelable.Creator<CardExpired> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IntroScreenConfiguration f85814a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CardExpired((IntroScreenConfiguration) parcel.readParcelable(CardExpired.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CardExpired[i];
                }
            }

            public CardExpired(IntroScreenConfiguration screenConfiguration) {
                Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
                this.f85814a = screenConfiguration;
            }

            @Override // com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step.Intro
            /* JADX INFO: renamed from: a, reason: from getter */
            public final IntroScreenConfiguration getF85815a() {
                return this.f85814a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CardExpired) && Intrinsics.f(this.f85814a, ((CardExpired) obj2).f85814a);
            }

            public final int hashCode() {
                return this.f85814a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f85814a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro$NoAddedCards;", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$Intro;", "", "toString", "()Ljava/lang/String;", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NoAddedCards extends Intro {

            @NotNull
            public static final Parcelable.Creator<NoAddedCards> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final IntroScreenConfiguration f85815a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new NoAddedCards((IntroScreenConfiguration) parcel.readParcelable(NoAddedCards.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NoAddedCards[i];
                }
            }

            public NoAddedCards(IntroScreenConfiguration screenConfiguration) {
                Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
                this.f85815a = screenConfiguration;
            }

            @Override // com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$Step.Intro
            /* JADX INFO: renamed from: a, reason: from getter */
            public final IntroScreenConfiguration getF85815a() {
                return this.f85815a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof NoAddedCards) && Intrinsics.f(this.f85815a, ((NoAddedCards) obj2).f85815a);
            }

            public final int hashCode() {
                return this.f85815a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f85815a, i);
            }
        }

        private Intro() {
        }

        /* JADX INFO: renamed from: a */
        public abstract IntroScreenConfiguration getF85815a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step$SelectPayment;", "Lcom/revolut/feature/select/payment/impl/ui/flow/SelectPaymentFlowContract$Step;", "<init>", "()V", "feature_select_payment_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectPayment extends SelectPaymentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectPayment f85816a = new SelectPayment();

        @NotNull
        public static final Parcelable.Creator<SelectPayment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectPayment.f85816a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPayment[i];
            }
        }

        private SelectPayment() {
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

    private SelectPaymentFlowContract$Step() {
    }
}
