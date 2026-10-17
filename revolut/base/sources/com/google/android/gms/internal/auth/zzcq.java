package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static volatile zzdh f38957zza = zzdh.zzc();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Object f38958zzb = new Object();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #1 {all -> 0x0049, blocks: (B:12:0x0033, B:14:0x003b, B:15:0x0047, B:19:0x004b, B:21:0x0057, B:25:0x0067, B:27:0x006d, B:34:0x0088, B:35:0x0092, B:29:0x0077, B:30:0x007b, B:31:0x0081), top: B:43:0x0033 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zza(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "com.google.android.gms.phenotype"
            java.lang.String r6 = r6.getAuthority()
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L1b
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r0 = "PhenotypeClientHelper"
            java.lang.String r5 = r5.concat(r6)
            return r1
        L1b:
            com.google.android.gms.internal.auth.zzdh r6 = com.google.android.gms.internal.auth.zzcq.f38957zza
            boolean r6 = r6.zzb()
            if (r6 == 0) goto L30
            com.google.android.gms.internal.auth.zzdh r5 = com.google.android.gms.internal.auth.zzcq.f38957zza
            java.lang.Object r5 = r5.zza()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L30:
            java.lang.Object r6 = com.google.android.gms.internal.auth.zzcq.f38958zzb
            monitor-enter(r6)
            com.google.android.gms.internal.auth.zzdh r0 = com.google.android.gms.internal.auth.zzcq.f38957zza     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.zzb()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            com.google.android.gms.internal.auth.zzdh r5 = com.google.android.gms.internal.auth.zzcq.f38957zza     // Catch: java.lang.Throwable -> L49
            java.lang.Object r5 = r5.zza()     // Catch: java.lang.Throwable -> L49
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L49
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L49
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L49
            return r5
        L49:
            r5 = move-exception
            goto La0
        L4b:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L49
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L77
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L49
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L49
            r4 = 29
            if (r3 >= r4) goto L65
            r3 = r1
            goto L67
        L65:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L67:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L88
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L49
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L88
        L77:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L49
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: java.lang.Throwable -> L49 android.content.pm.PackageManager.NameNotFoundException -> L88
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L49
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L88
            r1 = 1
        L88:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.auth.zzdh r5 = com.google.android.gms.internal.auth.zzdh.zzd(r5)     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.auth.zzcq.f38957zza = r5     // Catch: java.lang.Throwable -> L49
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L49
            com.google.android.gms.internal.auth.zzdh r5 = com.google.android.gms.internal.auth.zzcq.f38957zza
            java.lang.Object r5 = r5.zza()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        La0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L49
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcq.zza(android.content.Context, android.net.Uri):boolean");
    }
}
