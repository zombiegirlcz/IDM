package com.revolut.biometric_verification.impl.ui.step.active_liveness.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.biometric_verification.api.models.BiometricVerificationStep;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/active_liveness/flow/BiometricVerificationActiveLivenessStepFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationActiveLivenessStepFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationActiveLivenessStepFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationStep.ActiveLiveness f50495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50497c;
    public final w0 d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BiometricVerificationStep.ActiveLiveness activeLiveness = (BiometricVerificationStep.ActiveLiveness) parcel.readParcelable(BiometricVerificationActiveLivenessStepFlowContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = false;
                z = true;
            } else {
                z = false;
                z3 = false;
            }
            String string = parcel.readString();
            w0 w0Var = ((AnalyticsContext) parcel.readParcelable(BiometricVerificationActiveLivenessStepFlowContract$InputData.class.getClassLoader())).f50296a;
            if (parcel.readInt() != 0) {
                z3 = true;
            }
            return new BiometricVerificationActiveLivenessStepFlowContract$InputData(activeLiveness, z, string, w0Var, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationActiveLivenessStepFlowContract$InputData[i];
        }
    }

    public BiometricVerificationActiveLivenessStepFlowContract$InputData(BiometricVerificationStep.ActiveLiveness step, boolean z, String verificationToken, w0 w0Var, boolean z3) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        this.f50495a = step;
        this.f50496b = z;
        this.f50497c = verificationToken;
        this.d = w0Var;
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
        if (!(obj2 instanceof BiometricVerificationActiveLivenessStepFlowContract$InputData)) {
            return false;
        }
        BiometricVerificationActiveLivenessStepFlowContract$InputData biometricVerificationActiveLivenessStepFlowContract$InputData = (BiometricVerificationActiveLivenessStepFlowContract$InputData) obj2;
        return Intrinsics.f(this.f50495a, biometricVerificationActiveLivenessStepFlowContract$InputData.f50495a) && this.f50496b == biometricVerificationActiveLivenessStepFlowContract$InputData.f50496b && Intrinsics.f(this.f50497c, biometricVerificationActiveLivenessStepFlowContract$InputData.f50497c) && Intrinsics.f(this.d, biometricVerificationActiveLivenessStepFlowContract$InputData.d) && this.e == biometricVerificationActiveLivenessStepFlowContract$InputData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((AnalyticsContext.a(this.d) + p.a.c(j6.a.c(this.f50495a.hashCode() * 31, 31, this.f50496b), 31, this.f50497c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50495a, i);
        dest.writeInt(this.f50496b ? 1 : 0);
        dest.writeString(this.f50497c);
        m.x(this.d, dest, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
