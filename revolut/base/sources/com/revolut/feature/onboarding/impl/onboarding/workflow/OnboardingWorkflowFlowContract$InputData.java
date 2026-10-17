package com.revolut.feature.onboarding.impl.onboarding.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/workflow/OnboardingWorkflowFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingWorkflowFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OnboardingWorkflowFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f78515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78517c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingWorkflowFlowContract$InputData(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingWorkflowFlowContract$InputData[i];
        }
    }

    public OnboardingWorkflowFlowContract$InputData(String workflowId, String str, b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f78515a = countryCode;
        this.f78516b = workflowId;
        this.f78517c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingWorkflowFlowContract$InputData)) {
            return false;
        }
        OnboardingWorkflowFlowContract$InputData onboardingWorkflowFlowContract$InputData = (OnboardingWorkflowFlowContract$InputData) obj2;
        return Intrinsics.f(this.f78515a, onboardingWorkflowFlowContract$InputData.f78515a) && Intrinsics.f(this.f78516b, onboardingWorkflowFlowContract$InputData.f78516b) && Intrinsics.f(this.f78517c, onboardingWorkflowFlowContract$InputData.f78517c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f78515a.f297794a.hashCode() * 31, 31, this.f78516b);
        String str = this.f78517c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78515a);
        dest.writeString(this.f78516b);
        dest.writeString(this.f78517c);
    }
}
