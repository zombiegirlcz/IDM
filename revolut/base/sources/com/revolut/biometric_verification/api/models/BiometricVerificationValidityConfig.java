package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationValidityConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationValidityConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationValidityConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f50413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50414c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationValidityConfig(parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationValidityConfig[i];
        }
    }

    public BiometricVerificationValidityConfig(boolean z, int i, int i2) {
        this.f50412a = z;
        this.f50413b = i;
        this.f50414c = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationValidityConfig)) {
            return false;
        }
        BiometricVerificationValidityConfig biometricVerificationValidityConfig = (BiometricVerificationValidityConfig) obj2;
        return this.f50412a == biometricVerificationValidityConfig.f50412a && this.f50413b == biometricVerificationValidityConfig.f50413b && this.f50414c == biometricVerificationValidityConfig.f50414c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f50414c) + j6.a.b(this.f50413b, Boolean.hashCode(this.f50412a) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f50412a ? 1 : 0);
        dest.writeInt(this.f50413b);
        dest.writeInt(this.f50414c);
    }
}
