package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* JADX INFO: loaded from: classes16.dex */
final class zznr implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ ComponentName f47557zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zznx f47558zzb;

    public zznr(zznx zznxVar, ComponentName componentName) {
        this.f47557zza = componentName;
        this.f47558zzb = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny.zzx(this.f47558zzb.f47566zza, this.f47557zza);
    }
}
