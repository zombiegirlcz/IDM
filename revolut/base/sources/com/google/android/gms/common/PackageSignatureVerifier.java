package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.signatureverification.SignatureVerificationConfigurationProvider;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes16.dex */
@ShowFirstParty
@KeepForSdk
public class PackageSignatureVerifier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static volatile zzac f37678zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static zzad f37679zzb;

    private static synchronized zzad zza(Context context) {
        try {
            if (f37679zzb == null) {
                f37679zzb = new zzad(context);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return f37679zzb;
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context, @NonNull String str) {
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        int i = zzo.f38366zzh;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzo.zzb();
            boolean zZzi = zzo.f38365zzg.zzi();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            if (zZzi) {
                SignatureVerificationConfigurationProvider.zza().zza();
                String strConcat = String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : "-1");
                if (f37678zza != null && f37678zza.zza().equals(strConcat)) {
                    return f37678zza.zzb();
                }
                str.getClass();
                zza(context);
                zzv zzvVar = new zzv(null);
                zzvVar.zza(str);
                zzvVar.zzb(zHonorsDebugCertificates);
                zzvVar.zzc(false);
                zzy zzyVarZzc = zzo.zzc(zzvVar.zzd());
                if (zzyVarZzc.f38393zza) {
                    PackageVerificationResult packageVerificationResultZzd = PackageVerificationResult.zzd(str, zzyVarZzc.f38396zzd, null);
                    f37678zza = new zzac(strConcat, packageVerificationResultZzd);
                    return packageVerificationResultZzd;
                }
                String str2 = zzyVarZzc.f38394zzb;
                Preconditions.checkNotNull(str2);
                return PackageVerificationResult.zza(str, str2, zzyVarZzc.f38395zzc, null);
            }
        } catch (RemoteException e) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        } catch (DynamiteModule.LoadingException e2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        } catch (Throwable th10) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th10;
        }
        throw new zzae();
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context, @NonNull String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzc();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException e) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (packageVerificationResultQueryPackageSignatureVerified2.zzb()) {
            }
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
