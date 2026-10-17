package com.revolut.feature.retail.cobranded_cards.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubPlan;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "CardSelection", "PlanHub", "PlanAdditionalValue", "AccountLinking", "CardSelectionDestination", "PlanHubDestination", "PlanHubBillingDestination", "PlanSwitchDestination", "OrderCardDestination", "PlanAdditionalValueDestination", "AccountLinkingDestination", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$AccountLinking;", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$CardSelection;", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$PlanAdditionalValue;", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$PlanHub;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CobrandedCardsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$AccountLinking;", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig;", "<init>", "()V", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountLinking extends CobrandedCardsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AccountLinking f82492g = new AccountLinking();

        private AccountLinking() {
            super(AccountLinkingDestination.f82493a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$AccountLinkingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountLinkingDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountLinkingDestination f82493a = new AccountLinkingDestination();

        @NotNull
        public static final Parcelable.Creator<AccountLinkingDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountLinkingDestination.f82493a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountLinkingDestination[i];
            }
        }

        private AccountLinkingDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$CardSelection;", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardSelection extends CobrandedCardsFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<CardSelection> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final NaviCommand f82494g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f82495h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardSelection((NaviCommand) parcel.readParcelable(CardSelection.class.getClassLoader()), (ActivityAnimation) parcel.readParcelable(CardSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardSelection[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardSelection(NaviCommand nextCommand, ActivityAnimation activityAnimation) {
            super(new CardSelectionDestination.PostActivation(nextCommand));
            Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
            this.f82494g = nextCommand;
            this.f82495h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF87400g() {
            return this.f82495h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardSelection)) {
                return false;
            }
            CardSelection cardSelection = (CardSelection) obj2;
            return Intrinsics.f(this.f82494g, cardSelection.f82494g) && Intrinsics.f(this.f82495h, cardSelection.f82495h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f82494g.hashCode() * 31;
            ActivityAnimation activityAnimation = this.f82495h;
            return iHashCode + (activityAnimation == null ? 0 : activityAnimation.hashCode());
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82494g, i);
            dest.writeParcelable(this.f82495h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$CardSelectionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Default", "PostActivation", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$CardSelectionDestination$Default;", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$CardSelectionDestination$PostActivation;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class CardSelectionDestination implements KompotDestination {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$CardSelectionDestination$Default;", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$CardSelectionDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Default extends CardSelectionDestination {

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f82496a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f82497b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Default(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            public Default() {
                this((String) null, 3);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Default)) {
                    return false;
                }
                Default r56 = (Default) obj2;
                return Intrinsics.f(this.f82496a, r56.f82496a) && this.f82497b == r56.f82497b;
            }

            public final int hashCode() {
                String str = this.f82496a;
                return Boolean.hashCode(this.f82497b) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f82496a);
                dest.writeInt(this.f82497b ? 1 : 0);
            }

            public Default(String str, boolean z) {
                this.f82496a = str;
                this.f82497b = z;
            }

            public /* synthetic */ Default(String str, int i) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$CardSelectionDestination$PostActivation;", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$CardSelectionDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PostActivation extends CardSelectionDestination {

            @NotNull
            public static final Parcelable.Creator<PostActivation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final NaviCommand f82498a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PostActivation((NaviCommand) parcel.readParcelable(PostActivation.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PostActivation[i];
                }
            }

            public PostActivation(NaviCommand nextCommand) {
                Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
                this.f82498a = nextCommand;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PostActivation) && Intrinsics.f(this.f82498a, ((PostActivation) obj2).f82498a);
            }

            public final int hashCode() {
                return this.f82498a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f82498a, i);
            }
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: n1 */
        public final boolean getF86145c() {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$OrderCardDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderCardDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<OrderCardDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanHubPlan f82499a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderCardDestination(CobrandedCardsPlanHubPlan.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderCardDestination[i];
            }
        }

        public OrderCardDestination(CobrandedCardsPlanHubPlan plan) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.f82499a = plan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OrderCardDestination) && Intrinsics.f(this.f82499a, ((OrderCardDestination) obj2).f82499a);
        }

        public final int hashCode() {
            return this.f82499a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f82499a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$PlanAdditionalValue;", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig;", "<init>", "()V", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanAdditionalValue extends CobrandedCardsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final PlanAdditionalValue f82500g = new PlanAdditionalValue();

        private PlanAdditionalValue() {
            super(PlanAdditionalValueDestination.f82501a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$PlanAdditionalValueDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanAdditionalValueDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanAdditionalValueDestination f82501a = new PlanAdditionalValueDestination();

        @NotNull
        public static final Parcelable.Creator<PlanAdditionalValueDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanAdditionalValueDestination.f82501a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanAdditionalValueDestination[i];
            }
        }

        private PlanAdditionalValueDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$PlanHub;", "Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig;", "<init>", "()V", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanHub extends CobrandedCardsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final PlanHub f82502g = new PlanHub();

        private PlanHub() {
            super(new PlanHubDestination(null));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$PlanHubBillingDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanHubBillingDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanHubBillingDestination f82503a = new PlanHubBillingDestination();

        @NotNull
        public static final Parcelable.Creator<PlanHubBillingDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanHubBillingDestination.f82503a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanHubBillingDestination[i];
            }
        }

        private PlanHubBillingDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$PlanSwitchDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanSwitchDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanSwitchDestination f82505a = new PlanSwitchDestination();

        @NotNull
        public static final Parcelable.Creator<PlanSwitchDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanSwitchDestination.f82505a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanSwitchDestination[i];
            }
        }

        private PlanSwitchDestination() {
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

    public CobrandedCardsFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/navigation/CobrandedCardsFeatureConfig$PlanHubDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanHubDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PlanHubDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82504a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanHubDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanHubDestination[i];
            }
        }

        public PlanHubDestination(String str) {
            this.f82504a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanHubDestination) && Intrinsics.f(this.f82504a, ((PlanHubDestination) obj2).f82504a);
        }

        public final int hashCode() {
            String str = this.f82504a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82504a);
        }

        public PlanHubDestination() {
            this(null);
        }
    }
}
