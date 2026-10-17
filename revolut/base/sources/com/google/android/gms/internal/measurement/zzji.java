package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes16.dex */
public final class zzji {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static UserManager f40317zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static volatile boolean f40318zzb = !zzc();

    private zzji() {
    }

    public static boolean zza(Context context) {
        return zzc() && !zzd(context);
    }

    public static boolean zzb(Context context) {
        return !zzc() || zzd(context);
    }

    public static boolean zzc() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean zzd(android.content.Context r7) {
        /*
            boolean r0 = com.google.android.gms.internal.measurement.zzji.f40318zzb
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<com.google.android.gms.internal.measurement.zzji> r0 = com.google.android.gms.internal.measurement.zzji.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.measurement.zzji.f40318zzb     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L52
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L48
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.zzji.f40317zza     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.zzji.f40317zza = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.zzji.f40317zza     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L2b
            r5 = r1
            goto L4c
        L2b:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r6 != 0) goto L3b
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r7 != 0) goto L48
        L3b:
            r5 = r1
            goto L48
        L3d:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            com.google.android.gms.internal.measurement.zzji.f40317zza = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L48:
            if (r5 == 0) goto L4c
            com.google.android.gms.internal.measurement.zzji.f40317zza = r4     // Catch: java.lang.Throwable -> Lf
        L4c:
            if (r5 == 0) goto L50
            com.google.android.gms.internal.measurement.zzji.f40318zzb = r1     // Catch: java.lang.Throwable -> Lf
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzji.zzd(android.content.Context):boolean");
    }
}
