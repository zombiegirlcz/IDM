package com.revolut.biometric_verification.impl.ui.step.document.flow;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationDocumentStepFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationDocumentStepFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationStep.Document f50542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f50543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f50544c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationDocumentStepFlowContract$InputData((BiometricVerificationStep.Document) parcel.readParcelable(BiometricVerificationDocumentStepFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0, ((AnalyticsContext) parcel.readParcelable(BiometricVerificationDocumentStepFlowContract$InputData.class.getClassLoader())).f50296a, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationDocumentStepFlowContract$InputData[i];
        }
    }

    public BiometricVerificationDocumentStepFlowContract$InputData(BiometricVerificationStep.Document step, boolean z, w0 w0Var, boolean z3) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f50542a = step;
        this.f50543b = z;
        this.f50544c = w0Var;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationDocumentStepFlowContract$InputData)) {
            return false;
        }
        BiometricVerificationDocumentStepFlowContract$InputData biometricVerificationDocumentStepFlowContract$InputData = (BiometricVerificationDocumentStepFlowContract$InputData) obj2;
        return Intrinsics.f(this.f50542a, biometricVerificationDocumentStepFlowContract$InputData.f50542a) && this.f50543b == biometricVerificationDocumentStepFlowContract$InputData.f50543b && Intrinsics.f(this.f50544c, biometricVerificationDocumentStepFlowContract$InputData.f50544c) && this.d == biometricVerificationDocumentStepFlowContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((AnalyticsContext.a(this.f50544c) + j6.a.c(this.f50542a.hashCode() * 31, 31, this.f50543b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50542a, i);
        dest.writeInt(this.f50543b ? 1 : 0);
        m.x(this.f50544c, dest, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
