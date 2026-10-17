package com.revolut.feature.card_payment_method.impl.flows.link_card.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/card_payment_method/impl/flows/link_card/flow/LinkCardFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CardChooser", "DetailsReview", "Lcom/revolut/feature/card_payment_method/impl/flows/link_card/flow/LinkCardFlowContract$Step$CardChooser;", "Lcom/revolut/feature/card_payment_method/impl/flows/link_card/flow/LinkCardFlowContract$Step$DetailsReview;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LinkCardFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/flows/link_card/flow/LinkCardFlowContract$Step$CardChooser;", "Lcom/revolut/feature/card_payment_method/impl/flows/link_card/flow/LinkCardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardChooser extends LinkCardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f65259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f65260b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardChooser((f0) parcel.readSerializable(), (AccountId) parcel.readParcelable(CardChooser.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardChooser[i];
            }
        }

        public CardChooser(f0 f0Var, AccountId accountId) {
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f65259a = f0Var;
            this.f65260b = accountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardChooser)) {
                return false;
            }
            CardChooser cardChooser = (CardChooser) obj2;
            return Intrinsics.f(this.f65259a, cardChooser.f65259a) && Intrinsics.f(this.f65260b, cardChooser.f65260b);
        }

        public final int hashCode() {
            f0 f0Var = this.f65259a;
            return this.f65260b.hashCode() + ((f0Var == null ? 0 : f0Var.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65259a);
            dest.writeParcelable(this.f65260b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/flows/link_card/flow/LinkCardFlowContract$Step$DetailsReview;", "Lcom/revolut/feature/card_payment_method/impl/flows/link_card/flow/LinkCardFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DetailsReview extends LinkCardFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DetailsReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkCardFlowContract$LinkCardToPocketInfo f65261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KompotDestination f65262b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DetailsReview(LinkCardFlowContract$LinkCardToPocketInfo.CREATOR.createFromParcel(parcel), (KompotDestination) parcel.readParcelable(DetailsReview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DetailsReview[i];
            }
        }

        public DetailsReview(LinkCardFlowContract$LinkCardToPocketInfo info, KompotDestination kompotDestination) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f65261a = info;
            this.f65262b = kompotDestination;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DetailsReview)) {
                return false;
            }
            DetailsReview detailsReview = (DetailsReview) obj2;
            return Intrinsics.f(this.f65261a, detailsReview.f65261a) && Intrinsics.f(this.f65262b, detailsReview.f65262b);
        }

        public final int hashCode() {
            int iHashCode = this.f65261a.hashCode() * 31;
            KompotDestination kompotDestination = this.f65262b;
            return iHashCode + (kompotDestination == null ? 0 : kompotDestination.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f65261a.writeToParcel(dest, i);
            dest.writeParcelable(this.f65262b, i);
        }
    }

    private LinkCardFlowContract$Step() {
    }
}
