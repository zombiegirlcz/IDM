package com.revolut.retail.feature.impl.rewards_hub.ui.flow.rewards_hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.challenge_details.ChallengeDetailsScreenContract$InputData;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.direct_reward.RewardsHubDirectRewardScreenContract$InputData;
import com.revolut.retail.feature.impl.rewards_hub.ui.screen.eligibility_criteria.EligibilityCriteriaScreenContract$InputData;
import d0j.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "RewardsHubHome", "RewardsHubDirectReward", "RewardsHubChallengeDetails", "RewardsHubChallengeHistory", "EligibilityCriteria", "RewardsHubCollection", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$EligibilityCriteria;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$RewardsHubChallengeDetails;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$RewardsHubChallengeHistory;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$RewardsHubCollection;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$RewardsHubDirectReward;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$RewardsHubHome;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RewardsHubFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$EligibilityCriteria;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EligibilityCriteria extends RewardsHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EligibilityCriteria> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EligibilityCriteriaScreenContract$InputData f101566a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EligibilityCriteria(EligibilityCriteriaScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EligibilityCriteria[i];
            }
        }

        public EligibilityCriteria(EligibilityCriteriaScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f101566a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EligibilityCriteria) && Intrinsics.f(this.f101566a, ((EligibilityCriteria) obj2).f101566a);
        }

        public final int hashCode() {
            return this.f101566a.f101589a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f101566a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$RewardsHubChallengeDetails;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardsHubChallengeDetails extends RewardsHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RewardsHubChallengeDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChallengeDetailsScreenContract$InputData f101567a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardsHubChallengeDetails(ChallengeDetailsScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardsHubChallengeDetails[i];
            }
        }

        public RewardsHubChallengeDetails(ChallengeDetailsScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f101567a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RewardsHubChallengeDetails) && Intrinsics.f(this.f101567a, ((RewardsHubChallengeDetails) obj2).f101567a);
        }

        public final int hashCode() {
            return this.f101567a.f101573a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f101567a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$RewardsHubChallengeHistory;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardsHubChallengeHistory extends RewardsHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RewardsHubChallengeHistory> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f101568a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardsHubChallengeHistory(m.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardsHubChallengeHistory[i];
            }
        }

        public RewardsHubChallengeHistory(m type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f101568a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RewardsHubChallengeHistory) && this.f101568a == ((RewardsHubChallengeHistory) obj2).f101568a;
        }

        public final int hashCode() {
            return this.f101568a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101568a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$RewardsHubCollection;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardsHubCollection extends RewardsHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RewardsHubCollection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101569a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardsHubCollection(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardsHubCollection[i];
            }
        }

        public RewardsHubCollection(String collectionId) {
            Intrinsics.checkNotNullParameter(collectionId, "collectionId");
            this.f101569a = collectionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RewardsHubCollection) && Intrinsics.f(this.f101569a, ((RewardsHubCollection) obj2).f101569a);
        }

        public final int hashCode() {
            return this.f101569a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101569a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$RewardsHubDirectReward;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardsHubDirectReward extends RewardsHubFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RewardsHubDirectReward> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RewardsHubDirectRewardScreenContract$InputData f101570a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardsHubDirectReward(RewardsHubDirectRewardScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardsHubDirectReward[i];
            }
        }

        public RewardsHubDirectReward(RewardsHubDirectRewardScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f101570a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RewardsHubDirectReward) && Intrinsics.f(this.f101570a, ((RewardsHubDirectReward) obj2).f101570a);
        }

        public final int hashCode() {
            return this.f101570a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f101570a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step$RewardsHubHome;", "Lcom/revolut/retail/feature/impl/rewards_hub/ui/flow/rewards_hub/RewardsHubFlowContract$Step;", "<init>", "()V", "feature_rewards_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RewardsHubHome extends RewardsHubFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RewardsHubHome f101571a = new RewardsHubHome();

        @NotNull
        public static final Parcelable.Creator<RewardsHubHome> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RewardsHubHome.f101571a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardsHubHome[i];
            }
        }

        private RewardsHubHome() {
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

    private RewardsHubFlowContract$Step() {
    }
}
