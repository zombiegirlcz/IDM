package com.revolut.feature.onboarding.impl.onboarding.biometric;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/biometric/OnboardingBiometricFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OnboardingBiometricFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OnboardingBiometricFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f78388b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet2.add(k.valueOf(parcel.readString()));
                }
                linkedHashSet = linkedHashSet2;
            }
            return new OnboardingBiometricFlowContract$InputData(string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OnboardingBiometricFlowContract$InputData[i];
        }
    }

    public OnboardingBiometricFlowContract$InputData(String str, Set set) {
        this.f78387a = str;
        this.f78388b = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OnboardingBiometricFlowContract$InputData)) {
            return false;
        }
        OnboardingBiometricFlowContract$InputData onboardingBiometricFlowContract$InputData = (OnboardingBiometricFlowContract$InputData) obj2;
        return Intrinsics.f(this.f78387a, onboardingBiometricFlowContract$InputData.f78387a) && Intrinsics.f(this.f78388b, onboardingBiometricFlowContract$InputData.f78388b);
    }

    public final int hashCode() {
        String str = this.f78387a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Set set = this.f78388b;
        return iHashCode + (set != null ? set.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78387a);
        Set set = this.f78388b;
        if (set == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = e.q(dest, 1, set);
        while (itQ.hasNext()) {
            dest.writeString(((k) itQ.next()).name());
        }
    }
}
