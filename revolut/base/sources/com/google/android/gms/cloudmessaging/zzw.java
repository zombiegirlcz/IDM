package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes.dex */
public final class zzw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Context f37630zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private int f37631zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f37632zzc = 0;

    public zzw(Context context) {
        this.f37630zza = context;
    }

    public final synchronized int zza() {
        PackageInfo packageInfo;
        if (this.f37631zzb == 0) {
            try {
                packageInfo = Wrappers.packageManager(this.f37630zza).getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f37631zzb = packageInfo.versionCode;
            }
        }
        return this.f37631zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[Catch: all -> 0x0024, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:14:0x0026, B:16:0x002d, B:18:0x003f, B:26:0x0060, B:21:0x0046, B:23:0x0059, B:29:0x0064, B:33:0x0071), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int zzb() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f37632zzc     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            android.content.Context r0 = r5.f37630zza     // Catch: java.lang.Throwable -> L24
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            int r0 = r0.checkPermission(r2, r3)     // Catch: java.lang.Throwable -> L24
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L26
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            monitor-exit(r5)
            return r3
        L24:
            r0 = move-exception
            goto L75
        L26:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L24
            r2 = 1
            if (r0 != 0) goto L46
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L24
            java.util.List r0 = r1.queryIntentServices(r0, r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L46
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L46
            goto L60
        L46:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L24
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)     // Catch: java.lang.Throwable -> L24
            r1 = 2
            if (r0 == 0) goto L64
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r0 != 0) goto L64
            r2 = r1
        L60:
            r5.f37632zzc = r2     // Catch: java.lang.Throwable -> L24
            monitor-exit(r5)
            return r2
        L64:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastO()     // Catch: java.lang.Throwable -> L24
            if (r2 == r0) goto L70
            goto L71
        L70:
            r2 = r1
        L71:
            r5.f37632zzc = r2     // Catch: java.lang.Throwable -> L24
            monitor-exit(r5)
            return r2
        L75:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cloudmessaging.zzw.zzb():int");
    }
}
