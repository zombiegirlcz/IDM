package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
public class PackageVerificationResult {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final String f37680zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final boolean f37681zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final String f37682zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Throwable f37683zzd;

    private PackageVerificationResult(String str, int i, boolean z, String str2, Throwable th10, com.google.android.gms.common.signatureverification.zza zzaVar) {
        this.f37680zza = str;
        this.f37681zzb = z;
        this.f37682zzc = str2;
        this.f37683zzd = th10;
    }

    public static PackageVerificationResult zza(String str, @NonNull String str2, Throwable th10, com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, 1, false, str2, th10, null);
    }

    public static PackageVerificationResult zzd(String str, int i, com.google.android.gms.common.signatureverification.zza zzaVar) {
        return new PackageVerificationResult(str, i, true, null, null, null);
    }

    public final boolean zzb() {
        return this.f37681zzb;
    }

    public final void zzc() {
        if (this.f37681zzb) {
            return;
        }
        String str = this.f37682zzc;
        Throwable th10 = this.f37683zzd;
        String strConcat = "PackageVerificationRslt: ".concat(String.valueOf(str));
        if (th10 == null) {
            throw new SecurityException(strConcat);
        }
        throw new SecurityException(strConcat, th10);
    }
}
