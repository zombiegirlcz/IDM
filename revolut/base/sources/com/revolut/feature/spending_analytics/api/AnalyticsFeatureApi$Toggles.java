package com.revolut.feature.spending_analytics.api;

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

/* JADX INFO: loaded from: classes7.dex */
public final class AnalyticsFeatureApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$AnalyticsAirTip;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalyticsAirTip extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AnalyticsAirTip f87383c = new AnalyticsAirTip();

        @NotNull
        public static final Parcelable.Creator<AnalyticsAirTip> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalyticsAirTip.f87383c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsAirTip[i];
            }
        }

        private AnalyticsAirTip() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsAirTip");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$AnalyticsFiltersImprovements;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalyticsFiltersImprovements extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AnalyticsFiltersImprovements f87384c = new AnalyticsFiltersImprovements();

        @NotNull
        public static final Parcelable.Creator<AnalyticsFiltersImprovements> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalyticsFiltersImprovements.f87384c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsFiltersImprovements[i];
            }
        }

        private AnalyticsFiltersImprovements() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsFiltersImprovements");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$AnalyticsIncomeSorterJointSavingsAndPockets;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalyticsIncomeSorterJointSavingsAndPockets extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AnalyticsIncomeSorterJointSavingsAndPockets f87385c = new AnalyticsIncomeSorterJointSavingsAndPockets();

        @NotNull
        public static final Parcelable.Creator<AnalyticsIncomeSorterJointSavingsAndPockets> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalyticsIncomeSorterJointSavingsAndPockets.f87385c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsIncomeSorterJointSavingsAndPockets[i];
            }
        }

        private AnalyticsIncomeSorterJointSavingsAndPockets() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsIncomeSorterJointSavingsAndPockets");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$AnalyticsJointAccountContributions;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalyticsJointAccountContributions extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AnalyticsJointAccountContributions f87386c = new AnalyticsJointAccountContributions();

        @NotNull
        public static final Parcelable.Creator<AnalyticsJointAccountContributions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalyticsJointAccountContributions.f87386c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsJointAccountContributions[i];
            }
        }

        private AnalyticsJointAccountContributions() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsJointAccountContributions");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$AnalyticsNewTotalWealthWidget;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalyticsNewTotalWealthWidget extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AnalyticsNewTotalWealthWidget f87387c = new AnalyticsNewTotalWealthWidget();

        @NotNull
        public static final Parcelable.Creator<AnalyticsNewTotalWealthWidget> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalyticsNewTotalWealthWidget.f87387c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsNewTotalWealthWidget[i];
            }
        }

        private AnalyticsNewTotalWealthWidget() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsNewTotalWealthWidget");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$AnalyticsRevamp;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalyticsRevamp extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AnalyticsRevamp f87388c = new AnalyticsRevamp();

        @NotNull
        public static final Parcelable.Creator<AnalyticsRevamp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalyticsRevamp.f87388c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsRevamp[i];
            }
        }

        private AnalyticsRevamp() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsRevamp");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$AnalyticsTransactionDetailsPager;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalyticsTransactionDetailsPager extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AnalyticsTransactionDetailsPager f87389c = new AnalyticsTransactionDetailsPager();

        @NotNull
        public static final Parcelable.Creator<AnalyticsTransactionDetailsPager> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalyticsTransactionDetailsPager.f87389c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsTransactionDetailsPager[i];
            }
        }

        private AnalyticsTransactionDetailsPager() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsTransactionDetailsPager");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$AnalyticsTravelFeatures;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalyticsTravelFeatures extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AnalyticsTravelFeatures f87390c = new AnalyticsTravelFeatures();

        @NotNull
        public static final Parcelable.Creator<AnalyticsTravelFeatures> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalyticsTravelFeatures.f87390c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsTravelFeatures[i];
            }
        }

        private AnalyticsTravelFeatures() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsTravelFeatures");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$BudgetRevamp;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BudgetRevamp extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final BudgetRevamp f87391c = new BudgetRevamp();

        @NotNull
        public static final Parcelable.Creator<BudgetRevamp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BudgetRevamp.f87391c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BudgetRevamp[i];
            }
        }

        private BudgetRevamp() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsBudgetRevamp");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$CreditCardCardholdersAnalyticsCategory;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CreditCardCardholdersAnalyticsCategory extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CreditCardCardholdersAnalyticsCategory f87392c = new CreditCardCardholdersAnalyticsCategory();

        @NotNull
        public static final Parcelable.Creator<CreditCardCardholdersAnalyticsCategory> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CreditCardCardholdersAnalyticsCategory.f87392c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditCardCardholdersAnalyticsCategory[i];
            }
        }

        private CreditCardCardholdersAnalyticsCategory() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("creditCardCardholdersAnalyticsCategory");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$CustodianJisaIncomeSorter;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CustodianJisaIncomeSorter extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CustodianJisaIncomeSorter f87393c = new CustodianJisaIncomeSorter();

        @NotNull
        public static final Parcelable.Creator<CustodianJisaIncomeSorter> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CustodianJisaIncomeSorter.f87393c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustodianJisaIncomeSorter[i];
            }
        }

        private CustodianJisaIncomeSorter() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("juniorJisaIncomeSorter");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$ForceShowProductArticles;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForceShowProductArticles extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ForceShowProductArticles f87394c = new ForceShowProductArticles();

        @NotNull
        public static final Parcelable.Creator<ForceShowProductArticles> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ForceShowProductArticles.f87394c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForceShowProductArticles[i];
            }
        }

        private ForceShowProductArticles() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsForceShowProductArticles");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$HideTotalWealthEmptyStates;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HideTotalWealthEmptyStates extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final HideTotalWealthEmptyStates f87395c = new HideTotalWealthEmptyStates();

        @NotNull
        public static final Parcelable.Creator<HideTotalWealthEmptyStates> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HideTotalWealthEmptyStates.f87395c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HideTotalWealthEmptyStates[i];
            }
        }

        private HideTotalWealthEmptyStates() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("hideTotalWealthEmptyStates");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$IncomeSorterTransferDestination;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeSorterTransferDestination extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final IncomeSorterTransferDestination f87396c = new IncomeSorterTransferDestination();

        @NotNull
        public static final Parcelable.Creator<IncomeSorterTransferDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IncomeSorterTransferDestination.f87396c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeSorterTransferDestination[i];
            }
        }

        private IncomeSorterTransferDestination() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("analyticsIncomeSorterTransfers");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$PrivateBankTotalWealth;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PrivateBankTotalWealth extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PrivateBankTotalWealth f87397c = new PrivateBankTotalWealth();

        @NotNull
        public static final Parcelable.Creator<PrivateBankTotalWealth> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PrivateBankTotalWealth.f87397c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateBankTotalWealth[i];
            }
        }

        private PrivateBankTotalWealth() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("privateBankTotalWealth");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$RevIQ;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevIQ extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RevIQ f87398c = new RevIQ();

        @NotNull
        public static final Parcelable.Creator<RevIQ> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevIQ.f87398c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevIQ[i];
            }
        }

        private RevIQ() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("revolutIQ");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/spending_analytics/api/AnalyticsFeatureApi$Toggles$TeenJisaIncomeSorter;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_spending_analytics_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TeenJisaIncomeSorter extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TeenJisaIncomeSorter f87399c = new TeenJisaIncomeSorter();

        @NotNull
        public static final Parcelable.Creator<TeenJisaIncomeSorter> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TeenJisaIncomeSorter.f87399c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TeenJisaIncomeSorter[i];
            }
        }

        private TeenJisaIncomeSorter() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("teenJisaIncomeSorter");
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

    private AnalyticsFeatureApi$Toggles() {
    }

    public static List a() {
        return v.k(HideTotalWealthEmptyStates.f87395c, IncomeSorterTransferDestination.f87396c, CreditCardCardholdersAnalyticsCategory.f87392c, ForceShowProductArticles.f87394c, AnalyticsIncomeSorterJointSavingsAndPockets.f87385c, AnalyticsTransactionDetailsPager.f87389c, AnalyticsNewTotalWealthWidget.f87387c, PrivateBankTotalWealth.f87397c, AnalyticsTravelFeatures.f87390c, RevIQ.f87398c, AnalyticsFiltersImprovements.f87384c, AnalyticsRevamp.f87388c, AnalyticsAirTip.f87383c, TeenJisaIncomeSorter.f87399c, CustodianJisaIncomeSorter.f87393c, BudgetRevamp.f87391c, AnalyticsJointAccountContributions.f87386c);
    }
}
