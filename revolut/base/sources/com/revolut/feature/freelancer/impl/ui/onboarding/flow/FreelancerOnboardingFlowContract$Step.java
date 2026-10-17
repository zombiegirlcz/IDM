package com.revolut.feature.freelancer.impl.ui.onboarding.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BusinessInfo", "StoryProductArticle", "TermsAndConditions", "WorkflowOnboarding", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$StoryProductArticle;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$TermsAndConditions;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$WorkflowOnboarding;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerOnboardingFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step;", "Category", "Description", "ProofOfActivity", "Website", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo$Category;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo$Description;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo$ProofOfActivity;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo$Website;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface BusinessInfo extends FreelancerOnboardingFlowContract$Step {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo$Category;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Category implements BusinessInfo {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Category f73981a = new Category();

            @NotNull
            public static final Parcelable.Creator<Category> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Category.f73981a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Category[i];
                }
            }

            private Category() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo$Description;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Description implements BusinessInfo {

            @NotNull
            public static final Parcelable.Creator<Description> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f73982a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Description(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Description[i];
                }
            }

            public Description(String description) {
                Intrinsics.checkNotNullParameter(description, "description");
                this.f73982a = description;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Description) && Intrinsics.f(this.f73982a, ((Description) obj2).f73982a);
            }

            public final int hashCode() {
                return this.f73982a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f73982a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo$ProofOfActivity;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ProofOfActivity implements BusinessInfo {

            @NotNull
            public static final Parcelable.Creator<ProofOfActivity> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f73983a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ProofOfActivity(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ProofOfActivity[i];
                }
            }

            public ProofOfActivity(String formId) {
                Intrinsics.checkNotNullParameter(formId, "formId");
                this.f73983a = formId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ProofOfActivity) && Intrinsics.f(this.f73983a, ((ProofOfActivity) obj2).f73983a);
            }

            public final int hashCode() {
                return this.f73983a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f73983a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo$Website;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$BusinessInfo;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Website implements BusinessInfo {

            @NotNull
            public static final Parcelable.Creator<Website> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f73984a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f73985b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Website(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Website[i];
                }
            }

            public Website(String url2, boolean z) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f73984a = url2;
                this.f73985b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Website)) {
                    return false;
                }
                Website website = (Website) obj2;
                return Intrinsics.f(this.f73984a, website.f73984a) && this.f73985b == website.f73985b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f73985b) + (this.f73984a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f73984a);
                dest.writeInt(this.f73985b ? 1 : 0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$StoryProductArticle;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StoryProductArticle implements FreelancerOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<StoryProductArticle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductArticleParams f73988a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StoryProductArticle((ProductArticleParams) parcel.readParcelable(StoryProductArticle.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StoryProductArticle[i];
            }
        }

        public StoryProductArticle(ProductArticleParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            this.f73988a = params;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StoryProductArticle) && Intrinsics.f(this.f73988a, ((StoryProductArticle) obj2).f73988a);
        }

        public final int hashCode() {
            return this.f73988a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73988a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$TermsAndConditions;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TermsAndConditions implements FreelancerOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TermsAndConditions f73989a = new TermsAndConditions();

        @NotNull
        public static final Parcelable.Creator<TermsAndConditions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TermsAndConditions.f73989a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsAndConditions[i];
            }
        }

        private TermsAndConditions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$WorkflowOnboarding;", "Lcom/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WorkflowOnboarding implements FreelancerOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WorkflowOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73990a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WorkflowOnboarding(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WorkflowOnboarding[i];
            }
        }

        public WorkflowOnboarding(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f73990a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WorkflowOnboarding) && Intrinsics.f(this.f73990a, ((WorkflowOnboarding) obj2).f73990a);
        }

        public final int hashCode() {
            return this.f73990a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73990a);
        }
    }
}
