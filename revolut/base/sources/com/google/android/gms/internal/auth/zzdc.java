package com.google.android.gms.internal.auth;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzdc {

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final /* synthetic */ int f38970zzd = 0;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static volatile zzda f38971zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static volatile boolean f38972zzf;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzcz f38976zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final String f38977zzc;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private final Object f38978zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private volatile int f38979zzk = -1;

    /* JADX INFO: renamed from: zzl, reason: collision with root package name */
    private volatile Object f38980zzl;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Object f38969zza = new Object();

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final AtomicReference f38973zzg = new AtomicReference();

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private static final zzde f38974zzh = new zzde(zzcu.f38962zza);

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private static final AtomicInteger f38975zzi = new AtomicInteger();

    public /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj2, boolean z, zzdb zzdbVar) {
        if (zzczVar.f38964zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f38976zzb = zzczVar;
        this.f38977zzc = str;
        this.f38978zzj = obj2;
    }

    public static void zzc() {
        f38975zzi.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzd(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.auth.zzda r0 = com.google.android.gms.internal.auth.zzdc.f38971zze
            if (r0 != 0) goto L4b
            if (r3 != 0) goto L7
            goto L4b
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzdc.f38969zza
            monitor-enter(r0)
            com.google.android.gms.internal.auth.zzda r1 = com.google.android.gms.internal.auth.zzdc.f38971zze     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L47
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L45
            com.google.android.gms.internal.auth.zzda r1 = com.google.android.gms.internal.auth.zzdc.f38971zze     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> L21
            if (r1 == r3) goto L41
            goto L23
        L21:
            r3 = move-exception
            goto L43
        L23:
            com.google.android.gms.internal.auth.zzcg.zzd()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzdd.zzc()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzco.zze()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzct r1 = new com.google.android.gms.internal.auth.zzct     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzdj r1 = com.google.android.gms.internal.auth.zzdo.zza(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzcd r2 = new com.google.android.gms.internal.auth.zzcd     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.auth.zzdc.f38971zze = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.auth.zzdc.f38975zzi     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L47
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L45
        L45:
            r3 = move-exception
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r3
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdc.zzd(android.content.Context):void");
    }

    public abstract Object zza(Object obj2);

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[PHI: r2
      0x003e: PHI (r2v1 com.google.android.gms.internal.auth.zzdh) = (r2v0 com.google.android.gms.internal.auth.zzdh), (r2v5 com.google.android.gms.internal.auth.zzdh) binds: [B:8:0x0016, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdc.zzb():java.lang.Object");
    }
}
