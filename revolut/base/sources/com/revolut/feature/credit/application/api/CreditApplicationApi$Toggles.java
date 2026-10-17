package com.revolut.feature.credit.application.api;

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
public final class CreditApplicationApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$BalanceTransferAlwaysEntryPoints;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BalanceTransferAlwaysEntryPoints extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final BalanceTransferAlwaysEntryPoints f66179c = new BalanceTransferAlwaysEntryPoints();

        @NotNull
        public static final Parcelable.Creator<BalanceTransferAlwaysEntryPoints> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BalanceTransferAlwaysEntryPoints.f66179c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalanceTransferAlwaysEntryPoints[i];
            }
        }

        private BalanceTransferAlwaysEntryPoints() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("balanceTransferAlwaysEntryPoints");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditApplicationCreditCardHomeScreen;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditApplicationCreditCardHomeScreen extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditApplicationCreditCardHomeScreen f66180c = new CreditApplicationCreditCardHomeScreen();

        @NotNull
        public static final Parcelable.Creator<CreditApplicationCreditCardHomeScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditApplicationCreditCardHomeScreen.f66180c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditApplicationCreditCardHomeScreen[i];
            }
        }

        private CreditApplicationCreditCardHomeScreen() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("creditApplicationCreditCardHomeScreen");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditApplicationLoanHomeScreen;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditApplicationLoanHomeScreen extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditApplicationLoanHomeScreen f66181c = new CreditApplicationLoanHomeScreen();

        @NotNull
        public static final Parcelable.Creator<CreditApplicationLoanHomeScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditApplicationLoanHomeScreen.f66181c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditApplicationLoanHomeScreen[i];
            }
        }

        private CreditApplicationLoanHomeScreen() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("creditApplicationLoanHomeScreen");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditApplicationMortgageHomeScreen;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditApplicationMortgageHomeScreen extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditApplicationMortgageHomeScreen f66182c = new CreditApplicationMortgageHomeScreen();

        @NotNull
        public static final Parcelable.Creator<CreditApplicationMortgageHomeScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditApplicationMortgageHomeScreen.f66182c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditApplicationMortgageHomeScreen[i];
            }
        }

        private CreditApplicationMortgageHomeScreen() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("creditApplicationMortgageHomeScreen");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditApplicationMortgageRefinancingHomeScreen;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditApplicationMortgageRefinancingHomeScreen extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditApplicationMortgageRefinancingHomeScreen f66183c = new CreditApplicationMortgageRefinancingHomeScreen();

        @NotNull
        public static final Parcelable.Creator<CreditApplicationMortgageRefinancingHomeScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditApplicationMortgageRefinancingHomeScreen.f66183c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditApplicationMortgageRefinancingHomeScreen[i];
            }
        }

        private CreditApplicationMortgageRefinancingHomeScreen() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("creditApplicationMortgageRefinancingHomeScreen");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditApplicationSecuredCreditCardHomeScreen;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditApplicationSecuredCreditCardHomeScreen extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditApplicationSecuredCreditCardHomeScreen f66184c = new CreditApplicationSecuredCreditCardHomeScreen();

        @NotNull
        public static final Parcelable.Creator<CreditApplicationSecuredCreditCardHomeScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditApplicationSecuredCreditCardHomeScreen.f66184c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditApplicationSecuredCreditCardHomeScreen[i];
            }
        }

        private CreditApplicationSecuredCreditCardHomeScreen() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("creditApplicationSecuredCreditCardHomeScreen");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditApplicationSkipPlanSelection;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditApplicationSkipPlanSelection extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditApplicationSkipPlanSelection f66185c = new CreditApplicationSkipPlanSelection();

        @NotNull
        public static final Parcelable.Creator<CreditApplicationSkipPlanSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditApplicationSkipPlanSelection.f66185c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditApplicationSkipPlanSelection[i];
            }
        }

        private CreditApplicationSkipPlanSelection() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("creditOnboardingSkipPlanSelection");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditBuilderCardEntryPoint;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditBuilderCardEntryPoint extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditBuilderCardEntryPoint f66186c = new CreditBuilderCardEntryPoint();

        @NotNull
        public static final Parcelable.Creator<CreditBuilderCardEntryPoint> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditBuilderCardEntryPoint.f66186c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditBuilderCardEntryPoint[i];
            }
        }

        private CreditBuilderCardEntryPoint() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("ccBuilderEntryPoints");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditCardWelcomeSkipKyc;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditCardWelcomeSkipKyc extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditCardWelcomeSkipKyc f66187c = new CreditCardWelcomeSkipKyc();

        @NotNull
        public static final Parcelable.Creator<CreditCardWelcomeSkipKyc> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditCardWelcomeSkipKyc.f66187c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardWelcomeSkipKyc[i];
            }
        }

        private CreditCardWelcomeSkipKyc() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("creditWelcomeOfferSkipKyc");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditMortgageOnboardingChecklist;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditMortgageOnboardingChecklist extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditMortgageOnboardingChecklist f66188c = new CreditMortgageOnboardingChecklist();

        @NotNull
        public static final Parcelable.Creator<CreditMortgageOnboardingChecklist> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditMortgageOnboardingChecklist.f66188c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditMortgageOnboardingChecklist[i];
            }
        }

        private CreditMortgageOnboardingChecklist() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("checklistMortgageApplication");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditMortgageRefinancingOnboardingChecklist;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditMortgageRefinancingOnboardingChecklist extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditMortgageRefinancingOnboardingChecklist f66189c = new CreditMortgageRefinancingOnboardingChecklist();

        @NotNull
        public static final Parcelable.Creator<CreditMortgageRefinancingOnboardingChecklist> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditMortgageRefinancingOnboardingChecklist.f66189c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditMortgageRefinancingOnboardingChecklist[i];
            }
        }

        private CreditMortgageRefinancingOnboardingChecklist() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("checklistMortgageRefinancingApplication");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/api/CreditApplicationApi$Toggles$CreditPreApplicationChecks;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_credit_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditPreApplicationChecks extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditPreApplicationChecks f66190c = new CreditPreApplicationChecks();

        @NotNull
        public static final Parcelable.Creator<CreditPreApplicationChecks> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditPreApplicationChecks.f66190c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditPreApplicationChecks[i];
            }
        }

        private CreditPreApplicationChecks() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("creditPreApplicationChecks");
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

    private CreditApplicationApi$Toggles() {
    }

    public static List a() {
        return v.k(BalanceTransferAlwaysEntryPoints.f66179c, CreditMortgageOnboardingChecklist.f66188c, CreditMortgageRefinancingOnboardingChecklist.f66189c, CreditApplicationLoanHomeScreen.f66181c, CreditCardWelcomeSkipKyc.f66187c, CreditApplicationCreditCardHomeScreen.f66180c, CreditApplicationSecuredCreditCardHomeScreen.f66184c, CreditApplicationSkipPlanSelection.f66185c, CreditBuilderCardEntryPoint.f66186c, CreditApplicationMortgageHomeScreen.f66182c, CreditApplicationMortgageRefinancingHomeScreen.f66183c, CreditPreApplicationChecks.f66190c);
    }
}
