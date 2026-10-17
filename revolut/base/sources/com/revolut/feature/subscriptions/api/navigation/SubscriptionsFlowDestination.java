package com.revolut.feature.subscriptions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import b9e.d;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import f9e.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "StartType", "feature_cards_subscriptions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubscriptionsFlowDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SubscriptionsFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartType f89146b;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartType f89147a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((StartType) parcel.readParcelable(InputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(StartType startType) {
            Intrinsics.checkNotNullParameter(startType, "startType");
            this.f89147a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f89147a, ((InputData) obj2).f89147a);
        }

        public final int hashCode() {
            return this.f89147a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89147a, i);
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType;", "Landroid/os/Parcelable;", "<init>", "()V", "ChangeSubscriptionLabel", "CardSubscriptionList", "SubscriptionDetails", "EditSubscriptionFrequency", "Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType$CardSubscriptionList;", "Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType$ChangeSubscriptionLabel;", "Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType$EditSubscriptionFrequency;", "Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType$SubscriptionDetails;", "feature_cards_subscriptions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class StartType implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType$CardSubscriptionList;", "Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CardSubscriptionList extends StartType {

            @NotNull
            public static final Parcelable.Creator<CardSubscriptionList> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f89148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final d f89149b;

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
                this.f89148a = cardId;
                this.f89149b = action;
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
                return Intrinsics.f(this.f89148a, cardSubscriptionList.f89148a) && this.f89149b == cardSubscriptionList.f89149b;
            }

            public final int hashCode() {
                return this.f89149b.hashCode() + (this.f89148a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f89148a);
                dest.writeString(this.f89149b.name());
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType$ChangeSubscriptionLabel;", "Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ChangeSubscriptionLabel extends StartType {

            @NotNull
            public static final Parcelable.Creator<ChangeSubscriptionLabel> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final p f89150a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ChangeSubscriptionLabel((p) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ChangeSubscriptionLabel[i];
                }
            }

            public ChangeSubscriptionLabel(p subscription) {
                Intrinsics.checkNotNullParameter(subscription, "subscription");
                this.f89150a = subscription;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ChangeSubscriptionLabel) && Intrinsics.f(this.f89150a, ((ChangeSubscriptionLabel) obj2).f89150a);
            }

            public final int hashCode() {
                return this.f89150a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f89150a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType$EditSubscriptionFrequency;", "Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class EditSubscriptionFrequency extends StartType {

            @NotNull
            public static final Parcelable.Creator<EditSubscriptionFrequency> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final p f89151a;

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
                this.f89151a = subscription;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof EditSubscriptionFrequency) && Intrinsics.f(this.f89151a, ((EditSubscriptionFrequency) obj2).f89151a);
            }

            public final int hashCode() {
                return this.f89151a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f89151a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType$SubscriptionDetails;", "Lcom/revolut/feature/subscriptions/api/navigation/SubscriptionsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_cards_subscriptions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SubscriptionDetails extends StartType {

            @NotNull
            public static final Parcelable.Creator<SubscriptionDetails> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f89152a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f89153b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f89154c;

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
                this.f89152a = subscriptionId;
                this.f89153b = z;
                this.f89154c = mode;
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
                return Intrinsics.f(this.f89152a, subscriptionDetails.f89152a) && this.f89153b == subscriptionDetails.f89153b && this.f89154c == subscriptionDetails.f89154c;
            }

            public final int hashCode() {
                return this.f89154c.hashCode() + j6.a.c(this.f89152a.hashCode() * 31, 31, this.f89153b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f89152a);
                dest.writeInt(this.f89153b ? 1 : 0);
                dest.writeString(this.f89154c.name());
            }
        }

        private StartType() {
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubscriptionsFlowDestination((StartType) parcel.readParcelable(SubscriptionsFlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubscriptionsFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionsFlowDestination(StartType startType) {
        super(new InputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f89146b = startType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SubscriptionsFlowDestination) && Intrinsics.f(this.f89146b, ((SubscriptionsFlowDestination) obj2).f89146b);
    }

    public final int hashCode() {
        return this.f89146b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89146b, i);
    }
}
