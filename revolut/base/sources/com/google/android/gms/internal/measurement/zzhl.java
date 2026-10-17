package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzhl extends zzlz implements zzni {
    private zzhl() {
        throw null;
    }

    public final int zza() {
        return ((zzhm) this.f40454zza).zzb();
    }

    public final long zzb() {
        return ((zzhm) this.f40454zza).zzc();
    }

    public final long zzc() {
        return ((zzhm) this.f40454zza).zzd();
    }

    public final zzhl zzd(Iterable iterable) {
        zzbe();
        zzhm.zzj((zzhm) this.f40454zza, iterable);
        return this;
    }

    public final zzhl zze(zzhp zzhpVar) {
        zzbe();
        zzhm.zzk((zzhm) this.f40454zza, (zzhq) zzhpVar.zzba());
        return this;
    }

    public final zzhl zzf(zzhq zzhqVar) {
        zzbe();
        zzhm.zzk((zzhm) this.f40454zza, zzhqVar);
        return this;
    }

    public final zzhl zzg() {
        zzbe();
        ((zzhm) this.f40454zza).f40200zze = zzmd.zzcn();
        return this;
    }

    public final zzhl zzh(int i) {
        zzbe();
        zzhm.zzn((zzhm) this.f40454zza, i);
        return this;
    }

    public final zzhl zzi(String str) {
        zzbe();
        zzhm.zzo((zzhm) this.f40454zza, str);
        return this;
    }

    public final zzhl zzj(int i, zzhp zzhpVar) {
        zzbe();
        zzhm.zzp((zzhm) this.f40454zza, i, (zzhq) zzhpVar.zzba());
        return this;
    }

    public final zzhl zzk(int i, zzhq zzhqVar) {
        zzbe();
        zzhm.zzp((zzhm) this.f40454zza, i, zzhqVar);
        return this;
    }

    public final zzhl zzl(long j2) {
        zzbe();
        zzhm.zzq((zzhm) this.f40454zza, j2);
        return this;
    }

    public final zzhl zzm(long j2) {
        zzbe();
        zzhm.zzr((zzhm) this.f40454zza, j2);
        return this;
    }

    public final zzhq zzn(int i) {
        return ((zzhm) this.f40454zza).zzg(i);
    }

    public final String zzo() {
        return ((zzhm) this.f40454zza).zzh();
    }

    public final List zzp() {
        return Collections.unmodifiableList(((zzhm) this.f40454zza).zzi());
    }

    public final boolean zzq() {
        return ((zzhm) this.f40454zza).zzu();
    }

    public /* synthetic */ zzhl(zzip zzipVar) {
        super(zzhm.f40198zzb);
    }
}
