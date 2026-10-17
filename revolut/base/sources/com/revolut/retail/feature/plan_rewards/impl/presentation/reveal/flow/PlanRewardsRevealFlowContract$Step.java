package com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/retail/feature/plan_rewards/impl/presentation/reveal/flow/PlanRewardsRevealFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Reveal", "ProductArticle", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/reveal/flow/PlanRewardsRevealFlowContract$Step$ProductArticle;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/reveal/flow/PlanRewardsRevealFlowContract$Step$Reveal;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanRewardsRevealFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/reveal/flow/PlanRewardsRevealFlowContract$Step$ProductArticle;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/reveal/flow/PlanRewardsRevealFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductArticle extends PlanRewardsRevealFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102572a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductArticle(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        public ProductArticle(String articleId) {
            Intrinsics.checkNotNullParameter(articleId, "articleId");
            this.f102572a = articleId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductArticle) && Intrinsics.f(this.f102572a, ((ProductArticle) obj2).f102572a);
        }

        public final int hashCode() {
            return this.f102572a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102572a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/plan_rewards/impl/presentation/reveal/flow/PlanRewardsRevealFlowContract$Step$Reveal;", "Lcom/revolut/retail/feature/plan_rewards/impl/presentation/reveal/flow/PlanRewardsRevealFlowContract$Step;", "<init>", "()V", "feature_retail_plan_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Reveal extends PlanRewardsRevealFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Reveal f102573a = new Reveal();

        @NotNull
        public static final Parcelable.Creator<Reveal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Reveal.f102573a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reveal[i];
            }
        }

        private Reveal() {
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

    private PlanRewardsRevealFlowContract$Step() {
    }
}
