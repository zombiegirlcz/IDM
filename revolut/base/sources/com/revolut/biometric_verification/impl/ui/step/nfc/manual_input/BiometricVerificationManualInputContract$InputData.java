package com.revolut.biometric_verification.impl.ui.step.nfc.manual_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/nfc/manual_input/BiometricVerificationManualInputContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationManualInputContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationManualInputContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f50643c;
    public final yt.a d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationManualInputContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), yt.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationManualInputContract$InputData[i];
        }
    }

    public BiometricVerificationManualInputContract$InputData(String documentNumber, String dateOfBirth, String dateOfExpiry, yt.a documentType) {
        Intrinsics.checkNotNullParameter(documentNumber, "documentNumber");
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        Intrinsics.checkNotNullParameter(dateOfExpiry, "dateOfExpiry");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        this.f50641a = documentNumber;
        this.f50642b = dateOfBirth;
        this.f50643c = dateOfExpiry;
        this.d = documentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationManualInputContract$InputData)) {
            return false;
        }
        BiometricVerificationManualInputContract$InputData biometricVerificationManualInputContract$InputData = (BiometricVerificationManualInputContract$InputData) obj2;
        return Intrinsics.f(this.f50641a, biometricVerificationManualInputContract$InputData.f50641a) && Intrinsics.f(this.f50642b, biometricVerificationManualInputContract$InputData.f50642b) && Intrinsics.f(this.f50643c, biometricVerificationManualInputContract$InputData.f50643c) && this.d == biometricVerificationManualInputContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f50641a.hashCode() * 31, 31, this.f50642b), 31, this.f50643c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50641a);
        dest.writeString(this.f50642b);
        dest.writeString(this.f50643c);
        dest.writeString(this.d.name());
    }
}
