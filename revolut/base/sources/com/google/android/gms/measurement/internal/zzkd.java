package com.google.android.gms.measurement.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes16.dex */
final class zzkd implements zzgw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzio f47285zza;

    public zzkd(zzke zzkeVar, zzio zzioVar) {
        this.f47285zza = zzioVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public final boolean zza() {
        zzio zzioVar = this.f47285zza;
        return zzioVar.zzL() && Log.isLoggable(zzioVar.zzaW().zzr(), 3);
    }
}
