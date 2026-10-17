package com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_switch;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CardSelectionDashboard", "AdditionalValue", "CardTypeSelection", "ValueReminder", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step$AdditionalValue;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step$CardSelectionDashboard;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step$CardTypeSelection;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step$ValueReminder;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsPlanSwitchFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step$AdditionalValue;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalValue implements CobrandedCardsPlanSwitchFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalValue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlan f82527a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalValue((CobrandedCardsPlan) parcel.readParcelable(AdditionalValue.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalValue[i];
            }
        }

        public AdditionalValue(CobrandedCardsPlan plan) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            this.f82527a = plan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalValue) && Intrinsics.f(this.f82527a, ((AdditionalValue) obj2).f82527a);
        }

        public final int hashCode() {
            return this.f82527a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82527a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step$CardSelectionDashboard;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardSelectionDashboard implements CobrandedCardsPlanSwitchFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardSelectionDashboard f82528a = new CardSelectionDashboard();

        @NotNull
        public static final Parcelable.Creator<CardSelectionDashboard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardSelectionDashboard.f82528a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardSelectionDashboard[i];
            }
        }

        private CardSelectionDashboard() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step$CardTypeSelection;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardTypeSelection implements CobrandedCardsPlanSwitchFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardTypeSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlan f82529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CobrandedCardsCardConfiguration f82530b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CobrandedCardsCardConfiguration f82531c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardTypeSelection((CobrandedCardsPlan) parcel.readParcelable(CardTypeSelection.class.getClassLoader()), (CobrandedCardsCardConfiguration) parcel.readParcelable(CardTypeSelection.class.getClassLoader()), (CobrandedCardsCardConfiguration) parcel.readParcelable(CardTypeSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardTypeSelection[i];
            }
        }

        public CardTypeSelection(CobrandedCardsPlan plan, CobrandedCardsCardConfiguration physicalCardConfiguration, CobrandedCardsCardConfiguration virtualCardConfiguration) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            Intrinsics.checkNotNullParameter(physicalCardConfiguration, "physicalCardConfiguration");
            Intrinsics.checkNotNullParameter(virtualCardConfiguration, "virtualCardConfiguration");
            this.f82529a = plan;
            this.f82530b = physicalCardConfiguration;
            this.f82531c = virtualCardConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardTypeSelection)) {
                return false;
            }
            CardTypeSelection cardTypeSelection = (CardTypeSelection) obj2;
            return Intrinsics.f(this.f82529a, cardTypeSelection.f82529a) && Intrinsics.f(this.f82530b, cardTypeSelection.f82530b) && Intrinsics.f(this.f82531c, cardTypeSelection.f82531c);
        }

        public final int hashCode() {
            return this.f82531c.hashCode() + ((this.f82530b.hashCode() + (this.f82529a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82529a, i);
            dest.writeParcelable(this.f82530b, i);
            dest.writeParcelable(this.f82531c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step$ValueReminder;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/flows/plan_switch/CobrandedCardsPlanSwitchFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ValueReminder implements CobrandedCardsPlanSwitchFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ValueReminder> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlan f82532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CobrandedCardsCardConfiguration f82533b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ValueReminder((CobrandedCardsPlan) parcel.readParcelable(ValueReminder.class.getClassLoader()), (CobrandedCardsCardConfiguration) parcel.readParcelable(ValueReminder.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ValueReminder[i];
            }
        }

        public ValueReminder(CobrandedCardsPlan plan, CobrandedCardsCardConfiguration cardConfiguration) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
            this.f82532a = plan;
            this.f82533b = cardConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ValueReminder)) {
                return false;
            }
            ValueReminder valueReminder = (ValueReminder) obj2;
            return Intrinsics.f(this.f82532a, valueReminder.f82532a) && Intrinsics.f(this.f82533b, valueReminder.f82533b);
        }

        public final int hashCode() {
            return this.f82533b.hashCode() + (this.f82532a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82532a, i);
            dest.writeParcelable(this.f82533b, i);
        }
    }
}
