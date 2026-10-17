package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardInfo;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardSectionInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SectionInfo", "RewardInfo", "RewardSelection", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$ModalStep$RewardInfo;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$ModalStep$RewardSelection;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$ModalStep$SectionInfo;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CobrandedCardsPlanHubRewardsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$ModalStep$RewardInfo;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardInfo implements CobrandedCardsPlanHubRewardsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RewardInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanHubInfoRewardInfo f82593a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardInfo((CobrandedCardsPlanHubInfoRewardInfo) parcel.readParcelable(RewardInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardInfo[i];
            }
        }

        public RewardInfo(CobrandedCardsPlanHubInfoRewardInfo rewardInfo) {
            Intrinsics.checkNotNullParameter(rewardInfo, "rewardInfo");
            this.f82593a = rewardInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RewardInfo) && Intrinsics.f(this.f82593a, ((RewardInfo) obj2).f82593a);
        }

        public final int hashCode() {
            return this.f82593a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82593a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$ModalStep$RewardSelection;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RewardSelection implements CobrandedCardsPlanHubRewardsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RewardSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82594a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RewardSelection(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardSelection[i];
            }
        }

        public RewardSelection(String milestoneRewardCode) {
            Intrinsics.checkNotNullParameter(milestoneRewardCode, "milestoneRewardCode");
            this.f82594a = milestoneRewardCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RewardSelection) && Intrinsics.f(this.f82594a, ((RewardSelection) obj2).f82594a);
        }

        public final int hashCode() {
            return this.f82594a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82594a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$ModalStep$SectionInfo;", "Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/rewards/CobrandedCardsPlanHubRewardsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SectionInfo implements CobrandedCardsPlanHubRewardsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SectionInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CobrandedCardsPlanHubInfoRewardSectionInfo f82595a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SectionInfo((CobrandedCardsPlanHubInfoRewardSectionInfo) parcel.readParcelable(SectionInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SectionInfo[i];
            }
        }

        public SectionInfo(CobrandedCardsPlanHubInfoRewardSectionInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f82595a = info;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SectionInfo) && Intrinsics.f(this.f82595a, ((SectionInfo) obj2).f82595a);
        }

        public final int hashCode() {
            return this.f82595a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f82595a, i);
        }
    }
}
