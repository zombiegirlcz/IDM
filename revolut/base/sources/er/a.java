package er;

import com.revolut.biometric_verification.api.models.BiometricVerificationFeature;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.api.models.BiometricVerificationImuDataCollectionSettings;
import com.revolut.camerakit.core.settings.VideoImuDataCollectionSettings;
import kotlin.jvm.internal.Intrinsics;
import yw.n;

/* JADX INFO: loaded from: classes17.dex */
public abstract class a {
    public static final e a(BiometricVerificationFeatures biometricVerificationFeatures) {
        VideoImuDataCollectionSettings videoImuDataCollectionSettings;
        Intrinsics.checkNotNullParameter(biometricVerificationFeatures, "<this>");
        BiometricVerificationFeature biometricVerificationFeature = biometricVerificationFeatures.f;
        n nVar = (biometricVerificationFeature == null || !biometricVerificationFeature.f50390a) ? n.FILE : n.IN_MEMORY;
        BiometricVerificationImuDataCollectionSettings biometricVerificationImuDataCollectionSettings = biometricVerificationFeatures.f50394g;
        if (biometricVerificationImuDataCollectionSettings == null || !biometricVerificationImuDataCollectionSettings.f50397a) {
            VideoImuDataCollectionSettings.INSTANCE.getClass();
            videoImuDataCollectionSettings = VideoImuDataCollectionSettings.f50742c;
        } else {
            videoImuDataCollectionSettings = new VideoImuDataCollectionSettings(true, biometricVerificationImuDataCollectionSettings.f50398b);
        }
        return new e(nVar, videoImuDataCollectionSettings, biometricVerificationFeatures.f50395h, biometricVerificationFeatures.i);
    }
}
