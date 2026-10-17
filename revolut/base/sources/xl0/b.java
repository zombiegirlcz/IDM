package xl0;

import android.os.Handler;
import android.os.Looper;
import androidx.biometric.BiometricPrompt;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import xge.h;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends BiometricPrompt.AuthenticationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wl0.a f306895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wl0.c f306896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f306897c;
    public final Handler d;
    public final Lazy e;
    public volatile boolean f;

    public b(wl0.a biometricCallback, wl0.c biometricHelper, e cryptoObjectExtractor) {
        Intrinsics.checkNotNullParameter(biometricCallback, "biometricCallback");
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(cryptoObjectExtractor, "cryptoObjectExtractor");
        this.f306895a = biometricCallback;
        this.f306896b = biometricHelper;
        this.f306897c = cryptoObjectExtractor;
        this.d = new Handler(Looper.getMainLooper());
        this.e = j.b(new h(this, 2));
        this.f = true;
    }

    public final void a(boolean z) {
        if (!z) {
            this.d.removeCallbacksAndMessages(null);
        }
        this.f = z;
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence errString) {
        Intrinsics.checkNotNullParameter(errString, "errString");
        if (this.f) {
            if (i != 5) {
                if (i != 7) {
                    if (i != 13) {
                        if (i != 9) {
                            if (i != 10) {
                                return;
                            }
                        }
                    }
                }
                this.d.post(new a(this, 2));
                return;
            }
            this.d.post(new a(this, 1));
        }
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationFailed() {
        if (this.f) {
            this.d.post(new a(this, 3));
        }
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.f) {
            Object objA = this.f306897c.a(result);
            if (objA == null) {
                this.d.post(new a(this, 0));
            } else {
                this.d.post(new uk.a(this, objA, 4));
            }
        }
    }
}
