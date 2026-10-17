package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
final class zzq implements zzkc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.zzde f47713zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f47714zzb;

    public zzq(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzde zzdeVar) {
        this.f47714zzb = appMeasurementDynamiteService;
        this.f47713zza = zzdeVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzkc
    public final void onEvent(String str, String str2, Bundle bundle, long j2) {
        try {
            this.f47713zza.zzf(str, str2, bundle, j2);
        } catch (RemoteException e) {
            zzio zzioVar = this.f47714zzb.f46833zza;
            if (zzioVar != null) {
                zzioVar.zzaW().zzk().zzb("Event listener threw exception", e);
            }
        }
    }
}
