package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
final class zzp implements zzkb {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzde f47640zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f47641zzb;

    public zzp(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzde zzdeVar) {
        this.f47641zzb = appMeasurementDynamiteService;
        this.f47640zza = zzdeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkb
    public final void interceptEvent(String str, String str2, Bundle bundle, long j2) {
        try {
            this.f47640zza.zzf(str, str2, bundle, j2);
        } catch (RemoteException e) {
            zzio zzioVar = this.f47641zzb.f46833zza;
            if (zzioVar != null) {
                zzioVar.zzaW().zzk().zzb("Event interceptor threw exception", e);
            }
        }
    }
}
