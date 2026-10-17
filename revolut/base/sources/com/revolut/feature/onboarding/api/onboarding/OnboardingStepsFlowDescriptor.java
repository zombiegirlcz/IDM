package com.revolut.feature.onboarding.api.onboarding;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/onboarding/api/onboarding/OnboardingStepsFlowDescriptor;", "Laii/e;", "Lq89/d;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingStepsFlowDescriptor implements e, Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingStepsFlowDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f78189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78191c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingStepsFlowDescriptor((Address) parcel.readParcelable(OnboardingStepsFlowDescriptor.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingStepsFlowDescriptor[i];
        }
    }

    public OnboardingStepsFlowDescriptor(Address address, String fullPhoneNumber, String str, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(fullPhoneNumber, "fullPhoneNumber");
        this.f78189a = address;
        this.f78190b = fullPhoneNumber;
        this.f78191c = z;
        this.d = str;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Address getF78189a() {
        return this.f78189a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF78190b() {
        return this.f78190b;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getF78191c() {
        return this.f78191c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingStepsFlowDescriptor)) {
            return false;
        }
        OnboardingStepsFlowDescriptor onboardingStepsFlowDescriptor = (OnboardingStepsFlowDescriptor) obj2;
        return Intrinsics.f(this.f78189a, onboardingStepsFlowDescriptor.f78189a) && Intrinsics.f(this.f78190b, onboardingStepsFlowDescriptor.f78190b) && this.f78191c == onboardingStepsFlowDescriptor.f78191c && Intrinsics.f(this.d, onboardingStepsFlowDescriptor.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.c(this.f78189a.hashCode() * 31, 31, this.f78190b), 31, this.f78191c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78189a, i);
        dest.writeString(this.f78190b);
        dest.writeInt(this.f78191c ? 1 : 0);
        dest.writeString(this.d);
    }
}
