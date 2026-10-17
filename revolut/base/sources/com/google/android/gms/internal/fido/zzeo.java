package com.google.android.gms.internal.fido;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzeo extends zzei {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final boolean f39405zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final boolean f39406zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    static final boolean f39407zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final AtomicReference f39408zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static final AtomicLong f39409zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static final ConcurrentLinkedQueue f39410zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private volatile zzdp f39411zzg;

    static {
        String str = Build.FINGERPRINT;
        f39405zza = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        f39406zzb = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        f39407zzc = "eng".equals(str3) || "userdebug".equals(str3);
        f39408zzd = new AtomicReference();
        f39409zze = new AtomicLong();
        f39410zzf = new ConcurrentLinkedQueue();
    }

    private zzeo(String str) {
        super(str);
        if (f39405zza || f39406zzb) {
            this.f39411zzg = new zzej().zza(zza());
        } else if (f39407zzc) {
            this.f39411zzg = zzeu.zzc().zzb(false).zza(zza());
        } else {
            this.f39411zzg = null;
        }
    }

    public static zzdp zzb(String str) {
        AtomicReference atomicReference = f39408zzd;
        if (atomicReference.get() != null) {
            return ((zzek) atomicReference.get()).zza(str);
        }
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                char cCharAt = str.charAt(length);
                if (cCharAt != '$') {
                    if (cCharAt == '.') {
                        break;
                    }
                } else {
                    str = str.replace(CoreConstants.DOLLAR, CoreConstants.DOT);
                    break;
                }
            } else {
                break;
            }
        }
        zzeo zzeoVar = new zzeo(str);
        zzem.f39404zza.offer(zzeoVar);
        if (f39408zzd.get() != null) {
            while (true) {
                zzeo zzeoVar2 = (zzeo) zzem.f39404zza.poll();
                if (zzeoVar2 == null) {
                    break;
                }
                zzeoVar2.f39411zzg = ((zzek) f39408zzd.get()).zza(zzeoVar2.zza());
            }
            if (((zzen) f39410zzf.poll()) != null) {
                f39409zze.getAndDecrement();
                throw null;
            }
        }
        return zzeoVar;
    }
}
