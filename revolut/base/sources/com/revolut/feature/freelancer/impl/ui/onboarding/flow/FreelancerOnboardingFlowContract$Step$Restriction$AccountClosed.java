package com.revolut.feature.freelancer.impl.ui.onboarding.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/onboarding/flow/FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed", "", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed implements FreelancerOnboardingFlowContract$Step {

    @NotNull
    public static final Parcelable.Creator<FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f73986a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed(d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed[i];
        }
    }

    public FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed(d bannerType) {
        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
        this.f73986a = bannerType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed) && this.f73986a == ((FreelancerOnboardingFlowContract$Step$Restriction$AccountClosed) obj2).f73986a;
    }

    public final int hashCode() {
        return this.f73986a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73986a.name());
    }
}
