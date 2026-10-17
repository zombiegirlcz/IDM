package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzg extends zzf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f46961zza;

    public zzg(zzio zzioVar) {
        super(zzioVar);
        this.zzu.zzE();
    }

    public final void zza() {
        if (!zze()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (this.f46961zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzf()) {
            return;
        }
        this.zzu.zzD();
        this.f46961zza = true;
    }

    public final void zzc() {
        if (this.f46961zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzd();
        this.zzu.zzD();
        this.f46961zza = true;
    }

    public void zzd() {
    }

    public final boolean zze() {
        return this.f46961zza;
    }

    public abstract boolean zzf();
}
