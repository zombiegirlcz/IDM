package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.camerakit.core.settings.WatermarkSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationFeatures;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BiometricVerificationFeatures implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckA f50391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckB f50392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckC f50393c;
    public final BiometricVerificationValidityConfig d;
    public final DeviceFingerprint e;
    public final BiometricVerificationFeature f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BiometricVerificationImuDataCollectionSettings f50394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WatermarkSettings f50395h;
    public final WatermarkSettings i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BiometricVerificationFeature f50396j;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<BiometricVerificationFeatures> CREATOR = new b();
    public static final BiometricVerificationFeatures k = new BiometricVerificationFeatures(null, null, null, null, null, null, null, new WatermarkSettings(), new WatermarkSettings(), null);

    /* JADX INFO: renamed from: com.revolut.biometric_verification.api.models.BiometricVerificationFeatures$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static BiometricVerificationFeatures a(Companion companion) {
            WatermarkSettings videoWatermarkSettings = new WatermarkSettings();
            WatermarkSettings photoWatermarkSettings = new WatermarkSettings();
            companion.getClass();
            Intrinsics.checkNotNullParameter(videoWatermarkSettings, "videoWatermarkSettings");
            Intrinsics.checkNotNullParameter(photoWatermarkSettings, "photoWatermarkSettings");
            return new BiometricVerificationFeatures(null, null, null, null, null, null, null, videoWatermarkSettings, photoWatermarkSettings, null);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BiometricVerificationFeatures(parcel.readInt() == 0 ? null : CheckA.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CheckB.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CheckC.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BiometricVerificationValidityConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DeviceFingerprint.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BiometricVerificationFeature.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BiometricVerificationImuDataCollectionSettings.CREATOR.createFromParcel(parcel), (WatermarkSettings) parcel.readParcelable(BiometricVerificationFeatures.class.getClassLoader()), (WatermarkSettings) parcel.readParcelable(BiometricVerificationFeatures.class.getClassLoader()), parcel.readInt() != 0 ? BiometricVerificationFeature.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BiometricVerificationFeatures[i];
        }
    }

    public BiometricVerificationFeatures(CheckA checkA, CheckB checkB, CheckC checkC, BiometricVerificationValidityConfig biometricVerificationValidityConfig, DeviceFingerprint deviceFingerprint, BiometricVerificationFeature biometricVerificationFeature, BiometricVerificationImuDataCollectionSettings biometricVerificationImuDataCollectionSettings, WatermarkSettings vvVideo, WatermarkSettings vvPhoto, BiometricVerificationFeature biometricVerificationFeature2) {
        Intrinsics.checkNotNullParameter(vvVideo, "vvVideo");
        Intrinsics.checkNotNullParameter(vvPhoto, "vvPhoto");
        this.f50391a = checkA;
        this.f50392b = checkB;
        this.f50393c = checkC;
        this.d = biometricVerificationValidityConfig;
        this.e = deviceFingerprint;
        this.f = biometricVerificationFeature;
        this.f50394g = biometricVerificationImuDataCollectionSettings;
        this.f50395h = vvVideo;
        this.i = vvPhoto;
        this.f50396j = biometricVerificationFeature2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BiometricVerificationFeatures)) {
            return false;
        }
        BiometricVerificationFeatures biometricVerificationFeatures = (BiometricVerificationFeatures) obj2;
        return Intrinsics.f(this.f50391a, biometricVerificationFeatures.f50391a) && Intrinsics.f(this.f50392b, biometricVerificationFeatures.f50392b) && Intrinsics.f(this.f50393c, biometricVerificationFeatures.f50393c) && Intrinsics.f(this.d, biometricVerificationFeatures.d) && Intrinsics.f(this.e, biometricVerificationFeatures.e) && Intrinsics.f(this.f, biometricVerificationFeatures.f) && Intrinsics.f(this.f50394g, biometricVerificationFeatures.f50394g) && Intrinsics.f(this.f50395h, biometricVerificationFeatures.f50395h) && Intrinsics.f(this.i, biometricVerificationFeatures.i) && Intrinsics.f(this.f50396j, biometricVerificationFeatures.f50396j);
    }

    public final int hashCode() {
        CheckA checkA = this.f50391a;
        int iHashCode = (checkA == null ? 0 : checkA.hashCode()) * 31;
        CheckB checkB = this.f50392b;
        int iHashCode2 = (iHashCode + (checkB == null ? 0 : checkB.hashCode())) * 31;
        CheckC checkC = this.f50393c;
        int iHashCode3 = (iHashCode2 + (checkC == null ? 0 : checkC.hashCode())) * 31;
        BiometricVerificationValidityConfig biometricVerificationValidityConfig = this.d;
        int iHashCode4 = (iHashCode3 + (biometricVerificationValidityConfig == null ? 0 : biometricVerificationValidityConfig.hashCode())) * 31;
        DeviceFingerprint deviceFingerprint = this.e;
        int iHashCode5 = (iHashCode4 + (deviceFingerprint == null ? 0 : deviceFingerprint.hashCode())) * 31;
        BiometricVerificationFeature biometricVerificationFeature = this.f;
        int iHashCode6 = (iHashCode5 + (biometricVerificationFeature == null ? 0 : Boolean.hashCode(biometricVerificationFeature.f50390a))) * 31;
        BiometricVerificationImuDataCollectionSettings biometricVerificationImuDataCollectionSettings = this.f50394g;
        int iHashCode7 = (this.i.hashCode() + ((this.f50395h.hashCode() + ((iHashCode6 + (biometricVerificationImuDataCollectionSettings == null ? 0 : biometricVerificationImuDataCollectionSettings.hashCode())) * 31)) * 31)) * 31;
        BiometricVerificationFeature biometricVerificationFeature2 = this.f50396j;
        return iHashCode7 + (biometricVerificationFeature2 != null ? Boolean.hashCode(biometricVerificationFeature2.f50390a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CheckA checkA = this.f50391a;
        if (checkA == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            checkA.writeToParcel(dest, i);
        }
        CheckB checkB = this.f50392b;
        if (checkB == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            checkB.writeToParcel(dest, i);
        }
        CheckC checkC = this.f50393c;
        if (checkC == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            checkC.writeToParcel(dest, i);
        }
        BiometricVerificationValidityConfig biometricVerificationValidityConfig = this.d;
        if (biometricVerificationValidityConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            biometricVerificationValidityConfig.writeToParcel(dest, i);
        }
        DeviceFingerprint deviceFingerprint = this.e;
        if (deviceFingerprint == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            deviceFingerprint.writeToParcel(dest, i);
        }
        BiometricVerificationFeature biometricVerificationFeature = this.f;
        if (biometricVerificationFeature == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            biometricVerificationFeature.writeToParcel(dest, i);
        }
        BiometricVerificationImuDataCollectionSettings biometricVerificationImuDataCollectionSettings = this.f50394g;
        if (biometricVerificationImuDataCollectionSettings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            biometricVerificationImuDataCollectionSettings.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f50395h, i);
        dest.writeParcelable(this.i, i);
        BiometricVerificationFeature biometricVerificationFeature2 = this.f50396j;
        if (biometricVerificationFeature2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            biometricVerificationFeature2.writeToParcel(dest, i);
        }
    }
}
