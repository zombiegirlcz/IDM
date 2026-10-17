package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
final class zzdy extends zzda {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Runnable f39954zza;

    public zzdy(zzdz zzdzVar, Runnable runnable) {
        this.f39954zza = runnable;
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void zze() {
        this.f39954zza.run();
    }
}
