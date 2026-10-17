package com.revolut.biometric_verification.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.biometric_verification.api.navigation.BiometricVerificationFlowProvider$LoadingType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nq.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/biometric_verification/api/navigation/BiometricVerificationFlowProvider$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationFlowProvider$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationFlowProvider$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f50454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pu.a f50455c;
    public final boolean d;
    public final BiometricVerificationFlowProvider$LoadingType e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f50456g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            BiometricVerificationFlowProvider$LoadingType biometricVerificationFlowProvider$LoadingType;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            x xVarValueOf = x.valueOf(parcel.readString());
            pu.a aVar = (pu.a) parcel.readSerializable();
            boolean z6 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            BiometricVerificationFlowProvider$LoadingType biometricVerificationFlowProvider$LoadingType2 = (BiometricVerificationFlowProvider$LoadingType) parcel.readParcelable(BiometricVerificationFlowProvider$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = true;
                biometricVerificationFlowProvider$LoadingType = biometricVerificationFlowProvider$LoadingType2;
                z4 = true;
            } else {
                z3 = true;
                biometricVerificationFlowProvider$LoadingType = biometricVerificationFlowProvider$LoadingType2;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new BiometricVerificationFlowProvider$InputData(string, xVarValueOf, aVar, z6, biometricVerificationFlowProvider$LoadingType, z4, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationFlowProvider$InputData[i];
        }
    }

    public BiometricVerificationFlowProvider$InputData(String verificationToken, x source, pu.a aVar, boolean z, BiometricVerificationFlowProvider$LoadingType loadingType, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(verificationToken, "verificationToken");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(loadingType, "loadingType");
        this.f50453a = verificationToken;
        this.f50454b = source;
        this.f50455c = aVar;
        this.d = z;
        this.e = loadingType;
        this.f = z3;
        this.f50456g = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationFlowProvider$InputData)) {
            return false;
        }
        BiometricVerificationFlowProvider$InputData biometricVerificationFlowProvider$InputData = (BiometricVerificationFlowProvider$InputData) obj2;
        return Intrinsics.f(this.f50453a, biometricVerificationFlowProvider$InputData.f50453a) && this.f50454b == biometricVerificationFlowProvider$InputData.f50454b && Intrinsics.f(this.f50455c, biometricVerificationFlowProvider$InputData.f50455c) && this.d == biometricVerificationFlowProvider$InputData.d && Intrinsics.f(this.e, biometricVerificationFlowProvider$InputData.e) && this.f == biometricVerificationFlowProvider$InputData.f && this.f50456g == biometricVerificationFlowProvider$InputData.f50456g;
    }

    public final int hashCode() {
        int iHashCode = (this.f50454b.hashCode() + (this.f50453a.hashCode() * 31)) * 31;
        pu.a aVar = this.f50455c;
        return Boolean.hashCode(this.f50456g) + j6.a.c((this.e.hashCode() + j6.a.c((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.d)) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f50453a);
        dest.writeString(this.f50454b.name());
        dest.writeSerializable(this.f50455c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f50456g ? 1 : 0);
    }

    public /* synthetic */ BiometricVerificationFlowProvider$InputData(String str, x xVar, pu.a aVar, BiometricVerificationFlowProvider$LoadingType biometricVerificationFlowProvider$LoadingType, boolean z, int i) {
        this(str, xVar, (i & 4) != 0 ? null : aVar, (i & 8) != 0, (i & 16) != 0 ? BiometricVerificationFlowProvider$LoadingType.Loading.f50457a : biometricVerificationFlowProvider$LoadingType, false, (i & 64) != 0 ? true : z);
    }
}
