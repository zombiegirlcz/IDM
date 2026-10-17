package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes16.dex */
final class zzlv implements Application.ActivityLifecycleCallbacks, zzlt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzlw f47394zza;

    public zzlv(zzlw zzlwVar) {
        this.f47394zza = zzlwVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) throws Throwable {
        zza(com.google.android.gms.internal.measurement.zzdj.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzb(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzc(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzd(com.google.android.gms.internal.measurement.zzdj.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zze(com.google.android.gms.internal.measurement.zzdj.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    @Override // com.google.android.gms.measurement.internal.zzlt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.measurement.zzdj r8, android.os.Bundle r9) throws java.lang.Throwable {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.zzlw r0 = r7.f47394zza     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.zzio r1 = r0.zzu     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.zzhe r2 = r1.zzaW()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzj()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r3 = "onActivityCreated"
            r2.zza(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            android.content.Intent r2 = r8.f39916zzc     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 == 0) goto L4c
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2c
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r4 != 0) goto L22
            goto L2c
        L22:
            r4 = r3
            goto L44
        L24:
            r0 = move-exception
            r2 = r7
            goto Lb6
        L28:
            r0 = move-exception
            r2 = r7
            goto La0
        L2c:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r4 = 0
            if (r3 == 0) goto L44
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r5 != 0) goto L44
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            goto L22
        L44:
            if (r4 == 0) goto L4c
            boolean r3 = r4.isHierarchical()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r3 != 0) goto L4e
        L4c:
            r2 = r7
            goto L96
        L4e:
            r1.zzw()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r0 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            java.lang.String r2 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "https://www.google.com"
            boolean r2 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r2 != 0) goto L74
            java.lang.String r2 = "android-app://com.google.appcrawler"
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r0 == 0) goto L70
            goto L74
        L70:
            java.lang.String r0 = "auto"
        L72:
            r5 = r0
            goto L77
        L74:
            java.lang.String r0 = "gs"
            goto L72
        L77:
            java.lang.String r0 = "referrer"
            java.lang.String r6 = r4.getQueryParameter(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            if (r9 != 0) goto L82
            r0 = 1
        L80:
            r3 = r0
            goto L84
        L82:
            r0 = 0
            goto L80
        L84:
            com.google.android.gms.measurement.internal.zzil r0 = r1.zzaX()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            com.google.android.gms.measurement.internal.zzlu r1 = new com.google.android.gms.measurement.internal.zzlu     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L28
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L92 java.lang.RuntimeException -> L94
            r0.zzq(r1)     // Catch: java.lang.Throwable -> L92 java.lang.RuntimeException -> L94
            goto Lb1
        L92:
            r0 = move-exception
            goto Lb6
        L94:
            r0 = move-exception
            goto La0
        L96:
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
        L98:
            com.google.android.gms.measurement.internal.zzmo r0 = r0.zzt()
            r0.zzs(r8, r9)
            return
        La0:
            com.google.android.gms.measurement.internal.zzlw r1 = r2.f47394zza     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()     // Catch: java.lang.Throwable -> L92
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zze()     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r1.zzb(r3, r0)     // Catch: java.lang.Throwable -> L92
        Lb1:
            com.google.android.gms.measurement.internal.zzlw r0 = r2.f47394zza
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            goto L98
        Lb6:
            com.google.android.gms.measurement.internal.zzlw r1 = r2.f47394zza
            com.google.android.gms.measurement.internal.zzio r1 = r1.zzu
            com.google.android.gms.measurement.internal.zzmo r1 = r1.zzt()
            r1.zzs(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlv.zza(com.google.android.gms.internal.measurement.zzdj, android.os.Bundle):void");
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzb(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        this.f47394zza.zzu.zzt().zzt(zzdjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzc(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        zzio zzioVar = this.f47394zza.zzu;
        zzioVar.zzt().zzu(zzdjVar);
        zzop zzopVarZzv = zzioVar.zzv();
        zzio zzioVar2 = zzopVarZzv.zzu;
        zzioVar2.zzaX().zzq(new zzoi(zzopVarZzv, zzioVar2.zzaU().elapsedRealtime()));
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zzd(com.google.android.gms.internal.measurement.zzdj zzdjVar) {
        zzio zzioVar = this.f47394zza.zzu;
        zzop zzopVarZzv = zzioVar.zzv();
        zzio zzioVar2 = zzopVarZzv.zzu;
        zzioVar2.zzaX().zzq(new zzoh(zzopVarZzv, zzioVar2.zzaU().elapsedRealtime()));
        zzioVar.zzt().zzv(zzdjVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlt
    public final void zze(com.google.android.gms.internal.measurement.zzdj zzdjVar, Bundle bundle) {
        this.f47394zza.zzu.zzt().zzw(zzdjVar, bundle);
    }
}
