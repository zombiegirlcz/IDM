package com.google.android.gms.internal.measurement;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzki {

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    public static final /* synthetic */ int f40351zzc = 0;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private static final Object f40352zzd = new Object();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private static volatile zzkg f40353zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private static volatile boolean f40354zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private static final AtomicInteger f40355zzg;

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final zzkf f40356zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final String f40357zzb;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private Object f40358zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private volatile int f40359zzi = -1;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private volatile Object f40360zzj;

    /* JADX INFO: renamed from: zzk, reason: collision with root package name */
    private volatile boolean f40361zzk;

    static {
        new AtomicReference();
        Preconditions.checkNotNull(new Object() { // from class: com.google.android.gms.internal.measurement.zzka
        }, "BuildInfo must be non-null");
        f40355zzg = new AtomicInteger();
    }

    public /* synthetic */ zzki(zzkf zzkfVar, String str, Object obj2, boolean z, zzkh zzkhVar) {
        if (zzkfVar.f40346zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f40356zza = zzkfVar;
        this.f40357zzb = str;
        this.f40358zzh = obj2;
        this.f40361zzk = false;
    }

    public static void zzc() {
        f40355zzg.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzd(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.zzkg r0 = com.google.android.gms.internal.measurement.zzki.f40353zze
            if (r0 != 0) goto L4d
            if (r3 != 0) goto L7
            goto L4d
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.zzki.f40352zzd
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.zzkg r1 = com.google.android.gms.internal.measurement.zzki.f40353zze     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L49
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.measurement.zzkg r1 = com.google.android.gms.internal.measurement.zzki.f40353zze     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r2 = r1.zza()     // Catch: java.lang.Throwable -> L21
            if (r2 == r3) goto L43
            goto L23
        L21:
            r3 = move-exception
            goto L45
        L23:
            if (r1 == 0) goto L2e
            com.google.android.gms.internal.measurement.zzjm.zze()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzkk.zzd()     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzju.zze()     // Catch: java.lang.Throwable -> L21
        L2e:
            com.google.android.gms.internal.measurement.zzjz r1 = new com.google.android.gms.internal.measurement.zzjz     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            com.google.common.base.Supplier r1 = com.google.common.base.Suppliers.memoize(r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzjj r2 = new com.google.android.gms.internal.measurement.zzjj     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.google.android.gms.internal.measurement.zzki.f40353zze = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.zzki.f40355zzg     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L49
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            goto L4b
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            return
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r3
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzki.zzd(android.content.Context):void");
    }

    public abstract Object zza(Object obj2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 com.google.common.base.Optional) = (r2v0 com.google.common.base.Optional), (r2v0 com.google.common.base.Optional), (r2v7 com.google.common.base.Optional) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x008e, B:30:0x0096, B:42:0x00bd, B:45:0x00c5, B:46:0x00c8, B:47:0x00cc, B:34:0x009f, B:36:0x00a3, B:38:0x00b3, B:40:0x00b9, B:26:0x0079, B:48:0x00d0), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x008e, B:30:0x0096, B:42:0x00bd, B:45:0x00c5, B:46:0x00c8, B:47:0x00cc, B:34:0x009f, B:36:0x00a3, B:38:0x00b3, B:40:0x00b9, B:26:0x0079, B:48:0x00d0), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:20:0x0050, B:22:0x005b, B:24:0x0065, B:28:0x008e, B:30:0x0096, B:42:0x00bd, B:45:0x00c5, B:46:0x00c8, B:47:0x00cc, B:34:0x009f, B:36:0x00a3, B:38:0x00b3, B:40:0x00b9, B:26:0x0079, B:48:0x00d0), top: B:54:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb() {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzki.zzb():java.lang.Object");
    }
}
