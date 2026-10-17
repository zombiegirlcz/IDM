package com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/ui/onboarding_workflow/OnboardingWorkflowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingWorkflowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OnboardingWorkflowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradingOnboardingFeatureConfig f104237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104238b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingWorkflowContract$InputData((TradingOnboardingFeatureConfig) parcel.readParcelable(OnboardingWorkflowContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingWorkflowContract$InputData[i];
        }
    }

    public OnboardingWorkflowContract$InputData(TradingOnboardingFeatureConfig onboardingLaunchingConfig, String workflowId) {
        Intrinsics.checkNotNullParameter(onboardingLaunchingConfig, "onboardingLaunchingConfig");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f104237a = onboardingLaunchingConfig;
        this.f104238b = workflowId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingWorkflowContract$InputData)) {
            return false;
        }
        OnboardingWorkflowContract$InputData onboardingWorkflowContract$InputData = (OnboardingWorkflowContract$InputData) obj2;
        return Intrinsics.f(this.f104237a, onboardingWorkflowContract$InputData.f104237a) && Intrinsics.f(this.f104238b, onboardingWorkflowContract$InputData.f104238b);
    }

    public final int hashCode() {
        return this.f104238b.hashCode() + (this.f104237a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104237a, i);
        dest.writeString(this.f104238b);
    }
}
