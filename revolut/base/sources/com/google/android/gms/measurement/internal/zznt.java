package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes16.dex */
final class zznt implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zznx f47561zza;

    public zznt(zznx zznxVar) {
        this.f47561zza = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47561zza.f47566zza;
        zzio zzioVar = zznyVar.zzu;
        Context contextZzaT = zzioVar.zzaT();
        zzioVar.zzaV();
        zzny.zzx(zznyVar, new ComponentName(contextZzaT, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
