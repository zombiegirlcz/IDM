package xl0;

import androidx.biometric.BiometricPrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f306899a = new d();

    private d() {
    }

    @Override // xl0.e
    public final Object a(BiometricPrompt.AuthenticationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        BiometricPrompt.CryptoObject cryptoObject = result.getCryptoObject();
        if (cryptoObject != null) {
            return cryptoObject.getSignature();
        }
        return null;
    }
}
