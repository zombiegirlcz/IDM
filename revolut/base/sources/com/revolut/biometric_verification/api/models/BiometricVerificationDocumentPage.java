package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nq.b;
import nq.c;
import nq.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentPage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "nq/b", "nq/c", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationDocumentPage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationDocumentPage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CameraCaptureSettings f50379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f50380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f50381c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationDocumentPage((CameraCaptureSettings) parcel.readParcelable(BiometricVerificationDocumentPage.class.getClassLoader()), b.valueOf(parcel.readString()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationDocumentPage[i];
        }
    }

    public BiometricVerificationDocumentPage(CameraCaptureSettings cameraCaptureSettings, b identifier, c scanMode) {
        Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(scanMode, "scanMode");
        this.f50379a = cameraCaptureSettings;
        this.f50380b = identifier;
        this.f50381c = scanMode;
    }

    public final String a() {
        String str;
        String str2;
        int i = d.f218284a[this.f50380b.ordinal()];
        if (i == 1) {
            str = "FRONT";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "BACK";
        }
        int i2 = d.f218285b[this.f50381c.ordinal()];
        if (i2 == 1) {
            str2 = "_TILT";
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "";
        }
        return str.concat(str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationDocumentPage)) {
            return false;
        }
        BiometricVerificationDocumentPage biometricVerificationDocumentPage = (BiometricVerificationDocumentPage) obj2;
        return Intrinsics.f(this.f50379a, biometricVerificationDocumentPage.f50379a) && this.f50380b == biometricVerificationDocumentPage.f50380b && this.f50381c == biometricVerificationDocumentPage.f50381c;
    }

    public final int hashCode() {
        return this.f50381c.hashCode() + ((this.f50380b.hashCode() + (this.f50379a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f50379a, i);
        dest.writeString(this.f50380b.name());
        dest.writeString(this.f50381c.name());
    }
}
