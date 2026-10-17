package com.revolut.feature.card_order_new.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class CardOrderFeatureApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$CardDeliveryKycAddressValidation;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardDeliveryKycAddressValidation extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CardDeliveryKycAddressValidation f64944c = new CardDeliveryKycAddressValidation();

        @NotNull
        public static final Parcelable.Creator<CardDeliveryKycAddressValidation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardDeliveryKycAddressValidation.f64944c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardDeliveryKycAddressValidation[i];
            }
        }

        private CardDeliveryKycAddressValidation() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cardDeliveryKycAddressValidation");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$CardOrderDowngradeFeeDisclosure;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardOrderDowngradeFeeDisclosure extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CardOrderDowngradeFeeDisclosure f64945c = new CardOrderDowngradeFeeDisclosure();

        @NotNull
        public static final Parcelable.Creator<CardOrderDowngradeFeeDisclosure> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardOrderDowngradeFeeDisclosure.f64945c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardOrderDowngradeFeeDisclosure[i];
            }
        }

        private CardOrderDowngradeFeeDisclosure() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cardOrderDowngradeFeeDisclosure");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$DecommissionDesignsForPlanId;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DecommissionDesignsForPlanId extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final DecommissionDesignsForPlanId f64946c = new DecommissionDesignsForPlanId();

        @NotNull
        public static final Parcelable.Creator<DecommissionDesignsForPlanId> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DecommissionDesignsForPlanId.f64946c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DecommissionDesignsForPlanId[i];
            }
        }

        private DecommissionDesignsForPlanId() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("decommissionDesignsForPlanId");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$McyCardTypeAvailability;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class McyCardTypeAvailability extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final McyCardTypeAvailability f64947c = new McyCardTypeAvailability();

        @NotNull
        public static final Parcelable.Creator<McyCardTypeAvailability> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return McyCardTypeAvailability.f64947c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new McyCardTypeAvailability[i];
            }
        }

        private McyCardTypeAvailability() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("mcyCardTypeAvailability");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$OrderNewCardKompotMigration;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OrderNewCardKompotMigration extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final OrderNewCardKompotMigration f64948c = new OrderNewCardKompotMigration();

        @NotNull
        public static final Parcelable.Creator<OrderNewCardKompotMigration> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OrderNewCardKompotMigration.f64948c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderNewCardKompotMigration[i];
            }
        }

        private OrderNewCardKompotMigration() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("orderNewCardKompotMigration");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$RetailOnboardingCardOrderVariant1;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RetailOnboardingCardOrderVariant1 extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RetailOnboardingCardOrderVariant1 f64949c = new RetailOnboardingCardOrderVariant1();

        @NotNull
        public static final Parcelable.Creator<RetailOnboardingCardOrderVariant1> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RetailOnboardingCardOrderVariant1.f64949c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RetailOnboardingCardOrderVariant1[i];
            }
        }

        private RetailOnboardingCardOrderVariant1() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cardOrderOnboardingExperimentVariant1");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$RetailOnboardingCardOrderVariant2;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RetailOnboardingCardOrderVariant2 extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RetailOnboardingCardOrderVariant2 f64950c = new RetailOnboardingCardOrderVariant2();

        @NotNull
        public static final Parcelable.Creator<RetailOnboardingCardOrderVariant2> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RetailOnboardingCardOrderVariant2.f64950c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RetailOnboardingCardOrderVariant2[i];
            }
        }

        private RetailOnboardingCardOrderVariant2() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cardOrderOnboardingExperimentVariant2");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$RetailOnboardingCardOrderVariant3;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RetailOnboardingCardOrderVariant3 extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RetailOnboardingCardOrderVariant3 f64951c = new RetailOnboardingCardOrderVariant3();

        @NotNull
        public static final Parcelable.Creator<RetailOnboardingCardOrderVariant3> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RetailOnboardingCardOrderVariant3.f64951c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RetailOnboardingCardOrderVariant3[i];
            }
        }

        private RetailOnboardingCardOrderVariant3() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("cardOrderOnboardingExperimentVariant3");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$RetailOnboardingVirtualCardOnly;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RetailOnboardingVirtualCardOnly extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RetailOnboardingVirtualCardOnly f64952c = new RetailOnboardingVirtualCardOnly();

        @NotNull
        public static final Parcelable.Creator<RetailOnboardingVirtualCardOnly> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RetailOnboardingVirtualCardOnly.f64952c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RetailOnboardingVirtualCardOnly[i];
            }
        }

        private RetailOnboardingVirtualCardOnly() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("postActivationDebitStandardForceVirtualCard");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$RevampedCancellationFeeDisclaimer;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevampedCancellationFeeDisclaimer extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RevampedCancellationFeeDisclaimer f64953c = new RevampedCancellationFeeDisclaimer();

        @NotNull
        public static final Parcelable.Creator<RevampedCancellationFeeDisclaimer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevampedCancellationFeeDisclaimer.f64953c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevampedCancellationFeeDisclaimer[i];
            }
        }

        private RevampedCancellationFeeDisclaimer() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("revampedCancellationFeeDisclaimer");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$UaeCardsExpansion;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UaeCardsExpansion extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final UaeCardsExpansion f64954c = new UaeCardsExpansion();

        @NotNull
        public static final Parcelable.Creator<UaeCardsExpansion> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UaeCardsExpansion.f64954c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UaeCardsExpansion[i];
            }
        }

        private UaeCardsExpansion() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("uaeCardsExpansion");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_order_new/api/CardOrderFeatureApi$Toggles$YouthNumberlessCard;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_card_order_new_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class YouthNumberlessCard extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final YouthNumberlessCard f64955c = new YouthNumberlessCard();

        @NotNull
        public static final Parcelable.Creator<YouthNumberlessCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return YouthNumberlessCard.f64955c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new YouthNumberlessCard[i];
            }
        }

        private YouthNumberlessCard() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("youthNumberlessCard");
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

    private CardOrderFeatureApi$Toggles() {
    }

    public static List a() {
        return v.k(RetailOnboardingVirtualCardOnly.f64952c, RetailOnboardingCardOrderVariant1.f64949c, RetailOnboardingCardOrderVariant2.f64950c, RetailOnboardingCardOrderVariant3.f64951c, UaeCardsExpansion.f64954c, McyCardTypeAvailability.f64947c, CardDeliveryKycAddressValidation.f64944c, RevampedCancellationFeeDisclaimer.f64953c, CardOrderDowngradeFeeDisclosure.f64945c, OrderNewCardKompotMigration.f64948c, DecommissionDesignsForPlanId.f64946c, YouthNumberlessCard.f64955c);
    }
}
