package com.revolut.feature.onboarding.impl.onboarding.product_lifecycle;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/product_lifecycle/OnboardingProductLifecycleFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingProductLifecycleFlowContract$Step implements FlowStep {

    @NotNull
    public static final Parcelable.Creator<OnboardingProductLifecycleFlowContract$Step> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f78482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78483b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingProductLifecycleFlowContract$Step((b) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingProductLifecycleFlowContract$Step[i];
        }
    }

    public OnboardingProductLifecycleFlowContract$Step(b countryCode, String str) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f78482a = countryCode;
        this.f78483b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingProductLifecycleFlowContract$Step)) {
            return false;
        }
        OnboardingProductLifecycleFlowContract$Step onboardingProductLifecycleFlowContract$Step = (OnboardingProductLifecycleFlowContract$Step) obj2;
        return Intrinsics.f(this.f78482a, onboardingProductLifecycleFlowContract$Step.f78482a) && Intrinsics.f(this.f78483b, onboardingProductLifecycleFlowContract$Step.f78483b);
    }

    public final int hashCode() {
        int iHashCode = this.f78482a.f297794a.hashCode() * 31;
        String str = this.f78483b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f78482a);
        dest.writeString(this.f78483b);
    }
}
