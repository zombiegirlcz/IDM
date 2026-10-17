package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzom extends zzaz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzon f47611zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzom(zzon zzonVar, zzjs zzjsVar) {
        super(zzjsVar);
        this.f47611zza = zzonVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaz
    public final void zzc() {
        zzon zzonVar = this.f47611zza;
        zzop zzopVar = zzonVar.f47614zzc;
        zzopVar.zzg();
        zzio zzioVar = zzopVar.zzu;
        zzonVar.zzd(false, false, zzioVar.zzaU().elapsedRealtime());
        zzopVar.zzu.zzd().zzf(zzioVar.zzaU().elapsedRealtime());
    }
}
