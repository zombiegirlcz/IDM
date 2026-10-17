package com.revolut.biometric_verification.api.navigation;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/api/navigation/BiometricVerificationSelfieStepFlowProvider$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationSelfieStepFlowProvider$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationSelfieStepFlowProvider$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationStep.Selfie f50459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu.a f50460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50461c;
    public final w0 d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            w0 w0Var;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BiometricVerificationStep.Selfie selfieCreateFromParcel = BiometricVerificationStep.Selfie.CREATOR.createFromParcel(parcel);
            pu.a aVar = (pu.a) parcel.readSerializable();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            w0 w0Var2 = ((AnalyticsContext) parcel.readParcelable(BiometricVerificationSelfieStepFlowProvider$InputData.class.getClassLoader())).f50296a;
            if (parcel.readInt() != 0) {
                z3 = true;
                w0Var = w0Var2;
            } else {
                w0Var = w0Var2;
                z3 = z;
            }
            return new BiometricVerificationSelfieStepFlowProvider$InputData(selfieCreateFromParcel, aVar, z4, w0Var, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationSelfieStepFlowProvider$InputData[i];
        }
    }

    public BiometricVerificationSelfieStepFlowProvider$InputData(BiometricVerificationStep.Selfie step, pu.a aVar, boolean z, w0 w0Var, boolean z3) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f50459a = step;
        this.f50460b = aVar;
        this.f50461c = z;
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
        if (!(obj2 instanceof BiometricVerificationSelfieStepFlowProvider$InputData)) {
            return false;
        }
        BiometricVerificationSelfieStepFlowProvider$InputData biometricVerificationSelfieStepFlowProvider$InputData = (BiometricVerificationSelfieStepFlowProvider$InputData) obj2;
        return Intrinsics.f(this.f50459a, biometricVerificationSelfieStepFlowProvider$InputData.f50459a) && Intrinsics.f(this.f50460b, biometricVerificationSelfieStepFlowProvider$InputData.f50460b) && this.f50461c == biometricVerificationSelfieStepFlowProvider$InputData.f50461c && Intrinsics.f(this.d, biometricVerificationSelfieStepFlowProvider$InputData.d) && this.e == biometricVerificationSelfieStepFlowProvider$InputData.e;
    }

    public final int hashCode() {
        int iHashCode = this.f50459a.hashCode() * 31;
        pu.a aVar = this.f50460b;
        return Boolean.hashCode(this.e) + ((AnalyticsContext.a(this.d) + j6.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.f50461c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f50459a.writeToParcel(dest, i);
        dest.writeSerializable(this.f50460b);
        dest.writeInt(this.f50461c ? 1 : 0);
        m.x(this.d, dest, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
