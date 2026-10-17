package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzpg extends zzoz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private boolean f47651zza;

    public zzpg(zzpv zzpvVar) {
        super(zzpvVar);
        this.f47639zzg.zzad();
    }

    public final void zzav() {
        if (!zzax()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzaw() {
        if (this.f47651zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzb();
        this.f47639zzg.zzV();
        this.f47651zza = true;
    }

    public final boolean zzax() {
        return this.f47651zza;
    }

    public abstract boolean zzb();
}
