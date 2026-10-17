package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmation;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderCardInfoDetails;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "CardTerminationInfo", "DowngradeConfirmation", "SwitchPlanConfirmation", "TerminateConfirmation", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep$CardTerminationInfo;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep$DowngradeConfirmation;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep$SwitchPlanConfirmation;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep$TerminateConfirmation;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsValueReminderScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep$CardTerminationInfo;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardTerminationInfo implements CobrandedCardsValueReminderScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CardTerminationInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsValueReminderCardInfoDetails f82615a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardTerminationInfo((CobrandedCardsValueReminderCardInfoDetails) parcel.readParcelable(CardTerminationInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardTerminationInfo[i];
            }
        }

        public CardTerminationInfo(CobrandedCardsValueReminderCardInfoDetails cardInfoDetails) {
            Intrinsics.checkNotNullParameter(cardInfoDetails, "cardInfoDetails");
            this.f82615a = cardInfoDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardTerminationInfo) && Intrinsics.f(this.f82615a, ((CardTerminationInfo) obj2).f82615a);
        }

        public final int hashCode() {
            return this.f82615a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82615a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep$DowngradeConfirmation;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DowngradeConfirmation implements CobrandedCardsValueReminderScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DowngradeConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlan f82616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CobrandedCardsCardConfiguration f82617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CobrandedCardsValueReminderActionConfirmation f82618c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DowngradeConfirmation((CobrandedCardsPlan) parcel.readParcelable(DowngradeConfirmation.class.getClassLoader()), (CobrandedCardsCardConfiguration) parcel.readParcelable(DowngradeConfirmation.class.getClassLoader()), (CobrandedCardsValueReminderActionConfirmation) parcel.readParcelable(DowngradeConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DowngradeConfirmation[i];
            }
        }

        public DowngradeConfirmation(CobrandedCardsPlan plan, CobrandedCardsCardConfiguration cardConfiguration, CobrandedCardsValueReminderActionConfirmation confirmation) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
            Intrinsics.checkNotNullParameter(confirmation, "confirmation");
            this.f82616a = plan;
            this.f82617b = cardConfiguration;
            this.f82618c = confirmation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DowngradeConfirmation)) {
                return false;
            }
            DowngradeConfirmation downgradeConfirmation = (DowngradeConfirmation) obj2;
            return Intrinsics.f(this.f82616a, downgradeConfirmation.f82616a) && Intrinsics.f(this.f82617b, downgradeConfirmation.f82617b) && Intrinsics.f(this.f82618c, downgradeConfirmation.f82618c);
        }

        public final int hashCode() {
            return this.f82618c.hashCode() + ((this.f82617b.hashCode() + (this.f82616a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82616a, i);
            dest.writeParcelable(this.f82617b, i);
            dest.writeParcelable(this.f82618c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep$SwitchPlanConfirmation;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwitchPlanConfirmation implements CobrandedCardsValueReminderScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SwitchPlanConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsValueReminderActionConfirmation f82619a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwitchPlanConfirmation((CobrandedCardsValueReminderActionConfirmation) parcel.readParcelable(SwitchPlanConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchPlanConfirmation[i];
            }
        }

        public SwitchPlanConfirmation(CobrandedCardsValueReminderActionConfirmation confirmation) {
            Intrinsics.checkNotNullParameter(confirmation, "confirmation");
            this.f82619a = confirmation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SwitchPlanConfirmation) && Intrinsics.f(this.f82619a, ((SwitchPlanConfirmation) obj2).f82619a);
        }

        public final int hashCode() {
            return this.f82619a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82619a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep$TerminateConfirmation;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/CobrandedCardsValueReminderScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TerminateConfirmation implements CobrandedCardsValueReminderScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TerminateConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsValueReminderActionConfirmation f82620a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TerminateConfirmation((CobrandedCardsValueReminderActionConfirmation) parcel.readParcelable(TerminateConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TerminateConfirmation[i];
            }
        }

        public TerminateConfirmation(CobrandedCardsValueReminderActionConfirmation confirmation) {
            Intrinsics.checkNotNullParameter(confirmation, "confirmation");
            this.f82620a = confirmation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TerminateConfirmation) && Intrinsics.f(this.f82620a, ((TerminateConfirmation) obj2).f82620a);
        }

        public final int hashCode() {
            return this.f82620a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82620a, i);
        }
    }
}
