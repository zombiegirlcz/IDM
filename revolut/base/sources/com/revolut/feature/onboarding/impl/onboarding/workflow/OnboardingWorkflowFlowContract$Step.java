package com.revolut.feature.onboarding.impl.onboarding.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/workflow/OnboardingWorkflowFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingWorkflowFlowContract$Step implements FlowStep {

    @NotNull
    public static final Parcelable.Creator<OnboardingWorkflowFlowContract$Step> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f78518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78520c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingWorkflowFlowContract$Step(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingWorkflowFlowContract$Step[i];
        }
    }

    public OnboardingWorkflowFlowContract$Step(String workflowId, String str, b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f78518a = countryCode;
        this.f78519b = workflowId;
        this.f78520c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingWorkflowFlowContract$Step)) {
            return false;
        }
        OnboardingWorkflowFlowContract$Step onboardingWorkflowFlowContract$Step = (OnboardingWorkflowFlowContract$Step) obj2;
        return Intrinsics.f(this.f78518a, onboardingWorkflowFlowContract$Step.f78518a) && Intrinsics.f(this.f78519b, onboardingWorkflowFlowContract$Step.f78519b) && Intrinsics.f(this.f78520c, onboardingWorkflowFlowContract$Step.f78520c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f78518a.f297794a.hashCode() * 31, 31, this.f78519b);
        String str = this.f78520c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78518a);
        dest.writeString(this.f78519b);
        dest.writeString(this.f78520c);
    }
}
