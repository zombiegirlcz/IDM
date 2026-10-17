package com.revolut.feature.subscriptions.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import b9e.d;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import f9e.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LabelSubscription", "CardSubscriptionList", "SubscriptionDetails", "EditSubscriptionFrequency", "Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step$CardSubscriptionList;", "Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step$EditSubscriptionFrequency;", "Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step$LabelSubscription;", "Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step$SubscriptionDetails;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SubscriptionsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step$CardSubscriptionList;", "Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardSubscriptionList extends SubscriptionsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardSubscriptionList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f89187b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardSubscriptionList(parcel.readString(), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardSubscriptionList[i];
            }
        }

        public CardSubscriptionList(String cardId, d action) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f89186a = cardId;
            this.f89187b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardSubscriptionList)) {
                return false;
            }
            CardSubscriptionList cardSubscriptionList = (CardSubscriptionList) obj2;
            return Intrinsics.f(this.f89186a, cardSubscriptionList.f89186a) && this.f89187b == cardSubscriptionList.f89187b;
        }

        public final int hashCode() {
            return this.f89187b.hashCode() + (this.f89186a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89186a);
            dest.writeString(this.f89187b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step$EditSubscriptionFrequency;", "Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditSubscriptionFrequency extends SubscriptionsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditSubscriptionFrequency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f89188a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditSubscriptionFrequency((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditSubscriptionFrequency[i];
            }
        }

        public EditSubscriptionFrequency(p subscription) {
            Intrinsics.checkNotNullParameter(subscription, "subscription");
            this.f89188a = subscription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditSubscriptionFrequency) && Intrinsics.f(this.f89188a, ((EditSubscriptionFrequency) obj2).f89188a);
        }

        public final int hashCode() {
            return this.f89188a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89188a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step$LabelSubscription;", "Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LabelSubscription extends SubscriptionsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LabelSubscription> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SubscriptionLabelScreenContract$InputData f89189a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LabelSubscription(SubscriptionLabelScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LabelSubscription[i];
            }
        }

        public LabelSubscription(SubscriptionLabelScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f89189a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LabelSubscription) && Intrinsics.f(this.f89189a, ((LabelSubscription) obj2).f89189a);
        }

        public final int hashCode() {
            return this.f89189a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f89189a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step$SubscriptionDetails;", "Lcom/revolut/feature/subscriptions/impl/flow/SubscriptionsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubscriptionDetails extends SubscriptionsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SubscriptionDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f89192c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubscriptionDetails(b.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubscriptionDetails[i];
            }
        }

        public SubscriptionDetails(b mode, String subscriptionId, boolean z) {
            Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f89190a = subscriptionId;
            this.f89191b = z;
            this.f89192c = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubscriptionDetails)) {
                return false;
            }
            SubscriptionDetails subscriptionDetails = (SubscriptionDetails) obj2;
            return Intrinsics.f(this.f89190a, subscriptionDetails.f89190a) && this.f89191b == subscriptionDetails.f89191b && this.f89192c == subscriptionDetails.f89192c;
        }

        public final int hashCode() {
            return this.f89192c.hashCode() + j6.a.c(this.f89190a.hashCode() * 31, 31, this.f89191b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89190a);
            dest.writeInt(this.f89191b ? 1 : 0);
            dest.writeString(this.f89192c.name());
        }
    }

    private SubscriptionsFlowContract$Step() {
    }
}
