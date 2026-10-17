package com.revolut.feature.pricing_plans.upgrade_prompt.api;

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

/* JADX INFO: loaded from: classes5.dex */
public final class PricingPlanUpgradeEntryPointApi$Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/PricingPlanUpgradeEntryPointApi$Toggles$PlanWidgetNudges;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanWidgetNudges extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PlanWidgetNudges f80973c = new PlanWidgetNudges();

        @NotNull
        public static final Parcelable.Creator<PlanWidgetNudges> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanWidgetNudges.f80973c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanWidgetNudges[i];
            }
        }

        private PlanWidgetNudges() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("planWidgetNudges");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/PricingPlanUpgradeEntryPointApi$Toggles$RevampedPremiumContextualBanners;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevampedPremiumContextualBanners extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RevampedPremiumContextualBanners f80974c = new RevampedPremiumContextualBanners();

        @NotNull
        public static final Parcelable.Creator<RevampedPremiumContextualBanners> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevampedPremiumContextualBanners.f80974c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevampedPremiumContextualBanners[i];
            }
        }

        private RevampedPremiumContextualBanners() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("revampedPremiumContextualBanners");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/PricingPlanUpgradeEntryPointApi$Toggles$RevampedPremiumContextualBannersPt2;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevampedPremiumContextualBannersPt2 extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RevampedPremiumContextualBannersPt2 f80975c = new RevampedPremiumContextualBannersPt2();

        @NotNull
        public static final Parcelable.Creator<RevampedPremiumContextualBannersPt2> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevampedPremiumContextualBannersPt2.f80975c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevampedPremiumContextualBannersPt2[i];
            }
        }

        private RevampedPremiumContextualBannersPt2() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("revampedPremiumContextualBannersV2");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricing_plans/upgrade_prompt/api/PricingPlanUpgradeEntryPointApi$Toggles$RevampedPremiumContextualBannersPt2Crypto;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "feature_pricing_plans_upgrade_prompt_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevampedPremiumContextualBannersPt2Crypto extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RevampedPremiumContextualBannersPt2Crypto f80976c = new RevampedPremiumContextualBannersPt2Crypto();

        @NotNull
        public static final Parcelable.Creator<RevampedPremiumContextualBannersPt2Crypto> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevampedPremiumContextualBannersPt2Crypto.f80976c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevampedPremiumContextualBannersPt2Crypto[i];
            }
        }

        private RevampedPremiumContextualBannersPt2Crypto() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("revampedCryptoPremiumContextualBanners");
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

    private PricingPlanUpgradeEntryPointApi$Toggles() {
    }

    public static List a() {
        return v.k(RevampedPremiumContextualBanners.f80974c, PlanWidgetNudges.f80973c, RevampedPremiumContextualBannersPt2.f80975c, RevampedPremiumContextualBannersPt2Crypto.f80976c);
    }
}
