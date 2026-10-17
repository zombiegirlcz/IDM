package com.revolut.feature.rev_points.api.navigation;

import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.models.ChallengeId;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.p;
import yhm.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "RevPointsRedeemConfig", "RevPointsLearnConfig", "RevPointsEarnConfig", "RevPointsTransactionsConfig", "RevPointsTransactionDetailsByIdConfig", "RevPointsChallengesDetailsConfig", "RevPointsChallengesGridDetailsConfig", "RevPointsUpsellSelectPlanConfig", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsChallengesDetailsConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsChallengesGridDetailsConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsEarnConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsLearnConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsRedeemConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsTransactionDetailsByIdConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsTransactionsConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsUpsellSelectPlanConfig;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public abstract class RevPointsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsChallengesDetailsConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsChallengesDetailsConfig extends RevPointsFeatureConfig {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsChallengesDetailsConfig(ChallengeId challengeId) {
            super(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenChallengesDetails(challengeId)));
            Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsChallengesGridDetailsConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsChallengesGridDetailsConfig extends RevPointsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ChallengeId f83490g;

        public RevPointsChallengesGridDetailsConfig() {
            this(null);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsChallengesGridDetailsConfig) && Intrinsics.f(this.f83490g, ((RevPointsChallengesGridDetailsConfig) obj2).f83490g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ChallengeId challengeId = this.f83490g;
            if (challengeId == null) {
                return 0;
            }
            return challengeId.hashCode();
        }

        public RevPointsChallengesGridDetailsConfig(ChallengeId.UniqueId uniqueId) {
            super(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenChallengesGrid(uniqueId)));
            this.f83490g = uniqueId;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsEarnConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsEarnConfig extends RevPointsFeatureConfig {
        public RevPointsEarnConfig() {
            this(0);
        }

        public /* synthetic */ RevPointsEarnConfig(int i) {
            this(false, RevPointsFlowDestination.EarnHubPendingAction.None.f83494a);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsEarnConfig(boolean z, RevPointsFlowDestination.EarnHubPendingAction pendingAction) {
            super(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenEarnHub(z, pendingAction)));
            Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsLearnConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsLearnConfig extends RevPointsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final p f83491g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsLearnConfig(p learnType) {
            super(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenLearnScreen(learnType)));
            Intrinsics.checkNotNullParameter(learnType, "learnType");
            this.f83491g = learnType;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsLearnConfig) && this.f83491g == ((RevPointsLearnConfig) obj2).f83491g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f83491g.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsRedeemConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsRedeemConfig extends RevPointsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f83492g;

        public RevPointsRedeemConfig() {
            this(false);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsRedeemConfig) && this.f83492g == ((RevPointsRedeemConfig) obj2).f83492g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return Boolean.hashCode(this.f83492g);
        }

        public RevPointsRedeemConfig(boolean z) {
            super(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRedeemHub(z)));
            this.f83492g = z;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsTransactionDetailsByIdConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsTransactionDetailsByIdConfig extends RevPointsFeatureConfig {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RevPointsTransactionDetailsByIdConfig(String revPointsTransactionId) {
            super(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRevPointsTransactionDetailsByTransactionId(revPointsTransactionId)));
            Intrinsics.checkNotNullParameter(revPointsTransactionId, "revPointsTransactionId");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsTransactionsConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig;", "<init>", "()V", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsTransactionsConfig extends RevPointsFeatureConfig {
        public RevPointsTransactionsConfig() {
            super(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(null, null, 3)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig$RevPointsUpsellSelectPlanConfig;", "Lcom/revolut/feature/rev_points/api/navigation/RevPointsFeatureConfig;", "<init>", "()V", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsUpsellSelectPlanConfig extends RevPointsFeatureConfig {
        public RevPointsUpsellSelectPlanConfig() {
            super(new RevPointsFlowDestination(RevPointsFlowDestination.StartType.OpenUpsellSelectPlan.f83521a));
        }
    }

    public RevPointsFeatureConfig(RevPointsFlowDestination revPointsFlowDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) revPointsFlowDestination, false, (Integer) null, 0, 45);
    }
}
