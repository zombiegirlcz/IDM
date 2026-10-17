package com.revolut.feature.passcode.ui.biometric_passcode_verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/passcode/ui/biometric_passcode_verification/BiometricPasscodeVerificationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_passcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricPasscodeVerificationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricPasscodeVerificationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct f78636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PasscodeScreenContract$InputData f78637b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricPasscodeVerificationFlowContract$InputData((AnalyticsProduct) parcel.readParcelable(BiometricPasscodeVerificationFlowContract$InputData.class.getClassLoader()), PasscodeScreenContract$InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricPasscodeVerificationFlowContract$InputData[i];
        }
    }

    public BiometricPasscodeVerificationFlowContract$InputData(AnalyticsProduct analyticsProduct, PasscodeScreenContract$InputData passcodeScreenInputData) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        Intrinsics.checkNotNullParameter(passcodeScreenInputData, "passcodeScreenInputData");
        this.f78636a = analyticsProduct;
        this.f78637b = passcodeScreenInputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricPasscodeVerificationFlowContract$InputData)) {
            return false;
        }
        BiometricPasscodeVerificationFlowContract$InputData biometricPasscodeVerificationFlowContract$InputData = (BiometricPasscodeVerificationFlowContract$InputData) obj2;
        return Intrinsics.f(this.f78636a, biometricPasscodeVerificationFlowContract$InputData.f78636a) && Intrinsics.f(this.f78637b, biometricPasscodeVerificationFlowContract$InputData.f78637b);
    }

    public final int hashCode() {
        return this.f78637b.hashCode() + (this.f78636a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78636a, i);
        this.f78637b.writeToParcel(dest, i);
    }
}
