package com.revolut.biometric_verification.impl.ui.step.active_liveness.digits_selfie_intro;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/active_liveness/digits_selfie_intro/BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f50494b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData(parcel.readInt() != 0, (AnalyticsContext) parcel.readParcelable(BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData[i];
        }
    }

    public BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData(boolean z, AnalyticsContext analyticsContext) {
        this.f50493a = z;
        this.f50494b = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData)) {
            return false;
        }
        BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData biometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData = (BiometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData) obj2;
        return this.f50493a == biometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData.f50493a && Intrinsics.f(this.f50494b, biometricVerificationActiveLivenessDigitsSelfieIntroScreenContract$InputData.f50494b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f50493a) * 31;
        AnalyticsContext analyticsContext = this.f50494b;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f50493a ? 1 : 0);
        dest.writeParcelable(this.f50494b, i);
    }
}
