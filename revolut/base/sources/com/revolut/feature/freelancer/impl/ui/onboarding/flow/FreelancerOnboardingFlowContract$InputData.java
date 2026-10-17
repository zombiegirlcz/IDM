package com.revolut.feature.freelancer.impl.ui.onboarding.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.freelancer.api.article.FreelancerOnboardingArticleConfig;
import com.revolut.feature.freelancer.api.navigation.FreelancerOnboardingNavStrategy;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$Step;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOnboardingFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerOnboardingFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerOnboardingArticleConfig f73978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FreelancerOnboardingFlowContract$Step.BusinessInfo f73979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FreelancerOnboardingNavStrategy f73980c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerOnboardingFlowContract$InputData((FreelancerOnboardingArticleConfig) parcel.readParcelable(FreelancerOnboardingFlowContract$InputData.class.getClassLoader()), (FreelancerOnboardingFlowContract$Step.BusinessInfo) parcel.readParcelable(FreelancerOnboardingFlowContract$InputData.class.getClassLoader()), (FreelancerOnboardingNavStrategy) parcel.readParcelable(FreelancerOnboardingFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOnboardingFlowContract$InputData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FreelancerOnboardingFlowContract$InputData() {
        this((FreelancerOnboardingArticleConfig) null, (FreelancerOnboardingNavStrategy) (0 == true ? 1 : 0), 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerOnboardingFlowContract$InputData)) {
            return false;
        }
        FreelancerOnboardingFlowContract$InputData freelancerOnboardingFlowContract$InputData = (FreelancerOnboardingFlowContract$InputData) obj2;
        return Intrinsics.f(this.f73978a, freelancerOnboardingFlowContract$InputData.f73978a) && Intrinsics.f(this.f73979b, freelancerOnboardingFlowContract$InputData.f73979b) && Intrinsics.f(this.f73980c, freelancerOnboardingFlowContract$InputData.f73980c);
    }

    public final int hashCode() {
        int iHashCode = (this.f73979b.hashCode() + (this.f73978a.hashCode() * 31)) * 31;
        FreelancerOnboardingNavStrategy freelancerOnboardingNavStrategy = this.f73980c;
        return iHashCode + (freelancerOnboardingNavStrategy == null ? 0 : freelancerOnboardingNavStrategy.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f73978a, i);
        dest.writeParcelable(this.f73979b, i);
        dest.writeParcelable(this.f73980c, i);
    }

    public FreelancerOnboardingFlowContract$InputData(FreelancerOnboardingArticleConfig articleConfig, FreelancerOnboardingFlowContract$Step.BusinessInfo initialStep, FreelancerOnboardingNavStrategy freelancerOnboardingNavStrategy) {
        Intrinsics.checkNotNullParameter(articleConfig, "articleConfig");
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.f73978a = articleConfig;
        this.f73979b = initialStep;
        this.f73980c = freelancerOnboardingNavStrategy;
    }

    public /* synthetic */ FreelancerOnboardingFlowContract$InputData(FreelancerOnboardingArticleConfig freelancerOnboardingArticleConfig, FreelancerOnboardingNavStrategy freelancerOnboardingNavStrategy, int i) {
        this((i & 1) != 0 ? new FreelancerOnboardingArticleConfig.ShowArticle(dr6.a.GENERAL) : freelancerOnboardingArticleConfig, FreelancerOnboardingFlowContract$Step.BusinessInfo.Category.f73981a, (i & 4) != 0 ? null : freelancerOnboardingNavStrategy);
    }
}
