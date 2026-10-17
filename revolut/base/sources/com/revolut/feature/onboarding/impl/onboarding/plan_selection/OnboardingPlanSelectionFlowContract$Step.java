package com.revolut.feature.onboarding.impl.onboarding.plan_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xfa.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/plan_selection/OnboardingPlanSelectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectPlan", "PlanOffer", "Lcom/revolut/feature/onboarding/impl/onboarding/plan_selection/OnboardingPlanSelectionFlowContract$Step$PlanOffer;", "Lcom/revolut/feature/onboarding/impl/onboarding/plan_selection/OnboardingPlanSelectionFlowContract$Step$SelectPlan;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnboardingPlanSelectionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/plan_selection/OnboardingPlanSelectionFlowContract$Step$PlanOffer;", "Lcom/revolut/feature/onboarding/impl/onboarding/plan_selection/OnboardingPlanSelectionFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PlanOffer extends OnboardingPlanSelectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PlanOffer f78472a = new PlanOffer();

        @NotNull
        public static final Parcelable.Creator<PlanOffer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PlanOffer.f78472a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanOffer[i];
            }
        }

        private PlanOffer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/plan_selection/OnboardingPlanSelectionFlowContract$Step$SelectPlan;", "Lcom/revolut/feature/onboarding/impl/onboarding/plan_selection/OnboardingPlanSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectPlan extends OnboardingPlanSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f78473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78474b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectPlan(b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPlan[i];
            }
        }

        public SelectPlan(b source, boolean z) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f78473a = source;
            this.f78474b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectPlan)) {
                return false;
            }
            SelectPlan selectPlan = (SelectPlan) obj2;
            return this.f78473a == selectPlan.f78473a && this.f78474b == selectPlan.f78474b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78474b) + (this.f78473a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78473a.name());
            dest.writeInt(this.f78474b ? 1 : 0);
        }
    }

    private OnboardingPlanSelectionFlowContract$Step() {
    }
}
