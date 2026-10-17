package com.revolut.retail.feature.plan_rewards.impl.presentation.list.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.plan_rewards.api.model.RewardInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "OptOut", "ProductArticle", "RewardsList", "Reveal", "ShowAdditionalRewards", "ShowRewardDetails", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$OptOut;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$ProductArticle;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$Reveal;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$RewardsList;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$ShowAdditionalRewards;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$ShowRewardDetails;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MilestoneRewardsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$OptOut;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OptOut extends MilestoneRewardsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OptOut> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102558a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OptOut(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OptOut[i];
            }
        }

        public OptOut(String termsUrl) {
            Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
            this.f102558a = termsUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OptOut) && Intrinsics.f(this.f102558a, ((OptOut) obj2).f102558a);
        }

        public final int hashCode() {
            return this.f102558a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102558a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$ProductArticle;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle extends MilestoneRewardsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f102559a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle((ProductArticleParams) parcel.readParcelable(ProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f102559a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && Intrinsics.f(this.f102559a, ((ProductArticle) obj2).f102559a);
        }

        public final int hashCode() {
            return this.f102559a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102559a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$Reveal;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reveal extends MilestoneRewardsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Reveal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102560a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Reveal(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reveal[i];
            }
        }

        public Reveal(String str) {
            this.f102560a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Reveal) && Intrinsics.f(this.f102560a, ((Reveal) obj2).f102560a);
        }

        public final int hashCode() {
            String str = this.f102560a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102560a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$RewardsList;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step;", "<init>", "()V", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RewardsList extends MilestoneRewardsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RewardsList f102561a = new RewardsList();

        @NotNull
        public static final Parcelable.Creator<RewardsList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RewardsList.f102561a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RewardsList[i];
            }
        }

        private RewardsList() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$ShowAdditionalRewards;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowAdditionalRewards extends MilestoneRewardsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShowAdditionalRewards> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f102562a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ShowAdditionalRewards.class, parcel, arrayList, iE, 1);
                }
                return new ShowAdditionalRewards(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowAdditionalRewards[i];
            }
        }

        public ShowAdditionalRewards(ArrayList additionalRewards) {
            Intrinsics.checkNotNullParameter(additionalRewards, "additionalRewards");
            this.f102562a = additionalRewards;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowAdditionalRewards) && this.f102562a.equals(((ShowAdditionalRewards) obj2).f102562a);
        }

        public final int hashCode() {
            return this.f102562a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f102562a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step$ShowRewardDetails;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/list/flow/MilestoneRewardsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowRewardDetails extends MilestoneRewardsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShowRewardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RewardInfo f102563a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowRewardDetails((RewardInfo) parcel.readParcelable(ShowRewardDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowRewardDetails[i];
            }
        }

        public ShowRewardDetails(RewardInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f102563a = info;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowRewardDetails) && Intrinsics.f(this.f102563a, ((ShowRewardDetails) obj2).f102563a);
        }

        public final int hashCode() {
            return this.f102563a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102563a, i);
        }
    }

    private MilestoneRewardsFlowContract$Step() {
    }
}
