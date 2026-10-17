package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes16.dex */
public class zzms {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    protected volatile zznh f40481zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private volatile zzld f40482zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private volatile boolean f40483zzc;

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzms)) {
            return false;
        }
        zzms zzmsVar = (zzms) obj2;
        zznh zznhVar = this.f40481zza;
        zznh zznhVar2 = zzmsVar.f40481zza;
        if (zznhVar == null && zznhVar2 == null) {
            return zzb().equals(zzmsVar.zzb());
        }
        if (zznhVar != null && zznhVar2 != null) {
            return zznhVar.equals(zznhVar2);
        }
        if (zznhVar != null) {
            zzmsVar.zzd(zznhVar.zzcC());
            return zznhVar.equals(zzmsVar.f40481zza);
        }
        zzd(zznhVar2.zzcC());
        return this.f40481zza.equals(zznhVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.f40482zzb != null) {
            return ((zzlb) this.f40482zzb).f40407zza.length;
        }
        if (this.f40481zza != null) {
            return this.f40481zza.zzcf();
        }
        return 0;
    }

    public final zzld zzb() {
        if (this.f40482zzb != null) {
            return this.f40482zzb;
        }
        synchronized (this) {
            try {
                if (this.f40482zzb != null) {
                    return this.f40482zzb;
                }
                if (this.f40481zza == null) {
                    this.f40482zzb = zzld.f40408zzb;
                } else {
                    this.f40482zzb = this.f40481zza.zzcb();
                }
                return this.f40482zzb;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final zznh zzc(zznh zznhVar) {
        zznh zznhVar2 = this.f40481zza;
        this.f40482zzb = null;
        this.f40481zza = zznhVar;
        return zznhVar2;
    }

    public final void zzd(zznh zznhVar) {
        if (this.f40481zza != null) {
            return;
        }
        synchronized (this) {
            if (this.f40481zza != null) {
                return;
            }
            try {
                this.f40481zza = zznhVar;
                this.f40482zzb = zzld.f40408zzb;
            } catch (zzmm unused) {
                this.f40483zzc = true;
                this.f40481zza = zznhVar;
                this.f40482zzb = zzld.f40408zzb;
            }
        }
    }
}
