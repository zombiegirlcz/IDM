package com.revolut.feature.junior_onboarding.impl.ui.post_onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/post_onboarding/JuniorPostOnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ArtificialFirstStep", "Workflow", "Lcom/revolut/feature/junior_onboarding/impl/ui/post_onboarding/JuniorPostOnboardingFlowContract$Step$ArtificialFirstStep;", "Lcom/revolut/feature/junior_onboarding/impl/ui/post_onboarding/JuniorPostOnboardingFlowContract$Step$Workflow;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorPostOnboardingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/post_onboarding/JuniorPostOnboardingFlowContract$Step$ArtificialFirstStep;", "Lcom/revolut/feature/junior_onboarding/impl/ui/post_onboarding/JuniorPostOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ArtificialFirstStep extends JuniorPostOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ArtificialFirstStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorPostOnboardingFlowContract$Step f77066a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ArtificialFirstStep((JuniorPostOnboardingFlowContract$Step) parcel.readParcelable(ArtificialFirstStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ArtificialFirstStep[i];
            }
        }

        public ArtificialFirstStep(JuniorPostOnboardingFlowContract$Step realStep) {
            Intrinsics.checkNotNullParameter(realStep, "realStep");
            this.f77066a = realStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ArtificialFirstStep) && Intrinsics.f(this.f77066a, ((ArtificialFirstStep) obj2).f77066a);
        }

        public final int hashCode() {
            return this.f77066a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77066a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/post_onboarding/JuniorPostOnboardingFlowContract$Step$Workflow;", "Lcom/revolut/feature/junior_onboarding/impl/ui/post_onboarding/JuniorPostOnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow extends JuniorPostOnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77067a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(String workflowId) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f77067a = workflowId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Workflow) && Intrinsics.f(this.f77067a, ((Workflow) obj2).f77067a);
        }

        public final int hashCode() {
            return this.f77067a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77067a);
        }
    }

    private JuniorPostOnboardingFlowContract$Step() {
    }
}
