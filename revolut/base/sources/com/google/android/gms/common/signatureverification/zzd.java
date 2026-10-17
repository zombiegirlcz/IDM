package com.google.android.gms.common.signatureverification;

/* JADX INFO: loaded from: classes16.dex */
public final class zzd {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static SignatureVerificationConfiguration f38264zza;

    public static synchronized void zza(SignatureVerificationConfiguration signatureVerificationConfiguration) {
        if (f38264zza != null) {
            throw new IllegalStateException("Redundantly setting SignatureVerificationConfiguration");
        }
        f38264zza = signatureVerificationConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized SignatureVerificationConfiguration zzc() {
        try {
            if (f38264zza == null) {
                zza(new zzb());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f38264zza;
    }
}
