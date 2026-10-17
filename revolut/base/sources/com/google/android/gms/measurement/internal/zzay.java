package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzay implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzjs f46914zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzaz f46915zzb;

    public zzay(zzaz zzazVar, zzjs zzjsVar) {
        this.f46914zza = zzjsVar;
        this.f46915zzb = zzazVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f46914zza;
        zzjsVar.zzaV();
        if (zzaf.zza()) {
            zzjsVar.zzaX().zzq(this);
            return;
        }
        zzaz zzazVar = this.f46915zzb;
        boolean zZze = zzazVar.zze();
        zzazVar.f46919zzd = 0L;
        if (zZze) {
            zzazVar.zzc();
        }
    }
}
