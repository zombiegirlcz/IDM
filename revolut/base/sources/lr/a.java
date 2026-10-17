package lr;

import com.revolut.biometric_verification.impl.data.db.BiometricVerificationDatabase;
import com.revolut.biometric_verification.impl.data.service.BiometricVerificationService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationDatabase f199335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiometricVerificationService f199336b;

    public a(BiometricVerificationDatabase db8, BiometricVerificationService biometricVerificationService) {
        Intrinsics.checkNotNullParameter(db8, "db");
        Intrinsics.checkNotNullParameter(biometricVerificationService, "biometricVerificationService");
        this.f199335a = db8;
        this.f199336b = biometricVerificationService;
    }
}
