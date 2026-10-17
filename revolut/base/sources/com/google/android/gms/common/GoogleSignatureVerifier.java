package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
public class GoogleSignatureVerifier {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static GoogleSignatureVerifier f37673zza;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static volatile HashSet f37674zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static volatile HashSet f37675zze;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Context f37676zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private volatile String f37677zzc;

    public GoogleSignatureVerifier(@NonNull Context context) {
        this.f37676zzb = context.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (f37673zza == null) {
                    zzo.zza(context);
                    f37673zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return f37673zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean zza(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r11 == 0) goto L28
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L21
        L1f:
            r11 = r0
            goto L28
        L21:
            int r11 = r11.flags
            r11 = r11 & 129(0x81, float:1.81E-43)
            if (r11 == 0) goto L1f
            r11 = r1
        L28:
            if (r11 == 0) goto L2d
            com.google.android.gms.internal.common.zzah r2 = com.google.android.gms.common.zzn.f38358zzc     // Catch: java.lang.IllegalArgumentException -> La2
            goto L2f
        L2d:
            com.google.android.gms.internal.common.zzah r2 = com.google.android.gms.common.zzn.f38357zzb     // Catch: java.lang.IllegalArgumentException -> La2
        L2f:
            com.google.android.gms.internal.common.zzr.zza(r1)     // Catch: java.lang.IllegalArgumentException -> La2
            android.content.pm.SigningInfo r3 = r10.signingInfo     // Catch: java.lang.IllegalArgumentException -> La2
            if (r3 == 0) goto L63
            boolean r4 = r3.hasMultipleSigners()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L63
            android.content.pm.Signature[] r4 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L43
            goto L63
        L43:
            int r4 = com.google.android.gms.internal.common.zzah.f39235zzd     // Catch: java.lang.IllegalArgumentException -> La2
            com.google.android.gms.internal.common.zzad r4 = new com.google.android.gms.internal.common.zzad     // Catch: java.lang.IllegalArgumentException -> La2
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> La2
            android.content.pm.Signature[] r3 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La2
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> La2
            r6 = r0
        L50:
            if (r6 >= r5) goto L5e
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La2
            r4.zzb(r7)     // Catch: java.lang.IllegalArgumentException -> La2
            int r6 = r6 + 1
            goto L50
        L5e:
            com.google.android.gms.internal.common.zzah r3 = r4.zzd()     // Catch: java.lang.IllegalArgumentException -> La2
            goto L67
        L63:
            com.google.android.gms.internal.common.zzah r3 = com.google.android.gms.internal.common.zzah.zzj()     // Catch: java.lang.IllegalArgumentException -> La2
        L67:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L9a
            com.google.android.gms.internal.common.zzah r3 = r3.zzh()     // Catch: java.lang.IllegalArgumentException -> La2
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> La2
            r5 = r0
        L76:
            if (r5 >= r4) goto L99
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> La2
            com.google.android.gms.internal.common.zzal r7 = r2.listIterator(r0)     // Catch: java.lang.IllegalArgumentException -> La2
        L82:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> La2
            int r9 = r5 + 1
            if (r8 == 0) goto L97
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> La2
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> La2
            if (r8 == 0) goto L82
            return r1
        L97:
            r5 = r9
            goto L76
        L99:
            return r0
        L9a:
            java.lang.String r2 = "Unable to obtain package certificate history."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La2
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> La2
            throw r3     // Catch: java.lang.IllegalArgumentException -> La2
        La2:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            if (r11 == 0) goto Lb1
            com.google.android.gms.common.zzj[] r11 = com.google.android.gms.common.zzn.f38356zza
            com.google.android.gms.common.zzj r10 = zzc(r10, r11)
            goto Lbd
        Lb1:
            com.google.android.gms.common.zzj[] r11 = com.google.android.gms.common.zzn.f38356zza
            r11 = r11[r0]
            com.google.android.gms.common.zzj[] r11 = new com.google.android.gms.common.zzj[]{r11}
            com.google.android.gms.common.zzj r10 = zzc(r10, r11)
        Lbd:
            if (r10 == 0) goto Lc0
            return r1
        Lc0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.zza(android.content.pm.PackageInfo, boolean):boolean");
    }

    private final zzy zzb(String str, boolean z, boolean z3) {
        zzy zzyVarZzc;
        ApplicationInfo applicationInfo;
        boolean zZzg;
        if (str == null) {
            return zzy.zzc("null pkg");
        }
        if (str.equals(this.f37677zzc)) {
            return zzy.zzb();
        }
        int i = zzo.f38366zzh;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            zzo.zzb();
            zZzg = zzo.f38365zzg.zzg();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        } catch (RemoteException e) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        } catch (DynamiteModule.LoadingException e2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        } catch (Throwable th10) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th10;
        }
        if (zZzg) {
            zzv zzvVar = new zzv(null);
            zzvVar.zza(str);
            zzvVar.zzb(GooglePlayServicesUtilLight.honorsDebugCertificates(this.f37676zzb));
            zzvVar.zzc(true);
            zzyVarZzc = zzo.zzc(zzvVar.zzd());
        } else {
            try {
                PackageInfo packageInfo = this.f37676zzb.getPackageManager().getPackageInfo(str, 134217792);
                boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.f37676zzb);
                if (packageInfo == null) {
                    zzyVarZzc = zzy.zzc("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        zzyVarZzc = zzy.zzc("single cert required");
                    } else {
                        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        zzy zzyVarZzd = zzo.zzd(str2, zzkVar, zHonorsDebugCertificates, false);
                        zzyVarZzc = (!zzyVarZzd.f38393zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !zzo.zzd(str2, zzkVar, false, true).f38393zza) ? zzyVarZzd : zzy.zzc("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e4) {
                return zzy.zzd("no pkg ".concat(str), e4);
            }
        }
        if (zzyVarZzc.f38393zza) {
            this.f37677zzc = str;
        }
        return zzyVarZzc;
    }

    private static zzj zzc(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < zzjVarArr.length; i++) {
                if (zzjVarArr[i].equals(zzkVar)) {
                    return zzjVarArr[i];
                }
            }
            return null;
        }
        return null;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        return zza(packageInfo, true) && GooglePlayServicesUtilLight.honorsDebugCertificates(this.f37676zzb);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
        zzy zzyVarZzb = zzb(str, false, false);
        zzyVarZzb.zze();
        return zzyVarZzb.f38393zza;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isUidGoogleSigned(int i) {
        zzy zzyVarZzc;
        int length;
        String[] packagesForUid = this.f37676zzb.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzyVarZzc = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    Preconditions.checkNotNull(zzyVarZzc);
                    break;
                }
                zzyVarZzc = zzb(packagesForUid[i2], false, false);
                if (zzyVarZzc.f38393zza) {
                    break;
                }
                i2++;
            }
        } else {
            zzyVarZzc = zzy.zzc("no pkgs");
        }
        zzyVarZzc.zze();
        return zzyVarZzc.f38393zza;
    }
}
