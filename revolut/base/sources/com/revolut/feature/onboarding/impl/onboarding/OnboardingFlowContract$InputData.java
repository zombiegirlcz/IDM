package com.revolut.feature.onboarding.impl.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OnboardingFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Address f78309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78311c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnboardingFlowContract$InputData((Address) parcel.readParcelable(OnboardingFlowContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingFlowContract$InputData[i];
        }
    }

    public OnboardingFlowContract$InputData(Address address, String fullPhoneNumber, String str, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(fullPhoneNumber, "fullPhoneNumber");
        this.f78309a = address;
        this.f78310b = fullPhoneNumber;
        this.f78311c = str;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingFlowContract$InputData)) {
            return false;
        }
        OnboardingFlowContract$InputData onboardingFlowContract$InputData = (OnboardingFlowContract$InputData) obj2;
        return Intrinsics.f(this.f78309a, onboardingFlowContract$InputData.f78309a) && Intrinsics.f(this.f78310b, onboardingFlowContract$InputData.f78310b) && Intrinsics.f(this.f78311c, onboardingFlowContract$InputData.f78311c) && this.d == onboardingFlowContract$InputData.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f78309a.hashCode() * 31, 31, this.f78310b);
        String str = this.f78311c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78309a, i);
        dest.writeString(this.f78310b);
        dest.writeString(this.f78311c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
