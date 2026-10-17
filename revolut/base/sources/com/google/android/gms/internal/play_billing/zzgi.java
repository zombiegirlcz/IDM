package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes16.dex */
public class zzgi {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected volatile zzhb f46045zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private volatile zzev f46046zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private volatile boolean f46047zzc;

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzgi)) {
            return false;
        }
        zzgi zzgiVar = (zzgi) obj2;
        zzhb zzhbVar = this.f46045zza;
        zzhb zzhbVar2 = zzgiVar.f46045zza;
        if (zzhbVar == null && zzhbVar2 == null) {
            return zzb().equals(zzgiVar.zzb());
        }
        if (zzhbVar != null && zzhbVar2 != null) {
            return zzhbVar.equals(zzhbVar2);
        }
        if (zzhbVar != null) {
            zzgiVar.zzd(zzhbVar.zzl());
            return zzhbVar.equals(zzgiVar.f46045zza);
        }
        zzd(zzhbVar2.zzl());
        return this.f46045zza.equals(zzhbVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.f46046zzb != null) {
            return this.f46046zzb.zze();
        }
        if (this.f46045zza != null) {
            return this.f46045zza.zzn();
        }
        return 0;
    }

    public final zzev zzb() {
        if (this.f46046zzb != null) {
            return this.f46046zzb;
        }
        synchronized (this) {
            try {
                if (this.f46046zzb != null) {
                    return this.f46046zzb;
                }
                if (this.f46045zza == null) {
                    this.f46046zzb = zzev.f45974zza;
                } else {
                    this.f46046zzb = this.f46045zza.zzj();
                }
                return this.f46046zzb;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final zzhb zzc(zzhb zzhbVar) {
        zzhb zzhbVar2 = this.f46045zza;
        this.f46046zzb = null;
        this.f46045zza = zzhbVar;
        return zzhbVar2;
    }

    public final void zzd(zzhb zzhbVar) {
        if (this.f46045zza != null) {
            return;
        }
        synchronized (this) {
            if (this.f46045zza != null) {
                return;
            }
            try {
                this.f46045zza = zzhbVar;
                this.f46046zzb = zzev.f45974zza;
            } catch (zzgc unused) {
                this.f46047zzc = true;
                this.f46045zza = zzhbVar;
                this.f46046zzb = zzev.f45974zza;
            }
        }
    }
}
