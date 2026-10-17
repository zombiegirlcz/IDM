package com.revolut.biometric_verification.impl.ui.step.nfc.intro_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.biometric_verification.impl.ui.step.document.flow.BiometricVerificationDocumentStepFlowContract$Step;
import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$AuthData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/nfc/intro_v2/BiometricVerificationNfcV2ConsolidatedScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationNfcV2ConsolidatedScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationNfcV2ConsolidatedScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiometricVerificationDocumentType f50629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiometricVerificationNfcFlowContract$AuthData f50630c;
    public final BiometricVerificationDocumentStepFlowContract$Step.Camera d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            BiometricVerificationDocumentType biometricVerificationDocumentType;
            BiometricVerificationDocumentStepFlowContract$Step.Camera camera;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            BiometricVerificationDocumentType biometricVerificationDocumentType2 = (BiometricVerificationDocumentType) parcel.readParcelable(BiometricVerificationNfcV2ConsolidatedScreenContract$InputData.class.getClassLoader());
            BiometricVerificationNfcFlowContract$AuthData biometricVerificationNfcFlowContract$AuthData = (BiometricVerificationNfcFlowContract$AuthData) parcel.readParcelable(BiometricVerificationNfcV2ConsolidatedScreenContract$InputData.class.getClassLoader());
            BiometricVerificationDocumentStepFlowContract$Step.Camera cameraCreateFromParcel = BiometricVerificationDocumentStepFlowContract$Step.Camera.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z3 = true;
                biometricVerificationDocumentType = biometricVerificationDocumentType2;
                camera = cameraCreateFromParcel;
            } else {
                biometricVerificationDocumentType = biometricVerificationDocumentType2;
                camera = cameraCreateFromParcel;
                z3 = z;
            }
            return new BiometricVerificationNfcV2ConsolidatedScreenContract$InputData(z4, biometricVerificationDocumentType, biometricVerificationNfcFlowContract$AuthData, camera, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationNfcV2ConsolidatedScreenContract$InputData[i];
        }
    }

    public BiometricVerificationNfcV2ConsolidatedScreenContract$InputData(boolean z, BiometricVerificationDocumentType type, BiometricVerificationNfcFlowContract$AuthData authData, BiometricVerificationDocumentStepFlowContract$Step.Camera cameraStep, boolean z3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(authData, "authData");
        Intrinsics.checkNotNullParameter(cameraStep, "cameraStep");
        this.f50628a = z;
        this.f50629b = type;
        this.f50630c = authData;
        this.d = cameraStep;
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
        if (!(obj2 instanceof BiometricVerificationNfcV2ConsolidatedScreenContract$InputData)) {
            return false;
        }
        BiometricVerificationNfcV2ConsolidatedScreenContract$InputData biometricVerificationNfcV2ConsolidatedScreenContract$InputData = (BiometricVerificationNfcV2ConsolidatedScreenContract$InputData) obj2;
        return this.f50628a == biometricVerificationNfcV2ConsolidatedScreenContract$InputData.f50628a && Intrinsics.f(this.f50629b, biometricVerificationNfcV2ConsolidatedScreenContract$InputData.f50629b) && Intrinsics.f(this.f50630c, biometricVerificationNfcV2ConsolidatedScreenContract$InputData.f50630c) && Intrinsics.f(this.d, biometricVerificationNfcV2ConsolidatedScreenContract$InputData.d) && this.e == biometricVerificationNfcV2ConsolidatedScreenContract$InputData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.f50630c.hashCode() + ((this.f50629b.hashCode() + (Boolean.hashCode(this.f50628a) * 31)) * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f50628a ? 1 : 0);
        dest.writeParcelable(this.f50629b, i);
        dest.writeParcelable(this.f50630c, i);
        this.d.writeToParcel(dest, i);
        dest.writeInt(this.e ? 1 : 0);
    }
}
