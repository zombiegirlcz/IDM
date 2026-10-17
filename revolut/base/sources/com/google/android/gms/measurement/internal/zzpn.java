package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes16.dex */
final class zzpn extends zzaz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzpv f47665zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpn(zzpv zzpvVar, zzjs zzjsVar) {
        super(zzjsVar);
        this.f47665zza = zzpvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
        zzpv zzpvVar = this.f47665zza;
        zzpvVar.zzaX().zzg();
        String str = (String) zzpvVar.zzr.pollFirst();
        if (str != null) {
            zzpvVar.zzJ = zzpvVar.zzaU().elapsedRealtime();
            zzpvVar.zzaW().zzj().zzb("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            zzpv.zzaK(zzpvVar.zzaT(), intent);
        }
        zzpvVar.zzaJ();
    }
}
