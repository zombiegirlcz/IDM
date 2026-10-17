package com.revolut.biometric_verification.impl.ui.step.active_liveness.video_confirmation;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/active_liveness/video_confirmation/BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f50515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f50516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50517c;
    public final AnalyticsContext d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData((Uri) parcel.readParcelable(BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (AnalyticsContext) parcel.readParcelable(BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData[i];
        }
    }

    public BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData(Uri videoUri, Clause digits, boolean z, AnalyticsContext analyticsContext, boolean z3) {
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        Intrinsics.checkNotNullParameter(digits, "digits");
        this.f50515a = videoUri;
        this.f50516b = digits;
        this.f50517c = z;
        this.d = analyticsContext;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData)) {
            return false;
        }
        BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData = (BiometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f50515a, biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.f50515a) && Intrinsics.f(this.f50516b, biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.f50516b) && this.f50517c == biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.f50517c && Intrinsics.f(this.d, biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.d) && this.e == biometricVerificationActiveLivenessVideoConfirmationScreenContract$InputData.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.a(this.f50515a.hashCode() * 31, 31, this.f50516b), 31, this.f50517c);
        AnalyticsContext analyticsContext = this.d;
        return Boolean.hashCode(this.e) + ((iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50515a, i);
        dest.writeParcelable(this.f50516b, i);
        dest.writeInt(this.f50517c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
