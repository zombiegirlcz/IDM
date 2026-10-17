package lr;

import com.revolut.biometric_verification.impl.data.service.BiometricVerificationScansService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricVerificationScansService f199337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rlm.o f199338b;

    public c(BiometricVerificationScansService biometricVerificationsScansService, rlm.o json) {
        Intrinsics.checkNotNullParameter(biometricVerificationsScansService, "biometricVerificationsScansService");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f199337a = biometricVerificationsScansService;
        this.f199338b = json;
    }
}
