package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzjr extends zzjq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f47251zza;

    public zzjr(zzio zzioVar) {
        super(zzioVar);
        this.zzu.zzE();
    }

    public void zzaZ() {
    }

    public abstract boolean zzc();

    public final void zzv() {
        if (!zzy()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzw() {
        if (this.f47251zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzc()) {
            return;
        }
        this.zzu.zzD();
        this.f47251zza = true;
    }

    public final void zzx() {
        if (this.f47251zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzaZ();
        this.zzu.zzD();
        this.f47251zza = true;
    }

    public final boolean zzy() {
        return this.f47251zza;
    }
}
