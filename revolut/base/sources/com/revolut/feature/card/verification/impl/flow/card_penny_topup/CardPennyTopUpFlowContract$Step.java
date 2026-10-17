package com.revolut.feature.card.verification.impl.flow.card_penny_topup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Info", "CardPennyTopUp", "CardVerificationWorkflow", "Lcom/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$Step$CardPennyTopUp;", "Lcom/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$Step$CardVerificationWorkflow;", "Lcom/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$Step$Info;", "feature_card_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardPennyTopUpFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$Step$CardPennyTopUp;", "Lcom/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardPennyTopUp extends CardPennyTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardPennyTopUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FacadeCardTopupFlowDescriptor$InputData f64401a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardPennyTopUp((FacadeCardTopupFlowDescriptor$InputData) parcel.readParcelable(CardPennyTopUp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardPennyTopUp[i];
            }
        }

        public CardPennyTopUp(FacadeCardTopupFlowDescriptor$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f64401a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardPennyTopUp) && Intrinsics.f(this.f64401a, ((CardPennyTopUp) obj2).f64401a);
        }

        public final int hashCode() {
            return this.f64401a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64401a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$Step$CardVerificationWorkflow;", "Lcom/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardVerificationWorkflow extends CardPennyTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardVerificationWorkflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64402a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardVerificationWorkflow(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardVerificationWorkflow[i];
            }
        }

        public CardVerificationWorkflow(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f64402a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardVerificationWorkflow) && Intrinsics.f(this.f64402a, ((CardVerificationWorkflow) obj2).f64402a);
        }

        public final int hashCode() {
            return this.f64402a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64402a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$Step$Info;", "Lcom/revolut/feature/card/verification/impl/flow/card_penny_topup/CardPennyTopUpFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info extends CardPennyTopUpFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64403a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64403a = cardId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Info) && Intrinsics.f(this.f64403a, ((Info) obj2).f64403a);
        }

        public final int hashCode() {
            return this.f64403a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64403a);
        }
    }

    private CardPennyTopUpFlowContract$Step() {
    }
}
