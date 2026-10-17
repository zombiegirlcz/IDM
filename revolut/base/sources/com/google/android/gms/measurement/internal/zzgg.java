package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
public final class zzgg {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Object f46963zza = new Object();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final String f46964zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final zzge f46965zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final Object f46966zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final Object f46967zze = new Object();

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private volatile Object f46968zzf = null;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private volatile Object f46969zzg = null;

    public /* synthetic */ zzgg(String str, Object obj2, Object obj3, zzge zzgeVar, zzgh zzghVar) {
        this.f46964zzb = str;
        this.f46966zzd = obj2;
        this.f46965zzc = zzgeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zza(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f46967zze
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L7
            return r4
        L7:
            com.google.android.gms.measurement.internal.zzaf r4 = com.google.android.gms.measurement.internal.zzgf.f46962zza
            if (r4 != 0) goto Le
            java.lang.Object r4 = r3.f46966zzd
            return r4
        Le:
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzgg.f46963zza
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.zzaf.zza()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.f46969zzg     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.Object r0 = r3.f46966zzd     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            goto L66
        L20:
            java.lang.Object r0 = r3.f46969zzg     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r0
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = com.google.android.gms.measurement.internal.zzgi.zzb()     // Catch: java.lang.SecurityException -> L5a
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L5a
        L2d:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L5a
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L5a
            com.google.android.gms.measurement.internal.zzgg r0 = (com.google.android.gms.measurement.internal.zzgg) r0     // Catch: java.lang.SecurityException -> L5a
            boolean r1 = com.google.android.gms.measurement.internal.zzaf.zza()     // Catch: java.lang.SecurityException -> L5a
            if (r1 != 0) goto L52
            r1 = 0
            com.google.android.gms.measurement.internal.zzge r2 = r0.f46965zzc     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
            if (r2 == 0) goto L48
            java.lang.Object r1 = r2.zza()     // Catch: java.lang.IllegalStateException -> L48 java.lang.SecurityException -> L5a
        L48:
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzgg.f46963zza     // Catch: java.lang.SecurityException -> L5a
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L5a
            r0.f46969zzg = r1     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            goto L2d
        L4f:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4f
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L52:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L5a
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L5a
            throw r4     // Catch: java.lang.SecurityException -> L5a
        L5a:
            com.google.android.gms.measurement.internal.zzge r4 = r3.f46965zzc
            if (r4 != 0) goto L61
        L5e:
            java.lang.Object r4 = r3.f46966zzd
            goto L65
        L61:
            java.lang.Object r4 = r4.zza()     // Catch: java.lang.Throwable -> L5e
        L65:
            return r4
        L66:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L68:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzgg.zza(java.lang.Object):java.lang.Object");
    }

    public final String zzb() {
        return this.f46964zzb;
    }
}
