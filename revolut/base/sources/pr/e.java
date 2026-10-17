package pr;

import com.revolut.biometric_verification.impl.data.service.BiometricVerificationService;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes17.dex */
public abstract class e implements e4m.e {
    public static BiometricVerificationService a(ek.a converterFactory, OkHttpClient okHttpClient, ik0.b factory, mq.a visionConfiguration) {
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(visionConfiguration, "visionConfiguration");
        Object objCreate = ik0.b.a(factory, okHttpClient, a0.d.r(visionConfiguration.getHostUrl(), "/"), converterFactory, null, 24).create(BiometricVerificationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BiometricVerificationService biometricVerificationService = (BiometricVerificationService) objCreate;
        vc.s.k(biometricVerificationService);
        return biometricVerificationService;
    }
}
