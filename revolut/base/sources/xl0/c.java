package xl0;

import androidx.biometric.BiometricPrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f306898a = new c();

    private c() {
    }

    @Override // xl0.e
    public final Object a(BiometricPrompt.AuthenticationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        BiometricPrompt.CryptoObject cryptoObject = result.getCryptoObject();
        if (cryptoObject != null) {
            return cryptoObject.getCipher();
        }
        return null;
    }
}
