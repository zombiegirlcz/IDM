package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class zzht extends zzlz implements zzni {
    private zzht() {
        throw null;
    }

    public final int zza() {
        return ((zzhv) this.f40454zza).zza();
    }

    public final zzht zzb(Iterable iterable) {
        zzbe();
        zzhv.zzi((zzhv) this.f40454zza, iterable);
        return this;
    }

    public final zzht zzc(zzhw zzhwVar) {
        zzbe();
        zzhv.zzj((zzhv) this.f40454zza, (zzhx) zzhwVar.zzba());
        return this;
    }

    public final zzht zzd() {
        zzbe();
        ((zzhv) this.f40454zza).f40225zze = zzmd.zzcn();
        return this;
    }

    public final zzht zze(int i, zzhw zzhwVar) {
        zzbe();
        zzhv.zzm((zzhv) this.f40454zza, i, (zzhx) zzhwVar.zzba());
        return this;
    }

    public final zzht zzf(String str) {
        zzbe();
        zzhv.zzn((zzhv) this.f40454zza, str);
        return this;
    }

    public final zzht zzg(String str) {
        zzbe();
        zzhv.zzo((zzhv) this.f40454zza, str);
        return this;
    }

    public final zzhx zzh(int i) {
        return ((zzhv) this.f40454zza).zze(i);
    }

    public final String zzi() {
        return ((zzhv) this.f40454zza).zzf();
    }

    public final List zzj() {
        return Collections.unmodifiableList(((zzhv) this.f40454zza).zzh());
    }

    public /* synthetic */ zzht(zzip zzipVar) {
        super(zzhv.f40223zzb);
    }
}
