package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzm f38359zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final zzm f38360zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    static final zzm f38361zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    static final zzm f38362zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    static final zzm f38363zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    static final zzm f38364zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    static volatile com.google.android.gms.common.internal.zzad f38365zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    public static final /* synthetic */ int f38366zzh = 0;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final Object f38367zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private static Context f38368zzj;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        f38359zza = new zzd("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±".getBytes(charset));
        f38360zzb = new zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<".getBytes(charset));
        f38361zzc = new zzf("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí".getBytes(charset));
        f38362zzd = new zzg("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì".getBytes(charset));
        f38363zze = new zzh("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0".getBytes(charset));
        f38364zzf = new zzi("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0".getBytes(charset));
        f38367zzi = new Object();
    }

    public static synchronized void zza(Context context) {
        if (f38368zzj == null) {
            if (context != null) {
                f38368zzj = context.getApplicationContext();
            }
        }
    }

    public static void zzb() throws DynamiteModule.LoadingException {
        if (f38365zzg != null) {
            return;
        }
        Preconditions.checkNotNull(f38368zzj);
        synchronized (f38367zzi) {
            try {
                if (f38365zzg == null) {
                    f38365zzg = com.google.android.gms.common.internal.zzac.zzb(DynamiteModule.load(f38368zzj, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static zzy zzc(zzw zzwVar) {
        zzy zzyVarZzd;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(f38368zzj);
            try {
                zzb();
                Preconditions.checkNotNull(f38368zzj);
                zzp zzpVarZzb = zzwVar.zzb(f38368zzj);
                try {
                    zzr zzrVarZzf = zzwVar.zza() ? f38365zzg.zzf(zzpVarZzb) : f38365zzg.zzh(zzpVarZzb);
                    if (zzrVarZzf.zza()) {
                        zzyVarZzd = zzy.zzf(zzrVarZzf.zze(), zzrVarZzf.zzc());
                    } else {
                        String strZzb = zzrVarZzf.zzb();
                        PackageManager.NameNotFoundException nameNotFoundException = zzrVarZzf.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZzb == null) {
                            strZzb = "error checking package certificate";
                        }
                        zzyVarZzd = zzy.zzg(zzrVarZzf.zze(), zzrVarZzf.zzd(), strZzb, nameNotFoundException);
                    }
                } catch (RemoteException e) {
                    zzyVarZzd = zzy.zzd("module call", e);
                }
            } catch (DynamiteModule.LoadingException e2) {
                zzyVarZzd = zzy.zzd("module init: ".concat(String.valueOf(e2.getMessage())), e2);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zzyVarZzd;
        } catch (Throwable th10) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th10;
        }
    }

    @Deprecated
    public static zzy zzd(String str, zzj zzjVar, boolean z, boolean z3) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzf(str, zzjVar, z, z3);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static /* synthetic */ String zze(boolean z, String str, zzj zzjVar) {
        String str2 = (z || !zzf(str, zzjVar, true, false).f38393zza) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestZza = AndroidUtilsLight.zza("SHA-256");
        Preconditions.checkNotNull(messageDigestZza);
        StringBuilder sbT = a.t(str2, ": pkg=", str, ", sha256=", Hex.bytesToStringLowercase(messageDigestZza.digest(zzjVar.zzc())));
        sbT.append(", atk=");
        sbT.append(z);
        sbT.append(", ver=12451000.false");
        return sbT.toString();
    }

    @Deprecated
    private static zzy zzf(final String str, final zzj zzjVar, final boolean z, boolean z3) {
        try {
            zzb();
            Preconditions.checkNotNull(f38368zzj);
            try {
                return f38365zzg.zze(new zzt(str, zzjVar, z, z3), ObjectWrapper.wrap(f38368zzj.getPackageManager())) ? zzy.zzb() : new zzx(new Callable() { // from class: com.google.android.gms.common.zzl
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return zzo.zze(z, str, zzjVar);
                    }
                }, null);
            } catch (RemoteException e) {
                return zzy.zzd("module call", e);
            }
        } catch (DynamiteModule.LoadingException e2) {
            return zzy.zzd("module init: ".concat(String.valueOf(e2.getMessage())), e2);
        }
    }
}
