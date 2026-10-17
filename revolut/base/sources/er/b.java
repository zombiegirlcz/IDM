package er;

import com.revolut.biometric_verification.api.models.BiometricVerificationFeature;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeatures;
import com.revolut.biometric_verification.api.models.BiometricVerificationImuDataCollectionSettings;
import com.revolut.biometric_verification.api.models.BiometricVerificationValidityConfig;
import com.revolut.biometric_verification.api.models.CheckA;
import com.revolut.biometric_verification.api.models.CheckB;
import com.revolut.biometric_verification.api.models.CheckC;
import com.revolut.biometric_verification.api.models.DeviceFingerprint;
import com.revolut.camerakit.core.settings.WatermarkConfig;
import com.revolut.camerakit.core.settings.WatermarkSettings;
import jr.h1;
import jr.k0;
import jr.k1;
import jr.n1;
import jr.o;
import jr.p;
import jr.q1;
import jr.t1;
import jr.x1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public abstract class b {
    public static final BiometricVerificationFeatures a(p pVar) {
        CheckA checkA;
        CheckB checkB;
        CheckC checkC;
        BiometricVerificationValidityConfig biometricVerificationValidityConfig;
        DeviceFingerprint deviceFingerprint;
        BiometricVerificationFeature biometricVerificationFeature;
        BiometricVerificationImuDataCollectionSettings biometricVerificationImuDataCollectionSettings;
        o oVar;
        t1 t1Var;
        o oVar2;
        q1 q1Var;
        k0 k0Var;
        n1 n1Var;
        k1 k1Var;
        h1 h1Var;
        BiometricVerificationFeatures.Companion companion = BiometricVerificationFeatures.INSTANCE;
        BiometricVerificationFeature biometricVerificationFeature2 = null;
        if (pVar == null || (h1Var = pVar.f177816a) == null) {
            checkA = null;
        } else {
            Intrinsics.checkNotNullParameter(h1Var, "<this>");
            checkA = new CheckA(h1Var.f177790b, h1Var.f177789a);
        }
        if (pVar == null || (k1Var = pVar.f177817b) == null) {
            checkB = null;
        } else {
            Intrinsics.checkNotNullParameter(k1Var, "<this>");
            checkB = new CheckB(k1Var.f177800a, k1Var.f177801b, k1Var.f177802c, k1Var.d);
        }
        if (pVar == null || (n1Var = pVar.f177818c) == null) {
            checkC = null;
        } else {
            Intrinsics.checkNotNullParameter(n1Var, "<this>");
            checkC = new CheckC(n1Var.f177810a, n1Var.f177811b, n1Var.f177812c, n1Var.d, n1Var.e);
        }
        if (pVar == null || (k0Var = pVar.d) == null) {
            biometricVerificationValidityConfig = null;
        } else {
            Intrinsics.checkNotNullParameter(k0Var, "<this>");
            biometricVerificationValidityConfig = new BiometricVerificationValidityConfig(k0Var.f177797a, k0Var.f177798b, k0Var.f177799c);
        }
        if (pVar == null || (q1Var = pVar.e) == null) {
            deviceFingerprint = null;
        } else {
            Intrinsics.checkNotNullParameter(q1Var, "<this>");
            deviceFingerprint = new DeviceFingerprint(q1Var.f177831a, q1Var.f177832b);
        }
        if (pVar == null || (oVar2 = pVar.f) == null) {
            biometricVerificationFeature = null;
        } else {
            Intrinsics.checkNotNullParameter(oVar2, "<this>");
            biometricVerificationFeature = new BiometricVerificationFeature(oVar2.f177813a);
        }
        if (pVar == null || (t1Var = pVar.f177819g) == null) {
            biometricVerificationImuDataCollectionSettings = null;
        } else {
            Intrinsics.checkNotNullParameter(t1Var, "<this>");
            biometricVerificationImuDataCollectionSettings = new BiometricVerificationImuDataCollectionSettings(t1Var.f177845a, t1Var.f177846b);
        }
        WatermarkSettings videoWatermarkSettings = b(pVar != null ? pVar.f177820h : null);
        WatermarkSettings photoWatermarkSettings = b(pVar != null ? pVar.i : null);
        if (pVar != null && (oVar = pVar.f177821j) != null) {
            Intrinsics.checkNotNullParameter(oVar, "<this>");
            biometricVerificationFeature2 = new BiometricVerificationFeature(oVar.f177813a);
        }
        companion.getClass();
        Intrinsics.checkNotNullParameter(videoWatermarkSettings, "videoWatermarkSettings");
        Intrinsics.checkNotNullParameter(photoWatermarkSettings, "photoWatermarkSettings");
        return new BiometricVerificationFeatures(checkA, checkB, checkC, biometricVerificationValidityConfig, deviceFingerprint, biometricVerificationFeature, biometricVerificationImuDataCollectionSettings, videoWatermarkSettings, photoWatermarkSettings, biometricVerificationFeature2);
    }

    public static final WatermarkSettings b(x1 x1Var) {
        WatermarkConfig watermarkConfig;
        if (x1Var == null) {
            return new WatermarkSettings();
        }
        Intrinsics.checkNotNullParameter(x1Var, "<this>");
        boolean z = x1Var.f177866a;
        if (z) {
            watermarkConfig = new WatermarkConfig(x1Var.f177868c, x1Var.f177867b, x1Var.d, x1Var.e);
        } else {
            watermarkConfig = new WatermarkConfig(0);
        }
        return new WatermarkSettings(z, watermarkConfig);
    }
}
