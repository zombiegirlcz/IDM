package androidx.biometric;

import android.os.CancellationSignal;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
class CancellationSignalProvider {
    private CancellationSignal mBiometricCancellationSignal;
    private androidx.core.os.CancellationSignal mFingerprintCancellationSignal;
    private final Injector mInjector = new Injector() { // from class: androidx.biometric.CancellationSignalProvider.1
        @Override // androidx.biometric.CancellationSignalProvider.Injector
        @NonNull
        public CancellationSignal getBiometricCancellationSignal() {
            return Api16Impl.create();
        }

        @Override // androidx.biometric.CancellationSignalProvider.Injector
        @NonNull
        public androidx.core.os.CancellationSignal getFingerprintCancellationSignal() {
            return new androidx.core.os.CancellationSignal();
        }
    };

    public static class Api16Impl {
        public static void cancel(CancellationSignal cancellationSignal) {
            cancellationSignal.cancel();
        }

        public static CancellationSignal create() {
            return new CancellationSignal();
        }
    }

    public interface Injector {
        @NonNull
        CancellationSignal getBiometricCancellationSignal();

        @NonNull
        androidx.core.os.CancellationSignal getFingerprintCancellationSignal();
    }

    public void cancel() {
        CancellationSignal cancellationSignal = this.mBiometricCancellationSignal;
        if (cancellationSignal != null) {
            try {
                Api16Impl.cancel(cancellationSignal);
            } catch (NullPointerException e) {
            }
            this.mBiometricCancellationSignal = null;
        }
        androidx.core.os.CancellationSignal cancellationSignal2 = this.mFingerprintCancellationSignal;
        if (cancellationSignal2 != null) {
            try {
                cancellationSignal2.cancel();
            } catch (NullPointerException e2) {
            }
            this.mFingerprintCancellationSignal = null;
        }
    }

    @NonNull
    public CancellationSignal getBiometricCancellationSignal() {
        if (this.mBiometricCancellationSignal == null) {
            this.mBiometricCancellationSignal = this.mInjector.getBiometricCancellationSignal();
        }
        return this.mBiometricCancellationSignal;
    }

    @NonNull
    public androidx.core.os.CancellationSignal getFingerprintCancellationSignal() {
        if (this.mFingerprintCancellationSignal == null) {
            this.mFingerprintCancellationSignal = this.mInjector.getFingerprintCancellationSignal();
        }
        return this.mFingerprintCancellationSignal;
    }
}
