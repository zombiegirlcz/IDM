package com.revolut.feature_move_money.api;

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

/* JADX INFO: loaded from: classes10.dex */
public final class MoveMoneyFeatureApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$CountryProfileAvailable;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryProfileAvailable extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CountryProfileAvailable f97181c = new CountryProfileAvailable();

        @NotNull
        public static final Parcelable.Creator<CountryProfileAvailable> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryProfileAvailable.f97181c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryProfileAvailable[i];
            }
        }

        private CountryProfileAvailable() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("countryProfileAvailable");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$MoveAgainButton;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveAgainButton extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveAgainButton f97182c = new MoveAgainButton();

        @NotNull
        public static final Parcelable.Creator<MoveAgainButton> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveAgainButton.f97182c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveAgainButton[i];
            }
        }

        private MoveAgainButton() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moveAgainButtonAndroid");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$MoveMoneyAddCurrencies;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveMoneyAddCurrencies extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveMoneyAddCurrencies f97183c = new MoveMoneyAddCurrencies();

        @NotNull
        public static final Parcelable.Creator<MoveMoneyAddCurrencies> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveMoneyAddCurrencies.f97183c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyAddCurrencies[i];
            }
        }

        private MoveMoneyAddCurrencies() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moveMoneyAddCurrency");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$MoveMoneyAutomations;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveMoneyAutomations extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveMoneyAutomations f97184c = new MoveMoneyAutomations();

        @NotNull
        public static final Parcelable.Creator<MoveMoneyAutomations> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveMoneyAutomations.f97184c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyAutomations[i];
            }
        }

        private MoveMoneyAutomations() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moveMoneyAutomations");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$MoveMoneyBalancePairEligibility;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveMoneyBalancePairEligibility extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveMoneyBalancePairEligibility f97185c = new MoveMoneyBalancePairEligibility();

        @NotNull
        public static final Parcelable.Creator<MoveMoneyBalancePairEligibility> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveMoneyBalancePairEligibility.f97185c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyBalancePairEligibility[i];
            }
        }

        private MoveMoneyBalancePairEligibility() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("newMoveMoneyBalancePairEligibility");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$MoveMoneyEuDisclaimerUpdate;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveMoneyEuDisclaimerUpdate extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveMoneyEuDisclaimerUpdate f97186c = new MoveMoneyEuDisclaimerUpdate();

        @NotNull
        public static final Parcelable.Creator<MoveMoneyEuDisclaimerUpdate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveMoneyEuDisclaimerUpdate.f97186c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyEuDisclaimerUpdate[i];
            }
        }

        private MoveMoneyEuDisclaimerUpdate() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moveMoneyEuDisclaimerUpdate");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$MoveMoneyExchangeEntryPointsMoved;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveMoneyExchangeEntryPointsMoved extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveMoneyExchangeEntryPointsMoved f97187c = new MoveMoneyExchangeEntryPointsMoved();

        @NotNull
        public static final Parcelable.Creator<MoveMoneyExchangeEntryPointsMoved> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveMoneyExchangeEntryPointsMoved.f97187c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyExchangeEntryPointsMoved[i];
            }
        }

        private MoveMoneyExchangeEntryPointsMoved() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("exchangeEntryPointsMoved");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$MoveMoneyExchangeEntryPointsMovedCards;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveMoneyExchangeEntryPointsMovedCards extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveMoneyExchangeEntryPointsMovedCards f97188c = new MoveMoneyExchangeEntryPointsMovedCards();

        @NotNull
        public static final Parcelable.Creator<MoveMoneyExchangeEntryPointsMovedCards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveMoneyExchangeEntryPointsMovedCards.f97188c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyExchangeEntryPointsMovedCards[i];
            }
        }

        private MoveMoneyExchangeEntryPointsMovedCards() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("exchangeEntryPointsMovedCards");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$MoveMoneyExchangeEntryPointsMovedPlans;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveMoneyExchangeEntryPointsMovedPlans extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveMoneyExchangeEntryPointsMovedPlans f97189c = new MoveMoneyExchangeEntryPointsMovedPlans();

        @NotNull
        public static final Parcelable.Creator<MoveMoneyExchangeEntryPointsMovedPlans> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveMoneyExchangeEntryPointsMovedPlans.f97189c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyExchangeEntryPointsMovedPlans[i];
            }
        }

        private MoveMoneyExchangeEntryPointsMovedPlans() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("exchangeEntryPointsMovedPlans");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$MoveMoneyUAEAccountBalanceLimit;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveMoneyUAEAccountBalanceLimit extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveMoneyUAEAccountBalanceLimit f97190c = new MoveMoneyUAEAccountBalanceLimit();

        @NotNull
        public static final Parcelable.Creator<MoveMoneyUAEAccountBalanceLimit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveMoneyUAEAccountBalanceLimit.f97190c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyUAEAccountBalanceLimit[i];
            }
        }

        private MoveMoneyUAEAccountBalanceLimit() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moveMoneyUAEAccountBalanceLimit");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/api/MoveMoneyFeatureApi$Toggles$MoveMoneyUAEWalletLimits;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveMoneyUAEWalletLimits extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveMoneyUAEWalletLimits f97191c = new MoveMoneyUAEWalletLimits();

        @NotNull
        public static final Parcelable.Creator<MoveMoneyUAEWalletLimits> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveMoneyUAEWalletLimits.f97191c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyUAEWalletLimits[i];
            }
        }

        private MoveMoneyUAEWalletLimits() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moveMoneyUAEWalletLimits");
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

    private MoveMoneyFeatureApi$Toggles() {
    }

    public static List a() {
        return v.k(MoveMoneyAddCurrencies.f97183c, MoveMoneyEuDisclaimerUpdate.f97186c, CountryProfileAvailable.f97181c, MoveMoneyAutomations.f97184c, MoveMoneyBalancePairEligibility.f97185c, MoveMoneyUAEWalletLimits.f97191c, MoveMoneyUAEAccountBalanceLimit.f97190c, MoveMoneyExchangeEntryPointsMoved.f97187c, MoveMoneyExchangeEntryPointsMovedCards.f97188c, MoveMoneyExchangeEntryPointsMovedPlans.f97189c, MoveAgainButton.f97182c);
    }
}
